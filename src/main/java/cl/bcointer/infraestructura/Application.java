package cl.bcointer.infraestructura;

import org.apache.camel.component.servlet.CamelHttpTransportServlet;
import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

/**
 * A spring-boot application that includes a Camel route builder to setup the Camel routes
 */
@SpringBootApplication
@ImportResource({"classpath:spring/camel-context.xml"})
public class Application {
    private static final Logger logger = Logger.getLogger("");

    // must have a main method spring-boot can run
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        logger.info("*** CARGA 1 = " + System.getenv().getOrDefault("GREETING_PREFIX", "Hi"));

    }
    @Bean
    ServletRegistrationBean servletRegistrationBean() {
        ServletRegistrationBean servlet = new ServletRegistrationBean(
            new CamelHttpTransportServlet(), "/rest/*");
        servlet.setName("CamelServlet");
        return servlet;
    }

}
