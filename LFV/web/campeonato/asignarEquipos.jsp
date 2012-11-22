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
                var t;
		jQuery(function() {
			t = jQuery('#test').bootstrapTransfer(
				{'target_id': 'multi-select-input',
				 'height': '15em',
				 'hilite_selection': true});
			
			t.populate([
				{value:"1", content:"Universitario"},
				{value:"2", content:"Busch Junior"},
				{value:"3", content:"The Strongest"},
				{value:"4", content:"Milan"},
				{value:"5", content:"Amanecer"}
			]);
			t.set_values(["2", "4"]);
			//console.log(t.get_values());
		});
		jQuery(".test").click(function(){
			console.log(t.get_values());
		});
            });
        </script>
        <jsp:include page="/resources/template/footer.jsp"/>
    </body>
</html>
