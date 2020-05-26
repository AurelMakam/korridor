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
@Table(name = "tp_fonctionfonctionnalite", catalog = "bd_talipay", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TpFonctionfonctionnalite.findAll", query = "SELECT t FROM TpFonctionfonctionnalite t")
    , @NamedQuery(name = "TpFonctionfonctionnalite.findById", query = "SELECT t FROM TpFonctionfonctionnalite t WHERE t.id = :id")
    , @NamedQuery(name = "TpFonctionfonctionnalite.findByStatut", query = "SELECT t FROM TpFonctionfonctionnalite t WHERE t.statut = :statut")
    , @NamedQuery(name = "TpFonctionfonctionnalite.findByFfDateCreate", query = "SELECT t FROM TpFonctionfonctionnalite t WHERE t.ffDateCreate = :ffDateCreate")})
public class TpFonctionfonctionnalite implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "statut")
    private Short statut;
    @Column(name = "ffDateCreate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ffDateCreate;
    @JoinColumn(name = "fctCode", referencedColumnName = "fctCode", nullable = false)
    @ManyToOne(optional = false)
    private TpFonction fctCode;
    @JoinColumn(name = "fnCode", referencedColumnName = "fnCode", nullable = false)
    @ManyToOne(optional = false)
    private TpFonctionnalite fnCode;

    public TpFonctionfonctionnalite() {
    }

    public TpFonctionfonctionnalite(Long id) {
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

    public Date getFfDateCreate() {
        return ffDateCreate;
    }

    public void setFfDateCreate(Date ffDateCreate) {
        this.ffDateCreate = ffDateCreate;
    }

    public TpFonction getFctCode() {
        return fctCode;
    }

    public void setFctCode(TpFonction fctCode) {
        this.fctCode = fctCode;
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
        if (!(object instanceof TpFonctionfonctionnalite)) {
            return false;
        }
        TpFonctionfonctionnalite other = (TpFonctionfonctionnalite) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wfree.talipay.entities.TpFonctionfonctionnalite[ id=" + id + " ]";
    }
    
}
