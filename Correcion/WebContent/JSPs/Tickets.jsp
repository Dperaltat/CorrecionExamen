<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Agregar Tickets</title>
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
		<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
		<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
		<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
		
	</head>
	<body>
		<div class="container">
		<div class="card text-center container mt-4 col-lg-4">
		<form class="form-sign" action="/Correcion/AgregarTicket" method="POST">
			<div class="card-body">
				<div class="form-group">
					<a>Placa</a>
					<input type="text"  class="form-control" id="exampleInputName2" placeholder="Placa" name="placa" required>
				</div>
				
				<div class="form-group">
					<a>Cédula</a>
					<input type="text"  class="form-control" id="exampleInputName2" placeholder="Cédula" name="ced" required>
				</div>
				
				<div class="form-group">
					<a>Año de Ingreso</a>
					<input type="text"  class="form-control" id="exampleInputName2" placeholder="Año de Ingreso" name="anIngreso" required>
				</div>
				
				<div class="form-group">
					<a>Mes de Ingreso</a>
					<input type="text"  class="form-control" id="exampleInputName2" placeholder="Mes de Ingreso" name="mesIngreso" required>
				</div>
				
				<div class="form-group">
					<a>Día de Ingreso</a>
					<input type="text"  class="form-control" id="exampleInputName2" placeholder="Día de Ingreso" name="diaIngreso" required>
				</div>
				
				<div class="form-group">
					<a>Año de Salida</a>
					<input type="text"  class="form-control" id="exampleInputName2" placeholder="Año de Salida" name="anSalida" required>
				</div>
				
				<div class="form-group">
					<a>Mes de Salida</a>
					<input type="text"  class="form-control" id="exampleInputName2" placeholder="Mes de Salida" name="mesSalida" required>
				</div>
				
				<div class="form-group">
					<a>Día de Salida</a>
					<input type="text"  class="form-control" id="exampleInputName2" placeholder="Día de Salida" name="diaSalida" required>
				</div>
				
				<button class="btn btn-primary" type="submit" name="resp" value="Registrar">Agregar Ticket</button>
			</div>
		</form>
	</div>
	</body>
</html>