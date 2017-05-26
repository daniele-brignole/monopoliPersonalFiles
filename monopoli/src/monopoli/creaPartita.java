package monopoli;

import java.util.ArrayList;
/**
 * @author Daniele Brignole
 * classe di aiuto per la creazione della partita
 */
public class creaPartita {
	creaPartita(){};
	private int livello;
	private int soldiIniziali;
	private int numeroGiocatori;
	private int contrattiIniziali;
	private ArrayList<Giocatore> partecipanti = new ArrayList<Giocatore>();
	
	/**
	 * 
	 * @param numeroGiocatori numero di giocatori
	 * @param soldiIniziali soldi iniziali
	 * @param contrattiIniziali contratti iniziali
	 * setta le impostazioni della partita volute dall'utente
	 */
	public void setImpostazioni(int numeroGiocatori,int soldiIniziali, int contrattiIniziali){
		this.numeroGiocatori = numeroGiocatori;
		this.soldiIniziali = soldiIniziali;
		this.contrattiIniziali = contrattiIniziali;
	}
	/**
	 * 
	 * @param livello livello di privatezza pubblico 1 privato 2
	 * setta il livello di segretezza della partita
	 */
	public void setLivello(int livello){
		this.livello = livello;
	}
	/**
	 * 
	 * @param g giocatore che crea la partita
	 * @return La partita creata
	 * inizializza e crea la partita
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
