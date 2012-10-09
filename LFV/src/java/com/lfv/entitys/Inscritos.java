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
@Table(name = "inscritos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Inscritos.findAll", query = "SELECT i FROM Inscritos i"),
    @NamedQuery(name = "Inscritos.findByIdInscritos", query = "SELECT i FROM Inscritos i WHERE i.idInscritos = :idInscritos"),
    @NamedQuery(name = "Inscritos.findByFechaInscripcion", query = "SELECT i FROM Inscritos i WHERE i.fechaInscripcion = :fechaInscripcion")})
public class Inscritos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_inscritos")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "seq_inscritos")
    @SequenceGenerator(name="seq_inscritos", sequenceName = "seq_inscritos")
    private Long idInscritos;
    @Column(name = "fecha_inscripcion")
    @Temporal(TemporalType.DATE)
    private Date fechaInscripcion;
    @JoinColumn(name = "id_equipo", referencedColumnName = "id_equipo")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Equipo idEquipo;
    @JoinColumn(name = "id_campeonato", referencedColumnName = "id_campeonato")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Campeonato idCampeonato;

    public Inscritos() {
    }

    public Inscritos(Long idInscritos) {
        this.idInscritos = idInscritos;
    }

    public Long getIdInscritos() {
        return idInscritos;
    }

    public void setIdInscritos(Long idInscritos) {
        this.idInscritos = idInscritos;
    }

    public Date getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(Date fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    public Equipo getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(Equipo idEquipo) {
        this.idEquipo = idEquipo;
    }

    public Campeonato getIdCampeonato() {
        return idCampeonato;
    }

    public void setIdCampeonato(Campeonato idCampeonato) {
        this.idCampeonato = idCampeonato;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idInscritos != null ? idInscritos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Inscritos)) {
            return false;
        }
        Inscritos other = (Inscritos) object;
        if ((this.idInscritos == null && other.idInscritos != null) || (this.idInscritos != null && !this.idInscritos.equals(other.idInscritos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.lfv.entitys.Inscritos[ idInscritos=" + idInscritos + " ]";
    }
    
}
