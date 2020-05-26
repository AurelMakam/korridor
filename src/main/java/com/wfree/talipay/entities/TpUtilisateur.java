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
@Table(name = "tp_utilisateur", catalog = "bd_talipay", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TpUtilisateur.findAll", query = "SELECT t FROM TpUtilisateur t")
    , @NamedQuery(name = "TpUtilisateur.findByUsrId", query = "SELECT t FROM TpUtilisateur t WHERE t.usrId = :usrId")
    , @NamedQuery(name = "TpUtilisateur.findByProId", query = "SELECT t FROM TpUtilisateur t WHERE t.proId = :proId")
    , @NamedQuery(name = "TpUtilisateur.findByUsrCni", query = "SELECT t FROM TpUtilisateur t WHERE t.usrCni = :usrCni")
    , @NamedQuery(name = "TpUtilisateur.findByUsrCniDateExp", query = "SELECT t FROM TpUtilisateur t WHERE t.usrCniDateExp = :usrCniDateExp")
    , @NamedQuery(name = "TpUtilisateur.findByUsrLocalisation", query = "SELECT t FROM TpUtilisateur t WHERE t.usrLocalisation = :usrLocalisation")
    , @NamedQuery(name = "TpUtilisateur.findByUsrDateNaiss", query = "SELECT t FROM TpUtilisateur t WHERE t.usrDateNaiss = :usrDateNaiss")
    , @NamedQuery(name = "TpUtilisateur.findByUsrNationalite", query = "SELECT t FROM TpUtilisateur t WHERE t.usrNationalite = :usrNationalite")
    , @NamedQuery(name = "TpUtilisateur.findByUsrName", query = "SELECT t FROM TpUtilisateur t WHERE t.usrName = :usrName")
    , @NamedQuery(name = "TpUtilisateur.findByUsrLastname", query = "SELECT t FROM TpUtilisateur t WHERE t.usrLastname = :usrLastname")
    , @NamedQuery(name = "TpUtilisateur.findByUsrProfession", query = "SELECT t FROM TpUtilisateur t WHERE t.usrProfession = :usrProfession")
    , @NamedQuery(name = "TpUtilisateur.findByUsrTelephone1", query = "SELECT t FROM TpUtilisateur t WHERE t.usrTelephone1 = :usrTelephone1")
    , @NamedQuery(name = "TpUtilisateur.findByUsrTelephone2", query = "SELECT t FROM TpUtilisateur t WHERE t.usrTelephone2 = :usrTelephone2")
    , @NamedQuery(name = "TpUtilisateur.findByUsrTypePiece", query = "SELECT t FROM TpUtilisateur t WHERE t.usrTypePiece = :usrTypePiece")
    , @NamedQuery(name = "TpUtilisateur.findByUsrPays", query = "SELECT t FROM TpUtilisateur t WHERE t.usrPays = :usrPays")
    , @NamedQuery(name = "TpUtilisateur.findByUsrVille", query = "SELECT t FROM TpUtilisateur t WHERE t.usrVille = :usrVille")
    , @NamedQuery(name = "TpUtilisateur.findByUsrIdImg1", query = "SELECT t FROM TpUtilisateur t WHERE t.usrIdImg1 = :usrIdImg1")
    , @NamedQuery(name = "TpUtilisateur.findByUsrIdImg2", query = "SELECT t FROM TpUtilisateur t WHERE t.usrIdImg2 = :usrIdImg2")
    , @NamedQuery(name = "TpUtilisateur.findByUsrIdImg3", query = "SELECT t FROM TpUtilisateur t WHERE t.usrIdImg3 = :usrIdImg3")
    , @NamedQuery(name = "TpUtilisateur.findByStatut", query = "SELECT t FROM TpUtilisateur t WHERE t.statut = :statut")
    , @NamedQuery(name = "TpUtilisateur.findByUsrDateCreate", query = "SELECT t FROM TpUtilisateur t WHERE t.usrDateCreate = :usrDateCreate")
    , @NamedQuery(name = "TpUtilisateur.findByUsrSexe", query = "SELECT t FROM TpUtilisateur t WHERE t.usrSexe = :usrSexe")
    , @NamedQuery(name = "TpUtilisateur.findByUsrLogin", query = "SELECT t FROM TpUtilisateur t WHERE t.usrLogin = :usrLogin")
    , @NamedQuery(name = "TpUtilisateur.findByUsrPassword", query = "SELECT t FROM TpUtilisateur t WHERE t.usrPassword = :usrPassword")
    , @NamedQuery(name = "TpUtilisateur.findByUsrPostalcode", query = "SELECT t FROM TpUtilisateur t WHERE t.usrPostalcode = :usrPostalcode")
    , @NamedQuery(name = "TpUtilisateur.findByUsrType", query = "SELECT t FROM TpUtilisateur t WHERE t.usrType = :usrType")
    , @NamedQuery(name = "TpUtilisateur.findByMrdCertificat", query = "SELECT t FROM TpUtilisateur t WHERE t.mrdCertificat = :mrdCertificat")
    , @NamedQuery(name = "TpUtilisateur.findByMrdRccm", query = "SELECT t FROM TpUtilisateur t WHERE t.mrdRccm = :mrdRccm")
    , @NamedQuery(name = "TpUtilisateur.findByMrdContribuable", query = "SELECT t FROM TpUtilisateur t WHERE t.mrdContribuable = :mrdContribuable")
    , @NamedQuery(name = "TpUtilisateur.findByMrdLicence", query = "SELECT t FROM TpUtilisateur t WHERE t.mrdLicence = :mrdLicence")
    , @NamedQuery(name = "TpUtilisateur.findByMrdPrivkey", query = "SELECT t FROM TpUtilisateur t WHERE t.mrdPrivkey = :mrdPrivkey")})
public class TpUtilisateur implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "usrId", nullable = false)
    private Long usrId;
    @Basic(optional = false)
    @Column(name = "proId", nullable = false)
    private long proId;
    @Column(name = "usrCni", length = 254)
    private String usrCni;
    @Column(name = "usrCniDateExp")
    @Temporal(TemporalType.TIMESTAMP)
    private Date usrCniDateExp;
    @Column(name = "usrLocalisation", length = 254)
    private String usrLocalisation;
    @Column(name = "usrDateNaiss")
    @Temporal(TemporalType.TIMESTAMP)
    private Date usrDateNaiss;
    @Column(name = "usrNationalite", length = 254)
    private String usrNationalite;
    @Column(name = "usrName", length = 254)
    private String usrName;
    @Column(name = "usrLastname", length = 254)
    private String usrLastname;
    @Column(name = "usrProfession", length = 254)
    private String usrProfession;
    @Column(name = "usrTelephone1", length = 254)
    private String usrTelephone1;
    @Column(name = "usrTelephone2", length = 254)
    private String usrTelephone2;
    @Column(name = "usrTypePiece", length = 254)
    private String usrTypePiece;
    @Column(name = "usrPays", length = 254)
    private String usrPays;
    @Column(name = "usrVille", length = 254)
    private String usrVille;
    @Column(name = "usrIdImg1", length = 254)
    private String usrIdImg1;
    @Column(name = "usrIdImg2", length = 254)
    private String usrIdImg2;
    @Column(name = "usrIdImg3", length = 254)
    private String usrIdImg3;
    @Column(name = "statut")
    private Short statut;
    @Column(name = "usrDateCreate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date usrDateCreate;
    @Column(name = "usrSexe")
    private Character usrSexe;
    @Column(name = "usrLogin", length = 254)
    private String usrLogin;
    @Column(name = "usrPassword", length = 254)
    private String usrPassword;
    @Column(name = "usrPostalcode", length = 254)
    private String usrPostalcode;
    @Basic(optional = false)
    @Column(name = "usrType", nullable = false)
    private short usrType;
    @Column(name = "mrdCertificat", length = 254)
    private String mrdCertificat;
    @Column(name = "mrdRccm", length = 254)
    private String mrdRccm;
    @Column(name = "mrdContribuable", length = 254)
    private String mrdContribuable;
    @Column(name = "mrdLicence", length = 254)
    private String mrdLicence;
    @Column(name = "mrdPrivkey", length = 254)
    private String mrdPrivkey;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usrId")
    private List<TpUtilisateurfonctionnalite> tpUtilisateurfonctionnaliteList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usrId")
    private List<TpCompte> tpCompteList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usrId")
    private List<TpSms> tpSmsList;

    public TpUtilisateur() {
    }

    public TpUtilisateur(Long usrId) {
        this.usrId = usrId;
    }

    public TpUtilisateur(Long usrId, long proId, short usrType) {
        this.usrId = usrId;
        this.proId = proId;
        this.usrType = usrType;
    }

    public Long getUsrId() {
        return usrId;
    }

    public void setUsrId(Long usrId) {
        this.usrId = usrId;
    }

    public long getProId() {
        return proId;
    }

    public void setProId(long proId) {
        this.proId = proId;
    }

    public String getUsrCni() {
        return usrCni;
    }

    public void setUsrCni(String usrCni) {
        this.usrCni = usrCni;
    }

    public Date getUsrCniDateExp() {
        return usrCniDateExp;
    }

    public void setUsrCniDateExp(Date usrCniDateExp) {
        this.usrCniDateExp = usrCniDateExp;
    }

    public String getUsrLocalisation() {
        return usrLocalisation;
    }

    public void setUsrLocalisation(String usrLocalisation) {
        this.usrLocalisation = usrLocalisation;
    }

    public Date getUsrDateNaiss() {
        return usrDateNaiss;
    }

    public void setUsrDateNaiss(Date usrDateNaiss) {
        this.usrDateNaiss = usrDateNaiss;
    }

    public String getUsrNationalite() {
        return usrNationalite;
    }

    public void setUsrNationalite(String usrNationalite) {
        this.usrNationalite = usrNationalite;
    }

    public String getUsrName() {
        return usrName;
    }

    public void setUsrName(String usrName) {
        this.usrName = usrName;
    }

    public String getUsrLastname() {
        return usrLastname;
    }

    public void setUsrLastname(String usrLastname) {
        this.usrLastname = usrLastname;
    }

    public String getUsrProfession() {
        return usrProfession;
    }

    public void setUsrProfession(String usrProfession) {
        this.usrProfession = usrProfession;
    }

    public String getUsrTelephone1() {
        return usrTelephone1;
    }

    public void setUsrTelephone1(String usrTelephone1) {
        this.usrTelephone1 = usrTelephone1;
    }

    public String getUsrTelephone2() {
        return usrTelephone2;
    }

    public void setUsrTelephone2(String usrTelephone2) {
        this.usrTelephone2 = usrTelephone2;
    }

    public String getUsrTypePiece() {
        return usrTypePiece;
    }

    public void setUsrTypePiece(String usrTypePiece) {
        this.usrTypePiece = usrTypePiece;
    }

    public String getUsrPays() {
        return usrPays;
    }

    public void setUsrPays(String usrPays) {
        this.usrPays = usrPays;
    }

    public String getUsrVille() {
        return usrVille;
    }

    public void setUsrVille(String usrVille) {
        this.usrVille = usrVille;
    }

    public String getUsrIdImg1() {
        return usrIdImg1;
    }

    public void setUsrIdImg1(String usrIdImg1) {
        this.usrIdImg1 = usrIdImg1;
    }

    public String getUsrIdImg2() {
        return usrIdImg2;
    }

    public void setUsrIdImg2(String usrIdImg2) {
        this.usrIdImg2 = usrIdImg2;
    }

    public String getUsrIdImg3() {
        return usrIdImg3;
    }

    public void setUsrIdImg3(String usrIdImg3) {
        this.usrIdImg3 = usrIdImg3;
    }

    public Short getStatut() {
        return statut;
    }

    public void setStatut(Short statut) {
        this.statut = statut;
    }

    public Date getUsrDateCreate() {
        return usrDateCreate;
    }

    public void setUsrDateCreate(Date usrDateCreate) {
        this.usrDateCreate = usrDateCreate;
    }

    public Character getUsrSexe() {
        return usrSexe;
    }

    public void setUsrSexe(Character usrSexe) {
        this.usrSexe = usrSexe;
    }

    public String getUsrLogin() {
        return usrLogin;
    }

    public void setUsrLogin(String usrLogin) {
        this.usrLogin = usrLogin;
    }

    public String getUsrPassword() {
        return usrPassword;
    }

    public void setUsrPassword(String usrPassword) {
        this.usrPassword = usrPassword;
    }

    public String getUsrPostalcode() {
        return usrPostalcode;
    }

    public void setUsrPostalcode(String usrPostalcode) {
        this.usrPostalcode = usrPostalcode;
    }

    public short getUsrType() {
        return usrType;
    }

    public void setUsrType(short usrType) {
        this.usrType = usrType;
    }

    public String getMrdCertificat() {
        return mrdCertificat;
    }

    public void setMrdCertificat(String mrdCertificat) {
        this.mrdCertificat = mrdCertificat;
    }

    public String getMrdRccm() {
        return mrdRccm;
    }

    public void setMrdRccm(String mrdRccm) {
        this.mrdRccm = mrdRccm;
    }

    public String getMrdContribuable() {
        return mrdContribuable;
    }

    public void setMrdContribuable(String mrdContribuable) {
        this.mrdContribuable = mrdContribuable;
    }

    public String getMrdLicence() {
        return mrdLicence;
    }

    public void setMrdLicence(String mrdLicence) {
        this.mrdLicence = mrdLicence;
    }

    public String getMrdPrivkey() {
        return mrdPrivkey;
    }

    public void setMrdPrivkey(String mrdPrivkey) {
        this.mrdPrivkey = mrdPrivkey;
    }

    @XmlTransient
    public List<TpUtilisateurfonctionnalite> getTpUtilisateurfonctionnaliteList() {
        return tpUtilisateurfonctionnaliteList;
    }

    public void setTpUtilisateurfonctionnaliteList(List<TpUtilisateurfonctionnalite> tpUtilisateurfonctionnaliteList) {
        this.tpUtilisateurfonctionnaliteList = tpUtilisateurfonctionnaliteList;
    }

    @XmlTransient
    public List<TpCompte> getTpCompteList() {
        return tpCompteList;
    }

    public void setTpCompteList(List<TpCompte> tpCompteList) {
        this.tpCompteList = tpCompteList;
    }

    @XmlTransient
    public List<TpSms> getTpSmsList() {
        return tpSmsList;
    }

    public void setTpSmsList(List<TpSms> tpSmsList) {
        this.tpSmsList = tpSmsList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usrId != null ? usrId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TpUtilisateur)) {
            return false;
        }
        TpUtilisateur other = (TpUtilisateur) object;
        if ((this.usrId == null && other.usrId != null) || (this.usrId != null && !this.usrId.equals(other.usrId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wfree.talipay.entities.TpUtilisateur[ usrId=" + usrId + " ]";
    }
    
}
