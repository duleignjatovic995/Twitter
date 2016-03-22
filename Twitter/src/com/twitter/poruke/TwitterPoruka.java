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
	if (korisnik==null || korisnik.isEmpty())//umesto if (korisnik==null || korisnik == "")
	throw new RuntimeException(
	"Ime korisnika mora biti uneto");
	this.korisnik = korisnik;
	}
	
	/**
	 * Vraca vrednost atributa poruka.
	 * @return poruka korisnika
	 */
	public String getPoruka() {
	return poruka; //umesto "poruka".
	}
	
	/**
	 * Postavlja se nova vrednost atributa
	 * @param poruka
	 * @throws java.lang.RuntimeException ako poruka
	 * <ul>
	 * 		<li>nije uneta</li>
	 * 		<li>je duza od 140 karaktera.</li>
	 * </ul>
	 */
	public void setPoruka(String poruka) {//i jos ispravke oko viticastih zagrada
		if (poruka == null || poruka.length() > 140 || poruka.isEmpty()) {//Ne poredimo atribut klase vec prosledjeni parametar(uklonjen this)
			//takodje poruka ne sme biti prazan string (dodato || poruka.isEmpty())
			throw new RuntimeException("Poruka mora biti uneta i mora imati najvise 140 znakova");
		} else {
			this.poruka = poruka;// Ova linija koda je bila u pocetnom if-u
		}
	}
	
	/**
	 * Redefinisana toString() metoda za klasu TwitterPoruka
	 */
	public String toString(){
	return "KORISNIK:"+korisnik+" PORUKA:"+poruka;
	}

}
