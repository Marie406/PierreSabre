package personnages;

public class Ronin extends Humain {
	private int honneur = 1;
	
	public Ronin(String nom, String boissonFav, int sommeArgent) {
		super(nom, boissonFav, sommeArgent);
	}
	
	public void donner(Commercant beneficiaire) {
		int sommeDonnee = this.getArgent()/10;
		this.parler(beneficiaire.getNom() + " prend ces " + Integer.toString(sommeDonnee) + " sous.");
		this.perdreArgent(sommeDonnee);
		beneficiaire.recevoir(sommeDonnee);
	}
	
}
