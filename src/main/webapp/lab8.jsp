<%-- 
    Document   : lab8
    Created on : 20 июн. 2021 г., 0:48:17
    Author     : Jovi
--%>

<%@page import="java.util.Arrays"%>
<%@page import="knu.fit.ist.ta.lab8.Algorithms"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
         <h1>Лабораторна робота 8</h1>
        
        <h2>Варіант 6</h2>
 
        <h2>Знайти елемент масиву за допомогою трьох алгоритмів: <b>linearSearch, binarySearch, jumpSearch</b></h2>
                <%! int[] arr= {0, 1,  2, 3, 4, 5, 6, 7, 0, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7, 0, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7, 0, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7, 0, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7, 0, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7, 0, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7, 0, 1, 2, 3,  4, 5, 6, 7, 1, 2, 3, 4,  5, 6, 7, 0, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7, 0, 1, 2, 3, 4, 5,6, 7, 101,135,}; %>
                <%! Algorithms algorithms = new Algorithms();%>
                <%int number = (int)request.getAttribute("number"); %>
                <h3>Наш масив: <%=Arrays.toString(arr)%></h3>
                <hr>
                
                
                <%
                long startTime = System.nanoTime();
                int i = algorithms.linearSearch(arr, number);
                long endTime = System.nanoTime();
                long SearchDuration = (endTime - startTime);   
                %>
                
                <h3><b>Алгоритм:</b> linear search</h3>
                <h3><b>Індекс елемента:</b> <%=i%></h3>
                <h3><b>Час виконання:</b> <%=SearchDuration%></h3>
                <h3><b>Складність алгоритму:</b> O(N)</h3>
                <hr>
                
                <%
                startTime = System.nanoTime();
                i = algorithms.jumpSearch(arr, number);
                endTime = System.nanoTime();
                SearchDuration = (endTime - startTime);         
                %>
                
                <h3><b>Алгоритм:</b> jump search</h3>
                <h3><b>Індекс елемента:</b> <%=i%></h3>
                <h3><b>Час виконання:</b> <%=SearchDuration%></h3>
                <h3><b>Складність алгоритму:</b> O(sqrt (N))</h3>
                <hr>
                 
                <%
                startTime = System.nanoTime();
                i = algorithms.binarySearch(arr, number);
                endTime = System.nanoTime();
                SearchDuration = (endTime - startTime);         
                %>
                
                <h3><b>Алгоритм:</b> binary search</h3>
                <h3><b>Індекс елемента:</b> <%=i%></h3>
                <h3><b>Час виконання:</b> <%=SearchDuration%></h3>
                <h3><b>Складність алгоритму:</b> O(log (N))</h3>
                
        <form action="index.jsp">
                <input type="submit" value="HOME PAGE">
        </form>
    