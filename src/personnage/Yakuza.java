package personnage;

public class Yakuza extends Humain {
	
	private int reputation = 4 ; 
	private String clan ; 

	public Yakuza(String nom, String boisson, int argent, String clan) {
		super(nom, boisson, argent);
		this.clan = clan;
	}
	
	
	
	public int getReputation() {
		return reputation;
	}



	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par la ?");
		parler(victime.getNom() + ", si tu tiens a la vie donne moi ta bourse !");
		int gain = victime.seFaireExtorquer();
		gagnerArgent(gain);
		reputation +=1 ; 
		parler("J'ai pique les "+ gain+ " sous de "+ victime.getNom() + " ce qui me fait "+ getArgent()+ " sous dans ma poche. Hi ! Hi !" );
	}
	
	public int perdre() {
		int avant = getArgent();
		perdreArgent(avant); ; 
		reputation -=1 ; 
		parler ( "J'ai perdu mon duel et mes " + avant + " sous, snif... J'ai deshonore le clan de " + clan );
		return avant ; 
	}
	public void gagner (int gain) {
		gagnerArgent(gain);
		reputation +=1;
		parler("Ce ronon pensait vramaint battre " + getNom() + " du clan " + clan + " ? Je l'ai depouille de ses " + gain + " sous." );
	}

}
