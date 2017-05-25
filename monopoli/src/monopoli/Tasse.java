package monopoli;

import java.util.Scanner;

public class Tasse extends Casella{

	Tasse(int p, String n) {
		super(p, n);
		posizione = p; nome = n;
	}

	@Override
	void attivaEffetto(Giocatore g) {
		System.out.println("Tasse devi pagare 1000 lire!");
		g.setSoldi(g.getSoldi()-1000);
	}

	@Override
	String getNome() {
		return nome;
	}

}
