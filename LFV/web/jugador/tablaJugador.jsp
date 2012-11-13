<%@ taglib prefix="s" uri="/struts-tags" %>
<div class="filaCabezera">
    <div class="cabezeraList"><strong>Nombres</strong></div>
    <div class="cabezeraList"><strong>Apellidos</strong></div>    
    <div class="cabezeraList"><strong>CI</strong></div>    
    <div class="cabezeraAcciones"><strong>Acciones</strong></div>    
</div>
<s:iterator value="jugadorList">
    <div class="fila">
    <div class="cabezeraList">
        <s:property value="nombreJugador"/>
    </div>
    <div class="cabezeraList">
        <s:property value="apellidos"/>
    </div>
    <div class="cabezeraList">
        <s:property value="ciJugador"/>
    </div>
    <div class="cabezeraAcciones">
        <a href='JugadorAction?idJugador=<s:property value="idJugador"/>'><img src="resources/images/edit.png"></a>
        <s:if test="estadoJugador">
            <a href='JugadorAction!eliminarJugador?idJugador=<s:property value="idJugador"/>'><img src="resources/images/delete.png"></a>
        </s:if>
        <s:else>
        <a href='JugadorAction!eliminarJugador?idJugador=<s:property value="idJugador"/>'><img src="resources/images/add.png"></a>
        </s:else>
        
    </div>
    </div>
</s:iterator>