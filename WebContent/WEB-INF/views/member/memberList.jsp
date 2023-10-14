<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Member List</title>
<style type="text/css">

table {
  border-collapse: separate;
  border-spacing: 0;
  width: 100%;
}
th,
td {
  padding: 6px 15px;
}
th {
  background: #42444e;
  color: #fff;
  text-align: left;
}
tr:first-child th:first-child {
  border-top-left-radius: 6px;
}
tr:first-child th:last-child {
  border-top-right-radius: 6px;
}
td {
  border-right: 1px solid #c6c9cc;
  border-bottom: 1px solid #c6c9cc;
}
td:first-child {
  border-left: 1px solid #c6c9cc;
}
tr:nth-child(even) td {
  background: #eaeaed;
}
tr:last-child td:first-child {
  border-bottom-left-radius: 6px;
}
tr:last-child td:last-child {
  border-bottom-right-radius: 6px;
}
</style>

</head>
<body>
	${msg}
	<!-- pro.ict?cmd=fboard -->
	<table>
		<thead>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>조회수</th>
				<th>날짜</th>
			</tr>
		</thead>
		<tfoot>
			<tr><th colspan="5">
				<input type="button" value="writer">
			</th></tr>
		</tfoot>
		<tbody>
			<c:forEach var="e" items="${list}">
				<tr>
					<td>${e.id}</td>
					<td>${e.mtype}</td>
					<td>${e.name}</td>
					<td>${e.phone}</td>
					<td>${e.birth}</td>
					<td>${e.gender}</td>
					<td>${e.nickname}</td>
					<td>${e.address}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>