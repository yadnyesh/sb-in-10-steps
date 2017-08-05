<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Todo's for ${name}</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
</head>

<body>
	<h1>Your Todo's</h1>
	<table>
		<caption>Your current Todo's are</caption>
		<thead>
			<tr>
				<th>Description</th>
				<th>Target Data</th>
				<th>Is it Done?</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items = "${todos}" var="todo">			
				<tr>
					<td>${todo.desc}</td>
					<td>${todo.targetDate}</td>
					<td>${todo.done}</td>
				</tr>
			</c:forEach>		
		</tbody>
	</table>
	<BR/>
	<a href="/add-todo">Add a Todo</a> 
	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>

</html>