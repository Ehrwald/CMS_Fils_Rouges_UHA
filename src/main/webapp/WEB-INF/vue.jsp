<%--
  Created by IntelliJ IDEA.
  User: Hubsc
  Date: 03/10/2019
  Time: 22:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <link href="style.css" rel="stylesheet" type="text/css">
    <title>vue</title>
</head>

<body>
<p>Ceci est une page générée depuis une JSP.</p>
<form action="cpage" method='POST'>
    <label for="titre">Nom du titre :</label>
    <input type="text" name="titre" id="titre"/>

    <label for="textP">Paragraphe :</label>
    <input type="text" name="textP" id="textP"/>

    <%-- pas encore trouver le textarea
    <label>Paragraph </label>
    <input type="textearea" name="textarea"></textarea> --%>

    <label for="footer">Footer:</label>
    <input type="text" name="footer" id="footer" />

    <input type="submit"/>
    </form>
</body>
</html>