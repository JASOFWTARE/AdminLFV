<%@ taglib prefix="s" uri="/struts-tags" %>
<div class="filaCabezera">
    <div class="cabezeraList"><strong>Nombre</strong></div>
    <div class="cabezeraList"><strong>Fundacion</strong></div>    
    <div class="cabezeraList"><strong>Categoria</strong></div>    
    <div class="cabezeraAcciones"><strong>Acciones</strong></div>    
</div>
<s:iterator value="equipoList">
    <div class="fila">
    <div class="cabezeraList">
        <s:property value="nombreEquipo"/>
    </div>
    <div class="cabezeraList">
        <s:property value="fundacionEquipo"/>
    </div>
    <div class="cabezeraList">
        <s:property value="idCategoria.nombreCategoria"/>
    </div>
    <div class="cabezeraAcciones">
        <a href="CrearActualizarEquipo?idEquipo=<s:property value="idEquipo"/>"><img src="resources/images/edit.png"></a>
        <a href="EliminarEquipo?idEquipo=<s:property value="idEquipo"/>"><img src="resources/images/delete.png"></a>
    </div>
    </div>
</s:iterator>