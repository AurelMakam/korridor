/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wfree.talipay.restservices.administration;

import com.wfree.talipay.entities.TpAdministrateur;
import com.wfree.talipay.metier.administration.AdministrateurMetier;
import com.wfree.talipay.metier.administration.PageAdministrateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author MS GRoUp
 */
@RestController
public class AdministrationRestService {
    
    @Autowired
    private AdministrateurMetier administrateurMetier ;
    
    @RequestMapping(value = "/administrateur", method = RequestMethod.POST)
    public TpAdministrateur saveAdministrateur(@RequestBody TpAdministrateur administrateur) {
        return administrateurMetier.saveAdmin(administrateur);
    }

    @RequestMapping(value = "/administrateur", method = RequestMethod.GET)
    public PageAdministrateur listAdministrateur(@RequestParam int page, @RequestParam int size) {
        return administrateurMetier.listAdministrateur(page, size);
    }
    
    
}
