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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "tp_fonctionnalite", catalog = "bd_talipay", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TpFonctionnalite.findAll", query = "SELECT t FROM TpFonctionnalite t")
    , @NamedQuery(name = "TpFonctionnalite.findByFnCode", query = "SELECT t FROM TpFonctionnalite t WHERE t.fnCode = :fnCode")
    , @NamedQuery(name = "TpFonctionnalite.findByFnDescription", query = "SELECT t FROM TpFonctionnalite t WHERE t.fnDescription = :fnDescription")
    , @NamedQuery(name = "TpFonctionnalite.findByFnUrl", query = "SELECT t FROM TpFonctionnalite t WHERE t.fnUrl = :fnUrl")
    , @NamedQuery(name = "TpFonctionnalite.findByStatut", query = "SELECT t FROM TpFonctionnalite t WHERE t.statut = :statut")
    , @NamedQuery(name = "TpFonctionnalite.findByDateCreate", query = "SELECT t FROM TpFonctionnalite t WHERE t.dateCreate = :dateCreate")})
public class TpFonctionnalite implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "fnCode", nullable = false, length = 254)
    private String fnCode;
    @Column(name = "fnDescription", length = 254)
    private String fnDescription;
    @Column(name = "fnUrl", length = 254)
    private String fnUrl;
    @Column(name = "statut")
    private Short statut;
    @Column(name = "dateCreate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreate;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fnCode")
    private List<TpFonctionfonctionnalite> tpFonctionfonctionnaliteList;
    @JoinColumn(name = "modCode", referencedColumnName = "modCode", nullable = false)
    @ManyToOne(optional = false)
    private TpModule modCode;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fnCode")
    private List<TpUtilisateurfonctionnalite> tpUtilisateurfonctionnaliteList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fnCode")
    private List<TpAdminfonctionnalite> tpAdminfonctionnaliteList;

    public TpFonctionnalite() {
    }

    public TpFonctionnalite(String fnCode) {
        this.fnCode = fnCode;
    }

    public String getFnCode() {
        return fnCode;
    }

    public void setFnCode(String fnCode) {
        this.fnCode = fnCode;
    }

    public String getFnDescription() {
        return fnDescription;
    }

    public void setFnDescription(String fnDescription) {
        this.fnDescription = fnDescription;
    }

    public String getFnUrl() {
        return fnUrl;
    }

    public void setFnUrl(String fnUrl) {
        this.fnUrl = fnUrl;
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

    public TpModule getModCode() {
        return modCode;
    }

    public void setModCode(TpModule modCode) {
        this.modCode = modCode;
    }

    @XmlTransient
    public List<TpUtilisateurfonctionnalite> getTpUtilisateurfonctionnaliteList() {
        return tpUtilisateurfonctionnaliteList;
    }

    public void setTpUtilisateurfonctionnaliteList(List<TpUtilisateurfonctionnalite> tpUtilisateurfonctionnaliteList) {
        this.tpUtilisateurfonctionnaliteList = tpUtilisateurfonctionnaliteList;
    }

    @XmlTransient
    public List<TpAdminfonctionnalite> getTpAdminfonctionnaliteList() {
        return tpAdminfonctionnaliteList;
    }

    public void setTpAdminfonctionnaliteList(List<TpAdminfonctionnalite> tpAdminfonctionnaliteList) {
        this.tpAdminfonctionnaliteList = tpAdminfonctionnaliteList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fnCode != null ? fnCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TpFonctionnalite)) {
            return false;
        }
        TpFonctionnalite other = (TpFonctionnalite) object;
        if ((this.fnCode == null && other.fnCode != null) || (this.fnCode != null && !this.fnCode.equals(other.fnCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wfree.talipay.entities.TpFonctionnalite[ fnCode=" + fnCode + " ]";
    }
    
}
