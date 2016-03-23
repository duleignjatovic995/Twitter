package com.twitter;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.twitter.poruke.TwitterPoruka;

public class TwitterTest {
	private Twitter t;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		t = new Twitter();
/*		String a = "ABC";
		String b = "abc";
		for (int i = 0; i < 20; i++) {
			a+="s";
			b+="d";
			t.unesi(a, b);			
		}*/
	}

	@After
	public void tearDown() throws Exception {
		t = null;
	}

	@Test
	public void testUnesiSveOK() {
		String korisnik = "Dule";
		String poruka = "Poruka";
		t.unesi(korisnik, poruka);
		LinkedList<TwitterPoruka> lista = t.vratiSvePoruke();
		assertEquals(korisnik,lista.getLast().getKorisnik() );
		assertEquals(poruka,lista.getLast().getPoruka());
	}
	
	
	@Test
	public void testVratiSvePoruke() {
		String a = "ABC";
		String b = "abc";
		for (int i = 0; i < 20; i++) {
			a+="s";
			b+="d";
			t.unesi(a, b);			
		}
		assertEquals(20, t.vratiSvePoruke().size());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testVratiPorukeNullTag() {
		t.vratiPoruke(10, null);		
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testVratiPorukePrazanTag() {
		t.vratiPoruke(10, "");		
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testVratiPorukePrazanTag1() {
		t.vratiPoruke(10, new String(""));		
	}
	
	@Test 
	public void testVratiPorukeMaxBroj() {
		String a = "ABC";
		String b = "abc";
		for (int i = 0; i < 35; i++) {
			a+="s";
			b+="d";
			t.unesi(a, b);			
		}
		//TwitterPoruka[] tpn = t.vratiPoruke(30, "abc");
		assertEquals(30, t.vratiPoruke(30, "abc").length);
	}
	
	public void testVratiPorukeMaxBroj1() {
		String a = "ABC";
		String b = "abc";
		for (int i = 0; i < 135; i++) {
			a+="s";
			b+="d";
			t.unesi(a, b);			
		}
		TwitterPoruka[] tpn = t.vratiPoruke(-5, "abc");
		assertEquals(100, tpn.length);
	}
	
	
	

}
