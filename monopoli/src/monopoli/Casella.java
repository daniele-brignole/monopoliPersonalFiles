package monopoli;

import java.util.Scanner;
/**classe generica di una casella del tabellone, i suoi metodi
 * sono astratti così da venire implementati in modo diverso 
 * in base al tipo di casella da rappresentare
 * 
 * @author Daniele Brignole
 * 
 *
 */
public abstract class Casella {
	protected int posizione;
	protected String nome;
	/**
	 * inizializza l'oggetto casella
	 * @param p posizione della casella
	 * @param n nome della casella
	 */
	Casella(int p, String n) {
	}
	/**attiva l'effetto relativo alla casella su cui è finito il giocatore
	 * 	
	 * @param g giocatore che termina sulla casella
	 * 
	 */
	abstract void attivaEffetto(Giocatore g);
	abstract String getNome();
}
