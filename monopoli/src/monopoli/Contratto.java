package monopoli;
/**classe che rappresenta il contratto di una proprietÓ, serve per contenere i 
 * dati di ipoteca e dell'affitto
 * 
 * @author Daniele Brignole
 * 
 *
 */
public class Contratto {
	private int affitto;
	private int houses;
	private boolean albergo;
	private int ipoteca;
	private ProprietÓ associata = null;
	/**inizializza l'oggetto contratto
	 * 
	 * @param affitto affitto base non modificato della proprietÓ
	 * @param ipoteca valore di ipoteca della casa
	 * @param associata proprietÓ associata a questo contratto
	 */
	public Contratto(int affitto,int ipoteca, ProprietÓ associata) {
		super();
		this.affitto = affitto;
		this.associata = associata;
		this.houses = 0;
		this.albergo = false;
		this.ipoteca = ipoteca;
	}
	/** metodo che calcola l'affitto di questa proprietÓ in base a
	 * - zona completa
	 * - numero di case
	 * - presenza di albergo
	 * 
	 * @return l'affitto effettivo della proprietÓ
	 *
	 */
	public int calcolaAffitto(){
		if (associata.isIpotecata()) return  0;
		else {
			int a = affitto;
			if(associata.isZonaCompleta(associata.getProprietario())) return a = a*3;
			else if(houses > 0) return a = a*10*houses;
			else if (albergo) return a= a*100;
			else return a;
		}
	}
	public int getAffitto() {
		return affitto;
	}
	public void setAffitto(int affitto) {
		this.affitto = affitto;
	}
	public int getHouses() {
		return houses;
	}
	public void setHouses(int houses) {
		this.houses = houses;
	}
	public boolean isAlbergo() {
		return albergo;
	}
	public void setAlbergo(boolean albergo) {
		this.albergo = albergo;
	}
	public int getIpoteca() {
		return ipoteca;
	}
	public void setIpoteca(int ipoteca) {
		this.ipoteca = ipoteca;
	}
}
