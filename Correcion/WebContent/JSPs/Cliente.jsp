<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html">
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>

<title>Cliente</title>

</head>
<body>

	<h1>BIENVENIDO</h1>
	<a class="nav-link badge badge-info" href="/Correcion/JSPs/Agregar.jsp">Agregar Vehiculo</a>
	<a class="nav-link badge badge-info" href="/Correcion/JSPs/Tickets.jsp">Agregar ticket</a>
	<br>

<c:set var="t1" value="${requestScope['tickets']}" />
	<!-- <c:set var="v1" value="${requestScope['vehiculos']}" />
	<c:set var="c1" value="${requestScope['cliente']}" /> -->
	<div class="container">
		<form action="/Correcion/Listar" method="GET">
				<table class="table">
					<thead>
						<tr>
							<th scope="col">ID ticket</th>
							<th scope="col">Fecha Ingreso</th>
							<th scope="col">Fecha Salida</th>
							<th scope="col">Placa</th>
							<th scope="col">Cedula</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="ticket" items="${t1 }">
							<tr>
								<td>${ticket.numero }</td>
								<td>${ticket.fechaIngreso }</td>
								<td>${ticket.fechaSalida }</td>
								<td>${ticket.vehiculo_placa }</td>
								<td>${ticket.vehiculo_placa.cliente_cedula}</td>
							</tr>
							
						</c:forEach>
					</tbody>
				</table>
			</form>
		</div>
			
</body>
</html>