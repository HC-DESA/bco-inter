
package cl.bcointer.models;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "num_tarjeta_s",
    "correlativo",
    "origen_trans",
    "fec_trans",
    "fec_posteo",
    "codigo_trans",
    "tipo_trans",
    "monto_compra",
    "numero_cuota",
    "total_de_cuotas",
    "tasa",
    "descripcion_trans",
    "glosa_trans",
    "microfilm23",
    "cdgo_comercio_tbk",
    "cdgo_comercio_int",
    "rubro",
    "nombre_comercio",
    "rut_comercio",
    "dvrut_comercio",
    "nro_solicitud",
    "desc_rubro",
    "codigo_pais_iata",
    "ciudad",
    "moneda_fact_9",
    "moneda_origen_9",
    "monto_mon_origen",
    "codaut",
    "fecha_autorizador_s",
    "hora_autorizador_s",
    "estado_trans",
    "monto11",
    "monto21",
    "monto31",
    "numero11",
    "numero21",
    "numero31",
    "flag11",
    "flag21",
    "flag31",
    "string11",
    "string21",
    "string31",
    "filler_03"
})
public class TrxNoFacturadasTransacciones {

    @JsonProperty("num_tarjeta_s")
    private String numTarjetaS;
    @JsonProperty("correlativo")
    private String correlativo;
    @JsonProperty("origen_trans")
    private String origenTrans;
    @JsonProperty("fec_trans")
    private String fecTrans;
    @JsonProperty("fec_posteo")
    private String fecPosteo;
    @JsonProperty("codigo_trans")
    private String codigoTrans;
    @JsonProperty("tipo_trans")
    private String tipoTrans;
    @JsonProperty("monto_compra")
    private String montoCompra;
    @JsonProperty("numero_cuota")
    private String numeroCuota;
    @JsonProperty("total_de_cuotas")
    private String totalDeCuotas;
    @JsonProperty("tasa")
    private String tasa;
    @JsonProperty("descripcion_trans")
    private String descripcionTrans;
    @JsonProperty("glosa_trans")
    private String glosaTrans;
    @JsonProperty("microfilm23")
    private String microfilm23;
    @JsonProperty("cdgo_comercio_tbk")
    private String cdgoComercioTbk;
    @JsonProperty("cdgo_comercio_int")
    private String cdgoComercioInt;
    @JsonProperty("rubro")
    private String rubro;
    @JsonProperty("nombre_comercio")
    private String nombreComercio;
    @JsonProperty("rut_comercio")
    private String rutComercio;
    @JsonProperty("dvrut_comercio")
    private String dvrutComercio;
    @JsonProperty("nro_solicitud")
    private String nroSolicitud;
    @JsonProperty("desc_rubro")
    private String descRubro;
    @JsonProperty("codigo_pais_iata")
    private String codigoPaisIata;
    @JsonProperty("ciudad")
    private String ciudad;
    @JsonProperty("moneda_fact_9")
    private String monedaFact9;
    @JsonProperty("moneda_origen_9")
    private String monedaOrigen9;
    @JsonProperty("monto_mon_origen")
    private String montoMonOrigen;
    @JsonProperty("codaut")
    private String codaut;
    @JsonProperty("fecha_autorizador_s")
    private String fechaAutorizadorS;
    @JsonProperty("hora_autorizador_s")
    private String horaAutorizadorS;
    @JsonProperty("estado_trans")
    private String estadoTrans;
    @JsonProperty("monto11")
    private String monto11;
    @JsonProperty("monto21")
    private String monto21;
    @JsonProperty("monto31")
    private String monto31;
    @JsonProperty("numero11")
    private String numero11;
    @JsonProperty("numero21")
    private String numero21;
    @JsonProperty("numero31")
    private String numero31;
    @JsonProperty("flag11")
    private String flag11;
    @JsonProperty("flag21")
    private String flag21;
    @JsonProperty("flag31")
    private String flag31;
    @JsonProperty("string11")
    private String string11;
    @JsonProperty("string21")
    private String string21;
    @JsonProperty("string31")
    private String string31;
    @JsonProperty("filler_03")
    private String filler03;

    /**
     * 
     * @return
     *     The numTarjetaS
     */
    @JsonProperty("num_tarjeta_s")
    public String getNumTarjetaS() {
        return numTarjetaS;
    }

    /**
     * 
     * @param numTarjetaS
     *     The num_tarjeta_s
     */
    @JsonProperty("num_tarjeta_s")
    public void setNumTarjetaS(String numTarjetaS) {
        this.numTarjetaS = numTarjetaS;
    }

    /**
     * 
     * @return
     *     The correlativo
     */
    @JsonProperty("correlativo")
    public String getCorrelativo() {
        return correlativo;
    }

    /**
     * 
     * @param correlativo
     *     The correlativo
     */
    @JsonProperty("correlativo")
    public void setCorrelativo(String correlativo) {
        this.correlativo = correlativo;
    }

    /**
     * 
     * @return
     *     The origenTrans
     */
    @JsonProperty("origen_trans")
    public String getOrigenTrans() {
        return origenTrans;
    }

    /**
     * 
     * @param origenTrans
     *     The origen_trans
     */
    @JsonProperty("origen_trans")
    public void setOrigenTrans(String origenTrans) {
        this.origenTrans = origenTrans;
    }

    /**
     * 
     * @return
     *     The fecTrans
     */
    @JsonProperty("fec_trans")
    public String getFecTrans() {
        return fecTrans;
    }

    /**
     * 
     * @param fecTrans
     *     The fec_trans
     */
    @JsonProperty("fec_trans")
    public void setFecTrans(String fecTrans) {
        this.fecTrans = fecTrans;
    }

    /**
     * 
     * @return
     *     The fecPosteo
     */
    @JsonProperty("fec_posteo")
    public String getFecPosteo() {
        return fecPosteo;
    }

    /**
     * 
     * @param fecPosteo
     *     The fec_posteo
     */
    @JsonProperty("fec_posteo")
    public void setFecPosteo(String fecPosteo) {
        this.fecPosteo = fecPosteo;
    }

    /**
     * 
     * @return
     *     The codigoTrans
     */
    @JsonProperty("codigo_trans")
    public String getCodigoTrans() {
        return codigoTrans;
    }

    /**
     * 
     * @param codigoTrans
     *     The codigo_trans
     */
    @JsonProperty("codigo_trans")
    public void setCodigoTrans(String codigoTrans) {
        this.codigoTrans = codigoTrans;
    }

    /**
     * 
     * @return
     *     The tipoTrans
     */
    @JsonProperty("tipo_trans")
    public String getTipoTrans() {
        return tipoTrans;
    }

    /**
     * 
     * @param tipoTrans
     *     The tipo_trans
     */
    @JsonProperty("tipo_trans")
    public void setTipoTrans(String tipoTrans) {
        this.tipoTrans = tipoTrans;
    }

    /**
     * 
     * @return
     *     The montoCompra
     */
    @JsonProperty("monto_compra")
    public String getMontoCompra() {
        return montoCompra;
    }

    /**
     * 
     * @param montoCompra
     *     The monto_compra
     */
    @JsonProperty("monto_compra")
    public void setMontoCompra(String montoCompra) {
        this.montoCompra = montoCompra;
    }

    /**
     * 
     * @return
     *     The numeroCuota
     */
    @JsonProperty("numero_cuota")
    public String getNumeroCuota() {
        return numeroCuota;
    }

    /**
     * 
     * @param numeroCuota
     *     The numero_cuota
     */
    @JsonProperty("numero_cuota")
    public void setNumeroCuota(String numeroCuota) {
        this.numeroCuota = numeroCuota;
    }

    /**
     * 
     * @return
     *     The totalDeCuotas
     */
    @JsonProperty("total_de_cuotas")
    public String getTotalDeCuotas() {
        return totalDeCuotas;
    }

    /**
     * 
     * @param totalDeCuotas
     *     The total_de_cuotas
     */
    @JsonProperty("total_de_cuotas")
    public void setTotalDeCuotas(String totalDeCuotas) {
        this.totalDeCuotas = totalDeCuotas;
    }

    /**
     * 
     * @return
     *     The tasa
     */
    @JsonProperty("tasa")
    public String getTasa() {
        return tasa;
    }

    /**
     * 
     * @param tasa
     *     The tasa
     */
    @JsonProperty("tasa")
    public void setTasa(String tasa) {
        this.tasa = tasa;
    }

    /**
     * 
     * @return
     *     The descripcionTrans
     */
    @JsonProperty("descripcion_trans")
    public String getDescripcionTrans() {
        return descripcionTrans;
    }

    /**
     * 
     * @param descripcionTrans
     *     The descripcion_trans
     */
    @JsonProperty("descripcion_trans")
    public void setDescripcionTrans(String descripcionTrans) {
        this.descripcionTrans = descripcionTrans;
    }

    /**
     * 
     * @return
     *     The glosaTrans
     */
    @JsonProperty("glosa_trans")
    public String getGlosaTrans() {
        return glosaTrans;
    }

    /**
     * 
     * @param glosaTrans
     *     The glosa_trans
     */
    @JsonProperty("glosa_trans")
    public void setGlosaTrans(String glosaTrans) {
        this.glosaTrans = glosaTrans;
    }

    /**
     * 
     * @return
     *     The microfilm23
     */
    @JsonProperty("microfilm23")
    public String getMicrofilm23() {
        return microfilm23;
    }

    /**
     * 
     * @param microfilm23
     *     The microfilm23
     */
    @JsonProperty("microfilm23")
    public void setMicrofilm23(String microfilm23) {
        this.microfilm23 = microfilm23;
    }

    /**
     * 
     * @return
     *     The cdgoComercioTbk
     */
    @JsonProperty("cdgo_comercio_tbk")
    public String getCdgoComercioTbk() {
        return cdgoComercioTbk;
    }

    /**
     * 
     * @param cdgoComercioTbk
     *     The cdgo_comercio_tbk
     */
    @JsonProperty("cdgo_comercio_tbk")
    public void setCdgoComercioTbk(String cdgoComercioTbk) {
        this.cdgoComercioTbk = cdgoComercioTbk;
    }

    /**
     * 
     * @return
     *     The cdgoComercioInt
     */
    @JsonProperty("cdgo_comercio_int")
    public String getCdgoComercioInt() {
        return cdgoComercioInt;
    }

    /**
     * 
     * @param cdgoComercioInt
     *     The cdgo_comercio_int
     */
    @JsonProperty("cdgo_comercio_int")
    public void setCdgoComercioInt(String cdgoComercioInt) {
        this.cdgoComercioInt = cdgoComercioInt;
    }

    /**
     * 
     * @return
     *     The rubro
     */
    @JsonProperty("rubro")
    public String getRubro() {
        return rubro;
    }

    /**
     * 
     * @param rubro
     *     The rubro
     */
    @JsonProperty("rubro")
    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    /**
     * 
     * @return
     *     The nombreComercio
     */
    @JsonProperty("nombre_comercio")
    public String getNombreComercio() {
        return nombreComercio;
    }

    /**
     * 
     * @param nombreComercio
     *     The nombre_comercio
     */
    @JsonProperty("nombre_comercio")
    public void setNombreComercio(String nombreComercio) {
        this.nombreComercio = nombreComercio;
    }

    /**
     * 
     * @return
     *     The rutComercio
     */
    @JsonProperty("rut_comercio")
    public String getRutComercio() {
        return rutComercio;
    }

    /**
     * 
     * @param rutComercio
     *     The rut_comercio
     */
    @JsonProperty("rut_comercio")
    public void setRutComercio(String rutComercio) {
        this.rutComercio = rutComercio;
    }

    /**
     * 
     * @return
     *     The dvrutComercio
     */
    @JsonProperty("dvrut_comercio")
    public String getDvrutComercio() {
        return dvrutComercio;
    }

    /**
     * 
     * @param dvrutComercio
     *     The dvrut_comercio
     */
    @JsonProperty("dvrut_comercio")
    public void setDvrutComercio(String dvrutComercio) {
        this.dvrutComercio = dvrutComercio;
    }

    /**
     * 
     * @return
     *     The nroSolicitud
     */
    @JsonProperty("nro_solicitud")
    public String getNroSolicitud() {
        return nroSolicitud;
    }

    /**
     * 
     * @param nroSolicitud
     *     The nro_solicitud
     */
    @JsonProperty("nro_solicitud")
    public void setNroSolicitud(String nroSolicitud) {
        this.nroSolicitud = nroSolicitud;
    }

    /**
     * 
     * @return
     *     The descRubro
     */
    @JsonProperty("desc_rubro")
    public String getDescRubro() {
        return descRubro;
    }

    /**
     * 
     * @param descRubro
     *     The desc_rubro
     */
    @JsonProperty("desc_rubro")
    public void setDescRubro(String descRubro) {
        this.descRubro = descRubro;
    }

    /**
     * 
     * @return
     *     The codigoPaisIata
     */
    @JsonProperty("codigo_pais_iata")
    public String getCodigoPaisIata() {
        return codigoPaisIata;
    }

    /**
     * 
     * @param codigoPaisIata
     *     The codigo_pais_iata
     */
    @JsonProperty("codigo_pais_iata")
    public void setCodigoPaisIata(String codigoPaisIata) {
        this.codigoPaisIata = codigoPaisIata;
    }

    /**
     * 
     * @return
     *     The ciudad
     */
    @JsonProperty("ciudad")
    public String getCiudad() {
        return ciudad;
    }

    /**
     * 
     * @param ciudad
     *     The ciudad
     */
    @JsonProperty("ciudad")
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * 
     * @return
     *     The monedaFact9
     */
    @JsonProperty("moneda_fact_9")
    public String getMonedaFact9() {
        return monedaFact9;
    }

    /**
     * 
     * @param monedaFact9
     *     The moneda_fact_9
     */
    @JsonProperty("moneda_fact_9")
    public void setMonedaFact9(String monedaFact9) {
        this.monedaFact9 = monedaFact9;
    }

    /**
     * 
     * @return
     *     The monedaOrigen9
     */
    @JsonProperty("moneda_origen_9")
    public String getMonedaOrigen9() {
        return monedaOrigen9;
    }

    /**
     * 
     * @param monedaOrigen9
     *     The moneda_origen_9
     */
    @JsonProperty("moneda_origen_9")
    public void setMonedaOrigen9(String monedaOrigen9) {
        this.monedaOrigen9 = monedaOrigen9;
    }

    /**
     * 
     * @return
     *     The montoMonOrigen
     */
    @JsonProperty("monto_mon_origen")
    public String getMontoMonOrigen() {
        return montoMonOrigen;
    }

    /**
     * 
     * @param montoMonOrigen
     *     The monto_mon_origen
     */
    @JsonProperty("monto_mon_origen")
    public void setMontoMonOrigen(String montoMonOrigen) {
        this.montoMonOrigen = montoMonOrigen;
    }

    /**
     * 
     * @return
     *     The codaut
     */
    @JsonProperty("codaut")
    public String getCodaut() {
        return codaut;
    }

    /**
     * 
     * @param codaut
     *     The codaut
     */
    @JsonProperty("codaut")
    public void setCodaut(String codaut) {
        this.codaut = codaut;
    }

    /**
     * 
     * @return
     *     The fechaAutorizadorS
     */
    @JsonProperty("fecha_autorizador_s")
    public String getFechaAutorizadorS() {
        return fechaAutorizadorS;
    }

    /**
     * 
     * @param fechaAutorizadorS
     *     The fecha_autorizador_s
     */
    @JsonProperty("fecha_autorizador_s")
    public void setFechaAutorizadorS(String fechaAutorizadorS) {
        this.fechaAutorizadorS = fechaAutorizadorS;
    }

    /**
     * 
     * @return
     *     The horaAutorizadorS
     */
    @JsonProperty("hora_autorizador_s")
    public String getHoraAutorizadorS() {
        return horaAutorizadorS;
    }

    /**
     * 
     * @param horaAutorizadorS
     *     The hora_autorizador_s
     */
    @JsonProperty("hora_autorizador_s")
    public void setHoraAutorizadorS(String horaAutorizadorS) {
        this.horaAutorizadorS = horaAutorizadorS;
    }

    /**
     * 
     * @return
     *     The estadoTrans
     */
    @JsonProperty("estado_trans")
    public String getEstadoTrans() {
        return estadoTrans;
    }

    /**
     * 
     * @param estadoTrans
     *     The estado_trans
     */
    @JsonProperty("estado_trans")
    public void setEstadoTrans(String estadoTrans) {
        this.estadoTrans = estadoTrans;
    }

    /**
     * 
     * @return
     *     The monto11
     */
    @JsonProperty("monto11")
    public String getMonto11() {
        return monto11;
    }

    /**
     * 
     * @param monto11
     *     The monto11
     */
    @JsonProperty("monto11")
    public void setMonto11(String monto11) {
        this.monto11 = monto11;
    }

    /**
     * 
     * @return
     *     The monto21
     */
    @JsonProperty("monto21")
    public String getMonto21() {
        return monto21;
    }

    /**
     * 
     * @param monto21
     *     The monto21
     */
    @JsonProperty("monto21")
    public void setMonto21(String monto21) {
        this.monto21 = monto21;
    }

    /**
     * 
     * @return
     *     The monto31
     */
    @JsonProperty("monto31")
    public String getMonto31() {
        return monto31;
    }

    /**
     * 
     * @param monto31
     *     The monto31
     */
    @JsonProperty("monto31")
    public void setMonto31(String monto31) {
        this.monto31 = monto31;
    }

    /**
     * 
     * @return
     *     The numero11
     */
    @JsonProperty("numero11")
    public String getNumero11() {
        return numero11;
    }

    /**
     * 
     * @param numero11
     *     The numero11
     */
    @JsonProperty("numero11")
    public void setNumero11(String numero11) {
        this.numero11 = numero11;
    }

    /**
     * 
     * @return
     *     The numero21
     */
    @JsonProperty("numero21")
    public String getNumero21() {
        return numero21;
    }

    /**
     * 
     * @param numero21
     *     The numero21
     */
    @JsonProperty("numero21")
    public void setNumero21(String numero21) {
        this.numero21 = numero21;
    }

    /**
     * 
     * @return
     *     The numero31
     */
    @JsonProperty("numero31")
    public String getNumero31() {
        return numero31;
    }

    /**
     * 
     * @param numero31
     *     The numero31
     */
    @JsonProperty("numero31")
    public void setNumero31(String numero31) {
        this.numero31 = numero31;
    }

    /**
     * 
     * @return
     *     The flag11
     */
    @JsonProperty("flag11")
    public String getFlag11() {
        return flag11;
    }

    /**
     * 
     * @param flag11
     *     The flag11
     */
    @JsonProperty("flag11")
    public void setFlag11(String flag11) {
        this.flag11 = flag11;
    }

    /**
     * 
     * @return
     *     The flag21
     */
    @JsonProperty("flag21")
    public String getFlag21() {
        return flag21;
    }

    /**
     * 
     * @param flag21
     *     The flag21
     */
    @JsonProperty("flag21")
    public void setFlag21(String flag21) {
        this.flag21 = flag21;
    }

    /**
     * 
     * @return
     *     The flag31
     */
    @JsonProperty("flag31")
    public String getFlag31() {
        return flag31;
    }

    /**
     * 
     * @param flag31
     *     The flag31
     */
    @JsonProperty("flag31")
    public void setFlag31(String flag31) {
        this.flag31 = flag31;
    }

    /**
     * 
     * @return
     *     The string11
     */
    @JsonProperty("string11")
    public String getString11() {
        return string11;
    }

    /**
     * 
     * @param string11
     *     The string11
     */
    @JsonProperty("string11")
    public void setString11(String string11) {
        this.string11 = string11;
    }

    /**
     * 
     * @return
     *     The string21
     */
    @JsonProperty("string21")
    public String getString21() {
        return string21;
    }

    /**
     * 
     * @param string21
     *     The string21
     */
    @JsonProperty("string21")
    public void setString21(String string21) {
        this.string21 = string21;
    }

    /**
     * 
     * @return
     *     The string31
     */
    @JsonProperty("string31")
    public String getString31() {
        return string31;
    }

    /**
     * 
     * @param string31
     *     The string31
     */
    @JsonProperty("string31")
    public void setString31(String string31) {
        this.string31 = string31;
    }

    /**
     * 
     * @return
     *     The filler03
     */
    @JsonProperty("filler_03")
    public String getFiller03() {
        return filler03;
    }

    /**
     * 
     * @param filler03
     *     The filler_03
     */
    @JsonProperty("filler_03")
    public void setFiller03(String filler03) {
        this.filler03 = filler03;
    }

}
