package histoire;
import personnages.Humain;
public class HistoireTP4 {
	
	
	
	
	public static void main(String[] argv) {
		Humain marco = new Humain("Prof", "kombucha", 54);
		marco.direBonjour();
		marco.acheter("une boisson", 12);
		marco.boire();
		marco.acheter("jeu", 2);
		marco.acheter("kimono", 40);
	}

}
