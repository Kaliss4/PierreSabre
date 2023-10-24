package personnage;

public class Ronin extends Humain{
	private int honneur = 1;

	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
	}
	
	public void donner(Commercant beneficiaire) {
		int don = (getArgent()*10 / 100);
		perdreArgent(don);
		parler(beneficiaire.getNom() + " prends ces " + don + " sous.");
		beneficiaire.recevoir(don);
		honneur +=1;
	}
	
	public void provoquer(Yakuza adversaire) {
		int forceR = honneur * 2 ; 
		int forceY = adversaire.getReputation() * 2 ;
		parler ( "Je t'ai retrouve vermine, tu vas payer pour ce que tu as fait a ce pauvre marchand !");
		if (forceR >= forceY) {
			parler("Je t'ai eu petit yakuza !");
			adversaire.perdre();
		} else {
			parler("J'ai perdu contre ce Yakuza, mon honneur et ma bourse ont en pris un coup.");
			adversaire.gagner(getArgent());
			perdreArgent(getArgent());
			honneur -=1;
			
		}
	}

}
