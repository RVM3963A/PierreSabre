package personnages.principaux;
import personnages.Humain;
public class Commercant extends Humain {
	
	

	public Commercant(String nom, int argent) {
		super(nom, "thé", argent);
	}
	
	public void recevoir(int argent) {
		gagnerArgent(argent);
		System.out.println(parler() + argent + " sous ! Je vous remercie généreux donateur!");
	}
	
	public int seFaireExtorquer() {
		int montant = getArgent();
		perdreArgent(montant);
		System.out.println(parler() + "J'ai tout perdu! Le monde est trop injuste...");
		return montant;
	}
	
}
