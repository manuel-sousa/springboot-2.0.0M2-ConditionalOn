/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author mjs
 */
@ConditionalOnProperty("xpto")
public interface XptoRepository extends CrudRepository<Xpto,Integer>{

}
