package personnage;

public class Yakuza extends Humain {
	
	private int reputation = 0 ; 
	private String clan ; 

	public Yakuza(String nom, String boisson, int argent, String clan) {
		super(nom, boisson, argent);
		this.clan = clan;
	}
	public void extorquer(Commercant victime) {
		System.out.println(parler()+ "Tiens, tiens, ne serait-ce pas un faible marchand qui passe par la ?");
		System.out.println(parler()+ victime.getNom() + ", si tu tiens a la vie donne moi ta bourse !");
		int gain = victime.seFaireExtorquer();
		argent += gain;
		System.out.println(parler()+ "J'ai pique les "+ gain+ " sous de "+ victime.getNom() + " ce qui me fait "+ argent+ " sous dans ma poche. Hi ! Hi !" );
	}

}
