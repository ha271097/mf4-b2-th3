<%--
  Created by IntelliJ IDEA.
  User: nguye
  Date: 6/11/2021
  Time: 3:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Time of City</title>
</head>
<body>
<h1>Time of City</h1>
<p>Time of City ${city}: ${date}</p>
<form method="post">
<select name="city">
    <option value="Asia/Ho_Chi_Minh" selected>Select a city</option>
    <option value="Asia/Ho_Chi_Minh">Ho Chi Minh</option>
    <option value="Singapore">Singapore</option>
    <option value="Asia/Hong_Kong">Hong Kong</option>
    <option value="Asia/Tokyo">Tokyo</option>
    <option value="Asia/Seoul">Seoul</option>
    <option value="Europe/London">London</option>
    <option value="Europe/Madrid">Madrid</option>
    <option value="America/New_York">New York</option>
    <option value="Australia/Sydney">Sydney</option>
    <option value="Argentina/Buenos_Aires">Buenos Aires</option>
</select>
    <button type="submit">ShowTime</button>
</form>
</body>
</html>
