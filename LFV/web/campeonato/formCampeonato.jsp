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
        <h1>Campeonato</h1>
        <div class="links">
            <a href="CampeonatoAction!listaCampeonatos"><<  Lista de Campeonatos</a>
        </div>
        <s:form id="campeonatoForm" action="CampeonatoAction!actualizarCampeonato">
            <input type="hidden" name="accion" value="<s:property value="accion"/>"/>
            <input type="hidden" name="idCampeonato" value="<s:property value="idCampeonato"/>"/>
            <div class="form-row">
                <label>Nombre : <b>*</b></label>
                <input type="text" name="campeonato.nombreCampeonato" value="<s:property value="campeonato.nombreCampeonato"/>" class="input1"/>
            </div>
            
            <div class="form-row">
                <label>Inicio Campeonato : <b>*</b></label>
                <input type="text" onkeypress="return false;" id="inicioCampeonato" name="inicioCampeonato" class="input1" value="<s:property value="campeonato.inicioCampeonato"/>"/>
            </div>
            
            <div class="form-row">
                <label>Fin Campeonato : </label>
                <input type="text" onkeypress="return false;" id="finCampeonato" name="finCampeonato" class="input1" value="<s:property value="campeonato.finCampeonato"/>"/>
            </div>
            
            <div class="form-row">
                <label>Gestion : <b>*</b></label>
                <input type="text" name="campeonato.gestionCampeonato" value="<s:property value="campeonato.gestionCampeonato"/>" class="input1"/>
            </div>
            
            <div class="form-row">
                <label>Limite Habilitacion: <b>*</b></label>
                <input type="text" onkeypress="return false;" id="limiteHabilitacion" name="limiteHabilitacion" class="input1" value="<s:property value="campeonato.limiteHabilitacionCampeonato"/>"/>
            </div>
            
            <div class="form-row">
                <label></label>
                <input type="submit" class="button save margin" value="<s:property value="accion"/>"/>
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
                jQuery("#inicioCampeonato").datepicker();
                jQuery("#finCampeonato").datepicker();
                jQuery("#limiteHabilitacion").datepicker();
                jQuery("#campeonatoForm").validate({
                    rules : {
                        'campeonato.nombreCampeonato' : "required",
                        inicioCampeonato : "required",
                        finCampeonato : "required",
                        'campeonato.gestionCampeonato' : "required",
                        limiteHabilitacion : "required"
                    }
                });
            });
        </script>
        <jsp:include page="/resources/template/footer.jsp"/>
    </body>
</html>
