/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lfv.entitys;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author JONATHAN
 */
@Entity
@Table(name = "jugador")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Jugador.findAll", query = "SELECT j FROM Jugador j"),
    @NamedQuery(name = "Jugador.findByIdJugador", query = "SELECT j FROM Jugador j WHERE j.idJugador = :idJugador"),
    @NamedQuery(name = "Jugador.findByNombreJugador", query = "SELECT j FROM Jugador j WHERE j.nombreJugador = :nombreJugador"),
    @NamedQuery(name = "Jugador.findByAPaternoJugador", query = "SELECT j FROM Jugador j WHERE j.aPaternoJugador = :aPaternoJugador"),
    @NamedQuery(name = "Jugador.findByAMaternoJugador", query = "SELECT j FROM Jugador j WHERE j.aMaternoJugador = :aMaternoJugador"),
    @NamedQuery(name = "Jugador.findByMatriculaJugador", query = "SELECT j FROM Jugador j WHERE j.matriculaJugador = :matriculaJugador"),
    @NamedQuery(name = "Jugador.findByFechaNacimientoJugador", query = "SELECT j FROM Jugador j WHERE j.fechaNacimientoJugador = :fechaNacimientoJugador"),
    @NamedQuery(name = "Jugador.findByCiJugador", query = "SELECT j FROM Jugador j WHERE j.ciJugador = :ciJugador"),
    @NamedQuery(name = "Jugador.findByEstadoJugador", query = "SELECT j FROM Jugador j WHERE j.estadoJugador = :estadoJugador")})
public class Jugador implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_jugador")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "seq_jugador")
    @SequenceGenerator(name="seq_jugador", sequenceName = "seq_jugador")
    private Long idJugador;
    @Column(name = "nombre_jugador")
    private String nombreJugador;
    @Column(name = "a_paterno_jugador")
    private String aPaternoJugador;
    @Column(name = "a_materno_jugador")
    private String aMaternoJugador;
    @Column(name = "matricula_jugador")
    private Integer matriculaJugador;
    @Column(name = "fecha_nacimiento_jugador")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimientoJugador;
    @Column(name = "ci_jugador")
    private String ciJugador;
    @Column(name = "estado_jugador")
    private String estadoJugador;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idJugador", fetch = FetchType.LAZY)
    private List<JugadorAsignado> jugadorAsignadoList;

    public Jugador() {
    }

    public Jugador(Long idJugador) {
        this.idJugador = idJugador;
    }

    public Long getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(Long idJugador) {
        this.idJugador = idJugador;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public String getAPaternoJugador() {
        return aPaternoJugador;
    }

    public void setAPaternoJugador(String aPaternoJugador) {
        this.aPaternoJugador = aPaternoJugador;
    }

    public String getAMaternoJugador() {
        return aMaternoJugador;
    }

    public void setAMaternoJugador(String aMaternoJugador) {
        this.aMaternoJugador = aMaternoJugador;
    }

    public Integer getMatriculaJugador() {
        return matriculaJugador;
    }

    public void setMatriculaJugador(Integer matriculaJugador) {
        this.matriculaJugador = matriculaJugador;
    }

    public Date getFechaNacimientoJugador() {
        return fechaNacimientoJugador;
    }

    public void setFechaNacimientoJugador(Date fechaNacimientoJugador) {
        this.fechaNacimientoJugador = fechaNacimientoJugador;
    }

    public String getCiJugador() {
        return ciJugador;
    }

    public void setCiJugador(String ciJugador) {
        this.ciJugador = ciJugador;
    }

    public String getEstadoJugador() {
        return estadoJugador;
    }

    public void setEstadoJugador(String estadoJugador) {
        this.estadoJugador = estadoJugador;
    }

    @XmlTransient
    public List<JugadorAsignado> getJugadorAsignadoList() {
        return jugadorAsignadoList;
    }

    public void setJugadorAsignadoList(List<JugadorAsignado> jugadorAsignadoList) {
        this.jugadorAsignadoList = jugadorAsignadoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idJugador != null ? idJugador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Jugador)) {
            return false;
        }
        Jugador other = (Jugador) object;
        if ((this.idJugador == null && other.idJugador != null) || (this.idJugador != null && !this.idJugador.equals(other.idJugador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.lfv.entitys.Jugador[ idJugador=" + idJugador + " ]";
    }
    
}
