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
@Table(name = "tp_typetransaction", catalog = "bd_talipay", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TpTypetransaction.findAll", query = "SELECT t FROM TpTypetransaction t")
    , @NamedQuery(name = "TpTypetransaction.findByTtnId", query = "SELECT t FROM TpTypetransaction t WHERE t.ttnId = :ttnId")
    , @NamedQuery(name = "TpTypetransaction.findByTtnCode", query = "SELECT t FROM TpTypetransaction t WHERE t.ttnCode = :ttnCode")
    , @NamedQuery(name = "TpTypetransaction.findByTtnName", query = "SELECT t FROM TpTypetransaction t WHERE t.ttnName = :ttnName")
    , @NamedQuery(name = "TpTypetransaction.findByTtnDescription", query = "SELECT t FROM TpTypetransaction t WHERE t.ttnDescription = :ttnDescription")
    , @NamedQuery(name = "TpTypetransaction.findByStatut", query = "SELECT t FROM TpTypetransaction t WHERE t.statut = :statut")})
public class TpTypetransaction implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ttnId", nullable = false)
    private Long ttnId;
    @Column(name = "ttnCode", length = 254)
    private String ttnCode;
    @Column(name = "ttnName", length = 254)
    private String ttnName;
    @Column(name = "ttnDescription", length = 254)
    private String ttnDescription;
    @Column(name = "statut")
    private Short statut;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ttnId")
    private List<TpTransaction> tpTransactionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ttnId")
    private List<TpTarif> tpTarifList;

    public TpTypetransaction() {
    }

    public TpTypetransaction(Long ttnId) {
        this.ttnId = ttnId;
    }

    public Long getTtnId() {
        return ttnId;
    }

    public void setTtnId(Long ttnId) {
        this.ttnId = ttnId;
    }

    public String getTtnCode() {
        return ttnCode;
    }

    public void setTtnCode(String ttnCode) {
        this.ttnCode = ttnCode;
    }

    public String getTtnName() {
        return ttnName;
    }

    public void setTtnName(String ttnName) {
        this.ttnName = ttnName;
    }

    public String getTtnDescription() {
        return ttnDescription;
    }

    public void setTtnDescription(String ttnDescription) {
        this.ttnDescription = ttnDescription;
    }

    public Short getStatut() {
        return statut;
    }

    public void setStatut(Short statut) {
        this.statut = statut;
    }

    @XmlTransient
    public List<TpTransaction> getTpTransactionList() {
        return tpTransactionList;
    }

    public void setTpTransactionList(List<TpTransaction> tpTransactionList) {
        this.tpTransactionList = tpTransactionList;
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
        hash += (ttnId != null ? ttnId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TpTypetransaction)) {
            return false;
        }
        TpTypetransaction other = (TpTypetransaction) object;
        if ((this.ttnId == null && other.ttnId != null) || (this.ttnId != null && !this.ttnId.equals(other.ttnId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wfree.talipay.entities.TpTypetransaction[ ttnId=" + ttnId + " ]";
    }
    
}
