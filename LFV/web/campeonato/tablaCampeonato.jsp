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
        <s:if test="estadoCampeonato">
            <a href='CampeonatoAction?idCampeonato=<s:property value="idCampeonato"/>'><img title="Modificar Campeonato" src="resources/images/edit.png"></a>
            <a href='AsignarEquipos?idCampeonato=<s:property value="idCampeonato"/>'><img title="Asignar Equipos" src="resources/images/more.jpg"></a>
            <a href='AsignarJugadores?idCampeonato=<s:property value="idCampeonato"/>'><img title="Asignar Jugadores" src="resources/images/groups-icon.png"></a>
            <a href='CampeonatoAction!cerrarCampeonato?idCampeonato=<s:property value="idCampeonato"/>'><img title="Cerrar Campeonato" src="resources/images/delete.png"></a>
        </s:if>
    </div>
    </div>
</s:iterator>