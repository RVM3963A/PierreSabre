package personnages.principaux;
import personnages.Humain;

public class Ronin extends Humain {
	
	private int honneur = 1;
	
	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
	}
	
	public void donner(Commercant beneficiaire) {
		System.out.println(parler() + beneficiaire.getNom() + " prend ces " + this.getArgent()/10 + " sous.");
		beneficiaire.recevoir(this.getArgent()/10);	
	}
	
	public void provoquer(Yakuza adversaire) {
		System.out.println(parler() + "Je t'ai retrouvé vermine ! Tu vas payer pour ce que tu as fait à ce pauvre marchand !");
		if (honneur>= adversaire.getReputation()) {
			System.out.println(parler() + "Je t'ai eu petit yakusa!");
			int gain = adversaire.perdre();
			gagnerArgent(gain);
		}
			
		
		
		
	}
	
	
	

}
