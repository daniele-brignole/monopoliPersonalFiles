package monopoli;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * 
 * @author Daniele Brignole
 * La classe Giocatore contiene gli attributi e i metodi dell'utente che desidera giocare a monopoli
 *
 */

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
	/**
	 * 
	 * @param g giocatore da pagare
	 * @param soldi quantit� da pagare
	 * Paga il giocatore g la somma di denaro soldi
	 */
	public void pay(Giocatore g, int soldi){
		this.soldi = this.soldi - soldi;
		g.soldi = g.soldi + soldi;
	}
	/**
	 * 
	 * @param soldi quantit� da pagare
	 * pagamento alla banca
	 */
	public void pay(int soldi){
		this.soldi -= soldi;
	}
	
	/**
	 * 
	 * @return risultato del primo dado lanciato
	 * tira il primo dado
	 */
	public int tiradado1(){
		return ris1 =(int)(Math.random()*6+1);
	}
	/**
	 * 
	 * @return risultato del secondo dado lanciato
	 * tira il secondo dado
	 */
	public int tiradado2(){
		return ris2 =(int)(Math.random()*6+1);
	}
	/**
	 * 
	 * @param dado1 il primo risultato del dado
	 * @param dado2 il secondo risultato del dado
	 * @return la somma dei due dadi
	 */
	public int makeSum(int dado1, int dado2){
		return sumofDice = dado1 + dado2;
	}
	/**
	 * 
	 * @param dado1 il primo risultato del dado
	 * @param dado2 il secondo risultato del dado
	 * @return true se sono uguali, false altrimenti
	 * controlla se il tiro seffettuato � un doppio
	 */
	public boolean isDouble(int dado1, int dado2){
		if (dado1 == dado2) return true;
		else return false;
	}
	/**
	 * manda in prigione il giocatore
	 */
	public void setPrigion(){
		this.prigion = true;
	}
	/**
	 * libera il giocatore
	 */
	public void setFree(){
		this.prigion = false;
	}
	/**
	 * 
	 * @param l livello di segretezza della partita   1 pubblica 2 privata
	 * @param g numero di giocatori
	 * @param s numero di soldi iniziali
	 * @param c numero di contratti iniziali
	 * @return la partita creata
	 * metodo che crea una nuova partita con i parametri inseriti
	 */
	public Partita addPartita(int l, int g,int s, int c){
		Partita partita = null;
		creaPartita cP = new creaPartita();
		cP.setLivello(l);
		cP.setImpostazioni(g, s, c);
		partita = cP.start(this);
		return partita;
	}
	/**
	 * 
	 * @return intero inserito da console se � 0....5, -1 altrimenti
	 * @throws IOException
	 * riceve un intero da console, controlla se � un numero da 0 a 5 e lo ritorna
	 */
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
	/**
	 * 
	 * @param p propriet� aggiunta
	 * aggiunge una propriet� alla lista di propriet� possedute dal giocatore
	 */
	public void addPropriety(Propriet� p){
		myProperties.add(p);
	}
	/**
	 * 
	 * @param p rimuove una propriet� dalla lista di propriet� possedute dal giocatore
	 */
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
