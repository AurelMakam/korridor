/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wfree.talipay.dao;

import com.wfree.talipay.entities.TpCartevirtuelle;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author EUC
 */
public interface CarteVirtuelRepository extends JpaRepository<TpCartevirtuelle, Long>{
    
}
