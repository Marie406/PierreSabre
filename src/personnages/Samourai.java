package personnages;

public class Samourai extends Ronin {
	String seigneur;
	
	public Samourai(String seigneur, String nom, String boissonFav, int sommeArgent) {
		super(nom, boissonFav, sommeArgent);
		this.seigneur = seigneur;
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		this.parler("Je suis fier de servir le seigneur " + this.seigneur + ".");
	}
	
	
	public void boire(String boisson) {
		this.parler("Qu'est-ce que je vais choisir comme boisson ? Tiens je vais prendre du " + boisson + ".");
	}
	
}
