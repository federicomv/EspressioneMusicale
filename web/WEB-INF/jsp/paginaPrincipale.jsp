<%-- 
    Document   : paginaPrincipale
    Created on : 15-mar-2016, 8.44.22
    Author     : FSEVERI\loreggian3064
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="http://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
        <link href="http://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic" rel="stylesheet" type="text/css">
        <link href="./res/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>${titolo}</title>
        <link href="./res/style.css" rel="stylesheet" type="text/css">
</head>
<body>
<div id="menu" align="center">
	<table style="width: 95%; height: 100%; valign: center">
		<tr>
			<td width="46%" align="left" class="menu-title"><a href="index.html"><b>Espressione Musicale</b></a></td>
			<td align="right">
		<table>
			<tr>
				<td width="33%" align="center" class="menu-option"><a href="eventi.html"><b>Eventi</b></a></td>
				<td width="33%" align="center" class="menu-option"><a href="login.html"><b>Login</b></a></td>
				<td width="33%" align="center" class="menu-option"><a href="registrati.html"><b>Registrati</b></a></td>
			</tr>
		</table>
		</td>
		</tr>
	</table>
</div>
<div id="main">
	<div id="titolo" class="dark" align="center">
		<table style="width: 95%; height: 100%;">
			<tr><td align="center"><img src="https://upload.wikimedia.org/wikipedia/it/0/07/Stemma_US_Sassuolo_2009-2010.png" alt="" width="20%" style="margin-top: 5%;" /></td></tr>
			<tr><td align="center"><span class="name"><b><font color="green">E</font>spressione <font color="green">M</font>usicale</span></b></td></tr>
			<tr><td><hr class="main"/></td></tr>
			<tr><td align="center" style="font-size: 1.3em;"><span><i>"Il sito di riferimento per l'arte della musica in Italia"</i></td></tr>
		</table>
	</div>
	<div id="news" align="center" class="light">
		<h1 style="text-transform: uppercase;"><b>Eventi pi&ugrave; recenti</b></h1><hr />
		<table style="width: 95%; height: 100%; margin-top: 3%; margin-bottom: 3%;" class="light">
                    <c:forEach items="${eventi}" var="evento">
			<tr align="center">
                            <td><img src="https://upload.wikimedia.org/wikipedia/it/0/07/Stemma_US_Sassuolo_2009-2010.png" width="35%" /></td>
			</tr>
			<tr align="center" >
                            <td><a href="#">${evento.getTitolo()}</a></td>
			</tr>
			<tr align="center" >
                            <td><i>${evento.getLuogo()}</i></td>
			</tr>
                    </c:forEach>
		</table>
		<table style="width: 95%; height: 100%; margin-top: 3%; margin-bottom: 3%;" class="light">
			<tr align="center">
			<td><img src="https://upload.wikimedia.org/wikipedia/it/0/07/Stemma_US_Sassuolo_2009-2010.png" width="35%" /></td>
			<td><img src="https://upload.wikimedia.org/wikipedia/it/0/07/Stemma_US_Sassuolo_2009-2010.png" width="35%" /></td>
			<td><img src="https://upload.wikimedia.org/wikipedia/it/0/07/Stemma_US_Sassuolo_2009-2010.png" width="35%" /></td>
			</tr>
			<tr align="center" >
			<td><a href="">TITOLO 1</a></td>
			<td><a href="">TITOLO 2</a></td>
			<td><a href="">TITOLO 3</a></td>
			</tr>
			<tr align="center" >
			<td><i>Descrizione 1</i></td>
			<td><i>Descrizione 2</i></td>
			<td><i>Descrizione 3</i></td>
			</tr>
		</table>
	</div>
</body>
</html>

        