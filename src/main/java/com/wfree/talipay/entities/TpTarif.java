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
@Table(name = "tp_tarif", catalog = "bd_talipay", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TpTarif.findAll", query = "SELECT t FROM TpTarif t")
    , @NamedQuery(name = "TpTarif.findByTrfId", query = "SELECT t FROM TpTarif t WHERE t.trfId = :trfId")
    , @NamedQuery(name = "TpTarif.findByTrfMinValue", query = "SELECT t FROM TpTarif t WHERE t.trfMinValue = :trfMinValue")
    , @NamedQuery(name = "TpTarif.findByTrfMaxValue", query = "SELECT t FROM TpTarif t WHERE t.trfMaxValue = :trfMaxValue")
    , @NamedQuery(name = "TpTarif.findByTrfValue", query = "SELECT t FROM TpTarif t WHERE t.trfValue = :trfValue")
    , @NamedQuery(name = "TpTarif.findByTrfType", query = "SELECT t FROM TpTarif t WHERE t.trfType = :trfType")
    , @NamedQuery(name = "TpTarif.findByStatut", query = "SELECT t FROM TpTarif t WHERE t.statut = :statut")
    , @NamedQuery(name = "TpTarif.findByTrfDateCreate", query = "SELECT t FROM TpTarif t WHERE t.trfDateCreate = :trfDateCreate")})
public class TpTarif implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "trfId", nullable = false)
    private Long trfId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "trfMinValue", precision = 22)
    private Double trfMinValue;
    @Column(name = "trfMaxValue", precision = 22)
    private Double trfMaxValue;
    @Column(name = "trfValue", precision = 22)
    private Double trfValue;
    @Column(name = "trfType")
    private Short trfType;
    @Column(name = "statut")
    private Short statut;
    @Column(name = "trfDateCreate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date trfDateCreate;
    @JoinColumn(name = "ttnId", referencedColumnName = "ttnId", nullable = false)
    @ManyToOne(optional = false)
    private TpTypetransaction ttnId;
    @JoinColumn(name = "proId", referencedColumnName = "proId", nullable = false)
    @ManyToOne(optional = false)
    private TpProfil proId;

    public TpTarif() {
    }

    public TpTarif(Long trfId) {
        this.trfId = trfId;
    }

    public Long getTrfId() {
        return trfId;
    }

    public void setTrfId(Long trfId) {
        this.trfId = trfId;
    }

    public Double getTrfMinValue() {
        return trfMinValue;
    }

    public void setTrfMinValue(Double trfMinValue) {
        this.trfMinValue = trfMinValue;
    }

    public Double getTrfMaxValue() {
        return trfMaxValue;
    }

    public void setTrfMaxValue(Double trfMaxValue) {
        this.trfMaxValue = trfMaxValue;
    }

    public Double getTrfValue() {
        return trfValue;
    }

    public void setTrfValue(Double trfValue) {
        this.trfValue = trfValue;
    }

    public Short getTrfType() {
        return trfType;
    }

    public void setTrfType(Short trfType) {
        this.trfType = trfType;
    }

    public Short getStatut() {
        return statut;
    }

    public void setStatut(Short statut) {
        this.statut = statut;
    }

    public Date getTrfDateCreate() {
        return trfDateCreate;
    }

    public void setTrfDateCreate(Date trfDateCreate) {
        this.trfDateCreate = trfDateCreate;
    }

    public TpTypetransaction getTtnId() {
        return ttnId;
    }

    public void setTtnId(TpTypetransaction ttnId) {
        this.ttnId = ttnId;
    }

    public TpProfil getProId() {
        return proId;
    }

    public void setProId(TpProfil proId) {
        this.proId = proId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (trfId != null ? trfId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TpTarif)) {
            return false;
        }
        TpTarif other = (TpTarif) object;
        if ((this.trfId == null && other.trfId != null) || (this.trfId != null && !this.trfId.equals(other.trfId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wfree.talipay.entities.TpTarif[ trfId=" + trfId + " ]";
    }
    
}
