<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="../../favicon.ico">
<title>Dashboard Template for Bootstrap</title>
<!-- Bootstrap core CSS -->
<link href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<!-- Custom styles for this template -->
<link href="${pageContext.request.contextPath}/dashboard.css" rel="stylesheet">

<%@include file="/include/jquery.jsp" %>
<!-- daum 주소 검색 api -->
<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
<script type="text/javascript">
function initData(){
	$('#mem_id').val('sally');
	$('#mem_name').val('샐리');
	$('#mem_alias').val('병아리');
	$('#mem_pass').val('1234');
	$('#mem_add1').val('대전 중구 중앙로 76');
	$('#mem_add2').val('영민빌딩 2층');
	$('#mem_zip').val('34940');
}


	$(function() {
		initData();
		
		//화면 로딩시 회원 아이디 입력칸에 focus
		$('#mem_id').focus();
		
		//주소검색 버튼 클릭 이벤트 처리
		$('#zipSearch').on('click', function(){
			new daum.Postcode({
		        oncomplete: function(data) {
		            // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분입니다.
		            // 예제를 참고하여 다양한 활용법을 확인해 보세요.
		            $('#mem_add1').val(data.address);//주소1
		            $('#mem_zip').val(data.zonecode);//우편번호
		        }
		    }).open();
		})
		
		
		//userReg 사용자 등록 버튼 클릭 이벤트 처리
		$('#userReg').on('click', function(){
			//validation
			if ($('#mem_id').val().trim() == "") {
				alert('회원 아이디가 입력되지 않았습니다');
				$('#mem_id').focus();
				return false;
			} else if ($('#mem_name').val().trim() == "") {
				alert('회원 이름이 입력되지 않았습니다');
				$('#mem_name').focus();
				return false;
			} else if ($('#mem_alias').val().trim() == "") {
				alert('회원 별명이 입력되지 않았습니다');
				$('#mem_alias').focus();
				return false;
			} else if ($('#mem_pass').val().trim() == "") {
				alert('회원 비밀번호가 입력되지 않았습니다');
				$('#mem_pass').focus();
				return false;
			} else if ($('#mem_add1').val().trim() == "") {
				alert('회원 주소1이 입력되지 않았습니다');
				return false;
			} else if ($('#mem_add2').val().trim() == "") {
				alert('회원 주소2가 입력되지 않았습니다');
				$('#mem_add2').focus();
				return false;
			} else if ($('#mem_zip').val().trim() == "") {
				alert('회원 우편번호가 입력되지 않았습니다');
				return false;
			}
			
			//submit
			$('#frm').submit();
		})
		
		
	})
</script>
</head>
<body>
	<%@include file="/layout/header.jsp"%>

	<div class="container-fluid">
		<div class="row">

			<%@include file="/layout/left.jsp"%>

			<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
				<form id="frm" action="${pageContext.request.contextPath }/userInsert" method="post" class="form-horizontal" role="form">
					<div class="form-group">
						<label for="mem_id" class="col-sm-2 control-label">사용자 아이디</label>
						<div class="col-sm-4">
							<input type="text" class="form-control" id="mem_id" name="mem_id"
								placeholder="사용자 아이디">
						</div>
					</div>
					<div class="form-group">
						<label for="mem_name" class="col-sm-2 control-label">사용자 이름</label>
						<div class="col-sm-4">
							<input type="text" class="form-control" id="mem_name" name="mem_name"
								placeholder="사용자 이름">
						</div>
					</div>
					<div class="form-group">
						<label for="mem_alias" class="col-sm-2 control-label">별명</label>
						<div class="col-sm-4">
							<input type="text" class="form-control" id="mem_alias"
								name="mem_alias" placeholder="별명">
						</div>
					</div>
					<div class="form-group">
						<label for="mem_zip" class="col-sm-2 control-label">Password</label>
						<div class="col-sm-4">
							<input type="password" class="form-control" id="mem_pass" name="mem_pass"
								placeholder="Password">
						</div>
					</div>
					<div class="form-group">
						<label for="mem_add1" class="col-sm-2 control-label">주소1</label>
						<div class="col-sm-4">
							<input type="text" class="form-control" id="mem_add1" name="mem_add1"
								placeholder="주소1" readonly>
							
							<button type="button" class="btn btn-default" id="zipSearch">주소 검색</button>
						</div>
					</div>
					<div class="form-group">
						<label for="mem_add2" class="col-sm-2 control-label">주소2</label>
						<div class="col-sm-4">
							<input type="text" class="form-control" id="mem_add2" name="mem_add2"
								placeholder="주소2">
						</div>
					</div>
					<div class="form-group">
						<label for="mem_zip" class="col-sm-2 control-label">우편번호</label>
						<div class="col-sm-4">
							<input type="text" class="form-control" id="mem_zip" name="mem_zip"
								placeholder="우편번호" readonly>
						</div>
					</div>

					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-4">
							<button id="userReg" type="button" class="btn btn-default">사용자 등록</button>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>

	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="bootstrap/js/bootstrap.min.js"></script>
</body>
</html>