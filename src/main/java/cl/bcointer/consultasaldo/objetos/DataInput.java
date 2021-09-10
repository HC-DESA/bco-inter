package cl.bcointer.consultasaldo.objetos;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;


public class DataInput {
	@JsonProperty("canal")
	@NotNull(message = "NotNull canal")
	@Size(min=1, max=8, message = "Largo caracteres canal")
	private String canal;
	
	@JsonProperty("num_cta_tar")
	@NotNull(message = "NotNull numCta")
	@Size(min=01, max=19, message = "Largo caracteres numCta")
	private String numCtaTar;
	
	@JsonProperty("secuencia_tarjeta")
	@NotNull(message = "NotNull secuenciaTarjeta")
	@Size(min=4, max=4, message = "Largo caracteres secuenciaTarjeta")
	private String secuenciaTarjeta;

	public String getCanal() {
		return canal;
	}

	public void setCanal(String canal) {
		this.canal = canal;
	}

	public String getNumCtaTar() {
		return numCtaTar;
	}

	public void setNumCtaTar(String numCtaTar) {
		this.numCtaTar = numCtaTar;
	}

	public String getSecuenciaTarjeta() {
		return secuenciaTarjeta;
	}

	public void setSecuenciaTarjeta(String secuenciaTarjeta) {
		this.secuenciaTarjeta = secuenciaTarjeta;
	}

	public DataInput() {
		super();
	}
	
	
	
	
	
	
}