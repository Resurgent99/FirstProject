<%@ page import="java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Список задач</title>
</head>
<body>
<h1>Список задач</h1>
<ul>
    <%
        ArrayList<String> tasks = (ArrayList<String>) request.getAttribute("tasks");
        if (tasks != null) {
            for (String task : tasks) {
    %>
    <li><%= task %></li>
    <%
        }
    } else {
    %>
    <li>Haven't task</li>
    <% } %>
</ul>
</body>
</html>