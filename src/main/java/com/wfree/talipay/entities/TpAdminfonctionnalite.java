/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wfree.talipay.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author EUC
 */
@Entity
@Table(name = "tp_adminfonctionnalite", catalog = "bd_talipay", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TpAdminfonctionnalite.findAll", query = "SELECT t FROM TpAdminfonctionnalite t")
    , @NamedQuery(name = "TpAdminfonctionnalite.findById", query = "SELECT t FROM TpAdminfonctionnalite t WHERE t.id = :id")
    , @NamedQuery(name = "TpAdminfonctionnalite.findByStatut", query = "SELECT t FROM TpAdminfonctionnalite t WHERE t.statut = :statut")
    , @NamedQuery(name = "TpAdminfonctionnalite.findByAfDateCreate", query = "SELECT t FROM TpAdminfonctionnalite t WHERE t.afDateCreate = :afDateCreate")})
public class TpAdminfonctionnalite implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "statut")
    private Short statut;
    @Column(name = "afDateCreate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date afDateCreate;
    @JoinColumn(name = "admId", referencedColumnName = "admId", nullable = false)
    @ManyToOne(optional = false)
    private TpAdministrateur admId;
    @JoinColumn(name = "fnCode", referencedColumnName = "fnCode", nullable = false)
    @ManyToOne(optional = false)
    private TpFonctionnalite fnCode;

    public TpAdminfonctionnalite() {
    }

    public TpAdminfonctionnalite(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Short getStatut() {
        return statut;
    }

    public void setStatut(Short statut) {
        this.statut = statut;
    }

    public Date getAfDateCreate() {
        return afDateCreate;
    }

    public void setAfDateCreate(Date afDateCreate) {
        this.afDateCreate = afDateCreate;
    }

    public TpAdministrateur getAdmId() {
        return admId;
    }

    public void setAdmId(TpAdministrateur admId) {
        this.admId = admId;
    }

    public TpFonctionnalite getFnCode() {
        return fnCode;
    }

    public void setFnCode(TpFonctionnalite fnCode) {
        this.fnCode = fnCode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TpAdminfonctionnalite)) {
            return false;
        }
        TpAdminfonctionnalite other = (TpAdminfonctionnalite) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wfree.talipay.entities.TpAdminfonctionnalite[ id=" + id + " ]";
    }
    
}
