<%-- 
    Document   : eventi
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
    <div id="news" align="center" class="light">
            <h1 style="text-transform: uppercase;"><b>Eventi</b></h1><hr />
            <div style="width: 95%; height: 100%; margin-top: 3%; margin-bottom: 3%;" class="light">
                    <c:forEach items="${eventi}" var="evento">
                        <div class="row">
                            <div class="col-md-6">
                                <img src="https://upload.wikimedia.org/wikipedia/it/0/07/Stemma_US_Sassuolo_2009-2010.png" width="35%" />
                            </div>
                            <div class="col-md-6" style="font-size: 200%; padding-top: 2%;">
                                <a href="./evento?id=${evento.getId()}">${evento.getTitolo()}</a><br /><br />
                                <i>Data: ${evento.getData()}</i><br /><br />
                                <i>Luogo: ${evento.getLuogo()}</i>
                            </div>
                        </div>
                        <hr style="max-width: 100%;"/>
                    </c:forEach>
            </div>
        </div>
</body>
</html>
