<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
<title>Todo's for ${name}</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
</head>

<body>
	<nav role="navigation" class="navbar navbar-default">
		<div class="">
			<a href="http://www.in28minutes.com" class="navbar-brand">in28Minutes</a>
		</div>
		<div class="navbar-collapse">
			<ul class="nav navbar-nav">
				<li class="active"><a href="/login">Home</a></li>
				<li><a href="/list-todos">Todos</a></li>
	
			</ul>
		</div>
	</nav>
	<div class="container">
		<h1>Your Todo's</h1>
		<table class="table table-striped">
			<caption>Your current Todo's are</caption>
			<thead>
				<tr>
					<th>Description</th>
					<th>Target Data</th>
					<th>Is it Done?</th>
					<th>Update</th>
					<th>Delete</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items = "${todos}" var="todo">			
					<tr>
						<td>${todo.desc}</td>
						<td><fmt:formatDate value="${todo.targetDate}" pattern="dd/MM/yyyy"/></td>
						<td>${todo.done}</td>
						<td><a type="button" class="btn btn-warning" href="/update-todo?id=${todo.id}">Update</a></td>
						<td><a type="button" class="btn btn-danger" href="/delete-todo?id=${todo.id}">Delete</a></td>
					</tr>
				</c:forEach>		
			</tbody>
		</table>
		<div><a class="button" href="/add-todo">Add a Todo</a></div> 
		<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
		<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
	</div>		
</body>

</html>