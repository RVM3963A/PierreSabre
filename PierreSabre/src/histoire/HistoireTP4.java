package histoire;
import personnages.Humain;
import personnages.principaux.Commercant;
public class HistoireTP4 {
	
	
	
	
	public static void main(String[] argv) {
		Commercant marco = new Commercant("Prof", 54);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
		
	}

}
