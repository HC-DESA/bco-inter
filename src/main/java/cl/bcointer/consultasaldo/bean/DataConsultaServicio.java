package cl.bcointer.consultasaldo.bean;

import org.apache.camel.Exchange;
import org.jboss.logging.Logger;

public class DataConsultaServicio {
    private static final Logger logger = Logger.getLogger("LoadData");

	public void loadDataCM(Exchange exchange) {
		// DATA CONFIG-MAP
		exchange.setProperty("CODIGO-SERVICIO", System.getenv().getOrDefault("COD-SERVICIO", "No existe en CONFIG-MAP"));
		exchange.setProperty("ID-EMISOR", System.getenv().getOrDefault("ID-EMISOR", "No existe en CONFIG-MAP"));
		// DATA SECRET
		exchange.setProperty("USER-CALL-SOAP", System.getenv().getOrDefault("USER-CALL-SOAP", "No existe en SECRET"));
		exchange.setProperty("PASSWORD-CALL-SOAP", System.getenv().getOrDefault("PASSWORD-CALL-SOAP", "No existe en SECRET"));
		exchange.setProperty("CODIGO-USUARIO", System.getenv().getOrDefault("COD-USUARIO", "No existe en SECRET"));
		exchange.setProperty("DIR-IP", System.getenv().getOrDefault("DIR-IP", "No existe en SECRET"));
		
		logger.info(">>> CODIGO-SERVICIO : " + exchange.getProperty("CODIGO-SERVICIO"));
		logger.info(">>> ID-EMISOR : " + exchange.getProperty("ID-EMISOR"));
		logger.info(">>> USER-CALL-SOAP : " + exchange.getProperty("USER-CALL-SOAP"));
		logger.info(">>> PASSWORD-CALL-SOAP : " + exchange.getProperty("PASSWORD-CALL-SOAP"));
		logger.info(">>> CODIGO-USUARIO : " + exchange.getProperty("CODIGO-USUARIO"));
		logger.info(">>> DIR-IP : " + exchange.getProperty("DIR-IP"));
		
		
		

	}
}
