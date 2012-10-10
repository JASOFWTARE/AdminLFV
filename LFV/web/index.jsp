<%@ taglib prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Liga de Futbol Vinto</title>
        <jsp:include page="resources/template/head.jsp"/>
    </head>
    <body>
        <jsp:include page="resources/template/header.jsp"/>
        <div id="middle">
                <div id="middleWrap">
                    <div class="regisLeftContent">
                        <div id="registrationContent">
                            <div class="regis-t-c"></div>
                            <div id="regis_body" class="regis-body">
                                <h1>Menu Principal</h1>
                                <a href="CrearActualizarEquipo">Crear Actualizar Equipo</a>
                            </div>    
                        </div>
                        <div class="regis-b-c"/>
                    </div>
                </div>
            </div>
        </div>    
        <jsp:include page="resources/template/footer.jsp"/>
    </body>
</html>
