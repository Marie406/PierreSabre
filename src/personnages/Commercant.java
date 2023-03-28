package personnages;

public class Commercant extends Humain {
	
	public Commercant(String nom, String boissonFav, int sommeArgent) {
		super(nom, boissonFav, sommeArgent);
	}

	public int seFaireExtorquer() {
		int sommePerdue = this.getArgent();
		this.perdreArgent(sommePerdue);
		this.parler("J’ai tout perdu ! Le monde est trop injuste...");
		return sommePerdue;
	}
	 public void recevoir(int argent) {
		 this.gagnerArgent(argent);
		 this.parler(Integer.toString(argent) + " sous ! Je te remercie généreux donateur !");
	 }
	 
	 
}
