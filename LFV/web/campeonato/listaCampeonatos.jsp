<%@ taglib prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Liga de Futbol Vinto</title>
        <jsp:include page="/resources/template/head.jsp"/>
    </head>
    <body>
        <jsp:include page="/resources/template/header.jsp"/>
        <div id="middle">
        <div id="middleWrap">
        <div class="regisLeftContent">
        <div id="registrationContent">
        <div class="regis-t-c"></div>
        <div id="regis_body" class="regis-body">
            <h1>Lista de Campeonatos</h1>
            <s:if test="campeonatoAbierto">
            <div class="links">
                <a href="#">Debe cerrar el Campeonato Actual para aperturar uno nuevo</a>
            </div>    
            </s:if>
            <s:else>
            <div class="links">
                <a href="CampeonatoAction">Nuevo Campeonato</a>
            </div>
            </s:else>
            <div id="tabla" class="tabla">
                <jsp:include page="tablaCampeonato.jsp"/>
            </div>
        </div>    
        </div>
        <div class="regis-b-c"/>
        </div>
        </div>
        </div>
        </div>    
        <jsp:include page="/resources/template/footer.jsp"/>
    </body>
</html>
