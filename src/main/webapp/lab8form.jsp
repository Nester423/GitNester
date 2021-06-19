<%-- 
    Document   : lab8form
    Created on : 20 июн. 2021 г., 0:48:29
    Author     : Jovi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <h1>Press the button!</h1>
        
         <div>
            <form action="./lab8" method="post">
                <h2>Наш масив: {0, 1, 2, 3, 4, 5, 6, 7, 0, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7, 0, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7, 0, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7, 0, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7, 0, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7, 0, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7, 0, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7, 0, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7, 0, 1, 2, 3, 4, 5,6, 7, 101, 135}</h2>
                <h3>Введіть число, яке ви бажаєте знайти у масиві</h3>
                 
                <input type="text" name="number" placeholder="insert some number e.g. 135, 101, 56"/>
                <input type="submit" value="Ok">
            </form>
        </div>
    </body>
</html>