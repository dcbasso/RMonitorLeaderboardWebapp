package br.com.dantebasso.rmonitor.services;

import de.odysseus.staxon.json.jaxrs.jaxb.JsonXMLArrayProvider;
import de.odysseus.staxon.json.jaxrs.jaxb.JsonXMLObjectProvider;
import java.util.Set;
import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.moxy.json.MoxyJsonFeature;
import org.glassfish.jersey.server.ResourceConfig;

/**
 *
 * @author Dante Cesar Basso Filho
 * @since 2017/06/06
 */
@javax.ws.rs.ApplicationPath("rest")
public class ApplicationConfig extends ResourceConfig {

    public ApplicationConfig() {
        // Resources.
        packages("br.com.dantebasso.rmonitor");
        packages("org.eclipse.persistence.jpa.rs");

        // Providers - JSON.
        register(JsonXMLObjectProvider.class);
        register(JsonXMLArrayProvider.class);

        register(MoxyJsonFeature.class);
        register(MultiPartFeature.class);

    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(br.com.dantebasso.rmonitor.services.generic.ServerRest.class);
        resources.add(br.com.dantebasso.rmonitor.services.runner.RunnerService.class);
    }

}