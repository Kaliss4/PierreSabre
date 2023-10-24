package personnage;

public class Humain {
	protected String nom ; 
	protected String boisson ; 
	protected int argent ;
		
	public Humain(String nom, String boisson, int argent) {
		super();
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
		System.out.println(parler() + "Bonjour, je m'appelle " + nom + " et j'aime boire du " + boisson+ ".");
	}
	public void boire() {
		System.out.println(parler() + "Mmmm, un bon verre de " + boisson + " ! GLOUPS !");
	}
	public void acheter(String bien, int prix) {
		if (argent >= prix) {
			System.out.println(parler() + "J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir "+ bien + " a " + prix+ " sous." );
			perdreArgent(prix);
		}
		else {
			System.out.println(parler() + "Je n'ai plus que " + argent + " sous en poche. Je ne peux meme pas m'offrir "+ bien + " a " + prix+ " sous." );
			
		}
	}
	public void gagnerArgent(int gain) {
		argent += gain;
	}
	public void perdreArgent(int perte) {
		argent -= perte;
		
	}
	
	public void presentation () {
		System.out.println(parler() + "Bonjour, je m'appelle " + nom + " et j'aime boire du " + boisson);
	}
	
	public String parler() {
		return "(" + nom +")" + " - " ;
		}
	
	
	
	
}
