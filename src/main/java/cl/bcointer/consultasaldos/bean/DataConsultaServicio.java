package cl.bcointer.consultasaldos.bean;

import org.apache.camel.Exchange;

public class DataConsultaServicio {

	public Exchange loadDataCM(Exchange exchange) {
		exchange.setProperty("CODIGO-SERVICIO", System.getenv().getOrDefault("COD-SERVICIO", "No existe en property"));
		exchange.setProperty("ID-EMISOR", System.getenv().getOrDefault("ID-EMISOR", "No existe en property"));
		return exchange;
	}
}
