<%-- 
    Document   : conversor
    Created on : Feb 18, 2019, 12:57:42 AM
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
    <div class="dinero">
      <h2>
        <%
          Double c = Double.parseDouble(request.getParameter("cantidad"));
          DecimalFormat formatoEuros = new DecimalFormat("0.00");

          if (request.getParameter("cambio").equals("eurosEnPesetas")) {
            out.print(formatoEuros.format(c) + " euros son " + Math.round(c * 166.386) + " pesetas.");
          } else {
            out.print(Math.round(c) + " pesetas son " + formatoEuros.format(c / 166.386) + " euros.");
          }
        %>
      </h2>
    </div>
  </body>
</html>
