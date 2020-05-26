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
@Table(name = "tp_cartevirtuelle", catalog = "bd_talipay", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TpCartevirtuelle.findAll", query = "SELECT t FROM TpCartevirtuelle t")
    , @NamedQuery(name = "TpCartevirtuelle.findByCrvId", query = "SELECT t FROM TpCartevirtuelle t WHERE t.crvId = :crvId")
    , @NamedQuery(name = "TpCartevirtuelle.findByCrvNumero", query = "SELECT t FROM TpCartevirtuelle t WHERE t.crvNumero = :crvNumero")
    , @NamedQuery(name = "TpCartevirtuelle.findByCrvExpiryDate", query = "SELECT t FROM TpCartevirtuelle t WHERE t.crvExpiryDate = :crvExpiryDate")
    , @NamedQuery(name = "TpCartevirtuelle.findByCrvCvcCode", query = "SELECT t FROM TpCartevirtuelle t WHERE t.crvCvcCode = :crvCvcCode")
    , @NamedQuery(name = "TpCartevirtuelle.findByCrvDevise", query = "SELECT t FROM TpCartevirtuelle t WHERE t.crvDevise = :crvDevise")
    , @NamedQuery(name = "TpCartevirtuelle.findByCrvPin", query = "SELECT t FROM TpCartevirtuelle t WHERE t.crvPin = :crvPin")
    , @NamedQuery(name = "TpCartevirtuelle.findByStatut", query = "SELECT t FROM TpCartevirtuelle t WHERE t.statut = :statut")
    , @NamedQuery(name = "TpCartevirtuelle.findByCrvDateCreate", query = "SELECT t FROM TpCartevirtuelle t WHERE t.crvDateCreate = :crvDateCreate")
    , @NamedQuery(name = "TpCartevirtuelle.findByCrvSolde", query = "SELECT t FROM TpCartevirtuelle t WHERE t.crvSolde = :crvSolde")})
public class TpCartevirtuelle implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "crvId", nullable = false)
    private Long crvId;
    @Column(name = "crvNumero", length = 254)
    private String crvNumero;
    @Column(name = "crvExpiryDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crvExpiryDate;
    @Column(name = "crvCvcCode")
    private Integer crvCvcCode;
    @Column(name = "crvDevise", length = 254)
    private String crvDevise;
    @Column(name = "crvPin", length = 255)
    private String crvPin;
    @Column(name = "statut")
    private Short statut;
    @Column(name = "crvDateCreate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crvDateCreate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "crvSolde", precision = 22)
    private Double crvSolde;
    @JoinColumn(name = "cptId", referencedColumnName = "cptId", nullable = false)
    @ManyToOne(optional = false)
    private TpCompte cptId;

    public TpCartevirtuelle() {
    }

    public TpCartevirtuelle(Long crvId) {
        this.crvId = crvId;
    }

    public Long getCrvId() {
        return crvId;
    }

    public void setCrvId(Long crvId) {
        this.crvId = crvId;
    }

    public String getCrvNumero() {
        return crvNumero;
    }

    public void setCrvNumero(String crvNumero) {
        this.crvNumero = crvNumero;
    }

    public Date getCrvExpiryDate() {
        return crvExpiryDate;
    }

    public void setCrvExpiryDate(Date crvExpiryDate) {
        this.crvExpiryDate = crvExpiryDate;
    }

    public Integer getCrvCvcCode() {
        return crvCvcCode;
    }

    public void setCrvCvcCode(Integer crvCvcCode) {
        this.crvCvcCode = crvCvcCode;
    }

    public String getCrvDevise() {
        return crvDevise;
    }

    public void setCrvDevise(String crvDevise) {
        this.crvDevise = crvDevise;
    }

    public String getCrvPin() {
        return crvPin;
    }

    public void setCrvPin(String crvPin) {
        this.crvPin = crvPin;
    }

    public Short getStatut() {
        return statut;
    }

    public void setStatut(Short statut) {
        this.statut = statut;
    }

    public Date getCrvDateCreate() {
        return crvDateCreate;
    }

    public void setCrvDateCreate(Date crvDateCreate) {
        this.crvDateCreate = crvDateCreate;
    }

    public Double getCrvSolde() {
        return crvSolde;
    }

    public void setCrvSolde(Double crvSolde) {
        this.crvSolde = crvSolde;
    }

    public TpCompte getCptId() {
        return cptId;
    }

    public void setCptId(TpCompte cptId) {
        this.cptId = cptId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (crvId != null ? crvId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TpCartevirtuelle)) {
            return false;
        }
        TpCartevirtuelle other = (TpCartevirtuelle) object;
        if ((this.crvId == null && other.crvId != null) || (this.crvId != null && !this.crvId.equals(other.crvId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wfree.talipay.entities.TpCartevirtuelle[ crvId=" + crvId + " ]";
    }
    
}
