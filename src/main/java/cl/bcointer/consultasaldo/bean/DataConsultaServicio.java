package cl.bcointer.consultasaldo.bean;

import org.apache.camel.Exchange;
import org.jboss.logging.Logger;

public class DataConsultaServicio {
    private static final Logger logger = Logger.getLogger("LoadData");

	public void loadDataCM(Exchange exchange) {
		exchange.setProperty("CODIGO-SERVICIO", System.getenv().getOrDefault("COD-SERVICIO", "No existe en CONFIG-MAP"));
		exchange.setProperty("ID-EMISOR", System.getenv().getOrDefault("ID-EMISOR", "No existe en CONFIG-MAP"));
		exchange.setProperty("USER-CALL-SOAP", System.getenv().getOrDefault("USER-CALL-SOAP", "No existe en SECRET"));
		
		logger.info(">>> CODIGO-SERVICIO : " + exchange.getProperty("CODIGO-SERVICIO"));
		logger.info(">>> ID-EMISOR : " + exchange.getProperty("CODIGO-SERVICIO"));
		logger.info(">>> USER-CALL-SOAP : " + exchange.getProperty("CODIGO-SERVICIO"));
		
		
		

	}
}
