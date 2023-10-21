package histoire;
import personnage.Humain;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humain prof = new Humain ("Prof","kombucha", 54);
		prof.presentation() ; 
		prof.acheter("une boisson", 12);
		prof.boire();
		prof.acheter("un jeu", 2);
		prof.acheter("un kimino", 50);
		
		
	}
}
