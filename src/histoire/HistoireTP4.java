package histoire;
import personnage.Humain;
import personnage.Commercant;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humain prof = new Humain ("Prof","kombucha", 54);
		prof.presentation() ; 
		prof.acheter("une boisson", 12);
		prof.boire();
		prof.acheter("un jeu", 2);
		prof.acheter("un kimino", 50);
		Commercant marco = new Commercant ("Marco", "the", 20);
		marco.presentation();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
		
		
	}
}
