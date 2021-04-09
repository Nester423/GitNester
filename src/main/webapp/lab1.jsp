<%-- 
    Document   : lab1
    Created on : 4 апр. 2021 г., 23:47:48
    Author     : Jovi
--%>

<%@page import="knu.fit.ist.ta.MyFirstJavaClass"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>This is my lab1! </h1>
        
        
        <%! MyFirstJavaClass mFJC = new MyFirstJavaClass(5);%>
        
        <%
         int x = mFJC.getMyInt(); 

            x+=3;
            x%=3;
        %>
        
        <P>8mod3 =  <%=x%></p>
        
        
        <a href="index.jsp">Home</a>     
    </body>
</html>
