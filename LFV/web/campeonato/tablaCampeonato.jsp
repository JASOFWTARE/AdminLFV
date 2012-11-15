<%@ taglib prefix="s" uri="/struts-tags" %>
<div class="filaCabezera">
    <div class="cabezeraList"><strong>Nombre</strong></div>
    <div class="cabezeraList"><strong>Inicio</strong></div>    
    <div class="cabezeraList"><strong>Estado</strong></div>    
    <div class="cabezeraAcciones"><strong>Acciones</strong></div>    
</div>
<s:iterator value="campeonatoList">
    <div class="fila">
    <div class="cabezeraList">
        <s:property value="nombreCampeonato"/>
    </div>
    <div class="cabezeraList">
        <s:property value="inicioCampeonato"/>
    </div>
    <div class="cabezeraList">
        <s:if test="estadoCampeonato">
            <img src="resources/images/checked.png"/>
        </s:if>
        <s:else>
            <img src="resources/images/editdelete.png"/>
        </s:else>
    </div>
    <div class="cabezeraAcciones">
        <a href='CampeonatoAction?idCampeonato=<s:property value="idCampeonato"/>'><img src="resources/images/edit.png"></a>
        <a href='CampeonatoAction!cerrarCampeonato?idCampeonato=<s:property value="idCampeonato"/>'><img src="resources/images/delete.png"></a>
    </div>
    </div>
</s:iterator>