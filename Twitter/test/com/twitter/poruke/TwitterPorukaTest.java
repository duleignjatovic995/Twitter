package com.twitter.poruke;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TwitterPorukaTest {
	
	private TwitterPoruka tp;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		tp = new TwitterPoruka();
	}

	@After
	public void tearDown() throws Exception {
		tp = null;
	}

	@Test
	public void testSetKorisnikSveOk() {
		String korisnik = "Milos";
		tp.setKorisnik(korisnik);
		assertEquals(korisnik, tp.getKorisnik());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetKorisnikNull() {
		tp.setKorisnik(null);
	}
	
	/*
	 * Izgleda da u javi 8 vrednost stringova moze da
	 * se poredi sa == .
	 */
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetKorisnikPrazan() {
		tp.setKorisnik("");
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetKorisnikPrazan2() {
		String korisnik = new String("");
		tp.setKorisnik(korisnik);
		assertEquals(korisnik, tp.getKorisnik());
	}
	
	@Test 
	public void testSetPorukaSveOk() {
		String poruka = "Neki tekst.";
		tp.setPoruka(poruka);
		assertEquals(poruka, tp.getPoruka());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPorukaNull() {
		tp.setPoruka(null);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPorukaPrazan() {
		tp.setPoruka("");
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPorukaPrazan2() {
		String poruka = new String("");
		tp.setPoruka(poruka);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPorukaPredugacakString() {
		String poruka = "";
		for (int i = 0; i < 141; i++) {
			poruka+="a";
		}
		tp.setPoruka(poruka);
	}
	
	@Test 
	public void testToStringSveOk() {
		tp.setKorisnik("Jana");
		tp.setPoruka("lalala");
		String tstr = "KORISNIK:"+tp.getKorisnik()+" PORUKA:"+tp.getPoruka();
		assertEquals(tstr, tp.toString());
	}
	
	
	
	

}
