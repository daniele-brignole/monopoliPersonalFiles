package monopoli;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Giocatore {

	private String nome;
	private String password;
	private int soldi;
	private int countJail;
	private int ris1;
	private int ris2;
	private int sumofDice;
	private boolean prigion;
	private ArrayList<Propriet�> myProperties = new ArrayList<Propriet�>();
	private int contratti;
	private Pedina pedina = null;
	
	Giocatore(String nome, String psw){this.nome=nome;password=psw;}
	public String getPropriet�inLista(){
		String lista = "";
		for(int i = 0; i< myProperties.size();i++){
			lista = lista + myProperties.get(i).getNome() + " ";
		}
		return lista;
	}
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
	public Partita addPartita(int l, int g,int s, int c){
		Partita partita = null;
		creaPartita cP = new creaPartita();
		cP.setLivello(l);
		cP.setImpostazioni(g, s, c);
		partita = cP.start(this);
		return partita;
	}
	public int makeChoice() throws IOException{
		Scanner scan = new Scanner(System.in);
		int choice = scan.nextInt();
		//scan.close();
		if (choice == 0 || choice == 1 || choice == 2 || choice == 3 || choice == 4 || choice == 5) return choice;
		else return -1;
	}
	public void setPedina(Pedina pedina){
		this.pedina = pedina;
	}
	public Pedina getPedina(){
		return pedina;
	}
	public void addPropriety(Propriet� p){
		myProperties.add(p);
	}
	public void removeProperty(Propriet� p){
		myProperties.remove(p);
	}
	public ArrayList<Propriet�> getListOfProperties(){
		return this.myProperties;
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
