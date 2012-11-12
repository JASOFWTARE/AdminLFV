<%@ taglib prefix="s" uri="/struts-tags" %>
<div class="filaCabezera">
    <div class="cabezeraList"><strong>Nombres</strong></div>
    <div class="cabezeraList"><strong>Fecha</strong></div>    
    <div class="cabezeraList"><strong>CI</strong></div>    
    <div class="cabezeraAcciones"><strong>Acciones</strong></div>    
</div>
<s:iterator value="jugadorList">
    <div class="fila">
    <div class="cabezeraList">
        <s:property value="nombreJugador"/>
    </div>
    <div class="cabezeraList">
        <s:property value="fechaNacimientoJugador"/>
    </div>
    <div class="cabezeraList">
        <s:property value="ciJugador"/>
    </div>
    <div class="cabezeraAcciones">
        <a href="JugadorAction?idJugador=<s:property value="idJugador"/>"><img src="resources/images/edit.png"></a>
        <a href="JugadorAction!eliminarJugador?idJugador=<s:property value="idJugador"/>"><img src="resources/images/delete.png"></a>
    </div>
    </div>
</s:iterator>
<script type="text/javascript">
    jQuery(document).ready(function(){
        jQuery("#filtro").change(function(){
            var data = "jugador=" + jQuery(this).val();
            var action = "JugadorAction!refreshJugador";
            consultaAjax(data, action, "#tabla")
        });
    });
</script>