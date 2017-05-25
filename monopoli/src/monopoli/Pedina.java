package monopoli;

import java.util.Scanner;

public class Pedina {
	Pedina(String nome){
		this.nome = nome;
		posizione = 0;
		tab = new Tabellone();
		
		attuale = tab.getCasella(0);
		//System.out.println("attuale: "+ attuale.getNome());
		
	}
	public void setProprietario(Giocatore g){
		proprietario = g;
	}
	public void muovi(){
		//if(scan == null) System.out.println("lo scanner � nullo");
		int d1 = proprietario.tiradado1();
		System.out.println(d1);
		int d2 = proprietario.tiradado2();
		System.out.println(d2);
		int sum = proprietario.makeSum(d1, d2);
		System.out.println(sum);
		for (int i = 0; i<sum;i++){
			posizione += 1;
			if (posizione == 40){
				posizione = 0;
				proprietario.setSoldi(proprietario.getSoldi()+20000);
			}
		}
		attuale = tab.getCasella(posizione);
		//if (tab.getCasella(posizione)== null) System.out.println("casella inesistente");
		System.out.println(tab.getCasella(posizione).getNome());
		attuale.attivaEffetto(proprietario);
		System.out.println("Dati "+this.proprietario.getNome()+ " Propriet�: "+ proprietario.getPropriet�inLista() + " soldi: " + proprietario.getSoldi());
		if(proprietario.isDouble(d1, d2)){
			System.out.println("doppio");
			ntiri++;
			if (ntiri == 3){
				proprietario.setPrigion();
				ntiri = 0;
				return;
			}
			muovi();
		}
		
	}
	public Casella getPosizione(){
		return attuale;
	}
	private String nome;
	private int posizione;
	private Tabellone tab;
	private Casella attuale = new Propriet�(0,"Via",0,-1,1,1);
	private int ntiri = 0;
	private Giocatore proprietario = null;
}
