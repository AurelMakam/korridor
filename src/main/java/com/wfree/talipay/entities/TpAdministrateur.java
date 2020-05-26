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
@Table(name = "tp_administrateur", catalog = "bd_talipay", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TpAdministrateur.findAll", query = "SELECT t FROM TpAdministrateur t")
    , @NamedQuery(name = "TpAdministrateur.findByAdmId", query = "SELECT t FROM TpAdministrateur t WHERE t.admId = :admId")
    , @NamedQuery(name = "TpAdministrateur.findByAdmConnexionCounter", query = "SELECT t FROM TpAdministrateur t WHERE t.admConnexionCounter = :admConnexionCounter")
    , @NamedQuery(name = "TpAdministrateur.findByAdmPwdDuration", query = "SELECT t FROM TpAdministrateur t WHERE t.admPwdDuration = :admPwdDuration")
    , @NamedQuery(name = "TpAdministrateur.findByAdmEmail", query = "SELECT t FROM TpAdministrateur t WHERE t.admEmail = :admEmail")
    , @NamedQuery(name = "TpAdministrateur.findByAdmLogin", query = "SELECT t FROM TpAdministrateur t WHERE t.admLogin = :admLogin")
    , @NamedQuery(name = "TpAdministrateur.findByAdmName", query = "SELECT t FROM TpAdministrateur t WHERE t.admName = :admName")
    , @NamedQuery(name = "TpAdministrateur.findByAdmLastname", query = "SELECT t FROM TpAdministrateur t WHERE t.admLastname = :admLastname")
    , @NamedQuery(name = "TpAdministrateur.findByAdmPassword", query = "SELECT t FROM TpAdministrateur t WHERE t.admPassword = :admPassword")
    , @NamedQuery(name = "TpAdministrateur.findByStatut", query = "SELECT t FROM TpAdministrateur t WHERE t.statut = :statut")
    , @NamedQuery(name = "TpAdministrateur.findByDateCreate", query = "SELECT t FROM TpAdministrateur t WHERE t.dateCreate = :dateCreate")})
public class TpAdministrateur implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "admId", nullable = false)
    private Long admId;
    @Column(name = "admConnexionCounter")
    private Integer admConnexionCounter;
    @Column(name = "admPwdDuration")
    private Integer admPwdDuration;
    @Column(name = "admEmail", length = 254)
    private String admEmail;
    @Column(name = "admLogin", length = 254)
    private String admLogin;
    @Column(name = "admName", length = 254)
    private String admName;
    @Column(name = "admLastname", length = 254)
    private String admLastname;
    @Column(name = "admPassword", length = 254)
    private String admPassword;
    @Column(name = "statut")
    private Short statut;
    @Column(name = "dateCreate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreate;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "admId")
    private List<TpAdminfonctionnalite> tpAdminfonctionnaliteList;

    public TpAdministrateur() {
    }

    public TpAdministrateur(Long admId) {
        this.admId = admId;
    }

    public Long getAdmId() {
        return admId;
    }

    public void setAdmId(Long admId) {
        this.admId = admId;
    }

    public Integer getAdmConnexionCounter() {
        return admConnexionCounter;
    }

    public void setAdmConnexionCounter(Integer admConnexionCounter) {
        this.admConnexionCounter = admConnexionCounter;
    }

    public Integer getAdmPwdDuration() {
        return admPwdDuration;
    }

    public void setAdmPwdDuration(Integer admPwdDuration) {
        this.admPwdDuration = admPwdDuration;
    }

    public String getAdmEmail() {
        return admEmail;
    }

    public void setAdmEmail(String admEmail) {
        this.admEmail = admEmail;
    }

    public String getAdmLogin() {
        return admLogin;
    }

    public void setAdmLogin(String admLogin) {
        this.admLogin = admLogin;
    }

    public String getAdmName() {
        return admName;
    }

    public void setAdmName(String admName) {
        this.admName = admName;
    }

    public String getAdmLastname() {
        return admLastname;
    }

    public void setAdmLastname(String admLastname) {
        this.admLastname = admLastname;
    }

    public String getAdmPassword() {
        return admPassword;
    }

    public void setAdmPassword(String admPassword) {
        this.admPassword = admPassword;
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
    public List<TpAdminfonctionnalite> getTpAdminfonctionnaliteList() {
        return tpAdminfonctionnaliteList;
    }

    public void setTpAdminfonctionnaliteList(List<TpAdminfonctionnalite> tpAdminfonctionnaliteList) {
        this.tpAdminfonctionnaliteList = tpAdminfonctionnaliteList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (admId != null ? admId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TpAdministrateur)) {
            return false;
        }
        TpAdministrateur other = (TpAdministrateur) object;
        if ((this.admId == null && other.admId != null) || (this.admId != null && !this.admId.equals(other.admId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wfree.talipay.entities.TpAdministrateur[ admId=" + admId + " ]";
    }
    
}
