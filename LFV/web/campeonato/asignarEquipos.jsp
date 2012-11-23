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
        <h1>Campeonato test</h1>
        <div class="links">
            <a href="CampeonatoAction!listaCampeonatos"><<  Lista de Campeonatos</a>
        </div>
        <s:form id="asignarEquipos" action="AsignarEquipos!actualizarEquipos">
            <s:hidden id="idCampeonato" name="idCampeonato" value="%{idCampeonato}"/>
            <s:hidden id="inscritosIds" name="inscritosIds" value="%{inscritosIds}"/>
            <div class="form-row">
                <label>Fecha Incripcion : <b>*</b></label>
                <input type="text" onkeypress="return false;" id="fechaInscripcion" name="fechaInscripcion" class="input1" value="<s:property value="fechaInscripcion"/>"/>
            </div>
            <div class="form-row">
                <label>Asignar Equipos : <b>*</b></label>
            </div>
            
            <div id="test" style="width:400px; margin-left: 135px; margin-bottom: 30px;">
            </div>
            
            <div class="form-row">
                <label></label>
                <input type="submit" class="button save margin" value="Inscribir"/>
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
                jQuery("#asignarEquipos").validate({
                    rules : {
                        fechaInscripcion : "required"
                    }
                });
                
                jQuery("#fechaInscripcion").datepicker();
                var t;
                var array = [];
                <s:iterator value="equipoList">
                    var obj = {
                        value: <s:property value="idEquipo"/>,
                        content: '<s:property value="nombreEquipo"/>'
                    };
                    array.push(obj);
                </s:iterator>
		jQuery(function() {
                    t = jQuery('#test').bootstrapTransfer(
                            {'target_id': 'multi-select-input',
                                'height': '15em',
                                'hilite_selection': true});
                    t.populate(array);
		});
                
                jQuery("#asignarEquipos").submit(function (){
                    
                    return false;
                });
            });
        </script>
        <jsp:include page="/resources/template/footer.jsp"/>
    </body>
</html>
