/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wfree.talipay.entities;

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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author EUC
 */
@Entity
@Table(name = "tp_systemefinancier", catalog = "bd_talipay", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TpSystemefinancier.findAll", query = "SELECT t FROM TpSystemefinancier t")
    , @NamedQuery(name = "TpSystemefinancier.findBySfiId", query = "SELECT t FROM TpSystemefinancier t WHERE t.sfiId = :sfiId")
    , @NamedQuery(name = "TpSystemefinancier.findBySfiNom", query = "SELECT t FROM TpSystemefinancier t WHERE t.sfiNom = :sfiNom")
    , @NamedQuery(name = "TpSystemefinancier.findBySfiPays", query = "SELECT t FROM TpSystemefinancier t WHERE t.sfiPays = :sfiPays")
    , @NamedQuery(name = "TpSystemefinancier.findByStatut", query = "SELECT t FROM TpSystemefinancier t WHERE t.statut = :statut")})
public class TpSystemefinancier implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "sfiId", nullable = false)
    private Long sfiId;
    @Column(name = "sfiNom", length = 254)
    private String sfiNom;
    @Column(name = "sfiPays", length = 254)
    private String sfiPays;
    @Column(name = "statut")
    private Short statut;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sfiId")
    private List<TpComptesysfinancier> tpComptesysfinancierList;

    public TpSystemefinancier() {
    }

    public TpSystemefinancier(Long sfiId) {
        this.sfiId = sfiId;
    }

    public Long getSfiId() {
        return sfiId;
    }

    public void setSfiId(Long sfiId) {
        this.sfiId = sfiId;
    }

    public String getSfiNom() {
        return sfiNom;
    }

    public void setSfiNom(String sfiNom) {
        this.sfiNom = sfiNom;
    }

    public String getSfiPays() {
        return sfiPays;
    }

    public void setSfiPays(String sfiPays) {
        this.sfiPays = sfiPays;
    }

    public Short getStatut() {
        return statut;
    }

    public void setStatut(Short statut) {
        this.statut = statut;
    }

    @XmlTransient
    public List<TpComptesysfinancier> getTpComptesysfinancierList() {
        return tpComptesysfinancierList;
    }

    public void setTpComptesysfinancierList(List<TpComptesysfinancier> tpComptesysfinancierList) {
        this.tpComptesysfinancierList = tpComptesysfinancierList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sfiId != null ? sfiId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TpSystemefinancier)) {
            return false;
        }
        TpSystemefinancier other = (TpSystemefinancier) object;
        if ((this.sfiId == null && other.sfiId != null) || (this.sfiId != null && !this.sfiId.equals(other.sfiId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wfree.talipay.entities.TpSystemefinancier[ sfiId=" + sfiId + " ]";
    }
    
}
