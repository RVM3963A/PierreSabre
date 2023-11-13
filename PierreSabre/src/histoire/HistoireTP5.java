package histoire;

import personnages.principaux.Commercant;
import personnages.principaux.Ronin;
import personnages.principaux.Yakuza;

public class HistoireTP5 {
	public static void main(String[] argv) {
		Ronin roro = new Ronin("Roro", "shochu",60);
		Commercant marco = new Commercant("Marco", 54);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		Commercant chonin = new Commercant("Chonin", 54);
		Commercant kumi = new Commercant("Kumi", 54);
		yaku.faireConnaissance(marco);
		yaku.faireConnaissance(roro);
		yaku.faireConnaissance(chonin);
		yaku.faireConnaissance(kumi);
		yaku.listerConnaissance();
		
		
	}
}
