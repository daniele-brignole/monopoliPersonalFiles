package monopoli;

public class creaPartita {
	creaPartita(){};
	private int livello;
	private int soldiIniziali;
	private int numeroGiocatori;
	private int contrattiIniziali;
	
	public void setImpostazioni(int numeroGiocatori,int soldiIniziali, int contrattiIniziali){
		this.numeroGiocatori = numeroGiocatori;
		this.soldiIniziali = soldiIniziali;
		this.contrattiIniziali = contrattiIniziali;
	}
	public void setLivello(int livello){
		this.livello = livello;
	}
	public void start(Giocatore g){
		g.setSoldi(soldiIniziali);
		g.setContratti(contrattiIniziali);
	}
}
