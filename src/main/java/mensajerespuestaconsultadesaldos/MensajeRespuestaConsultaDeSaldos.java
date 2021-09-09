
package mensajerespuestaconsultadesaldos;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "coderror",
    "msgerror",
    "timestamp",
    "canal",
    "id_emisor_servicio",
    "idwsst247",
    "organizacion",
    "num_cuenta_s",
    "logo",
    "desc_logo",
    "modelo",
    "tipo_cta",
    "relacion_cuenta",
    "cobertura_cuenta",
    "apaterno",
    "amaterno",
    "nombre_clte",
    "dir_part",
    "ciudad_part",
    "comuna_part",
    "region_part",
    "fono_part",
    "direc_envio_eecc",
    "ciudad_envio_eecc",
    "comuna_envio_eecc",
    "region_envio_eecc",
    "fono_envio_eecc",
    "cdgo_postal",
    "dir_lab",
    "ciudad_laboral",
    "comuna_lab",
    "reg_laboral",
    "fono_laboral",
    "dir_email1",
    "rut",
    "dv_rut_clte",
    "nro_cliente",
    "nro_relacion",
    "nro_int",
    "nro_ctacte",
    "campana",
    "nro_int2",
    "sucursal",
    "cta_trassaldo",
    "cantidad_adic",
    "cdgo_autcc",
    "cdgo_vip",
    "cdgo_mje_mora_pgomin",
    "codigo_mov",
    "por_pminimo",
    "estado_canales1",
    "fecha_datos",
    "fecha_apert",
    "fecha_modif",
    "fecha_actv_tjta",
    "fecha_act_ren",
    "fecha_bloq1",
    "fecha_bloq2",
    "fecha_ult_pago_pesos",
    "fecha_ult_pago_dolar",
    "fecha_ult_fact",
    "fecha_venc_pago",
    "fecha_nac_tit",
    "cdgo_bloq1",
    "cdgo_bloq2",
    "cdgo_bloq_numerico",
    "cdgo_mora",
    "cdgo_cartera_vencida",
    "cdgo_cob",
    "forma_pago",
    "ciclo_fac",
    "cdgo_fv",
    "cdgo_empresa",
    "cdgo_envio_eecc",
    "rebaja_cobadm",
    "nro_moras_periodo",
    "nro_excesos_periodo",
    "nro_bloq_por_moras",
    "cdgo_aval",
    "cdgo_promocion",
    "ind_tjta_operador",
    "ind_pin",
    "ind_cobro_comision",
    "porcje_exceso_compras_nac",
    "porcje_exceso_compras_int",
    "medio_envio_fisico_eecc",
    "tipo_dir_fisica",
    "tipo_pago",
    "por_pfijo",
    "mto_pfijo_9",
    "cdgo_embozado",
    "pct_pesos_9",
    "pct_dolar_9",
    "tres_cpc",
    "comision_exceso",
    "cupo_nacional",
    "cupo_int",
    "cupo_linea_2",
    "cupo_virtual",
    "cupo_virtual_int",
    "deuda_nac_cta",
    "deuda_int_cta",
    "deuda_l2_cta",
    "deuda_mora_nac_cta",
    "deuda_mora_int_cta",
    "deuda_nac_fact_cta",
    "deuda_int_fact_cta",
    "disp_nac_cta",
    "disp_int_cta",
    "disp_l2_cta",
    "saldo_credito_cuota_capital",
    "disp_avances_cta",
    "disp_avances_dolar_cta",
    "mora_1_30d",
    "mora_31_60d",
    "mora_61_90d",
    "mora_91_120d",
    "mora_121_150d",
    "mora_151_180d",
    "mora_181_210d",
    "mora_210_999d",
    "recargo_cob_1_30d",
    "recargo_cob_31_60d",
    "recargo_cob_61_90d",
    "recargo_cob_91_120d",
    "recargo_cob_121_150d",
    "recargo_cob_151_180d",
    "recargo_cob_181_210d",
    "recargo_cob_210_999d",
    "pago_minimo",
    "sldo_col_nac",
    "sldo_col_int",
    "tasa_interes_rotativo",
    "tasa_interes_cuotas_2_4",
    "tasa_interes_cuotas_5_24",
    "interes_x_cobrar_oper",
    "interes_x_cobrar_corr",
    "interes_x_cobrar_penales",
    "interes_dev_oper",
    "interes_dev_corr",
    "interes_dev_penales",
    "interes_perc_oper",
    "interes_perc_corr",
    "interes_perc_penales",
    "deuda_total",
    "colocacion_mes",
    "monto_compra_mes",
    "monto_avance_mes",
    "monto_ultimo_pago_peso",
    "monto_ultimo_pago_dolar",
    "monto_cobro_adm",
    "consumo_pesos",
    "consumo_dolar",
    "pagos_pesos_ciclo",
    "pagos_dolar_ciclo",
    "creditos_pesos_ciclo",
    "creditos_dolar_ciclo",
    "debitos_pesos_ciclo",
    "debitos_dolar_ciclo",
    "creditos_memo_pesos_ciclo",
    "creditos_memo_dolar_ciclo",
    "debitos_memo_pesos_ciclo",
    "debitos_memo_dolar_ciclo",
    "utili_x_cobrar_moneda_ext",
    "pagos_x_aplicar_moneda_ext",
    "utili_x_cobrar_moneda_nac",
    "tasa_int_avce_cta_corta",
    "tasa_int_avce_cta_larga",
    "monto1",
    "monto2",
    "monto3",
    "numero1",
    "numero2",
    "numero3",
    "flag1",
    "flag2",
    "flag3",
    "fecha_ult_fact_dolar",
    "fecha_venc_fact_dolar",
    "fecha_prox_fact_calend",
    "fecha_prox_venc_calend",
    "fecha_vig_eecc_desde",
    "fecha_vig_eecc_hasta",
    "marca",
    "filler_04",
    "num_tarjeta_s",
    "secuencia_tarjeta_s",
    "nomb_tjta_habiente",
    "nombre_empresa",
    "rut_tarjeta",
    "dv_tarjeta",
    "sexo",
    "estado_civil",
    "tipo_tjta",
    "estado_tjta",
    "fecha_vcto_tjta",
    "codigo_bloq_tjta",
    "fecha_bloq_tjta",
    "codigo_afinidad",
    "desc_afinidad",
    "cdgo_socio",
    "offset",
    "fecha_vcto_actual",
    "fecha_vcto_anterior",
    "flag_actv_tjta_actual",
    "flag_actv_tjta_anterior",
    "accion",
    "tjtas_requeridas",
    "fecha_activacion",
    "fecha_apertura",
    "fecha_modif_tjta",
    "member_since",
    "cupo_compras_nac_tjta",
    "cupo_compras_int_tjta",
    "cupo_avces_nac_tjta",
    "cupo_avces_int_tjta",
    "cupo_linea2_tjta",
    "deuda_compras_nac_tjta",
    "deuda_compras_int_tjta",
    "deuda_avces_nac_tjta",
    "deuda_avces_int_tjta",
    "deuda_l2_tjta",
    "disp_comp_nac_tjta",
    "disp_comp_int_tjta",
    "disp_avces_nac_tjta",
    "disp_avces_int_tjta",
    "disp_l2_tjta",
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
    "filler_05",
    "nro_relacion2",
    "status_relacion",
    "numero_cliente",
    "cantidad_sub_cuentas",
    "codigo_bloqueo_rel",
    "nombre_rel",
    "direccion_relacion",
    "comuna_relacion",
    "codigo_comuna_relacion",
    "ciudad_relacion",
    "region_relacion",
    "fono_relacion",
    "cupo_nac_relacion",
    "cupo_int_relacion",
    "ciclo_fact_relacion",
    "codigo_fv_relacion",
    "cuenta_primaria",
    "monto4",
    "monto5",
    "monto6",
    "numero4",
    "numero5",
    "numero6",
    "flag4",
    "flag5",
    "flag6",
    "string4",
    "string5",
    "string6",
    "filler_06",
    "nro_cuenta_aut",
    "status_cta_aut",
    "status2_cta_aut",
    "cupo_comp_nac_cta_aut",
    "cupo_comp_int_cta_aut",
    "cupo_avce_nac_cta_aut",
    "cupo_avce_int_cta_aut",
    "cupo_l2_cta_aut",
    "deuda_comp_nac_cta_aut",
    "deuda_comp_int_cta_aut",
    "deuda_avce_nac_cta_aut",
    "deuda_avce_int_cta_aut",
    "deuda_l2_cta_aut",
    "disp_comp_nac_cta_aut",
    "disp_comp_int_cta_aut",
    "disp_avce_nac_cta_aut",
    "disp_avce_int_cta_aut",
    "disp_l2_cta_aut",
    "disp_flot_cuotas_l2_cta_aut",
    "disp_flot_avce_l2_cta_aut",
    "disp_flot_avce_cuota_l1_l2_cta",
    "aut_pend_pesos_l1_cta_aut",
    "aut_pend_dolar_l1_cta_aut",
    "aut_pend_l2_cta_aut",
    "deuda_tot_peso_cta_aut",
    "deuda_tot_dolar_cta_aut",
    "pago_min_cta_aut",
    "tasa_1_cta_aut",
    "tasa_2_cta_aut",
    "flag_cuota_fija_cta_aut",
    "flag_avce_cuota_cta_aut",
    "flag_ncuota_cta_aut",
    "flag_3cpc_cta_aut",
    "flag_comp_normal_cta_aut",
    "flag_avce_efectivo_cta_aut",
    "monto7",
    "monto8",
    "monto9",
    "numero7",
    "numero8",
    "numero9",
    "flag7",
    "flag8",
    "flag9",
    "string7",
    "string8",
    "string9",
    "filler_07",
    "nro_tarjeta_aut",
    "nro_secuencia_aut",
    "status_tjta_aut",
    "status2_tjta_aut",
    "cupo_comp_nac_tjta_aut",
    "cupo_comp_int_tjta_aut",
    "cupo_avce_nac_tjta_aut",
    "cupo_avce_int_tjta_aut",
    "cupo_l2_tjta_aut",
    "deuda_comp_nac_tjta_aut",
    "deuda_comp_int_tjta_aut",
    "deuda_avce_nac_tjta_aut",
    "deuda_avce_int_tjta_aut",
    "deuda_l2_tjta_aut",
    "disp_comp_nacional_tjta_aut",
    "disp_comp_internacional_tjta_aut",
    "disp_avce_nacional_tjta_aut",
    "disp_avce_internacional_tjta_aut",
    "disp_l2_tjta_aut",
    "disp_flot_cuotas_l2_tjta_aut",
    "disp_flot_avce_l2_tjta_aut",
    "disp_flot_avce_cuota_l1_l2_tjta",
    "aut_pend_l1_tjta_aut",
    "aut_pend_l2_tjta_aut",
    "fecha_vcto_tjta_aut",
    "nombre_banda_tjta_aut",
    "offset_tjta_aut",
    "cvv2_tjta_aut",
    "flag_cuota_fija_tjta_aut",
    "flag_avce_cuotas_tjta_aut",
    "flag_ncuotas_tjta_aut",
    "flag_3cpc_tjta_aut",
    "flag_compra_normal_tjta_aut",
    "flag_avce_efecvo_tjta_aut",
    "monto12",
    "monto22",
    "monto32",
    "numero12",
    "numero22",
    "numero32",
    "flag12",
    "flag22",
    "flag32",
    "string12",
    "string22",
    "string32",
    "filler_08",
    "cdgo_banco",
    "desc_banco",
    "tipo_pac",
    "nro_ctacte_pac",
    "fecha_pac",
    "fecha_activ_pac",
    "fecha_modif_pac",
    "fecha_renuncia_pac",
    "monto13",
    "monto23",
    "numero13",
    "numero23",
    "flag13",
    "flag23",
    "string13",
    "string23",
    "dias_mora",
    "fecha_inicio_mora",
    "monto_mora1",
    "monto_mora2",
    "monto_mora3",
    "monto_mora4",
    "monto_mora5",
    "monto_mora6",
    "monto_mora7",
    "monto_mora8",
    "monto14",
    "monto24",
    "numero14",
    "numero24",
    "flag14",
    "flag24",
    "string14",
    "string24",
    "cuenta_castigo",
    "monto_castigo",
    "filler_09"
})
public class MensajeRespuestaConsultaDeSaldos {

    @JsonProperty("coderror")
    private String coderror;
    @JsonProperty("msgerror")
    private String msgerror;
    @JsonProperty("timestamp")
    private String timestamp;
    @JsonProperty("canal")
    private String canal;
    @JsonProperty("id_emisor_servicio")
    private String idEmisorServicio;
    @JsonProperty("idwsst247")
    private String idwsst247;
    @JsonProperty("organizacion")
    private String organizacion;
    @JsonProperty("num_cuenta_s")
    private String numCuentaS;
    @JsonProperty("logo")
    private String logo;
    @JsonProperty("desc_logo")
    private String descLogo;
    @JsonProperty("modelo")
    private String modelo;
    @JsonProperty("tipo_cta")
    private String tipoCta;
    @JsonProperty("relacion_cuenta")
    private String relacionCuenta;
    @JsonProperty("cobertura_cuenta")
    private String coberturaCuenta;
    @JsonProperty("apaterno")
    private String apaterno;
    @JsonProperty("amaterno")
    private String amaterno;
    @JsonProperty("nombre_clte")
    private String nombreClte;
    @JsonProperty("dir_part")
    private String dirPart;
    @JsonProperty("ciudad_part")
    private String ciudadPart;
    @JsonProperty("comuna_part")
    private String comunaPart;
    @JsonProperty("region_part")
    private String regionPart;
    @JsonProperty("fono_part")
    private String fonoPart;
    @JsonProperty("direc_envio_eecc")
    private String direcEnvioEecc;
    @JsonProperty("ciudad_envio_eecc")
    private String ciudadEnvioEecc;
    @JsonProperty("comuna_envio_eecc")
    private String comunaEnvioEecc;
    @JsonProperty("region_envio_eecc")
    private String regionEnvioEecc;
    @JsonProperty("fono_envio_eecc")
    private String fonoEnvioEecc;
    @JsonProperty("cdgo_postal")
    private String cdgoPostal;
    @JsonProperty("dir_lab")
    private String dirLab;
    @JsonProperty("ciudad_laboral")
    private String ciudadLaboral;
    @JsonProperty("comuna_lab")
    private String comunaLab;
    @JsonProperty("reg_laboral")
    private String regLaboral;
    @JsonProperty("fono_laboral")
    private String fonoLaboral;
    @JsonProperty("dir_email1")
    private String dirEmail1;
    @JsonProperty("rut")
    private String rut;
    @JsonProperty("dv_rut_clte")
    private String dvRutClte;
    @JsonProperty("nro_cliente")
    private String nroCliente;
    @JsonProperty("nro_relacion")
    private String nroRelacion;
    @JsonProperty("nro_int")
    private String nroInt;
    @JsonProperty("nro_ctacte")
    private String nroCtacte;
    @JsonProperty("campana")
    private String campana;
    @JsonProperty("nro_int2")
    private String nroInt2;
    @JsonProperty("sucursal")
    private String sucursal;
    @JsonProperty("cta_trassaldo")
    private String ctaTrassaldo;
    @JsonProperty("cantidad_adic")
    private String cantidadAdic;
    @JsonProperty("cdgo_autcc")
    private String cdgoAutcc;
    @JsonProperty("cdgo_vip")
    private String cdgoVip;
    @JsonProperty("cdgo_mje_mora_pgomin")
    private String cdgoMjeMoraPgomin;
    @JsonProperty("codigo_mov")
    private String codigoMov;
    @JsonProperty("por_pminimo")
    private String porPminimo;
    @JsonProperty("estado_canales1")
    private String estadoCanales1;
    @JsonProperty("fecha_datos")
    private String fechaDatos;
    @JsonProperty("fecha_apert")
    private String fechaApert;
    @JsonProperty("fecha_modif")
    private String fechaModif;
    @JsonProperty("fecha_actv_tjta")
    private String fechaActvTjta;
    @JsonProperty("fecha_act_ren")
    private String fechaActRen;
    @JsonProperty("fecha_bloq1")
    private String fechaBloq1;
    @JsonProperty("fecha_bloq2")
    private String fechaBloq2;
    @JsonProperty("fecha_ult_pago_pesos")
    private String fechaUltPagoPesos;
    @JsonProperty("fecha_ult_pago_dolar")
    private String fechaUltPagoDolar;
    @JsonProperty("fecha_ult_fact")
    private String fechaUltFact;
    @JsonProperty("fecha_venc_pago")
    private String fechaVencPago;
    @JsonProperty("fecha_nac_tit")
    private String fechaNacTit;
    @JsonProperty("cdgo_bloq1")
    private String cdgoBloq1;
    @JsonProperty("cdgo_bloq2")
    private String cdgoBloq2;
    @JsonProperty("cdgo_bloq_numerico")
    private String cdgoBloqNumerico;
    @JsonProperty("cdgo_mora")
    private String cdgoMora;
    @JsonProperty("cdgo_cartera_vencida")
    private String cdgoCarteraVencida;
    @JsonProperty("cdgo_cob")
    private String cdgoCob;
    @JsonProperty("forma_pago")
    private String formaPago;
    @JsonProperty("ciclo_fac")
    private String cicloFac;
    @JsonProperty("cdgo_fv")
    private String cdgoFv;
    @JsonProperty("cdgo_empresa")
    private String cdgoEmpresa;
    @JsonProperty("cdgo_envio_eecc")
    private String cdgoEnvioEecc;
    @JsonProperty("rebaja_cobadm")
    private String rebajaCobadm;
    @JsonProperty("nro_moras_periodo")
    private String nroMorasPeriodo;
    @JsonProperty("nro_excesos_periodo")
    private String nroExcesosPeriodo;
    @JsonProperty("nro_bloq_por_moras")
    private String nroBloqPorMoras;
    @JsonProperty("cdgo_aval")
    private String cdgoAval;
    @JsonProperty("cdgo_promocion")
    private String cdgoPromocion;
    @JsonProperty("ind_tjta_operador")
    private String indTjtaOperador;
    @JsonProperty("ind_pin")
    private String indPin;
    @JsonProperty("ind_cobro_comision")
    private String indCobroComision;
    @JsonProperty("porcje_exceso_compras_nac")
    private String porcjeExcesoComprasNac;
    @JsonProperty("porcje_exceso_compras_int")
    private String porcjeExcesoComprasInt;
    @JsonProperty("medio_envio_fisico_eecc")
    private String medioEnvioFisicoEecc;
    @JsonProperty("tipo_dir_fisica")
    private String tipoDirFisica;
    @JsonProperty("tipo_pago")
    private String tipoPago;
    @JsonProperty("por_pfijo")
    private String porPfijo;
    @JsonProperty("mto_pfijo_9")
    private String mtoPfijo9;
    @JsonProperty("cdgo_embozado")
    private String cdgoEmbozado;
    @JsonProperty("pct_pesos_9")
    private String pctPesos9;
    @JsonProperty("pct_dolar_9")
    private String pctDolar9;
    @JsonProperty("tres_cpc")
    private String tresCpc;
    @JsonProperty("comision_exceso")
    private String comisionExceso;
    @JsonProperty("cupo_nacional")
    private String cupoNacional;
    @JsonProperty("cupo_int")
    private String cupoInt;
    @JsonProperty("cupo_linea_2")
    private String cupoLinea2;
    @JsonProperty("cupo_virtual")
    private String cupoVirtual;
    @JsonProperty("cupo_virtual_int")
    private String cupoVirtualInt;
    @JsonProperty("deuda_nac_cta")
    private String deudaNacCta;
    @JsonProperty("deuda_int_cta")
    private String deudaIntCta;
    @JsonProperty("deuda_l2_cta")
    private String deudaL2Cta;
    @JsonProperty("deuda_mora_nac_cta")
    private String deudaMoraNacCta;
    @JsonProperty("deuda_mora_int_cta")
    private String deudaMoraIntCta;
    @JsonProperty("deuda_nac_fact_cta")
    private String deudaNacFactCta;
    @JsonProperty("deuda_int_fact_cta")
    private String deudaIntFactCta;
    @JsonProperty("disp_nac_cta")
    private String dispNacCta;
    @JsonProperty("disp_int_cta")
    private String dispIntCta;
    @JsonProperty("disp_l2_cta")
    private String dispL2Cta;
    @JsonProperty("saldo_credito_cuota_capital")
    private String saldoCreditoCuotaCapital;
    @JsonProperty("disp_avances_cta")
    private String dispAvancesCta;
    @JsonProperty("disp_avances_dolar_cta")
    private String dispAvancesDolarCta;
    @JsonProperty("mora_1_30d")
    private String mora130d;
    @JsonProperty("mora_31_60d")
    private String mora3160d;
    @JsonProperty("mora_61_90d")
    private String mora6190d;
    @JsonProperty("mora_91_120d")
    private String mora91120d;
    @JsonProperty("mora_121_150d")
    private String mora121150d;
    @JsonProperty("mora_151_180d")
    private String mora151180d;
    @JsonProperty("mora_181_210d")
    private String mora181210d;
    @JsonProperty("mora_210_999d")
    private String mora210999d;
    @JsonProperty("recargo_cob_1_30d")
    private String recargoCob130d;
    @JsonProperty("recargo_cob_31_60d")
    private String recargoCob3160d;
    @JsonProperty("recargo_cob_61_90d")
    private String recargoCob6190d;
    @JsonProperty("recargo_cob_91_120d")
    private String recargoCob91120d;
    @JsonProperty("recargo_cob_121_150d")
    private String recargoCob121150d;
    @JsonProperty("recargo_cob_151_180d")
    private String recargoCob151180d;
    @JsonProperty("recargo_cob_181_210d")
    private String recargoCob181210d;
    @JsonProperty("recargo_cob_210_999d")
    private String recargoCob210999d;
    @JsonProperty("pago_minimo")
    private String pagoMinimo;
    @JsonProperty("sldo_col_nac")
    private String sldoColNac;
    @JsonProperty("sldo_col_int")
    private String sldoColInt;
    @JsonProperty("tasa_interes_rotativo")
    private String tasaInteresRotativo;
    @JsonProperty("tasa_interes_cuotas_2_4")
    private String tasaInteresCuotas24;
    @JsonProperty("tasa_interes_cuotas_5_24")
    private String tasaInteresCuotas524;
    @JsonProperty("interes_x_cobrar_oper")
    private String interesXCobrarOper;
    @JsonProperty("interes_x_cobrar_corr")
    private String interesXCobrarCorr;
    @JsonProperty("interes_x_cobrar_penales")
    private String interesXCobrarPenales;
    @JsonProperty("interes_dev_oper")
    private String interesDevOper;
    @JsonProperty("interes_dev_corr")
    private String interesDevCorr;
    @JsonProperty("interes_dev_penales")
    private String interesDevPenales;
    @JsonProperty("interes_perc_oper")
    private String interesPercOper;
    @JsonProperty("interes_perc_corr")
    private String interesPercCorr;
    @JsonProperty("interes_perc_penales")
    private String interesPercPenales;
    @JsonProperty("deuda_total")
    private String deudaTotal;
    @JsonProperty("colocacion_mes")
    private String colocacionMes;
    @JsonProperty("monto_compra_mes")
    private String montoCompraMes;
    @JsonProperty("monto_avance_mes")
    private String montoAvanceMes;
    @JsonProperty("monto_ultimo_pago_peso")
    private String montoUltimoPagoPeso;
    @JsonProperty("monto_ultimo_pago_dolar")
    private String montoUltimoPagoDolar;
    @JsonProperty("monto_cobro_adm")
    private String montoCobroAdm;
    @JsonProperty("consumo_pesos")
    private String consumoPesos;
    @JsonProperty("consumo_dolar")
    private String consumoDolar;
    @JsonProperty("pagos_pesos_ciclo")
    private String pagosPesosCiclo;
    @JsonProperty("pagos_dolar_ciclo")
    private String pagosDolarCiclo;
    @JsonProperty("creditos_pesos_ciclo")
    private String creditosPesosCiclo;
    @JsonProperty("creditos_dolar_ciclo")
    private String creditosDolarCiclo;
    @JsonProperty("debitos_pesos_ciclo")
    private String debitosPesosCiclo;
    @JsonProperty("debitos_dolar_ciclo")
    private String debitosDolarCiclo;
    @JsonProperty("creditos_memo_pesos_ciclo")
    private String creditosMemoPesosCiclo;
    @JsonProperty("creditos_memo_dolar_ciclo")
    private String creditosMemoDolarCiclo;
    @JsonProperty("debitos_memo_pesos_ciclo")
    private String debitosMemoPesosCiclo;
    @JsonProperty("debitos_memo_dolar_ciclo")
    private String debitosMemoDolarCiclo;
    @JsonProperty("utili_x_cobrar_moneda_ext")
    private String utiliXCobrarMonedaExt;
    @JsonProperty("pagos_x_aplicar_moneda_ext")
    private String pagosXAplicarMonedaExt;
    @JsonProperty("utili_x_cobrar_moneda_nac")
    private String utiliXCobrarMonedaNac;
    @JsonProperty("tasa_int_avce_cta_corta")
    private String tasaIntAvceCtaCorta;
    @JsonProperty("tasa_int_avce_cta_larga")
    private String tasaIntAvceCtaLarga;
    @JsonProperty("monto1")
    private String monto1;
    @JsonProperty("monto2")
    private String monto2;
    @JsonProperty("monto3")
    private String monto3;
    @JsonProperty("numero1")
    private String numero1;
    @JsonProperty("numero2")
    private String numero2;
    @JsonProperty("numero3")
    private String numero3;
    @JsonProperty("flag1")
    private String flag1;
    @JsonProperty("flag2")
    private String flag2;
    @JsonProperty("flag3")
    private String flag3;
    @JsonProperty("fecha_ult_fact_dolar")
    private String fechaUltFactDolar;
    @JsonProperty("fecha_venc_fact_dolar")
    private String fechaVencFactDolar;
    @JsonProperty("fecha_prox_fact_calend")
    private String fechaProxFactCalend;
    @JsonProperty("fecha_prox_venc_calend")
    private String fechaProxVencCalend;
    @JsonProperty("fecha_vig_eecc_desde")
    private String fechaVigEeccDesde;
    @JsonProperty("fecha_vig_eecc_hasta")
    private String fechaVigEeccHasta;
    @JsonProperty("marca")
    private String marca;
    @JsonProperty("filler_04")
    private String filler04;
    @JsonProperty("num_tarjeta_s")
    private String numTarjetaS;
    @JsonProperty("secuencia_tarjeta_s")
    private String secuenciaTarjetaS;
    @JsonProperty("nomb_tjta_habiente")
    private String nombTjtaHabiente;
    @JsonProperty("nombre_empresa")
    private String nombreEmpresa;
    @JsonProperty("rut_tarjeta")
    private String rutTarjeta;
    @JsonProperty("dv_tarjeta")
    private String dvTarjeta;
    @JsonProperty("sexo")
    private String sexo;
    @JsonProperty("estado_civil")
    private String estadoCivil;
    @JsonProperty("tipo_tjta")
    private String tipoTjta;
    @JsonProperty("estado_tjta")
    private String estadoTjta;
    @JsonProperty("fecha_vcto_tjta")
    private String fechaVctoTjta;
    @JsonProperty("codigo_bloq_tjta")
    private String codigoBloqTjta;
    @JsonProperty("fecha_bloq_tjta")
    private String fechaBloqTjta;
    @JsonProperty("codigo_afinidad")
    private String codigoAfinidad;
    @JsonProperty("desc_afinidad")
    private String descAfinidad;
    @JsonProperty("cdgo_socio")
    private String cdgoSocio;
    @JsonProperty("offset")
    private String offset;
    @JsonProperty("fecha_vcto_actual")
    private String fechaVctoActual;
    @JsonProperty("fecha_vcto_anterior")
    private String fechaVctoAnterior;
    @JsonProperty("flag_actv_tjta_actual")
    private String flagActvTjtaActual;
    @JsonProperty("flag_actv_tjta_anterior")
    private String flagActvTjtaAnterior;
    @JsonProperty("accion")
    private String accion;
    @JsonProperty("tjtas_requeridas")
    private String tjtasRequeridas;
    @JsonProperty("fecha_activacion")
    private String fechaActivacion;
    @JsonProperty("fecha_apertura")
    private String fechaApertura;
    @JsonProperty("fecha_modif_tjta")
    private String fechaModifTjta;
    @JsonProperty("member_since")
    private String memberSince;
    @JsonProperty("cupo_compras_nac_tjta")
    private String cupoComprasNacTjta;
    @JsonProperty("cupo_compras_int_tjta")
    private String cupoComprasIntTjta;
    @JsonProperty("cupo_avces_nac_tjta")
    private String cupoAvcesNacTjta;
    @JsonProperty("cupo_avces_int_tjta")
    private String cupoAvcesIntTjta;
    @JsonProperty("cupo_linea2_tjta")
    private String cupoLinea2Tjta;
    @JsonProperty("deuda_compras_nac_tjta")
    private String deudaComprasNacTjta;
    @JsonProperty("deuda_compras_int_tjta")
    private String deudaComprasIntTjta;
    @JsonProperty("deuda_avces_nac_tjta")
    private String deudaAvcesNacTjta;
    @JsonProperty("deuda_avces_int_tjta")
    private String deudaAvcesIntTjta;
    @JsonProperty("deuda_l2_tjta")
    private String deudaL2Tjta;
    @JsonProperty("disp_comp_nac_tjta")
    private String dispCompNacTjta;
    @JsonProperty("disp_comp_int_tjta")
    private String dispCompIntTjta;
    @JsonProperty("disp_avces_nac_tjta")
    private String dispAvcesNacTjta;
    @JsonProperty("disp_avces_int_tjta")
    private String dispAvcesIntTjta;
    @JsonProperty("disp_l2_tjta")
    private String dispL2Tjta;
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
    @JsonProperty("filler_05")
    private String filler05;
    @JsonProperty("nro_relacion2")
    private String nroRelacion2;
    @JsonProperty("status_relacion")
    private String statusRelacion;
    @JsonProperty("numero_cliente")
    private String numeroCliente;
    @JsonProperty("cantidad_sub_cuentas")
    private String cantidadSubCuentas;
    @JsonProperty("codigo_bloqueo_rel")
    private String codigoBloqueoRel;
    @JsonProperty("nombre_rel")
    private String nombreRel;
    @JsonProperty("direccion_relacion")
    private String direccionRelacion;
    @JsonProperty("comuna_relacion")
    private String comunaRelacion;
    @JsonProperty("codigo_comuna_relacion")
    private String codigoComunaRelacion;
    @JsonProperty("ciudad_relacion")
    private String ciudadRelacion;
    @JsonProperty("region_relacion")
    private String regionRelacion;
    @JsonProperty("fono_relacion")
    private String fonoRelacion;
    @JsonProperty("cupo_nac_relacion")
    private String cupoNacRelacion;
    @JsonProperty("cupo_int_relacion")
    private String cupoIntRelacion;
    @JsonProperty("ciclo_fact_relacion")
    private String cicloFactRelacion;
    @JsonProperty("codigo_fv_relacion")
    private String codigoFvRelacion;
    @JsonProperty("cuenta_primaria")
    private String cuentaPrimaria;
    @JsonProperty("monto4")
    private String monto4;
    @JsonProperty("monto5")
    private String monto5;
    @JsonProperty("monto6")
    private String monto6;
    @JsonProperty("numero4")
    private String numero4;
    @JsonProperty("numero5")
    private String numero5;
    @JsonProperty("numero6")
    private String numero6;
    @JsonProperty("flag4")
    private String flag4;
    @JsonProperty("flag5")
    private String flag5;
    @JsonProperty("flag6")
    private String flag6;
    @JsonProperty("string4")
    private String string4;
    @JsonProperty("string5")
    private String string5;
    @JsonProperty("string6")
    private String string6;
    @JsonProperty("filler_06")
    private String filler06;
    @JsonProperty("nro_cuenta_aut")
    private String nroCuentaAut;
    @JsonProperty("status_cta_aut")
    private String statusCtaAut;
    @JsonProperty("status2_cta_aut")
    private String status2CtaAut;
    @JsonProperty("cupo_comp_nac_cta_aut")
    private String cupoCompNacCtaAut;
    @JsonProperty("cupo_comp_int_cta_aut")
    private String cupoCompIntCtaAut;
    @JsonProperty("cupo_avce_nac_cta_aut")
    private String cupoAvceNacCtaAut;
    @JsonProperty("cupo_avce_int_cta_aut")
    private String cupoAvceIntCtaAut;
    @JsonProperty("cupo_l2_cta_aut")
    private String cupoL2CtaAut;
    @JsonProperty("deuda_comp_nac_cta_aut")
    private String deudaCompNacCtaAut;
    @JsonProperty("deuda_comp_int_cta_aut")
    private String deudaCompIntCtaAut;
    @JsonProperty("deuda_avce_nac_cta_aut")
    private String deudaAvceNacCtaAut;
    @JsonProperty("deuda_avce_int_cta_aut")
    private String deudaAvceIntCtaAut;
    @JsonProperty("deuda_l2_cta_aut")
    private String deudaL2CtaAut;
    @JsonProperty("disp_comp_nac_cta_aut")
    private String dispCompNacCtaAut;
    @JsonProperty("disp_comp_int_cta_aut")
    private String dispCompIntCtaAut;
    @JsonProperty("disp_avce_nac_cta_aut")
    private String dispAvceNacCtaAut;
    @JsonProperty("disp_avce_int_cta_aut")
    private String dispAvceIntCtaAut;
    @JsonProperty("disp_l2_cta_aut")
    private String dispL2CtaAut;
    @JsonProperty("disp_flot_cuotas_l2_cta_aut")
    private String dispFlotCuotasL2CtaAut;
    @JsonProperty("disp_flot_avce_l2_cta_aut")
    private String dispFlotAvceL2CtaAut;
    @JsonProperty("disp_flot_avce_cuota_l1_l2_cta")
    private String dispFlotAvceCuotaL1L2Cta;
    @JsonProperty("aut_pend_pesos_l1_cta_aut")
    private String autPendPesosL1CtaAut;
    @JsonProperty("aut_pend_dolar_l1_cta_aut")
    private String autPendDolarL1CtaAut;
    @JsonProperty("aut_pend_l2_cta_aut")
    private String autPendL2CtaAut;
    @JsonProperty("deuda_tot_peso_cta_aut")
    private String deudaTotPesoCtaAut;
    @JsonProperty("deuda_tot_dolar_cta_aut")
    private String deudaTotDolarCtaAut;
    @JsonProperty("pago_min_cta_aut")
    private String pagoMinCtaAut;
    @JsonProperty("tasa_1_cta_aut")
    private String tasa1CtaAut;
    @JsonProperty("tasa_2_cta_aut")
    private String tasa2CtaAut;
    @JsonProperty("flag_cuota_fija_cta_aut")
    private String flagCuotaFijaCtaAut;
    @JsonProperty("flag_avce_cuota_cta_aut")
    private String flagAvceCuotaCtaAut;
    @JsonProperty("flag_ncuota_cta_aut")
    private String flagNcuotaCtaAut;
    @JsonProperty("flag_3cpc_cta_aut")
    private String flag3cpcCtaAut;
    @JsonProperty("flag_comp_normal_cta_aut")
    private String flagCompNormalCtaAut;
    @JsonProperty("flag_avce_efectivo_cta_aut")
    private String flagAvceEfectivoCtaAut;
    @JsonProperty("monto7")
    private String monto7;
    @JsonProperty("monto8")
    private String monto8;
    @JsonProperty("monto9")
    private String monto9;
    @JsonProperty("numero7")
    private String numero7;
    @JsonProperty("numero8")
    private String numero8;
    @JsonProperty("numero9")
    private String numero9;
    @JsonProperty("flag7")
    private String flag7;
    @JsonProperty("flag8")
    private String flag8;
    @JsonProperty("flag9")
    private String flag9;
    @JsonProperty("string7")
    private String string7;
    @JsonProperty("string8")
    private String string8;
    @JsonProperty("string9")
    private String string9;
    @JsonProperty("filler_07")
    private String filler07;
    @JsonProperty("nro_tarjeta_aut")
    private String nroTarjetaAut;
    @JsonProperty("nro_secuencia_aut")
    private String nroSecuenciaAut;
    @JsonProperty("status_tjta_aut")
    private String statusTjtaAut;
    @JsonProperty("status2_tjta_aut")
    private String status2TjtaAut;
    @JsonProperty("cupo_comp_nac_tjta_aut")
    private String cupoCompNacTjtaAut;
    @JsonProperty("cupo_comp_int_tjta_aut")
    private String cupoCompIntTjtaAut;
    @JsonProperty("cupo_avce_nac_tjta_aut")
    private String cupoAvceNacTjtaAut;
    @JsonProperty("cupo_avce_int_tjta_aut")
    private String cupoAvceIntTjtaAut;
    @JsonProperty("cupo_l2_tjta_aut")
    private String cupoL2TjtaAut;
    @JsonProperty("deuda_comp_nac_tjta_aut")
    private String deudaCompNacTjtaAut;
    @JsonProperty("deuda_comp_int_tjta_aut")
    private String deudaCompIntTjtaAut;
    @JsonProperty("deuda_avce_nac_tjta_aut")
    private String deudaAvceNacTjtaAut;
    @JsonProperty("deuda_avce_int_tjta_aut")
    private String deudaAvceIntTjtaAut;
    @JsonProperty("deuda_l2_tjta_aut")
    private String deudaL2TjtaAut;
    @JsonProperty("disp_comp_nacional_tjta_aut")
    private String dispCompNacionalTjtaAut;
    @JsonProperty("disp_comp_internacional_tjta_aut")
    private String dispCompInternacionalTjtaAut;
    @JsonProperty("disp_avce_nacional_tjta_aut")
    private String dispAvceNacionalTjtaAut;
    @JsonProperty("disp_avce_internacional_tjta_aut")
    private String dispAvceInternacionalTjtaAut;
    @JsonProperty("disp_l2_tjta_aut")
    private String dispL2TjtaAut;
    @JsonProperty("disp_flot_cuotas_l2_tjta_aut")
    private String dispFlotCuotasL2TjtaAut;
    @JsonProperty("disp_flot_avce_l2_tjta_aut")
    private String dispFlotAvceL2TjtaAut;
    @JsonProperty("disp_flot_avce_cuota_l1_l2_tjta")
    private String dispFlotAvceCuotaL1L2Tjta;
    @JsonProperty("aut_pend_l1_tjta_aut")
    private String autPendL1TjtaAut;
    @JsonProperty("aut_pend_l2_tjta_aut")
    private String autPendL2TjtaAut;
    @JsonProperty("fecha_vcto_tjta_aut")
    private String fechaVctoTjtaAut;
    @JsonProperty("nombre_banda_tjta_aut")
    private String nombreBandaTjtaAut;
    @JsonProperty("offset_tjta_aut")
    private String offsetTjtaAut;
    @JsonProperty("cvv2_tjta_aut")
    private String cvv2TjtaAut;
    @JsonProperty("flag_cuota_fija_tjta_aut")
    private String flagCuotaFijaTjtaAut;
    @JsonProperty("flag_avce_cuotas_tjta_aut")
    private String flagAvceCuotasTjtaAut;
    @JsonProperty("flag_ncuotas_tjta_aut")
    private String flagNcuotasTjtaAut;
    @JsonProperty("flag_3cpc_tjta_aut")
    private String flag3cpcTjtaAut;
    @JsonProperty("flag_compra_normal_tjta_aut")
    private String flagCompraNormalTjtaAut;
    @JsonProperty("flag_avce_efecvo_tjta_aut")
    private String flagAvceEfecvoTjtaAut;
    @JsonProperty("monto12")
    private String monto12;
    @JsonProperty("monto22")
    private String monto22;
    @JsonProperty("monto32")
    private String monto32;
    @JsonProperty("numero12")
    private String numero12;
    @JsonProperty("numero22")
    private String numero22;
    @JsonProperty("numero32")
    private String numero32;
    @JsonProperty("flag12")
    private String flag12;
    @JsonProperty("flag22")
    private String flag22;
    @JsonProperty("flag32")
    private String flag32;
    @JsonProperty("string12")
    private String string12;
    @JsonProperty("string22")
    private String string22;
    @JsonProperty("string32")
    private String string32;
    @JsonProperty("filler_08")
    private String filler08;
    @JsonProperty("cdgo_banco")
    private String cdgoBanco;
    @JsonProperty("desc_banco")
    private String descBanco;
    @JsonProperty("tipo_pac")
    private String tipoPac;
    @JsonProperty("nro_ctacte_pac")
    private String nroCtactePac;
    @JsonProperty("fecha_pac")
    private String fechaPac;
    @JsonProperty("fecha_activ_pac")
    private String fechaActivPac;
    @JsonProperty("fecha_modif_pac")
    private String fechaModifPac;
    @JsonProperty("fecha_renuncia_pac")
    private String fechaRenunciaPac;
    @JsonProperty("monto13")
    private String monto13;
    @JsonProperty("monto23")
    private String monto23;
    @JsonProperty("numero13")
    private String numero13;
    @JsonProperty("numero23")
    private String numero23;
    @JsonProperty("flag13")
    private String flag13;
    @JsonProperty("flag23")
    private String flag23;
    @JsonProperty("string13")
    private String string13;
    @JsonProperty("string23")
    private String string23;
    @JsonProperty("dias_mora")
    private String diasMora;
    @JsonProperty("fecha_inicio_mora")
    private String fechaInicioMora;
    @JsonProperty("monto_mora1")
    private String montoMora1;
    @JsonProperty("monto_mora2")
    private String montoMora2;
    @JsonProperty("monto_mora3")
    private String montoMora3;
    @JsonProperty("monto_mora4")
    private String montoMora4;
    @JsonProperty("monto_mora5")
    private String montoMora5;
    @JsonProperty("monto_mora6")
    private String montoMora6;
    @JsonProperty("monto_mora7")
    private String montoMora7;
    @JsonProperty("monto_mora8")
    private String montoMora8;
    @JsonProperty("monto14")
    private String monto14;
    @JsonProperty("monto24")
    private String monto24;
    @JsonProperty("numero14")
    private String numero14;
    @JsonProperty("numero24")
    private String numero24;
    @JsonProperty("flag14")
    private String flag14;
    @JsonProperty("flag24")
    private String flag24;
    @JsonProperty("string14")
    private String string14;
    @JsonProperty("string24")
    private String string24;
    @JsonProperty("cuenta_castigo")
    private String cuentaCastigo;
    @JsonProperty("monto_castigo")
    private String montoCastigo;
    @JsonProperty("filler_09")
    private String filler09;

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
     *     The timestamp
     */
    @JsonProperty("timestamp")
    public String getTimestamp() {
        return timestamp;
    }

    /**
     * 
     * @param timestamp
     *     The timestamp
     */
    @JsonProperty("timestamp")
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * 
     * @return
     *     The canal
     */
    @JsonProperty("canal")
    public String getCanal() {
        return canal;
    }

    /**
     * 
     * @param canal
     *     The canal
     */
    @JsonProperty("canal")
    public void setCanal(String canal) {
        this.canal = canal;
    }

    /**
     * 
     * @return
     *     The idEmisorServicio
     */
    @JsonProperty("id_emisor_servicio")
    public String getIdEmisorServicio() {
        return idEmisorServicio;
    }

    /**
     * 
     * @param idEmisorServicio
     *     The id_emisor_servicio
     */
    @JsonProperty("id_emisor_servicio")
    public void setIdEmisorServicio(String idEmisorServicio) {
        this.idEmisorServicio = idEmisorServicio;
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
     *     The organizacion
     */
    @JsonProperty("organizacion")
    public String getOrganizacion() {
        return organizacion;
    }

    /**
     * 
     * @param organizacion
     *     The organizacion
     */
    @JsonProperty("organizacion")
    public void setOrganizacion(String organizacion) {
        this.organizacion = organizacion;
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
     *     The logo
     */
    @JsonProperty("logo")
    public String getLogo() {
        return logo;
    }

    /**
     * 
     * @param logo
     *     The logo
     */
    @JsonProperty("logo")
    public void setLogo(String logo) {
        this.logo = logo;
    }

    /**
     * 
     * @return
     *     The descLogo
     */
    @JsonProperty("desc_logo")
    public String getDescLogo() {
        return descLogo;
    }

    /**
     * 
     * @param descLogo
     *     The desc_logo
     */
    @JsonProperty("desc_logo")
    public void setDescLogo(String descLogo) {
        this.descLogo = descLogo;
    }

    /**
     * 
     * @return
     *     The modelo
     */
    @JsonProperty("modelo")
    public String getModelo() {
        return modelo;
    }

    /**
     * 
     * @param modelo
     *     The modelo
     */
    @JsonProperty("modelo")
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * 
     * @return
     *     The tipoCta
     */
    @JsonProperty("tipo_cta")
    public String getTipoCta() {
        return tipoCta;
    }

    /**
     * 
     * @param tipoCta
     *     The tipo_cta
     */
    @JsonProperty("tipo_cta")
    public void setTipoCta(String tipoCta) {
        this.tipoCta = tipoCta;
    }

    /**
     * 
     * @return
     *     The relacionCuenta
     */
    @JsonProperty("relacion_cuenta")
    public String getRelacionCuenta() {
        return relacionCuenta;
    }

    /**
     * 
     * @param relacionCuenta
     *     The relacion_cuenta
     */
    @JsonProperty("relacion_cuenta")
    public void setRelacionCuenta(String relacionCuenta) {
        this.relacionCuenta = relacionCuenta;
    }

    /**
     * 
     * @return
     *     The coberturaCuenta
     */
    @JsonProperty("cobertura_cuenta")
    public String getCoberturaCuenta() {
        return coberturaCuenta;
    }

    /**
     * 
     * @param coberturaCuenta
     *     The cobertura_cuenta
     */
    @JsonProperty("cobertura_cuenta")
    public void setCoberturaCuenta(String coberturaCuenta) {
        this.coberturaCuenta = coberturaCuenta;
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
     *     The dirPart
     */
    @JsonProperty("dir_part")
    public String getDirPart() {
        return dirPart;
    }

    /**
     * 
     * @param dirPart
     *     The dir_part
     */
    @JsonProperty("dir_part")
    public void setDirPart(String dirPart) {
        this.dirPart = dirPart;
    }

    /**
     * 
     * @return
     *     The ciudadPart
     */
    @JsonProperty("ciudad_part")
    public String getCiudadPart() {
        return ciudadPart;
    }

    /**
     * 
     * @param ciudadPart
     *     The ciudad_part
     */
    @JsonProperty("ciudad_part")
    public void setCiudadPart(String ciudadPart) {
        this.ciudadPart = ciudadPart;
    }

    /**
     * 
     * @return
     *     The comunaPart
     */
    @JsonProperty("comuna_part")
    public String getComunaPart() {
        return comunaPart;
    }

    /**
     * 
     * @param comunaPart
     *     The comuna_part
     */
    @JsonProperty("comuna_part")
    public void setComunaPart(String comunaPart) {
        this.comunaPart = comunaPart;
    }

    /**
     * 
     * @return
     *     The regionPart
     */
    @JsonProperty("region_part")
    public String getRegionPart() {
        return regionPart;
    }

    /**
     * 
     * @param regionPart
     *     The region_part
     */
    @JsonProperty("region_part")
    public void setRegionPart(String regionPart) {
        this.regionPart = regionPart;
    }

    /**
     * 
     * @return
     *     The fonoPart
     */
    @JsonProperty("fono_part")
    public String getFonoPart() {
        return fonoPart;
    }

    /**
     * 
     * @param fonoPart
     *     The fono_part
     */
    @JsonProperty("fono_part")
    public void setFonoPart(String fonoPart) {
        this.fonoPart = fonoPart;
    }

    /**
     * 
     * @return
     *     The direcEnvioEecc
     */
    @JsonProperty("direc_envio_eecc")
    public String getDirecEnvioEecc() {
        return direcEnvioEecc;
    }

    /**
     * 
     * @param direcEnvioEecc
     *     The direc_envio_eecc
     */
    @JsonProperty("direc_envio_eecc")
    public void setDirecEnvioEecc(String direcEnvioEecc) {
        this.direcEnvioEecc = direcEnvioEecc;
    }

    /**
     * 
     * @return
     *     The ciudadEnvioEecc
     */
    @JsonProperty("ciudad_envio_eecc")
    public String getCiudadEnvioEecc() {
        return ciudadEnvioEecc;
    }

    /**
     * 
     * @param ciudadEnvioEecc
     *     The ciudad_envio_eecc
     */
    @JsonProperty("ciudad_envio_eecc")
    public void setCiudadEnvioEecc(String ciudadEnvioEecc) {
        this.ciudadEnvioEecc = ciudadEnvioEecc;
    }

    /**
     * 
     * @return
     *     The comunaEnvioEecc
     */
    @JsonProperty("comuna_envio_eecc")
    public String getComunaEnvioEecc() {
        return comunaEnvioEecc;
    }

    /**
     * 
     * @param comunaEnvioEecc
     *     The comuna_envio_eecc
     */
    @JsonProperty("comuna_envio_eecc")
    public void setComunaEnvioEecc(String comunaEnvioEecc) {
        this.comunaEnvioEecc = comunaEnvioEecc;
    }

    /**
     * 
     * @return
     *     The regionEnvioEecc
     */
    @JsonProperty("region_envio_eecc")
    public String getRegionEnvioEecc() {
        return regionEnvioEecc;
    }

    /**
     * 
     * @param regionEnvioEecc
     *     The region_envio_eecc
     */
    @JsonProperty("region_envio_eecc")
    public void setRegionEnvioEecc(String regionEnvioEecc) {
        this.regionEnvioEecc = regionEnvioEecc;
    }

    /**
     * 
     * @return
     *     The fonoEnvioEecc
     */
    @JsonProperty("fono_envio_eecc")
    public String getFonoEnvioEecc() {
        return fonoEnvioEecc;
    }

    /**
     * 
     * @param fonoEnvioEecc
     *     The fono_envio_eecc
     */
    @JsonProperty("fono_envio_eecc")
    public void setFonoEnvioEecc(String fonoEnvioEecc) {
        this.fonoEnvioEecc = fonoEnvioEecc;
    }

    /**
     * 
     * @return
     *     The cdgoPostal
     */
    @JsonProperty("cdgo_postal")
    public String getCdgoPostal() {
        return cdgoPostal;
    }

    /**
     * 
     * @param cdgoPostal
     *     The cdgo_postal
     */
    @JsonProperty("cdgo_postal")
    public void setCdgoPostal(String cdgoPostal) {
        this.cdgoPostal = cdgoPostal;
    }

    /**
     * 
     * @return
     *     The dirLab
     */
    @JsonProperty("dir_lab")
    public String getDirLab() {
        return dirLab;
    }

    /**
     * 
     * @param dirLab
     *     The dir_lab
     */
    @JsonProperty("dir_lab")
    public void setDirLab(String dirLab) {
        this.dirLab = dirLab;
    }

    /**
     * 
     * @return
     *     The ciudadLaboral
     */
    @JsonProperty("ciudad_laboral")
    public String getCiudadLaboral() {
        return ciudadLaboral;
    }

    /**
     * 
     * @param ciudadLaboral
     *     The ciudad_laboral
     */
    @JsonProperty("ciudad_laboral")
    public void setCiudadLaboral(String ciudadLaboral) {
        this.ciudadLaboral = ciudadLaboral;
    }

    /**
     * 
     * @return
     *     The comunaLab
     */
    @JsonProperty("comuna_lab")
    public String getComunaLab() {
        return comunaLab;
    }

    /**
     * 
     * @param comunaLab
     *     The comuna_lab
     */
    @JsonProperty("comuna_lab")
    public void setComunaLab(String comunaLab) {
        this.comunaLab = comunaLab;
    }

    /**
     * 
     * @return
     *     The regLaboral
     */
    @JsonProperty("reg_laboral")
    public String getRegLaboral() {
        return regLaboral;
    }

    /**
     * 
     * @param regLaboral
     *     The reg_laboral
     */
    @JsonProperty("reg_laboral")
    public void setRegLaboral(String regLaboral) {
        this.regLaboral = regLaboral;
    }

    /**
     * 
     * @return
     *     The fonoLaboral
     */
    @JsonProperty("fono_laboral")
    public String getFonoLaboral() {
        return fonoLaboral;
    }

    /**
     * 
     * @param fonoLaboral
     *     The fono_laboral
     */
    @JsonProperty("fono_laboral")
    public void setFonoLaboral(String fonoLaboral) {
        this.fonoLaboral = fonoLaboral;
    }

    /**
     * 
     * @return
     *     The dirEmail1
     */
    @JsonProperty("dir_email1")
    public String getDirEmail1() {
        return dirEmail1;
    }

    /**
     * 
     * @param dirEmail1
     *     The dir_email1
     */
    @JsonProperty("dir_email1")
    public void setDirEmail1(String dirEmail1) {
        this.dirEmail1 = dirEmail1;
    }

    /**
     * 
     * @return
     *     The rut
     */
    @JsonProperty("rut")
    public String getRut() {
        return rut;
    }

    /**
     * 
     * @param rut
     *     The rut
     */
    @JsonProperty("rut")
    public void setRut(String rut) {
        this.rut = rut;
    }

    /**
     * 
     * @return
     *     The dvRutClte
     */
    @JsonProperty("dv_rut_clte")
    public String getDvRutClte() {
        return dvRutClte;
    }

    /**
     * 
     * @param dvRutClte
     *     The dv_rut_clte
     */
    @JsonProperty("dv_rut_clte")
    public void setDvRutClte(String dvRutClte) {
        this.dvRutClte = dvRutClte;
    }

    /**
     * 
     * @return
     *     The nroCliente
     */
    @JsonProperty("nro_cliente")
    public String getNroCliente() {
        return nroCliente;
    }

    /**
     * 
     * @param nroCliente
     *     The nro_cliente
     */
    @JsonProperty("nro_cliente")
    public void setNroCliente(String nroCliente) {
        this.nroCliente = nroCliente;
    }

    /**
     * 
     * @return
     *     The nroRelacion
     */
    @JsonProperty("nro_relacion")
    public String getNroRelacion() {
        return nroRelacion;
    }

    /**
     * 
     * @param nroRelacion
     *     The nro_relacion
     */
    @JsonProperty("nro_relacion")
    public void setNroRelacion(String nroRelacion) {
        this.nroRelacion = nroRelacion;
    }

    /**
     * 
     * @return
     *     The nroInt
     */
    @JsonProperty("nro_int")
    public String getNroInt() {
        return nroInt;
    }

    /**
     * 
     * @param nroInt
     *     The nro_int
     */
    @JsonProperty("nro_int")
    public void setNroInt(String nroInt) {
        this.nroInt = nroInt;
    }

    /**
     * 
     * @return
     *     The nroCtacte
     */
    @JsonProperty("nro_ctacte")
    public String getNroCtacte() {
        return nroCtacte;
    }

    /**
     * 
     * @param nroCtacte
     *     The nro_ctacte
     */
    @JsonProperty("nro_ctacte")
    public void setNroCtacte(String nroCtacte) {
        this.nroCtacte = nroCtacte;
    }

    /**
     * 
     * @return
     *     The campana
     */
    @JsonProperty("campana")
    public String getCampana() {
        return campana;
    }

    /**
     * 
     * @param campana
     *     The campana
     */
    @JsonProperty("campana")
    public void setCampana(String campana) {
        this.campana = campana;
    }

    /**
     * 
     * @return
     *     The nroInt2
     */
    @JsonProperty("nro_int2")
    public String getNroInt2() {
        return nroInt2;
    }

    /**
     * 
     * @param nroInt2
     *     The nro_int2
     */
    @JsonProperty("nro_int2")
    public void setNroInt2(String nroInt2) {
        this.nroInt2 = nroInt2;
    }

    /**
     * 
     * @return
     *     The sucursal
     */
    @JsonProperty("sucursal")
    public String getSucursal() {
        return sucursal;
    }

    /**
     * 
     * @param sucursal
     *     The sucursal
     */
    @JsonProperty("sucursal")
    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    /**
     * 
     * @return
     *     The ctaTrassaldo
     */
    @JsonProperty("cta_trassaldo")
    public String getCtaTrassaldo() {
        return ctaTrassaldo;
    }

    /**
     * 
     * @param ctaTrassaldo
     *     The cta_trassaldo
     */
    @JsonProperty("cta_trassaldo")
    public void setCtaTrassaldo(String ctaTrassaldo) {
        this.ctaTrassaldo = ctaTrassaldo;
    }

    /**
     * 
     * @return
     *     The cantidadAdic
     */
    @JsonProperty("cantidad_adic")
    public String getCantidadAdic() {
        return cantidadAdic;
    }

    /**
     * 
     * @param cantidadAdic
     *     The cantidad_adic
     */
    @JsonProperty("cantidad_adic")
    public void setCantidadAdic(String cantidadAdic) {
        this.cantidadAdic = cantidadAdic;
    }

    /**
     * 
     * @return
     *     The cdgoAutcc
     */
    @JsonProperty("cdgo_autcc")
    public String getCdgoAutcc() {
        return cdgoAutcc;
    }

    /**
     * 
     * @param cdgoAutcc
     *     The cdgo_autcc
     */
    @JsonProperty("cdgo_autcc")
    public void setCdgoAutcc(String cdgoAutcc) {
        this.cdgoAutcc = cdgoAutcc;
    }

    /**
     * 
     * @return
     *     The cdgoVip
     */
    @JsonProperty("cdgo_vip")
    public String getCdgoVip() {
        return cdgoVip;
    }

    /**
     * 
     * @param cdgoVip
     *     The cdgo_vip
     */
    @JsonProperty("cdgo_vip")
    public void setCdgoVip(String cdgoVip) {
        this.cdgoVip = cdgoVip;
    }

    /**
     * 
     * @return
     *     The cdgoMjeMoraPgomin
     */
    @JsonProperty("cdgo_mje_mora_pgomin")
    public String getCdgoMjeMoraPgomin() {
        return cdgoMjeMoraPgomin;
    }

    /**
     * 
     * @param cdgoMjeMoraPgomin
     *     The cdgo_mje_mora_pgomin
     */
    @JsonProperty("cdgo_mje_mora_pgomin")
    public void setCdgoMjeMoraPgomin(String cdgoMjeMoraPgomin) {
        this.cdgoMjeMoraPgomin = cdgoMjeMoraPgomin;
    }

    /**
     * 
     * @return
     *     The codigoMov
     */
    @JsonProperty("codigo_mov")
    public String getCodigoMov() {
        return codigoMov;
    }

    /**
     * 
     * @param codigoMov
     *     The codigo_mov
     */
    @JsonProperty("codigo_mov")
    public void setCodigoMov(String codigoMov) {
        this.codigoMov = codigoMov;
    }

    /**
     * 
     * @return
     *     The porPminimo
     */
    @JsonProperty("por_pminimo")
    public String getPorPminimo() {
        return porPminimo;
    }

    /**
     * 
     * @param porPminimo
     *     The por_pminimo
     */
    @JsonProperty("por_pminimo")
    public void setPorPminimo(String porPminimo) {
        this.porPminimo = porPminimo;
    }

    /**
     * 
     * @return
     *     The estadoCanales1
     */
    @JsonProperty("estado_canales1")
    public String getEstadoCanales1() {
        return estadoCanales1;
    }

    /**
     * 
     * @param estadoCanales1
     *     The estado_canales1
     */
    @JsonProperty("estado_canales1")
    public void setEstadoCanales1(String estadoCanales1) {
        this.estadoCanales1 = estadoCanales1;
    }

    /**
     * 
     * @return
     *     The fechaDatos
     */
    @JsonProperty("fecha_datos")
    public String getFechaDatos() {
        return fechaDatos;
    }

    /**
     * 
     * @param fechaDatos
     *     The fecha_datos
     */
    @JsonProperty("fecha_datos")
    public void setFechaDatos(String fechaDatos) {
        this.fechaDatos = fechaDatos;
    }

    /**
     * 
     * @return
     *     The fechaApert
     */
    @JsonProperty("fecha_apert")
    public String getFechaApert() {
        return fechaApert;
    }

    /**
     * 
     * @param fechaApert
     *     The fecha_apert
     */
    @JsonProperty("fecha_apert")
    public void setFechaApert(String fechaApert) {
        this.fechaApert = fechaApert;
    }

    /**
     * 
     * @return
     *     The fechaModif
     */
    @JsonProperty("fecha_modif")
    public String getFechaModif() {
        return fechaModif;
    }

    /**
     * 
     * @param fechaModif
     *     The fecha_modif
     */
    @JsonProperty("fecha_modif")
    public void setFechaModif(String fechaModif) {
        this.fechaModif = fechaModif;
    }

    /**
     * 
     * @return
     *     The fechaActvTjta
     */
    @JsonProperty("fecha_actv_tjta")
    public String getFechaActvTjta() {
        return fechaActvTjta;
    }

    /**
     * 
     * @param fechaActvTjta
     *     The fecha_actv_tjta
     */
    @JsonProperty("fecha_actv_tjta")
    public void setFechaActvTjta(String fechaActvTjta) {
        this.fechaActvTjta = fechaActvTjta;
    }

    /**
     * 
     * @return
     *     The fechaActRen
     */
    @JsonProperty("fecha_act_ren")
    public String getFechaActRen() {
        return fechaActRen;
    }

    /**
     * 
     * @param fechaActRen
     *     The fecha_act_ren
     */
    @JsonProperty("fecha_act_ren")
    public void setFechaActRen(String fechaActRen) {
        this.fechaActRen = fechaActRen;
    }

    /**
     * 
     * @return
     *     The fechaBloq1
     */
    @JsonProperty("fecha_bloq1")
    public String getFechaBloq1() {
        return fechaBloq1;
    }

    /**
     * 
     * @param fechaBloq1
     *     The fecha_bloq1
     */
    @JsonProperty("fecha_bloq1")
    public void setFechaBloq1(String fechaBloq1) {
        this.fechaBloq1 = fechaBloq1;
    }

    /**
     * 
     * @return
     *     The fechaBloq2
     */
    @JsonProperty("fecha_bloq2")
    public String getFechaBloq2() {
        return fechaBloq2;
    }

    /**
     * 
     * @param fechaBloq2
     *     The fecha_bloq2
     */
    @JsonProperty("fecha_bloq2")
    public void setFechaBloq2(String fechaBloq2) {
        this.fechaBloq2 = fechaBloq2;
    }

    /**
     * 
     * @return
     *     The fechaUltPagoPesos
     */
    @JsonProperty("fecha_ult_pago_pesos")
    public String getFechaUltPagoPesos() {
        return fechaUltPagoPesos;
    }

    /**
     * 
     * @param fechaUltPagoPesos
     *     The fecha_ult_pago_pesos
     */
    @JsonProperty("fecha_ult_pago_pesos")
    public void setFechaUltPagoPesos(String fechaUltPagoPesos) {
        this.fechaUltPagoPesos = fechaUltPagoPesos;
    }

    /**
     * 
     * @return
     *     The fechaUltPagoDolar
     */
    @JsonProperty("fecha_ult_pago_dolar")
    public String getFechaUltPagoDolar() {
        return fechaUltPagoDolar;
    }

    /**
     * 
     * @param fechaUltPagoDolar
     *     The fecha_ult_pago_dolar
     */
    @JsonProperty("fecha_ult_pago_dolar")
    public void setFechaUltPagoDolar(String fechaUltPagoDolar) {
        this.fechaUltPagoDolar = fechaUltPagoDolar;
    }

    /**
     * 
     * @return
     *     The fechaUltFact
     */
    @JsonProperty("fecha_ult_fact")
    public String getFechaUltFact() {
        return fechaUltFact;
    }

    /**
     * 
     * @param fechaUltFact
     *     The fecha_ult_fact
     */
    @JsonProperty("fecha_ult_fact")
    public void setFechaUltFact(String fechaUltFact) {
        this.fechaUltFact = fechaUltFact;
    }

    /**
     * 
     * @return
     *     The fechaVencPago
     */
    @JsonProperty("fecha_venc_pago")
    public String getFechaVencPago() {
        return fechaVencPago;
    }

    /**
     * 
     * @param fechaVencPago
     *     The fecha_venc_pago
     */
    @JsonProperty("fecha_venc_pago")
    public void setFechaVencPago(String fechaVencPago) {
        this.fechaVencPago = fechaVencPago;
    }

    /**
     * 
     * @return
     *     The fechaNacTit
     */
    @JsonProperty("fecha_nac_tit")
    public String getFechaNacTit() {
        return fechaNacTit;
    }

    /**
     * 
     * @param fechaNacTit
     *     The fecha_nac_tit
     */
    @JsonProperty("fecha_nac_tit")
    public void setFechaNacTit(String fechaNacTit) {
        this.fechaNacTit = fechaNacTit;
    }

    /**
     * 
     * @return
     *     The cdgoBloq1
     */
    @JsonProperty("cdgo_bloq1")
    public String getCdgoBloq1() {
        return cdgoBloq1;
    }

    /**
     * 
     * @param cdgoBloq1
     *     The cdgo_bloq1
     */
    @JsonProperty("cdgo_bloq1")
    public void setCdgoBloq1(String cdgoBloq1) {
        this.cdgoBloq1 = cdgoBloq1;
    }

    /**
     * 
     * @return
     *     The cdgoBloq2
     */
    @JsonProperty("cdgo_bloq2")
    public String getCdgoBloq2() {
        return cdgoBloq2;
    }

    /**
     * 
     * @param cdgoBloq2
     *     The cdgo_bloq2
     */
    @JsonProperty("cdgo_bloq2")
    public void setCdgoBloq2(String cdgoBloq2) {
        this.cdgoBloq2 = cdgoBloq2;
    }

    /**
     * 
     * @return
     *     The cdgoBloqNumerico
     */
    @JsonProperty("cdgo_bloq_numerico")
    public String getCdgoBloqNumerico() {
        return cdgoBloqNumerico;
    }

    /**
     * 
     * @param cdgoBloqNumerico
     *     The cdgo_bloq_numerico
     */
    @JsonProperty("cdgo_bloq_numerico")
    public void setCdgoBloqNumerico(String cdgoBloqNumerico) {
        this.cdgoBloqNumerico = cdgoBloqNumerico;
    }

    /**
     * 
     * @return
     *     The cdgoMora
     */
    @JsonProperty("cdgo_mora")
    public String getCdgoMora() {
        return cdgoMora;
    }

    /**
     * 
     * @param cdgoMora
     *     The cdgo_mora
     */
    @JsonProperty("cdgo_mora")
    public void setCdgoMora(String cdgoMora) {
        this.cdgoMora = cdgoMora;
    }

    /**
     * 
     * @return
     *     The cdgoCarteraVencida
     */
    @JsonProperty("cdgo_cartera_vencida")
    public String getCdgoCarteraVencida() {
        return cdgoCarteraVencida;
    }

    /**
     * 
     * @param cdgoCarteraVencida
     *     The cdgo_cartera_vencida
     */
    @JsonProperty("cdgo_cartera_vencida")
    public void setCdgoCarteraVencida(String cdgoCarteraVencida) {
        this.cdgoCarteraVencida = cdgoCarteraVencida;
    }

    /**
     * 
     * @return
     *     The cdgoCob
     */
    @JsonProperty("cdgo_cob")
    public String getCdgoCob() {
        return cdgoCob;
    }

    /**
     * 
     * @param cdgoCob
     *     The cdgo_cob
     */
    @JsonProperty("cdgo_cob")
    public void setCdgoCob(String cdgoCob) {
        this.cdgoCob = cdgoCob;
    }

    /**
     * 
     * @return
     *     The formaPago
     */
    @JsonProperty("forma_pago")
    public String getFormaPago() {
        return formaPago;
    }

    /**
     * 
     * @param formaPago
     *     The forma_pago
     */
    @JsonProperty("forma_pago")
    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
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
     *     The cdgoFv
     */
    @JsonProperty("cdgo_fv")
    public String getCdgoFv() {
        return cdgoFv;
    }

    /**
     * 
     * @param cdgoFv
     *     The cdgo_fv
     */
    @JsonProperty("cdgo_fv")
    public void setCdgoFv(String cdgoFv) {
        this.cdgoFv = cdgoFv;
    }

    /**
     * 
     * @return
     *     The cdgoEmpresa
     */
    @JsonProperty("cdgo_empresa")
    public String getCdgoEmpresa() {
        return cdgoEmpresa;
    }

    /**
     * 
     * @param cdgoEmpresa
     *     The cdgo_empresa
     */
    @JsonProperty("cdgo_empresa")
    public void setCdgoEmpresa(String cdgoEmpresa) {
        this.cdgoEmpresa = cdgoEmpresa;
    }

    /**
     * 
     * @return
     *     The cdgoEnvioEecc
     */
    @JsonProperty("cdgo_envio_eecc")
    public String getCdgoEnvioEecc() {
        return cdgoEnvioEecc;
    }

    /**
     * 
     * @param cdgoEnvioEecc
     *     The cdgo_envio_eecc
     */
    @JsonProperty("cdgo_envio_eecc")
    public void setCdgoEnvioEecc(String cdgoEnvioEecc) {
        this.cdgoEnvioEecc = cdgoEnvioEecc;
    }

    /**
     * 
     * @return
     *     The rebajaCobadm
     */
    @JsonProperty("rebaja_cobadm")
    public String getRebajaCobadm() {
        return rebajaCobadm;
    }

    /**
     * 
     * @param rebajaCobadm
     *     The rebaja_cobadm
     */
    @JsonProperty("rebaja_cobadm")
    public void setRebajaCobadm(String rebajaCobadm) {
        this.rebajaCobadm = rebajaCobadm;
    }

    /**
     * 
     * @return
     *     The nroMorasPeriodo
     */
    @JsonProperty("nro_moras_periodo")
    public String getNroMorasPeriodo() {
        return nroMorasPeriodo;
    }

    /**
     * 
     * @param nroMorasPeriodo
     *     The nro_moras_periodo
     */
    @JsonProperty("nro_moras_periodo")
    public void setNroMorasPeriodo(String nroMorasPeriodo) {
        this.nroMorasPeriodo = nroMorasPeriodo;
    }

    /**
     * 
     * @return
     *     The nroExcesosPeriodo
     */
    @JsonProperty("nro_excesos_periodo")
    public String getNroExcesosPeriodo() {
        return nroExcesosPeriodo;
    }

    /**
     * 
     * @param nroExcesosPeriodo
     *     The nro_excesos_periodo
     */
    @JsonProperty("nro_excesos_periodo")
    public void setNroExcesosPeriodo(String nroExcesosPeriodo) {
        this.nroExcesosPeriodo = nroExcesosPeriodo;
    }

    /**
     * 
     * @return
     *     The nroBloqPorMoras
     */
    @JsonProperty("nro_bloq_por_moras")
    public String getNroBloqPorMoras() {
        return nroBloqPorMoras;
    }

    /**
     * 
     * @param nroBloqPorMoras
     *     The nro_bloq_por_moras
     */
    @JsonProperty("nro_bloq_por_moras")
    public void setNroBloqPorMoras(String nroBloqPorMoras) {
        this.nroBloqPorMoras = nroBloqPorMoras;
    }

    /**
     * 
     * @return
     *     The cdgoAval
     */
    @JsonProperty("cdgo_aval")
    public String getCdgoAval() {
        return cdgoAval;
    }

    /**
     * 
     * @param cdgoAval
     *     The cdgo_aval
     */
    @JsonProperty("cdgo_aval")
    public void setCdgoAval(String cdgoAval) {
        this.cdgoAval = cdgoAval;
    }

    /**
     * 
     * @return
     *     The cdgoPromocion
     */
    @JsonProperty("cdgo_promocion")
    public String getCdgoPromocion() {
        return cdgoPromocion;
    }

    /**
     * 
     * @param cdgoPromocion
     *     The cdgo_promocion
     */
    @JsonProperty("cdgo_promocion")
    public void setCdgoPromocion(String cdgoPromocion) {
        this.cdgoPromocion = cdgoPromocion;
    }

    /**
     * 
     * @return
     *     The indTjtaOperador
     */
    @JsonProperty("ind_tjta_operador")
    public String getIndTjtaOperador() {
        return indTjtaOperador;
    }

    /**
     * 
     * @param indTjtaOperador
     *     The ind_tjta_operador
     */
    @JsonProperty("ind_tjta_operador")
    public void setIndTjtaOperador(String indTjtaOperador) {
        this.indTjtaOperador = indTjtaOperador;
    }

    /**
     * 
     * @return
     *     The indPin
     */
    @JsonProperty("ind_pin")
    public String getIndPin() {
        return indPin;
    }

    /**
     * 
     * @param indPin
     *     The ind_pin
     */
    @JsonProperty("ind_pin")
    public void setIndPin(String indPin) {
        this.indPin = indPin;
    }

    /**
     * 
     * @return
     *     The indCobroComision
     */
    @JsonProperty("ind_cobro_comision")
    public String getIndCobroComision() {
        return indCobroComision;
    }

    /**
     * 
     * @param indCobroComision
     *     The ind_cobro_comision
     */
    @JsonProperty("ind_cobro_comision")
    public void setIndCobroComision(String indCobroComision) {
        this.indCobroComision = indCobroComision;
    }

    /**
     * 
     * @return
     *     The porcjeExcesoComprasNac
     */
    @JsonProperty("porcje_exceso_compras_nac")
    public String getPorcjeExcesoComprasNac() {
        return porcjeExcesoComprasNac;
    }

    /**
     * 
     * @param porcjeExcesoComprasNac
     *     The porcje_exceso_compras_nac
     */
    @JsonProperty("porcje_exceso_compras_nac")
    public void setPorcjeExcesoComprasNac(String porcjeExcesoComprasNac) {
        this.porcjeExcesoComprasNac = porcjeExcesoComprasNac;
    }

    /**
     * 
     * @return
     *     The porcjeExcesoComprasInt
     */
    @JsonProperty("porcje_exceso_compras_int")
    public String getPorcjeExcesoComprasInt() {
        return porcjeExcesoComprasInt;
    }

    /**
     * 
     * @param porcjeExcesoComprasInt
     *     The porcje_exceso_compras_int
     */
    @JsonProperty("porcje_exceso_compras_int")
    public void setPorcjeExcesoComprasInt(String porcjeExcesoComprasInt) {
        this.porcjeExcesoComprasInt = porcjeExcesoComprasInt;
    }

    /**
     * 
     * @return
     *     The medioEnvioFisicoEecc
     */
    @JsonProperty("medio_envio_fisico_eecc")
    public String getMedioEnvioFisicoEecc() {
        return medioEnvioFisicoEecc;
    }

    /**
     * 
     * @param medioEnvioFisicoEecc
     *     The medio_envio_fisico_eecc
     */
    @JsonProperty("medio_envio_fisico_eecc")
    public void setMedioEnvioFisicoEecc(String medioEnvioFisicoEecc) {
        this.medioEnvioFisicoEecc = medioEnvioFisicoEecc;
    }

    /**
     * 
     * @return
     *     The tipoDirFisica
     */
    @JsonProperty("tipo_dir_fisica")
    public String getTipoDirFisica() {
        return tipoDirFisica;
    }

    /**
     * 
     * @param tipoDirFisica
     *     The tipo_dir_fisica
     */
    @JsonProperty("tipo_dir_fisica")
    public void setTipoDirFisica(String tipoDirFisica) {
        this.tipoDirFisica = tipoDirFisica;
    }

    /**
     * 
     * @return
     *     The tipoPago
     */
    @JsonProperty("tipo_pago")
    public String getTipoPago() {
        return tipoPago;
    }

    /**
     * 
     * @param tipoPago
     *     The tipo_pago
     */
    @JsonProperty("tipo_pago")
    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    /**
     * 
     * @return
     *     The porPfijo
     */
    @JsonProperty("por_pfijo")
    public String getPorPfijo() {
        return porPfijo;
    }

    /**
     * 
     * @param porPfijo
     *     The por_pfijo
     */
    @JsonProperty("por_pfijo")
    public void setPorPfijo(String porPfijo) {
        this.porPfijo = porPfijo;
    }

    /**
     * 
     * @return
     *     The mtoPfijo9
     */
    @JsonProperty("mto_pfijo_9")
    public String getMtoPfijo9() {
        return mtoPfijo9;
    }

    /**
     * 
     * @param mtoPfijo9
     *     The mto_pfijo_9
     */
    @JsonProperty("mto_pfijo_9")
    public void setMtoPfijo9(String mtoPfijo9) {
        this.mtoPfijo9 = mtoPfijo9;
    }

    /**
     * 
     * @return
     *     The cdgoEmbozado
     */
    @JsonProperty("cdgo_embozado")
    public String getCdgoEmbozado() {
        return cdgoEmbozado;
    }

    /**
     * 
     * @param cdgoEmbozado
     *     The cdgo_embozado
     */
    @JsonProperty("cdgo_embozado")
    public void setCdgoEmbozado(String cdgoEmbozado) {
        this.cdgoEmbozado = cdgoEmbozado;
    }

    /**
     * 
     * @return
     *     The pctPesos9
     */
    @JsonProperty("pct_pesos_9")
    public String getPctPesos9() {
        return pctPesos9;
    }

    /**
     * 
     * @param pctPesos9
     *     The pct_pesos_9
     */
    @JsonProperty("pct_pesos_9")
    public void setPctPesos9(String pctPesos9) {
        this.pctPesos9 = pctPesos9;
    }

    /**
     * 
     * @return
     *     The pctDolar9
     */
    @JsonProperty("pct_dolar_9")
    public String getPctDolar9() {
        return pctDolar9;
    }

    /**
     * 
     * @param pctDolar9
     *     The pct_dolar_9
     */
    @JsonProperty("pct_dolar_9")
    public void setPctDolar9(String pctDolar9) {
        this.pctDolar9 = pctDolar9;
    }

    /**
     * 
     * @return
     *     The tresCpc
     */
    @JsonProperty("tres_cpc")
    public String getTresCpc() {
        return tresCpc;
    }

    /**
     * 
     * @param tresCpc
     *     The tres_cpc
     */
    @JsonProperty("tres_cpc")
    public void setTresCpc(String tresCpc) {
        this.tresCpc = tresCpc;
    }

    /**
     * 
     * @return
     *     The comisionExceso
     */
    @JsonProperty("comision_exceso")
    public String getComisionExceso() {
        return comisionExceso;
    }

    /**
     * 
     * @param comisionExceso
     *     The comision_exceso
     */
    @JsonProperty("comision_exceso")
    public void setComisionExceso(String comisionExceso) {
        this.comisionExceso = comisionExceso;
    }

    /**
     * 
     * @return
     *     The cupoNacional
     */
    @JsonProperty("cupo_nacional")
    public String getCupoNacional() {
        return cupoNacional;
    }

    /**
     * 
     * @param cupoNacional
     *     The cupo_nacional
     */
    @JsonProperty("cupo_nacional")
    public void setCupoNacional(String cupoNacional) {
        this.cupoNacional = cupoNacional;
    }

    /**
     * 
     * @return
     *     The cupoInt
     */
    @JsonProperty("cupo_int")
    public String getCupoInt() {
        return cupoInt;
    }

    /**
     * 
     * @param cupoInt
     *     The cupo_int
     */
    @JsonProperty("cupo_int")
    public void setCupoInt(String cupoInt) {
        this.cupoInt = cupoInt;
    }

    /**
     * 
     * @return
     *     The cupoLinea2
     */
    @JsonProperty("cupo_linea_2")
    public String getCupoLinea2() {
        return cupoLinea2;
    }

    /**
     * 
     * @param cupoLinea2
     *     The cupo_linea_2
     */
    @JsonProperty("cupo_linea_2")
    public void setCupoLinea2(String cupoLinea2) {
        this.cupoLinea2 = cupoLinea2;
    }

    /**
     * 
     * @return
     *     The cupoVirtual
     */
    @JsonProperty("cupo_virtual")
    public String getCupoVirtual() {
        return cupoVirtual;
    }

    /**
     * 
     * @param cupoVirtual
     *     The cupo_virtual
     */
    @JsonProperty("cupo_virtual")
    public void setCupoVirtual(String cupoVirtual) {
        this.cupoVirtual = cupoVirtual;
    }

    /**
     * 
     * @return
     *     The cupoVirtualInt
     */
    @JsonProperty("cupo_virtual_int")
    public String getCupoVirtualInt() {
        return cupoVirtualInt;
    }

    /**
     * 
     * @param cupoVirtualInt
     *     The cupo_virtual_int
     */
    @JsonProperty("cupo_virtual_int")
    public void setCupoVirtualInt(String cupoVirtualInt) {
        this.cupoVirtualInt = cupoVirtualInt;
    }

    /**
     * 
     * @return
     *     The deudaNacCta
     */
    @JsonProperty("deuda_nac_cta")
    public String getDeudaNacCta() {
        return deudaNacCta;
    }

    /**
     * 
     * @param deudaNacCta
     *     The deuda_nac_cta
     */
    @JsonProperty("deuda_nac_cta")
    public void setDeudaNacCta(String deudaNacCta) {
        this.deudaNacCta = deudaNacCta;
    }

    /**
     * 
     * @return
     *     The deudaIntCta
     */
    @JsonProperty("deuda_int_cta")
    public String getDeudaIntCta() {
        return deudaIntCta;
    }

    /**
     * 
     * @param deudaIntCta
     *     The deuda_int_cta
     */
    @JsonProperty("deuda_int_cta")
    public void setDeudaIntCta(String deudaIntCta) {
        this.deudaIntCta = deudaIntCta;
    }

    /**
     * 
     * @return
     *     The deudaL2Cta
     */
    @JsonProperty("deuda_l2_cta")
    public String getDeudaL2Cta() {
        return deudaL2Cta;
    }

    /**
     * 
     * @param deudaL2Cta
     *     The deuda_l2_cta
     */
    @JsonProperty("deuda_l2_cta")
    public void setDeudaL2Cta(String deudaL2Cta) {
        this.deudaL2Cta = deudaL2Cta;
    }

    /**
     * 
     * @return
     *     The deudaMoraNacCta
     */
    @JsonProperty("deuda_mora_nac_cta")
    public String getDeudaMoraNacCta() {
        return deudaMoraNacCta;
    }

    /**
     * 
     * @param deudaMoraNacCta
     *     The deuda_mora_nac_cta
     */
    @JsonProperty("deuda_mora_nac_cta")
    public void setDeudaMoraNacCta(String deudaMoraNacCta) {
        this.deudaMoraNacCta = deudaMoraNacCta;
    }

    /**
     * 
     * @return
     *     The deudaMoraIntCta
     */
    @JsonProperty("deuda_mora_int_cta")
    public String getDeudaMoraIntCta() {
        return deudaMoraIntCta;
    }

    /**
     * 
     * @param deudaMoraIntCta
     *     The deuda_mora_int_cta
     */
    @JsonProperty("deuda_mora_int_cta")
    public void setDeudaMoraIntCta(String deudaMoraIntCta) {
        this.deudaMoraIntCta = deudaMoraIntCta;
    }

    /**
     * 
     * @return
     *     The deudaNacFactCta
     */
    @JsonProperty("deuda_nac_fact_cta")
    public String getDeudaNacFactCta() {
        return deudaNacFactCta;
    }

    /**
     * 
     * @param deudaNacFactCta
     *     The deuda_nac_fact_cta
     */
    @JsonProperty("deuda_nac_fact_cta")
    public void setDeudaNacFactCta(String deudaNacFactCta) {
        this.deudaNacFactCta = deudaNacFactCta;
    }

    /**
     * 
     * @return
     *     The deudaIntFactCta
     */
    @JsonProperty("deuda_int_fact_cta")
    public String getDeudaIntFactCta() {
        return deudaIntFactCta;
    }

    /**
     * 
     * @param deudaIntFactCta
     *     The deuda_int_fact_cta
     */
    @JsonProperty("deuda_int_fact_cta")
    public void setDeudaIntFactCta(String deudaIntFactCta) {
        this.deudaIntFactCta = deudaIntFactCta;
    }

    /**
     * 
     * @return
     *     The dispNacCta
     */
    @JsonProperty("disp_nac_cta")
    public String getDispNacCta() {
        return dispNacCta;
    }

    /**
     * 
     * @param dispNacCta
     *     The disp_nac_cta
     */
    @JsonProperty("disp_nac_cta")
    public void setDispNacCta(String dispNacCta) {
        this.dispNacCta = dispNacCta;
    }

    /**
     * 
     * @return
     *     The dispIntCta
     */
    @JsonProperty("disp_int_cta")
    public String getDispIntCta() {
        return dispIntCta;
    }

    /**
     * 
     * @param dispIntCta
     *     The disp_int_cta
     */
    @JsonProperty("disp_int_cta")
    public void setDispIntCta(String dispIntCta) {
        this.dispIntCta = dispIntCta;
    }

    /**
     * 
     * @return
     *     The dispL2Cta
     */
    @JsonProperty("disp_l2_cta")
    public String getDispL2Cta() {
        return dispL2Cta;
    }

    /**
     * 
     * @param dispL2Cta
     *     The disp_l2_cta
     */
    @JsonProperty("disp_l2_cta")
    public void setDispL2Cta(String dispL2Cta) {
        this.dispL2Cta = dispL2Cta;
    }

    /**
     * 
     * @return
     *     The saldoCreditoCuotaCapital
     */
    @JsonProperty("saldo_credito_cuota_capital")
    public String getSaldoCreditoCuotaCapital() {
        return saldoCreditoCuotaCapital;
    }

    /**
     * 
     * @param saldoCreditoCuotaCapital
     *     The saldo_credito_cuota_capital
     */
    @JsonProperty("saldo_credito_cuota_capital")
    public void setSaldoCreditoCuotaCapital(String saldoCreditoCuotaCapital) {
        this.saldoCreditoCuotaCapital = saldoCreditoCuotaCapital;
    }

    /**
     * 
     * @return
     *     The dispAvancesCta
     */
    @JsonProperty("disp_avances_cta")
    public String getDispAvancesCta() {
        return dispAvancesCta;
    }

    /**
     * 
     * @param dispAvancesCta
     *     The disp_avances_cta
     */
    @JsonProperty("disp_avances_cta")
    public void setDispAvancesCta(String dispAvancesCta) {
        this.dispAvancesCta = dispAvancesCta;
    }

    /**
     * 
     * @return
     *     The dispAvancesDolarCta
     */
    @JsonProperty("disp_avances_dolar_cta")
    public String getDispAvancesDolarCta() {
        return dispAvancesDolarCta;
    }

    /**
     * 
     * @param dispAvancesDolarCta
     *     The disp_avances_dolar_cta
     */
    @JsonProperty("disp_avances_dolar_cta")
    public void setDispAvancesDolarCta(String dispAvancesDolarCta) {
        this.dispAvancesDolarCta = dispAvancesDolarCta;
    }

    /**
     * 
     * @return
     *     The mora130d
     */
    @JsonProperty("mora_1_30d")
    public String getMora130d() {
        return mora130d;
    }

    /**
     * 
     * @param mora130d
     *     The mora_1_30d
     */
    @JsonProperty("mora_1_30d")
    public void setMora130d(String mora130d) {
        this.mora130d = mora130d;
    }

    /**
     * 
     * @return
     *     The mora3160d
     */
    @JsonProperty("mora_31_60d")
    public String getMora3160d() {
        return mora3160d;
    }

    /**
     * 
     * @param mora3160d
     *     The mora_31_60d
     */
    @JsonProperty("mora_31_60d")
    public void setMora3160d(String mora3160d) {
        this.mora3160d = mora3160d;
    }

    /**
     * 
     * @return
     *     The mora6190d
     */
    @JsonProperty("mora_61_90d")
    public String getMora6190d() {
        return mora6190d;
    }

    /**
     * 
     * @param mora6190d
     *     The mora_61_90d
     */
    @JsonProperty("mora_61_90d")
    public void setMora6190d(String mora6190d) {
        this.mora6190d = mora6190d;
    }

    /**
     * 
     * @return
     *     The mora91120d
     */
    @JsonProperty("mora_91_120d")
    public String getMora91120d() {
        return mora91120d;
    }

    /**
     * 
     * @param mora91120d
     *     The mora_91_120d
     */
    @JsonProperty("mora_91_120d")
    public void setMora91120d(String mora91120d) {
        this.mora91120d = mora91120d;
    }

    /**
     * 
     * @return
     *     The mora121150d
     */
    @JsonProperty("mora_121_150d")
    public String getMora121150d() {
        return mora121150d;
    }

    /**
     * 
     * @param mora121150d
     *     The mora_121_150d
     */
    @JsonProperty("mora_121_150d")
    public void setMora121150d(String mora121150d) {
        this.mora121150d = mora121150d;
    }

    /**
     * 
     * @return
     *     The mora151180d
     */
    @JsonProperty("mora_151_180d")
    public String getMora151180d() {
        return mora151180d;
    }

    /**
     * 
     * @param mora151180d
     *     The mora_151_180d
     */
    @JsonProperty("mora_151_180d")
    public void setMora151180d(String mora151180d) {
        this.mora151180d = mora151180d;
    }

    /**
     * 
     * @return
     *     The mora181210d
     */
    @JsonProperty("mora_181_210d")
    public String getMora181210d() {
        return mora181210d;
    }

    /**
     * 
     * @param mora181210d
     *     The mora_181_210d
     */
    @JsonProperty("mora_181_210d")
    public void setMora181210d(String mora181210d) {
        this.mora181210d = mora181210d;
    }

    /**
     * 
     * @return
     *     The mora210999d
     */
    @JsonProperty("mora_210_999d")
    public String getMora210999d() {
        return mora210999d;
    }

    /**
     * 
     * @param mora210999d
     *     The mora_210_999d
     */
    @JsonProperty("mora_210_999d")
    public void setMora210999d(String mora210999d) {
        this.mora210999d = mora210999d;
    }

    /**
     * 
     * @return
     *     The recargoCob130d
     */
    @JsonProperty("recargo_cob_1_30d")
    public String getRecargoCob130d() {
        return recargoCob130d;
    }

    /**
     * 
     * @param recargoCob130d
     *     The recargo_cob_1_30d
     */
    @JsonProperty("recargo_cob_1_30d")
    public void setRecargoCob130d(String recargoCob130d) {
        this.recargoCob130d = recargoCob130d;
    }

    /**
     * 
     * @return
     *     The recargoCob3160d
     */
    @JsonProperty("recargo_cob_31_60d")
    public String getRecargoCob3160d() {
        return recargoCob3160d;
    }

    /**
     * 
     * @param recargoCob3160d
     *     The recargo_cob_31_60d
     */
    @JsonProperty("recargo_cob_31_60d")
    public void setRecargoCob3160d(String recargoCob3160d) {
        this.recargoCob3160d = recargoCob3160d;
    }

    /**
     * 
     * @return
     *     The recargoCob6190d
     */
    @JsonProperty("recargo_cob_61_90d")
    public String getRecargoCob6190d() {
        return recargoCob6190d;
    }

    /**
     * 
     * @param recargoCob6190d
     *     The recargo_cob_61_90d
     */
    @JsonProperty("recargo_cob_61_90d")
    public void setRecargoCob6190d(String recargoCob6190d) {
        this.recargoCob6190d = recargoCob6190d;
    }

    /**
     * 
     * @return
     *     The recargoCob91120d
     */
    @JsonProperty("recargo_cob_91_120d")
    public String getRecargoCob91120d() {
        return recargoCob91120d;
    }

    /**
     * 
     * @param recargoCob91120d
     *     The recargo_cob_91_120d
     */
    @JsonProperty("recargo_cob_91_120d")
    public void setRecargoCob91120d(String recargoCob91120d) {
        this.recargoCob91120d = recargoCob91120d;
    }

    /**
     * 
     * @return
     *     The recargoCob121150d
     */
    @JsonProperty("recargo_cob_121_150d")
    public String getRecargoCob121150d() {
        return recargoCob121150d;
    }

    /**
     * 
     * @param recargoCob121150d
     *     The recargo_cob_121_150d
     */
    @JsonProperty("recargo_cob_121_150d")
    public void setRecargoCob121150d(String recargoCob121150d) {
        this.recargoCob121150d = recargoCob121150d;
    }

    /**
     * 
     * @return
     *     The recargoCob151180d
     */
    @JsonProperty("recargo_cob_151_180d")
    public String getRecargoCob151180d() {
        return recargoCob151180d;
    }

    /**
     * 
     * @param recargoCob151180d
     *     The recargo_cob_151_180d
     */
    @JsonProperty("recargo_cob_151_180d")
    public void setRecargoCob151180d(String recargoCob151180d) {
        this.recargoCob151180d = recargoCob151180d;
    }

    /**
     * 
     * @return
     *     The recargoCob181210d
     */
    @JsonProperty("recargo_cob_181_210d")
    public String getRecargoCob181210d() {
        return recargoCob181210d;
    }

    /**
     * 
     * @param recargoCob181210d
     *     The recargo_cob_181_210d
     */
    @JsonProperty("recargo_cob_181_210d")
    public void setRecargoCob181210d(String recargoCob181210d) {
        this.recargoCob181210d = recargoCob181210d;
    }

    /**
     * 
     * @return
     *     The recargoCob210999d
     */
    @JsonProperty("recargo_cob_210_999d")
    public String getRecargoCob210999d() {
        return recargoCob210999d;
    }

    /**
     * 
     * @param recargoCob210999d
     *     The recargo_cob_210_999d
     */
    @JsonProperty("recargo_cob_210_999d")
    public void setRecargoCob210999d(String recargoCob210999d) {
        this.recargoCob210999d = recargoCob210999d;
    }

    /**
     * 
     * @return
     *     The pagoMinimo
     */
    @JsonProperty("pago_minimo")
    public String getPagoMinimo() {
        return pagoMinimo;
    }

    /**
     * 
     * @param pagoMinimo
     *     The pago_minimo
     */
    @JsonProperty("pago_minimo")
    public void setPagoMinimo(String pagoMinimo) {
        this.pagoMinimo = pagoMinimo;
    }

    /**
     * 
     * @return
     *     The sldoColNac
     */
    @JsonProperty("sldo_col_nac")
    public String getSldoColNac() {
        return sldoColNac;
    }

    /**
     * 
     * @param sldoColNac
     *     The sldo_col_nac
     */
    @JsonProperty("sldo_col_nac")
    public void setSldoColNac(String sldoColNac) {
        this.sldoColNac = sldoColNac;
    }

    /**
     * 
     * @return
     *     The sldoColInt
     */
    @JsonProperty("sldo_col_int")
    public String getSldoColInt() {
        return sldoColInt;
    }

    /**
     * 
     * @param sldoColInt
     *     The sldo_col_int
     */
    @JsonProperty("sldo_col_int")
    public void setSldoColInt(String sldoColInt) {
        this.sldoColInt = sldoColInt;
    }

    /**
     * 
     * @return
     *     The tasaInteresRotativo
     */
    @JsonProperty("tasa_interes_rotativo")
    public String getTasaInteresRotativo() {
        return tasaInteresRotativo;
    }

    /**
     * 
     * @param tasaInteresRotativo
     *     The tasa_interes_rotativo
     */
    @JsonProperty("tasa_interes_rotativo")
    public void setTasaInteresRotativo(String tasaInteresRotativo) {
        this.tasaInteresRotativo = tasaInteresRotativo;
    }

    /**
     * 
     * @return
     *     The tasaInteresCuotas24
     */
    @JsonProperty("tasa_interes_cuotas_2_4")
    public String getTasaInteresCuotas24() {
        return tasaInteresCuotas24;
    }

    /**
     * 
     * @param tasaInteresCuotas24
     *     The tasa_interes_cuotas_2_4
     */
    @JsonProperty("tasa_interes_cuotas_2_4")
    public void setTasaInteresCuotas24(String tasaInteresCuotas24) {
        this.tasaInteresCuotas24 = tasaInteresCuotas24;
    }

    /**
     * 
     * @return
     *     The tasaInteresCuotas524
     */
    @JsonProperty("tasa_interes_cuotas_5_24")
    public String getTasaInteresCuotas524() {
        return tasaInteresCuotas524;
    }

    /**
     * 
     * @param tasaInteresCuotas524
     *     The tasa_interes_cuotas_5_24
     */
    @JsonProperty("tasa_interes_cuotas_5_24")
    public void setTasaInteresCuotas524(String tasaInteresCuotas524) {
        this.tasaInteresCuotas524 = tasaInteresCuotas524;
    }

    /**
     * 
     * @return
     *     The interesXCobrarOper
     */
    @JsonProperty("interes_x_cobrar_oper")
    public String getInteresXCobrarOper() {
        return interesXCobrarOper;
    }

    /**
     * 
     * @param interesXCobrarOper
     *     The interes_x_cobrar_oper
     */
    @JsonProperty("interes_x_cobrar_oper")
    public void setInteresXCobrarOper(String interesXCobrarOper) {
        this.interesXCobrarOper = interesXCobrarOper;
    }

    /**
     * 
     * @return
     *     The interesXCobrarCorr
     */
    @JsonProperty("interes_x_cobrar_corr")
    public String getInteresXCobrarCorr() {
        return interesXCobrarCorr;
    }

    /**
     * 
     * @param interesXCobrarCorr
     *     The interes_x_cobrar_corr
     */
    @JsonProperty("interes_x_cobrar_corr")
    public void setInteresXCobrarCorr(String interesXCobrarCorr) {
        this.interesXCobrarCorr = interesXCobrarCorr;
    }

    /**
     * 
     * @return
     *     The interesXCobrarPenales
     */
    @JsonProperty("interes_x_cobrar_penales")
    public String getInteresXCobrarPenales() {
        return interesXCobrarPenales;
    }

    /**
     * 
     * @param interesXCobrarPenales
     *     The interes_x_cobrar_penales
     */
    @JsonProperty("interes_x_cobrar_penales")
    public void setInteresXCobrarPenales(String interesXCobrarPenales) {
        this.interesXCobrarPenales = interesXCobrarPenales;
    }

    /**
     * 
     * @return
     *     The interesDevOper
     */
    @JsonProperty("interes_dev_oper")
    public String getInteresDevOper() {
        return interesDevOper;
    }

    /**
     * 
     * @param interesDevOper
     *     The interes_dev_oper
     */
    @JsonProperty("interes_dev_oper")
    public void setInteresDevOper(String interesDevOper) {
        this.interesDevOper = interesDevOper;
    }

    /**
     * 
     * @return
     *     The interesDevCorr
     */
    @JsonProperty("interes_dev_corr")
    public String getInteresDevCorr() {
        return interesDevCorr;
    }

    /**
     * 
     * @param interesDevCorr
     *     The interes_dev_corr
     */
    @JsonProperty("interes_dev_corr")
    public void setInteresDevCorr(String interesDevCorr) {
        this.interesDevCorr = interesDevCorr;
    }

    /**
     * 
     * @return
     *     The interesDevPenales
     */
    @JsonProperty("interes_dev_penales")
    public String getInteresDevPenales() {
        return interesDevPenales;
    }

    /**
     * 
     * @param interesDevPenales
     *     The interes_dev_penales
     */
    @JsonProperty("interes_dev_penales")
    public void setInteresDevPenales(String interesDevPenales) {
        this.interesDevPenales = interesDevPenales;
    }

    /**
     * 
     * @return
     *     The interesPercOper
     */
    @JsonProperty("interes_perc_oper")
    public String getInteresPercOper() {
        return interesPercOper;
    }

    /**
     * 
     * @param interesPercOper
     *     The interes_perc_oper
     */
    @JsonProperty("interes_perc_oper")
    public void setInteresPercOper(String interesPercOper) {
        this.interesPercOper = interesPercOper;
    }

    /**
     * 
     * @return
     *     The interesPercCorr
     */
    @JsonProperty("interes_perc_corr")
    public String getInteresPercCorr() {
        return interesPercCorr;
    }

    /**
     * 
     * @param interesPercCorr
     *     The interes_perc_corr
     */
    @JsonProperty("interes_perc_corr")
    public void setInteresPercCorr(String interesPercCorr) {
        this.interesPercCorr = interesPercCorr;
    }

    /**
     * 
     * @return
     *     The interesPercPenales
     */
    @JsonProperty("interes_perc_penales")
    public String getInteresPercPenales() {
        return interesPercPenales;
    }

    /**
     * 
     * @param interesPercPenales
     *     The interes_perc_penales
     */
    @JsonProperty("interes_perc_penales")
    public void setInteresPercPenales(String interesPercPenales) {
        this.interesPercPenales = interesPercPenales;
    }

    /**
     * 
     * @return
     *     The deudaTotal
     */
    @JsonProperty("deuda_total")
    public String getDeudaTotal() {
        return deudaTotal;
    }

    /**
     * 
     * @param deudaTotal
     *     The deuda_total
     */
    @JsonProperty("deuda_total")
    public void setDeudaTotal(String deudaTotal) {
        this.deudaTotal = deudaTotal;
    }

    /**
     * 
     * @return
     *     The colocacionMes
     */
    @JsonProperty("colocacion_mes")
    public String getColocacionMes() {
        return colocacionMes;
    }

    /**
     * 
     * @param colocacionMes
     *     The colocacion_mes
     */
    @JsonProperty("colocacion_mes")
    public void setColocacionMes(String colocacionMes) {
        this.colocacionMes = colocacionMes;
    }

    /**
     * 
     * @return
     *     The montoCompraMes
     */
    @JsonProperty("monto_compra_mes")
    public String getMontoCompraMes() {
        return montoCompraMes;
    }

    /**
     * 
     * @param montoCompraMes
     *     The monto_compra_mes
     */
    @JsonProperty("monto_compra_mes")
    public void setMontoCompraMes(String montoCompraMes) {
        this.montoCompraMes = montoCompraMes;
    }

    /**
     * 
     * @return
     *     The montoAvanceMes
     */
    @JsonProperty("monto_avance_mes")
    public String getMontoAvanceMes() {
        return montoAvanceMes;
    }

    /**
     * 
     * @param montoAvanceMes
     *     The monto_avance_mes
     */
    @JsonProperty("monto_avance_mes")
    public void setMontoAvanceMes(String montoAvanceMes) {
        this.montoAvanceMes = montoAvanceMes;
    }

    /**
     * 
     * @return
     *     The montoUltimoPagoPeso
     */
    @JsonProperty("monto_ultimo_pago_peso")
    public String getMontoUltimoPagoPeso() {
        return montoUltimoPagoPeso;
    }

    /**
     * 
     * @param montoUltimoPagoPeso
     *     The monto_ultimo_pago_peso
     */
    @JsonProperty("monto_ultimo_pago_peso")
    public void setMontoUltimoPagoPeso(String montoUltimoPagoPeso) {
        this.montoUltimoPagoPeso = montoUltimoPagoPeso;
    }

    /**
     * 
     * @return
     *     The montoUltimoPagoDolar
     */
    @JsonProperty("monto_ultimo_pago_dolar")
    public String getMontoUltimoPagoDolar() {
        return montoUltimoPagoDolar;
    }

    /**
     * 
     * @param montoUltimoPagoDolar
     *     The monto_ultimo_pago_dolar
     */
    @JsonProperty("monto_ultimo_pago_dolar")
    public void setMontoUltimoPagoDolar(String montoUltimoPagoDolar) {
        this.montoUltimoPagoDolar = montoUltimoPagoDolar;
    }

    /**
     * 
     * @return
     *     The montoCobroAdm
     */
    @JsonProperty("monto_cobro_adm")
    public String getMontoCobroAdm() {
        return montoCobroAdm;
    }

    /**
     * 
     * @param montoCobroAdm
     *     The monto_cobro_adm
     */
    @JsonProperty("monto_cobro_adm")
    public void setMontoCobroAdm(String montoCobroAdm) {
        this.montoCobroAdm = montoCobroAdm;
    }

    /**
     * 
     * @return
     *     The consumoPesos
     */
    @JsonProperty("consumo_pesos")
    public String getConsumoPesos() {
        return consumoPesos;
    }

    /**
     * 
     * @param consumoPesos
     *     The consumo_pesos
     */
    @JsonProperty("consumo_pesos")
    public void setConsumoPesos(String consumoPesos) {
        this.consumoPesos = consumoPesos;
    }

    /**
     * 
     * @return
     *     The consumoDolar
     */
    @JsonProperty("consumo_dolar")
    public String getConsumoDolar() {
        return consumoDolar;
    }

    /**
     * 
     * @param consumoDolar
     *     The consumo_dolar
     */
    @JsonProperty("consumo_dolar")
    public void setConsumoDolar(String consumoDolar) {
        this.consumoDolar = consumoDolar;
    }

    /**
     * 
     * @return
     *     The pagosPesosCiclo
     */
    @JsonProperty("pagos_pesos_ciclo")
    public String getPagosPesosCiclo() {
        return pagosPesosCiclo;
    }

    /**
     * 
     * @param pagosPesosCiclo
     *     The pagos_pesos_ciclo
     */
    @JsonProperty("pagos_pesos_ciclo")
    public void setPagosPesosCiclo(String pagosPesosCiclo) {
        this.pagosPesosCiclo = pagosPesosCiclo;
    }

    /**
     * 
     * @return
     *     The pagosDolarCiclo
     */
    @JsonProperty("pagos_dolar_ciclo")
    public String getPagosDolarCiclo() {
        return pagosDolarCiclo;
    }

    /**
     * 
     * @param pagosDolarCiclo
     *     The pagos_dolar_ciclo
     */
    @JsonProperty("pagos_dolar_ciclo")
    public void setPagosDolarCiclo(String pagosDolarCiclo) {
        this.pagosDolarCiclo = pagosDolarCiclo;
    }

    /**
     * 
     * @return
     *     The creditosPesosCiclo
     */
    @JsonProperty("creditos_pesos_ciclo")
    public String getCreditosPesosCiclo() {
        return creditosPesosCiclo;
    }

    /**
     * 
     * @param creditosPesosCiclo
     *     The creditos_pesos_ciclo
     */
    @JsonProperty("creditos_pesos_ciclo")
    public void setCreditosPesosCiclo(String creditosPesosCiclo) {
        this.creditosPesosCiclo = creditosPesosCiclo;
    }

    /**
     * 
     * @return
     *     The creditosDolarCiclo
     */
    @JsonProperty("creditos_dolar_ciclo")
    public String getCreditosDolarCiclo() {
        return creditosDolarCiclo;
    }

    /**
     * 
     * @param creditosDolarCiclo
     *     The creditos_dolar_ciclo
     */
    @JsonProperty("creditos_dolar_ciclo")
    public void setCreditosDolarCiclo(String creditosDolarCiclo) {
        this.creditosDolarCiclo = creditosDolarCiclo;
    }

    /**
     * 
     * @return
     *     The debitosPesosCiclo
     */
    @JsonProperty("debitos_pesos_ciclo")
    public String getDebitosPesosCiclo() {
        return debitosPesosCiclo;
    }

    /**
     * 
     * @param debitosPesosCiclo
     *     The debitos_pesos_ciclo
     */
    @JsonProperty("debitos_pesos_ciclo")
    public void setDebitosPesosCiclo(String debitosPesosCiclo) {
        this.debitosPesosCiclo = debitosPesosCiclo;
    }

    /**
     * 
     * @return
     *     The debitosDolarCiclo
     */
    @JsonProperty("debitos_dolar_ciclo")
    public String getDebitosDolarCiclo() {
        return debitosDolarCiclo;
    }

    /**
     * 
     * @param debitosDolarCiclo
     *     The debitos_dolar_ciclo
     */
    @JsonProperty("debitos_dolar_ciclo")
    public void setDebitosDolarCiclo(String debitosDolarCiclo) {
        this.debitosDolarCiclo = debitosDolarCiclo;
    }

    /**
     * 
     * @return
     *     The creditosMemoPesosCiclo
     */
    @JsonProperty("creditos_memo_pesos_ciclo")
    public String getCreditosMemoPesosCiclo() {
        return creditosMemoPesosCiclo;
    }

    /**
     * 
     * @param creditosMemoPesosCiclo
     *     The creditos_memo_pesos_ciclo
     */
    @JsonProperty("creditos_memo_pesos_ciclo")
    public void setCreditosMemoPesosCiclo(String creditosMemoPesosCiclo) {
        this.creditosMemoPesosCiclo = creditosMemoPesosCiclo;
    }

    /**
     * 
     * @return
     *     The creditosMemoDolarCiclo
     */
    @JsonProperty("creditos_memo_dolar_ciclo")
    public String getCreditosMemoDolarCiclo() {
        return creditosMemoDolarCiclo;
    }

    /**
     * 
     * @param creditosMemoDolarCiclo
     *     The creditos_memo_dolar_ciclo
     */
    @JsonProperty("creditos_memo_dolar_ciclo")
    public void setCreditosMemoDolarCiclo(String creditosMemoDolarCiclo) {
        this.creditosMemoDolarCiclo = creditosMemoDolarCiclo;
    }

    /**
     * 
     * @return
     *     The debitosMemoPesosCiclo
     */
    @JsonProperty("debitos_memo_pesos_ciclo")
    public String getDebitosMemoPesosCiclo() {
        return debitosMemoPesosCiclo;
    }

    /**
     * 
     * @param debitosMemoPesosCiclo
     *     The debitos_memo_pesos_ciclo
     */
    @JsonProperty("debitos_memo_pesos_ciclo")
    public void setDebitosMemoPesosCiclo(String debitosMemoPesosCiclo) {
        this.debitosMemoPesosCiclo = debitosMemoPesosCiclo;
    }

    /**
     * 
     * @return
     *     The debitosMemoDolarCiclo
     */
    @JsonProperty("debitos_memo_dolar_ciclo")
    public String getDebitosMemoDolarCiclo() {
        return debitosMemoDolarCiclo;
    }

    /**
     * 
     * @param debitosMemoDolarCiclo
     *     The debitos_memo_dolar_ciclo
     */
    @JsonProperty("debitos_memo_dolar_ciclo")
    public void setDebitosMemoDolarCiclo(String debitosMemoDolarCiclo) {
        this.debitosMemoDolarCiclo = debitosMemoDolarCiclo;
    }

    /**
     * 
     * @return
     *     The utiliXCobrarMonedaExt
     */
    @JsonProperty("utili_x_cobrar_moneda_ext")
    public String getUtiliXCobrarMonedaExt() {
        return utiliXCobrarMonedaExt;
    }

    /**
     * 
     * @param utiliXCobrarMonedaExt
     *     The utili_x_cobrar_moneda_ext
     */
    @JsonProperty("utili_x_cobrar_moneda_ext")
    public void setUtiliXCobrarMonedaExt(String utiliXCobrarMonedaExt) {
        this.utiliXCobrarMonedaExt = utiliXCobrarMonedaExt;
    }

    /**
     * 
     * @return
     *     The pagosXAplicarMonedaExt
     */
    @JsonProperty("pagos_x_aplicar_moneda_ext")
    public String getPagosXAplicarMonedaExt() {
        return pagosXAplicarMonedaExt;
    }

    /**
     * 
     * @param pagosXAplicarMonedaExt
     *     The pagos_x_aplicar_moneda_ext
     */
    @JsonProperty("pagos_x_aplicar_moneda_ext")
    public void setPagosXAplicarMonedaExt(String pagosXAplicarMonedaExt) {
        this.pagosXAplicarMonedaExt = pagosXAplicarMonedaExt;
    }

    /**
     * 
     * @return
     *     The utiliXCobrarMonedaNac
     */
    @JsonProperty("utili_x_cobrar_moneda_nac")
    public String getUtiliXCobrarMonedaNac() {
        return utiliXCobrarMonedaNac;
    }

    /**
     * 
     * @param utiliXCobrarMonedaNac
     *     The utili_x_cobrar_moneda_nac
     */
    @JsonProperty("utili_x_cobrar_moneda_nac")
    public void setUtiliXCobrarMonedaNac(String utiliXCobrarMonedaNac) {
        this.utiliXCobrarMonedaNac = utiliXCobrarMonedaNac;
    }

    /**
     * 
     * @return
     *     The tasaIntAvceCtaCorta
     */
    @JsonProperty("tasa_int_avce_cta_corta")
    public String getTasaIntAvceCtaCorta() {
        return tasaIntAvceCtaCorta;
    }

    /**
     * 
     * @param tasaIntAvceCtaCorta
     *     The tasa_int_avce_cta_corta
     */
    @JsonProperty("tasa_int_avce_cta_corta")
    public void setTasaIntAvceCtaCorta(String tasaIntAvceCtaCorta) {
        this.tasaIntAvceCtaCorta = tasaIntAvceCtaCorta;
    }

    /**
     * 
     * @return
     *     The tasaIntAvceCtaLarga
     */
    @JsonProperty("tasa_int_avce_cta_larga")
    public String getTasaIntAvceCtaLarga() {
        return tasaIntAvceCtaLarga;
    }

    /**
     * 
     * @param tasaIntAvceCtaLarga
     *     The tasa_int_avce_cta_larga
     */
    @JsonProperty("tasa_int_avce_cta_larga")
    public void setTasaIntAvceCtaLarga(String tasaIntAvceCtaLarga) {
        this.tasaIntAvceCtaLarga = tasaIntAvceCtaLarga;
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
     *     The fechaUltFactDolar
     */
    @JsonProperty("fecha_ult_fact_dolar")
    public String getFechaUltFactDolar() {
        return fechaUltFactDolar;
    }

    /**
     * 
     * @param fechaUltFactDolar
     *     The fecha_ult_fact_dolar
     */
    @JsonProperty("fecha_ult_fact_dolar")
    public void setFechaUltFactDolar(String fechaUltFactDolar) {
        this.fechaUltFactDolar = fechaUltFactDolar;
    }

    /**
     * 
     * @return
     *     The fechaVencFactDolar
     */
    @JsonProperty("fecha_venc_fact_dolar")
    public String getFechaVencFactDolar() {
        return fechaVencFactDolar;
    }

    /**
     * 
     * @param fechaVencFactDolar
     *     The fecha_venc_fact_dolar
     */
    @JsonProperty("fecha_venc_fact_dolar")
    public void setFechaVencFactDolar(String fechaVencFactDolar) {
        this.fechaVencFactDolar = fechaVencFactDolar;
    }

    /**
     * 
     * @return
     *     The fechaProxFactCalend
     */
    @JsonProperty("fecha_prox_fact_calend")
    public String getFechaProxFactCalend() {
        return fechaProxFactCalend;
    }

    /**
     * 
     * @param fechaProxFactCalend
     *     The fecha_prox_fact_calend
     */
    @JsonProperty("fecha_prox_fact_calend")
    public void setFechaProxFactCalend(String fechaProxFactCalend) {
        this.fechaProxFactCalend = fechaProxFactCalend;
    }

    /**
     * 
     * @return
     *     The fechaProxVencCalend
     */
    @JsonProperty("fecha_prox_venc_calend")
    public String getFechaProxVencCalend() {
        return fechaProxVencCalend;
    }

    /**
     * 
     * @param fechaProxVencCalend
     *     The fecha_prox_venc_calend
     */
    @JsonProperty("fecha_prox_venc_calend")
    public void setFechaProxVencCalend(String fechaProxVencCalend) {
        this.fechaProxVencCalend = fechaProxVencCalend;
    }

    /**
     * 
     * @return
     *     The fechaVigEeccDesde
     */
    @JsonProperty("fecha_vig_eecc_desde")
    public String getFechaVigEeccDesde() {
        return fechaVigEeccDesde;
    }

    /**
     * 
     * @param fechaVigEeccDesde
     *     The fecha_vig_eecc_desde
     */
    @JsonProperty("fecha_vig_eecc_desde")
    public void setFechaVigEeccDesde(String fechaVigEeccDesde) {
        this.fechaVigEeccDesde = fechaVigEeccDesde;
    }

    /**
     * 
     * @return
     *     The fechaVigEeccHasta
     */
    @JsonProperty("fecha_vig_eecc_hasta")
    public String getFechaVigEeccHasta() {
        return fechaVigEeccHasta;
    }

    /**
     * 
     * @param fechaVigEeccHasta
     *     The fecha_vig_eecc_hasta
     */
    @JsonProperty("fecha_vig_eecc_hasta")
    public void setFechaVigEeccHasta(String fechaVigEeccHasta) {
        this.fechaVigEeccHasta = fechaVigEeccHasta;
    }

    /**
     * 
     * @return
     *     The marca
     */
    @JsonProperty("marca")
    public String getMarca() {
        return marca;
    }

    /**
     * 
     * @param marca
     *     The marca
     */
    @JsonProperty("marca")
    public void setMarca(String marca) {
        this.marca = marca;
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
     *     The secuenciaTarjetaS
     */
    @JsonProperty("secuencia_tarjeta_s")
    public String getSecuenciaTarjetaS() {
        return secuenciaTarjetaS;
    }

    /**
     * 
     * @param secuenciaTarjetaS
     *     The secuencia_tarjeta_s
     */
    @JsonProperty("secuencia_tarjeta_s")
    public void setSecuenciaTarjetaS(String secuenciaTarjetaS) {
        this.secuenciaTarjetaS = secuenciaTarjetaS;
    }

    /**
     * 
     * @return
     *     The nombTjtaHabiente
     */
    @JsonProperty("nomb_tjta_habiente")
    public String getNombTjtaHabiente() {
        return nombTjtaHabiente;
    }

    /**
     * 
     * @param nombTjtaHabiente
     *     The nomb_tjta_habiente
     */
    @JsonProperty("nomb_tjta_habiente")
    public void setNombTjtaHabiente(String nombTjtaHabiente) {
        this.nombTjtaHabiente = nombTjtaHabiente;
    }

    /**
     * 
     * @return
     *     The nombreEmpresa
     */
    @JsonProperty("nombre_empresa")
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    /**
     * 
     * @param nombreEmpresa
     *     The nombre_empresa
     */
    @JsonProperty("nombre_empresa")
    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    /**
     * 
     * @return
     *     The rutTarjeta
     */
    @JsonProperty("rut_tarjeta")
    public String getRutTarjeta() {
        return rutTarjeta;
    }

    /**
     * 
     * @param rutTarjeta
     *     The rut_tarjeta
     */
    @JsonProperty("rut_tarjeta")
    public void setRutTarjeta(String rutTarjeta) {
        this.rutTarjeta = rutTarjeta;
    }

    /**
     * 
     * @return
     *     The dvTarjeta
     */
    @JsonProperty("dv_tarjeta")
    public String getDvTarjeta() {
        return dvTarjeta;
    }

    /**
     * 
     * @param dvTarjeta
     *     The dv_tarjeta
     */
    @JsonProperty("dv_tarjeta")
    public void setDvTarjeta(String dvTarjeta) {
        this.dvTarjeta = dvTarjeta;
    }

    /**
     * 
     * @return
     *     The sexo
     */
    @JsonProperty("sexo")
    public String getSexo() {
        return sexo;
    }

    /**
     * 
     * @param sexo
     *     The sexo
     */
    @JsonProperty("sexo")
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * 
     * @return
     *     The estadoCivil
     */
    @JsonProperty("estado_civil")
    public String getEstadoCivil() {
        return estadoCivil;
    }

    /**
     * 
     * @param estadoCivil
     *     The estado_civil
     */
    @JsonProperty("estado_civil")
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    /**
     * 
     * @return
     *     The tipoTjta
     */
    @JsonProperty("tipo_tjta")
    public String getTipoTjta() {
        return tipoTjta;
    }

    /**
     * 
     * @param tipoTjta
     *     The tipo_tjta
     */
    @JsonProperty("tipo_tjta")
    public void setTipoTjta(String tipoTjta) {
        this.tipoTjta = tipoTjta;
    }

    /**
     * 
     * @return
     *     The estadoTjta
     */
    @JsonProperty("estado_tjta")
    public String getEstadoTjta() {
        return estadoTjta;
    }

    /**
     * 
     * @param estadoTjta
     *     The estado_tjta
     */
    @JsonProperty("estado_tjta")
    public void setEstadoTjta(String estadoTjta) {
        this.estadoTjta = estadoTjta;
    }

    /**
     * 
     * @return
     *     The fechaVctoTjta
     */
    @JsonProperty("fecha_vcto_tjta")
    public String getFechaVctoTjta() {
        return fechaVctoTjta;
    }

    /**
     * 
     * @param fechaVctoTjta
     *     The fecha_vcto_tjta
     */
    @JsonProperty("fecha_vcto_tjta")
    public void setFechaVctoTjta(String fechaVctoTjta) {
        this.fechaVctoTjta = fechaVctoTjta;
    }

    /**
     * 
     * @return
     *     The codigoBloqTjta
     */
    @JsonProperty("codigo_bloq_tjta")
    public String getCodigoBloqTjta() {
        return codigoBloqTjta;
    }

    /**
     * 
     * @param codigoBloqTjta
     *     The codigo_bloq_tjta
     */
    @JsonProperty("codigo_bloq_tjta")
    public void setCodigoBloqTjta(String codigoBloqTjta) {
        this.codigoBloqTjta = codigoBloqTjta;
    }

    /**
     * 
     * @return
     *     The fechaBloqTjta
     */
    @JsonProperty("fecha_bloq_tjta")
    public String getFechaBloqTjta() {
        return fechaBloqTjta;
    }

    /**
     * 
     * @param fechaBloqTjta
     *     The fecha_bloq_tjta
     */
    @JsonProperty("fecha_bloq_tjta")
    public void setFechaBloqTjta(String fechaBloqTjta) {
        this.fechaBloqTjta = fechaBloqTjta;
    }

    /**
     * 
     * @return
     *     The codigoAfinidad
     */
    @JsonProperty("codigo_afinidad")
    public String getCodigoAfinidad() {
        return codigoAfinidad;
    }

    /**
     * 
     * @param codigoAfinidad
     *     The codigo_afinidad
     */
    @JsonProperty("codigo_afinidad")
    public void setCodigoAfinidad(String codigoAfinidad) {
        this.codigoAfinidad = codigoAfinidad;
    }

    /**
     * 
     * @return
     *     The descAfinidad
     */
    @JsonProperty("desc_afinidad")
    public String getDescAfinidad() {
        return descAfinidad;
    }

    /**
     * 
     * @param descAfinidad
     *     The desc_afinidad
     */
    @JsonProperty("desc_afinidad")
    public void setDescAfinidad(String descAfinidad) {
        this.descAfinidad = descAfinidad;
    }

    /**
     * 
     * @return
     *     The cdgoSocio
     */
    @JsonProperty("cdgo_socio")
    public String getCdgoSocio() {
        return cdgoSocio;
    }

    /**
     * 
     * @param cdgoSocio
     *     The cdgo_socio
     */
    @JsonProperty("cdgo_socio")
    public void setCdgoSocio(String cdgoSocio) {
        this.cdgoSocio = cdgoSocio;
    }

    /**
     * 
     * @return
     *     The offset
     */
    @JsonProperty("offset")
    public String getOffset() {
        return offset;
    }

    /**
     * 
     * @param offset
     *     The offset
     */
    @JsonProperty("offset")
    public void setOffset(String offset) {
        this.offset = offset;
    }

    /**
     * 
     * @return
     *     The fechaVctoActual
     */
    @JsonProperty("fecha_vcto_actual")
    public String getFechaVctoActual() {
        return fechaVctoActual;
    }

    /**
     * 
     * @param fechaVctoActual
     *     The fecha_vcto_actual
     */
    @JsonProperty("fecha_vcto_actual")
    public void setFechaVctoActual(String fechaVctoActual) {
        this.fechaVctoActual = fechaVctoActual;
    }

    /**
     * 
     * @return
     *     The fechaVctoAnterior
     */
    @JsonProperty("fecha_vcto_anterior")
    public String getFechaVctoAnterior() {
        return fechaVctoAnterior;
    }

    /**
     * 
     * @param fechaVctoAnterior
     *     The fecha_vcto_anterior
     */
    @JsonProperty("fecha_vcto_anterior")
    public void setFechaVctoAnterior(String fechaVctoAnterior) {
        this.fechaVctoAnterior = fechaVctoAnterior;
    }

    /**
     * 
     * @return
     *     The flagActvTjtaActual
     */
    @JsonProperty("flag_actv_tjta_actual")
    public String getFlagActvTjtaActual() {
        return flagActvTjtaActual;
    }

    /**
     * 
     * @param flagActvTjtaActual
     *     The flag_actv_tjta_actual
     */
    @JsonProperty("flag_actv_tjta_actual")
    public void setFlagActvTjtaActual(String flagActvTjtaActual) {
        this.flagActvTjtaActual = flagActvTjtaActual;
    }

    /**
     * 
     * @return
     *     The flagActvTjtaAnterior
     */
    @JsonProperty("flag_actv_tjta_anterior")
    public String getFlagActvTjtaAnterior() {
        return flagActvTjtaAnterior;
    }

    /**
     * 
     * @param flagActvTjtaAnterior
     *     The flag_actv_tjta_anterior
     */
    @JsonProperty("flag_actv_tjta_anterior")
    public void setFlagActvTjtaAnterior(String flagActvTjtaAnterior) {
        this.flagActvTjtaAnterior = flagActvTjtaAnterior;
    }

    /**
     * 
     * @return
     *     The accion
     */
    @JsonProperty("accion")
    public String getAccion() {
        return accion;
    }

    /**
     * 
     * @param accion
     *     The accion
     */
    @JsonProperty("accion")
    public void setAccion(String accion) {
        this.accion = accion;
    }

    /**
     * 
     * @return
     *     The tjtasRequeridas
     */
    @JsonProperty("tjtas_requeridas")
    public String getTjtasRequeridas() {
        return tjtasRequeridas;
    }

    /**
     * 
     * @param tjtasRequeridas
     *     The tjtas_requeridas
     */
    @JsonProperty("tjtas_requeridas")
    public void setTjtasRequeridas(String tjtasRequeridas) {
        this.tjtasRequeridas = tjtasRequeridas;
    }

    /**
     * 
     * @return
     *     The fechaActivacion
     */
    @JsonProperty("fecha_activacion")
    public String getFechaActivacion() {
        return fechaActivacion;
    }

    /**
     * 
     * @param fechaActivacion
     *     The fecha_activacion
     */
    @JsonProperty("fecha_activacion")
    public void setFechaActivacion(String fechaActivacion) {
        this.fechaActivacion = fechaActivacion;
    }

    /**
     * 
     * @return
     *     The fechaApertura
     */
    @JsonProperty("fecha_apertura")
    public String getFechaApertura() {
        return fechaApertura;
    }

    /**
     * 
     * @param fechaApertura
     *     The fecha_apertura
     */
    @JsonProperty("fecha_apertura")
    public void setFechaApertura(String fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    /**
     * 
     * @return
     *     The fechaModifTjta
     */
    @JsonProperty("fecha_modif_tjta")
    public String getFechaModifTjta() {
        return fechaModifTjta;
    }

    /**
     * 
     * @param fechaModifTjta
     *     The fecha_modif_tjta
     */
    @JsonProperty("fecha_modif_tjta")
    public void setFechaModifTjta(String fechaModifTjta) {
        this.fechaModifTjta = fechaModifTjta;
    }

    /**
     * 
     * @return
     *     The memberSince
     */
    @JsonProperty("member_since")
    public String getMemberSince() {
        return memberSince;
    }

    /**
     * 
     * @param memberSince
     *     The member_since
     */
    @JsonProperty("member_since")
    public void setMemberSince(String memberSince) {
        this.memberSince = memberSince;
    }

    /**
     * 
     * @return
     *     The cupoComprasNacTjta
     */
    @JsonProperty("cupo_compras_nac_tjta")
    public String getCupoComprasNacTjta() {
        return cupoComprasNacTjta;
    }

    /**
     * 
     * @param cupoComprasNacTjta
     *     The cupo_compras_nac_tjta
     */
    @JsonProperty("cupo_compras_nac_tjta")
    public void setCupoComprasNacTjta(String cupoComprasNacTjta) {
        this.cupoComprasNacTjta = cupoComprasNacTjta;
    }

    /**
     * 
     * @return
     *     The cupoComprasIntTjta
     */
    @JsonProperty("cupo_compras_int_tjta")
    public String getCupoComprasIntTjta() {
        return cupoComprasIntTjta;
    }

    /**
     * 
     * @param cupoComprasIntTjta
     *     The cupo_compras_int_tjta
     */
    @JsonProperty("cupo_compras_int_tjta")
    public void setCupoComprasIntTjta(String cupoComprasIntTjta) {
        this.cupoComprasIntTjta = cupoComprasIntTjta;
    }

    /**
     * 
     * @return
     *     The cupoAvcesNacTjta
     */
    @JsonProperty("cupo_avces_nac_tjta")
    public String getCupoAvcesNacTjta() {
        return cupoAvcesNacTjta;
    }

    /**
     * 
     * @param cupoAvcesNacTjta
     *     The cupo_avces_nac_tjta
     */
    @JsonProperty("cupo_avces_nac_tjta")
    public void setCupoAvcesNacTjta(String cupoAvcesNacTjta) {
        this.cupoAvcesNacTjta = cupoAvcesNacTjta;
    }

    /**
     * 
     * @return
     *     The cupoAvcesIntTjta
     */
    @JsonProperty("cupo_avces_int_tjta")
    public String getCupoAvcesIntTjta() {
        return cupoAvcesIntTjta;
    }

    /**
     * 
     * @param cupoAvcesIntTjta
     *     The cupo_avces_int_tjta
     */
    @JsonProperty("cupo_avces_int_tjta")
    public void setCupoAvcesIntTjta(String cupoAvcesIntTjta) {
        this.cupoAvcesIntTjta = cupoAvcesIntTjta;
    }

    /**
     * 
     * @return
     *     The cupoLinea2Tjta
     */
    @JsonProperty("cupo_linea2_tjta")
    public String getCupoLinea2Tjta() {
        return cupoLinea2Tjta;
    }

    /**
     * 
     * @param cupoLinea2Tjta
     *     The cupo_linea2_tjta
     */
    @JsonProperty("cupo_linea2_tjta")
    public void setCupoLinea2Tjta(String cupoLinea2Tjta) {
        this.cupoLinea2Tjta = cupoLinea2Tjta;
    }

    /**
     * 
     * @return
     *     The deudaComprasNacTjta
     */
    @JsonProperty("deuda_compras_nac_tjta")
    public String getDeudaComprasNacTjta() {
        return deudaComprasNacTjta;
    }

    /**
     * 
     * @param deudaComprasNacTjta
     *     The deuda_compras_nac_tjta
     */
    @JsonProperty("deuda_compras_nac_tjta")
    public void setDeudaComprasNacTjta(String deudaComprasNacTjta) {
        this.deudaComprasNacTjta = deudaComprasNacTjta;
    }

    /**
     * 
     * @return
     *     The deudaComprasIntTjta
     */
    @JsonProperty("deuda_compras_int_tjta")
    public String getDeudaComprasIntTjta() {
        return deudaComprasIntTjta;
    }

    /**
     * 
     * @param deudaComprasIntTjta
     *     The deuda_compras_int_tjta
     */
    @JsonProperty("deuda_compras_int_tjta")
    public void setDeudaComprasIntTjta(String deudaComprasIntTjta) {
        this.deudaComprasIntTjta = deudaComprasIntTjta;
    }

    /**
     * 
     * @return
     *     The deudaAvcesNacTjta
     */
    @JsonProperty("deuda_avces_nac_tjta")
    public String getDeudaAvcesNacTjta() {
        return deudaAvcesNacTjta;
    }

    /**
     * 
     * @param deudaAvcesNacTjta
     *     The deuda_avces_nac_tjta
     */
    @JsonProperty("deuda_avces_nac_tjta")
    public void setDeudaAvcesNacTjta(String deudaAvcesNacTjta) {
        this.deudaAvcesNacTjta = deudaAvcesNacTjta;
    }

    /**
     * 
     * @return
     *     The deudaAvcesIntTjta
     */
    @JsonProperty("deuda_avces_int_tjta")
    public String getDeudaAvcesIntTjta() {
        return deudaAvcesIntTjta;
    }

    /**
     * 
     * @param deudaAvcesIntTjta
     *     The deuda_avces_int_tjta
     */
    @JsonProperty("deuda_avces_int_tjta")
    public void setDeudaAvcesIntTjta(String deudaAvcesIntTjta) {
        this.deudaAvcesIntTjta = deudaAvcesIntTjta;
    }

    /**
     * 
     * @return
     *     The deudaL2Tjta
     */
    @JsonProperty("deuda_l2_tjta")
    public String getDeudaL2Tjta() {
        return deudaL2Tjta;
    }

    /**
     * 
     * @param deudaL2Tjta
     *     The deuda_l2_tjta
     */
    @JsonProperty("deuda_l2_tjta")
    public void setDeudaL2Tjta(String deudaL2Tjta) {
        this.deudaL2Tjta = deudaL2Tjta;
    }

    /**
     * 
     * @return
     *     The dispCompNacTjta
     */
    @JsonProperty("disp_comp_nac_tjta")
    public String getDispCompNacTjta() {
        return dispCompNacTjta;
    }

    /**
     * 
     * @param dispCompNacTjta
     *     The disp_comp_nac_tjta
     */
    @JsonProperty("disp_comp_nac_tjta")
    public void setDispCompNacTjta(String dispCompNacTjta) {
        this.dispCompNacTjta = dispCompNacTjta;
    }

    /**
     * 
     * @return
     *     The dispCompIntTjta
     */
    @JsonProperty("disp_comp_int_tjta")
    public String getDispCompIntTjta() {
        return dispCompIntTjta;
    }

    /**
     * 
     * @param dispCompIntTjta
     *     The disp_comp_int_tjta
     */
    @JsonProperty("disp_comp_int_tjta")
    public void setDispCompIntTjta(String dispCompIntTjta) {
        this.dispCompIntTjta = dispCompIntTjta;
    }

    /**
     * 
     * @return
     *     The dispAvcesNacTjta
     */
    @JsonProperty("disp_avces_nac_tjta")
    public String getDispAvcesNacTjta() {
        return dispAvcesNacTjta;
    }

    /**
     * 
     * @param dispAvcesNacTjta
     *     The disp_avces_nac_tjta
     */
    @JsonProperty("disp_avces_nac_tjta")
    public void setDispAvcesNacTjta(String dispAvcesNacTjta) {
        this.dispAvcesNacTjta = dispAvcesNacTjta;
    }

    /**
     * 
     * @return
     *     The dispAvcesIntTjta
     */
    @JsonProperty("disp_avces_int_tjta")
    public String getDispAvcesIntTjta() {
        return dispAvcesIntTjta;
    }

    /**
     * 
     * @param dispAvcesIntTjta
     *     The disp_avces_int_tjta
     */
    @JsonProperty("disp_avces_int_tjta")
    public void setDispAvcesIntTjta(String dispAvcesIntTjta) {
        this.dispAvcesIntTjta = dispAvcesIntTjta;
    }

    /**
     * 
     * @return
     *     The dispL2Tjta
     */
    @JsonProperty("disp_l2_tjta")
    public String getDispL2Tjta() {
        return dispL2Tjta;
    }

    /**
     * 
     * @param dispL2Tjta
     *     The disp_l2_tjta
     */
    @JsonProperty("disp_l2_tjta")
    public void setDispL2Tjta(String dispL2Tjta) {
        this.dispL2Tjta = dispL2Tjta;
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
     *     The filler05
     */
    @JsonProperty("filler_05")
    public String getFiller05() {
        return filler05;
    }

    /**
     * 
     * @param filler05
     *     The filler_05
     */
    @JsonProperty("filler_05")
    public void setFiller05(String filler05) {
        this.filler05 = filler05;
    }

    /**
     * 
     * @return
     *     The nroRelacion2
     */
    @JsonProperty("nro_relacion2")
    public String getNroRelacion2() {
        return nroRelacion2;
    }

    /**
     * 
     * @param nroRelacion2
     *     The nro_relacion2
     */
    @JsonProperty("nro_relacion2")
    public void setNroRelacion2(String nroRelacion2) {
        this.nroRelacion2 = nroRelacion2;
    }

    /**
     * 
     * @return
     *     The statusRelacion
     */
    @JsonProperty("status_relacion")
    public String getStatusRelacion() {
        return statusRelacion;
    }

    /**
     * 
     * @param statusRelacion
     *     The status_relacion
     */
    @JsonProperty("status_relacion")
    public void setStatusRelacion(String statusRelacion) {
        this.statusRelacion = statusRelacion;
    }

    /**
     * 
     * @return
     *     The numeroCliente
     */
    @JsonProperty("numero_cliente")
    public String getNumeroCliente() {
        return numeroCliente;
    }

    /**
     * 
     * @param numeroCliente
     *     The numero_cliente
     */
    @JsonProperty("numero_cliente")
    public void setNumeroCliente(String numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    /**
     * 
     * @return
     *     The cantidadSubCuentas
     */
    @JsonProperty("cantidad_sub_cuentas")
    public String getCantidadSubCuentas() {
        return cantidadSubCuentas;
    }

    /**
     * 
     * @param cantidadSubCuentas
     *     The cantidad_sub_cuentas
     */
    @JsonProperty("cantidad_sub_cuentas")
    public void setCantidadSubCuentas(String cantidadSubCuentas) {
        this.cantidadSubCuentas = cantidadSubCuentas;
    }

    /**
     * 
     * @return
     *     The codigoBloqueoRel
     */
    @JsonProperty("codigo_bloqueo_rel")
    public String getCodigoBloqueoRel() {
        return codigoBloqueoRel;
    }

    /**
     * 
     * @param codigoBloqueoRel
     *     The codigo_bloqueo_rel
     */
    @JsonProperty("codigo_bloqueo_rel")
    public void setCodigoBloqueoRel(String codigoBloqueoRel) {
        this.codigoBloqueoRel = codigoBloqueoRel;
    }

    /**
     * 
     * @return
     *     The nombreRel
     */
    @JsonProperty("nombre_rel")
    public String getNombreRel() {
        return nombreRel;
    }

    /**
     * 
     * @param nombreRel
     *     The nombre_rel
     */
    @JsonProperty("nombre_rel")
    public void setNombreRel(String nombreRel) {
        this.nombreRel = nombreRel;
    }

    /**
     * 
     * @return
     *     The direccionRelacion
     */
    @JsonProperty("direccion_relacion")
    public String getDireccionRelacion() {
        return direccionRelacion;
    }

    /**
     * 
     * @param direccionRelacion
     *     The direccion_relacion
     */
    @JsonProperty("direccion_relacion")
    public void setDireccionRelacion(String direccionRelacion) {
        this.direccionRelacion = direccionRelacion;
    }

    /**
     * 
     * @return
     *     The comunaRelacion
     */
    @JsonProperty("comuna_relacion")
    public String getComunaRelacion() {
        return comunaRelacion;
    }

    /**
     * 
     * @param comunaRelacion
     *     The comuna_relacion
     */
    @JsonProperty("comuna_relacion")
    public void setComunaRelacion(String comunaRelacion) {
        this.comunaRelacion = comunaRelacion;
    }

    /**
     * 
     * @return
     *     The codigoComunaRelacion
     */
    @JsonProperty("codigo_comuna_relacion")
    public String getCodigoComunaRelacion() {
        return codigoComunaRelacion;
    }

    /**
     * 
     * @param codigoComunaRelacion
     *     The codigo_comuna_relacion
     */
    @JsonProperty("codigo_comuna_relacion")
    public void setCodigoComunaRelacion(String codigoComunaRelacion) {
        this.codigoComunaRelacion = codigoComunaRelacion;
    }

    /**
     * 
     * @return
     *     The ciudadRelacion
     */
    @JsonProperty("ciudad_relacion")
    public String getCiudadRelacion() {
        return ciudadRelacion;
    }

    /**
     * 
     * @param ciudadRelacion
     *     The ciudad_relacion
     */
    @JsonProperty("ciudad_relacion")
    public void setCiudadRelacion(String ciudadRelacion) {
        this.ciudadRelacion = ciudadRelacion;
    }

    /**
     * 
     * @return
     *     The regionRelacion
     */
    @JsonProperty("region_relacion")
    public String getRegionRelacion() {
        return regionRelacion;
    }

    /**
     * 
     * @param regionRelacion
     *     The region_relacion
     */
    @JsonProperty("region_relacion")
    public void setRegionRelacion(String regionRelacion) {
        this.regionRelacion = regionRelacion;
    }

    /**
     * 
     * @return
     *     The fonoRelacion
     */
    @JsonProperty("fono_relacion")
    public String getFonoRelacion() {
        return fonoRelacion;
    }

    /**
     * 
     * @param fonoRelacion
     *     The fono_relacion
     */
    @JsonProperty("fono_relacion")
    public void setFonoRelacion(String fonoRelacion) {
        this.fonoRelacion = fonoRelacion;
    }

    /**
     * 
     * @return
     *     The cupoNacRelacion
     */
    @JsonProperty("cupo_nac_relacion")
    public String getCupoNacRelacion() {
        return cupoNacRelacion;
    }

    /**
     * 
     * @param cupoNacRelacion
     *     The cupo_nac_relacion
     */
    @JsonProperty("cupo_nac_relacion")
    public void setCupoNacRelacion(String cupoNacRelacion) {
        this.cupoNacRelacion = cupoNacRelacion;
    }

    /**
     * 
     * @return
     *     The cupoIntRelacion
     */
    @JsonProperty("cupo_int_relacion")
    public String getCupoIntRelacion() {
        return cupoIntRelacion;
    }

    /**
     * 
     * @param cupoIntRelacion
     *     The cupo_int_relacion
     */
    @JsonProperty("cupo_int_relacion")
    public void setCupoIntRelacion(String cupoIntRelacion) {
        this.cupoIntRelacion = cupoIntRelacion;
    }

    /**
     * 
     * @return
     *     The cicloFactRelacion
     */
    @JsonProperty("ciclo_fact_relacion")
    public String getCicloFactRelacion() {
        return cicloFactRelacion;
    }

    /**
     * 
     * @param cicloFactRelacion
     *     The ciclo_fact_relacion
     */
    @JsonProperty("ciclo_fact_relacion")
    public void setCicloFactRelacion(String cicloFactRelacion) {
        this.cicloFactRelacion = cicloFactRelacion;
    }

    /**
     * 
     * @return
     *     The codigoFvRelacion
     */
    @JsonProperty("codigo_fv_relacion")
    public String getCodigoFvRelacion() {
        return codigoFvRelacion;
    }

    /**
     * 
     * @param codigoFvRelacion
     *     The codigo_fv_relacion
     */
    @JsonProperty("codigo_fv_relacion")
    public void setCodigoFvRelacion(String codigoFvRelacion) {
        this.codigoFvRelacion = codigoFvRelacion;
    }

    /**
     * 
     * @return
     *     The cuentaPrimaria
     */
    @JsonProperty("cuenta_primaria")
    public String getCuentaPrimaria() {
        return cuentaPrimaria;
    }

    /**
     * 
     * @param cuentaPrimaria
     *     The cuenta_primaria
     */
    @JsonProperty("cuenta_primaria")
    public void setCuentaPrimaria(String cuentaPrimaria) {
        this.cuentaPrimaria = cuentaPrimaria;
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
     *     The filler06
     */
    @JsonProperty("filler_06")
    public String getFiller06() {
        return filler06;
    }

    /**
     * 
     * @param filler06
     *     The filler_06
     */
    @JsonProperty("filler_06")
    public void setFiller06(String filler06) {
        this.filler06 = filler06;
    }

    /**
     * 
     * @return
     *     The nroCuentaAut
     */
    @JsonProperty("nro_cuenta_aut")
    public String getNroCuentaAut() {
        return nroCuentaAut;
    }

    /**
     * 
     * @param nroCuentaAut
     *     The nro_cuenta_aut
     */
    @JsonProperty("nro_cuenta_aut")
    public void setNroCuentaAut(String nroCuentaAut) {
        this.nroCuentaAut = nroCuentaAut;
    }

    /**
     * 
     * @return
     *     The statusCtaAut
     */
    @JsonProperty("status_cta_aut")
    public String getStatusCtaAut() {
        return statusCtaAut;
    }

    /**
     * 
     * @param statusCtaAut
     *     The status_cta_aut
     */
    @JsonProperty("status_cta_aut")
    public void setStatusCtaAut(String statusCtaAut) {
        this.statusCtaAut = statusCtaAut;
    }

    /**
     * 
     * @return
     *     The status2CtaAut
     */
    @JsonProperty("status2_cta_aut")
    public String getStatus2CtaAut() {
        return status2CtaAut;
    }

    /**
     * 
     * @param status2CtaAut
     *     The status2_cta_aut
     */
    @JsonProperty("status2_cta_aut")
    public void setStatus2CtaAut(String status2CtaAut) {
        this.status2CtaAut = status2CtaAut;
    }

    /**
     * 
     * @return
     *     The cupoCompNacCtaAut
     */
    @JsonProperty("cupo_comp_nac_cta_aut")
    public String getCupoCompNacCtaAut() {
        return cupoCompNacCtaAut;
    }

    /**
     * 
     * @param cupoCompNacCtaAut
     *     The cupo_comp_nac_cta_aut
     */
    @JsonProperty("cupo_comp_nac_cta_aut")
    public void setCupoCompNacCtaAut(String cupoCompNacCtaAut) {
        this.cupoCompNacCtaAut = cupoCompNacCtaAut;
    }

    /**
     * 
     * @return
     *     The cupoCompIntCtaAut
     */
    @JsonProperty("cupo_comp_int_cta_aut")
    public String getCupoCompIntCtaAut() {
        return cupoCompIntCtaAut;
    }

    /**
     * 
     * @param cupoCompIntCtaAut
     *     The cupo_comp_int_cta_aut
     */
    @JsonProperty("cupo_comp_int_cta_aut")
    public void setCupoCompIntCtaAut(String cupoCompIntCtaAut) {
        this.cupoCompIntCtaAut = cupoCompIntCtaAut;
    }

    /**
     * 
     * @return
     *     The cupoAvceNacCtaAut
     */
    @JsonProperty("cupo_avce_nac_cta_aut")
    public String getCupoAvceNacCtaAut() {
        return cupoAvceNacCtaAut;
    }

    /**
     * 
     * @param cupoAvceNacCtaAut
     *     The cupo_avce_nac_cta_aut
     */
    @JsonProperty("cupo_avce_nac_cta_aut")
    public void setCupoAvceNacCtaAut(String cupoAvceNacCtaAut) {
        this.cupoAvceNacCtaAut = cupoAvceNacCtaAut;
    }

    /**
     * 
     * @return
     *     The cupoAvceIntCtaAut
     */
    @JsonProperty("cupo_avce_int_cta_aut")
    public String getCupoAvceIntCtaAut() {
        return cupoAvceIntCtaAut;
    }

    /**
     * 
     * @param cupoAvceIntCtaAut
     *     The cupo_avce_int_cta_aut
     */
    @JsonProperty("cupo_avce_int_cta_aut")
    public void setCupoAvceIntCtaAut(String cupoAvceIntCtaAut) {
        this.cupoAvceIntCtaAut = cupoAvceIntCtaAut;
    }

    /**
     * 
     * @return
     *     The cupoL2CtaAut
     */
    @JsonProperty("cupo_l2_cta_aut")
    public String getCupoL2CtaAut() {
        return cupoL2CtaAut;
    }

    /**
     * 
     * @param cupoL2CtaAut
     *     The cupo_l2_cta_aut
     */
    @JsonProperty("cupo_l2_cta_aut")
    public void setCupoL2CtaAut(String cupoL2CtaAut) {
        this.cupoL2CtaAut = cupoL2CtaAut;
    }

    /**
     * 
     * @return
     *     The deudaCompNacCtaAut
     */
    @JsonProperty("deuda_comp_nac_cta_aut")
    public String getDeudaCompNacCtaAut() {
        return deudaCompNacCtaAut;
    }

    /**
     * 
     * @param deudaCompNacCtaAut
     *     The deuda_comp_nac_cta_aut
     */
    @JsonProperty("deuda_comp_nac_cta_aut")
    public void setDeudaCompNacCtaAut(String deudaCompNacCtaAut) {
        this.deudaCompNacCtaAut = deudaCompNacCtaAut;
    }

    /**
     * 
     * @return
     *     The deudaCompIntCtaAut
     */
    @JsonProperty("deuda_comp_int_cta_aut")
    public String getDeudaCompIntCtaAut() {
        return deudaCompIntCtaAut;
    }

    /**
     * 
     * @param deudaCompIntCtaAut
     *     The deuda_comp_int_cta_aut
     */
    @JsonProperty("deuda_comp_int_cta_aut")
    public void setDeudaCompIntCtaAut(String deudaCompIntCtaAut) {
        this.deudaCompIntCtaAut = deudaCompIntCtaAut;
    }

    /**
     * 
     * @return
     *     The deudaAvceNacCtaAut
     */
    @JsonProperty("deuda_avce_nac_cta_aut")
    public String getDeudaAvceNacCtaAut() {
        return deudaAvceNacCtaAut;
    }

    /**
     * 
     * @param deudaAvceNacCtaAut
     *     The deuda_avce_nac_cta_aut
     */
    @JsonProperty("deuda_avce_nac_cta_aut")
    public void setDeudaAvceNacCtaAut(String deudaAvceNacCtaAut) {
        this.deudaAvceNacCtaAut = deudaAvceNacCtaAut;
    }

    /**
     * 
     * @return
     *     The deudaAvceIntCtaAut
     */
    @JsonProperty("deuda_avce_int_cta_aut")
    public String getDeudaAvceIntCtaAut() {
        return deudaAvceIntCtaAut;
    }

    /**
     * 
     * @param deudaAvceIntCtaAut
     *     The deuda_avce_int_cta_aut
     */
    @JsonProperty("deuda_avce_int_cta_aut")
    public void setDeudaAvceIntCtaAut(String deudaAvceIntCtaAut) {
        this.deudaAvceIntCtaAut = deudaAvceIntCtaAut;
    }

    /**
     * 
     * @return
     *     The deudaL2CtaAut
     */
    @JsonProperty("deuda_l2_cta_aut")
    public String getDeudaL2CtaAut() {
        return deudaL2CtaAut;
    }

    /**
     * 
     * @param deudaL2CtaAut
     *     The deuda_l2_cta_aut
     */
    @JsonProperty("deuda_l2_cta_aut")
    public void setDeudaL2CtaAut(String deudaL2CtaAut) {
        this.deudaL2CtaAut = deudaL2CtaAut;
    }

    /**
     * 
     * @return
     *     The dispCompNacCtaAut
     */
    @JsonProperty("disp_comp_nac_cta_aut")
    public String getDispCompNacCtaAut() {
        return dispCompNacCtaAut;
    }

    /**
     * 
     * @param dispCompNacCtaAut
     *     The disp_comp_nac_cta_aut
     */
    @JsonProperty("disp_comp_nac_cta_aut")
    public void setDispCompNacCtaAut(String dispCompNacCtaAut) {
        this.dispCompNacCtaAut = dispCompNacCtaAut;
    }

    /**
     * 
     * @return
     *     The dispCompIntCtaAut
     */
    @JsonProperty("disp_comp_int_cta_aut")
    public String getDispCompIntCtaAut() {
        return dispCompIntCtaAut;
    }

    /**
     * 
     * @param dispCompIntCtaAut
     *     The disp_comp_int_cta_aut
     */
    @JsonProperty("disp_comp_int_cta_aut")
    public void setDispCompIntCtaAut(String dispCompIntCtaAut) {
        this.dispCompIntCtaAut = dispCompIntCtaAut;
    }

    /**
     * 
     * @return
     *     The dispAvceNacCtaAut
     */
    @JsonProperty("disp_avce_nac_cta_aut")
    public String getDispAvceNacCtaAut() {
        return dispAvceNacCtaAut;
    }

    /**
     * 
     * @param dispAvceNacCtaAut
     *     The disp_avce_nac_cta_aut
     */
    @JsonProperty("disp_avce_nac_cta_aut")
    public void setDispAvceNacCtaAut(String dispAvceNacCtaAut) {
        this.dispAvceNacCtaAut = dispAvceNacCtaAut;
    }

    /**
     * 
     * @return
     *     The dispAvceIntCtaAut
     */
    @JsonProperty("disp_avce_int_cta_aut")
    public String getDispAvceIntCtaAut() {
        return dispAvceIntCtaAut;
    }

    /**
     * 
     * @param dispAvceIntCtaAut
     *     The disp_avce_int_cta_aut
     */
    @JsonProperty("disp_avce_int_cta_aut")
    public void setDispAvceIntCtaAut(String dispAvceIntCtaAut) {
        this.dispAvceIntCtaAut = dispAvceIntCtaAut;
    }

    /**
     * 
     * @return
     *     The dispL2CtaAut
     */
    @JsonProperty("disp_l2_cta_aut")
    public String getDispL2CtaAut() {
        return dispL2CtaAut;
    }

    /**
     * 
     * @param dispL2CtaAut
     *     The disp_l2_cta_aut
     */
    @JsonProperty("disp_l2_cta_aut")
    public void setDispL2CtaAut(String dispL2CtaAut) {
        this.dispL2CtaAut = dispL2CtaAut;
    }

    /**
     * 
     * @return
     *     The dispFlotCuotasL2CtaAut
     */
    @JsonProperty("disp_flot_cuotas_l2_cta_aut")
    public String getDispFlotCuotasL2CtaAut() {
        return dispFlotCuotasL2CtaAut;
    }

    /**
     * 
     * @param dispFlotCuotasL2CtaAut
     *     The disp_flot_cuotas_l2_cta_aut
     */
    @JsonProperty("disp_flot_cuotas_l2_cta_aut")
    public void setDispFlotCuotasL2CtaAut(String dispFlotCuotasL2CtaAut) {
        this.dispFlotCuotasL2CtaAut = dispFlotCuotasL2CtaAut;
    }

    /**
     * 
     * @return
     *     The dispFlotAvceL2CtaAut
     */
    @JsonProperty("disp_flot_avce_l2_cta_aut")
    public String getDispFlotAvceL2CtaAut() {
        return dispFlotAvceL2CtaAut;
    }

    /**
     * 
     * @param dispFlotAvceL2CtaAut
     *     The disp_flot_avce_l2_cta_aut
     */
    @JsonProperty("disp_flot_avce_l2_cta_aut")
    public void setDispFlotAvceL2CtaAut(String dispFlotAvceL2CtaAut) {
        this.dispFlotAvceL2CtaAut = dispFlotAvceL2CtaAut;
    }

    /**
     * 
     * @return
     *     The dispFlotAvceCuotaL1L2Cta
     */
    @JsonProperty("disp_flot_avce_cuota_l1_l2_cta")
    public String getDispFlotAvceCuotaL1L2Cta() {
        return dispFlotAvceCuotaL1L2Cta;
    }

    /**
     * 
     * @param dispFlotAvceCuotaL1L2Cta
     *     The disp_flot_avce_cuota_l1_l2_cta
     */
    @JsonProperty("disp_flot_avce_cuota_l1_l2_cta")
    public void setDispFlotAvceCuotaL1L2Cta(String dispFlotAvceCuotaL1L2Cta) {
        this.dispFlotAvceCuotaL1L2Cta = dispFlotAvceCuotaL1L2Cta;
    }

    /**
     * 
     * @return
     *     The autPendPesosL1CtaAut
     */
    @JsonProperty("aut_pend_pesos_l1_cta_aut")
    public String getAutPendPesosL1CtaAut() {
        return autPendPesosL1CtaAut;
    }

    /**
     * 
     * @param autPendPesosL1CtaAut
     *     The aut_pend_pesos_l1_cta_aut
     */
    @JsonProperty("aut_pend_pesos_l1_cta_aut")
    public void setAutPendPesosL1CtaAut(String autPendPesosL1CtaAut) {
        this.autPendPesosL1CtaAut = autPendPesosL1CtaAut;
    }

    /**
     * 
     * @return
     *     The autPendDolarL1CtaAut
     */
    @JsonProperty("aut_pend_dolar_l1_cta_aut")
    public String getAutPendDolarL1CtaAut() {
        return autPendDolarL1CtaAut;
    }

    /**
     * 
     * @param autPendDolarL1CtaAut
     *     The aut_pend_dolar_l1_cta_aut
     */
    @JsonProperty("aut_pend_dolar_l1_cta_aut")
    public void setAutPendDolarL1CtaAut(String autPendDolarL1CtaAut) {
        this.autPendDolarL1CtaAut = autPendDolarL1CtaAut;
    }

    /**
     * 
     * @return
     *     The autPendL2CtaAut
     */
    @JsonProperty("aut_pend_l2_cta_aut")
    public String getAutPendL2CtaAut() {
        return autPendL2CtaAut;
    }

    /**
     * 
     * @param autPendL2CtaAut
     *     The aut_pend_l2_cta_aut
     */
    @JsonProperty("aut_pend_l2_cta_aut")
    public void setAutPendL2CtaAut(String autPendL2CtaAut) {
        this.autPendL2CtaAut = autPendL2CtaAut;
    }

    /**
     * 
     * @return
     *     The deudaTotPesoCtaAut
     */
    @JsonProperty("deuda_tot_peso_cta_aut")
    public String getDeudaTotPesoCtaAut() {
        return deudaTotPesoCtaAut;
    }

    /**
     * 
     * @param deudaTotPesoCtaAut
     *     The deuda_tot_peso_cta_aut
     */
    @JsonProperty("deuda_tot_peso_cta_aut")
    public void setDeudaTotPesoCtaAut(String deudaTotPesoCtaAut) {
        this.deudaTotPesoCtaAut = deudaTotPesoCtaAut;
    }

    /**
     * 
     * @return
     *     The deudaTotDolarCtaAut
     */
    @JsonProperty("deuda_tot_dolar_cta_aut")
    public String getDeudaTotDolarCtaAut() {
        return deudaTotDolarCtaAut;
    }

    /**
     * 
     * @param deudaTotDolarCtaAut
     *     The deuda_tot_dolar_cta_aut
     */
    @JsonProperty("deuda_tot_dolar_cta_aut")
    public void setDeudaTotDolarCtaAut(String deudaTotDolarCtaAut) {
        this.deudaTotDolarCtaAut = deudaTotDolarCtaAut;
    }

    /**
     * 
     * @return
     *     The pagoMinCtaAut
     */
    @JsonProperty("pago_min_cta_aut")
    public String getPagoMinCtaAut() {
        return pagoMinCtaAut;
    }

    /**
     * 
     * @param pagoMinCtaAut
     *     The pago_min_cta_aut
     */
    @JsonProperty("pago_min_cta_aut")
    public void setPagoMinCtaAut(String pagoMinCtaAut) {
        this.pagoMinCtaAut = pagoMinCtaAut;
    }

    /**
     * 
     * @return
     *     The tasa1CtaAut
     */
    @JsonProperty("tasa_1_cta_aut")
    public String getTasa1CtaAut() {
        return tasa1CtaAut;
    }

    /**
     * 
     * @param tasa1CtaAut
     *     The tasa_1_cta_aut
     */
    @JsonProperty("tasa_1_cta_aut")
    public void setTasa1CtaAut(String tasa1CtaAut) {
        this.tasa1CtaAut = tasa1CtaAut;
    }

    /**
     * 
     * @return
     *     The tasa2CtaAut
     */
    @JsonProperty("tasa_2_cta_aut")
    public String getTasa2CtaAut() {
        return tasa2CtaAut;
    }

    /**
     * 
     * @param tasa2CtaAut
     *     The tasa_2_cta_aut
     */
    @JsonProperty("tasa_2_cta_aut")
    public void setTasa2CtaAut(String tasa2CtaAut) {
        this.tasa2CtaAut = tasa2CtaAut;
    }

    /**
     * 
     * @return
     *     The flagCuotaFijaCtaAut
     */
    @JsonProperty("flag_cuota_fija_cta_aut")
    public String getFlagCuotaFijaCtaAut() {
        return flagCuotaFijaCtaAut;
    }

    /**
     * 
     * @param flagCuotaFijaCtaAut
     *     The flag_cuota_fija_cta_aut
     */
    @JsonProperty("flag_cuota_fija_cta_aut")
    public void setFlagCuotaFijaCtaAut(String flagCuotaFijaCtaAut) {
        this.flagCuotaFijaCtaAut = flagCuotaFijaCtaAut;
    }

    /**
     * 
     * @return
     *     The flagAvceCuotaCtaAut
     */
    @JsonProperty("flag_avce_cuota_cta_aut")
    public String getFlagAvceCuotaCtaAut() {
        return flagAvceCuotaCtaAut;
    }

    /**
     * 
     * @param flagAvceCuotaCtaAut
     *     The flag_avce_cuota_cta_aut
     */
    @JsonProperty("flag_avce_cuota_cta_aut")
    public void setFlagAvceCuotaCtaAut(String flagAvceCuotaCtaAut) {
        this.flagAvceCuotaCtaAut = flagAvceCuotaCtaAut;
    }

    /**
     * 
     * @return
     *     The flagNcuotaCtaAut
     */
    @JsonProperty("flag_ncuota_cta_aut")
    public String getFlagNcuotaCtaAut() {
        return flagNcuotaCtaAut;
    }

    /**
     * 
     * @param flagNcuotaCtaAut
     *     The flag_ncuota_cta_aut
     */
    @JsonProperty("flag_ncuota_cta_aut")
    public void setFlagNcuotaCtaAut(String flagNcuotaCtaAut) {
        this.flagNcuotaCtaAut = flagNcuotaCtaAut;
    }

    /**
     * 
     * @return
     *     The flag3cpcCtaAut
     */
    @JsonProperty("flag_3cpc_cta_aut")
    public String getFlag3cpcCtaAut() {
        return flag3cpcCtaAut;
    }

    /**
     * 
     * @param flag3cpcCtaAut
     *     The flag_3cpc_cta_aut
     */
    @JsonProperty("flag_3cpc_cta_aut")
    public void setFlag3cpcCtaAut(String flag3cpcCtaAut) {
        this.flag3cpcCtaAut = flag3cpcCtaAut;
    }

    /**
     * 
     * @return
     *     The flagCompNormalCtaAut
     */
    @JsonProperty("flag_comp_normal_cta_aut")
    public String getFlagCompNormalCtaAut() {
        return flagCompNormalCtaAut;
    }

    /**
     * 
     * @param flagCompNormalCtaAut
     *     The flag_comp_normal_cta_aut
     */
    @JsonProperty("flag_comp_normal_cta_aut")
    public void setFlagCompNormalCtaAut(String flagCompNormalCtaAut) {
        this.flagCompNormalCtaAut = flagCompNormalCtaAut;
    }

    /**
     * 
     * @return
     *     The flagAvceEfectivoCtaAut
     */
    @JsonProperty("flag_avce_efectivo_cta_aut")
    public String getFlagAvceEfectivoCtaAut() {
        return flagAvceEfectivoCtaAut;
    }

    /**
     * 
     * @param flagAvceEfectivoCtaAut
     *     The flag_avce_efectivo_cta_aut
     */
    @JsonProperty("flag_avce_efectivo_cta_aut")
    public void setFlagAvceEfectivoCtaAut(String flagAvceEfectivoCtaAut) {
        this.flagAvceEfectivoCtaAut = flagAvceEfectivoCtaAut;
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
     *     The monto8
     */
    @JsonProperty("monto8")
    public String getMonto8() {
        return monto8;
    }

    /**
     * 
     * @param monto8
     *     The monto8
     */
    @JsonProperty("monto8")
    public void setMonto8(String monto8) {
        this.monto8 = monto8;
    }

    /**
     * 
     * @return
     *     The monto9
     */
    @JsonProperty("monto9")
    public String getMonto9() {
        return monto9;
    }

    /**
     * 
     * @param monto9
     *     The monto9
     */
    @JsonProperty("monto9")
    public void setMonto9(String monto9) {
        this.monto9 = monto9;
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
     *     The numero8
     */
    @JsonProperty("numero8")
    public String getNumero8() {
        return numero8;
    }

    /**
     * 
     * @param numero8
     *     The numero8
     */
    @JsonProperty("numero8")
    public void setNumero8(String numero8) {
        this.numero8 = numero8;
    }

    /**
     * 
     * @return
     *     The numero9
     */
    @JsonProperty("numero9")
    public String getNumero9() {
        return numero9;
    }

    /**
     * 
     * @param numero9
     *     The numero9
     */
    @JsonProperty("numero9")
    public void setNumero9(String numero9) {
        this.numero9 = numero9;
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
     *     The flag8
     */
    @JsonProperty("flag8")
    public String getFlag8() {
        return flag8;
    }

    /**
     * 
     * @param flag8
     *     The flag8
     */
    @JsonProperty("flag8")
    public void setFlag8(String flag8) {
        this.flag8 = flag8;
    }

    /**
     * 
     * @return
     *     The flag9
     */
    @JsonProperty("flag9")
    public String getFlag9() {
        return flag9;
    }

    /**
     * 
     * @param flag9
     *     The flag9
     */
    @JsonProperty("flag9")
    public void setFlag9(String flag9) {
        this.flag9 = flag9;
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
     *     The string8
     */
    @JsonProperty("string8")
    public String getString8() {
        return string8;
    }

    /**
     * 
     * @param string8
     *     The string8
     */
    @JsonProperty("string8")
    public void setString8(String string8) {
        this.string8 = string8;
    }

    /**
     * 
     * @return
     *     The string9
     */
    @JsonProperty("string9")
    public String getString9() {
        return string9;
    }

    /**
     * 
     * @param string9
     *     The string9
     */
    @JsonProperty("string9")
    public void setString9(String string9) {
        this.string9 = string9;
    }

    /**
     * 
     * @return
     *     The filler07
     */
    @JsonProperty("filler_07")
    public String getFiller07() {
        return filler07;
    }

    /**
     * 
     * @param filler07
     *     The filler_07
     */
    @JsonProperty("filler_07")
    public void setFiller07(String filler07) {
        this.filler07 = filler07;
    }

    /**
     * 
     * @return
     *     The nroTarjetaAut
     */
    @JsonProperty("nro_tarjeta_aut")
    public String getNroTarjetaAut() {
        return nroTarjetaAut;
    }

    /**
     * 
     * @param nroTarjetaAut
     *     The nro_tarjeta_aut
     */
    @JsonProperty("nro_tarjeta_aut")
    public void setNroTarjetaAut(String nroTarjetaAut) {
        this.nroTarjetaAut = nroTarjetaAut;
    }

    /**
     * 
     * @return
     *     The nroSecuenciaAut
     */
    @JsonProperty("nro_secuencia_aut")
    public String getNroSecuenciaAut() {
        return nroSecuenciaAut;
    }

    /**
     * 
     * @param nroSecuenciaAut
     *     The nro_secuencia_aut
     */
    @JsonProperty("nro_secuencia_aut")
    public void setNroSecuenciaAut(String nroSecuenciaAut) {
        this.nroSecuenciaAut = nroSecuenciaAut;
    }

    /**
     * 
     * @return
     *     The statusTjtaAut
     */
    @JsonProperty("status_tjta_aut")
    public String getStatusTjtaAut() {
        return statusTjtaAut;
    }

    /**
     * 
     * @param statusTjtaAut
     *     The status_tjta_aut
     */
    @JsonProperty("status_tjta_aut")
    public void setStatusTjtaAut(String statusTjtaAut) {
        this.statusTjtaAut = statusTjtaAut;
    }

    /**
     * 
     * @return
     *     The status2TjtaAut
     */
    @JsonProperty("status2_tjta_aut")
    public String getStatus2TjtaAut() {
        return status2TjtaAut;
    }

    /**
     * 
     * @param status2TjtaAut
     *     The status2_tjta_aut
     */
    @JsonProperty("status2_tjta_aut")
    public void setStatus2TjtaAut(String status2TjtaAut) {
        this.status2TjtaAut = status2TjtaAut;
    }

    /**
     * 
     * @return
     *     The cupoCompNacTjtaAut
     */
    @JsonProperty("cupo_comp_nac_tjta_aut")
    public String getCupoCompNacTjtaAut() {
        return cupoCompNacTjtaAut;
    }

    /**
     * 
     * @param cupoCompNacTjtaAut
     *     The cupo_comp_nac_tjta_aut
     */
    @JsonProperty("cupo_comp_nac_tjta_aut")
    public void setCupoCompNacTjtaAut(String cupoCompNacTjtaAut) {
        this.cupoCompNacTjtaAut = cupoCompNacTjtaAut;
    }

    /**
     * 
     * @return
     *     The cupoCompIntTjtaAut
     */
    @JsonProperty("cupo_comp_int_tjta_aut")
    public String getCupoCompIntTjtaAut() {
        return cupoCompIntTjtaAut;
    }

    /**
     * 
     * @param cupoCompIntTjtaAut
     *     The cupo_comp_int_tjta_aut
     */
    @JsonProperty("cupo_comp_int_tjta_aut")
    public void setCupoCompIntTjtaAut(String cupoCompIntTjtaAut) {
        this.cupoCompIntTjtaAut = cupoCompIntTjtaAut;
    }

    /**
     * 
     * @return
     *     The cupoAvceNacTjtaAut
     */
    @JsonProperty("cupo_avce_nac_tjta_aut")
    public String getCupoAvceNacTjtaAut() {
        return cupoAvceNacTjtaAut;
    }

    /**
     * 
     * @param cupoAvceNacTjtaAut
     *     The cupo_avce_nac_tjta_aut
     */
    @JsonProperty("cupo_avce_nac_tjta_aut")
    public void setCupoAvceNacTjtaAut(String cupoAvceNacTjtaAut) {
        this.cupoAvceNacTjtaAut = cupoAvceNacTjtaAut;
    }

    /**
     * 
     * @return
     *     The cupoAvceIntTjtaAut
     */
    @JsonProperty("cupo_avce_int_tjta_aut")
    public String getCupoAvceIntTjtaAut() {
        return cupoAvceIntTjtaAut;
    }

    /**
     * 
     * @param cupoAvceIntTjtaAut
     *     The cupo_avce_int_tjta_aut
     */
    @JsonProperty("cupo_avce_int_tjta_aut")
    public void setCupoAvceIntTjtaAut(String cupoAvceIntTjtaAut) {
        this.cupoAvceIntTjtaAut = cupoAvceIntTjtaAut;
    }

    /**
     * 
     * @return
     *     The cupoL2TjtaAut
     */
    @JsonProperty("cupo_l2_tjta_aut")
    public String getCupoL2TjtaAut() {
        return cupoL2TjtaAut;
    }

    /**
     * 
     * @param cupoL2TjtaAut
     *     The cupo_l2_tjta_aut
     */
    @JsonProperty("cupo_l2_tjta_aut")
    public void setCupoL2TjtaAut(String cupoL2TjtaAut) {
        this.cupoL2TjtaAut = cupoL2TjtaAut;
    }

    /**
     * 
     * @return
     *     The deudaCompNacTjtaAut
     */
    @JsonProperty("deuda_comp_nac_tjta_aut")
    public String getDeudaCompNacTjtaAut() {
        return deudaCompNacTjtaAut;
    }

    /**
     * 
     * @param deudaCompNacTjtaAut
     *     The deuda_comp_nac_tjta_aut
     */
    @JsonProperty("deuda_comp_nac_tjta_aut")
    public void setDeudaCompNacTjtaAut(String deudaCompNacTjtaAut) {
        this.deudaCompNacTjtaAut = deudaCompNacTjtaAut;
    }

    /**
     * 
     * @return
     *     The deudaCompIntTjtaAut
     */
    @JsonProperty("deuda_comp_int_tjta_aut")
    public String getDeudaCompIntTjtaAut() {
        return deudaCompIntTjtaAut;
    }

    /**
     * 
     * @param deudaCompIntTjtaAut
     *     The deuda_comp_int_tjta_aut
     */
    @JsonProperty("deuda_comp_int_tjta_aut")
    public void setDeudaCompIntTjtaAut(String deudaCompIntTjtaAut) {
        this.deudaCompIntTjtaAut = deudaCompIntTjtaAut;
    }

    /**
     * 
     * @return
     *     The deudaAvceNacTjtaAut
     */
    @JsonProperty("deuda_avce_nac_tjta_aut")
    public String getDeudaAvceNacTjtaAut() {
        return deudaAvceNacTjtaAut;
    }

    /**
     * 
     * @param deudaAvceNacTjtaAut
     *     The deuda_avce_nac_tjta_aut
     */
    @JsonProperty("deuda_avce_nac_tjta_aut")
    public void setDeudaAvceNacTjtaAut(String deudaAvceNacTjtaAut) {
        this.deudaAvceNacTjtaAut = deudaAvceNacTjtaAut;
    }

    /**
     * 
     * @return
     *     The deudaAvceIntTjtaAut
     */
    @JsonProperty("deuda_avce_int_tjta_aut")
    public String getDeudaAvceIntTjtaAut() {
        return deudaAvceIntTjtaAut;
    }

    /**
     * 
     * @param deudaAvceIntTjtaAut
     *     The deuda_avce_int_tjta_aut
     */
    @JsonProperty("deuda_avce_int_tjta_aut")
    public void setDeudaAvceIntTjtaAut(String deudaAvceIntTjtaAut) {
        this.deudaAvceIntTjtaAut = deudaAvceIntTjtaAut;
    }

    /**
     * 
     * @return
     *     The deudaL2TjtaAut
     */
    @JsonProperty("deuda_l2_tjta_aut")
    public String getDeudaL2TjtaAut() {
        return deudaL2TjtaAut;
    }

    /**
     * 
     * @param deudaL2TjtaAut
     *     The deuda_l2_tjta_aut
     */
    @JsonProperty("deuda_l2_tjta_aut")
    public void setDeudaL2TjtaAut(String deudaL2TjtaAut) {
        this.deudaL2TjtaAut = deudaL2TjtaAut;
    }

    /**
     * 
     * @return
     *     The dispCompNacionalTjtaAut
     */
    @JsonProperty("disp_comp_nacional_tjta_aut")
    public String getDispCompNacionalTjtaAut() {
        return dispCompNacionalTjtaAut;
    }

    /**
     * 
     * @param dispCompNacionalTjtaAut
     *     The disp_comp_nacional_tjta_aut
     */
    @JsonProperty("disp_comp_nacional_tjta_aut")
    public void setDispCompNacionalTjtaAut(String dispCompNacionalTjtaAut) {
        this.dispCompNacionalTjtaAut = dispCompNacionalTjtaAut;
    }

    /**
     * 
     * @return
     *     The dispCompInternacionalTjtaAut
     */
    @JsonProperty("disp_comp_internacional_tjta_aut")
    public String getDispCompInternacionalTjtaAut() {
        return dispCompInternacionalTjtaAut;
    }

    /**
     * 
     * @param dispCompInternacionalTjtaAut
     *     The disp_comp_internacional_tjta_aut
     */
    @JsonProperty("disp_comp_internacional_tjta_aut")
    public void setDispCompInternacionalTjtaAut(String dispCompInternacionalTjtaAut) {
        this.dispCompInternacionalTjtaAut = dispCompInternacionalTjtaAut;
    }

    /**
     * 
     * @return
     *     The dispAvceNacionalTjtaAut
     */
    @JsonProperty("disp_avce_nacional_tjta_aut")
    public String getDispAvceNacionalTjtaAut() {
        return dispAvceNacionalTjtaAut;
    }

    /**
     * 
     * @param dispAvceNacionalTjtaAut
     *     The disp_avce_nacional_tjta_aut
     */
    @JsonProperty("disp_avce_nacional_tjta_aut")
    public void setDispAvceNacionalTjtaAut(String dispAvceNacionalTjtaAut) {
        this.dispAvceNacionalTjtaAut = dispAvceNacionalTjtaAut;
    }

    /**
     * 
     * @return
     *     The dispAvceInternacionalTjtaAut
     */
    @JsonProperty("disp_avce_internacional_tjta_aut")
    public String getDispAvceInternacionalTjtaAut() {
        return dispAvceInternacionalTjtaAut;
    }

    /**
     * 
     * @param dispAvceInternacionalTjtaAut
     *     The disp_avce_internacional_tjta_aut
     */
    @JsonProperty("disp_avce_internacional_tjta_aut")
    public void setDispAvceInternacionalTjtaAut(String dispAvceInternacionalTjtaAut) {
        this.dispAvceInternacionalTjtaAut = dispAvceInternacionalTjtaAut;
    }

    /**
     * 
     * @return
     *     The dispL2TjtaAut
     */
    @JsonProperty("disp_l2_tjta_aut")
    public String getDispL2TjtaAut() {
        return dispL2TjtaAut;
    }

    /**
     * 
     * @param dispL2TjtaAut
     *     The disp_l2_tjta_aut
     */
    @JsonProperty("disp_l2_tjta_aut")
    public void setDispL2TjtaAut(String dispL2TjtaAut) {
        this.dispL2TjtaAut = dispL2TjtaAut;
    }

    /**
     * 
     * @return
     *     The dispFlotCuotasL2TjtaAut
     */
    @JsonProperty("disp_flot_cuotas_l2_tjta_aut")
    public String getDispFlotCuotasL2TjtaAut() {
        return dispFlotCuotasL2TjtaAut;
    }

    /**
     * 
     * @param dispFlotCuotasL2TjtaAut
     *     The disp_flot_cuotas_l2_tjta_aut
     */
    @JsonProperty("disp_flot_cuotas_l2_tjta_aut")
    public void setDispFlotCuotasL2TjtaAut(String dispFlotCuotasL2TjtaAut) {
        this.dispFlotCuotasL2TjtaAut = dispFlotCuotasL2TjtaAut;
    }

    /**
     * 
     * @return
     *     The dispFlotAvceL2TjtaAut
     */
    @JsonProperty("disp_flot_avce_l2_tjta_aut")
    public String getDispFlotAvceL2TjtaAut() {
        return dispFlotAvceL2TjtaAut;
    }

    /**
     * 
     * @param dispFlotAvceL2TjtaAut
     *     The disp_flot_avce_l2_tjta_aut
     */
    @JsonProperty("disp_flot_avce_l2_tjta_aut")
    public void setDispFlotAvceL2TjtaAut(String dispFlotAvceL2TjtaAut) {
        this.dispFlotAvceL2TjtaAut = dispFlotAvceL2TjtaAut;
    }

    /**
     * 
     * @return
     *     The dispFlotAvceCuotaL1L2Tjta
     */
    @JsonProperty("disp_flot_avce_cuota_l1_l2_tjta")
    public String getDispFlotAvceCuotaL1L2Tjta() {
        return dispFlotAvceCuotaL1L2Tjta;
    }

    /**
     * 
     * @param dispFlotAvceCuotaL1L2Tjta
     *     The disp_flot_avce_cuota_l1_l2_tjta
     */
    @JsonProperty("disp_flot_avce_cuota_l1_l2_tjta")
    public void setDispFlotAvceCuotaL1L2Tjta(String dispFlotAvceCuotaL1L2Tjta) {
        this.dispFlotAvceCuotaL1L2Tjta = dispFlotAvceCuotaL1L2Tjta;
    }

    /**
     * 
     * @return
     *     The autPendL1TjtaAut
     */
    @JsonProperty("aut_pend_l1_tjta_aut")
    public String getAutPendL1TjtaAut() {
        return autPendL1TjtaAut;
    }

    /**
     * 
     * @param autPendL1TjtaAut
     *     The aut_pend_l1_tjta_aut
     */
    @JsonProperty("aut_pend_l1_tjta_aut")
    public void setAutPendL1TjtaAut(String autPendL1TjtaAut) {
        this.autPendL1TjtaAut = autPendL1TjtaAut;
    }

    /**
     * 
     * @return
     *     The autPendL2TjtaAut
     */
    @JsonProperty("aut_pend_l2_tjta_aut")
    public String getAutPendL2TjtaAut() {
        return autPendL2TjtaAut;
    }

    /**
     * 
     * @param autPendL2TjtaAut
     *     The aut_pend_l2_tjta_aut
     */
    @JsonProperty("aut_pend_l2_tjta_aut")
    public void setAutPendL2TjtaAut(String autPendL2TjtaAut) {
        this.autPendL2TjtaAut = autPendL2TjtaAut;
    }

    /**
     * 
     * @return
     *     The fechaVctoTjtaAut
     */
    @JsonProperty("fecha_vcto_tjta_aut")
    public String getFechaVctoTjtaAut() {
        return fechaVctoTjtaAut;
    }

    /**
     * 
     * @param fechaVctoTjtaAut
     *     The fecha_vcto_tjta_aut
     */
    @JsonProperty("fecha_vcto_tjta_aut")
    public void setFechaVctoTjtaAut(String fechaVctoTjtaAut) {
        this.fechaVctoTjtaAut = fechaVctoTjtaAut;
    }

    /**
     * 
     * @return
     *     The nombreBandaTjtaAut
     */
    @JsonProperty("nombre_banda_tjta_aut")
    public String getNombreBandaTjtaAut() {
        return nombreBandaTjtaAut;
    }

    /**
     * 
     * @param nombreBandaTjtaAut
     *     The nombre_banda_tjta_aut
     */
    @JsonProperty("nombre_banda_tjta_aut")
    public void setNombreBandaTjtaAut(String nombreBandaTjtaAut) {
        this.nombreBandaTjtaAut = nombreBandaTjtaAut;
    }

    /**
     * 
     * @return
     *     The offsetTjtaAut
     */
    @JsonProperty("offset_tjta_aut")
    public String getOffsetTjtaAut() {
        return offsetTjtaAut;
    }

    /**
     * 
     * @param offsetTjtaAut
     *     The offset_tjta_aut
     */
    @JsonProperty("offset_tjta_aut")
    public void setOffsetTjtaAut(String offsetTjtaAut) {
        this.offsetTjtaAut = offsetTjtaAut;
    }

    /**
     * 
     * @return
     *     The cvv2TjtaAut
     */
    @JsonProperty("cvv2_tjta_aut")
    public String getCvv2TjtaAut() {
        return cvv2TjtaAut;
    }

    /**
     * 
     * @param cvv2TjtaAut
     *     The cvv2_tjta_aut
     */
    @JsonProperty("cvv2_tjta_aut")
    public void setCvv2TjtaAut(String cvv2TjtaAut) {
        this.cvv2TjtaAut = cvv2TjtaAut;
    }

    /**
     * 
     * @return
     *     The flagCuotaFijaTjtaAut
     */
    @JsonProperty("flag_cuota_fija_tjta_aut")
    public String getFlagCuotaFijaTjtaAut() {
        return flagCuotaFijaTjtaAut;
    }

    /**
     * 
     * @param flagCuotaFijaTjtaAut
     *     The flag_cuota_fija_tjta_aut
     */
    @JsonProperty("flag_cuota_fija_tjta_aut")
    public void setFlagCuotaFijaTjtaAut(String flagCuotaFijaTjtaAut) {
        this.flagCuotaFijaTjtaAut = flagCuotaFijaTjtaAut;
    }

    /**
     * 
     * @return
     *     The flagAvceCuotasTjtaAut
     */
    @JsonProperty("flag_avce_cuotas_tjta_aut")
    public String getFlagAvceCuotasTjtaAut() {
        return flagAvceCuotasTjtaAut;
    }

    /**
     * 
     * @param flagAvceCuotasTjtaAut
     *     The flag_avce_cuotas_tjta_aut
     */
    @JsonProperty("flag_avce_cuotas_tjta_aut")
    public void setFlagAvceCuotasTjtaAut(String flagAvceCuotasTjtaAut) {
        this.flagAvceCuotasTjtaAut = flagAvceCuotasTjtaAut;
    }

    /**
     * 
     * @return
     *     The flagNcuotasTjtaAut
     */
    @JsonProperty("flag_ncuotas_tjta_aut")
    public String getFlagNcuotasTjtaAut() {
        return flagNcuotasTjtaAut;
    }

    /**
     * 
     * @param flagNcuotasTjtaAut
     *     The flag_ncuotas_tjta_aut
     */
    @JsonProperty("flag_ncuotas_tjta_aut")
    public void setFlagNcuotasTjtaAut(String flagNcuotasTjtaAut) {
        this.flagNcuotasTjtaAut = flagNcuotasTjtaAut;
    }

    /**
     * 
     * @return
     *     The flag3cpcTjtaAut
     */
    @JsonProperty("flag_3cpc_tjta_aut")
    public String getFlag3cpcTjtaAut() {
        return flag3cpcTjtaAut;
    }

    /**
     * 
     * @param flag3cpcTjtaAut
     *     The flag_3cpc_tjta_aut
     */
    @JsonProperty("flag_3cpc_tjta_aut")
    public void setFlag3cpcTjtaAut(String flag3cpcTjtaAut) {
        this.flag3cpcTjtaAut = flag3cpcTjtaAut;
    }

    /**
     * 
     * @return
     *     The flagCompraNormalTjtaAut
     */
    @JsonProperty("flag_compra_normal_tjta_aut")
    public String getFlagCompraNormalTjtaAut() {
        return flagCompraNormalTjtaAut;
    }

    /**
     * 
     * @param flagCompraNormalTjtaAut
     *     The flag_compra_normal_tjta_aut
     */
    @JsonProperty("flag_compra_normal_tjta_aut")
    public void setFlagCompraNormalTjtaAut(String flagCompraNormalTjtaAut) {
        this.flagCompraNormalTjtaAut = flagCompraNormalTjtaAut;
    }

    /**
     * 
     * @return
     *     The flagAvceEfecvoTjtaAut
     */
    @JsonProperty("flag_avce_efecvo_tjta_aut")
    public String getFlagAvceEfecvoTjtaAut() {
        return flagAvceEfecvoTjtaAut;
    }

    /**
     * 
     * @param flagAvceEfecvoTjtaAut
     *     The flag_avce_efecvo_tjta_aut
     */
    @JsonProperty("flag_avce_efecvo_tjta_aut")
    public void setFlagAvceEfecvoTjtaAut(String flagAvceEfecvoTjtaAut) {
        this.flagAvceEfecvoTjtaAut = flagAvceEfecvoTjtaAut;
    }

    /**
     * 
     * @return
     *     The monto12
     */
    @JsonProperty("monto12")
    public String getMonto12() {
        return monto12;
    }

    /**
     * 
     * @param monto12
     *     The monto12
     */
    @JsonProperty("monto12")
    public void setMonto12(String monto12) {
        this.monto12 = monto12;
    }

    /**
     * 
     * @return
     *     The monto22
     */
    @JsonProperty("monto22")
    public String getMonto22() {
        return monto22;
    }

    /**
     * 
     * @param monto22
     *     The monto22
     */
    @JsonProperty("monto22")
    public void setMonto22(String monto22) {
        this.monto22 = monto22;
    }

    /**
     * 
     * @return
     *     The monto32
     */
    @JsonProperty("monto32")
    public String getMonto32() {
        return monto32;
    }

    /**
     * 
     * @param monto32
     *     The monto32
     */
    @JsonProperty("monto32")
    public void setMonto32(String monto32) {
        this.monto32 = monto32;
    }

    /**
     * 
     * @return
     *     The numero12
     */
    @JsonProperty("numero12")
    public String getNumero12() {
        return numero12;
    }

    /**
     * 
     * @param numero12
     *     The numero12
     */
    @JsonProperty("numero12")
    public void setNumero12(String numero12) {
        this.numero12 = numero12;
    }

    /**
     * 
     * @return
     *     The numero22
     */
    @JsonProperty("numero22")
    public String getNumero22() {
        return numero22;
    }

    /**
     * 
     * @param numero22
     *     The numero22
     */
    @JsonProperty("numero22")
    public void setNumero22(String numero22) {
        this.numero22 = numero22;
    }

    /**
     * 
     * @return
     *     The numero32
     */
    @JsonProperty("numero32")
    public String getNumero32() {
        return numero32;
    }

    /**
     * 
     * @param numero32
     *     The numero32
     */
    @JsonProperty("numero32")
    public void setNumero32(String numero32) {
        this.numero32 = numero32;
    }

    /**
     * 
     * @return
     *     The flag12
     */
    @JsonProperty("flag12")
    public String getFlag12() {
        return flag12;
    }

    /**
     * 
     * @param flag12
     *     The flag12
     */
    @JsonProperty("flag12")
    public void setFlag12(String flag12) {
        this.flag12 = flag12;
    }

    /**
     * 
     * @return
     *     The flag22
     */
    @JsonProperty("flag22")
    public String getFlag22() {
        return flag22;
    }

    /**
     * 
     * @param flag22
     *     The flag22
     */
    @JsonProperty("flag22")
    public void setFlag22(String flag22) {
        this.flag22 = flag22;
    }

    /**
     * 
     * @return
     *     The flag32
     */
    @JsonProperty("flag32")
    public String getFlag32() {
        return flag32;
    }

    /**
     * 
     * @param flag32
     *     The flag32
     */
    @JsonProperty("flag32")
    public void setFlag32(String flag32) {
        this.flag32 = flag32;
    }

    /**
     * 
     * @return
     *     The string12
     */
    @JsonProperty("string12")
    public String getString12() {
        return string12;
    }

    /**
     * 
     * @param string12
     *     The string12
     */
    @JsonProperty("string12")
    public void setString12(String string12) {
        this.string12 = string12;
    }

    /**
     * 
     * @return
     *     The string22
     */
    @JsonProperty("string22")
    public String getString22() {
        return string22;
    }

    /**
     * 
     * @param string22
     *     The string22
     */
    @JsonProperty("string22")
    public void setString22(String string22) {
        this.string22 = string22;
    }

    /**
     * 
     * @return
     *     The string32
     */
    @JsonProperty("string32")
    public String getString32() {
        return string32;
    }

    /**
     * 
     * @param string32
     *     The string32
     */
    @JsonProperty("string32")
    public void setString32(String string32) {
        this.string32 = string32;
    }

    /**
     * 
     * @return
     *     The filler08
     */
    @JsonProperty("filler_08")
    public String getFiller08() {
        return filler08;
    }

    /**
     * 
     * @param filler08
     *     The filler_08
     */
    @JsonProperty("filler_08")
    public void setFiller08(String filler08) {
        this.filler08 = filler08;
    }

    /**
     * 
     * @return
     *     The cdgoBanco
     */
    @JsonProperty("cdgo_banco")
    public String getCdgoBanco() {
        return cdgoBanco;
    }

    /**
     * 
     * @param cdgoBanco
     *     The cdgo_banco
     */
    @JsonProperty("cdgo_banco")
    public void setCdgoBanco(String cdgoBanco) {
        this.cdgoBanco = cdgoBanco;
    }

    /**
     * 
     * @return
     *     The descBanco
     */
    @JsonProperty("desc_banco")
    public String getDescBanco() {
        return descBanco;
    }

    /**
     * 
     * @param descBanco
     *     The desc_banco
     */
    @JsonProperty("desc_banco")
    public void setDescBanco(String descBanco) {
        this.descBanco = descBanco;
    }

    /**
     * 
     * @return
     *     The tipoPac
     */
    @JsonProperty("tipo_pac")
    public String getTipoPac() {
        return tipoPac;
    }

    /**
     * 
     * @param tipoPac
     *     The tipo_pac
     */
    @JsonProperty("tipo_pac")
    public void setTipoPac(String tipoPac) {
        this.tipoPac = tipoPac;
    }

    /**
     * 
     * @return
     *     The nroCtactePac
     */
    @JsonProperty("nro_ctacte_pac")
    public String getNroCtactePac() {
        return nroCtactePac;
    }

    /**
     * 
     * @param nroCtactePac
     *     The nro_ctacte_pac
     */
    @JsonProperty("nro_ctacte_pac")
    public void setNroCtactePac(String nroCtactePac) {
        this.nroCtactePac = nroCtactePac;
    }

    /**
     * 
     * @return
     *     The fechaPac
     */
    @JsonProperty("fecha_pac")
    public String getFechaPac() {
        return fechaPac;
    }

    /**
     * 
     * @param fechaPac
     *     The fecha_pac
     */
    @JsonProperty("fecha_pac")
    public void setFechaPac(String fechaPac) {
        this.fechaPac = fechaPac;
    }

    /**
     * 
     * @return
     *     The fechaActivPac
     */
    @JsonProperty("fecha_activ_pac")
    public String getFechaActivPac() {
        return fechaActivPac;
    }

    /**
     * 
     * @param fechaActivPac
     *     The fecha_activ_pac
     */
    @JsonProperty("fecha_activ_pac")
    public void setFechaActivPac(String fechaActivPac) {
        this.fechaActivPac = fechaActivPac;
    }

    /**
     * 
     * @return
     *     The fechaModifPac
     */
    @JsonProperty("fecha_modif_pac")
    public String getFechaModifPac() {
        return fechaModifPac;
    }

    /**
     * 
     * @param fechaModifPac
     *     The fecha_modif_pac
     */
    @JsonProperty("fecha_modif_pac")
    public void setFechaModifPac(String fechaModifPac) {
        this.fechaModifPac = fechaModifPac;
    }

    /**
     * 
     * @return
     *     The fechaRenunciaPac
     */
    @JsonProperty("fecha_renuncia_pac")
    public String getFechaRenunciaPac() {
        return fechaRenunciaPac;
    }

    /**
     * 
     * @param fechaRenunciaPac
     *     The fecha_renuncia_pac
     */
    @JsonProperty("fecha_renuncia_pac")
    public void setFechaRenunciaPac(String fechaRenunciaPac) {
        this.fechaRenunciaPac = fechaRenunciaPac;
    }

    /**
     * 
     * @return
     *     The monto13
     */
    @JsonProperty("monto13")
    public String getMonto13() {
        return monto13;
    }

    /**
     * 
     * @param monto13
     *     The monto13
     */
    @JsonProperty("monto13")
    public void setMonto13(String monto13) {
        this.monto13 = monto13;
    }

    /**
     * 
     * @return
     *     The monto23
     */
    @JsonProperty("monto23")
    public String getMonto23() {
        return monto23;
    }

    /**
     * 
     * @param monto23
     *     The monto23
     */
    @JsonProperty("monto23")
    public void setMonto23(String monto23) {
        this.monto23 = monto23;
    }

    /**
     * 
     * @return
     *     The numero13
     */
    @JsonProperty("numero13")
    public String getNumero13() {
        return numero13;
    }

    /**
     * 
     * @param numero13
     *     The numero13
     */
    @JsonProperty("numero13")
    public void setNumero13(String numero13) {
        this.numero13 = numero13;
    }

    /**
     * 
     * @return
     *     The numero23
     */
    @JsonProperty("numero23")
    public String getNumero23() {
        return numero23;
    }

    /**
     * 
     * @param numero23
     *     The numero23
     */
    @JsonProperty("numero23")
    public void setNumero23(String numero23) {
        this.numero23 = numero23;
    }

    /**
     * 
     * @return
     *     The flag13
     */
    @JsonProperty("flag13")
    public String getFlag13() {
        return flag13;
    }

    /**
     * 
     * @param flag13
     *     The flag13
     */
    @JsonProperty("flag13")
    public void setFlag13(String flag13) {
        this.flag13 = flag13;
    }

    /**
     * 
     * @return
     *     The flag23
     */
    @JsonProperty("flag23")
    public String getFlag23() {
        return flag23;
    }

    /**
     * 
     * @param flag23
     *     The flag23
     */
    @JsonProperty("flag23")
    public void setFlag23(String flag23) {
        this.flag23 = flag23;
    }

    /**
     * 
     * @return
     *     The string13
     */
    @JsonProperty("string13")
    public String getString13() {
        return string13;
    }

    /**
     * 
     * @param string13
     *     The string13
     */
    @JsonProperty("string13")
    public void setString13(String string13) {
        this.string13 = string13;
    }

    /**
     * 
     * @return
     *     The string23
     */
    @JsonProperty("string23")
    public String getString23() {
        return string23;
    }

    /**
     * 
     * @param string23
     *     The string23
     */
    @JsonProperty("string23")
    public void setString23(String string23) {
        this.string23 = string23;
    }

    /**
     * 
     * @return
     *     The diasMora
     */
    @JsonProperty("dias_mora")
    public String getDiasMora() {
        return diasMora;
    }

    /**
     * 
     * @param diasMora
     *     The dias_mora
     */
    @JsonProperty("dias_mora")
    public void setDiasMora(String diasMora) {
        this.diasMora = diasMora;
    }

    /**
     * 
     * @return
     *     The fechaInicioMora
     */
    @JsonProperty("fecha_inicio_mora")
    public String getFechaInicioMora() {
        return fechaInicioMora;
    }

    /**
     * 
     * @param fechaInicioMora
     *     The fecha_inicio_mora
     */
    @JsonProperty("fecha_inicio_mora")
    public void setFechaInicioMora(String fechaInicioMora) {
        this.fechaInicioMora = fechaInicioMora;
    }

    /**
     * 
     * @return
     *     The montoMora1
     */
    @JsonProperty("monto_mora1")
    public String getMontoMora1() {
        return montoMora1;
    }

    /**
     * 
     * @param montoMora1
     *     The monto_mora1
     */
    @JsonProperty("monto_mora1")
    public void setMontoMora1(String montoMora1) {
        this.montoMora1 = montoMora1;
    }

    /**
     * 
     * @return
     *     The montoMora2
     */
    @JsonProperty("monto_mora2")
    public String getMontoMora2() {
        return montoMora2;
    }

    /**
     * 
     * @param montoMora2
     *     The monto_mora2
     */
    @JsonProperty("monto_mora2")
    public void setMontoMora2(String montoMora2) {
        this.montoMora2 = montoMora2;
    }

    /**
     * 
     * @return
     *     The montoMora3
     */
    @JsonProperty("monto_mora3")
    public String getMontoMora3() {
        return montoMora3;
    }

    /**
     * 
     * @param montoMora3
     *     The monto_mora3
     */
    @JsonProperty("monto_mora3")
    public void setMontoMora3(String montoMora3) {
        this.montoMora3 = montoMora3;
    }

    /**
     * 
     * @return
     *     The montoMora4
     */
    @JsonProperty("monto_mora4")
    public String getMontoMora4() {
        return montoMora4;
    }

    /**
     * 
     * @param montoMora4
     *     The monto_mora4
     */
    @JsonProperty("monto_mora4")
    public void setMontoMora4(String montoMora4) {
        this.montoMora4 = montoMora4;
    }

    /**
     * 
     * @return
     *     The montoMora5
     */
    @JsonProperty("monto_mora5")
    public String getMontoMora5() {
        return montoMora5;
    }

    /**
     * 
     * @param montoMora5
     *     The monto_mora5
     */
    @JsonProperty("monto_mora5")
    public void setMontoMora5(String montoMora5) {
        this.montoMora5 = montoMora5;
    }

    /**
     * 
     * @return
     *     The montoMora6
     */
    @JsonProperty("monto_mora6")
    public String getMontoMora6() {
        return montoMora6;
    }

    /**
     * 
     * @param montoMora6
     *     The monto_mora6
     */
    @JsonProperty("monto_mora6")
    public void setMontoMora6(String montoMora6) {
        this.montoMora6 = montoMora6;
    }

    /**
     * 
     * @return
     *     The montoMora7
     */
    @JsonProperty("monto_mora7")
    public String getMontoMora7() {
        return montoMora7;
    }

    /**
     * 
     * @param montoMora7
     *     The monto_mora7
     */
    @JsonProperty("monto_mora7")
    public void setMontoMora7(String montoMora7) {
        this.montoMora7 = montoMora7;
    }

    /**
     * 
     * @return
     *     The montoMora8
     */
    @JsonProperty("monto_mora8")
    public String getMontoMora8() {
        return montoMora8;
    }

    /**
     * 
     * @param montoMora8
     *     The monto_mora8
     */
    @JsonProperty("monto_mora8")
    public void setMontoMora8(String montoMora8) {
        this.montoMora8 = montoMora8;
    }

    /**
     * 
     * @return
     *     The monto14
     */
    @JsonProperty("monto14")
    public String getMonto14() {
        return monto14;
    }

    /**
     * 
     * @param monto14
     *     The monto14
     */
    @JsonProperty("monto14")
    public void setMonto14(String monto14) {
        this.monto14 = monto14;
    }

    /**
     * 
     * @return
     *     The monto24
     */
    @JsonProperty("monto24")
    public String getMonto24() {
        return monto24;
    }

    /**
     * 
     * @param monto24
     *     The monto24
     */
    @JsonProperty("monto24")
    public void setMonto24(String monto24) {
        this.monto24 = monto24;
    }

    /**
     * 
     * @return
     *     The numero14
     */
    @JsonProperty("numero14")
    public String getNumero14() {
        return numero14;
    }

    /**
     * 
     * @param numero14
     *     The numero14
     */
    @JsonProperty("numero14")
    public void setNumero14(String numero14) {
        this.numero14 = numero14;
    }

    /**
     * 
     * @return
     *     The numero24
     */
    @JsonProperty("numero24")
    public String getNumero24() {
        return numero24;
    }

    /**
     * 
     * @param numero24
     *     The numero24
     */
    @JsonProperty("numero24")
    public void setNumero24(String numero24) {
        this.numero24 = numero24;
    }

    /**
     * 
     * @return
     *     The flag14
     */
    @JsonProperty("flag14")
    public String getFlag14() {
        return flag14;
    }

    /**
     * 
     * @param flag14
     *     The flag14
     */
    @JsonProperty("flag14")
    public void setFlag14(String flag14) {
        this.flag14 = flag14;
    }

    /**
     * 
     * @return
     *     The flag24
     */
    @JsonProperty("flag24")
    public String getFlag24() {
        return flag24;
    }

    /**
     * 
     * @param flag24
     *     The flag24
     */
    @JsonProperty("flag24")
    public void setFlag24(String flag24) {
        this.flag24 = flag24;
    }

    /**
     * 
     * @return
     *     The string14
     */
    @JsonProperty("string14")
    public String getString14() {
        return string14;
    }

    /**
     * 
     * @param string14
     *     The string14
     */
    @JsonProperty("string14")
    public void setString14(String string14) {
        this.string14 = string14;
    }

    /**
     * 
     * @return
     *     The string24
     */
    @JsonProperty("string24")
    public String getString24() {
        return string24;
    }

    /**
     * 
     * @param string24
     *     The string24
     */
    @JsonProperty("string24")
    public void setString24(String string24) {
        this.string24 = string24;
    }

    /**
     * 
     * @return
     *     The cuentaCastigo
     */
    @JsonProperty("cuenta_castigo")
    public String getCuentaCastigo() {
        return cuentaCastigo;
    }

    /**
     * 
     * @param cuentaCastigo
     *     The cuenta_castigo
     */
    @JsonProperty("cuenta_castigo")
    public void setCuentaCastigo(String cuentaCastigo) {
        this.cuentaCastigo = cuentaCastigo;
    }

    /**
     * 
     * @return
     *     The montoCastigo
     */
    @JsonProperty("monto_castigo")
    public String getMontoCastigo() {
        return montoCastigo;
    }

    /**
     * 
     * @param montoCastigo
     *     The monto_castigo
     */
    @JsonProperty("monto_castigo")
    public void setMontoCastigo(String montoCastigo) {
        this.montoCastigo = montoCastigo;
    }

    /**
     * 
     * @return
     *     The filler09
     */
    @JsonProperty("filler_09")
    public String getFiller09() {
        return filler09;
    }

    /**
     * 
     * @param filler09
     *     The filler_09
     */
    @JsonProperty("filler_09")
    public void setFiller09(String filler09) {
        this.filler09 = filler09;
    }

}
