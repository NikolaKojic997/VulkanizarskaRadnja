package gume.radnja;

import java.util.LinkedList;
import gume.AutoGuma;
/**
 * 
 * Klasa koja predstavlja opis Vulkanizerske Radnje
 * Sadrzi listu svih guma koje se prodaju u radnji
 * 
 * @author Nikola Kojic
 * @version 0.0.1
 * 
 */
public class VulkanizerskaRadnja {
	/**
	 * Lista svih guma koje su dostupne u vulkanizerskoj radnji
	 * Lista objekata tipa AutoGuma
	 */
	private LinkedList<AutoGuma> gume = new LinkedList<AutoGuma>();
	
	/**
	 * Metoda koja dodaje novu gumu u listu guma koje su dostupne u vulkanizerskoj radnji
	 * Metoda dodjaje novu gumu samo ukoliko ona nije null i ukoliko vec nije u listi
	 * @param a predstavlja objekat tipa AutoGuma koji se unosi u listu
	 */
	
	public void dodajGumu(AutoGuma a) {
		if (a == null)
			throw new NullPointerException("Guma ne sme biti null");
		if (gume.contains(a))
			throw new RuntimeException("Guma vec postoji");
		gume.addFirst(a);
	}
	
	/**
	 * Metoda koja sluzi za pronalazenje guma u vulkanizerskoj radnji po kriterijumu Marke i modela
	 * @param markaModel predstavlja String na osnovu kojeg se vrsi pretraga liste
	 * @return {@link LinkedList} lista objekata tipa {@link AutoGuma} kojima je atribut markaModel 
	 * jednak unetom parametru
	 */

	public LinkedList<AutoGuma> pronadjiGumu(String markaModel) {
		if (markaModel == null)
			return null;
		LinkedList<AutoGuma> novaLista = new LinkedList<AutoGuma>();
		for (int i = 0; i < gume.size(); i++)
			if (gume.get(i).equals(markaModel))
				novaLista.add(gume.get(i));
		return novaLista;
	}
}
