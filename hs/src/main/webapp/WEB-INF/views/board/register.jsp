<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="../include/header.jsp"%>

<body>

	<form method="post">

		<div class="form-group">
			<label>title</label> <input type="text" class="form-control"
				name="title" placeholder="title">

		</div>
		<div class="form-group">
			<label>content</label> <input type="text" class="form-control"
				name="content" placeholder="content">

		</div>
		<div class="form-group">
			<label>writer</label> <input type="text" class="form-control"
				name="writer" placeholder="writer">

		</div>

		<button type="submit" class="btn btn-default">등록</button>
	</form>


</body>
</html>