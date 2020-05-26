/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wfree.talipay.metier.administration;

import com.wfree.talipay.dao.AdministrateurRepository;
import com.wfree.talipay.entities.TpAdministrateur;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 *
 * @author MS GRoUp
 */
public class AdministrateurMetierImp implements AdministrateurMetier{

    @Autowired
    private AdministrateurRepository adminRepo ;
    
    @Override
    public TpAdministrateur saveAdmin(TpAdministrateur admin) {
        return adminRepo.save(admin);
    }

    @Override
    public PageAdministrateur listAdministrateur(int page, int size) {
        Page<TpAdministrateur> pag = adminRepo.findAll(PageRequest.of(page, size));
        PageAdministrateur pageAdmin = new PageAdministrateur();
        pageAdmin.setAdministrateurs(pag.getContent());
        pageAdmin.setNombreAdministrateur(pag.getNumberOfElements());
        pageAdmin.setPage(pag.getNumber());
        pageAdmin.setTotalPages(pag.getTotalPages());
        pageAdmin.setTotalAdministrateur((int)pag.getTotalElements());
        return pageAdmin ;
    }
    
}
