/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dantebasso.rmonitor.services.runner;

import br.com.dantebasso.rmonitor.domain.runner.Run;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import javax.servlet.ServletContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import org.json.JSONObject;

/**
 *
 * @author dcbasso
 */
@Stateless
@Path("/run")
public class RunnerService {
    
    @Context
    private ServletContext context;
    
    @POST
    @Path("/update")
    @Consumes( {MediaType.APPLICATION_JSON} )
    @Produces( {MediaType.APPLICATION_JSON} )
    public String update(Run run) {
        context.setAttribute("run", run);
        return new JSONObject().put("update", "true").toString();
    }
    
    @GET
    @Path("/data")
    @Produces( {MediaType.APPLICATION_JSON} )
    public Run update() {
        Run run = null;
        Object obj = context.getAttribute("run");
        if (obj != null) {
            run = (Run) context.getAttribute("run");
        }
        return run;
    }
    
}
