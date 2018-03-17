/**
 * 
 */
package gume;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Administrator
 *
 */
public class AutoGumaTest {
	private AutoGuma a;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		a = new AutoGuma();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		a = null;
	}

	/**
	 * Test metoda za metodu setMarkaModel koja proverava ponasanje metode kada se 
	 * unese vrednost koja zadovoljava sva pravila
	 */
	@Test
	public void testSetMarkaModel() {
		a.setMarkaModel("Tigar AC93");
		assertEquals("Tigar AC93", a.getMarkaModel());
	}
	/**
	 * Test metoda za metodu setMarkaModel koja proverava ponasanje metode kada se 
	 * unese null vrednost 
	 */
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelNull() {
		a.setMarkaModel(null);
		
	}
	/**
	 * Test metoda za metodu setMarkaModel koja proverava ponasanje metode kada se 
	 * unese vrednost koja je kraca od 3 karaktera 
	 */
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelManjeOdTri() {
		a.setMarkaModel("AC");
		
	}

	/**
	 * Test metoda za metodu setPrecnik koja proverava ponasanje metode kada se 
	 * unese vrednost koja je u dozvoljenim okvirima
	 */
	@Test
	public void testSetPrecnik() {
		a.setPrecnik(20);
		assertEquals(20, a.getPrecnik());
	}
	/**
	 * Test metoda za metodu setPrecnik koja proverava ponasanje metode kada se 
	 * unese vrednost koja je manja od naznacene 
	 */
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPrecnikManje() {
		a.setPrecnik(12);
		
	}
	/**
	 * Test metoda za metodu setPrecnik koja proverava ponasanje metode kada se 
	 * unese vrednost koja je veca od naznacene
	 */
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetPrecnikVise() {
		a.setPrecnik(40);
		
	}

	/**
	 * Test metoda za metodu setSirina koja proverava ponasanje metode kada se 
	 * unese vrednost koja je u dozvoljenim okvirima
	 */
	 
	@Test
	public void testSetSirina() {
		a.setSirina(200);
		assertEquals(200, a.getSirina());
	}
	/**
	 * Test metoda za metodu setSirina koja proverava ponasanje metode kada se 
	 * unese vrednost koja je manja od naznacene
	 */
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetSirinaManje() {
		a.setSirina(100);
		
	}
	/**
	 * Test metoda za metodu setSirina koja proverava ponasanje metode kada se 
	 * unese vrednost koja je veca od naznacene
	 */
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetSirinaVise() {
		a.setSirina(400);
		
	}

	/**
	 * Test metoda za metodu setVisina koja proverava ponasanje metode kada se 
	 * unese vrednost koja je u dozvoljenim okvirima
	 */
	@Test
	public void testSetVisina() {
		a.setVisina(50);
		assertEquals(50, a.getVisina());
	}
	/**
	 * Test metoda za metodu setVisina koja proverava ponasanje metode kada se 
	 * unese vrednost veca od naznacene
	 */
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetVisinaManje() {
		a.setVisina(20);
		
	}
	/**
	 * Test metoda za metodu setVisina koja proverava ponasanje metode kada se 
	 * unese vrednost manja od naznacene
	*/
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetVisinaVise() {
		a.setVisina(100);
		
	}
	/**
	 * Test metoda za redefinisanu metodu toString koja proverava da li 
	 * toString metoda vraca String u obliku kom mi zelimo
	 */
	@Test
	public void testToString() {
		a.setMarkaModel("Tigar AC32");
		a.setPrecnik(20);
		a.setSirina(200);
		a.setVisina(90);
		assertEquals("AutoGuma [markaModel=Tigar AC32, precnik=20, sirina=200, visina=90]", a.toString());
	}

	/**
	 * Test metoda za redefinisanu equals metodu koja proverava 
	 * da li Equals vraca true vrednost kada su objekti isti
	 */
	@Test
	public void testEqualsObjectTrue() {
		a.setMarkaModel("Tigar AC97");
		a.setPrecnik(20);
		a.setSirina(200);
		a.setVisina(90);
		
		AutoGuma a1 = new AutoGuma();
		
		a1.setMarkaModel("Tigar AC97");
		a1.setPrecnik(20);
		a1.setSirina(200);
		a1.setVisina(90);
		
		assertEquals(true, a.equals(a1));
	}
	/**
	 * Test metoda za redefinisanu equals metodu koja proverava 
	 * da li Equals vraca false vrednost kada objekti nisu isti
	 */
	@Test
	public void testEqualsObjectFalse() {
		a.setMarkaModel("Tigar AC98");
		a.setPrecnik(20);
		a.setSirina(200);
		a.setVisina(90);
		
		AutoGuma a1 = new AutoGuma();
		
		a1.setMarkaModel("Tigar AC97");
		a1.setPrecnik(20);
		a1.setSirina(200);
		a1.setVisina(90);
		
		assertEquals(false, a.equals(a1));
	}
}
