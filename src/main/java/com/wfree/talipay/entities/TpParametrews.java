/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wfree.talipay.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author EUC
 */
@Entity
@Table(name = "tp_parametrews", catalog = "bd_talipay", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TpParametrews.findAll", query = "SELECT t FROM TpParametrews t")
    , @NamedQuery(name = "TpParametrews.findByPcbId", query = "SELECT t FROM TpParametrews t WHERE t.pcbId = :pcbId")
    , @NamedQuery(name = "TpParametrews.findByPcbUrl", query = "SELECT t FROM TpParametrews t WHERE t.pcbUrl = :pcbUrl")
    , @NamedQuery(name = "TpParametrews.findByPcbToken", query = "SELECT t FROM TpParametrews t WHERE t.pcbToken = :pcbToken")
    , @NamedQuery(name = "TpParametrews.findByPcbUid", query = "SELECT t FROM TpParametrews t WHERE t.pcbUid = :pcbUid")
    , @NamedQuery(name = "TpParametrews.findByPcbHttpMethod", query = "SELECT t FROM TpParametrews t WHERE t.pcbHttpMethod = :pcbHttpMethod")
    , @NamedQuery(name = "TpParametrews.findByPcbPartnerName", query = "SELECT t FROM TpParametrews t WHERE t.pcbPartnerName = :pcbPartnerName")
    , @NamedQuery(name = "TpParametrews.findByPcbWstype", query = "SELECT t FROM TpParametrews t WHERE t.pcbWstype = :pcbWstype")
    , @NamedQuery(name = "TpParametrews.findByPcbKey", query = "SELECT t FROM TpParametrews t WHERE t.pcbKey = :pcbKey")
    , @NamedQuery(name = "TpParametrews.findByPcbSalt", query = "SELECT t FROM TpParametrews t WHERE t.pcbSalt = :pcbSalt")
    , @NamedQuery(name = "TpParametrews.findByPcbHashType", query = "SELECT t FROM TpParametrews t WHERE t.pcbHashType = :pcbHashType")
    , @NamedQuery(name = "TpParametrews.findByPcbSignMethod", query = "SELECT t FROM TpParametrews t WHERE t.pcbSignMethod = :pcbSignMethod")
    , @NamedQuery(name = "TpParametrews.findByPcbPwd", query = "SELECT t FROM TpParametrews t WHERE t.pcbPwd = :pcbPwd")
    , @NamedQuery(name = "TpParametrews.findByStatut", query = "SELECT t FROM TpParametrews t WHERE t.statut = :statut")})
public class TpParametrews implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pcbId", nullable = false)
    private Long pcbId;
    @Column(name = "pcbUrl", length = 254)
    private String pcbUrl;
    @Column(name = "pcbToken", length = 254)
    private String pcbToken;
    @Column(name = "pcbUid", length = 254)
    private String pcbUid;
    @Column(name = "pcbHttpMethod", length = 254)
    private String pcbHttpMethod;
    @Column(name = "pcbPartnerName", length = 254)
    private String pcbPartnerName;
    @Column(name = "pcbWstype", length = 254)
    private String pcbWstype;
    @Column(name = "pcbKey", length = 254)
    private String pcbKey;
    @Column(name = "pcbSalt", length = 254)
    private String pcbSalt;
    @Column(name = "pcbHashType", length = 254)
    private String pcbHashType;
    @Column(name = "pcbSignMethod", length = 254)
    private String pcbSignMethod;
    @Column(name = "pcbPwd", length = 254)
    private String pcbPwd;
    @Column(name = "statut")
    private Short statut;

    public TpParametrews() {
    }

    public TpParametrews(Long pcbId) {
        this.pcbId = pcbId;
    }

    public Long getPcbId() {
        return pcbId;
    }

    public void setPcbId(Long pcbId) {
        this.pcbId = pcbId;
    }

    public String getPcbUrl() {
        return pcbUrl;
    }

    public void setPcbUrl(String pcbUrl) {
        this.pcbUrl = pcbUrl;
    }

    public String getPcbToken() {
        return pcbToken;
    }

    public void setPcbToken(String pcbToken) {
        this.pcbToken = pcbToken;
    }

    public String getPcbUid() {
        return pcbUid;
    }

    public void setPcbUid(String pcbUid) {
        this.pcbUid = pcbUid;
    }

    public String getPcbHttpMethod() {
        return pcbHttpMethod;
    }

    public void setPcbHttpMethod(String pcbHttpMethod) {
        this.pcbHttpMethod = pcbHttpMethod;
    }

    public String getPcbPartnerName() {
        return pcbPartnerName;
    }

    public void setPcbPartnerName(String pcbPartnerName) {
        this.pcbPartnerName = pcbPartnerName;
    }

    public String getPcbWstype() {
        return pcbWstype;
    }

    public void setPcbWstype(String pcbWstype) {
        this.pcbWstype = pcbWstype;
    }

    public String getPcbKey() {
        return pcbKey;
    }

    public void setPcbKey(String pcbKey) {
        this.pcbKey = pcbKey;
    }

    public String getPcbSalt() {
        return pcbSalt;
    }

    public void setPcbSalt(String pcbSalt) {
        this.pcbSalt = pcbSalt;
    }

    public String getPcbHashType() {
        return pcbHashType;
    }

    public void setPcbHashType(String pcbHashType) {
        this.pcbHashType = pcbHashType;
    }

    public String getPcbSignMethod() {
        return pcbSignMethod;
    }

    public void setPcbSignMethod(String pcbSignMethod) {
        this.pcbSignMethod = pcbSignMethod;
    }

    public String getPcbPwd() {
        return pcbPwd;
    }

    public void setPcbPwd(String pcbPwd) {
        this.pcbPwd = pcbPwd;
    }

    public Short getStatut() {
        return statut;
    }

    public void setStatut(Short statut) {
        this.statut = statut;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pcbId != null ? pcbId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TpParametrews)) {
            return false;
        }
        TpParametrews other = (TpParametrews) object;
        if ((this.pcbId == null && other.pcbId != null) || (this.pcbId != null && !this.pcbId.equals(other.pcbId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wfree.talipay.entities.TpParametrews[ pcbId=" + pcbId + " ]";
    }
    
}
