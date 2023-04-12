package histoire;

import personnages.Humain;
import personnages.Ronin;
import personnages.Commercant;
import personnages.Yakuza;
import personnages.Samourai;

public class HistoireTP5 {
	public static void main(String[] args) {
		Humain jean = new Humain("Jean", "vodka", 54);
		Commercant marco = new Commercant("Marco", "thé",20);
		Commercant chonin = new Commercant("Chonin", "thé matcha",40);
		Commercant kumi = new Commercant("Kumi", "café latté",10);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		Ronin roro = new Ronin("Roro", "shochu", 60);
		marco.faireConnaissanceAvec(roro);
		marco.faireConnaissanceAvec(yaku);
		marco.faireConnaissanceAvec(chonin);
		marco.faireConnaissanceAvec(kumi);
		marco.listerConnaissance();
		roro.listerConnaissance();
		yaku.listerConnaissance();
		Samourai akimoto = new Samourai("Akimoto", "saké", 30, "Miyamoto");
		akimoto.listerConnaissance();
		akimoto.faireConnaissanceAvec(marco);
		akimoto.listerConnaissance();
		akimoto.boire("thé");
		
	}
}
