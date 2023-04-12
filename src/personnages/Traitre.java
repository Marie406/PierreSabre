package personnages;
import java.util.Random;

public class Traitre extends Samourai{
	private int niveauTraitrise = 0;
	
	public Traitre(String seigneur, String nom, String boissonFav, int sommeArgent) {
		super(seigneur, nom, boissonFav, sommeArgent);
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mais je suis un traître et mon niveau de traîtrise est : " + this.niveauTraitrise + ". Chut !");
	}
	
	public void ranconner(Commercant commercant) {
		if (this.niveauTraitrise<3) {
			
			int argentRanconne = commercant.getArgent()*1/5;
			commercant.perdreArgent(argentRanconne);
			this.gagnerArgent(argentRanconne);
			this.niveauTraitrise +=1;
			this.parler("Si tu veux ma protection contre les Yakuzas, il va falloir payer ! Donne-moi " + Integer.toString(argentRanconne) + " sous ou gare à toi !");
			commercant.parler("Tout de suite grand " + this.getNom() + ".");
		}
		else {
			this.parler("Mince je ne peux plus rançonner personne sinon un samouraï risque de me démasquer !");
		}
	}
	
	public void faireLeGentil() {
		if (this.nbConnaissance < 1) {
			this.parler("Je ne peux faire ami ami avec personne car je ne connais personne ! Snif");
		}
		else {
			Random random = new Random();
			int indiceTireSort = random.nextInt(nbConnaissance-1);
			Humain ami = this.memoire[indiceTireSort];
			int don = this.getArgent()/20;
			String nomAmi = ami.getNom();
			this.parler("Il faut absolument remonter ma cote de confiance. Je vais faire ami ami avec " + nomAmi + ".");
			this.parler("Bonjour l'ami ! Je voudrais vous aider en vous donnant " + Integer.toString(don) + " sous.");
			ami.gagnerArgent(don);
			this.perdreArgent(don);
			String nom = this.getNom();
			ami.parler(" Merci " + nom + ". Vous êtes quelqu'un de bien.");
			if (this.niveauTraitrise > 1) {
				this.niveauTraitrise -=1;
			}
		}
		
	}
}
