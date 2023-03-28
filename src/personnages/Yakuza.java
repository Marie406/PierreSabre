package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;
	
	public Yakuza(String nom, String boissonFav, int sommeArgent, String clan) {
		super(nom, boissonFav, sommeArgent);
		this.clan = clan;
	}
	
	public void extorquer(Commercant victime) {
		this.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		this.parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		int sommeVolee = victime.seFaireExtorquer();
		this.gagnerArgent(sommeVolee);
		this.reputation +=1;
		this.parler("J’ai piqué les " + sommeVolee + " sous de " + victime.getNom() + " ce qui me fait " + this.getArgent() + " sous dans ma poche. Hi ! Hi !");
	}
}
