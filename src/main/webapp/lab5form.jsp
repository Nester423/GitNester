<%-- 
    Document   : lab5form
    Created on : 15 мая 2021 г., 13:09:18
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
        <h1>Lab 5</h1>
        <form method="post" action="./lab5">
                <p>Скільки елементів генерувати в масиві</p>
                <input type="text" name="task1" placeholder="Скільки елементів"/>
                <p>Яке число шукати в згенерованому масиві</p>
                <input type="text" name="task2" placeholder="Яке число шукати"/>
                <p>Яку літеру шукати в згенерованому масиві</p>
                <input type="text" name="task3" placeholder="Яку літеру шукати"/>
                <input type="submit" value="Ok"/>
        </form>
    </body>
</html>