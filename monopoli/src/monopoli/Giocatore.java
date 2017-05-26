package monopoli;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
/**La classe Giocatore contiene gli attributi e i metodi 
 * dell'utente che desidera giocare a monopoli
 * 
 * @author Daniele Brignole
 * 
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
	private ArrayList<Proprietà> myProperties = new ArrayList<Proprietà>();
	private int contratti;
	private Pedina pedina = null;
	/**inizializza l'oggetto giocatore
	 * 
	 * @param nome nome del giocatore
	 * @param psw password del giocatore
	 */
	Giocatore(String nome, String psw){this.nome=nome;password=psw;}
	
	public String getProprietàinLista(){
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
	/**Paga il giocatore g la somma di denaro soldi
	 * 
	 * @param g giocatore da pagare
	 * @param soldi quantità da pagare
	 * 
	 */
	public void pay(Giocatore g, int soldi){
		this.soldi = this.soldi - soldi;
		g.soldi = g.soldi + soldi;
	}
	/**pagamento alla banca
	 * 
	 * @param soldi quantità da pagare
	 * 
	 */
	public void pay(int soldi){
		this.soldi -= soldi;
	}
	
	/**tira il primo dado
	 * 
	 * @return risultato del primo dado lanciato
	 * 
	 */
	public int tiradado1(){
		return ris1 =(int)(Math.random()*6+1);
	}
	/**tira il secondo dado
	 * 
	 * @return risultato del secondo dado lanciato
	 * 
	 */
	public int tiradado2(){
		return ris2 =(int)(Math.random()*6+1);
	}
	/**fa la somma dei due dadi
	 * 
	 * @param dado1 il primo risultato del dado
	 * @param dado2 il secondo risultato del dado
	 * @return la somma dei due dadi
	 */
	public int makeSum(int dado1, int dado2){
		return sumofDice = dado1 + dado2;
	}
	/**controlla se il tiro seffettuato è un doppio
	 * 
	 * @param dado1 il primo risultato del dado
	 * @param dado2 il secondo risultato del dado
	 * @return true se sono uguali, false altrimenti
	 * 
	 */
	public boolean isDouble(int dado1, int dado2){
		if (dado1 == dado2) return true;
		else return false;
	}
	/**manda in prigione il giocatore
	 * 
	 */
	public void setPrigion(){
		this.prigion = true;
	}
	/**libera il giocatore
	 * 
	 */
	public void setFree(){
		this.prigion = false;
	}
	/**metodo che crea una nuova partita con i parametri inseriti
	 * 
	 * @param l livello di segretezza della partita   1 pubblica 2 privata
	 * @param g numero di giocatori
	 * @param s numero di soldi iniziali
	 * @param c numero di contratti iniziali
	 * @return la partita creata
	 * 
	 */
	public Partita addPartita(int l, int g,int s, int c){
		Partita partita = null;
		creaPartita cP = new creaPartita();
		cP.setLivello(l);
		cP.setImpostazioni(g, s, c);
		partita = cP.start(this);
		return partita;
	}
	/**riceve un intero da console, controlla se è un numero da 0 a 5 e lo ritorna
	 * 
	 * @return intero inserito da console se è 0....5, -1 altrimenti
	 * @throws IOException
	 * 
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
	/**aggiunge una proprietà alla lista di proprietà possedute dal giocatore
	 * 
	 * @param p proprietà aggiunta
	 * 
	 */
	public void addPropriety(Proprietà p){
		myProperties.add(p);
	}
	/**rimuove una proprietà dalla lista di proprietà possedute dal giocatore
	 * 
	 * @param p proprietà da rimuovere
	 */
	public void removeProperty(Proprietà p){
		myProperties.remove(p);
	}
	public ArrayList<Proprietà> getListOfProperties(){
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
