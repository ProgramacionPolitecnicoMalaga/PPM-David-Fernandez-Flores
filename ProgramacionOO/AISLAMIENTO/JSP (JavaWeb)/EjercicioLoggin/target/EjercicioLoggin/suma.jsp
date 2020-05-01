<%@ page import="java.util.*" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="java.util.logging.Logger" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Resultado Suma</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
</head>
<body>
<%
    String nombreCreador = " David Fernández Flores ";
    PrintWriter printer = response.getWriter();
    printer.print("<label>Resultado de la suma : </label>");
    String resultado = String.valueOf(request.getAttribute("resultado"));
    printer.print("<input type='text' value=" + resultado + " class='form-control'>");
    Logger logger = Logger.getLogger(this.getServletInfo());
    logger.info(" Aplicacion propiedad de "+nombreCreador);
%>
</body>
</html>