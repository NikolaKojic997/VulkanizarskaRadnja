/**
 * 
 */
package gume.radnja;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import gume.AutoGuma;

/**
 *	Klasa koja sluzi za test klase VulkanizerskaRadnja
 * @author Nikola Kojic
 * @version 0.0.1
 *
 */
public class VulkanizerskaRadnjaTest {
	VulkanizerskaRadnja v ;
	AutoGuma g;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		v = new VulkanizerskaRadnja();
		g = new AutoGuma();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		v = null;
		g = null;
	}

	/**
	 * Test metoda metode Dodaj gumu koja proverava da li metoda ispravno radi 
	 * u ocekivanim uslovima, kada guma nije null i ne postoji u listi
	 */
	@Test
	public void testDodajGumu() {
		g.setMarkaModel("Tigar 29OS");
		g.setPrecnik(21);
		g.setSirina(140);
		g.setVisina(60);
		v.dodajGumu(g);
		
		assertEquals(g, v.getGume().getFirst());
		
	}
	/**
	 * Test metoda metode Dodaj knjigu koja proverava rad metode za slucaj da korisnik
	 * unese Null vrednost kao parametar
	 */
	
	@Test(expected = java.lang.NullPointerException.class)
	public void testDodajGumuNull() {
		
		v.dodajGumu(null);
		
	}
	
	/*
	 * Test metoda metode dodaj gumu koja proverava rad metode za slucaj da korisnik
	 * pokusa da unese gumu koja vec postoji u listi 
	 * 	
	 */
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testDodajGumuVecPostoji() {
		
		g.setMarkaModel("Tigar 29OS");
		g.setPrecnik(21);
		g.setSirina(140);
		g.setVisina(60);
		v.dodajGumu(g);
		
		AutoGuma g1 = new AutoGuma();
		g1.setMarkaModel("Tigar 29OS");
		g1.setPrecnik(21);
		g1.setSirina(140);
		g1.setVisina(60);
		
		v.dodajGumu(g1);
	}

	/**
	 * Test metoda za metodu PronadjiGumu koja proverava reakciju metode za slucaj da 
	 * korisnik unese null vrednost kao parametar
	 */
	@Test
	public void testPronadjiGumu() {
		assertEquals(null, v.pronadjiGumu(null));
	}
	/**
	 * Test metoda metode Pronadji gumu koja proverava reakciju metode
	 * za slucaj kada guma nije pronadjena
	 */
	@Test
	public void testPronadjiGumuNePostoji() {
		
		assertEquals(0, v.pronadjiGumu("Tigar 29OS").size());
	}
	/**
	 * Test metoda metode PronadjiGumu koja proverava rad metode
	 * za slucaj kada u listi postoji tacno jedna guma koja odgovara 
	 * zadatom parametru
	 */
	@Test
	public void testPronadjiGumuJednaGuma() {
		g.setMarkaModel("Tigar 29OS");
		g.setPrecnik(21);
		g.setSirina(140);
		g.setVisina(60);
		v.dodajGumu(g);
		assertEquals(1, v.pronadjiGumu("Tigar 29OS").size());
	}
	/*
	 * Test metoda metode pronadji gumu koja proverava rad metode 
	 * za slucaj da u listi postoji vise guma koje odgovaraju unetom parametru
	 */
	@Test
	public void testPronadjiGumuViseGuma() {
		AutoGuma g1 = new AutoGuma();
		AutoGuma g2 = new AutoGuma();
		g.setMarkaModel("Tigar 29OS");
		g.setPrecnik(20);
		g.setSirina(141);
		g.setVisina(61);
		v.dodajGumu(g);
		g1.setMarkaModel("Tigar 29OS");
		g1.setPrecnik(21);
		g1.setSirina(140);
		g1.setVisina(60);
		v.dodajGumu(g1);
		g2.setMarkaModel("Tigar 29OS");
		g2.setPrecnik(22);
		g2.setSirina(142);
		g2.setVisina(63);
		v.dodajGumu(g2);
		assertEquals(3, v.pronadjiGumu("Tigar 29OS").size());
	}
	

}
