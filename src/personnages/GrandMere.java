package personnages;

import java.util.Random;

public class GrandMere extends Humain {
	
	private enum TypeHumain {
		GRANDMERE("grand-mère"),
		HABITANT("habitant"),
		RONIN("ronin"),
		SAMOURAI("samouraï"),
		COMMERCANT("commercant"),
		YAKUZA("yakuza");
		
		private String type;
		
		TypeHumain(String type) {
			this.type = type;
		}
		
		@Override
		public String toString() {
			return type;
		}
		
	}
	
	
	public GrandMere(String nom, int sommeArgent) {
		super(nom, "tisane", sommeArgent);
	}
	
	public void memoriser(Humain rencontre) {
		if(this.nbConnaissance<5) {
			this.memoire[nbConnaissance] = rencontre;
			this.nbConnaissance +=1;
		}
		else {
			this.parler("Oh ma tête ! Je ne peux plus retenir le nom d'une personne supplémentaire !");
		}
	}
	
	public String humainHasard() {
		Random random = new Random();
		int indiceTireSort = random.nextInt(5);
		TypeHumain [] types = TypeHumain.values();
		return (types[indiceTireSort]).toString();
		
	}
	
	public void ragoter() {
		for (int i = 0; i < nbConnaissance; i++) {
			Humain connaissance = this.memoire[i];
			if (connaissance instanceof Traitre) {
				this.parler("Je sais que " + connaissance.getNom() + " est un traître. Petit chenapan !");
			}
			else {
				this.parler("Je crois que " + connaissance.getNom() + " est un.e " + humainHasard());
			}
		}
	}
}
