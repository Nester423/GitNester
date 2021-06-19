<%-- 
    Document   : lab5
    Created on : 23 мая 2021 г., 18:14:27
    Author     : Danya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="knu.fit.ist.ta.lab5.Part1"%>
<%@page import="knu.fit.ist.ta.lab5.Part2"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%! Part1 part1 = new Part1("The Internet of Things, or IoT, refers to the billions of physical devices around the world that are now connected to the internet, all collecting and sharing data. Thanks to the arrival of super-cheap computer chips and the ubiquity of wireless networks, it's possible to turn anything, from something as small as a pill to something as big as an aeroplane, into a part of the IoT. Connecting up all these different objects and adding sensors to them adds a level of digital intelligence to devices that would be otherwise dumb, enabling them to communicate real-time data without involving a human being. The Internet of Things is making the fabric of the world around us more smarter and more responsive, merging the digital and physical universes. How big is the Internet of Things? Big and getting bigger -- there are already more connected things than people in the world. Tech analyst company IDC predicts that in total there will be 41.6 billion connected IoT devices by 2025, or \"things.\" It also suggests industrial and automotive equipment represent the largest opportunity of connected \"things,\", but it also sees strong adoption of smart home and wearable devices in the near term. Another tech analyst, Gartner, predicts that the enterprise and automotive sectors will account for 5.8 billion devices this year, up almost a quarter on 2019. Utilities will be the highest user of IoT, thanks to the continuing rollout of smart meters. Security devices, in the form of intruder detection and web cameras will be the second biggest use of IoT devices. Building automation – like connected lighting – will be the fastest growing sector, followed by automotive (connected cars) and healthcare (monitoring of chronic conditions). The benefits of the IoT for business depend on the particular implementation; agility and efficiency are usually top considerations.");%>
     <p><b>Текст:</b> <%= part1.GetText()%></p>
                <form action="./lab5" method="post" class="form-inline">
                    <label for="x"><b>Введіть слово для пошуку: </b></label>
                    <div class="input-group">
                        <input  class="form-control" id="find" type="text" name="Знайти"/>
                        <input class="btn btn-success" type="submit" value="Знайти"/>
                    </div>   
                     <p class="mt-3 mb-0"><b>Порядковий номер: </b><%=request.getAttribute("result")%></p>
                </form>
                <p><b>Слова, що зустрічаються найчастіше:</b> <%= part1.GetMostPopularWords()%></p>
                <p><b>Найвживаніші комбінації букв(4):</b>
                    <%= part1.MostPopularSequences(4)%></p>
                
                <%! Part2 part2 = new Part2(30); %>
                <% part2.InitList(); %>
                <p><b>List: </b><br/> <%= part2.DisplayList()%></p>
                <%! String find = "model #12"; %>
                <p><b>Порядковий номер елементу зі значенням</b> <%= find %>: <%= part2.IndexOf(find)%></p>
                <% part2.SortByStringField();%>
                <p><b>Сортування string field: </b><br/> <%= part2.DisplayList()%></p>
                <p><b>Порядковий номер елементу зі значенням </b><%= find %>: <%= part2.IndexOf(find)%></p>
                <% part2.SortByLongField();%>
                <p><b>Сортування long field: </b><br/> <%= part2.DisplayList()%></p>
                <p><b>Порядковий номер елементу зі значенням </b><%= find %>: <%= part2.IndexOf(find)%></p>
                
        
        
    </body>
</html>