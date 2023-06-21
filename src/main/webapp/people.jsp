<%@ page import="by.radevich.jspexample.model.Person" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Notebook
  Date: 21.06.2023
  Time: 20:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>People information</title>
</head>
<body>
<h1>People:</h1>
<%
    List<Person> people = (List<Person>) request.getAttribute("people");
    for (Person person : people){
        out.println(person);
    }
%><br>

<a href="add_person.jsp>"> Add additional person </a>
<a href="/persons">See all people</a>
<a href="">logout</a>
</body>
</html>
