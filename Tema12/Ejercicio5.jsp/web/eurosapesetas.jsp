<%-- 
    Document   : eurosapesetas
    Created on : Feb 12, 2019, 12:14:31 PM
    Author     : pc21
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.text.DecimalFormat"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
     <%
      double cantidad = Double.valueOf(request.getParameter("euros"));
      double resultado = cantidad * 166.386;
      DecimalFormat dosDecimales = new DecimalFormat("0.000");
      out.println("La conversión es " + dosDecimales.format(resultado));
    %>
    </body>
</html>
