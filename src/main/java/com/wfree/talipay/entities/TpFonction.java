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
@Table(name = "tp_fonction", catalog = "bd_talipay", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TpFonction.findAll", query = "SELECT t FROM TpFonction t")
    , @NamedQuery(name = "TpFonction.findByFctCode", query = "SELECT t FROM TpFonction t WHERE t.fctCode = :fctCode")
    , @NamedQuery(name = "TpFonction.findByFctUrlAccueil", query = "SELECT t FROM TpFonction t WHERE t.fctUrlAccueil = :fctUrlAccueil")
    , @NamedQuery(name = "TpFonction.findByFctDescription", query = "SELECT t FROM TpFonction t WHERE t.fctDescription = :fctDescription")
    , @NamedQuery(name = "TpFonction.findByFctOrdre", query = "SELECT t FROM TpFonction t WHERE t.fctOrdre = :fctOrdre")
    , @NamedQuery(name = "TpFonction.findByStatut", query = "SELECT t FROM TpFonction t WHERE t.statut = :statut")
    , @NamedQuery(name = "TpFonction.findByDateCreate", query = "SELECT t FROM TpFonction t WHERE t.dateCreate = :dateCreate")})
public class TpFonction implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "fctCode", nullable = false, length = 254)
    private String fctCode;
    @Column(name = "fctUrlAccueil", length = 254)
    private String fctUrlAccueil;
    @Column(name = "fctDescription", length = 254)
    private String fctDescription;
    @Column(name = "fctOrdre")
    private Integer fctOrdre;
    @Column(name = "statut")
    private Short statut;
    @Column(name = "dateCreate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreate;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fctCode")
    private List<TpFonctionfonctionnalite> tpFonctionfonctionnaliteList;

    public TpFonction() {
    }

    public TpFonction(String fctCode) {
        this.fctCode = fctCode;
    }

    public String getFctCode() {
        return fctCode;
    }

    public void setFctCode(String fctCode) {
        this.fctCode = fctCode;
    }

    public String getFctUrlAccueil() {
        return fctUrlAccueil;
    }

    public void setFctUrlAccueil(String fctUrlAccueil) {
        this.fctUrlAccueil = fctUrlAccueil;
    }

    public String getFctDescription() {
        return fctDescription;
    }

    public void setFctDescription(String fctDescription) {
        this.fctDescription = fctDescription;
    }

    public Integer getFctOrdre() {
        return fctOrdre;
    }

    public void setFctOrdre(Integer fctOrdre) {
        this.fctOrdre = fctOrdre;
    }

    public Short getStatut() {
        return statut;
    }

    public void setStatut(Short statut) {
        this.statut = statut;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    @XmlTransient
    public List<TpFonctionfonctionnalite> getTpFonctionfonctionnaliteList() {
        return tpFonctionfonctionnaliteList;
    }

    public void setTpFonctionfonctionnaliteList(List<TpFonctionfonctionnalite> tpFonctionfonctionnaliteList) {
        this.tpFonctionfonctionnaliteList = tpFonctionfonctionnaliteList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fctCode != null ? fctCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TpFonction)) {
            return false;
        }
        TpFonction other = (TpFonction) object;
        if ((this.fctCode == null && other.fctCode != null) || (this.fctCode != null && !this.fctCode.equals(other.fctCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wfree.talipay.entities.TpFonction[ fctCode=" + fctCode + " ]";
    }
    
}
