package cl.bcointer.consultasaldo.bean;

import org.apache.camel.Exchange;
import org.apache.camel.builder.xml.XPathBuilder;
import org.jboss.logging.Logger;

import cl.bcointer.consultasaldo.objetos.DataInput;
import cl.bcointer.consultasaldo.objetos.DataToReturn;

public class DataConsultaServicio {
    private static final Logger logger = Logger.getLogger("LoadData");

	public void loadDataCM(Exchange exchange) {
		// DATA CONFIG-MAP
		exchange.setProperty("CODIGO_SERVICIO", System.getenv().getOrDefault("COD-SERVICIO", "No existe en CONFIG-MAP"));
		exchange.setProperty("ID_EMISOR", System.getenv().getOrDefault("ID-EMISOR", "No existe en CONFIG-MAP"));
		// DATA SECRET
		exchange.setProperty("USER_CALL_SOAP", System.getenv().getOrDefault("USER-CALL-SOAP", "No existe en SECRET"));
		exchange.setProperty("PASSWORD_CALL_SOAP", System.getenv().getOrDefault("PASSWORD-CALL-SOAP", "No existe en SECRET"));
		exchange.setProperty("CODIGO_USUARIO", System.getenv().getOrDefault("COD-USUARIO", "No existe en SECRET"));
		exchange.setProperty("DIR_IP", System.getenv().getOrDefault("DIR-IP", "No existe en SECRET"));
		
		logger.info(">>> CODIGO-SERVICIO : " + exchange.getProperty("CODIGO_SERVICIO"));
		logger.info(">>> ID-EMISOR : " + exchange.getProperty("ID_EMISOR"));
		logger.info(">>> USER-CALL-SOAP : " + exchange.getProperty("USER_CALL_SOAP"));
		logger.info(">>> PASSWORD-CALL-SOAP : " + exchange.getProperty("PASSWORD_CALL_SOAP"));
		logger.info(">>> CODIGO-USUARIO : " + exchange.getProperty("CODIGO_USUARIO"));
		logger.info(">>> DIR-IP : " + exchange.getProperty("DIR_IP"));
				

	}
	
	public void loadDataXPATH(Exchange exchange) {
		// DATA CONFIG-MAP
//		fecha_ult_fact_dolar
//		String bodyXML  = exchange.getIn().getBody(String.class);
		String bodyXML  = exchange.getProperty("XML_RESPONSE_NEXUS", String.class);

		String coderror = XPathBuilder.xpath("/DATA/string1").evaluate(exchange.getContext(), bodyXML);

		logger.info(">>> Fecha String 1 : " + coderror);
		logger.info(">>> Fecha String 1 : " + coderror.split(";")[0]);
		DataToReturn object = exchange.getIn().getBody(DataToReturn.class);
		object.setFecha_ult_fact_dolar(coderror.split(";")[0]);
		
		
		
		
		

	}
}
