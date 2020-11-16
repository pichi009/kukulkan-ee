
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nabenik.kukulkan.controller;

import com.nabenik.kukulkan.model.Pillinada;
import com.nabenik.kukulkan.repository.*;
import java.util.List;
import javax.ws.rs.Produces;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author wprosal
 */
@Path("/pillinadas")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PillinadaController {
    
    @Inject
   PillinadaInterface pillinadaRepository;
    
    @GET
    public List<Pillinada> findPillinadas(@QueryParam("author") String author)
    {
        List<Pillinada> pillinada = pillinadaRepository.findByAuthorLike(author);
        
        if (pillinada == null) {
            return (List<Pillinada>) Response.status(Response.Status.NOT_FOUND).build();
        }
        return (List<Pillinada>) Response.ok(pillinada).build();
    }
    
    @POST
    public Response  createPillinada(Pillinada pillinada){
   pillinada = pillinadaRepository.save(pillinada);
   return Response.accepted().build();
}
    
}
