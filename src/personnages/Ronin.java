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
	
	public void provoquer(Yakuza adversaire) {
		int force = this.honneur*2;
		this.parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand !");
		if(force >= adversaire.getReputation()) {
			int sommeVersee = adversaire.getArgent();
			this.gagnerArgent(sommeVersee);
			this.honneur += 1;
			this.parler("Je t’ai eu petit yakusa !");
			adversaire.perdre();
			adversaire.perdreArgent(sommeVersee);
		}
		else {
			this.honneur -= 1;
			int sommeVersee = this.getArgent();
			this.perdreArgent(sommeVersee);
			adversaire.gagnerArgent(sommeVersee);
			this.parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			adversaire.gagner(sommeVersee);
		}
	}
}
