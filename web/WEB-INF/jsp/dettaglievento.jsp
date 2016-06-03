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
    <div style="width: 95%; height: 100%; margin-top: 8%; margin-bottom: 8%;margin-left: 3%" class="light">
        <div class="row">
            <img src="https://upload.wikimedia.org/wikipedia/it/0/07/Stemma_US_Sassuolo_2009-2010.png" width="35%" /> 
        </div>
        <div class="row">
            <div class="col-md-6" style="font-size: 200%; padding-top: 2%;">
                <i>${evento.getTitolo()}</i><br />
                <i>Data: ${evento.getData()}</i><br />
                <i>Luogo: ${evento.getLuogo()}</i>
            </div>
        </div>
    </div>
</body>
</html>