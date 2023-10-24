package personnage;

public class Commercant extends Humain {

	public Commercant(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
	}
	public int seFaireExtorquer() {
		int avant = getArgent() ;
		perdreArgent(avant);
		parler("J'ai tout perdu ! Le monde est trop injuste...");
		return avant ;
		
	}
	public void recevoir(int argent) {
		gagnerArgent(argent); 
		parler(argent + " sous ! Je te remercie genereux donateur !");
		
	}
	

}
