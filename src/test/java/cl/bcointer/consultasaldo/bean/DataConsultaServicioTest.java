package cl.bcointer.consultasaldo.bean;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DataConsultaServicioTest {
	@Test
	void setNumbDtest() {
		DataConsultaServicio dcs = new DataConsultaServicio();
		assertTrue(dcs.setNumbD("10").equals("0,00"));
	}
}