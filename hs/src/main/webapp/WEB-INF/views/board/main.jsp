<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ include file="../include/header.jsp"%>


<body>

	<div class="panel panel-default">
		<div class="panel-heading">
			<h3 class="panel-title">List</h3>
		</div>
		<div class="panel-body">
			<table class="table table-striped">
				<tr>
					<td>넘버</td>
					<td>타이틀</td>
					<td>내용</td>
					<td>글쓴이</td>
					<td>작성날짜</td>
				</tr>
				<c:forEach items="${list}" var="list">
					<tr>
						<td>${list.bno}</td>
						<td><a href="/sub?bno=${list.bno}&page=${pageMaker.current}">${list.title}</a></td>
						<td>${list.content}</td>
						<td>${list.writer}</td>
						<td>${list.regdate}</td>
					</tr>
				</c:forEach>

			</table>

			<nav aria-label="Page navigation">
				<ul class="pagination">
					<c:if test="${pageMaker.prev}">
						<li><a href="main?page=${pageMaker.start-1}"
							aria-label="Previous"> <span aria-hidden=false>&laquo;</span>
						</a></li>
					</c:if>

					<c:forEach begin="${pageMaker.start}" end="${pageMaker.end}"
						var="idx">
						<li><a href="main?page=${idx}">${idx}</a></li>
					</c:forEach>

					<c:if test="${pageMaker.next}">
						<li><a href="main?page=${pageMaker.end+1}" aria-label="Next">
								<span aria-hidden="${pageMaker.next}">&raquo;</span>
						</a></li>
					</c:if>

				</ul>
			</nav>
			
			<div class='box-body'>
			<form action="/board/main" method="get">
				<input type="hidden" name="page" value="${pageMaker.current}">
				<select name='type'>
					<option value='n' 
					 value="${cri.type ==null?'selected':''}"/>------</option>
					<option value='t'
					value="${cri.type eq't'?'selected':''}"/>타이틀</option>
					<option value='c' 
					 value="${cri.type eq'c'?'selected':''}"/>내용</option>
					<option value='w' 
					 value="${cri.type eq'w'?'selected':''}"/>글쓴이</option>
				</select>
				<input name='keyword' type="text">
				<button id="searchBtn" type="submit">Search</button>
			</form>

			</div>
			<a href="/board/register" class="btn btn-primary btn-lg active"
				role="button">새글 등록</a>

		</div>
	</div>


</body>


</html>

