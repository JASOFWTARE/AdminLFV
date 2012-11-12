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
        <a href="JugadorAction!listaJugadores">Lista de Jugadores</a><br>
        <h1>Jugador</h1>
        <s:form id="jugadorForm" action="JugadorAction!actualizarJugador">
            <input type="hidden" name="accion" value="<s:property value="accion"/>"/>
            <input type="hidden" name="idJugador" value="<s:property value="idJugador"/>"/>
            <div class="form-row">
                <label>Nombre : <b>*</b></label>
                <input type="text" name="jugador.nombreJugador" value="<s:property value="equipo.nombreEquipo"/>" class="input1"/>
            </div>
            
            <div class="form-row">
                <label>Apellido Paterno : <b>*</b></label>
                <input type="text" name="jugador.aPaternoJugador" value="<s:property value="equipo.nombreEquipo"/>" class="input1"/>
            </div>
            
            <div class="form-row">
                <label>Apellido Materno : <b>*</b></label>
                <input type="text" name="jugador.aMaternoJugador" value="<s:property value="equipo.nombreEquipo"/>" class="input1"/>
            </div>
            
            <div class="form-row">
                <label>C.I. : <b>*</b></label>
                <input type="text" name="jugador.ciJugador" value="<s:property value="equipo.nombreEquipo"/>" class="input1"/>
            </div>
            
            <div class="form-row">
                <label>Matricula: <b>*</b></label>
                <input type="text" name="jugador.matriculaJugador" value="<s:property value="equipo.presidenteEquipo"/>" class="input1"/>
            </div>
            
            <div class="form-row">
                <label>Fecha de Nacimiento: <b>*</b></label>
                <input type="text" onkeypress="return false;" id="fecha" name="date" class="input1" value="<s:property value="jugador.fechaNacimientoJugador"/>"/>
            </div>
            
            <div class="form-row">
                <label></label>
                <input type="submit" class="button save" value="<s:property value="accion"/>"/>
            </div>
        </s:form>
        </div>    
        </div>
        <div class="regis-b-c"/>
        </div>
        </div>
        </div>
        </div>    
        <script type="text/javascript">
            jQuery(document).ready(function(){
                jQuery("#fecha").datepicker();
            });
        </script>
        <jsp:include page="/resources/template/footer.jsp"/>
    </body>
</html>