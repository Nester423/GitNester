<%-- 
    Document   : lab6
    Created on : 20 июн. 2021 г., 0:24:39
    Author     : Jovi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
        <h1>Лабораторна робота 6-7</h1>
        
        <h2>Варіант 6</h2>
 
        <h3>1.Вивести цифри числа <big><%=request.getAttribute("number")%></big> у зворотньому порядку на екран</h3>
        <p><%=request.getAttribute("revNumber")%></p>
 
        <h3>2.Створити симетричне бінарне дерево пошуку з елементів: <big><%=request.getAttribute("getTree")%></big></h3>
      
        <h3>3.Вивести на екран початкове дерево та результати виконання операцій над ним, що розглядалися на занятті</h3>
        
        <h4>Індекс елемента <big><%=request.getAttribute("value")%></big> у дереві</h4>
        <p><%=request.getAttribute("index")%></p>
        
        <h4>Чи містить дерево елемент <big><%=request.getAttribute("isValue")%></big></h4>
        <p><%=request.getAttribute("contains")%></p>
        
        <h4>traverseInOrder</h4>
        <p><%=request.getAttribute("traverseInOrder")%></p>
        
        <h4>traversePreOrder</h4>
        <p><%=request.getAttribute("traversePreOrder")%></p>
        
        <h4>traversePostOrder</h4>
        <p><%=request.getAttribute("traversePostOrder")%></p>
        
        <h4>traverseLevelOrder</h4>
        <p><%=request.getAttribute("traverseLevelOrder")%></p>
        
        <form action="index.jsp">
                <input type="submit" value="HOME PAGE">
        </form>
</html>