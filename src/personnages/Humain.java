package personnages;

public class Humain {
	private static final int TAILLEMAX = 30;
	
	private String nom;
	private String boissonFav;
	protected int sommeArgent;
	protected int nbConnaissance = 0;
	protected Humain [] memoire = new Humain[TAILLEMAX];
	
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
	
	protected void gagnerArgent(int sommeGagnée) {
		this.sommeArgent += sommeGagnée;
	}
	
	protected void perdreArgent(int sommePerdue) {
		this.sommeArgent -= sommePerdue;
	}
	
	private void memoriser(Humain rencontre) {
		if(this.nbConnaissance<TAILLEMAX) {
			this.memoire[nbConnaissance] = rencontre;
			this.nbConnaissance +=1;
		}
		else {
			for(int i = 0; i<nbConnaissance-1; i++) {
				this.memoire[i] = this.memoire[i+1];
			}
			this.memoire[nbConnaissance-1] = rencontre;
		}
	}
	
	private void repondre(Humain qqun) {
		this.direBonjour();
		this.memoriser(qqun);
	}
	
	public void faireConnaissanceAvec(Humain autreHumain) {
		this.direBonjour();
		autreHumain.repondre(this);
		this.memoriser(autreHumain);
	}
	
	public void listerConnaissance() {
		if (this.nbConnaissance == 0){
			this.parler("Je ne connais personne.");
			return;
		}
		String chaine = "Je connais beaucoup de monde dont : ";
		for(int i = 0; i < nbConnaissance-1; i++) {
			chaine = chaine + this.memoire[i].getNom() + ", ";
		}
		chaine = chaine + this.memoire[nbConnaissance-1].getNom() + ".";
		this.parler(chaine);
	}
	
	
	
	
}
