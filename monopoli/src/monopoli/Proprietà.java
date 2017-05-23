package monopoli;

import java.util.ArrayList;

public class ProprietÓ extends Casella {
	/*
	private static int fucsia = 1;
	private static int blu = 2;
	private static int arancione = 3;
	private static int marrone = 4;
	private static int rosso = 5;
	private static int giallo = 6;
	private static int verde = 7;
	private static int viola = 8;
	*/
	private int zona;
	private int valore;
	private boolean stato = false;
	private Giocatore proprietario = null;
	private boolean ipotecata = false;
	private int numeroCase = 0;
	private int albergo = 0;
	ProprietÓ(int p, String n, int valore, int colore) {
		super(p,n);
		posizione = p;
		nome = n;
		this.valore = valore;
		this.zona = colore;
		// TODO Auto-generated constructor stub
	}
	public void pagaAffitto(Giocatore pagante){
		
	}
	public boolean isOccupata(){
		return stato;
	}
	public boolean costruisciCase(int ncase, Banca banca){
		int remainder = banca.getCaseTotali() - ncase;
		if ( remainder < 0 ) {
			System.out.println("Case non disponibili in banca");
			return false;
		}
		else {
			banca.setCaseTotali(remainder);
			numeroCase = numeroCase + ncase;
			return true;
		}
	}
	public boolean costruisciAlbergo(int albergo, Banca banca){
		if (numeroCase != 4){
			System.out.println("Case non sufficienti, necessarie 4 case per costruire l'albergo");
			return false;
		}
		int remainder = banca.getAlberghi() - albergo;
		if ( remainder < 0 ) {
			System.out.println("Albergho non disponibile in banca");
			return false;
		}
		else {
			banca.setAlberghi(remainder);
			this.albergo = 1;
			return true;
		}
	}
	public boolean isZonaCompleta(Giocatore g){
		int zoneTotali; int z=0;
		if (zona == 1 || zona == 8) zoneTotali = 2;
		if (zona == 10) zoneTotali = 4;
		if (zona == 11) zoneTotali = 2;
		else zoneTotali = 3;
		ArrayList<ProprietÓ> myProperties = new ArrayList<ProprietÓ>(g.getListOfProperties());
		for (int i = 0; i < myProperties.size();i++){
			if(myProperties.get(i).zona == this.zona) z++;
		}
		if (z!=zoneTotali) return false;
		return true;
	}
	public boolean compra(Giocatore g){
		if (g.getSoldi() < this.valore) {
			System.out.println("Soldi insufficienti");
			return false;
		}
		g.setSoldi(g.getSoldi() - this.valore);
		g.addPropriety(this);
		return true;
	}

}
