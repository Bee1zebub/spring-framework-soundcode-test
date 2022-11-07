<%--
  Created by IntelliJ IDEA.
  User: lfy
  Date: 2021/3/13
  Time: 21:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>

  <form method="get" action="/springmvc_sourcecode_war__exploded/hello">
    姓名：<input type="text" name="name"/>
    用户：<input type="text" name="user"/>
    <button type="submit">submit</button>
  </form>
  $END$
  ${sessionScope.get("msg")}
  </body>
</html>
