package personnage;

public class Commercant extends Humain {

	public Commercant(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
	}
	public int seFaireExtorquer() {
		int avant = argent ;
		argent = 0 ;
		System.out.println(parler()+"J'ai tout perdu ! Le monde est trop injuste...");
		return avant ;
		// mettre les artribut en protected ou public. Protected est preferable
	}
	public void recevoir(int argent) {
		this.argent +=argent ; 
		System.out.println(parler()+ argent + " sous ! Je te remercie genereux donateur !");
		
	}
	

}
