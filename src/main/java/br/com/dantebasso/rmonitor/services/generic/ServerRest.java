/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dantebasso.rmonitor.services.generic;

import javax.ejb.Stateless;
import javax.json.Json;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author dcbasso
 */
@Stateless
@Path("/server")
public class ServerRest {
    
    @GET
    @Path("/status")
    @Produces( {MediaType.APPLICATION_JSON} )
    public String getStatus() {
        return Json.createObjectBuilder()
                .add("status", "ok")
                .add("code", "1")
                .build().toString();
    }
    
}
