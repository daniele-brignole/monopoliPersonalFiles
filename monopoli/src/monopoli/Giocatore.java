package monopoli;

public class Giocatore {

	private String nome;
	private String password;
	private int soldi;
	private int countJail;
	private int ris1;
	private int ris2;
	private int sumofDice;
	private boolean prigion;
	private int contratti;
	
	public int getContratti() {
		return contratti;
	}
	public void setContratti(int contratti) {
		this.contratti = contratti;
	}
	public void pay(Giocatore g, int soldi){
		this.soldi = this.soldi - soldi;
		g.soldi = g.soldi + soldi;
	}
	public void pay(int soldi){
		this.soldi -= soldi;
	}
	public int tiradado1(){
		return ris1 =(int)(Math.random()*6+1);
	}
	public int tiradado2(){
		return ris2 =(int)(Math.random()*6+1);
	}
	public int makeSum(int dado1, int dado2){
		return sumofDice = dado1 + dado2;
	}
	public boolean isDouble(int dado1, int dado2){
		if (dado1 == dado2) return true;
		else return false;
	}
	public void setPrigion(){
		this.prigion = true;
	}
	public void setFree(){
		this.prigion = false;
	}
	public void addPartita(int l, int g,int s, int c){
		creaPartita cP = new creaPartita();
		cP.setLivello(l);
		cP.setImpostazioni(g, s, c);
		cP.start(this);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getSoldi() {
		return soldi;
	}
	public void setSoldi(int soldi) {
		this.soldi = soldi;
	}
	public int getSumofDice() {
		return sumofDice;
	}
	public void setSumofDice(int sumofDice) {
		this.sumofDice = sumofDice;
	}
}
