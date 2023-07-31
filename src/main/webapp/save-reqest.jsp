<%@ page import="by.radevich.jspexample.model.ApplicationForm" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Notebook
  Date: 25.06.2023
  Time: 18:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ApplicationInformation</title>
</head>
<body>
<h1>Application</h1>
<%
    List<ApplicationForm> forms = (List<ApplicationForm>) request.getAttribute("form");
    for (ApplicationForm form : forms){
        out.print(form);
    }%>
</body>
</html>
