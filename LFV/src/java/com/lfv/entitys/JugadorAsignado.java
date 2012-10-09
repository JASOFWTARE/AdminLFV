/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lfv.entitys;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author JONATHAN
 */
@Entity
@Table(name = "jugador_asignado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "JugadorAsignado.findAll", query = "SELECT j FROM JugadorAsignado j"),
    @NamedQuery(name = "JugadorAsignado.findByIdJugadorAsignado", query = "SELECT j FROM JugadorAsignado j WHERE j.idJugadorAsignado = :idJugadorAsignado"),
    @NamedQuery(name = "JugadorAsignado.findByFechaAsignacion", query = "SELECT j FROM JugadorAsignado j WHERE j.fechaAsignacion = :fechaAsignacion"),
    @NamedQuery(name = "JugadorAsignado.findByEstadoJugador", query = "SELECT j FROM JugadorAsignado j WHERE j.estadoJugador = :estadoJugador")})
public class JugadorAsignado implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_jugador_asignado")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "seq_jugador_asignado")
    @SequenceGenerator(name="seq_jugador_asignado", sequenceName = "seq_jugador_asignado")
    private Long idJugadorAsignado;
    @Column(name = "fecha_asignacion")
    @Temporal(TemporalType.DATE)
    private Date fechaAsignacion;
    @Column(name = "estado_jugador")
    private Boolean estadoJugador;
    @JoinColumn(name = "id_jugador", referencedColumnName = "id_jugador")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Jugador idJugador;
    @JoinColumn(name = "id_equipo", referencedColumnName = "id_equipo")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Equipo idEquipo;

    public JugadorAsignado() {
    }

    public JugadorAsignado(Long idJugadorAsignado) {
        this.idJugadorAsignado = idJugadorAsignado;
    }

    public Long getIdJugadorAsignado() {
        return idJugadorAsignado;
    }

    public void setIdJugadorAsignado(Long idJugadorAsignado) {
        this.idJugadorAsignado = idJugadorAsignado;
    }

    public Date getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(Date fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }

    public Boolean getEstadoJugador() {
        return estadoJugador;
    }

    public void setEstadoJugador(Boolean estadoJugador) {
        this.estadoJugador = estadoJugador;
    }

    public Jugador getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(Jugador idJugador) {
        this.idJugador = idJugador;
    }

    public Equipo getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(Equipo idEquipo) {
        this.idEquipo = idEquipo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idJugadorAsignado != null ? idJugadorAsignado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof JugadorAsignado)) {
            return false;
        }
        JugadorAsignado other = (JugadorAsignado) object;
        if ((this.idJugadorAsignado == null && other.idJugadorAsignado != null) || (this.idJugadorAsignado != null && !this.idJugadorAsignado.equals(other.idJugadorAsignado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.lfv.entitys.JugadorAsignado[ idJugadorAsignado=" + idJugadorAsignado + " ]";
    }
    
}
