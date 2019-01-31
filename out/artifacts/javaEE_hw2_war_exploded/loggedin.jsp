<%--
  Created by IntelliJ IDEA.
  User: craq
  Date: 1/31/19
  Time: 3:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Randomizer</title>
    <style>
        input[type=number] {
            width: 100%;
            padding: 12px 20px;
            margin: 8px 0;
            display: inline-block;
            border: 1px solid #ccc;
            box-sizing: border-box;
        }
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
<h1><p>Welcome to your random number generator</p></h1>
<form action='Randomizer' method='post'>
    <label for="numb"><b>Max number</b></label>
    <input type="number" min="1" placeholder="Enter Number" name="nmb" required>

    <label for="numb-count"><b>Amount of numbers</b></label>
    <input type="number" min="1" placeholder="Enter amount of numbers" name="nmb_cnt" required>
    <button type="submit">Generate</button>
</form>
</body>
</html>
