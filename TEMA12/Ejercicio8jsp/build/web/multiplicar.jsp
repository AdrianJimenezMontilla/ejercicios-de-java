<%-- 
    Document   : multiplicar
    Created on : Feb 18, 2019, 1:46:07 AM
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
        <% int numero = Integer.parseInt(request.getParameter("numero")); %>
        <h1>Tabla de multiplicar</h1>
        <table>
        <% for (int i = 0; i < 11; i++) {
          out.println("<tr><td>" + numero + " x " + i + "</td><td> = </td><td>" + numero * i + "</td></tr>");
           }
        %>
        </table>
    </body>
</html>
