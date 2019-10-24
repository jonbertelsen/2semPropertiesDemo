<%-- 
    Document   : properties
    Created on : Oct 24, 2019, 9:30:20 PM
    Author     : jobe
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Properties</title>
    </head>
    <body>
        <h1>Vis mig så de properties makker!</h1>
       
        <%  
            String user = (String)request.getAttribute("user");
            String password = (String)request.getAttribute("password");
        %>
        
        <p>user: ${user}</p>
        <p>password: ${password}</p>
        
    </body>
</html>
