package histoire;

import personnages.Humain;
import personnages.Ronin;
import personnages.Commercant;
import personnages.Yakuza;
import personnages.Samourai;
import personnages.Traitre;
import personnages.GrandMere;

public class HistoireTP5 {
	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco", "thé",20);
		Commercant chonin = new Commercant("Chonin", "thé matcha",40);
		Commercant kumi = new Commercant("Kumi", "café latté",10);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		Ronin roro = new Ronin("Roro", "shochu", 60);
		Samourai akimoto = new Samourai("Miyamoto", "Akimoto", "saké", 30);
		Traitre masako = new Traitre("Miyamoto", "Masako", "whisky", 100);
		
		marco.faireConnaissanceAvec(roro);
		marco.faireConnaissanceAvec(yaku);
		marco.faireConnaissanceAvec(chonin);
		marco.faireConnaissanceAvec(kumi);
		marco.listerConnaissance();
		roro.listerConnaissance();
		yaku.listerConnaissance();
		akimoto.listerConnaissance();
		akimoto.faireConnaissanceAvec(marco);
		akimoto.listerConnaissance();
		akimoto.boire("thé");
		masako.faireLeGentil();
		masako.ranconner(kumi);
		masako.ranconner(chonin);
		masako.ranconner(marco);
		akimoto.faireConnaissanceAvec(masako);
		masako.ranconner(marco);
		masako.faireConnaissanceAvec(yaku);
		masako.faireLeGentil();
		masako.faireConnaissanceAvec(roro);
		
		
		GrandMere grandMere = new GrandMere("Grand-Mère", 10);
		grandMere.faireConnaissanceAvec(akimoto);
		grandMere.faireConnaissanceAvec(yaku);
		grandMere.faireConnaissanceAvec(masako);
		grandMere.faireConnaissanceAvec(kumi);
		grandMere.faireConnaissanceAvec(marco);
		grandMere.faireConnaissanceAvec(chonin);
		grandMere.ragoter();

	}
}
