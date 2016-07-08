package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import library.LibraryPermission;
import model.ModelNew;

/**
 * Servlet implementation class ControllerPublicIndex
 */
@SuppressWarnings("all")
public class ControllerAdminDeleteNew extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerAdminDeleteNew() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if(!LibraryPermission.isLogin(request, response)){
			return;
		}
		if("delete".equals(request.getParameter("active"))){
			if(request.getParameter("idnews")!=null){
				for(String id_news : request.getParameterValues("idnews")){
					new ModelNew().delItem(Integer.parseInt(id_news));
				}
				response.sendRedirect(request.getContextPath()+"/admin/tin-tuc?msg=del1");
			}else{
				response.sendRedirect(request.getContextPath()+"/admin/tin-tuc");
			}
		}
		if(request.getParameter("cid")!=null){
			int id = Integer.parseInt(request.getParameter("cid"));
			if(new ModelNew().delItem(id) > 0){
				response.sendRedirect(request.getContextPath()+"/admin/tin-tuc?msg=del1");
			}else{
				response.sendRedirect(request.getContextPath()+"/admin/tin-tuc?msg=del0");
			}
		}
	}
}
