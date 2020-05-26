/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wfree.talipay.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import com.wfree.talipay.entities.TpAdministrateur;
/**
 *
 * @author EUC
 */
public interface AdministrateurRepository extends JpaRepository<TpAdministrateur, Long>{
   
}
