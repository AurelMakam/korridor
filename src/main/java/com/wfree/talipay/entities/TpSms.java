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
@Table(name = "tp_sms", catalog = "bd_talipay", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TpSms.findAll", query = "SELECT t FROM TpSms t")
    , @NamedQuery(name = "TpSms.findBySmsId", query = "SELECT t FROM TpSms t WHERE t.smsId = :smsId")
    , @NamedQuery(name = "TpSms.findBySmsContent", query = "SELECT t FROM TpSms t WHERE t.smsContent = :smsContent")
    , @NamedQuery(name = "TpSms.findBySmsDeliveryStatus", query = "SELECT t FROM TpSms t WHERE t.smsDeliveryStatus = :smsDeliveryStatus")
    , @NamedQuery(name = "TpSms.findBySmsDate", query = "SELECT t FROM TpSms t WHERE t.smsDate = :smsDate")
    , @NamedQuery(name = "TpSms.findBySmsDeliveryDate", query = "SELECT t FROM TpSms t WHERE t.smsDeliveryDate = :smsDeliveryDate")})
public class TpSms implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "smsId", nullable = false)
    private Long smsId;
    @Column(name = "smsContent", length = 254)
    private String smsContent;
    @Column(name = "smsDeliveryStatus")
    private Short smsDeliveryStatus;
    @Column(name = "smsDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date smsDate;
    @Column(name = "smsDeliveryDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date smsDeliveryDate;
    @JoinColumn(name = "txnId", referencedColumnName = "txnId", nullable = false)
    @ManyToOne(optional = false)
    private TpTransaction txnId;
    @JoinColumn(name = "usrId", referencedColumnName = "usrId", nullable = false)
    @ManyToOne(optional = false)
    private TpUtilisateur usrId;

    public TpSms() {
    }

    public TpSms(Long smsId) {
        this.smsId = smsId;
    }

    public Long getSmsId() {
        return smsId;
    }

    public void setSmsId(Long smsId) {
        this.smsId = smsId;
    }

    public String getSmsContent() {
        return smsContent;
    }

    public void setSmsContent(String smsContent) {
        this.smsContent = smsContent;
    }

    public Short getSmsDeliveryStatus() {
        return smsDeliveryStatus;
    }

    public void setSmsDeliveryStatus(Short smsDeliveryStatus) {
        this.smsDeliveryStatus = smsDeliveryStatus;
    }

    public Date getSmsDate() {
        return smsDate;
    }

    public void setSmsDate(Date smsDate) {
        this.smsDate = smsDate;
    }

    public Date getSmsDeliveryDate() {
        return smsDeliveryDate;
    }

    public void setSmsDeliveryDate(Date smsDeliveryDate) {
        this.smsDeliveryDate = smsDeliveryDate;
    }

    public TpTransaction getTxnId() {
        return txnId;
    }

    public void setTxnId(TpTransaction txnId) {
        this.txnId = txnId;
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
        hash += (smsId != null ? smsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TpSms)) {
            return false;
        }
        TpSms other = (TpSms) object;
        if ((this.smsId == null && other.smsId != null) || (this.smsId != null && !this.smsId.equals(other.smsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wfree.talipay.entities.TpSms[ smsId=" + smsId + " ]";
    }
    
}
