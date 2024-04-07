<%@ page import="org.surikov.homework10.entity.Students" %>
<%@ page import="org.surikov.homework10.dao.Dao" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="ctg" uri="customtags" %>
<!DOCTYPE html>
<html>
<head>
  <title>HomeWork10 - Tags</title>
</head>
<body>

<ctg:table rows="1" head="Students">
      ${students}
</ctg:table>

<a href="/start-servlet">Get data</a><br>
</body>
</html>