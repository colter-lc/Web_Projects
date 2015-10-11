<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	Welcome!
	<form action="user/addUser.do" method="post" enctype="multipart/form-data">
		User ID:<input type="text" name="userId" /> <br/>
		User Domain:<input type="text" name="userDomain" /> <br/>
		Email: <input type="text" name="email" /> <br/>
		Age: <input type="text" name="age" /> <br/>
		<button type="submit">Submit</button>
	</form>
</body>
</html>