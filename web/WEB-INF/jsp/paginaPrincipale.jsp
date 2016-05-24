<%-- 
    Document   : paginaPrincipale
    Created on : 15-mar-2016, 8.44.22
    Author     : FSEVERI\loreggian3064
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <jsp:include page="head.jsp"/>
<body>
    <jsp:include page="menu.jsp"/>
    <div id="main">
	<div id="titolo" class="dark" align="center">
            <table style="width: 95%; height: 100%;">
		<tr><td align="center"><img src="https://upload.wikimedia.org/wikipedia/it/0/07/Stemma_US_Sassuolo_2009-2010.png" alt="" width="20%" style="margin-top: 5%;" /></td></tr>
		<tr><td align="center"><span class="name"><b><font color="green">E</font>spressione <font color="green">M</font>usicale</span></b></td></tr>
		<tr><td><hr class="main"/></td></tr>
		<tr><td align="center" style="font-size: 1.3em;"><i>"Il sito di riferimento per l'arte della musica in Italia"</i></td></tr>
            </table>
	</div>
	<div id="news" align="center" class="light">
            <h1 style="text-transform: uppercase;"><b>Eventi pi&ugrave; recenti</b></h1><hr />
            <div style="width: 95%; height: 100%; margin-top: 3%; margin-bottom: 3%;" class="light">
                <div class="row">
                    <c:forEach items="${eventi}" var="evento">
                        <div class="col-md-4">
                            <img src="https://upload.wikimedia.org/wikipedia/it/0/07/Stemma_US_Sassuolo_2009-2010.png" width="35%" /><br />
                            <a href="#">${evento.getTitolo()}</a><br />
                            <i>${evento.getData()}</i><br />
                            <i>${evento.getLuogo()}</i>
                        </div>
                    </c:forEach>
                </div>
            </div>
        </div>
    </div>
</body>
</html>

        