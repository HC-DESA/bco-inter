package cl.bcointer.consultasaldo.bean;

import java.security.SecureRandom;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.constraints.NotNull;

import org.apache.camel.Exchange;
import org.apache.camel.builder.xml.XPathBuilder;
import org.jboss.logging.Logger;

import cl.bcointer.consultasaldo.objetos.DataInput;
import cl.bcointer.consultasaldo.objetos.DataToReturn;

public class DataConsultaServicio {
    private static final Logger logger = Logger.getLogger("LoadData");

	public void loadDataCM(Exchange exchange) {
		exchange.setProperty("CODIGO_SERVICIO", System.getenv().getOrDefault("COD-SERVICIO", ""));
		exchange.setProperty("USER_CALL_SOAP", System.getenv().getOrDefault("USER-CALL-SOAP", ""));
		exchange.setProperty("PASSWORD_CALL_SOAP", System.getenv().getOrDefault("PASSWORD-CALL-SOAP", ""));
		exchange.setProperty("CODIGO_USUARIO", System.getenv().getOrDefault("COD-USUARIO", ""));
		exchange.setProperty("DIR_IP", System.getenv().getOrDefault("DIR-IP", ""));

		
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		Date date = new Date();
		SecureRandom r = new SecureRandom(); 
		byte bytes[] = new byte[20];
		r.nextBytes(bytes);
		exchange.setProperty("ID_REQ", dateFormat.format(date) + "" + String.format("%03d", r.nextInt(1000)) + String.format("%03d", r.nextInt(1000)));
		exchange.setProperty("ID_EMISOR", dateFormat.format(date) + "" + String.format("%03d", r.nextInt(1000)));
		exchange.setProperty("DATE_TIME_SERVICIO_MILLIS", date.toInstant().toEpochMilli());
	}
	
	public void loadDataXPATH(Exchange exchange) {
		DataToReturn object = exchange.getIn().getBody(DataToReturn.class);

	    this.getDateOfString(exchange);
		
		object .setMtoPfijo9(this.setNumb(object.getMtoPfijo9()));
	
		object.setCupoNacional(this.setNumb(object.getCupoNacional()));
		object.setCupoInt(this.setNumbD(object.getCupoInt()));
		object.setCupoLinea2(this.setNumb(object.getCupoLinea2()));
		object.setCupoVirtual(this.setNumb(object.getCupoVirtual()));
		object.setCupoVirtualInt(this.setNumbD(object.getCupoVirtualInt()));
		object.setDeudaNacCta(this.setNumb(object.getDeudaNacCta()));
		object.setDeudaIntCta(this.setNumbD(object.getDeudaIntCta()));		
		object.setDeudaL2Cta(this.setNumb(object.getDeudaL2Cta()));
		object.setDeudaMoraNacCta(this.setNumb(object.getDeudaMoraNacCta()));
		object.setDeudaMoraIntCta(this.setNumbD(object.getDeudaMoraIntCta()));
		object.setDeudaNacFactCta(this.setNumb(object.getDeudaNacFactCta()));
		object.setDeudaIntFactCta(this.setNumbD(object.getDeudaIntFactCta()));		
		object.setDispNacCta(this.setNumb(object.getDispNacCta()));
		object.setDispIntCta(this.setNumbD(object.getDispIntCta()));
		object.setDispL2Cta(this.setNumb(object.getDispL2Cta()));
		object.setSaldoCreditoCuotaCapital(this.setNumb(object.getSaldoCreditoCuotaCapital()));
		object.setDispAvancesCta(this.setNumb(object.getDispAvancesCta()));
		object.setDispAvancesDolarCta(this.setNumbD(object.getDispAvancesDolarCta()));

		object.setMora130d(this.setNumb(object.getMora130d()));
		object.setMora3160d(this.setNumb(object.getMora3160d()));
		object.setMora6190d(this.setNumb(object.getMora6190d()));
		object.setMora91120d(this.setNumb(object.getMora91120d()));
		object.setMora121150d(this.setNumb(object.getMora121150d()));
		object.setMora151180d(this.setNumb(object.getMora151180d()));
		object.setMora181210d(this.setNumb(object.getMora181210d()));
		object.setMora210999d(this.setNumb(object.getMora210999d()));
		
		object.setRecargoCob130d(this.setNumb(object.getRecargoCob130d()));
		object.setRecargoCob3160d(this.setNumb(object.getRecargoCob3160d()));
		object.setRecargoCob6190d(this.setNumb(object.getRecargoCob6190d()));
		object.setRecargoCob91120d(this.setNumb(object.getRecargoCob91120d()));
		object.setRecargoCob121150d(this.setNumb(object.getRecargoCob121150d()));
		object.setRecargoCob151180d(this.setNumb(object.getRecargoCob151180d()));
		object.setRecargoCob181210d(this.setNumb(object.getRecargoCob181210d()));
		object.setRecargoCob210999d(this.setNumb(object.getRecargoCob210999d()));
		
		object.setPagoMinimo(this.setNumb(object.getPagoMinimo()));
		object.setSldoColNac(this.setNumb(object.getSldoColNac()));
		object.setSldoColInt(this.setNumbD(object.getSldoColInt()));
		
		object.setInteresXCobrarOper(this.setNumb(object.getInteresXCobrarOper()));
		object.setInteresXCobrarCorr(this.setNumb(object.getInteresXCobrarCorr()));
		object.setInteresXCobrarPenales(this.setNumb(object.getInteresXCobrarPenales()));

		object.setInteresDevCorr(this.setNumb(object.getInteresDevCorr()));
		object.setInteresDevPenales(this.setNumb(object.getInteresDevPenales()));
		
		object.setInteresPercCorr(this.setNumb(object.getInteresPercCorr()));
		object.setInteresPercPenales(this.setNumb(object.getInteresPercPenales()));
		
		object.setDeudaTotal(this.setNumb(object.getDeudaTotal()));
		object.setColocacionMes(this.setNumb(object.getColocacionMes()));
		object.setMontoCompraMes(this.setNumb(object.getMontoCompraMes()));
		object.setMontoAvanceMes(this.setNumb(object.getMontoAvanceMes()));
		object.setMontoUltimoPagoPeso(this.setNumb(object.getMontoUltimoPagoPeso()));
		object.setMontoUltimoPagoDolar(this.setNumbD(object.getMontoUltimoPagoDolar()));
		object.setMontoCobroAdm(this.setNumb(object.getMontoCobroAdm()));
		object.setConsumoPesos(this.setNumb(object.getConsumoPesos()));
		object.setConsumoDolar(this.setNumbD(object.getConsumoDolar()));
		
		object.setPagosPesosCiclo(this.setNumb(object.getPagosPesosCiclo()));
		object.setPagosDolarCiclo(this.setNumbD(object.getPagosDolarCiclo()));
		object.setCreditosPesosCiclo(this.setNumb(object.getCreditosPesosCiclo()));
		object.setCreditosDolarCiclo(this.setNumbD(object.getCreditosDolarCiclo()));
		object.setDebitosPesosCiclo(this.setNumb(object.getDebitosPesosCiclo()));
		object.setDebitosDolarCiclo(this.setNumbD(object.getDebitosDolarCiclo()));
		object.setCreditosMemoPesosCiclo(this.setNumb(object.getCreditosMemoPesosCiclo()));
		object.setCreditosMemoDolarCiclo(this.setNumbD(object.getCreditosMemoDolarCiclo()));
		object.setDebitosMemoPesosCiclo(this.setNumb(object.getDebitosMemoPesosCiclo()));
		object.setDebitosMemoDolarCiclo(this.setNumbD(object.getDebitosMemoDolarCiclo()));		
		object.setUtiliXCobrarMonedaExt(this.setNumbD(object.getUtiliXCobrarMonedaExt()));
		object.setPagosXAplicarMonedaExt(this.setNumbD(object.getPagosXAplicarMonedaExt()));
		object.setUtiliXCobrarMonedaNac(this.setNumb(object.getUtiliXCobrarMonedaNac()));

		object.setCupoComprasNacTjta(this.setNumb(object.getCupoComprasNacTjta()));
		object.setCupoComprasIntTjta(this.setNumbD(object.getCupoComprasIntTjta()));
		object.setCupoAvcesNacTjta(this.setNumb(object.getCupoAvcesNacTjta()));
		object.setCupoAvcesIntTjta(this.setNumbD(object.getCupoAvcesIntTjta()));
		object.setCupoLinea2Tjta(this.setNumb(object.getCupoLinea2Tjta()));
		object.setDeudaComprasNacTjta(this.setNumb(object.getDeudaComprasNacTjta()));
		object.setDeudaComprasIntTjta(this.setNumbD(object.getDeudaComprasIntTjta()));
		object.setDeudaAvcesNacTjta(this.setNumb(object.getDeudaAvcesNacTjta()));
		object.setDeudaAvcesIntTjta(this.setNumbD(object.getDeudaAvcesIntTjta()));
		object.setDeudaL2Tjta(this.setNumb(object.getDeudaL2Tjta()));		
		object.setDispCompNacTjta(this.setNumb(object.getDispCompNacTjta()));
		object.setDispCompIntTjta(this.setNumbD(object.getDispCompIntTjta()));
		object.setDispAvcesNacTjta(this.setNumb(object.getDispAvcesNacTjta()));
		object.setDispAvcesIntTjta(this.setNumbD(object.getDispAvcesIntTjta()));
		object.setDispL2Tjta(this.setNumb(object.getDispL2Tjta()));
		
		object.setCupoNacRelacion(this.setNumb(object.getCupoNacRelacion()));
		object.setCupoIntRelacion(this.setNumbD(object.getCupoIntRelacion()));
		
		
		object.setCupoCompNacCtaAut(this.setNumb(object.getCupoCompNacCtaAut()));
		object.setCupoCompIntCtaAut(this.setNumbD(object.getCupoCompIntCtaAut()));
		object.setCupoAvceNacCtaAut(this.setNumb(object.getCupoAvceNacCtaAut()));
		object.setCupoAvceIntCtaAut(this.setNumb(object.getCupoAvceIntCtaAut()));
		object.setCupoL2CtaAut(this.setNumb(object.getCupoL2CtaAut()));
		object.setDeudaCompNacCtaAut(this.setNumb(object.getDeudaCompNacCtaAut()));
		object.setDeudaCompIntCtaAut(this.setNumbD(object.getDeudaCompIntCtaAut()));
		object.setDeudaAvceNacCtaAut(this.setNumb(object.getDeudaAvceNacCtaAut()));
		object.setDeudaAvceIntCtaAut(this.setNumbD(object.getDeudaAvceIntCtaAut()));
		object.setDeudaL2CtaAut(this.setNumb(object.getDeudaL2CtaAut()));
		object.setDispCompNacCtaAut(this.setNumb(object.getDispCompNacCtaAut()));
		object.setDispCompIntCtaAut(this.setNumbD(object.getDispCompIntCtaAut()));
		object.setDispAvceNacCtaAut(this.setNumb(object.getDispAvceNacCtaAut()));
		object.setDispAvceIntCtaAut(this.setNumbD(object.getDispAvceIntCtaAut()));
		object.setDispL2CtaAut(this.setNumb(object.getDispL2CtaAut()));
		
		object.setDeudaTotPesoCtaAut(this.setNumb(object.getDeudaTotPesoCtaAut()));
		object.setDeudaTotDolarCtaAut(this.setNumbD(object.getDeudaTotDolarCtaAut()));
		object.setPagoMinCtaAut(this.setNumb(object.getPagoMinCtaAut()));
		
		object.setCupoCompNacTjtaAut(this.setNumb(object.getCupoCompNacTjtaAut()));
		object.setCupoCompIntTjtaAut(this.setNumbD(object.getCupoCompIntTjtaAut()));
		object.setCupoAvceNacTjtaAut(this.setNumb(object.getCupoAvceNacTjtaAut()));
		object.setCupoAvceIntTjtaAut(this.setNumbD(object.getCupoAvceIntTjtaAut()));
		object.setCupoL2TjtaAut(this.setNumb(object.getCupoL2TjtaAut()));
		object.setDeudaCompNacTjtaAut(this.setNumb(object.getDeudaCompNacTjtaAut()));
		object.setDeudaCompIntTjtaAut(this.setNumbD(object.getDeudaCompIntTjtaAut()));
		object.setDeudaAvceNacTjtaAut(this.setNumb(object.getDeudaAvceNacTjtaAut()));
		object.setDeudaAvceIntTjtaAut(this.setNumbD(object.getDeudaAvceIntTjtaAut()));
		object.setDeudaL2TjtaAut(this.setNumb(object.getDeudaL2TjtaAut()));
		object.setDispCompNacionalTjtaAut(this.setNumb(object.getDispCompNacionalTjtaAut()));
		object.setDispCompInternacionalTjtaAut(this.setNumbD(object.getDispCompInternacionalTjtaAut()));
		object.setDispAvceNacionalTjtaAut(this.setNumb(object.getDispAvceNacionalTjtaAut()));
		object.setDispAvceInternacionalTjtaAut(this.setNumbD(object.getDispAvceInternacionalTjtaAut()));
		object.setDispL2TjtaAut(this.setNumb(object.getDispL2TjtaAut()));
		
		object.setTimestamp(exchange.getProperty("TIMESTAMP_RESPONSE",String.class));
		object.setCanal(exchange.getProperty("OBJECT_REQUEST", DataInput.class).getCanal());
		object.setIdEmisorServicio(exchange.getProperty("ID_EMISOR", String.class));
	}
	
	private String setNumbD(@NotNull String num) {
		String decimal = "00";
		String entero = "0";
		try{
			entero = this.setNumb(num);
			if (!entero.equals("0")) {
				if (entero.length() > 2) {
					entero = entero.substring(0, entero.length()-2);				
				}else {
					entero = "0";
				}			
				decimal = num.substring(num.length()-2,num.length());
			} 
		}catch(Exception e){
			logger.error(">>> PROBLEMAS EN OBTENCION DE NUMERO");
		}
		
		return entero.concat("," + decimal);

		
	}

	private String setNumb(@NotNull String num) {
		String newNum = "0";
		try{
			if ( !num.isEmpty()) {			
				String signo = (num.contains("-"))? "-" : "";
				long entero = Long.parseLong(num.substring(1,num.length()));
				if (signo.isEmpty()) {
					newNum =  String.valueOf(entero);
				} else {
					newNum = "-" + entero;
				}
			}
		}catch(Exception e){
			logger.error(">>> PROBLEMAS EN OBTENCION DE NUMERO");
		}
		
		return newNum;
	}

	private void getDateOfString(Exchange exchange) {
		String bodyXML  = exchange.getProperty("XML_RESPONSE_NEXUS", String.class);
		DataToReturn object = exchange.getIn().getBody(DataToReturn.class);

		String string1 = XPathBuilder.xpath("/DATA/string1").evaluate(exchange.getContext(), bodyXML);
		if(string1.trim().length() > 0) {			
			String [] fechasStr1 = string1.trim().split(";");			
			object.setFechaUltFactDolar(fechasStr1[0]);
			if (fechasStr1.length > 1) {
				object.setFechaVencFactDolar(fechasStr1[1]);
			}		
		}
		
		
		String string2 = XPathBuilder.xpath("/DATA/string2").evaluate(exchange.getContext(), bodyXML);	
		if(string2.trim().length() > 0) {			
			String [] fechasStr2 = string2.trim().split(";");			
			object.setFechaProxFactCalend(fechasStr2[0]);
			if (fechasStr2.length > 1) {
				object.setFechaProxVencCalend(fechasStr2[1]);
			}			
		}
		
		String string3 = XPathBuilder.xpath("/DATA/string3").evaluate(exchange.getContext(), bodyXML);
		int lCaracteres = string3.trim().length();
		if(lCaracteres > 8) {			
			object.setFechaVigEeccDesde(string3.substring(0, 8));
			if (lCaracteres > 16) {
				object.setFechaVigEeccHasta(string3.substring(8, 16));
				object.setMarca(string3.substring(16, 17));
			}else {
				object.setFechaVigEeccHasta(string3.substring(8, string3.length()));
			}		
		}else {
			object.setFechaVigEeccDesde(string3.substring(0, string3.trim().length()));
		}
	}
	
	public void getExecutionTime(Exchange exchange) {
		Date date = new Date();
		exchange.setProperty("TIEMPO_EJECUCION", (date.toInstant().toEpochMilli() - exchange.getProperty("DATE_TIME_SERVICIO_MILLIS" ,  Long.class)));
	}
}
