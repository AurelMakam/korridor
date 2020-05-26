/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wfree.talipay.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author EUC
 */
@Entity
@Table(name = "tp_module", catalog = "bd_talipay", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TpModule.findAll", query = "SELECT t FROM TpModule t")
    , @NamedQuery(name = "TpModule.findByModCode", query = "SELECT t FROM TpModule t WHERE t.modCode = :modCode")
    , @NamedQuery(name = "TpModule.findByModDescription", query = "SELECT t FROM TpModule t WHERE t.modDescription = :modDescription")
    , @NamedQuery(name = "TpModule.findByStatut", query = "SELECT t FROM TpModule t WHERE t.statut = :statut")
    , @NamedQuery(name = "TpModule.findByDateCreation", query = "SELECT t FROM TpModule t WHERE t.dateCreation = :dateCreation")})
public class TpModule implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "modCode", nullable = false, length = 254)
    private String modCode;
    @Column(name = "modDescription", length = 254)
    private String modDescription;
    @Column(name = "statut")
    private Short statut;
    @Column(name = "dateCreation")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreation;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "modCode")
    private List<TpFonctionnalite> tpFonctionnaliteList;

    public TpModule() {
    }

    public TpModule(String modCode) {
        this.modCode = modCode;
    }

    public String getModCode() {
        return modCode;
    }

    public void setModCode(String modCode) {
        this.modCode = modCode;
    }

    public String getModDescription() {
        return modDescription;
    }

    public void setModDescription(String modDescription) {
        this.modDescription = modDescription;
    }

    public Short getStatut() {
        return statut;
    }

    public void setStatut(Short statut) {
        this.statut = statut;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    @XmlTransient
    public List<TpFonctionnalite> getTpFonctionnaliteList() {
        return tpFonctionnaliteList;
    }

    public void setTpFonctionnaliteList(List<TpFonctionnalite> tpFonctionnaliteList) {
        this.tpFonctionnaliteList = tpFonctionnaliteList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (modCode != null ? modCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TpModule)) {
            return false;
        }
        TpModule other = (TpModule) object;
        if ((this.modCode == null && other.modCode != null) || (this.modCode != null && !this.modCode.equals(other.modCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wfree.talipay.entities.TpModule[ modCode=" + modCode + " ]";
    }
    
}
