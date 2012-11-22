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
        <s:form id="campeonatoForm" action="CampeonatoAction!actualizarCampeonato">
            <div id="test" style="width:400px">
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
                var t;
//                jQuery("#inicioCampeonato").datepicker();
//                jQuery("#finCampeonato").datepicker();
//                jQuery("#limiteHabilitacion").datepicker();
//                jQuery("#campeonatoForm").validate({
//                    rules : {
//                        'campeonato.nombreCampeonato' : "required",
//                        inicioCampeonato : "required",
//                        finCampeonato : "required",
//                        'campeonato.gestionCampeonato' : "required",
//                        limiteHabilitacion : "required"
//                    }
//                });
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
		jQuery(".test").click(function(){
			console.log(t.get_values());
		});
            });
        </script>
        <jsp:include page="/resources/template/footer.jsp"/>
    </body>
</html>
