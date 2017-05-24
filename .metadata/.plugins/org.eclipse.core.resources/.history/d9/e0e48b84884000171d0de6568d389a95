package monopoli;

import java.io.IOException;
import java.util.ArrayList;

public class Partita {
	private int nGiocatori;
	private int counterTurni;
	private ArrayList<Giocatore> players;
	private ArrayList<Giocatore> order;
	private Giocatore giocatoreDiTurno;
	private ArrayList<Integer> risultati;
	private int g = 0;
	Partita(int nG, ArrayList<Giocatore> players){
		nGiocatori = nG;
		this.players = new ArrayList<Giocatore>(players);
		Tabellone tabellone = new Tabellone();
		for (int y = 0; y < nGiocatori; y++){
			int dado1 = this.players.get(y).tiradado1();
			int dado2 = this.players.get(y).tiradado2();
			risultati.add(this.players.get(y).makeSum(dado1, dado2));
		}
		int max = -1;
		for (int i = 0; i < nGiocatori; i++){
			for(int j = i; j < nGiocatori; j++){
				if (risultati.get(i) >= risultati.get(j)) max = i;
				else max = j;
			}
			order.add(this.players.get(max));
		}
		giocatoreDiTurno = this.order.get(0);
	}
	public void passaGiocatore(){
		g++;
		if (g > nGiocatori) g = 0;
		giocatoreDiTurno = order.get(g);
	}
	public void generaPedine(){
		Pedina fungo = new Pedina("Fungo");
		Pedina pera = new Pedina("Pera");
		Pedina Candela = new Pedina("Candela");
		Pedina Cactus = new Pedina("Cactus");
		Pedina Arancia = new Pedina("Arancia");
		Pedina Vino = new Pedina("Vino");
		int choice;
		for (int i = 0; i < nGiocatori; i++){
			choice = -1;
			while(choice == -1){
				try {
					choice = order.get(i).makeChoice();
				} catch (IOException e) {
				// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if (choice == -1 ){
					System.out.println("Input errato riprovare");
				}
			}
			switch(choice){
			case 0:
				order.get(i).setPedina(fungo);
				break;
			case 1:
				order.get(i).setPedina(pera);
				break;
			case 2:
				order.get(i).setPedina(Candela);
				break;
			case 3:
				order.get(i).setPedina(Cactus);
				break;
			case 4:
				order.get(i).setPedina(Arancia);
				break;
			case 5:
				order.get(i).setPedina(Vino);
			}
		}
	}
}
