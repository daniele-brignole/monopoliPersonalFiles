package monopoli;

public class Contratto {
	private int affitto;
	private int houses;
	private boolean albergo;
	private int ipoteca;
	private Proprietà associata = null;
	public Contratto(int affitto,int ipoteca, Proprietà associata) {
		super();
		this.affitto = affitto;
		this.associata = associata;
		this.houses = 0;
		this.albergo = false;
		this.ipoteca = ipoteca;
	}
	public int calcolaAffitto(){
		if (associata.isIpotecata()) return  0;
		else {
			int a = affitto;
			if(associata.isZonaCompleta(associata.getProprietario())) return a = a*3;
			else if(houses > 0) return a = a*10*houses;
			else if (albergo) return a= a*100;
			else return a;
		}
	}
	public int getAffitto() {
		return affitto;
	}
	public void setAffitto(int affitto) {
		this.affitto = affitto;
	}
	public int getHouses() {
		return houses;
	}
	public void setHouses(int houses) {
		this.houses = houses;
	}
	public boolean isAlbergo() {
		return albergo;
	}
	public void setAlbergo(boolean albergo) {
		this.albergo = albergo;
	}
	public int getIpoteca() {
		return ipoteca;
	}
	public void setIpoteca(int ipoteca) {
		this.ipoteca = ipoteca;
	}
}
