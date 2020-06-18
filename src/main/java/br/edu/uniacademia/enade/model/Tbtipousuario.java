/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.uniacademia.enade.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author C.Tiago
 */
@Entity
@Table(name = "tbtipousuario")
@NamedQueries({
    @NamedQuery(name = "Tbtipousuario.findAll", query = "SELECT t FROM Tbtipousuario t"),
    @NamedQuery(name = "Tbtipousuario.findByIdTipoUsuario", query = "SELECT t FROM Tbtipousuario t WHERE t.idTipoUsuario = :idTipoUsuario"),
    @NamedQuery(name = "Tbtipousuario.findByNomeTipoUsuario", query = "SELECT t FROM Tbtipousuario t WHERE t.nomeTipoUsuario = :nomeTipoUsuario")})
public class Tbtipousuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idTipoUsuario")
    private Integer idTipoUsuario;
    @Size(max = 45)
    @Column(name = "nomeTipoUsuario")
    private String nomeTipoUsuario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tbTipoUsuarioidTipoUsuario")
    private List<Tbusuario> tbusuarioList;

    public Tbtipousuario() {
    }

    public Tbtipousuario(Integer idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }

    public Integer getIdTipoUsuario() {
        return idTipoUsuario;
    }

    public void setIdTipoUsuario(Integer idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }

    public String getNomeTipoUsuario() {
        return nomeTipoUsuario;
    }

    public void setNomeTipoUsuario(String nomeTipoUsuario) {
        this.nomeTipoUsuario = nomeTipoUsuario;
    }

    public List<Tbusuario> getTbusuarioList() {
        return tbusuarioList;
    }

    public void setTbusuarioList(List<Tbusuario> tbusuarioList) {
        this.tbusuarioList = tbusuarioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoUsuario != null ? idTipoUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tbtipousuario)) {
            return false;
        }
        Tbtipousuario other = (Tbtipousuario) object;
        if ((this.idTipoUsuario == null && other.idTipoUsuario != null) || (this.idTipoUsuario != null && !this.idTipoUsuario.equals(other.idTipoUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.edu.uniacademia.enade.model.Tbtipousuario[ idTipoUsuario=" + idTipoUsuario + " ]";
    }
    
}
