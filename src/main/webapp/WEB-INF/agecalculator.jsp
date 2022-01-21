<%-- 
    Document   : agecalculator
    Created on : Jan 18, 2022, 5:52:20 PM
    Author     : 752808
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form action="age" method="post">
            <label for="age">Enter your age:<label>
                    <input type="number" name="age" id="age"><br>
                           <input type="submit" value="Age next birthday">
                        
        </form>  
        <br>${message}
        
           
        <br><a href="arithmetic">Arithmetic Calculator</a>
        
            
    </body>
</html>
