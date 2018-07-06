import java.util.ArrayList;


public class Menu{
		
		public static int mioMenu(Bivio b ,ArrayList <Bivio> bivi) {
		int termina = 1;
		
			ArrayList<Scelta> opzione = b.getScelte();
			MyMenu myMenu = new MyMenu("scelta opzioni", opzione);
			int scelta = myMenu.scegli();
			if (opzione.size()!=1) {
				int i = b.getScelte().get(scelta-1).getCollegamento();
				return mioMenu(bivi.get(i), bivi);
			}
			return termina;
		}

}