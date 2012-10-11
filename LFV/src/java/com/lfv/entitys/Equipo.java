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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "equipo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Equipo.findAll", query = "SELECT e FROM Equipo e"),
    @NamedQuery(name = "Equipo.findByIdEquipo", query = "SELECT e FROM Equipo e WHERE e.idEquipo = :idEquipo"),
    @NamedQuery(name = "Equipo.findByNombreEquipo", query = "SELECT e FROM Equipo e WHERE e.nombreEquipo = :nombreEquipo"),
    @NamedQuery(name = "Equipo.findByFundacionEquipo", query = "SELECT e FROM Equipo e WHERE e.fundacionEquipo = :fundacionEquipo"),
    @NamedQuery(name = "Equipo.findByPresidenteEquipo", query = "SELECT e FROM Equipo e WHERE e.presidenteEquipo = :presidenteEquipo")})
public class Equipo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_equipo")
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "seq_equipo")
    @SequenceGenerator(name="seq_equipo", sequenceName = "seq_equipo", allocationSize=1)
    private Long idEquipo;
    @Column(name = "nombre_equipo")
    private String nombreEquipo;
    @Column(name = "fundacion_equipo")
    @Temporal(TemporalType.DATE)
    private Date fundacionEquipo;
    @Column(name = "presidente_equipo")
    private String presidenteEquipo;
    @JoinColumn(name = "id_categoria", referencedColumnName = "id_categoria")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Categoria idCategoria;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEquipo", fetch = FetchType.LAZY)
    private List<JugadorAsignado> jugadorAsignadoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEquipo", fetch = FetchType.LAZY)
    private List<Inscritos> inscritosList;

    public Equipo() {
    }

    public Equipo(Long idEquipo) {
        this.idEquipo = idEquipo;
    }

    public Long getIdEquipo() {
        return idEquipo;
    }

    public void setIdEquipo(Long idEquipo) {
        this.idEquipo = idEquipo;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public Date getFundacionEquipo() {
        return fundacionEquipo;
    }

    public void setFundacionEquipo(Date fundacionEquipo) {
        this.fundacionEquipo = fundacionEquipo;
    }

    public String getPresidenteEquipo() {
        return presidenteEquipo;
    }

    public void setPresidenteEquipo(String presidenteEquipo) {
        this.presidenteEquipo = presidenteEquipo;
    }

    public Categoria getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Categoria idCategoria) {
        this.idCategoria = idCategoria;
    }

    @XmlTransient
    public List<JugadorAsignado> getJugadorAsignadoList() {
        return jugadorAsignadoList;
    }

    public void setJugadorAsignadoList(List<JugadorAsignado> jugadorAsignadoList) {
        this.jugadorAsignadoList = jugadorAsignadoList;
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
        hash += (idEquipo != null ? idEquipo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Equipo)) {
            return false;
        }
        Equipo other = (Equipo) object;
        if ((this.idEquipo == null && other.idEquipo != null) || (this.idEquipo != null && !this.idEquipo.equals(other.idEquipo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.lfv.entitys.Equipo[ idEquipo=" + idEquipo + " ]";
    }
    
}
