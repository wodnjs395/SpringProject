<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>판매 조회</title>
<style>
body {
	font-family: Arial, sans-serif;
}

table {
	border-collapse: collapse;
	width: 100%;
	margin: 20px 0;
}

th, td {
	border: 1px solid #ddd;
	padding: 8px;
	text-align: center;
}

th {
	background-color: #f2f2f2;
}

.button {
	background-color: #4CAF50;
	color: white;
	padding: 5px 10px;
	text-decoration: none;
	border-radius: 4px;
	font-size: 12px;
}

.button:hover {
	background-color: #45a049;
}

.container {
	margin: 20px;
}

.filters {
	margin-bottom: 20px;
}

.filters label, .filters select, .filters input {
	margin-right: 10px;
}
</style>
</head>
<body>
	<div class="container">
		<h2>판매 조회</h2>

		<!-- 필터 및 검색 옵션 -->
		<div class="filters">
			<form action="search.jsp" method="GET">
				<label for="searchType">검색 조건:</label> <select name="searchType"
					id="searchType">
					<option value="전체">전체</option>
					<option value="거래처명">거래처명</option>
					<option value="상품명">상품명</option>
				</select> <label for="searchKeyword">키워드:</label> <input type="text"
					id="searchKeyword" name="searchKeyword">

				<button type="submit" class="button">Search</button>
			</form>
		</div>

		<!-- 데이터 테이블 -->
		<table>
			<tr>
				<th>판매번호</th>
				<th>일자-No.</th>
				<th>거래처명</th>
				<th>품목명</th>
				<th>금액합계</th>
				<th>거래유형명</th>
				<th>출하창고명</th>
			</tr>
			<c:forEach items="${list}" var="sellList">
				<tr>
					<td><c:out value="${sellList.sell.acc_uuid}" /></td>
					<td><c:out value="${sellList.date_num}" /></td>
					<td><c:out value="${sellList.sell.clientname}" /></td>
					<td><c:out value="${sellList.productSummary}" /></td>
					<td><c:out value="${sellList.total_price}" /></td>
					<td><c:out value="${sellList.salestype}" /></td>
					<td><c:out value="${sellList.sell.storagename}" /></td>
				</tr>
			</c:forEach>
		</table>
		<div class="pull-right">
					<ul class="pagination">
						<c:if test="${pageMaker.prev}">
							<li class="paginate_button previous">
								<a href="${pageMaker.startPage - 1}">Previous</a>
							</li>
						</c:if>
						
						<c:forEach var="num" begin="${pageMaker.startPage }" end="${pageMaker.endPage }">
							<li class="paginate_button ${pageMaker.cri.pageNum == num ? 'active' : '' }">
								<a href="${num}">${num}</a>
							</li>
						</c:forEach>
						
						<c:if test="${pageMaker.next }">
							<li class="paginate_button next">
								<a href="${pageMaker.endPage + 1 }">Next</a></li>
						</c:if>
						
						<form id="actionForm" action="/sell/sellList" method="get">
							<input type="hidden" name="pageNum" value="${pageMaker.cri.pageNum }">
							<input type="hidden" name="amount" value="${pageMaker.cri.amount }">
						</form>
					</ul>
				</div>

		<!-- 하단 버튼들 -->
		<div>
			<button class="button">신규 (F2)</button>
			<button class="button">선택삭제</button>
			<button class="button">Excel 내보내기</button>
		</div>
	</div>
</body>

<script>
	function formatMoney(amount) {
    	return amount.toLocaleString('en-US'); 
	}

</script>
</html>
