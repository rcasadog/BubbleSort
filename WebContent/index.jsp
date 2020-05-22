<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ordena tu cadena de números</title>
</head>

<body>
<form action="BubleSort" method="post" name="f1">
		<table>
			<tr> <td>
			Inserta 5 números separados por coma: <input type="text" name="cadenaNumeros"/></td>
			</tr>
			
			<tr> <td>
			<input type="radio" name="ordenar" value="CREC">
  			<label for="CREC">Creciendo</label><br>
  			<input type="radio" name="ordenar" value="DECR">
		  	<label for="DECR">Decreciendo</label><br>
			</td>
			</tr>
			<tr><td><input type="submit" value="ordenar"></td></tr>
		</table>
	</form>
 
</body>
</html>