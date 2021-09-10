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
		String bodyXML  = exchange.getProperty("XML_RESPONSE_NEXUS", String.class);
		DataToReturn object = exchange.getIn().getBody(DataToReturn.class);

		// Get TAG <string1>
		String string1 = XPathBuilder.xpath("/DATA/string1").evaluate(exchange.getContext(), bodyXML);
		object.setFecha_ult_fact_dolar(string1.split(";")[0]);
		object.setFecha_venc_fact_dolar(string1.split(";")[1]);
		
		// Get TAG <string2>
		String string2 = XPathBuilder.xpath("/DATA/string2").evaluate(exchange.getContext(), bodyXML);
		object.setFecha_prox_fact_calend(string2.split(";")[0]);
		object.setFecha_prox_venc_calend(string2.split(";")[1]);
		
		// Get TAG <string3>
		// 2019080720991231
		// AAAAMMDDAAAAMMDDX
		String string3 = XPathBuilder.xpath("/DATA/string3").evaluate(exchange.getContext(), bodyXML);
		object.setFecha_vig_eecc_desde(string3.substring(0, 8));
		object.setFecha_vig_eecc_hasta(string3.substring(8, 16));
//		object.setMarca(string3.substring(16, 17));
		
		}
}
