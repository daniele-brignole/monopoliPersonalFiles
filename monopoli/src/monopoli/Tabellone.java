package monopoli;
/**classe che rappresenta il tabellone di gioco
 * 
 * @author Daniele Brignole
 *
 */
public class Tabellone {
	
	/**
	 * The caselle.
	 */
	private Casella[] caselle = new Casella[12];
	/**inizializza il tabellone impostando le 13 caselle
	 * 
	 */
	Tabellone(){
		caselle[0] = new ProprietÓ(0,"Via",0,-1,1,1);
		caselle[1] = new ProprietÓ(1,"Vicolo Corto",6000,1,1,1);
		caselle[2] = new ProbabilitÓ(2,"probabilitÓ");
		caselle[3] = new ProprietÓ(3,"Vicolo Stretto",6000,1,1,1);
		caselle[4] = new Tasse(4,"Tassa patrimoniale",5000);
		caselle[5] = new ProprietÓ(5,"Stazione Sud",20000,10,1,1);
		caselle[6] = new ProprietÓ(6,"Bastioni Gran Sasso",10000,2,1,1);
		caselle[7] = new Imprevisti(7,"imprevisto");
		caselle[8] = new ProprietÓ(8,"Viale Monterosa",10000,2,1,1);
		caselle[9] = new ProprietÓ(9,"Viale Vesuvio",12000,2,1,1);
		caselle[10] = new ProprietÓ(10,"Prigione/transito",0,-1,1,1);
		caselle[11] = new ProprietÓ(11,"Via Accademia", 14000,3,1,1);
		caselle[12] = new ProprietÓ(12,"Via brigno", 50000,4,1,1);
	}
	/**cerca la casella sul tabellone corrispondente alla posizione richiesta
	 * 
	 * @param index posizione ricercata sul tabellone
	 * @return la casella corrispondente all'index
	 * 
	 */
	public Casella getCasella(int index){
		return caselle[index];
	}
}
