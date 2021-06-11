<%--
  Created by IntelliJ IDEA.
  User: nguye
  Date: 6/12/2021
  Time: 6:04 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Caculator</title>
  </head>
  <body>
  <h1>Caculator</h1>
  <form  method="post">
    <input type="text" name="vl1" value="0.0">
    <input type="text" name="vl2" value="0.0">
    <input type="submit" value="+" name="operation">
    <input type="submit" value="-" name="operation">
    <input type="submit" value="*" name="operation">
    <input type="submit" value="/" name="operation">
  </form>
  <h3>result = ${result} </h3>
  </body>
</html>
