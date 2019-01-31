<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: craq
  Date: 1/31/19
  Time: 4:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Random numbers</title>
    <style>
        button {
            background-color: #4CAF50;
            color: white;
            padding: 14px 20px;
            margin: 8px 0;
            border: none;
            cursor: pointer;
            width: 100%;
        }

        /* Add a hover effect for buttons */
        button:hover {
            opacity: 0.8;
        }
    </style>
</head>
<body>
<h1>
    <%
        List numbers = (List) request.getAttribute("numbs");
        for(int i = 0;i<numbers.size();i++){
            out.print(i+": "+numbers.get(i)+"<br>");
        }
    %>
</h1>
<button onclick="location.href = 'loggedin.jsp';" id="myButton" class="float-left submit-button" >Home</button>
</body>
</html>
