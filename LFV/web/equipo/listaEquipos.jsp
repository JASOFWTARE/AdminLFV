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
            <h1>Lista de Equipos</h1>
            <div class="links">
                <a href="CrearActualizarEquipo">Nuevo Equipo</a><br>
            </div>
            <div class="form-row">
                <label>Filtro: </label>
                <select id="idCategoria">
                    <option value="-1">Todos</option>
                <s:iterator value="categoriaList">
                    <option value="<s:property value="idCategoria"/>"><s:property value="nombreCategoria"/></option>
                </s:iterator>
            </select>
            </div>
            <div id="tabla" class="tabla">
                <jsp:include page="tablaEquipo.jsp"/>
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
