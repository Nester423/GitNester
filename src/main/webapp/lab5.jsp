<%-- 
    Document   : lab5
    Created on : 23 мая 2021 г., 18:14:27
    Author     : Jovi
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lab 5</title>
    </head>
    <body>
        <h1>Lab 5</h1>
        <h2>Варіант 12</h2>
        
        <h2>Text:</h2>
        <h2>The idea of adding sensors and intelligence to basic objects was discussed throughout the 1980s and 1990s (and there are arguably some much earlier ancestors), but apart from some early projects - including an internet-connected vending machine - progress was slow simply because the technology wasn't ready. Chips were too big and bulky and there was no way for objects to communicate effectively.\n" +
                "Processors that were cheap and power-frugal enough to be all but disposable were needed before it finally became cost-effective to connect up billions of devices. The adoption of RFID tags - low-power chips that can communicate wirelessly - solved some of this issue, along with the increasing availability of broadband internet and cellular and wireless networking. The adoption of IPv6 - which, among other things, should provide enough IP addresses for every device the world (or indeed this galaxy) is ever likely to need - was also a necessary step for the IoT to scale. Kevin Ashton coined the phrase 'Internet of Things' in 1999, although it took at least another decade for the technology to catch up with the vision. \"The IoT integrates the interconnectedness of human culture - our 'things' - with the interconnectedness of our digital information system - 'the internet.' That's the IoT,\" Ashton told ZDNet.\n" +
                "The IoT was initially most interesting to business and manufacturing, where its application is sometimes known as machine-to-machine (M2M), but the emphasis is now on filling our homes and offices with smart devices, transforming it into something that's relevant to almost everyone. Early suggestions for internet-connected devices included 'blogjects' (objects that blog and record data about themselves to the internet), ubiquitous computing (or 'ubicomp'), invisible computing, and pervasive computing. However, it was Internet of Things and IoT that stuck.
</h2>
        
        
        <div>
            <p>Невідсортований масив Integer: <%=request.getAttribute("unsortedList")%></p>        
            <p>Відсортований масив задопомогою sortApproach2: <%=request.getAttribute("sortedListv2")%></p>  
            <p>Відсортований масив задопомогою sortApproach3: <%=request.getAttribute("sortedList")%></p>
            <p>Визначити місце знаходження числа: <%=request.getAttribute("task2")%></p>
            <p>Невідсортований масив String: <%=request.getAttribute("unsortedText")%></p>   
            <p>Відсортований масив задопомогою sortApproach2: <%=request.getAttribute("sortedText")%></p>             
            <p>Визначити місце знаходження літери: <%=request.getAttribute("task3")%></p>        
            <form action="index.jsp">  
                <input type="submit" value="Home">
            </form> 
        </div>
    </body>
</html>