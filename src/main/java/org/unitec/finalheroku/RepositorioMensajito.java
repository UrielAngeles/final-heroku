/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.finalheroku;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author UriDrack7
 */
public interface RepositorioMensajito extends MongoRepository<Mensajito, String>{
    
}
