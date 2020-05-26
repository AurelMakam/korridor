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
@Table(name = "tp_utilisateurfonctionnalite", catalog = "bd_talipay", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TpUtilisateurfonctionnalite.findAll", query = "SELECT t FROM TpUtilisateurfonctionnalite t")
    , @NamedQuery(name = "TpUtilisateurfonctionnalite.findById", query = "SELECT t FROM TpUtilisateurfonctionnalite t WHERE t.id = :id")
    , @NamedQuery(name = "TpUtilisateurfonctionnalite.findByStatut", query = "SELECT t FROM TpUtilisateurfonctionnalite t WHERE t.statut = :statut")
    , @NamedQuery(name = "TpUtilisateurfonctionnalite.findByUfDateCreate", query = "SELECT t FROM TpUtilisateurfonctionnalite t WHERE t.ufDateCreate = :ufDateCreate")})
public class TpUtilisateurfonctionnalite implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "statut")
    private Short statut;
    @Column(name = "ufDateCreate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ufDateCreate;
    @JoinColumn(name = "fnCode", referencedColumnName = "fnCode", nullable = false)
    @ManyToOne(optional = false)
    private TpFonctionnalite fnCode;
    @JoinColumn(name = "usrId", referencedColumnName = "usrId", nullable = false)
    @ManyToOne(optional = false)
    private TpUtilisateur usrId;

    public TpUtilisateurfonctionnalite() {
    }

    public TpUtilisateurfonctionnalite(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Short getStatut() {
        return statut;
    }

    public void setStatut(Short statut) {
        this.statut = statut;
    }

    public Date getUfDateCreate() {
        return ufDateCreate;
    }

    public void setUfDateCreate(Date ufDateCreate) {
        this.ufDateCreate = ufDateCreate;
    }

    public TpFonctionnalite getFnCode() {
        return fnCode;
    }

    public void setFnCode(TpFonctionnalite fnCode) {
        this.fnCode = fnCode;
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
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TpUtilisateurfonctionnalite)) {
            return false;
        }
        TpUtilisateurfonctionnalite other = (TpUtilisateurfonctionnalite) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.wfree.talipay.entities.TpUtilisateurfonctionnalite[ id=" + id + " ]";
    }
    
}
