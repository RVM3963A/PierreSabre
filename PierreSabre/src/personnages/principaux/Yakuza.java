package personnages.principaux;
import personnages.Humain;
public class Yakuza extends Humain{

	private String clan;
	private int reputation = 0;
	
	public Yakuza(String nom, String boisson, int argent, String clan) {
		super(nom,boisson,argent);
		this.clan = clan;
	}
	public int getReputation() {
		return reputation;
	}
	
	public void extorquer(Commercant victime) {
		System.out.println(parler() + "Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		System.out.println(parler() + victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		int gain = victime.seFaireExtorquer();
		System.out.println(parler() + "J'ai piqué les " + gain + " sous de " + victime.getNom() +" ce qui me fait " + getArgent() + " dans ma poche. Hi ! Hi !");
		
	}
	
	public int perdre() {
		int argent = getArgent();
		reputation -= 1;
		perdreArgent(argent);
		System.out.println(parler() + "J’ai perdu mon duel et mes " + argent + " sous, snif... J'ai déshonoré le clan de " + clan + "...");
		return argent;
		
	}
	
	public void gagner(int gain) {
		gagnerArgent(gain);
		reputation +=1;
		System.out.println(parler() + "Ce ronin pensait vraiment pouvoir battre " + getNom() + " du clan " + clan + "?\n Je l'ai dépouillé de ses " + gain + "sous !");
		
		
	}
	
}
