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
@Table(name = "tp_compte", catalog = "bd_talipay", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TpCompte.findAll", query = "SELECT t FROM TpCompte t")
    , @NamedQuery(name = "TpCompte.findByCptId", query = "SELECT t FROM TpCompte t WHERE t.cptId = :cptId")
    , @NamedQuery(name = "TpCompte.findByCptNumero", query = "SELECT t FROM TpCompte t WHERE t.cptNumero = :cptNumero")
    , @NamedQuery(name = "TpCompte.findByCptType", query = "SELECT t FROM TpCompte t WHERE t.cptType = :cptType")
    , @NamedQuery(name = "TpCompte.findByCptBalance", query = "SELECT t FROM TpCompte t WHERE t.cptBalance = :cptBalance")
    , @NamedQuery(name = "TpCompte.findByCptMinBalance", query = "SELECT t FROM TpCompte t WHERE t.cptMinBalance = :cptMinBalance")
    , @NamedQuery(name = "TpCompte.findByCptMaxBalance", query = "SELECT t FROM TpCompte t WHERE t.cptMaxBalance = :cptMaxBalance")
    , @NamedQuery(name = "TpCompte.findByCptDevise", query = "SELECT t FROM TpCompte t WHERE t.cptDevise = :cptDevise")
    , @NamedQuery(name = "TpCompte.findByCptStatut", query = "SELECT t FROM TpCompte t WHERE t.cptStatut = :cptStatut")
    , @NamedQuery(name = "TpCompte.findByCptDatecreate", query = "SELECT t FROM TpCompte t WHERE t.cptDatecreate = :cptDatecreate")
    , @NamedQuery(name = "TpCompte.findByCptPin", query = "SELECT t FROM TpCompte t WHERE t.cptPin = :cptPin")
    , @NamedQuery(name = "TpCompte.findByCptQrcode", query = "SELECT t FROM TpCompte t WHERE t.cptQrcode = :cptQrcode")})
public class TpCompte implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cptId", nullable = false)
    private Long cptId;
    @Column(name = "cptNumero", length = 50)
    private String cptNumero;
    @Column(name = "cptType", length = 254)
    private String cptType;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "cptBalance", precision = 22)
    private Double cptBalance;
    @Column(name = "cptMinBalance", precision = 22)
    private Double cptMinBalance;
    @Column(name = "cptMaxBalance", precision = 22)
    private Double cptMaxBalance;
    @Column(name = "cptDevise", length = 10)
    private String cptDevise;
    @Column(name = "cptStatut")
    private Short cptStatut;
    @Column(name = "cptDatecreate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cptDatecreate;
    @Column(name = "cptPin", length = 254)
    private String cptPin;
    @Column(name = "cptQrcode", length = 254)
    private String cptQrcode;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cptId")
    private List<TpComptesysfinancier> tpComptesysfinancierList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cptId")
    private List<TpCartevirtuelle> tpCartevirtuelleList;
    @JoinColumn(name = "usrId", referencedColumnName = "usrId", nullable = false)
    @ManyToOne(optional = false)
    private TpUtilisateur usrId;

    public TpCompte() {
    }

    public TpCompte(Long cptId) {
        this.cptId = cptId;
    }

    public Long getCptId() {
        return cptId;
    }

    public void setCptId(Long cptId) {
        this.cptId = cptId;
    }

    public String getCptNumero() {
        return cptNumero;
    }

    public void setCptNumero(String cptNumero) {
        this.cptNumero = cptNumero;
    }

    public String getCptType() {
        return cptType;
    }

    public void setCptType(String cptType) {
        this.cptType = cptType;
    }

    public Double getCptBalance() {
        return cptBalance;
    }

    public void setCptBalance(Double cptBalance) {
        this.cptBalance = cptBalance;
    }

    public Double getCptMinBalance() {
        return cptMinBalance;
    }

    public void setCptMinBalance(Double cptMinBalance) {
        this.cptMinBalance = cptMinBalance;
    }

    public Double getCptMaxBalance() {
        return cptMaxBalance;
    }

    public void setCptMaxBalance(Double cptMaxBalance) {
        this.cptMaxBalance = cptMaxBalance;
    }

    public String getCptDevise() {
        return cptDevise;
    }

    public void setCptDevise(String cptDevise) {
        this.cptDevise = cptDevise;
    }

    public Short getCptStatut() {
        return cptStatut;
    }

    public void setCptStatut(Short cptStatut) {
        this.cptStatut = cptStatut;
    }

    public Date getCptDatecreate() {
        return cptDatecreate;
    }

    public void setCptDatecreate(Date cptDatecreate) {
        this.cptDatecreate = cptDatecreate;
    }

    public String getCptPin() {
        return cptPin;
    }

    public void setCptPin(String cptPin) {
        this.cptPin = cptPin;
    }

    public String getCptQrcode() {
        return cptQrcode;
    }

    public void setCptQrcode(String cptQrcode) {
        this.cptQrcode = cptQrcode;
    }

    @XmlTransient
    public List<TpComptesysfinancier> getTpComptesysfinancierList() {
        return tpComptesysfinancierList;
    }

    public void setTpComptesysfinancierList(List<TpComptesysfinancier> tpComptesysfinancierList) {
        this.tpComptesysfinancierList = tpComptesysfinancierList;
    }

    @XmlTransient
    public List<TpCartevirtuelle> getTpCartevirtuelleList() {
        return tpCartevirtuelleList;
    }

    public void setTpCartevirtuelleList(List<TpCartevirtuelle> tpCartevirtuelleList) {
        this.tpCartevirtuelleList = tpCartevirtuelleList;
    }

    public TpUtilisateur getUsrId() {
        return usrId;
    }

    public void setUsrId(TpUtilisateur usrId) {
        this.usrId = usrId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cptId != null ? cptId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TpCompte)) {
            return false;
        }
        TpCompte other = (TpCompte) object;
        if ((this.cptId == null && other.cptId != null) || (this.cptId != null && !this.cptId.equals(other.cptId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wfree.talipay.entities.TpCompte[ cptId=" + cptId + " ]";
    }
    
}
