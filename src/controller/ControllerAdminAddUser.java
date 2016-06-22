package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.MessageBundle;
import bean.User;
import model.ModelUser;
import utils.ValidateCat;
import utils.ValidateUser;

/**
 * Servlet implementation class ControllerPublicIndex
 */
@SuppressWarnings("all")
public class ControllerAdminAddUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerAdminAddUser() {
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
		boolean cont = true;
		MessageBundle messageBundle = new MessageBundle();
		if(request.getParameter("them")!=null){
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			String fullname = request.getParameter("fullname");
			if(new ValidateUser().validateName(username)){
				messageBundle.setExist("<b style=\"color: red\"><strong>Người dùng đã tồn tại trong hệ thống</strong></b>");
				cont = false;
			}
			
			if(!new ValidateUser().isFullName(fullname)){
				if(new ModelUser().addItem(new User(username,password,fullname)) > 0){
					response.sendRedirect(request.getContextPath()+"/admin/indexUser?msg=add1");
				}else{
					response.sendRedirect(request.getContextPath()+"/admin/indexUser?msg=add0");
				}
			}else{
				request.setAttribute("error", "User tồn tại trong hệ thống");
				RequestDispatcher rd = request.getRequestDispatcher("/admin/addUser.jsp");
				rd.forward(request, response);
			}
		}else{
			RequestDispatcher rd = request.getRequestDispatcher("/admin/addUser.jsp");
			rd.forward(request, response);
		}
	}
}
