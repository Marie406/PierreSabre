package personnages;

public class Humain {
	private String nom;
	private String boissonFav;
	protected int sommeArgent;
	
	//elle ne sert que pour les humains donc doit être privée
	protected void parler(String texte) {
		System.out.println("(" + nom + ") - " + texte);
	}
	
	public Humain(String nom, String boissonFav, int sommeArgent) {
		this.nom = nom;
		this.boissonFav = boissonFav;
		this.sommeArgent = sommeArgent;
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getArgent() {
		return sommeArgent;
	}
	
	public void direBonjour() {
		this.parler("Bonjour ! Je m'appelle " + this.getNom() + " et j'aime boire du " + this.boissonFav + ".");
	}
	
	public void boire() {
		this.parler("Mmmm, un bon verre de " + this.boissonFav + "! GLOUPS !");
	}
	
	public void acheter(String bien, int prix) {
		if (prix<=this.getArgent()) {
			this.parler("J'ai " + this.getArgent()+ " sous en poche. Je vais pouvoir m'offrir un.e " + bien + " à " + Integer.toString(prix) + " sous.");
			this.perdreArgent(prix);
		}
		else 
			this.parler("Je n'ai plus que " + Integer.toString(this.getArgent()) + " sous en poche. Je ne peux même pas m'offrir un.e " + bien + " à " + Integer.toString(prix)+ " sous.");
	}
	
	public void gagnerArgent(int sommeGagnée) {
		this.sommeArgent += sommeGagnée;
	}
	
	public void perdreArgent(int sommePerdue) {
		this.sommeArgent -= sommePerdue;
	}
	
	
	
}
