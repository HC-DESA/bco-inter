package cl.bancoint.consultasaldo.pojo;

//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;


public class DataInput {

//	@NotNull(message = "NotNull canal")
//	@Size(min=10, max=10, message = "Largo caracteres canal")
	private String canal;
	
//	@NotNull(message = "NotNull canal")
//	@Size(min=10, max=10, message = "Largo caracteres canal")
	private String id_emisor_servicio;
//	
//	@NotNull(message = "NotNull canal")
//	@Size(min=10, max=10, message = "Largo caracteres canal")
	private String idRequerimiento;
	
//	@NotNull(message = "NotNull canal")
//	@Size(min=10, max=10, message = "Largo caracteres canal")
	private String num_cta_tar;
	
//	@NotNull(message = "NotNull canal")
//	@Size(min=10, max=10, message = "Largo caracteres canal")
	private String secuencia_tarjeta;

	public String getCanal() {
		return canal;
	}

	public void setCanal(String canal) {
		this.canal = canal;
	}

	public String getId_emisor_servicio() {
		return id_emisor_servicio;
	}

	public void setId_emisor_servicio(String id_emisor_servicio) {
		this.id_emisor_servicio = id_emisor_servicio;
	}

	public String getIdRequerimiento() {
		return idRequerimiento;
	}

	public void setIdRequerimiento(String idRequerimiento) {
		this.idRequerimiento = idRequerimiento;
	}

	public String getNum_cta_tar() {
		return num_cta_tar;
	}

	public void setNum_cta_tar(String num_cta_tar) {
		this.num_cta_tar = num_cta_tar;
	}

	public String getSecuencia_tarjeta() {
		return secuencia_tarjeta;
	}

	public void setSecuencia_tarjeta(String secuencia_tarjeta) {
		this.secuencia_tarjeta = secuencia_tarjeta;
	}

	public DataInput(String canal, String id_emisor_servicio, String idRequerimiento, String num_cta_tar,
			String secuencia_tarjeta) {
		super();
		this.canal = canal;
		this.id_emisor_servicio = id_emisor_servicio;
		this.idRequerimiento = idRequerimiento;
		this.num_cta_tar = num_cta_tar;
		this.secuencia_tarjeta = secuencia_tarjeta;
	}
	
	
	
	
}