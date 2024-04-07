<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="ctg" uri="customtags" %>
<!DOCTYPE html>
<html>
<head>
  <title>HomeWork10 - Tags</title>
</head>
<body>

<a href="/start-servlet">Get Data</a>


<ctg:table rows="2" head="Title">
  ${students}

</ctg:table>
</body>
</html>