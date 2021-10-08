package cl.bcointer.pagos.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InputPayment {

    @JsonProperty("num_cta_tar")
    @NotNull(message = "Not Found")
    @Size(min = 2, max = 2, message = "Largo de caracteres invalido")
    private String numCtaTar;

    @JsonProperty("tipo_tx_monetaria")
    @NotNull(message = "Not Found")
    @Size(min = 2, max = 2, message = "Largo de caracteres invalido")
    private String tipoTxMonetaria;

    @JsonProperty("fecha_tx")
    @NotNull(message = "Not Found")
    @Size(min = 2, max = 2, message = "Largo de caracteres invalido")
    private String fechaTx;

    @JsonProperty("hora_tx")
    @NotNull(message = "Not Found")
    @Size(min = 2, max = 2, message = "Largo de caracteres invalido")
    private String horaTx;

    @JsonProperty("fecha_contable")
    @NotNull(message = "Not Found")
    @Size(min = 2, max = 2, message = "Largo de caracteres invalido")
    private String fechaContable;

    @JsonProperty("mto_moneda_origen")
    @NotNull(message = "Not Found")
    @Size(min = 2, max = 2, message = "Largo de caracteres invalido")
    private String mtoMonedaOrigen;

    @JsonProperty("moneda_origen")
    @NotNull(message = "Not Found")
    @Size(min = 2, max = 2, message = "Largo de caracteres invalido")
    private String monedaOrigen;

    @JsonProperty("mto_moneda_fact")
    @NotNull(message = "Not Found")
    @Size(min = 2, max = 2, message = "Largo de caracteres invalido")
    private String mtoMonedaFact;

    @JsonProperty("moneda_fact")
    @NotNull(message = "Not Found")
    @Size(min = 2, max = 2, message = "Largo de caracteres invalido")
    private String monedaFact;

    @JsonProperty("glosa_transaccion")
    @NotNull(message = "Not Found")
    @Size(min = 2, max = 2, message = "Largo de caracteres invalido")
    private String glosaTransaccion;

    @JsonProperty("tasa_interes")
    @NotNull(message = "Not Found")
    @Size(min = 2, max = 2, message = "Largo de caracteres invalido")
    private String tasaInteres;

    @JsonProperty("cantidad_cuotas")
    @NotNull(message = "Not Found")
    @Size(min = 2, max = 2, message = "Largo de caracteres invalido")
    private String cantidadCuotas;

    @JsonProperty("meses_gracia")
    @NotNull(message = "Not Found")
    @Size(min = 2, max = 2, message = "Largo de caracteres invalido")
    private String mesesGracia;

    @JsonProperty("dias_retencion")
    @NotNull(message = "Not Found")
    @Size(min = 2, max = 2, message = "Largo de caracteres invalido")
    private String diasTetencion;

    @JsonProperty("plan_credito")
    @NotNull(message = "Not Found")
    @Size(min = 2, max = 2, message = "Largo de caracteres invalido")
    private String planCredito;

    @JsonProperty("codigo_ajuste")
    @NotNull(message = "Not Found")
    @Size(min = 2, max = 2, message = "Largo de caracteres invalido")
    private String codigoAjuste;

    @NotNull(message = "Not Found")
    @Size(min = 2, max = 2, message = "Largo de caracteres invalido")
    private String origen;

    @JsonProperty("codigo_pais")
    @NotNull(message = "Not Found")
    @Size(min = 2, max = 2, message = "Largo de caracteres invalido")
    private String codigoPais;

    @JsonProperty("codigo_pais_iata")
    @NotNull(message = "Not Found")
    @Size(min = 2, max = 2, message = "Largo de caracteres invalido")
    private String codigoPaisIata;

    @NotNull(message = "Not Found")
    @Size(min = 2, max = 2, message = "Largo de caracteres invalido")
    private String terminal;

    @JsonProperty("cdgo_sucursal")
    @NotNull(message = "Not Found")
    @Size(min = 2, max = 2, message = "Largo de caracteres invalido")
    private String cdgoSucursal;

    @JsonProperty("cdgo_captura")
    @NotNull(message = "Not Found")
    @Size(min = 2, max = 2, message = "Largo de caracteres invalido")
    private String cdgoCaptura;

    
    @NotNull(message = "Not Found")
    @Size(min = 2, max = 2, message = "Largo de caracteres invalido")
    private String monto1;

    
    @NotNull(message = "Not Found")
    @Size(min = 2, max = 2, message = "Largo de caracteres invalido")
    private String monto2;

    
    @NotNull(message = "Not Found")
    @Size(min = 2, max = 2, message = "Largo de caracteres invalido")
    private String monto3;

    
    @NotNull(message = "Not Found")
    @Size(min = 2, max = 2, message = "Largo de caracteres invalido")
    private String numero1;

    
    @NotNull(message = "Not Found")
    @Size(min = 2, max = 2, message = "Largo de caracteres invalido")
    private String numero2;

    
    @NotNull(message = "Not Found")
    @Size(min = 2, max = 2, message = "Largo de caracteres invalido")
    private String numero3;

    @JsonProperty("cuenta_debito")
    @NotNull(message = "Not Found")
    @Size(min = 2, max = 2, message = "Largo de caracteres invalido")
    private String cuentaDebito;

    @JsonProperty("tipo_cuenta_deb")
    @NotNull(message = "Not Found")
    @Size(min = 2, max = 2, message = "Largo de caracteres invalido")
    private String tipoCuentaDeb;

    @JsonProperty("banco_deb")
    @NotNull(message = "Not Found")
    @Size(min = 2, max = 2, message = "Largo de caracteres invalido")
    private String bancoDeb;

    @JsonProperty("cuenta_credito")
    @NotNull(message = "Not Found")
    @Size(min = 2, max = 2, message = "Largo de caracteres invalido")
    private String cuentaCredito;

    @JsonProperty("tipo_cuenta_cr")
    @NotNull(message = "Not Found")
    @Size(min = 2, max = 2, message = "Largo de caracteres invalido")
    private String tipoCuentaCr= "";

    @JsonProperty("banco_cred")
    @NotNull(message = "Not Found")
    @Size(min = 2, max = 2, message = "Largo de caracteres invalido")
    private String bancoCred;

    @JsonProperty("rut_cliente")
    @NotNull(message = "Not Found")
    @Size(min = 2, max = 2, message = "Largo de caracteres invalido")
    private String rutCliente;

    @NotNull(message = "Not Found")
    @Size(min = 2, max = 2, message = "Largo de caracteres invalido")
    private String opecod;

    @JsonProperty("ind_sob")
    @NotNull(message = "Not Found")
    @Size(min = 2, max = 2, message = "Largo de caracteres invalido")
    private String indSob;

    @JsonProperty("ip_cliente")
    @NotNull(message = "Not Found")
    @Size(min = 2, max = 2, message = "Largo de caracteres invalido")
    private String ipCliente;

    @JsonProperty("mod_trx")
    @NotNull(message = "Not Found")
    @Size(min = 2, max = 2, message = "Largo de caracteres invalido")
    private String modTrx;

    @NotNull(message = "Not Found")
	@Size(min=2, max=2, message = "Largo de caracteres invalido")
    private String canal;

    @NotNull(message = "Not Found")
	@Size(min=2, max=2, message = "Largo de caracteres invalido")
    private String usuario;

    @NotNull(message = "Not Found")
	@Size(min=2, max=2, message = "Largo de caracteres invalido")
    private String tratyp;

    @JsonProperty("codtrn")
    @NotNull(message = "Not Found")
    @Size(min = 2, max = 2, message = "Largo de caracteres invalido")
    private String codtrn;

	public String getNumCtaTar() {
		return (numCtaTar == null)? "" : numCtaTar;
	}

	public void setNumCtaTar(String numCtaTar) {
		this.numCtaTar = numCtaTar;
	}

	public String getTipoTxMonetaria() {
		return (tipoTxMonetaria == null)? "" : tipoTxMonetaria;
	}

	public void setTipoTxMonetaria(String tipoTxMonetaria) {
		this.tipoTxMonetaria = tipoTxMonetaria;
	}

	public String getFechaTx() {
		return (fechaTx == null)? "" : fechaTx;
	}

	public void setFechaTx(String fechaTx) {
		this.fechaTx = fechaTx;
	}

	public String getHoraTx() {
		return (horaTx == null)? "" : horaTx;
	}

	public void setHoraTx(String horaTx) {
		this.horaTx = horaTx;
	}

	public String getFechaContable() {
		return (fechaContable == null)? "" : fechaContable;
	}

	public void setFechaContable(String fechaContable) {
		this.fechaContable = fechaContable;
	}

	public String getMtoMonedaOrigen() {
		return (mtoMonedaOrigen == null)? "" : mtoMonedaOrigen;
	}

	public void setMtoMonedaOrigen(String mtoMonedaOrigen) {
		this.mtoMonedaOrigen = mtoMonedaOrigen;
	}

	public String getMonedaOrigen() {
		return (monedaOrigen == null)? "" : monedaOrigen;
	}

	public void setMonedaOrigen(String monedaOrigen) {
		this.monedaOrigen = monedaOrigen;
	}

	public String getMtoMonedaFact() {
		return (mtoMonedaFact == null)? "" : mtoMonedaFact;
	}

	public void setMtoMonedaFact(String mtoMonedaFact) {
		this.mtoMonedaFact = mtoMonedaFact;
	}

	public String getMonedaFact() {
		return (monedaFact == null)? "" : monedaFact;
	}

	public void setMonedaFact(String monedaFact) {
		this.monedaFact = monedaFact;
	}

	public String getGlosaTransaccion() {
		return (glosaTransaccion == null)? "" : glosaTransaccion;
	}

	public void setGlosaTransaccion(String glosaTransaccion) {
		this.glosaTransaccion = glosaTransaccion;
	}

	public String getTasaInteres() {
		return (tasaInteres == null)? "" : tasaInteres;
	}

	public void setTasaInteres(String tasaInteres) {
		this.tasaInteres = tasaInteres;
	}

	public String getCantidadCuotas() {
		return (cantidadCuotas == null)? "" : cantidadCuotas;
	}

	public void setCantidadCuotas(String cantidadCuotas) {
		this.cantidadCuotas = cantidadCuotas;
	}

	public String getMesesGracia() {
		return (mesesGracia == null)? "" : mesesGracia;
	}

	public void setMesesGracia(String mesesGracia) {
		this.mesesGracia = mesesGracia;
	}

	public String getDiasTetencion() {
		return (diasTetencion == null)? "" : diasTetencion;
	}

	public void setDiasTetencion(String diasTetencion) {
		this.diasTetencion = diasTetencion;
	}

	public String getPlanCredito() {
		return (planCredito == null)? "" : planCredito;
	}

	public void setPlanCredito(String planCredito) {
		this.planCredito = planCredito;
	}

	public String getCodigoAjuste() {
		return (codigoAjuste == null)? "" : codigoAjuste;
	}

	public void setCodigoAjuste(String codigoAjuste) {
		this.codigoAjuste = codigoAjuste;
	}

	public String getOrigen() {
		return (origen == null)? "" : origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getCodigoPais() {
		return (codigoPais == null)? "" : codigoPais;
	}

	public void setCodigoPais(String codigoPais) {
		this.codigoPais = codigoPais;
	}

	public String getCodigoPaisIata() {
		return (codigoPaisIata == null)? "" : codigoPaisIata;
	}

	public void setCodigoPaisIata(String codigoPaisIata) {
		this.codigoPaisIata = codigoPaisIata;
	}

	public String getTerminal() {
		return (terminal == null)? "" : terminal;
	}

	public void setTerminal(String terminal) {
		this.terminal = terminal;
	}

	public String getCdgoSucursal() {
		return (cdgoSucursal == null)? "" : cdgoSucursal;
	}

	public void setCdgoSucursal(String cdgoSucursal) {
		this.cdgoSucursal = cdgoSucursal;
	}

	public String getCdgoCaptura() {
		return (cdgoCaptura == null)? "" : cdgoCaptura;
	}

	public void setCdgoCaptura(String cdgoCaptura) {
		this.cdgoCaptura = cdgoCaptura;
	}

	public String getMonto1() {
		return (monto1 == null)? "" : monto1;
	}

	public void setMonto1(String monto1) {
		this.monto1 = monto1;
	}

	public String getMonto2() {
		return (monto2 == null)? "" : monto2;
	}

	public void setMonto2(String monto2) {
		this.monto2 = monto2;
	}

	public String getMonto3() {
		return (monto3 == null)? "" : monto3;
	}

	public void setMonto3(String monto3) {
		this.monto3 = monto3;
	}

	public String getNumero1() {
		return (numero1 == null)? "" : numero1;
	}

	public void setNumero1(String numero1) {
		this.numero1 = numero1;
	}

	public String getNumero2() {
		return (numero2 == null)? "" : numero2;
	}

	public void setNumero2(String numero2) {
		this.numero2 = numero2;
	}

	public String getNumero3() {
		return (numero3 == null)? "" : numero3;
	}

	public void setNumero3(String numero3) {
		this.numero3 = numero3;
	}

	public String getCuentaDebito() {
		return (cuentaDebito == null)? "" : cuentaDebito;
	}

	public void setCuentaDebito(String cuentaDebito) {
		this.cuentaDebito = cuentaDebito;
	}

	public String getTipoCuentaDeb() {
		return (tipoCuentaDeb == null)? "" : tipoCuentaDeb;
	}

	public void setTipoCuentaDeb(String tipoCuentaDeb) {
		this.tipoCuentaDeb = tipoCuentaDeb;
	}

	public String getBancoDeb() {
		return (bancoDeb == null)? "" : bancoDeb;
	}

	public void setBancoDeb(String bancoDeb) {
		this.bancoDeb = bancoDeb;
	}

	public String getCuentaCredito() {
		return (cuentaCredito == null)? "" : cuentaCredito;
	}

	public void setCuentaCredito(String cuentaCredito) {
		this.cuentaCredito = cuentaCredito;
	}

	public String getTipoCuentaCr() {
		return (tipoCuentaCr == null)? "" : tipoCuentaCr;
	}

	public void setTipoCuentaCr(String tipoCuentaCr) {
		this.tipoCuentaCr = tipoCuentaCr;
	}

	public String getBancoCred() {
		return (bancoCred == null)? "" : bancoCred;
	}

	public void setBancoCred(String bancoCred) {
		this.bancoCred = bancoCred;
	}

	public String getRutCliente() {
		return (rutCliente == null)? "" : rutCliente;
	}

	public void setRutCliente(String rutCliente) {
		this.rutCliente = rutCliente;
	}

	public String getOpeCod() {
		return (opecod == null)? "" : opecod;
	}

	public void setOpeCod(String opecod) {
		this.opecod = opecod;
	}

	public String getIndSob() {
		return (indSob == null)? "" : indSob;
	}

	public void setIndSob(String indSob) {
		this.indSob = indSob;
	}

	public String getIpCliente() {
		return (ipCliente == null)? "" : ipCliente;
	}

	public void setIpCliente(String ipCliente) {
		this.ipCliente = ipCliente;
	}

	public String getModTrx() {
		return (modTrx == null)? "" : modTrx;
	}

	public void setModTrx(String modTrx) {
		this.modTrx = modTrx;
	}

	public String getCanal() {
		return (canal == null)? "" : canal;
	}

	public void setCanal(String canal) {
		this.canal = canal;
	}

	public String getUsuario() {
		return (usuario == null)? "" : usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getTratyp() {
		return (tratyp == null)? "" : tratyp;
	}

	public void setTratyp(String tratyp) {
		this.tratyp = tratyp;
	}

	public String getCodtrn() {
		return (codtrn == null)? "" : codtrn;
	}

	public void setCodtrn(String codtrn) {
		this.codtrn = codtrn;
	}

    
}
