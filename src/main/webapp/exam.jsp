<%-- 
    Document   : exam
    Created on : 21 июн. 2021 г., 17:16:16
    Author     : Jovi
--%>

<%@page import="knu.fit.ist.ta.exam.Results"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>f(x)= 9/(2x-1)</h1>
        <form action="./exam" method="post" class="form-inline">
            <label for="x"><b>Enter x:</b></label>
            <div class="input-group">
                <input  class="form-control" id="x" type="text" name="x"/>
                <input class="btn btn-success" type="submit" value="Submit"/>
            </div>
            <p class="mt-3 mb-0"><b></b><%=request.getAttribute("result")%></p>
        </form>
        <%! Results fr = new Results(75); %>
        <p>Args: <%= fr.GetArgs()%> </p>
        <p>Results:<%= fr.Calculate() %></p>
    </body>
</html>
