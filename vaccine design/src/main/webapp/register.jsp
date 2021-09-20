<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
body{
background-image: url('https://www.reuters.com/resizer/nezGvxnFtbtTAvHL4GuRky1-Urk=/800x0/filters:quality(80)/cloudfront-us-east-2.images.arcpublishing.com/reuters/H3OMGGHKENKE3AWCUFCDKVDDZI.jpg');
background-position: center;
background-attachment: fixed;
background-size: 100%,100%;
}
h2{
text-align: center;
font-family: cursive;
font-size: 100px;
color: Blue;
padding:10px;
}
</style>
	<title>Login Page</title>
   
	<!--Bootsrap 4 CDN-->
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    
    <!--Fontawesome CDN-->
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">

	<!--Custom styles-->
	<link rel="stylesheet" type="text/css" href="styles.css">
</head>



<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <div class="container-fluid">
    <a class="navbar-brand" href="#" >Navbar</a>
   
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      
      
    </div>
  </div>
</nav>



<div class="container">
	<div class="d-flex justify-content-center h-100">
		<div class="card">
			<div class="card-header">
				<h3>Sign In</h3>
				<!--  <div class="d-flex justify-content-end social_icon">
					<span><i class="fab fa-facebook-square"></i></span>
					<span><i class="fab fa-google-plus-square"></i></span>
					<span><i class="fab fa-twitter-square"></i></span>
				</div>-->
			</div>
			<div class="card-body">
				 <form action="login.do">
					<div class="input-group form-group">
						<div class="input-group-prepend">
							<span class="input-group-text"><i class="fas fa-user"></i></span>
						</div>
						<input type="text" class="form-control" placeholder="username" name="email">
						
					</div>
					<div class="input-group form-group">
						<div class="input-group-prepend">
							<span class="input-group-text"><i class="fas fa-key"></i></span>
						</div>
						<input type="password" class="form-control" placeholder="password" name="password">
					</div>
					<div class="row align-items-center remember">
						<input type="checkbox">Remember Me
					</div>
					<div class="form-group">
						<input type="submit"  value="contiune" class="btn float-right login_btn">
					</div>
				</form>
			</div>
			<div class="card-footer">
				<div class="d-flex justify-content-center links">
					Don't have an account?<a href="#">Sign Up</a>
				</div>
				<div class="d-flex justify-content-center">
					<a href="#">Forgot your password?</a>
				</div>
			</div>
		</div>
	</div>
	
	


<!-- Footer -->
<footer class="page-footer font-small blue pt-4">

  <!-- Footer Links -->
  <div class="container-fluid text-center text-md-left">

 
  <div class="footer-copyright text-center py-3">© 2020 Copyright:
    <a href="https://mdbootstrap.com/"> MDBootstrap.com</a>
  </div>
  <!-- Copyright -->

</footer>
<h2>${loginmessage}</h2>
<!-- Footer -->



	<!-- <h1>Welcome form</h1>
	<div>
		<form action="startotp.do">
			EMAIL_ID:<input type="text" name="email"><br> <br>
			<input type="submit" value="contiune">
			<form action="login.do">
		Enter the EMAIL_ID:<input type="text" name="email"><br>
		Enter the PASSWORD:<input type="text" name="password"><br>
		<input type="submit" value="contiune">
		</form>
	</div> -->
</body>
</html>