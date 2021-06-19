<%-- 
    Document   : lab6form
    Created on : 20 июн. 2021 г., 0:24:50
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
            <form action="./lab6" method="post">
                <h3>Введіть число, яке ви бажаєте вивести у зворотньому порядку</h3>
                <input type="text" name="number" placeholder="insert some number e.g. 1024"/>
                
                <h3>Дерево: {3, 11, 6, 2, 10, 4, 8, 7}</h3>
                <h3>Введіть елемент дерева, індекс якого ви бажаєте знайти</h3>       
                <input type="text" name="value" placeholder="insert value"/>
                <h3>Введіть елемент дерева, який ви бажаєте перевірити на наявність</h3>
                <input type="text" name="isValue" placeholder="insert value"/>
                <input type="submit" value="Ok">
            </form>
        </div>
    </body>
</html>