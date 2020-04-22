<%@ page import="java.util.*" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Resultado Final de la sucesion</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
    <style>
        input{
            width: 120px;
        }
    </style>
</head>
<body>
<%
    PrintWriter printer = response.getWriter();
%>
<label>Elemento seleccionado: </label> <input type="text" value='<% printer.print(request.getParameter("numPosicion")); %>' class="form-control">
<br>
<label>Resultado del elemento: </label> <input type="text" value='<% printer.print(request.getAttribute("resultado")); %>' class="form-control">
</body>
</html>