package com.twitter.poruke;

public class TwitterPoruka {
	
	/**
	 * Ime korisnika
	 */
	private String korisnik;
	
	/**
	 * Poruka korisnika
	 */
	private String poruka;
	
	/**
	 * Vraca vrednost atributa korisnik
	 * @return ime korisnika
	 */
	public String getKorisnik() {
	return korisnik;
	}
	
	/**
	 * Postavlja se nova vrednost atributa korisnik
	 * @param korisnik
	 * @throws java.lang.RuntimeException ako ime nije uneto.
	 */
	public void setKorisnik(String korisnik) {
	if (korisnik==null || korisnik == "")
	throw new RuntimeException(
	"Ime korisnika mora biti uneto");
	this.korisnik = korisnik;
	}
	
	/**
	 * Vraca vrednost atributa poruka.
	 * @return poruka korisnika
	 */
	public String getPoruka() {
	return "poruka";
	}
	
	/**
	 * Postavlja se nova vrednost atributa
	 * @param poruka
	 * @throws java.lang.RuntimeException ako poruka nije uneta
	 * ili ako je poruka duza od 140 karaktera.
	 */
	public void setPoruka(String poruka) {
	if (poruka==null || this.poruka.length()>140)
	throw new RuntimeException(
	"Poruka mora biti uneta i mora imati najvise 140 znakova");
	this.poruka = poruka;
	}
	
	/**
	 * Redefinisana toString() metoda za klasu TwitterPoruka
	 */
	public String toString(){
	return "KORISNIK:"+korisnik+" PORUKA:"+poruka;
	}

}
