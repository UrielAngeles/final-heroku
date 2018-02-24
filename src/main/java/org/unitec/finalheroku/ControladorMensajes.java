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
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author UriDrack7
 */

@RestController
@CrossOrigin    //Origenes Cruzados, ira de un servidor a otro
@RequestMapping("/api")
public class ControladorMensajes {
    @Autowired RepositorioMensajito repoMensa;

    //Buscar Todos
    @CrossOrigin
    @RequestMapping(value = "/mensajito",method = RequestMethod.GET,
            headers = {"Accept=application/json"})
    public ArrayList<Mensajito> hola(){
      
        return(ArrayList<Mensajito>) repoMensa.findAll(); 
    }
    
    //Buscar por ID
    @CrossOrigin
    @RequestMapping(value = "/mensajito/{Id}",method = RequestMethod.GET,
            headers = {"Accept=application/json"})
    public Mensajito hola(@PathVariable String Id){
      
        return repoMensa.findOne(Id); 
    }
    
    //Actualizar
    @CrossOrigin
    @RequestMapping(value="/mensajito/{Id}/{titulo}/{cuerpo}",method=RequestMethod.PUT,
            headers={"Accept=application/json"})
    
    public Estatus actualizar(@PathVariable String Id,@PathVariable String titulo, @PathVariable String cuerpo){
        repoMensa.save(new Mensajito(Id, titulo,cuerpo));
        return new Estatus(true, "Actualizado con exito");
    }
    
    //Guardar
    @CrossOrigin
    @RequestMapping(value="/mensajito/{titulo}/{cuerpo}",method=RequestMethod.POST,
            headers={"Accept=application/json"})
    
    public Estatus guardar(@PathVariable String titulo, @PathVariable String cuerpo){
        repoMensa.save(new Mensajito(titulo,cuerpo));
        return new Estatus(true, "Guardado con exito");
    }
    
    //Borrar
    @CrossOrigin
    @RequestMapping(value="/mensajito/{Id}", method= RequestMethod.DELETE, 
            headers={"Accept=application/json"})
    public Estatus borrarMensaje(@PathVariable String Id){
    
        Estatus estatus=new Estatus(true, "Borrado con Exito");
        repoMensa.delete(new Mensajito(Id));
        
        return estatus;
    }
}