<%-- 
    Document   : arithmeticcalculator
    Created on : Jan 18, 2022, 7:00:55 PM
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
        <h1>Arithmetic Calculator</h1>
        <form action="arithmetic" method="post">
            <label for="first">First:<label>
             <input type="number" name="first" id="first" value="${first}">      
                    <br>
             <label for="second">Second:<label>
              <input type="number" name="second" id="second" value="${second}">
              <br>
                           <input type="submit" value="+" id="add" name="button">
                            <input type="submit" value="-" id="subtract" name="button">
                             <input type="submit" value="*" id="multiply" name="button">
                              <input type="submit" value="%" id="divide" name="button">
                              <br>
                        
        </form>  
        <br>Result:${result}
         <br><a href="age">Age Calculator</a>
     
        
            
    </body>
</html>
