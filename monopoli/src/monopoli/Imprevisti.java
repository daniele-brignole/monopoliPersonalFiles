package monopoli;

import java.util.Scanner;

public class Imprevisti extends Casella{

	Imprevisti(int p, String n) {
		super(p, n);
		posizione = p; nome = n;
	}

	@Override
	void attivaEffetto(Giocatore g) {
		// TODO Auto-generated method stub
		System.out.println("Pesca un imprevisto!");
	}

	@Override
	String getNome() {
		return nome;
	}

}
