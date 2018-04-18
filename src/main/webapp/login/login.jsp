<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">

<title>Signin Template for Bootstrap</title>

<!-- Bootstrap core CSS -->
<link href="../bootstrap/css/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="../css/signin.css" rel="stylesheet">

</head>

<body>
	<div class="container">

		<form class="form-signin"
			action="<%=request.getContextPath() %>/LoginServlet" method="post">
			<h2 class="form-signin-heading">Please sign in</h2>
			<label for="userId" class="sr-only">UserId</label> <input type="text"
				id="userId" name="userId" class="form-control"
				placeholder="아이디를 입력해주세요" required autofocus>
			<!-- 
        <label for="userId" class="sr-only">UserId</label>
        <input type="text" id="userIdsecond" name="userId" class="form-control" placeholder="아이디를 입력해주세요" required autofocus>
         -->
			<label for="password" class="sr-only">Password</label> <input
				type="password" id="password" name="password" class="form-control"
				placeholder="비밀번호를 입력하세요" required>
			<button class="btn btn-lg btn-primary btn-block" type="submit">Sign
				in</button>
		</form>

	</div>
	<!-- /container -->
</body>
</html>