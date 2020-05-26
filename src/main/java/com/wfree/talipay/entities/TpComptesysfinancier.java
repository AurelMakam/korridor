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
@Table(name = "tp_comptesysfinancier", catalog = "bd_talipay", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TpComptesysfinancier.findAll", query = "SELECT t FROM TpComptesysfinancier t")
    , @NamedQuery(name = "TpComptesysfinancier.findById", query = "SELECT t FROM TpComptesysfinancier t WHERE t.id = :id")
    , @NamedQuery(name = "TpComptesysfinancier.findByCsfDateliaison", query = "SELECT t FROM TpComptesysfinancier t WHERE t.csfDateliaison = :csfDateliaison")})
public class TpComptesysfinancier implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "csfDateliaison")
    @Temporal(TemporalType.TIMESTAMP)
    private Date csfDateliaison;
    @JoinColumn(name = "cptId", referencedColumnName = "cptId", nullable = false)
    @ManyToOne(optional = false)
    private TpCompte cptId;
    @JoinColumn(name = "sfiId", referencedColumnName = "sfiId", nullable = false)
    @ManyToOne(optional = false)
    private TpSystemefinancier sfiId;

    public TpComptesysfinancier() {
    }

    public TpComptesysfinancier(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCsfDateliaison() {
        return csfDateliaison;
    }

    public void setCsfDateliaison(Date csfDateliaison) {
        this.csfDateliaison = csfDateliaison;
    }

    public TpCompte getCptId() {
        return cptId;
    }

    public void setCptId(TpCompte cptId) {
        this.cptId = cptId;
    }

    public TpSystemefinancier getSfiId() {
        return sfiId;
    }

    public void setSfiId(TpSystemefinancier sfiId) {
        this.sfiId = sfiId;
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
        if (!(object instanceof TpComptesysfinancier)) {
            return false;
        }
        TpComptesysfinancier other = (TpComptesysfinancier) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wfree.talipay.entities.TpComptesysfinancier[ id=" + id + " ]";
    }
    
}
