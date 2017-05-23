package monopoli;

public class Pedina {
	Pedina(String nome){
		this.nome = nome;
		posizione = 0;
		tab = new Tabellone();
		attuale = tab.getCasella(0);
	}
	public void setProprietario(Giocatore g){
		proprietario = g;
	}
	public void muovi(){
		int d1 = proprietario.tiradado1();
		int d2 = proprietario.tiradado2();
		int sum = proprietario.makeSum(d1, d2);
		for (int i = 0; i<sum;i++){
			posizione += 1;
			if (posizione == 40){
				posizione = 0;
				proprietario.setSoldi(proprietario.getSoldi()+20000);
			}
		}
		attuale = tab.getCasella(posizione);
		//fa cose
		if(proprietario.isDouble(d1, d1)){
			ntiri++;
			if (ntiri == 3){
				proprietario.setPrigion();
				ntiri = 0;
				return;
			}
			muovi();
		}
		
	}
	private String nome;
	private int posizione;
	private Tabellone tab;
	private Casella attuale;
	private int ntiri = 0;
	private Giocatore proprietario = null;
}
