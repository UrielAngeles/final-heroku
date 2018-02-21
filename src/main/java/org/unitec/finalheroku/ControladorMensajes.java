/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec.finalheroku;

import java.lang.reflect.Method;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author UriDrack7
 */

@RestController
@RequestMapping("/api")
public class ControladorMensajes {
    @Autowired RepositorioMensajito repoMensa;
    
    @RequestMapping(value = "/mensajito",method = RequestMethod.GET,
            headers = {"Accept=application/json"})
    public ArrayList<Mensajito> hola(){
      
        return(ArrayList<Mensajito>) repoMensa.findAll();
        
    }
    
    @RequestMapping(value="/mensajito/{Id}/{titulo}/{cuerpo}",method=RequestMethod.GET,
            headers={"Accept=application/json"})
    
    public Estatus guardar(@PathVariable String Id,@PathVariable String titulo, @PathVariable String cuerpo){
        repoMensa.save(new Mensajito(Id, titulo,cuerpo));
        return new Estatus(true, "Guardado con exito");
    }
}