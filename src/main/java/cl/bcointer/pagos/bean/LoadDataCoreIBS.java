package cl.bcointer.pagos.bean;

import org.apache.camel.Exchange;
import org.jboss.logging.Logger;

import cl.bcointer.pagos.model.InputPayment;

public class LoadDataCoreIBS {
    private static final Logger logger = Logger.getLogger("LoadDataPayment");

	public void setDataCoreIBS(Exchange exchange) {
		this.getDataMonedaFactAndDeb(exchange);
		this.getDataOfFechaTx(exchange);
	}

	private void getDataOfFechaTx(Exchange exchange) {
		InputPayment dataPayment = exchange.getProperty("OBJECT_REQUEST_PAYMENT", InputPayment.class);
		String fechaTx = dataPayment.getFechaTx().trim();
		String fechaA = "";
		String fechaM = "";
		String fechaD = "";
		try{
			if ( !fechaTx.isEmpty()) {
				int lCaracteres = fechaTx.length();
				if(lCaracteres == 8) {
					fechaA = fechaTx.substring(0, 4);
					fechaM = fechaTx.substring(4, 6);
					fechaD = fechaTx.substring(6, 8);
				}
			}
		}catch(Exception e){
			logger.error(">>> PROBLEMAS EN DESGLOSE DE FECHA");
		}
		exchange.setProperty("E01TRAFPY", fechaA);
		exchange.setProperty("E01TRAFPM", fechaM);
		exchange.setProperty("E01TRAFPD", fechaD);
	}

	private void getDataMonedaFactAndDeb(Exchange exchange) {
		String monedaFact = "";
		String monedaDeb = "";
		InputPayment dataPayment = exchange.getProperty("OBJECT_REQUEST_PAYMENT", InputPayment.class);
		String dataMonedaFact = dataPayment.getMonedaFact();
		if (dataMonedaFact.equals("152")) {
			monedaFact = "P001";
			monedaDeb = "CLP";
		} else {
			if (dataMonedaFact.equals("849")) {
				monedaFact = "P001";
				monedaDeb = "CLP";
			}
		}
		exchange.setProperty("E01SISORI", monedaFact);
		exchange.setProperty("E01CODCCY", monedaDeb);
		exchange.setProperty("E01CODCCC", monedaDeb);		
	}
}
