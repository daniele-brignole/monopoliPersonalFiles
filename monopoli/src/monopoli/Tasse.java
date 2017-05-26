package monopoli;

import java.util.Scanner;
/**classe della casella tasse, estende la classe Casella
 * 
 */
public class Tasse extends Casella{
	/**
	 * inizializza l'oggetto tasse
	 * @param p posizione nel tabellone
	 * @param n nome della casella
	 */
	Tasse(int p, String n) {
		super(p, n);
		posizione = p; nome = n;
	}
	/**attiva l'effetto della casella, facendo pagare il giocatore
	 * @param g giocatore che finisce sulla cassella tasse
	 * 
	 */
	@Override
	void attivaEffetto(Giocatore g) {
		System.out.println("Tasse devi pagare 1000 lire!");
		g.pay(1000);
	}

	@Override
	String getNome() {
		return nome;
	}

}
