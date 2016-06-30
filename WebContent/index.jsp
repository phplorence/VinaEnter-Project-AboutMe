<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@include file="templates/public/inc/header.jsp" %>
   <div id="body">
		<div class="header">
			<div>
				<img src="<%=request.getContextPath()%>/templates/public/images/biking.jpg" alt="">
				<ul>
					<li>
						<a href="https://www.facebook.com/vuongluis" target="blank">Facebook</a>
					</li>
					<li>
						<a href="https://twitter.com/luisnguyenvan" target="blank">Twitter</a>
					</li>
					<li>
						<a href="https://plus.google.com/" target="blank">Googleplus</a>
					</li>
					<li>
						<a href="http://vinaenter.edu.vn" target="blank">VinaENTER EDU</a>
					</li>
				</ul>
			</div>
		</div>
		<div class="body">
			<div class="section">
				<div class="article">
					<h2>Chào mừng bạn ghé thăm website Văn Vương</h2>
					<img src="<%=request.getContextPath()%>/templates/public/images/logo-vinaenter.png" alt="">
					<p>
						Website chia sẻ thông tin, các bài học giá trị, và tất cả những gì mà Gia Huy học được mỗi ngày. 
						Hy vọng đây sẽ là kênh hữu ích để chúng ta cùng kết nối, giao lưu lẫn nhau. <br />
						Các công nghệ mới nhất về CNTT cũng được Gia Huy cập nhật tại website này, chúng ta hãy cũng nhau học tập,
						cùng nhau nghiên cứu để tạo nên một bước đợt phá để ngày hôm nay luôn khác ngay hôm qua :D
					</p>
				</div>
				<div class="aside">
					<b>Những Câu Nói Hay</b>
					<p>
						Nếu bạn luôn buồn phiền, hãy dùng hy vọng để chữa trị; hạnh phúc lớn nhất của nhân loại chính là biết hi vọng
					</p>
					<span class="author">- Khuyết danh</span>
				</div>
			</div>
		</div>
		<div class="footer">
			<div>
				<a href="doctors.html"><img src="<%=request.getContextPath()%>/templates/public/images/friends.jpg" alt=""></a>
				<h3>Quan điểm tình bạn của Gia Huy</h3>
				<p>
					Có một người bạn khăng khít còn hơn là một người anh em ruột.
				</p>
			</div>
			<div>
				<a href="services.html"><img src="<%=request.getContextPath()%>/templates/public/images/life.jpg" alt=""></a>
				<h3>Quan điểm về cuộc sống của Gia Huy</h3>
				<p>
					Hãy sống là chính mình, bình thường nhưng không tầm thường.
				</p>
			</div>
			<div>
				<a href="services.html"><img src="<%=request.getContextPath()%>/templates/public/images/love.jpg" alt=""></a>
				<h3>Quan điểm về tình yêu của Gia Huy</h3>
				<p>
					Cuộc sống mà không có tình yêu thì không còn là cuộc sống nữa.
				</p>
			</div>
		</div>
	</div>
	
   <%@include file="templates/public/inc/footer.jsp" %>
