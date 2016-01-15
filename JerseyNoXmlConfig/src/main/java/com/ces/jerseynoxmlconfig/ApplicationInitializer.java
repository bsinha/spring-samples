package com.ces.jerseynoxmlconfig;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.glassfish.jersey.servlet.ServletContainer;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import com.ces.jerseynoxmlconfig.config.JerseyConfiguration;
import com.ces.jerseynoxmlconfig.config.SpringConfiguration;


public class ApplicationInitializer implements WebApplicationInitializer {
	
	private static final String REST_MAPPING = "/rest/*";

	public void onStartup(ServletContext servletContext) throws ServletException {
		 addSpring(servletContext);
		 addJersey(servletContext);
	}

	private void addSpring(ServletContext servletContext) {
		
		servletContext.setInitParameter(ContextLoader.CONTEXT_CLASS_PARAM, AnnotationConfigWebApplicationContext.class.getName());
		servletContext.setInitParameter(ContextLoader.CONFIG_LOCATION_PARAM, SpringConfiguration.class.getName());
		servletContext.addListener(new ContextLoaderListener());

		/*// Manage the lifecycle of the root application context
		 * AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
		rootContext.register(SpringConfiguration.class);
		servletContext.addListener(new ContextLoaderListener(rootContext));

		      // Create the dispatcher servlet's Spring application context
		      AnnotationConfigWebApplicationContext dispatcherContext =
		        new AnnotationConfigWebApplicationContext();
		      dispatcherContext.register(DispatcherConfig.class);

		      // Register and map the dispatcher servlet
		      ServletRegistration.Dynamic dispatcher =
		    		  servletContext.addServlet("dispatcher", new DispatcherServlet(dispatcherContext));
		      dispatcher.setLoadOnStartup(1);
		      dispatcher.addMapping("/");*/
		
	}
	
	private void addJersey(ServletContext servletContext) {
	      ServletRegistration.Dynamic jerseyServlet = servletContext.addServlet("Jersey Rest Service", ServletContainer.class);
	      jerseyServlet.setInitParameter("javax.ws.rs.Application", JerseyConfiguration.class.getName());
	      jerseyServlet.setLoadOnStartup(1);
	      jerseyServlet.addMapping(REST_MAPPING);
		
	}

}
