/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wfree.talipay.metier.administration;

import com.wfree.talipay.entities.TpAdministrateur;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author MS GRoUp
 */
public class PageAdministrateur implements Serializable{
    private List<TpAdministrateur> administrateurs ;
    private int page ;
    private int nombreAdministrateur;
    private int totalAdministrateur ;
    private int totalPages;

    public List<TpAdministrateur> getAdministrateurs() {
        return administrateurs;
    }

    public void setAdministrateurs(List<TpAdministrateur> administrateurs) {
        this.administrateurs = administrateurs;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getNombreAdministrateur() {
        return nombreAdministrateur;
    }

    public void setNombreAdministrateur(int nombreAdministrateur) {
        this.nombreAdministrateur = nombreAdministrateur;
    }

    public int getTotalAdministrateur() {
        return totalAdministrateur;
    }

    public void setTotalAdministrateur(int totalAdministrateur) {
        this.totalAdministrateur = totalAdministrateur;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }
    
    
}
