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
        <h1>Equipo</h1>
        <div class="links">
            <a href="ListaEquipo"><<  Lista de Equipos</a>
        </div>
        <s:form id="equipoForm" action="ActualizarEquipo">
            <input type="hidden" name="accion" value="<s:property value="accion"/>"/>
            <input type="hidden" name="idEquipo" value="<s:property value="idEquipo"/>"/>
            <div class="form-row">
                <label>Nombre Equipo: <b>*</b></label>
                <input type="text" name="equipo.nombreEquipo" value="<s:property value="equipo.nombreEquipo"/>" class="input1"/>
            </div>
            
            <div class="form-row">
                <label>Presidente del Equipo: <b>*</b></label>
                <input type="text" name="equipo.presidenteEquipo" value="<s:property value="equipo.presidenteEquipo"/>" class="input1"/>
            </div>
            
            <div class="form-row">
                <label>Categoria: <b>*</b></label>
                <select name="idCategoria">
                    <s:iterator value="categoriaList">
                        <option value="<s:property value="idCategoria"/>"><s:property value="nombreCategoria"/></option>
                    </s:iterator>
                </select>
                
            </div>
            
            <div class="form-row">
                <label>Fecha Fundacion: <b>*</b></label>
                <input type="text" onkeypress="return false;" id="fecha" name="date" class="input1" value="<s:property value="equipo.fundacionEquipo"/>"/>
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
                jQuery("#fecha").datepicker();
                jQuery("#equipoForm").validate({
                    rules : {
                        'equipo.nombreEquipo' : "required",
                        'equipo.presidenteEquipo' : "required",
                        'date' : "required"
                    }
                });
            });
        </script>
        <jsp:include page="/resources/template/footer.jsp"/>
    </body>
</html>
