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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "tp_profil", catalog = "bd_talipay", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TpProfil.findAll", query = "SELECT t FROM TpProfil t")
    , @NamedQuery(name = "TpProfil.findByProId", query = "SELECT t FROM TpProfil t WHERE t.proId = :proId")
    , @NamedQuery(name = "TpProfil.findByProName", query = "SELECT t FROM TpProfil t WHERE t.proName = :proName")
    , @NamedQuery(name = "TpProfil.findByProDescription", query = "SELECT t FROM TpProfil t WHERE t.proDescription = :proDescription")
    , @NamedQuery(name = "TpProfil.findByStatut", query = "SELECT t FROM TpProfil t WHERE t.statut = :statut")
    , @NamedQuery(name = "TpProfil.findByProDateCreate", query = "SELECT t FROM TpProfil t WHERE t.proDateCreate = :proDateCreate")})
public class TpProfil implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "proId", nullable = false)
    private Long proId;
    @Column(name = "proName", length = 254)
    private String proName;
    @Column(name = "proDescription", length = 254)
    private String proDescription;
    @Column(name = "statut")
    private Short statut;
    @Column(name = "proDateCreate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date proDateCreate;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "proId")
    private List<TpTarif> tpTarifList;

    public TpProfil() {
    }

    public TpProfil(Long proId) {
        this.proId = proId;
    }

    public Long getProId() {
        return proId;
    }

    public void setProId(Long proId) {
        this.proId = proId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getProDescription() {
        return proDescription;
    }

    public void setProDescription(String proDescription) {
        this.proDescription = proDescription;
    }

    public Short getStatut() {
        return statut;
    }

    public void setStatut(Short statut) {
        this.statut = statut;
    }

    public Date getProDateCreate() {
        return proDateCreate;
    }

    public void setProDateCreate(Date proDateCreate) {
        this.proDateCreate = proDateCreate;
    }

    @XmlTransient
    public List<TpTarif> getTpTarifList() {
        return tpTarifList;
    }

    public void setTpTarifList(List<TpTarif> tpTarifList) {
        this.tpTarifList = tpTarifList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (proId != null ? proId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TpProfil)) {
            return false;
        }
        TpProfil other = (TpProfil) object;
        if ((this.proId == null && other.proId != null) || (this.proId != null && !this.proId.equals(other.proId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wfree.talipay.entities.TpProfil[ proId=" + proId + " ]";
    }
    
}
