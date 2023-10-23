package personnages.principaux;
import personnages.Humain;
public class Yakuza extends Humain{

	private String clan;
	private int reputation = 0;
	
	public Yakuza(String nom, String boisson, int argent, String clan) {
		super(nom,boisson,argent);
		this.clan = clan;
	}
	
	public void extorquer(Commercant victime) {
		System.out.println(parler() + "Tiens, tiens, ne serait-ce pas un faible marchand qui passe par l� ?");
		System.out.println(parler() + victime.getNom() + ", si tu tiens � la vie donne moi ta bourse !");
		int gain = victime.seFaireExtorquer();
		System.out.println(parler() + "J'ai piqu� les " + gain + " sous de " + victime.getNom() +" ce qui me fait " + getArgent() + " dans ma poche. Hi ! Hi !");
		
	}
	
	
	
	
	
}
