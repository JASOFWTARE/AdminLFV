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
            <h1>Lista de Jugadores</h1>
            <div class="links">
                <a href="JugadorAction">Nuevo Jugador</a>
            </div>
            <div class="form-row">
                <label>Filtro: </label>
                <input type="text" id="filtro" class="input1"/>
            </div>
            <div id="tabla" class="tabla">
                <jsp:include page="tablaJugador.jsp"/>
            </div>
        </div>    
        </div>
        <div class="regis-b-c"/>
        </div>
        </div>
        </div>
        </div>    
        <jsp:include page="/resources/template/footer.jsp"/>
        <script type="text/javascript">
            jQuery(document).ready(function(){
                jQuery("#filtro").keyup(function(){
                    var data = "filter="+jQuery(this).val() + (data != null ? data : '');
                    var action = "JugadorAction!refreshJugador";
                    consultaAjax(data, action, "#tabla")
                });
            });
        </script>
    </body>
</html>
