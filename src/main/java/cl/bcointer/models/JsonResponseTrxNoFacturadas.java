package cl.bcointer.models;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "coderror",
    "msgerror",
    "idwsst247",
    "organizacion_s",
    "num_cuenta_s",
    "apaterno",
    "amaterno",
    "nombre_clte",
    "ciclo_fac",
    "codigo_fv",
    "fec_ult_fac_cal",
    "fec_prox_fac_cal",
    "fec_ini_fac_act",
    "fec_consulta",
    "fec_ult_proc",
    "fec_ult_trans",
    "fec_prim_trans",
    "ind_presencia_datos",
    "ind_trans_restantes",
    "transacciones_c",
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
    "filler_04"
})
public class JsonResponseTrxNoFacturadas {

    @JsonProperty("coderror")
    private String coderror;
    @JsonProperty("msgerror")
    private String msgerror;
    @JsonProperty("idwsst247")
    private String idwsst247;
    @JsonProperty("organizacion_s")
    private String organizacionS;
    @JsonProperty("num_cuenta_s")
    private String numCuentaS;
    @JsonProperty("apaterno")
    private String apaterno;
    @JsonProperty("amaterno")
    private String amaterno;
    @JsonProperty("nombre_clte")
    private String nombreClte;
    @JsonProperty("ciclo_fac")
    private String cicloFac;
    @JsonProperty("codigo_fv")
    private String codigoFv;
    @JsonProperty("fec_ult_fac_cal")
    private String fecUltFacCal;
    @JsonProperty("fec_prox_fac_cal")
    private String fecProxFacCal;
    @JsonProperty("fec_ini_fac_act")
    private String fecIniFacAct;
    @JsonProperty("fec_consulta")
    private String fecConsulta;
    @JsonProperty("fec_ult_proc")
    private String fecUltProc;
    @JsonProperty("fec_ult_trans")
    private String fecUltTrans;
    @JsonProperty("fec_prim_trans")
    private String fecPrimTrans;
    @JsonProperty("ind_presencia_datos")
    private String indPresenciaDatos;
    @JsonProperty("ind_trans_restantes")
    private String indTransRestantes;
    @JsonProperty("transacciones_c")
    private String transaccionesC;
    @JsonProperty("transacciones")
    private List<TrxNoFacturadasTransacciones> transacciones = new ArrayList<TrxNoFacturadasTransacciones>();
    @JsonProperty("monto1")
    private String monto1;
    @JsonProperty("monto2")
    private String monto2;
    @JsonProperty("monto3")
    private String monto3;
    @JsonProperty("monto4")
    private String monto4;
    @JsonProperty("monto5")
    private String monto5;
    @JsonProperty("monto6")
    private String monto6;
    @JsonProperty("monto7")
    private String monto7;
    @JsonProperty("numero1")
    private String numero1;
    @JsonProperty("numero2")
    private String numero2;
    @JsonProperty("numero3")
    private String numero3;
    @JsonProperty("numero4")
    private String numero4;
    @JsonProperty("numero5")
    private String numero5;
    @JsonProperty("numero6")
    private String numero6;
    @JsonProperty("numero7")
    private String numero7;
    @JsonProperty("flag1")
    private String flag1;
    @JsonProperty("flag2")
    private String flag2;
    @JsonProperty("flag3")
    private String flag3;
    @JsonProperty("flag4")
    private String flag4;
    @JsonProperty("flag5")
    private String flag5;
    @JsonProperty("flag6")
    private String flag6;
    @JsonProperty("flag7")
    private String flag7;
    @JsonProperty("string1")
    private String string1;
    @JsonProperty("string2")
    private String string2;
    @JsonProperty("string3")
    private String string3;
    @JsonProperty("string4")
    private String string4;
    @JsonProperty("string5")
    private String string5;
    @JsonProperty("string6")
    private String string6;
    @JsonProperty("string7")
    private String string7;
    @JsonProperty("filler_04")
    private String filler04;

    /**
     * 
     * @return
     *     The coderror
     */
    @JsonProperty("coderror")
    public String getCoderror() {
        return coderror;
    }

    /**
     * 
     * @param coderror
     *     The coderror
     */
    @JsonProperty("coderror")
    public void setCoderror(String coderror) {
        this.coderror = coderror;
    }

    /**
     * 
     * @return
     *     The msgerror
     */
    @JsonProperty("msgerror")
    public String getMsgerror() {
        return msgerror;
    }

    /**
     * 
     * @param msgerror
     *     The msgerror
     */
    @JsonProperty("msgerror")
    public void setMsgerror(String msgerror) {
        this.msgerror = msgerror;
    }

    /**
     * 
     * @return
     *     The idwsst247
     */
    @JsonProperty("idwsst247")
    public String getIdwsst247() {
        return idwsst247;
    }

    /**
     * 
     * @param idwsst247
     *     The idwsst247
     */
    @JsonProperty("idwsst247")
    public void setIdwsst247(String idwsst247) {
        this.idwsst247 = idwsst247;
    }

    /**
     * 
     * @return
     *     The organizacionS
     */
    @JsonProperty("organizacion_s")
    public String getOrganizacionS() {
        return organizacionS;
    }

    /**
     * 
     * @param organizacionS
     *     The organizacion_s
     */
    @JsonProperty("organizacion_s")
    public void setOrganizacionS(String organizacionS) {
        this.organizacionS = organizacionS;
    }

    /**
     * 
     * @return
     *     The numCuentaS
     */
    @JsonProperty("num_cuenta_s")
    public String getNumCuentaS() {
        return numCuentaS;
    }

    /**
     * 
     * @param numCuentaS
     *     The num_cuenta_s
     */
    @JsonProperty("num_cuenta_s")
    public void setNumCuentaS(String numCuentaS) {
        this.numCuentaS = numCuentaS;
    }

    /**
     * 
     * @return
     *     The apaterno
     */
    @JsonProperty("apaterno")
    public String getApaterno() {
        return apaterno;
    }

    /**
     * 
     * @param apaterno
     *     The apaterno
     */
    @JsonProperty("apaterno")
    public void setApaterno(String apaterno) {
        this.apaterno = apaterno;
    }

    /**
     * 
     * @return
     *     The amaterno
     */
    @JsonProperty("amaterno")
    public String getAmaterno() {
        return amaterno;
    }

    /**
     * 
     * @param amaterno
     *     The amaterno
     */
    @JsonProperty("amaterno")
    public void setAmaterno(String amaterno) {
        this.amaterno = amaterno;
    }

    /**
     * 
     * @return
     *     The nombreClte
     */
    @JsonProperty("nombre_clte")
    public String getNombreClte() {
        return nombreClte;
    }

    /**
     * 
     * @param nombreClte
     *     The nombre_clte
     */
    @JsonProperty("nombre_clte")
    public void setNombreClte(String nombreClte) {
        this.nombreClte = nombreClte;
    }

    /**
     * 
     * @return
     *     The cicloFac
     */
    @JsonProperty("ciclo_fac")
    public String getCicloFac() {
        return cicloFac;
    }

    /**
     * 
     * @param cicloFac
     *     The ciclo_fac
     */
    @JsonProperty("ciclo_fac")
    public void setCicloFac(String cicloFac) {
        this.cicloFac = cicloFac;
    }

    /**
     * 
     * @return
     *     The codigoFv
     */
    @JsonProperty("codigo_fv")
    public String getCodigoFv() {
        return codigoFv;
    }

    /**
     * 
     * @param codigoFv
     *     The codigo_fv
     */
    @JsonProperty("codigo_fv")
    public void setCodigoFv(String codigoFv) {
        this.codigoFv = codigoFv;
    }

    /**
     * 
     * @return
     *     The fecUltFacCal
     */
    @JsonProperty("fec_ult_fac_cal")
    public String getFecUltFacCal() {
        return fecUltFacCal;
    }

    /**
     * 
     * @param fecUltFacCal
     *     The fec_ult_fac_cal
     */
    @JsonProperty("fec_ult_fac_cal")
    public void setFecUltFacCal(String fecUltFacCal) {
        this.fecUltFacCal = fecUltFacCal;
    }

    /**
     * 
     * @return
     *     The fecProxFacCal
     */
    @JsonProperty("fec_prox_fac_cal")
    public String getFecProxFacCal() {
        return fecProxFacCal;
    }

    /**
     * 
     * @param fecProxFacCal
     *     The fec_prox_fac_cal
     */
    @JsonProperty("fec_prox_fac_cal")
    public void setFecProxFacCal(String fecProxFacCal) {
        this.fecProxFacCal = fecProxFacCal;
    }

    /**
     * 
     * @return
     *     The fecIniFacAct
     */
    @JsonProperty("fec_ini_fac_act")
    public String getFecIniFacAct() {
        return fecIniFacAct;
    }

    /**
     * 
     * @param fecIniFacAct
     *     The fec_ini_fac_act
     */
    @JsonProperty("fec_ini_fac_act")
    public void setFecIniFacAct(String fecIniFacAct) {
        this.fecIniFacAct = fecIniFacAct;
    }

    /**
     * 
     * @return
     *     The fecConsulta
     */
    @JsonProperty("fec_consulta")
    public String getFecConsulta() {
        return fecConsulta;
    }

    /**
     * 
     * @param fecConsulta
     *     The fec_consulta
     */
    @JsonProperty("fec_consulta")
    public void setFecConsulta(String fecConsulta) {
        this.fecConsulta = fecConsulta;
    }

    /**
     * 
     * @return
     *     The fecUltProc
     */
    @JsonProperty("fec_ult_proc")
    public String getFecUltProc() {
        return fecUltProc;
    }

    /**
     * 
     * @param fecUltProc
     *     The fec_ult_proc
     */
    @JsonProperty("fec_ult_proc")
    public void setFecUltProc(String fecUltProc) {
        this.fecUltProc = fecUltProc;
    }

    /**
     * 
     * @return
     *     The fecUltTrans
     */
    @JsonProperty("fec_ult_trans")
    public String getFecUltTrans() {
        return fecUltTrans;
    }

    /**
     * 
     * @param fecUltTrans
     *     The fec_ult_trans
     */
    @JsonProperty("fec_ult_trans")
    public void setFecUltTrans(String fecUltTrans) {
        this.fecUltTrans = fecUltTrans;
    }

    /**
     * 
     * @return
     *     The fecPrimTrans
     */
    @JsonProperty("fec_prim_trans")
    public String getFecPrimTrans() {
        return fecPrimTrans;
    }

    /**
     * 
     * @param fecPrimTrans
     *     The fec_prim_trans
     */
    @JsonProperty("fec_prim_trans")
    public void setFecPrimTrans(String fecPrimTrans) {
        this.fecPrimTrans = fecPrimTrans;
    }

    /**
     * 
     * @return
     *     The indPresenciaDatos
     */
    @JsonProperty("ind_presencia_datos")
    public String getIndPresenciaDatos() {
        return indPresenciaDatos;
    }

    /**
     * 
     * @param indPresenciaDatos
     *     The ind_presencia_datos
     */
    @JsonProperty("ind_presencia_datos")
    public void setIndPresenciaDatos(String indPresenciaDatos) {
        this.indPresenciaDatos = indPresenciaDatos;
    }

    /**
     * 
     * @return
     *     The indTransRestantes
     */
    @JsonProperty("ind_trans_restantes")
    public String getIndTransRestantes() {
        return indTransRestantes;
    }

    /**
     * 
     * @param indTransRestantes
     *     The ind_trans_restantes
     */
    @JsonProperty("ind_trans_restantes")
    public void setIndTransRestantes(String indTransRestantes) {
        this.indTransRestantes = indTransRestantes;
    }

    /**
     * 
     * @return
     *     The transaccionesC
     */
    @JsonProperty("transacciones_c")
    public String getTransaccionesC() {
        return transaccionesC;
    }

    /**
     * 
     * @param transaccionesC
     *     The transacciones_c
     */
    @JsonProperty("transacciones_c")
    public void setTransaccionesC(String transaccionesC) {
        this.transaccionesC = transaccionesC;
    }

    /**
     * 
     * @return
     *     The transacciones
     */
    @JsonProperty("transacciones")
    public List<TrxNoFacturadasTransacciones> getTransacciones() {
        return transacciones;
    }

    /**
     * 
     * @param transacciones
     *     The transacciones
     */
    @JsonProperty("transacciones")
    public void setTransacciones(List<TrxNoFacturadasTransacciones> transacciones) {
        this.transacciones = transacciones;
    }

    /**
     * 
     * @return
     *     The monto1
     */
    @JsonProperty("monto1")
    public String getMonto1() {
        return monto1;
    }

    /**
     * 
     * @param monto1
     *     The monto1
     */
    @JsonProperty("monto1")
    public void setMonto1(String monto1) {
        this.monto1 = monto1;
    }

    /**
     * 
     * @return
     *     The monto2
     */
    @JsonProperty("monto2")
    public String getMonto2() {
        return monto2;
    }

    /**
     * 
     * @param monto2
     *     The monto2
     */
    @JsonProperty("monto2")
    public void setMonto2(String monto2) {
        this.monto2 = monto2;
    }

    /**
     * 
     * @return
     *     The monto3
     */
    @JsonProperty("monto3")
    public String getMonto3() {
        return monto3;
    }

    /**
     * 
     * @param monto3
     *     The monto3
     */
    @JsonProperty("monto3")
    public void setMonto3(String monto3) {
        this.monto3 = monto3;
    }

    /**
     * 
     * @return
     *     The monto4
     */
    @JsonProperty("monto4")
    public String getMonto4() {
        return monto4;
    }

    /**
     * 
     * @param monto4
     *     The monto4
     */
    @JsonProperty("monto4")
    public void setMonto4(String monto4) {
        this.monto4 = monto4;
    }

    /**
     * 
     * @return
     *     The monto5
     */
    @JsonProperty("monto5")
    public String getMonto5() {
        return monto5;
    }

    /**
     * 
     * @param monto5
     *     The monto5
     */
    @JsonProperty("monto5")
    public void setMonto5(String monto5) {
        this.monto5 = monto5;
    }

    /**
     * 
     * @return
     *     The monto6
     */
    @JsonProperty("monto6")
    public String getMonto6() {
        return monto6;
    }

    /**
     * 
     * @param monto6
     *     The monto6
     */
    @JsonProperty("monto6")
    public void setMonto6(String monto6) {
        this.monto6 = monto6;
    }

    /**
     * 
     * @return
     *     The monto7
     */
    @JsonProperty("monto7")
    public String getMonto7() {
        return monto7;
    }

    /**
     * 
     * @param monto7
     *     The monto7
     */
    @JsonProperty("monto7")
    public void setMonto7(String monto7) {
        this.monto7 = monto7;
    }

    /**
     * 
     * @return
     *     The numero1
     */
    @JsonProperty("numero1")
    public String getNumero1() {
        return numero1;
    }

    /**
     * 
     * @param numero1
     *     The numero1
     */
    @JsonProperty("numero1")
    public void setNumero1(String numero1) {
        this.numero1 = numero1;
    }

    /**
     * 
     * @return
     *     The numero2
     */
    @JsonProperty("numero2")
    public String getNumero2() {
        return numero2;
    }

    /**
     * 
     * @param numero2
     *     The numero2
     */
    @JsonProperty("numero2")
    public void setNumero2(String numero2) {
        this.numero2 = numero2;
    }

    /**
     * 
     * @return
     *     The numero3
     */
    @JsonProperty("numero3")
    public String getNumero3() {
        return numero3;
    }

    /**
     * 
     * @param numero3
     *     The numero3
     */
    @JsonProperty("numero3")
    public void setNumero3(String numero3) {
        this.numero3 = numero3;
    }

    /**
     * 
     * @return
     *     The numero4
     */
    @JsonProperty("numero4")
    public String getNumero4() {
        return numero4;
    }

    /**
     * 
     * @param numero4
     *     The numero4
     */
    @JsonProperty("numero4")
    public void setNumero4(String numero4) {
        this.numero4 = numero4;
    }

    /**
     * 
     * @return
     *     The numero5
     */
    @JsonProperty("numero5")
    public String getNumero5() {
        return numero5;
    }

    /**
     * 
     * @param numero5
     *     The numero5
     */
    @JsonProperty("numero5")
    public void setNumero5(String numero5) {
        this.numero5 = numero5;
    }

    /**
     * 
     * @return
     *     The numero6
     */
    @JsonProperty("numero6")
    public String getNumero6() {
        return numero6;
    }

    /**
     * 
     * @param numero6
     *     The numero6
     */
    @JsonProperty("numero6")
    public void setNumero6(String numero6) {
        this.numero6 = numero6;
    }

    /**
     * 
     * @return
     *     The numero7
     */
    @JsonProperty("numero7")
    public String getNumero7() {
        return numero7;
    }

    /**
     * 
     * @param numero7
     *     The numero7
     */
    @JsonProperty("numero7")
    public void setNumero7(String numero7) {
        this.numero7 = numero7;
    }

    /**
     * 
     * @return
     *     The flag1
     */
    @JsonProperty("flag1")
    public String getFlag1() {
        return flag1;
    }

    /**
     * 
     * @param flag1
     *     The flag1
     */
    @JsonProperty("flag1")
    public void setFlag1(String flag1) {
        this.flag1 = flag1;
    }

    /**
     * 
     * @return
     *     The flag2
     */
    @JsonProperty("flag2")
    public String getFlag2() {
        return flag2;
    }

    /**
     * 
     * @param flag2
     *     The flag2
     */
    @JsonProperty("flag2")
    public void setFlag2(String flag2) {
        this.flag2 = flag2;
    }

    /**
     * 
     * @return
     *     The flag3
     */
    @JsonProperty("flag3")
    public String getFlag3() {
        return flag3;
    }

    /**
     * 
     * @param flag3
     *     The flag3
     */
    @JsonProperty("flag3")
    public void setFlag3(String flag3) {
        this.flag3 = flag3;
    }

    /**
     * 
     * @return
     *     The flag4
     */
    @JsonProperty("flag4")
    public String getFlag4() {
        return flag4;
    }

    /**
     * 
     * @param flag4
     *     The flag4
     */
    @JsonProperty("flag4")
    public void setFlag4(String flag4) {
        this.flag4 = flag4;
    }

    /**
     * 
     * @return
     *     The flag5
     */
    @JsonProperty("flag5")
    public String getFlag5() {
        return flag5;
    }

    /**
     * 
     * @param flag5
     *     The flag5
     */
    @JsonProperty("flag5")
    public void setFlag5(String flag5) {
        this.flag5 = flag5;
    }

    /**
     * 
     * @return
     *     The flag6
     */
    @JsonProperty("flag6")
    public String getFlag6() {
        return flag6;
    }

    /**
     * 
     * @param flag6
     *     The flag6
     */
    @JsonProperty("flag6")
    public void setFlag6(String flag6) {
        this.flag6 = flag6;
    }

    /**
     * 
     * @return
     *     The flag7
     */
    @JsonProperty("flag7")
    public String getFlag7() {
        return flag7;
    }

    /**
     * 
     * @param flag7
     *     The flag7
     */
    @JsonProperty("flag7")
    public void setFlag7(String flag7) {
        this.flag7 = flag7;
    }

    /**
     * 
     * @return
     *     The string1
     */
    @JsonProperty("string1")
    public String getString1() {
        return string1;
    }

    /**
     * 
     * @param string1
     *     The string1
     */
    @JsonProperty("string1")
    public void setString1(String string1) {
        this.string1 = string1;
    }

    /**
     * 
     * @return
     *     The string2
     */
    @JsonProperty("string2")
    public String getString2() {
        return string2;
    }

    /**
     * 
     * @param string2
     *     The string2
     */
    @JsonProperty("string2")
    public void setString2(String string2) {
        this.string2 = string2;
    }

    /**
     * 
     * @return
     *     The string3
     */
    @JsonProperty("string3")
    public String getString3() {
        return string3;
    }

    /**
     * 
     * @param string3
     *     The string3
     */
    @JsonProperty("string3")
    public void setString3(String string3) {
        this.string3 = string3;
    }

    /**
     * 
     * @return
     *     The string4
     */
    @JsonProperty("string4")
    public String getString4() {
        return string4;
    }

    /**
     * 
     * @param string4
     *     The string4
     */
    @JsonProperty("string4")
    public void setString4(String string4) {
        this.string4 = string4;
    }

    /**
     * 
     * @return
     *     The string5
     */
    @JsonProperty("string5")
    public String getString5() {
        return string5;
    }

    /**
     * 
     * @param string5
     *     The string5
     */
    @JsonProperty("string5")
    public void setString5(String string5) {
        this.string5 = string5;
    }

    /**
     * 
     * @return
     *     The string6
     */
    @JsonProperty("string6")
    public String getString6() {
        return string6;
    }

    /**
     * 
     * @param string6
     *     The string6
     */
    @JsonProperty("string6")
    public void setString6(String string6) {
        this.string6 = string6;
    }

    /**
     * 
     * @return
     *     The string7
     */
    @JsonProperty("string7")
    public String getString7() {
        return string7;
    }

    /**
     * 
     * @param string7
     *     The string7
     */
    @JsonProperty("string7")
    public void setString7(String string7) {
        this.string7 = string7;
    }

    /**
     * 
     * @return
     *     The filler04
     */
    @JsonProperty("filler_04")
    public String getFiller04() {
        return filler04;
    }

    /**
     * 
     * @param filler04
     *     The filler_04
     */
    @JsonProperty("filler_04")
    public void setFiller04(String filler04) {
        this.filler04 = filler04;
    }

}
