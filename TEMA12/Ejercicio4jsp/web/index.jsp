<%-- 
    Document   : index
    Created on : Feb 11, 2019, 1:07:02 AM
    Author     : pc21
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <h2>Calcula la media de tres notas</h2>
    <form method="post" action="media.jsp">
      Nota 1: <input type="number" min="0" max="10" step="0.01" name="nota1"></br>
      Nota 2: <input type="number" min="0" max="10" step="0.01" name="nota2"></br>
      Nota 3: <input type="number" min="0" max="10" step="0.01" name="nota3"></br></br>
      <input type="submit" value="Aceptar">
    </form>
    </body>
</html>
