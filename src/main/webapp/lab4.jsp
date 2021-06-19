<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Лабораторна робота 4</h1> 
        
        <h2>Варіант 6</h2>

        <h3>1.Очищення тексту.</h3>      
        <p><%=request.getAttribute("cleanText")%></p>
       
        <h3>2.Визначити загальну кількість слів у тексті.</h3>
        <p><%=request.getAttribute("listSize")%></p>
        
        <h3>3.Визначити кількість унікальних слів у тексті.</h3>
        <p><%=request.getAttribute("setSize")%></p>
        
        <h3>4.Визначити перші 6 слів, що зустрічаються найчастіше.</h3>
        <p><%=request.getAttribute("6MostFrequentWords")%></p>
        
        <h3>5.Визначити кількість слів що не містять літеру v.</h3>
        <p><%=request.getAttribute("AmountOfWordsWithoutV")%></p>
        
        <h3>6.Визначити кількість слів, що мають рівно 3 різних літер.</h3>
        <p><%=request.getAttribute("AmountOfWordsWith3UniqueLet")%></p>
        
        <h3>7.Визначити перші 4 трьохлітерні послідовності у словах тексту, що зустрічаються найчастіше.</h3>
        <p><%=request.getAttribute("find4MostPopular3Sequences")%></p>
        
        <div>
            <form action="index.jsp">
                <input type="submit" value="HOME PAGE">
            </form>
        </div>
        
    </body>
</html>