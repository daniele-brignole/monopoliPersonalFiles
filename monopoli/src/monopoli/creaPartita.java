package monopoli;

import java.util.ArrayList;

public class creaPartita {
	creaPartita(){};
	private int livello;
	private int soldiIniziali;
	private int numeroGiocatori;
	private int contrattiIniziali;
	private ArrayList<Giocatore> partecipanti = new ArrayList<Giocatore>();
	
	public void setImpostazioni(int numeroGiocatori,int soldiIniziali, int contrattiIniziali){
		this.numeroGiocatori = numeroGiocatori;
		this.soldiIniziali = soldiIniziali;
		this.contrattiIniziali = contrattiIniziali;
	}
	public void setLivello(int livello){
		this.livello = livello;
	}
	public Partita start(Giocatore g){
		g.setSoldi(soldiIniziali);
		g.setContratti(contrattiIniziali);
		partecipanti.add(g);
		Partita partita = new Partita(numeroGiocatori,partecipanti);
		if (partita != null) System.out.println("gioco creato");
		return partita;
	}
}
