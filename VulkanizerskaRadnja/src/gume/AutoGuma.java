package gume;
	/**
	 * 
	 * Klasa koja predstavlja opis auto gume u okviru jedne vulkanizerske radnje
	 * @author Nikola Kojic
	 * @version 0.0.1
	 * 
	 *
	 */
	public class AutoGuma {

		/**
		 * Marka i model gume
		 */
		private String markaModel = null;
		/**
		 * Precnik gume
		 */
		private int precnik = 0;
		/**
		 * Sirina gume
		 */
		private int sirina = 0;
		/**
		 * Visina gume
		 */
		private int visina = 0;
		
		/**
		 * Vraca vrednost atributa  MarkaModel
		 * @return MarkaModel kao String
		 */
		
		public String getMarkaModel() {
			return markaModel;
		}
		/**
		 * 
		 * @param markaModel je String koji predstavlja novu vrednost za atribut markaModel
		 * 
		 * @throws java.lang.RuntimeException ukoliko se kao parametar unese 
		 * null ili string kraci od 3 karaktera
		 *
		 */
		public void setMarkaModel(String markaModel) {
			if (markaModel==null || markaModel.length()<3)
				throw new RuntimeException("Morate uneti marku i model");
			this.markaModel = markaModel;
		}
		/**
		 * 
		 * Vraca vrednost atributa precnik
		 * @return precnik kao Integer
		 * 
		 */
		public int getPrecnik() {
			return precnik;
		}
		/**
		 * Postavlja novu vrednost za atribut precnik
		 * 
		 * @param precnik je Integer koji predstavlja novu vrednost za atribut precnik
		 * 
		 * @throws java.lang.RuntimeException ukoliko duzina Stringa precnik nije u granicama 13-22
		 *
		 */
		public void setPrecnik(int precnik) {
			if (precnik < 13 || precnik > 22)
				throw new RuntimeException("Precnik van opsega");
			this.precnik = precnik;
		}
		/**
		 * Vraca vrednost atributa sirina	
		 * @return sirina kao Integer
		 * 
		 */
		
		public int getSirina() {
			return sirina;
		}
		
		/**
		 * Postavlja novu vrednost za atribut sirina
		 * @param sirina je Integer koji predstavlja novu vrednost za atribut sirina
		 * @throws java.lang.RuntimeException ukoliko je parametar van opsega 135-335
		 */

		public void setSirina(int sirina) {
			if (sirina < 135 || sirina > 355)
				throw new RuntimeException("Sirina van opsega");
			this.sirina = sirina;
		}
		/**
		 * Vraca vrednost parametra visina
		 * @return visina kao Integer
		 */
		
		public int getVisina() {
			return visina;
		}
		/**
		 * Postavlja novu vrednost za parametar visina
		 * @param visina je Integer koji predstavlja novu vrednost za atribut visina
		 * @throws java.lang.RuntimeException ukoliko je visina van opsega 25-95
		 */
		
		public void setVisina(int visina) {
			if (visina < 25 || visina > 95)
				throw new RuntimeException("Visina van opsega");
			this.visina = visina;
		}
		/**
		 * Redefinisana toString metoda klase AutoGuma 
		 * @return String sa svim podacima o gumi
		 */
		@Override
		
		public String toString() {
			return "AutoGuma [markaModel=" + markaModel + ", precnik=" + precnik +
					", sirina=" + sirina + ", visina=" + visina + "]";
		}
		
		/**
		 * Redefinisana Equals metoda klase AutoGuma koja poredi dve gume po svim atributima
		 * @return boolean vrednost zavisno od toga jesu li poredjeni objekti isti
		 */

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			AutoGuma other = (AutoGuma) obj;
			if (markaModel == null) {
				if (other.markaModel != null)
					return false;
			} else if (!markaModel.equals(other.markaModel))
				return false;
			if (precnik != other.precnik)
				return false;
			if (sirina != other.sirina)
				return false;
			if (visina != other.visina)
				return false;
			return true;
}
}

