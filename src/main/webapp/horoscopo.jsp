<%-- 
    Document   : horoscopo
    Created on : 10-feb-2021, 11:15:33
    Author     : Usuario
--%>

<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            body{
                background-image: url(imagenes/Galaxia.gif);
                background-position: center center;
                background-repeat: no-repeat;
                background-attachment: fixed;
                background-size: cover;
                text-align: center;
                align-items: center;
                color: firebrick;
                font-size: 20px;
            }
            
            select{
                background-color: black;
                color: firebrick;
                font-size: 22px;
            }
            
            select:focus{
                color: red;
            }
            
            select:hover{
                border-color: red;
            }
            
            input{
                background-color: black;
                text-align: center;
                align-items: center;
                color: firebrick;
                font-size: 20px;
            }
            
            input:focus{
                background-color: black;
                color: red;
            }
            
            input:hover{
                border-color: red;
            }
            
            #enviar{
                color: firebrick;
                background-color: black;
                font-size: 20px;
            }
            
            #enviar:hover{
                background-color: black;
                border-color: firebrick;
                color: red;
            }
            
            p{
                color: red;
                font-size: 50px;
                font-style: strong;
            }
            
            h2{
                font-size: 22px;
            }
        </style>
    </head>
    <body>
        <%
            ArrayList<String> meses = (ArrayList<String>) request.getAttribute("meses");
            ArrayList<String> dias = (ArrayList<String>) request.getAttribute("dias");
            String dia = (String) request.getAttribute("dia");
            if (dia == null) {
                dia = "1";
            }
            String mes = (String) request.getAttribute("mes");
            if (mes == null) {
                mes = "1";
            }
            String nombre = (String) request.getAttribute("nombre");
            if (nombre == null) {
                nombre = "";
            }
        %>
        <h1>Horóscopo</h1>
        <hr>
        <form action="servletHoroscopo" method="post">
            <input type="text" id="nombre" name="nombre" placeholder="Nombre"><br>
            <h2>Mes</h2> <select name="mes" id="mes">
                <% for (int i = 0; i < meses.size(); i++) {
                        String cadenaSelected = "";
                        if (Integer.parseInt(mes) == Integer.parseInt(meses.get(i))) {
                            cadenaSelected = "selected";
                        }
                %>
                <option value="<%= meses.get(i)%>" <%=cadenaSelected%>><%= meses.get(i)%></option>
                <% } %>
            </select><br>
            <h2>Día</h2> <select name="dia" id="dia">
                <% for (int d = 0; d < dias.size(); d++) {
                        String cadenaSelected = "";
                        if (Integer.parseInt(dia) == Integer.parseInt(dias.get(d))) {
                            cadenaSelected = "selected";
                        }
                %>
                <option value="<%= dias.get(d)%>" <%=cadenaSelected%>><%= dias.get(d)%></option>
                <% }%>
            </select>
            <hr>
            <input id="enviar" type="submit" value="Enviar">
            <hr>
            <%
                String signo = (String) request.getAttribute("signo");
                String descripcion = (String) request.getAttribute("descripcion");
                if (nombre != "" && signo != null && descripcion != null) {%>
            <p><%= nombre%> <%= signo%>.</p>
            <p><%= descripcion%></p>
            <% }%>
        </form>
    </body>
</html>
