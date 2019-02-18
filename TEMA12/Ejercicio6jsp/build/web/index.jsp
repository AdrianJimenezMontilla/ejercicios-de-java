<%-- 
    Document   : index
    Created on : Feb 12, 2019, 12:31:48 PM
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
    <h2>Conversor de pesetas a euros</h2>
    <form method="post" action="pesetasaeuros.jsp">
      Introduzca las pesetas: <input type="number" min="0" step="0.01" name="pesetas"></br>
      <input type="submit" value="Aceptar">
    </form>
    </body>
</html>
