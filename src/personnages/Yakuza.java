package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 4;
	
	public int getReputation() {
		return this.reputation;
	}
	
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
	
	public void perdre() {
		this.reputation -= 1;
		this.parler("J’ai perdu mon duel et mes " + this.sommeArgent + " sous, snif... J'ai déshonoré le clan de " + this.clan + ".");
	}
	
	public void gagner(int gain) {
		this.reputation += 1;
		this.parler("Ce ronin pensait vraiment battre " + this.getNom() + " du clan de " + this.clan + " ? Je l'ai dépouillé de ses " + gain + " sous.");
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		this.parler("Mon clan est celui de " + this.clan);
	}
	
}
