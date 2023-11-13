package personnages;



public class Humain {
	
	private String nom;
	private String boisson;
	private int argent;
	private Humain[] memoire = new Humain[3];
	private int nbHumainEnMemoire = 0;
	
	public Humain(String nom, String boisson, int argent) {
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
		
	}
	
	
	public String getNom() {
		return nom;
	}
	
	public int getArgent() {
		return argent;
	}
	
	
	public void direBonjour() {
		System.out.println(parler() +"Bonjour ! Je m'appelle "+nom+" et j'aime boire du " + boisson + " !");
	}
	
	public void boire() {
		System.out.println(parler() +"Mmmmm, un bon verre de "+boisson+" ! GLOUPS !");
		
	}
	
	public void acheter(String bien, int prix) {
		if (argent > prix) {
		System.out.println(parler() +"J'ai "+argent+" sous en poche. Je vais pouvoir m'offrir " + bien + " à "+ prix +" sous !");
		perdreArgent(prix);
		}
		else {
			System.out.println(parler() +"Je n'ai plus que "+argent+" sous en poche. Je ne peux même pas m'offrir " + bien + " à "+ prix +" sous...");
		}
	}
	
	public void gagnerArgent(int gain) {
		argent = argent + gain;
		
	}
	
	public void perdreArgent(int perte) {
		argent = argent - perte;
		
	}
	
	
	public void memoriser(Humain autreHumain) {
		if (nbHumainEnMemoire >= memoire.length) {
			for (int i = 0; i<memoire.length-2;i++) {
				memoire[i] = memoire[i+1];
			}
			memoire[0] = autreHumain;
		
		}
		else {
			memoire[nbHumainEnMemoire] = autreHumain;
			nbHumainEnMemoire +=1;
		}
		System.out.println(autreHumain.getNom() + " ajouté à la mémoire de " + getNom());;
		
	}
	
	
	public void repondre(Humain autreHumain) {
		direBonjour();
		memoriser(autreHumain);
		
	}
	
	
	public void faireConnaissance(Humain autreHumain) {
		direBonjour();
		autreHumain.repondre(this);
		this.memoriser(autreHumain);
		
		
		
		
	}
	
	
	
	public void listerConnaissance() {
		String dialogue = "Je connais beaucoup de monde ! dont : ";
		for(int i = 0;i<nbHumainEnMemoire;i++) {
			if (i == 30) break;
			dialogue += memoire[i].getNom()+ " ";
		}
		System.out.println(parler()+ dialogue + "!");
	}
	
	
	
	
	
	
	
	protected String parler() {
		return "("+ nom + ") - ";
		
	}
	
}







