/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wfree.talipay.metier.administration;

import com.wfree.talipay.entities.TpAdministrateur;
import java.util.List;
/**
 *
 * @author EUC
 */
public interface AdministrateurMetier {
    public TpAdministrateur saveAdmin(TpAdministrateur admin);
    public PageAdministrateur listAdministrateur(int page, int size);
}
