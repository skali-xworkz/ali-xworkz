<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Vaccination Application</h1>
	<h2>${OtpSuccessMessage}</h2>
	<form action="register.do">
		Enter the name:<input type="text" name="name"><br> Enter
		the EMAIL_ID:<input type="text" name="email"><br> Enter
		the OTP no:<input type="text" name="otp"><br> <input
			type="submit" value="submit">
</body>
</html>