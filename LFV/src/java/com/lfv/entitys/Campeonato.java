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
@Table(name = "campeonato")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Campeonato.findAll", query = "SELECT c FROM Campeonato c"),
    @NamedQuery(name = "Campeonato.findByIdCampeonato", query = "SELECT c FROM Campeonato c WHERE c.idCampeonato = :idCampeonato"),
    @NamedQuery(name = "Campeonato.findByNombreCampeonato", query = "SELECT c FROM Campeonato c WHERE c.nombreCampeonato = :nombreCampeonato"),
    @NamedQuery(name = "Campeonato.findByInicioCampeonato", query = "SELECT c FROM Campeonato c WHERE c.inicioCampeonato = :inicioCampeonato"),
    @NamedQuery(name = "Campeonato.findByFinCampeonato", query = "SELECT c FROM Campeonato c WHERE c.finCampeonato = :finCampeonato"),
    @NamedQuery(name = "Campeonato.findByGestionCampeonato", query = "SELECT c FROM Campeonato c WHERE c.gestionCampeonato = :gestionCampeonato"),
    @NamedQuery(name = "Campeonato.findByEstadoCampeonato", query = "SELECT c FROM Campeonato c WHERE c.estadoCampeonato = :estadoCampeonato"),
    @NamedQuery(name = "Campeonato.findByLimiteHabilitacionCampeonato", query = "SELECT c FROM Campeonato c WHERE c.limiteHabilitacionCampeonato = :limiteHabilitacionCampeonato")})
public class Campeonato implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_campeonato")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "seq_campeonato")
    @SequenceGenerator(name="seq_campeonato", sequenceName = "seq_campeonato")
    private Long idCampeonato;
    @Column(name = "nombre_campeonato")
    private String nombreCampeonato;
    @Column(name = "inicio_campeonato")
    @Temporal(TemporalType.DATE)
    private Date inicioCampeonato;
    @Column(name = "fin_campeonato")
    @Temporal(TemporalType.DATE)
    private Date finCampeonato;
    @Column(name = "gestion_campeonato")
    private String gestionCampeonato;
    @Column(name = "estado_campeonato")
    private Boolean estadoCampeonato;
    @Column(name = "limite_habilitacion_campeonato")
    @Temporal(TemporalType.DATE)
    private Date limiteHabilitacionCampeonato;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCampeonato", fetch = FetchType.LAZY)
    private List<Inscritos> inscritosList;

    public Campeonato() {
    }

    public Campeonato(Long idCampeonato) {
        this.idCampeonato = idCampeonato;
    }

    public Long getIdCampeonato() {
        return idCampeonato;
    }

    public void setIdCampeonato(Long idCampeonato) {
        this.idCampeonato = idCampeonato;
    }

    public String getNombreCampeonato() {
        return nombreCampeonato;
    }

    public void setNombreCampeonato(String nombreCampeonato) {
        this.nombreCampeonato = nombreCampeonato;
    }

    public Date getInicioCampeonato() {
        return inicioCampeonato;
    }

    public void setInicioCampeonato(Date inicioCampeonato) {
        this.inicioCampeonato = inicioCampeonato;
    }

    public Date getFinCampeonato() {
        return finCampeonato;
    }

    public void setFinCampeonato(Date finCampeonato) {
        this.finCampeonato = finCampeonato;
    }

    public String getGestionCampeonato() {
        return gestionCampeonato;
    }

    public void setGestionCampeonato(String gestionCampeonato) {
        this.gestionCampeonato = gestionCampeonato;
    }

    public Boolean getEstadoCampeonato() {
        return estadoCampeonato;
    }

    public void setEstadoCampeonato(Boolean estadoCampeonato) {
        this.estadoCampeonato = estadoCampeonato;
    }

    public Date getLimiteHabilitacionCampeonato() {
        return limiteHabilitacionCampeonato;
    }

    public void setLimiteHabilitacionCampeonato(Date limiteHabilitacionCampeonato) {
        this.limiteHabilitacionCampeonato = limiteHabilitacionCampeonato;
    }

    @XmlTransient
    public List<Inscritos> getInscritosList() {
        return inscritosList;
    }

    public void setInscritosList(List<Inscritos> inscritosList) {
        this.inscritosList = inscritosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCampeonato != null ? idCampeonato.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Campeonato)) {
            return false;
        }
        Campeonato other = (Campeonato) object;
        if ((this.idCampeonato == null && other.idCampeonato != null) || (this.idCampeonato != null && !this.idCampeonato.equals(other.idCampeonato))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.lfv.entitys.Campeonato[ idCampeonato=" + idCampeonato + " ]";
    }
    
}
