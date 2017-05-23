package monopoli;

public class Tabellone {
	private Casella[] caselle = new Casella[39];
	Tabellone(){
		caselle[0] = new Propriet�(0,"Via",0,-1);
		caselle[1] = new Propriet�(1,"Vicolo Corto",6000,1);
		caselle[2] = new Probabilit�(2,"probabilit�");
		caselle[3] = new Propriet�(3,"Vicolo Stretto",6000,1);
		caselle[4] = new Tasse(4,"Tassa patrimoniale");
		caselle[5] = new Propriet�(5,"Stazione Sud",20000,10);
		caselle[6] = new Propriet�(6,"Bastioni Gran Sasso",10000,2);
		caselle[7] = new Imprevisti(7,"imprevisto");
		caselle[8] = new Propriet�(8,"Viale Monterosa",10000,2);
		caselle[9] = new Propriet�(9,"Viale Vesuvio",12000,2);
		caselle[10] = new Propriet�(10,"Prigione/transito",0,-1);
		caselle[11] = new Propriet�(11,"Via Accademia", 14000,3);
	}
	public Casella getCasella(int index){
		return caselle[index];
	}
}