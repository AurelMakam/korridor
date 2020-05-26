/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wfree.talipay.soapservices;

import com.wfree.talipay.entities.TpAdministrateur;
import com.wfree.talipay.metier.administration.AdministrateurMetier;
import com.wfree.talipay.metier.administration.PageAdministrateur;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author MS GRoUp
 */
@Component
@WebService
public class TalipaySoapService {
    
    @Autowired
    private AdministrateurMetier adminMetier ;
    
    // get administrateur
    
    @WebMethod
    public PageAdministrateur getAdministrateur(@WebParam(name="page")int page, @WebParam(name="size")int size) {
        return adminMetier.listAdministrateur(page, size);
    }
}
