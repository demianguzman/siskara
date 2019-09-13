<%-- 
    Document   : add
    Created on : 12/09/2019, 22:29:28
    Author     : Demian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet"type="text/css">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
        <div class="col-lg-6">
        <h1>Agregar cliente</h1>
        <form action="Controlador">
            NOMBRE:<br>
            <input class="from-contorl" type="text" name="txtnombrecli"><br>
            APELLIDO:<br>
            <input class="from-contorl" type="text" name="txtapellidocli"><br>
            DIRECCION:<br>
            <input class="from-contorl" type="text" name="txtdireccioncli"><br>
            TELEFONO:<br>
            <input class="from-contorl" tyoe="text" name="txttelefonocli"><br>
            <input class="btn btn-primary" type="submit" name="accion" value="agregar"><br>
            <a href="Controlador?accion=mostrar">regresar</a>
            </form>
        </div>
            </div>
    </body>
</html>
