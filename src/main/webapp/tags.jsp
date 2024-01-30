<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<!DOCTYPE html>
<html>
<head>
    <title>Tic-Tac-Toe</title>
    <link href="static/main.css" rel="stylesheet">
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <script src="<c:url value="/static/jquery-3.6.0.min.js"/>"></script>
</head>
<body>
<h1>TAGS</h1>
<a href="http://localhost:8888/start">GAME tic tac toe</a>
<br>
<table>
	<tr>
            <td onclick="window.location='/logicTag?click=0'">${(data.get(0) != 0) ? data.get(0) : " "}</td>
            <td onclick="window.location='/logicTag?click=1'">${(data.get(1) != 0) ? data.get(1) : " "}</td>
            <td onclick="window.location='/logicTag?click=2'">${(data.get(2) != 0) ? data.get(2) : " "}</td>
            <td onclick="window.location='/logicTag?click=3'">${(data.get(3) != 0) ? data.get(3) : " "}</td>
            <td onclick="window.location='/logicTag?click=4'">${(data.get(4) != 0) ? data.get(4) : " "}</td>
        </tr>
        <tr>
            <td onclick="window.location='/logicTag?click=5'">${(data.get(5) != 0) ? data.get(5) : " "}</td>
            <td onclick="window.location='/logicTag?click=6'">${(data.get(6) != 0) ? data.get(6) : " "}</td>
            <td onclick="window.location='/logicTag?click=7'">${(data.get(7) != 0) ? data.get(7) : " "}</td>
            <td onclick="window.location='/logicTag?click=8'">${(data.get(8) != 0) ? data.get(8) : " "}</td>
            <td onclick="window.location='/logicTag?click=9'">${(data.get(9) != 0) ? data.get(9) : " "}</td>
        </tr>
        <tr>
            <td onclick="window.location='/logicTag?click=10'">${(data.get(10) != 0) ? data.get(10) : " "}</td>
            <td onclick="window.location='/logicTag?click=11'">${(data.get(11) != 0) ? data.get(11) : " "}</td>
            <td onclick="window.location='/logicTag?click=12'">${(data.get(12) != 0) ? data.get(12) : " "}</td>
            <td onclick="window.location='/logicTag?click=13'">${(data.get(13) != 0) ? data.get(13) : " "}</td>
            <td onclick="window.location='/logicTag?click=14'">${(data.get(14) != 0) ? data.get(14) : " "}</td>
        </tr>
        <tr>
            <td onclick="window.location='/logicTag?click=15'">${(data.get(15) != 0) ? data.get(15) : " "}</td>
            <td onclick="window.location='/logicTag?click=16'">${(data.get(16) != 0) ? data.get(16) : " "}</td>
            <td onclick="window.location='/logicTag?click=17'">${(data.get(17) != 0) ? data.get(17) : " "}</td>
            <td onclick="window.location='/logicTag?click=18'">${(data.get(18) != 0) ? data.get(18) : " "}</td>
            <td onclick="window.location='/logicTag?click=19'">${(data.get(19) != 0) ? data.get(19) : " "}</td>
        </tr>
        <tr>
             <td onclick="window.location='/logicTag?click=20'">${(data.get(20) != 0) ? data.get(20) : " "}</td>
             <td onclick="window.location='/logicTag?click=21'">${(data.get(21) != 0) ? data.get(21) : " "}</td>
             <td onclick="window.location='/logicTag?click=22'">${(data.get(22) != 0) ? data.get(22) : " "}</td>
             <td onclick="window.location='/logicTag?click=23'">${(data.get(23) != 0) ? data.get(23) : " "}</td>
             <td onclick="window.location='/logicTag?click=24'">${(data.get(24) != 0) ? data.get(24) : " "}</td>
        </tr>
</table>

<script>

</script>

</body>
</html>