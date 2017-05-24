package monopoli;

import java.io.IOException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Giocatore g = new Giocatore("Daniele","gorillaBello92");
		Partita partita = null;
		System.out.println("Buongiorno "+ g.getNome() + ", cosa desideri fare? (premi pulsante qualunque per iniziare)");
		Scanner s1 = new Scanner(System.in);
		s1.next();
		//s1.close();
		show("Scegliere impostazioni");
		int lev,gioc,soldi,contratti;
		show("Imposta livello: 1 pubblico 2 privato");
		lev = s1.nextInt();
		show("Imposta il numero di giocatori //beta test 1 giocatore");
		gioc = 1;
		show("Imposta il numero di soldi iniziali:");
		soldi = s1.nextInt();
		show("Imposta il numero di contratti iniziali:");
		contratti = s1.nextInt();
		partita = g.addPartita(lev, gioc, soldi, contratti);
		show("Scegli la tua pedina ....");
		partita.generaPedine();
		show("Tira i dadi e muovi la pedina");
		g.getPedina().muovi(s1);
		show("Sei su " + g.getPedina().getPosizione().getNome());
		
	}
	public static void show(String text){
		System.out.println(text);
	}

}