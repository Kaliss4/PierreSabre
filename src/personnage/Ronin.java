package personnage;

public class Ronin extends Humain{
	private int honneur = 1;

	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
	}
	
	public void donner(Commercant beneficiaire) {
		int don = (argent*10 / 100);
		System.out.println(parler()+ beneficiaire.getNom() + " prends ces " + don + " sous.");
		beneficiaire.recevoir(don);
	}

}
