<%-- 
    Document   : lab2
    Created on : 09.04.2021, 14:11:39
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
        <h1>Лабораторна робота 2</h1>
       
        <h2>Знайти корінь рівняння sqrt(2x)/(-3x^2 + 4x + 1)</h2>
        <h3>Корінь рівняння: </h3>
    
        <p><%=request.getAttribute("result")%></p>
        
        <div>
            <form action="lab2form.jsp">
                <input type="submit" value="New x">
            </form>
        </div>
        
        <div>
            <form action="index.jsp">
                <input type="submit" value="HOME PAGE">
            </form>
        </div>
    </body>
</html>