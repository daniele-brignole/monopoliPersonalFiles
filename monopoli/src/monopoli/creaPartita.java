package monopoli;

import java.util.ArrayList;
/**classe di aiuto per la creazione della partita
 * @author Daniele Brignole
 * 
 */
public class creaPartita {
	/**inizializza l'oggetto
	 * 
	 */
	creaPartita(){};
	private int livello;
	private int soldiIniziali;
	private int numeroGiocatori;
	private int contrattiIniziali;
	private ArrayList<Giocatore> partecipanti = new ArrayList<Giocatore>();
	
	/**setta le impostazioni della partita volute dall'utente
	 * 
	 * @param numeroGiocatori numero di giocatori
	 * @param soldiIniziali soldi iniziali
	 * @param contrattiIniziali contratti iniziali
	 * 
	 */
	public void setImpostazioni(int numeroGiocatori,int soldiIniziali, int contrattiIniziali){
		this.numeroGiocatori = numeroGiocatori;
		this.soldiIniziali = soldiIniziali;
		this.contrattiIniziali = contrattiIniziali;
	}
	/**setta il livello di segretezza della partita
	 * 
	 * @param livello livello di privatezza pubblico 1 privato 2
	 * 
	 */
	public void setLivello(int livello){
		this.livello = livello;
	}
	/**inizializza e crea la partita
	 * 
	 * @param g giocatore che crea la partita
	 * @return La partita creata
	 * 
	 */
	public Partita start(Giocatore g){
		g.setSoldi(soldiIniziali);
		g.setContratti(contrattiIniziali);
		partecipanti.add(g);
		Partita partita = new Partita(numeroGiocatori,partecipanti);
		if (partita != null) System.out.println("gioco creato");
		return partita;
	}
}
