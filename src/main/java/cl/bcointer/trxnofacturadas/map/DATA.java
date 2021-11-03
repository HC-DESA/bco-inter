
package cl.bcointer.trxnofacturadas.map;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="coderror" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="msgerror" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idwsst247" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="organizacion_s" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="num_cuenta_s" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="apaterno" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="amaterno" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="nombre_clte" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ciclo_fac" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="codigo_fv" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fec_ult_fac_cal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fec_prox_fac_cal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fec_ini_fac_act" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fec_consulta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fec_ult_proc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fec_ult_trans" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fec_prim_trans" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ind_presencia_datos" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ind_trans_restantes" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="transacciones_c" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="transacciones">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="RECORD" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="num_tarjeta_s" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="correlativo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="origen_trans" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="fec_trans" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="fec_posteo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="codigo_trans" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="tipo_trans" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="monto_compra" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="numero_cuota" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="total_de_cuotas" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="tasa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="descripcion_trans" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="glosa_trans" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="microfilm23" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="cdgo_comercio_tbk" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="cdgo_comercio_int" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="rubro" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="nombre_comercio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="rut_comercio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="dvrut_comercio" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="nro_solicitud" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="desc_rubro" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="codigo_pais_iata" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ciudad" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="moneda_fact_9" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="moneda_origen_9" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="monto_mon_origen" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="codaut" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="fecha_autorizador_s" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="hora_autorizador_s" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="estado_trans" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="monto11" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="monto21" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="monto31" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="numero11" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="numero21" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="numero31" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="flag11" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="flag21" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="flag31" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="string11" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="string21" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="string31" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="filler_03" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="monto1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="monto2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="monto3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="monto4" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="monto5" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="monto6" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="monto7" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numero1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numero2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numero3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numero4" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numero5" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numero6" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numero7" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="flag1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="flag2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="flag3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="flag4" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="flag5" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="flag6" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="flag7" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="string1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="string2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="string3" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="string4" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="string5" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="string6" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="string7" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="filler_04" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "coderror",
    "msgerror",
    "idwsst247",
    "organizacionS",
    "numCuentaS",
    "apaterno",
    "amaterno",
    "nombreClte",
    "cicloFac",
    "codigoFv",
    "fecUltFacCal",
    "fecProxFacCal",
    "fecIniFacAct",
    "fecConsulta",
    "fecUltProc",
    "fecUltTrans",
    "fecPrimTrans",
    "indPresenciaDatos",
    "indTransRestantes",
    "transaccionesC",
    "transacciones",
    "monto1",
    "monto2",
    "monto3",
    "monto4",
    "monto5",
    "monto6",
    "monto7",
    "numero1",
    "numero2",
    "numero3",
    "numero4",
    "numero5",
    "numero6",
    "numero7",
    "flag1",
    "flag2",
    "flag3",
    "flag4",
    "flag5",
    "flag6",
    "flag7",
    "string1",
    "string2",
    "string3",
    "string4",
    "string5",
    "string6",
    "string7",
    "filler04"
})
@XmlRootElement(name = "DATA")
public class DATA {

    @XmlElement(required = true)
    protected String coderror;
    @XmlElement(required = true)
    protected String msgerror;
    @XmlElement(required = true)
    protected String idwsst247;
    @XmlElement(name = "organizacion_s", required = true)
    protected String organizacionS;
    @XmlElement(name = "num_cuenta_s", required = true)
    protected String numCuentaS;
    @XmlElement(required = true)
    protected String apaterno;
    @XmlElement(required = true)
    protected String amaterno;
    @XmlElement(name = "nombre_clte", required = true)
    protected String nombreClte;
    @XmlElement(name = "ciclo_fac", required = true)
    protected String cicloFac;
    @XmlElement(name = "codigo_fv", required = true)
    protected String codigoFv;
    @XmlElement(name = "fec_ult_fac_cal", required = true)
    protected String fecUltFacCal;
    @XmlElement(name = "fec_prox_fac_cal", required = true)
    protected String fecProxFacCal;
    @XmlElement(name = "fec_ini_fac_act", required = true)
    protected String fecIniFacAct;
    @XmlElement(name = "fec_consulta", required = true)
    protected String fecConsulta;
    @XmlElement(name = "fec_ult_proc", required = true)
    protected String fecUltProc;
    @XmlElement(name = "fec_ult_trans", required = true)
    protected String fecUltTrans;
    @XmlElement(name = "fec_prim_trans", required = true)
    protected String fecPrimTrans;
    @XmlElement(name = "ind_presencia_datos", required = true)
    protected String indPresenciaDatos;
    @XmlElement(name = "ind_trans_restantes", required = true)
    protected String indTransRestantes;
    @XmlElement(name = "transacciones_c", required = true)
    protected String transaccionesC;
    @XmlElement(required = true)
    protected DATA.Transacciones transacciones;
    @XmlElement(required = true)
    protected String monto1;
    @XmlElement(required = true)
    protected String monto2;
    @XmlElement(required = true)
    protected String monto3;
    @XmlElement(required = true)
    protected String monto4;
    @XmlElement(required = true)
    protected String monto5;
    @XmlElement(required = true)
    protected String monto6;
    @XmlElement(required = true)
    protected String monto7;
    @XmlElement(required = true)
    protected String numero1;
    @XmlElement(required = true)
    protected String numero2;
    @XmlElement(required = true)
    protected String numero3;
    @XmlElement(required = true)
    protected String numero4;
    @XmlElement(required = true)
    protected String numero5;
    @XmlElement(required = true)
    protected String numero6;
    @XmlElement(required = true)
    protected String numero7;
    @XmlElement(required = true)
    protected String flag1;
    @XmlElement(required = true)
    protected String flag2;
    @XmlElement(required = true)
    protected String flag3;
    @XmlElement(required = true)
    protected String flag4;
    @XmlElement(required = true)
    protected String flag5;
    @XmlElement(required = true)
    protected String flag6;
    @XmlElement(required = true)
    protected String flag7;
    @XmlElement(required = true)
    protected String string1;
    @XmlElement(required = true)
    protected String string2;
    @XmlElement(required = true)
    protected String string3;
    @XmlElement(required = true)
    protected String string4;
    @XmlElement(required = true)
    protected String string5;
    @XmlElement(required = true)
    protected String string6;
    @XmlElement(required = true)
    protected String string7;
    @XmlElement(name = "filler_04", required = true)
    protected String filler04;

    /**
     * Obtiene el valor de la propiedad coderror.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoderror() {
        return coderror;
    }

    /**
     * Define el valor de la propiedad coderror.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoderror(String value) {
        this.coderror = value;
    }

    /**
     * Obtiene el valor de la propiedad msgerror.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgerror() {
        return msgerror;
    }

    /**
     * Define el valor de la propiedad msgerror.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgerror(String value) {
        this.msgerror = value;
    }

    /**
     * Obtiene el valor de la propiedad idwsst247.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdwsst247() {
        return idwsst247;
    }

    /**
     * Define el valor de la propiedad idwsst247.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdwsst247(String value) {
        this.idwsst247 = value;
    }

    /**
     * Obtiene el valor de la propiedad organizacionS.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizacionS() {
        return organizacionS;
    }

    /**
     * Define el valor de la propiedad organizacionS.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizacionS(String value) {
        this.organizacionS = value;
    }

    /**
     * Obtiene el valor de la propiedad numCuentaS.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumCuentaS() {
        return numCuentaS;
    }

    /**
     * Define el valor de la propiedad numCuentaS.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumCuentaS(String value) {
        this.numCuentaS = value;
    }

    /**
     * Obtiene el valor de la propiedad apaterno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApaterno() {
        return apaterno;
    }

    /**
     * Define el valor de la propiedad apaterno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApaterno(String value) {
        this.apaterno = value;
    }

    /**
     * Obtiene el valor de la propiedad amaterno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmaterno() {
        return amaterno;
    }

    /**
     * Define el valor de la propiedad amaterno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmaterno(String value) {
        this.amaterno = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreClte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreClte() {
        return nombreClte;
    }

    /**
     * Define el valor de la propiedad nombreClte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreClte(String value) {
        this.nombreClte = value;
    }

    /**
     * Obtiene el valor de la propiedad cicloFac.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCicloFac() {
        return cicloFac;
    }

    /**
     * Define el valor de la propiedad cicloFac.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCicloFac(String value) {
        this.cicloFac = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoFv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoFv() {
        return codigoFv;
    }

    /**
     * Define el valor de la propiedad codigoFv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoFv(String value) {
        this.codigoFv = value;
    }

    /**
     * Obtiene el valor de la propiedad fecUltFacCal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecUltFacCal() {
        return fecUltFacCal;
    }

    /**
     * Define el valor de la propiedad fecUltFacCal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecUltFacCal(String value) {
        this.fecUltFacCal = value;
    }

    /**
     * Obtiene el valor de la propiedad fecProxFacCal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecProxFacCal() {
        return fecProxFacCal;
    }

    /**
     * Define el valor de la propiedad fecProxFacCal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecProxFacCal(String value) {
        this.fecProxFacCal = value;
    }

    /**
     * Obtiene el valor de la propiedad fecIniFacAct.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecIniFacAct() {
        return fecIniFacAct;
    }

    /**
     * Define el valor de la propiedad fecIniFacAct.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecIniFacAct(String value) {
        this.fecIniFacAct = value;
    }

    /**
     * Obtiene el valor de la propiedad fecConsulta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecConsulta() {
        return fecConsulta;
    }

    /**
     * Define el valor de la propiedad fecConsulta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecConsulta(String value) {
        this.fecConsulta = value;
    }

    /**
     * Obtiene el valor de la propiedad fecUltProc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecUltProc() {
        return fecUltProc;
    }

    /**
     * Define el valor de la propiedad fecUltProc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecUltProc(String value) {
        this.fecUltProc = value;
    }

    /**
     * Obtiene el valor de la propiedad fecUltTrans.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecUltTrans() {
        return fecUltTrans;
    }

    /**
     * Define el valor de la propiedad fecUltTrans.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecUltTrans(String value) {
        this.fecUltTrans = value;
    }

    /**
     * Obtiene el valor de la propiedad fecPrimTrans.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecPrimTrans() {
        return fecPrimTrans;
    }

    /**
     * Define el valor de la propiedad fecPrimTrans.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecPrimTrans(String value) {
        this.fecPrimTrans = value;
    }

    /**
     * Obtiene el valor de la propiedad indPresenciaDatos.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndPresenciaDatos() {
        return indPresenciaDatos;
    }

    /**
     * Define el valor de la propiedad indPresenciaDatos.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndPresenciaDatos(String value) {
        this.indPresenciaDatos = value;
    }

    /**
     * Obtiene el valor de la propiedad indTransRestantes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndTransRestantes() {
        return indTransRestantes;
    }

    /**
     * Define el valor de la propiedad indTransRestantes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndTransRestantes(String value) {
        this.indTransRestantes = value;
    }

    /**
     * Obtiene el valor de la propiedad transaccionesC.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransaccionesC() {
        return transaccionesC;
    }

    /**
     * Define el valor de la propiedad transaccionesC.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransaccionesC(String value) {
        this.transaccionesC = value;
    }

    /**
     * Obtiene el valor de la propiedad transacciones.
     * 
     * @return
     *     possible object is
     *     {@link DATA.Transacciones }
     *     
     */
    public DATA.Transacciones getTransacciones() {
        return transacciones;
    }

    /**
     * Define el valor de la propiedad transacciones.
     * 
     * @param value
     *     allowed object is
     *     {@link DATA.Transacciones }
     *     
     */
    public void setTransacciones(DATA.Transacciones value) {
        this.transacciones = value;
    }

    /**
     * Obtiene el valor de la propiedad monto1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonto1() {
        return monto1;
    }

    /**
     * Define el valor de la propiedad monto1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonto1(String value) {
        this.monto1 = value;
    }

    /**
     * Obtiene el valor de la propiedad monto2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonto2() {
        return monto2;
    }

    /**
     * Define el valor de la propiedad monto2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonto2(String value) {
        this.monto2 = value;
    }

    /**
     * Obtiene el valor de la propiedad monto3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonto3() {
        return monto3;
    }

    /**
     * Define el valor de la propiedad monto3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonto3(String value) {
        this.monto3 = value;
    }

    /**
     * Obtiene el valor de la propiedad monto4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonto4() {
        return monto4;
    }

    /**
     * Define el valor de la propiedad monto4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonto4(String value) {
        this.monto4 = value;
    }

    /**
     * Obtiene el valor de la propiedad monto5.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonto5() {
        return monto5;
    }

    /**
     * Define el valor de la propiedad monto5.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonto5(String value) {
        this.monto5 = value;
    }

    /**
     * Obtiene el valor de la propiedad monto6.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonto6() {
        return monto6;
    }

    /**
     * Define el valor de la propiedad monto6.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonto6(String value) {
        this.monto6 = value;
    }

    /**
     * Obtiene el valor de la propiedad monto7.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonto7() {
        return monto7;
    }

    /**
     * Define el valor de la propiedad monto7.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonto7(String value) {
        this.monto7 = value;
    }

    /**
     * Obtiene el valor de la propiedad numero1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumero1() {
        return numero1;
    }

    /**
     * Define el valor de la propiedad numero1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumero1(String value) {
        this.numero1 = value;
    }

    /**
     * Obtiene el valor de la propiedad numero2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumero2() {
        return numero2;
    }

    /**
     * Define el valor de la propiedad numero2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumero2(String value) {
        this.numero2 = value;
    }

    /**
     * Obtiene el valor de la propiedad numero3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumero3() {
        return numero3;
    }

    /**
     * Define el valor de la propiedad numero3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumero3(String value) {
        this.numero3 = value;
    }

    /**
     * Obtiene el valor de la propiedad numero4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumero4() {
        return numero4;
    }

    /**
     * Define el valor de la propiedad numero4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumero4(String value) {
        this.numero4 = value;
    }

    /**
     * Obtiene el valor de la propiedad numero5.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumero5() {
        return numero5;
    }

    /**
     * Define el valor de la propiedad numero5.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumero5(String value) {
        this.numero5 = value;
    }

    /**
     * Obtiene el valor de la propiedad numero6.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumero6() {
        return numero6;
    }

    /**
     * Define el valor de la propiedad numero6.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumero6(String value) {
        this.numero6 = value;
    }

    /**
     * Obtiene el valor de la propiedad numero7.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumero7() {
        return numero7;
    }

    /**
     * Define el valor de la propiedad numero7.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumero7(String value) {
        this.numero7 = value;
    }

    /**
     * Obtiene el valor de la propiedad flag1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlag1() {
        return flag1;
    }

    /**
     * Define el valor de la propiedad flag1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlag1(String value) {
        this.flag1 = value;
    }

    /**
     * Obtiene el valor de la propiedad flag2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlag2() {
        return flag2;
    }

    /**
     * Define el valor de la propiedad flag2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlag2(String value) {
        this.flag2 = value;
    }

    /**
     * Obtiene el valor de la propiedad flag3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlag3() {
        return flag3;
    }

    /**
     * Define el valor de la propiedad flag3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlag3(String value) {
        this.flag3 = value;
    }

    /**
     * Obtiene el valor de la propiedad flag4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlag4() {
        return flag4;
    }

    /**
     * Define el valor de la propiedad flag4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlag4(String value) {
        this.flag4 = value;
    }

    /**
     * Obtiene el valor de la propiedad flag5.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlag5() {
        return flag5;
    }

    /**
     * Define el valor de la propiedad flag5.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlag5(String value) {
        this.flag5 = value;
    }

    /**
     * Obtiene el valor de la propiedad flag6.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlag6() {
        return flag6;
    }

    /**
     * Define el valor de la propiedad flag6.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlag6(String value) {
        this.flag6 = value;
    }

    /**
     * Obtiene el valor de la propiedad flag7.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlag7() {
        return flag7;
    }

    /**
     * Define el valor de la propiedad flag7.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlag7(String value) {
        this.flag7 = value;
    }

    /**
     * Obtiene el valor de la propiedad string1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getString1() {
        return string1;
    }

    /**
     * Define el valor de la propiedad string1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setString1(String value) {
        this.string1 = value;
    }

    /**
     * Obtiene el valor de la propiedad string2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getString2() {
        return string2;
    }

    /**
     * Define el valor de la propiedad string2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setString2(String value) {
        this.string2 = value;
    }

    /**
     * Obtiene el valor de la propiedad string3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getString3() {
        return string3;
    }

    /**
     * Define el valor de la propiedad string3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setString3(String value) {
        this.string3 = value;
    }

    /**
     * Obtiene el valor de la propiedad string4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getString4() {
        return string4;
    }

    /**
     * Define el valor de la propiedad string4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setString4(String value) {
        this.string4 = value;
    }

    /**
     * Obtiene el valor de la propiedad string5.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getString5() {
        return string5;
    }

    /**
     * Define el valor de la propiedad string5.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setString5(String value) {
        this.string5 = value;
    }

    /**
     * Obtiene el valor de la propiedad string6.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getString6() {
        return string6;
    }

    /**
     * Define el valor de la propiedad string6.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setString6(String value) {
        this.string6 = value;
    }

    /**
     * Obtiene el valor de la propiedad string7.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getString7() {
        return string7;
    }

    /**
     * Define el valor de la propiedad string7.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setString7(String value) {
        this.string7 = value;
    }

    /**
     * Obtiene el valor de la propiedad filler04.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiller04() {
        return filler04;
    }

    /**
     * Define el valor de la propiedad filler04.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiller04(String value) {
        this.filler04 = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="RECORD" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="num_tarjeta_s" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="correlativo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="origen_trans" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="fec_trans" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="fec_posteo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="codigo_trans" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="tipo_trans" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="monto_compra" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="numero_cuota" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="total_de_cuotas" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="tasa" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="descripcion_trans" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="glosa_trans" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="microfilm23" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="cdgo_comercio_tbk" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="cdgo_comercio_int" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="rubro" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="nombre_comercio" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="rut_comercio" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="dvrut_comercio" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="nro_solicitud" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="desc_rubro" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="codigo_pais_iata" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ciudad" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="moneda_fact_9" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="moneda_origen_9" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="monto_mon_origen" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="codaut" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="fecha_autorizador_s" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="hora_autorizador_s" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="estado_trans" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="monto11" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="monto21" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="monto31" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="numero11" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="numero21" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="numero31" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="flag11" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="flag21" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="flag31" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="string11" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="string21" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="string31" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="filler_03" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "record"
    })
    public static class Transacciones {

        @XmlElement(name = "RECORD")
        protected List<DATA.Transacciones.RECORD> record;

        /**
         * Gets the value of the record property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the record property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRECORD().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DATA.Transacciones.RECORD }
         * 
         * 
         */
        public List<DATA.Transacciones.RECORD> getRECORD() {
            if (record == null) {
                record = new ArrayList<DATA.Transacciones.RECORD>();
            }
            return this.record;
        }

        public void setRECORD(List<DATA.Transacciones.RECORD> record) {
            this.record = record;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="num_tarjeta_s" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="correlativo" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="origen_trans" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="fec_trans" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="fec_posteo" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="codigo_trans" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="tipo_trans" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="monto_compra" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="numero_cuota" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="total_de_cuotas" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="tasa" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="descripcion_trans" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="glosa_trans" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="microfilm23" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="cdgo_comercio_tbk" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="cdgo_comercio_int" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="rubro" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="nombre_comercio" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="rut_comercio" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="dvrut_comercio" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="nro_solicitud" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="desc_rubro" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="codigo_pais_iata" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ciudad" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="moneda_fact_9" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="moneda_origen_9" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="monto_mon_origen" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="codaut" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="fecha_autorizador_s" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="hora_autorizador_s" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="estado_trans" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="monto11" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="monto21" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="monto31" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="numero11" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="numero21" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="numero31" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="flag11" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="flag21" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="flag31" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="string11" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="string21" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="string31" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="filler_03" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "numTarjetaS",
            "correlativo",
            "origenTrans",
            "fecTrans",
            "fecPosteo",
            "codigoTrans",
            "tipoTrans",
            "montoCompra",
            "numeroCuota",
            "totalDeCuotas",
            "tasa",
            "descripcionTrans",
            "glosaTrans",
            "microfilm23",
            "cdgoComercioTbk",
            "cdgoComercioInt",
            "rubro",
            "nombreComercio",
            "rutComercio",
            "dvrutComercio",
            "nroSolicitud",
            "descRubro",
            "codigoPaisIata",
            "ciudad",
            "monedaFact9",
            "monedaOrigen9",
            "montoMonOrigen",
            "codaut",
            "fechaAutorizadorS",
            "horaAutorizadorS",
            "estadoTrans",
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
            "filler03"
        })
        public static class RECORD {

            @XmlElement(name = "num_tarjeta_s", required = true)
            protected String numTarjetaS;
            @XmlElement(required = true)
            protected String correlativo;
            @XmlElement(name = "origen_trans", required = true)
            protected String origenTrans;
            @XmlElement(name = "fec_trans", required = true)
            protected String fecTrans;
            @XmlElement(name = "fec_posteo", required = true)
            protected String fecPosteo;
            @XmlElement(name = "codigo_trans", required = true)
            protected String codigoTrans;
            @XmlElement(name = "tipo_trans", required = true)
            protected String tipoTrans;
            @XmlElement(name = "monto_compra", required = true)
            protected String montoCompra;
            @XmlElement(name = "numero_cuota", required = true)
            protected String numeroCuota;
            @XmlElement(name = "total_de_cuotas", required = true)
            protected String totalDeCuotas;
            @XmlElement(required = true)
            protected String tasa;
            @XmlElement(name = "descripcion_trans", required = true)
            protected String descripcionTrans;
            @XmlElement(name = "glosa_trans", required = true)
            protected String glosaTrans;
            @XmlElement(required = true)
            protected String microfilm23;
            @XmlElement(name = "cdgo_comercio_tbk", required = true)
            protected String cdgoComercioTbk;
            @XmlElement(name = "cdgo_comercio_int", required = true)
            protected String cdgoComercioInt;
            @XmlElement(required = true)
            protected String rubro;
            @XmlElement(name = "nombre_comercio", required = true)
            protected String nombreComercio;
            @XmlElement(name = "rut_comercio", required = true)
            protected String rutComercio;
            @XmlElement(name = "dvrut_comercio", required = true)
            protected String dvrutComercio;
            @XmlElement(name = "nro_solicitud", required = true)
            protected String nroSolicitud;
            @XmlElement(name = "desc_rubro", required = true)
            protected String descRubro;
            @XmlElement(name = "codigo_pais_iata", required = true)
            protected String codigoPaisIata;
            @XmlElement(required = true)
            protected String ciudad;
            @XmlElement(name = "moneda_fact_9", required = true)
            protected String monedaFact9;
            @XmlElement(name = "moneda_origen_9", required = true)
            protected String monedaOrigen9;
            @XmlElement(name = "monto_mon_origen", required = true)
            protected String montoMonOrigen;
            @XmlElement(required = true)
            protected String codaut;
            @XmlElement(name = "fecha_autorizador_s", required = true)
            protected String fechaAutorizadorS;
            @XmlElement(name = "hora_autorizador_s", required = true)
            protected String horaAutorizadorS;
            @XmlElement(name = "estado_trans", required = true)
            protected String estadoTrans;
            @XmlElement(required = true)
            protected String monto11;
            @XmlElement(required = true)
            protected String monto21;
            @XmlElement(required = true)
            protected String monto31;
            @XmlElement(required = true)
            protected String numero11;
            @XmlElement(required = true)
            protected String numero21;
            @XmlElement(required = true)
            protected String numero31;
            @XmlElement(required = true)
            protected String flag11;
            @XmlElement(required = true)
            protected String flag21;
            @XmlElement(required = true)
            protected String flag31;
            @XmlElement(required = true)
            protected String string11;
            @XmlElement(required = true)
            protected String string21;
            @XmlElement(required = true)
            protected String string31;
            @XmlElement(name = "filler_03", required = true)
            protected String filler03;

            /**
             * Obtiene el valor de la propiedad numTarjetaS.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumTarjetaS() {
                return numTarjetaS;
            }

            /**
             * Define el valor de la propiedad numTarjetaS.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumTarjetaS(String value) {
                this.numTarjetaS = value;
            }

            /**
             * Obtiene el valor de la propiedad correlativo.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCorrelativo() {
                return correlativo;
            }

            /**
             * Define el valor de la propiedad correlativo.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCorrelativo(String value) {
                this.correlativo = value;
            }

            /**
             * Obtiene el valor de la propiedad origenTrans.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOrigenTrans() {
                return origenTrans;
            }

            /**
             * Define el valor de la propiedad origenTrans.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOrigenTrans(String value) {
                this.origenTrans = value;
            }

            /**
             * Obtiene el valor de la propiedad fecTrans.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFecTrans() {
                return fecTrans;
            }

            /**
             * Define el valor de la propiedad fecTrans.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFecTrans(String value) {
                this.fecTrans = value;
            }

            /**
             * Obtiene el valor de la propiedad fecPosteo.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFecPosteo() {
                return fecPosteo;
            }

            /**
             * Define el valor de la propiedad fecPosteo.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFecPosteo(String value) {
                this.fecPosteo = value;
            }

            /**
             * Obtiene el valor de la propiedad codigoTrans.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodigoTrans() {
                return codigoTrans;
            }

            /**
             * Define el valor de la propiedad codigoTrans.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodigoTrans(String value) {
                this.codigoTrans = value;
            }

            /**
             * Obtiene el valor de la propiedad tipoTrans.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTipoTrans() {
                return tipoTrans;
            }

            /**
             * Define el valor de la propiedad tipoTrans.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTipoTrans(String value) {
                this.tipoTrans = value;
            }

            /**
             * Obtiene el valor de la propiedad montoCompra.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMontoCompra() {
                return montoCompra;
            }

            /**
             * Define el valor de la propiedad montoCompra.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMontoCompra(String value) {
                this.montoCompra = value;
            }

            /**
             * Obtiene el valor de la propiedad numeroCuota.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumeroCuota() {
                return numeroCuota;
            }

            /**
             * Define el valor de la propiedad numeroCuota.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumeroCuota(String value) {
                this.numeroCuota = value;
            }

            /**
             * Obtiene el valor de la propiedad totalDeCuotas.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTotalDeCuotas() {
                return totalDeCuotas;
            }

            /**
             * Define el valor de la propiedad totalDeCuotas.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTotalDeCuotas(String value) {
                this.totalDeCuotas = value;
            }

            /**
             * Obtiene el valor de la propiedad tasa.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTasa() {
                return tasa;
            }

            /**
             * Define el valor de la propiedad tasa.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTasa(String value) {
                this.tasa = value;
            }

            /**
             * Obtiene el valor de la propiedad descripcionTrans.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescripcionTrans() {
                return descripcionTrans;
            }

            /**
             * Define el valor de la propiedad descripcionTrans.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescripcionTrans(String value) {
                this.descripcionTrans = value;
            }

            /**
             * Obtiene el valor de la propiedad glosaTrans.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGlosaTrans() {
                return glosaTrans;
            }

            /**
             * Define el valor de la propiedad glosaTrans.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGlosaTrans(String value) {
                this.glosaTrans = value;
            }

            /**
             * Obtiene el valor de la propiedad microfilm23.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMicrofilm23() {
                return microfilm23;
            }

            /**
             * Define el valor de la propiedad microfilm23.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMicrofilm23(String value) {
                this.microfilm23 = value;
            }

            /**
             * Obtiene el valor de la propiedad cdgoComercioTbk.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCdgoComercioTbk() {
                return cdgoComercioTbk;
            }

            /**
             * Define el valor de la propiedad cdgoComercioTbk.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCdgoComercioTbk(String value) {
                this.cdgoComercioTbk = value;
            }

            /**
             * Obtiene el valor de la propiedad cdgoComercioInt.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCdgoComercioInt() {
                return cdgoComercioInt;
            }

            /**
             * Define el valor de la propiedad cdgoComercioInt.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCdgoComercioInt(String value) {
                this.cdgoComercioInt = value;
            }

            /**
             * Obtiene el valor de la propiedad rubro.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRubro() {
                return rubro;
            }

            /**
             * Define el valor de la propiedad rubro.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRubro(String value) {
                this.rubro = value;
            }

            /**
             * Obtiene el valor de la propiedad nombreComercio.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNombreComercio() {
                return nombreComercio;
            }

            /**
             * Define el valor de la propiedad nombreComercio.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNombreComercio(String value) {
                this.nombreComercio = value;
            }

            /**
             * Obtiene el valor de la propiedad rutComercio.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRutComercio() {
                return rutComercio;
            }

            /**
             * Define el valor de la propiedad rutComercio.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRutComercio(String value) {
                this.rutComercio = value;
            }

            /**
             * Obtiene el valor de la propiedad dvrutComercio.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDvrutComercio() {
                return dvrutComercio;
            }

            /**
             * Define el valor de la propiedad dvrutComercio.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDvrutComercio(String value) {
                this.dvrutComercio = value;
            }

            /**
             * Obtiene el valor de la propiedad nroSolicitud.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNroSolicitud() {
                return nroSolicitud;
            }

            /**
             * Define el valor de la propiedad nroSolicitud.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNroSolicitud(String value) {
                this.nroSolicitud = value;
            }

            /**
             * Obtiene el valor de la propiedad descRubro.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescRubro() {
                return descRubro;
            }

            /**
             * Define el valor de la propiedad descRubro.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescRubro(String value) {
                this.descRubro = value;
            }

            /**
             * Obtiene el valor de la propiedad codigoPaisIata.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodigoPaisIata() {
                return codigoPaisIata;
            }

            /**
             * Define el valor de la propiedad codigoPaisIata.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodigoPaisIata(String value) {
                this.codigoPaisIata = value;
            }

            /**
             * Obtiene el valor de la propiedad ciudad.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCiudad() {
                return ciudad;
            }

            /**
             * Define el valor de la propiedad ciudad.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCiudad(String value) {
                this.ciudad = value;
            }

            /**
             * Obtiene el valor de la propiedad monedaFact9.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMonedaFact9() {
                return monedaFact9;
            }

            /**
             * Define el valor de la propiedad monedaFact9.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMonedaFact9(String value) {
                this.monedaFact9 = value;
            }

            /**
             * Obtiene el valor de la propiedad monedaOrigen9.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMonedaOrigen9() {
                return monedaOrigen9;
            }

            /**
             * Define el valor de la propiedad monedaOrigen9.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMonedaOrigen9(String value) {
                this.monedaOrigen9 = value;
            }

            /**
             * Obtiene el valor de la propiedad montoMonOrigen.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMontoMonOrigen() {
                return montoMonOrigen;
            }

            /**
             * Define el valor de la propiedad montoMonOrigen.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMontoMonOrigen(String value) {
                this.montoMonOrigen = value;
            }

            /**
             * Obtiene el valor de la propiedad codaut.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodaut() {
                return codaut;
            }

            /**
             * Define el valor de la propiedad codaut.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodaut(String value) {
                this.codaut = value;
            }

            /**
             * Obtiene el valor de la propiedad fechaAutorizadorS.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFechaAutorizadorS() {
                return fechaAutorizadorS;
            }

            /**
             * Define el valor de la propiedad fechaAutorizadorS.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFechaAutorizadorS(String value) {
                this.fechaAutorizadorS = value;
            }

            /**
             * Obtiene el valor de la propiedad horaAutorizadorS.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHoraAutorizadorS() {
                return horaAutorizadorS;
            }

            /**
             * Define el valor de la propiedad horaAutorizadorS.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHoraAutorizadorS(String value) {
                this.horaAutorizadorS = value;
            }

            /**
             * Obtiene el valor de la propiedad estadoTrans.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEstadoTrans() {
                return estadoTrans;
            }

            /**
             * Define el valor de la propiedad estadoTrans.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEstadoTrans(String value) {
                this.estadoTrans = value;
            }

            /**
             * Obtiene el valor de la propiedad monto11.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMonto11() {
                return monto11;
            }

            /**
             * Define el valor de la propiedad monto11.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMonto11(String value) {
                this.monto11 = value;
            }

            /**
             * Obtiene el valor de la propiedad monto21.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMonto21() {
                return monto21;
            }

            /**
             * Define el valor de la propiedad monto21.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMonto21(String value) {
                this.monto21 = value;
            }

            /**
             * Obtiene el valor de la propiedad monto31.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMonto31() {
                return monto31;
            }

            /**
             * Define el valor de la propiedad monto31.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMonto31(String value) {
                this.monto31 = value;
            }

            /**
             * Obtiene el valor de la propiedad numero11.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumero11() {
                return numero11;
            }

            /**
             * Define el valor de la propiedad numero11.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumero11(String value) {
                this.numero11 = value;
            }

            /**
             * Obtiene el valor de la propiedad numero21.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumero21() {
                return numero21;
            }

            /**
             * Define el valor de la propiedad numero21.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumero21(String value) {
                this.numero21 = value;
            }

            /**
             * Obtiene el valor de la propiedad numero31.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumero31() {
                return numero31;
            }

            /**
             * Define el valor de la propiedad numero31.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumero31(String value) {
                this.numero31 = value;
            }

            /**
             * Obtiene el valor de la propiedad flag11.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFlag11() {
                return flag11;
            }

            /**
             * Define el valor de la propiedad flag11.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFlag11(String value) {
                this.flag11 = value;
            }

            /**
             * Obtiene el valor de la propiedad flag21.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFlag21() {
                return flag21;
            }

            /**
             * Define el valor de la propiedad flag21.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFlag21(String value) {
                this.flag21 = value;
            }

            /**
             * Obtiene el valor de la propiedad flag31.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFlag31() {
                return flag31;
            }

            /**
             * Define el valor de la propiedad flag31.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFlag31(String value) {
                this.flag31 = value;
            }

            /**
             * Obtiene el valor de la propiedad string11.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getString11() {
                return string11;
            }

            /**
             * Define el valor de la propiedad string11.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setString11(String value) {
                this.string11 = value;
            }

            /**
             * Obtiene el valor de la propiedad string21.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getString21() {
                return string21;
            }

            /**
             * Define el valor de la propiedad string21.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setString21(String value) {
                this.string21 = value;
            }

            /**
             * Obtiene el valor de la propiedad string31.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getString31() {
                return string31;
            }

            /**
             * Define el valor de la propiedad string31.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setString31(String value) {
                this.string31 = value;
            }

            /**
             * Obtiene el valor de la propiedad filler03.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFiller03() {
                return filler03;
            }

            /**
             * Define el valor de la propiedad filler03.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFiller03(String value) {
                this.filler03 = value;
            }

        }

    }

}
