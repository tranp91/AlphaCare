<%-- 
    Document   : login
    Created on : Sep 14, 2018, 7:49:07 PM
    Author     : Phong Tran. Ami Bhagat, Michael Smith
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>AlphaCare Sign-in</title>
    </head>
    <body>
        <form id="loginForm" action="Authenticate" method="POST">
            <h1>Log In</h1>
            <input type="text" name="username" placeholder="Username" required><br>
            <input type="text" name="password" placeholder="Password" required><br>
            <input type="submit" value="Login"><br>
            $(errorMessage)
        </form>
    </body>
</html>
