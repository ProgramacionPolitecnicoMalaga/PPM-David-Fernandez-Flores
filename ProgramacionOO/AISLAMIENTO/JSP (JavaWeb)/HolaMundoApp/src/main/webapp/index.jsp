<%@ page import="com.politecnico.Saludo" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Primer coso en JSP</title>
</head>
<body>

</body>
</html>

<body>
    <% Saludo saludo = new Saludo();
    out.print(saludo.saludar());
    %>
</body>
</html>
