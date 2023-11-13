package histoire;
import personnages.Humain;
import personnages.principaux.Commercant;
import personnages.principaux.Ronin;
import personnages.principaux.Yakuza;
public class HistoireTP4 {
	
	
	
	
	public static void main(String[] argv) {
		Commercant marco = new Commercant("Marco", 54);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		Ronin roro = new Ronin("Roro", "shochu",60);
		roro.direBonjour();
		roro.donner(marco);
		roro.provoquer(yaku);
		
	}

}
