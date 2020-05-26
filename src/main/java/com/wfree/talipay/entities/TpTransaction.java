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
@Table(name = "tp_transaction", catalog = "bd_talipay", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TpTransaction.findAll", query = "SELECT t FROM TpTransaction t")
    , @NamedQuery(name = "TpTransaction.findByTxnId", query = "SELECT t FROM TpTransaction t WHERE t.txnId = :txnId")
    , @NamedQuery(name = "TpTransaction.findByTxnAmount", query = "SELECT t FROM TpTransaction t WHERE t.txnAmount = :txnAmount")
    , @NamedQuery(name = "TpTransaction.findByTxnFees", query = "SELECT t FROM TpTransaction t WHERE t.txnFees = :txnFees")
    , @NamedQuery(name = "TpTransaction.findByTxnTax", query = "SELECT t FROM TpTransaction t WHERE t.txnTax = :txnTax")
    , @NamedQuery(name = "TpTransaction.findByTxnResultCode", query = "SELECT t FROM TpTransaction t WHERE t.txnResultCode = :txnResultCode")
    , @NamedQuery(name = "TpTransaction.findByTxnResultDesc", query = "SELECT t FROM TpTransaction t WHERE t.txnResultDesc = :txnResultDesc")
    , @NamedQuery(name = "TpTransaction.findByTxnComment", query = "SELECT t FROM TpTransaction t WHERE t.txnComment = :txnComment")
    , @NamedQuery(name = "TpTransaction.findByTxnDatetime", query = "SELECT t FROM TpTransaction t WHERE t.txnDatetime = :txnDatetime")
    , @NamedQuery(name = "TpTransaction.findByStatut", query = "SELECT t FROM TpTransaction t WHERE t.statut = :statut")
    , @NamedQuery(name = "TpTransaction.findByTxnDevise", query = "SELECT t FROM TpTransaction t WHERE t.txnDevise = :txnDevise")
    , @NamedQuery(name = "TpTransaction.findByTxnSource", query = "SELECT t FROM TpTransaction t WHERE t.txnSource = :txnSource")
    , @NamedQuery(name = "TpTransaction.findByTxnDestination", query = "SELECT t FROM TpTransaction t WHERE t.txnDestination = :txnDestination")})
public class TpTransaction implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "txnId", nullable = false)
    private Long txnId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "txnAmount", precision = 22)
    private Double txnAmount;
    @Column(name = "txnFees", precision = 22)
    private Double txnFees;
    @Column(name = "txnTax", precision = 22)
    private Double txnTax;
    @Column(name = "txnResultCode")
    private Integer txnResultCode;
    @Column(name = "txnResultDesc", length = 254)
    private String txnResultDesc;
    @Column(name = "txnComment", length = 254)
    private String txnComment;
    @Column(name = "txnDatetime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date txnDatetime;
    @Column(name = "statut")
    private Short statut;
    @Column(name = "txnDevise", length = 254)
    private String txnDevise;
    @Column(name = "txnSource", length = 50)
    private String txnSource;
    @Column(name = "txnDestination", length = 50)
    private String txnDestination;
    @JoinColumn(name = "ttnId", referencedColumnName = "ttnId", nullable = false)
    @ManyToOne(optional = false)
    private TpTypetransaction ttnId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "txnId")
    private List<TpSms> tpSmsList;

    public TpTransaction() {
    }

    public TpTransaction(Long txnId) {
        this.txnId = txnId;
    }

    public Long getTxnId() {
        return txnId;
    }

    public void setTxnId(Long txnId) {
        this.txnId = txnId;
    }

    public Double getTxnAmount() {
        return txnAmount;
    }

    public void setTxnAmount(Double txnAmount) {
        this.txnAmount = txnAmount;
    }

    public Double getTxnFees() {
        return txnFees;
    }

    public void setTxnFees(Double txnFees) {
        this.txnFees = txnFees;
    }

    public Double getTxnTax() {
        return txnTax;
    }

    public void setTxnTax(Double txnTax) {
        this.txnTax = txnTax;
    }

    public Integer getTxnResultCode() {
        return txnResultCode;
    }

    public void setTxnResultCode(Integer txnResultCode) {
        this.txnResultCode = txnResultCode;
    }

    public String getTxnResultDesc() {
        return txnResultDesc;
    }

    public void setTxnResultDesc(String txnResultDesc) {
        this.txnResultDesc = txnResultDesc;
    }

    public String getTxnComment() {
        return txnComment;
    }

    public void setTxnComment(String txnComment) {
        this.txnComment = txnComment;
    }

    public Date getTxnDatetime() {
        return txnDatetime;
    }

    public void setTxnDatetime(Date txnDatetime) {
        this.txnDatetime = txnDatetime;
    }

    public Short getStatut() {
        return statut;
    }

    public void setStatut(Short statut) {
        this.statut = statut;
    }

    public String getTxnDevise() {
        return txnDevise;
    }

    public void setTxnDevise(String txnDevise) {
        this.txnDevise = txnDevise;
    }

    public String getTxnSource() {
        return txnSource;
    }

    public void setTxnSource(String txnSource) {
        this.txnSource = txnSource;
    }

    public String getTxnDestination() {
        return txnDestination;
    }

    public void setTxnDestination(String txnDestination) {
        this.txnDestination = txnDestination;
    }

    public TpTypetransaction getTtnId() {
        return ttnId;
    }

    public void setTtnId(TpTypetransaction ttnId) {
        this.ttnId = ttnId;
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
        hash += (txnId != null ? txnId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TpTransaction)) {
            return false;
        }
        TpTransaction other = (TpTransaction) object;
        if ((this.txnId == null && other.txnId != null) || (this.txnId != null && !this.txnId.equals(other.txnId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wfree.talipay.entities.TpTransaction[ txnId=" + txnId + " ]";
    }
    
}
