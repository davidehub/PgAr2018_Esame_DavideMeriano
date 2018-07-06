import java.util.ArrayList;
/**
 * 
 * @author Davide
 *
 */


public class MainApp {

	public static final String SALUTO="Caro giocatore benvenuto! In questa avventura ti troverai davanti a delle scelte che dovrai compiere per arrivare alla fine. Buona Partita!\n";
	public static final String FINALE = "Complimenti sei arrivato alla fine!";
	
	public static Bivio creaBivio (int nBivi) {
		int biviFinali=0;
		boolean ricomincia = false;
		int collegamento =0;
		ArrayList<Scelta> scelte = new ArrayList<Scelta>(); 
		String descrizione = InputDati.leggiStringaNonVuota("descrizione: ");
		int numeroScelteBivio = InputDati.leggiIntero("numero di scelte per il bivio: ",0,nBivi-1);
		if (numeroScelteBivio ==0);
			biviFinali++;
				for (int i=0; i< numeroScelteBivio; i++) {
					
					System.out.println("scelta " + (i+1));
					String testo = InputDati.leggiStringaNonVuota("testo: " );
					do {
						 collegamento = (InputDati.leggiIntero ("la scelta si collega al bivio: ",1, nBivi+1) -1);
							if (collegamento == 0 || collegamento == i) { //una scelta non può collegarsi al bivio stesso o al bivio iniziale
								System.out.println("collegamento impossibile");
								ricomincia = true;
							}
					}while (ricomincia);
					Scelta s = new Scelta (testo, collegamento);
					scelte.add(s);
					//System.out.println("nella tua storia non sono presenti punti terminali; non si può vincere");
					//break;
				}
		return new Bivio(descrizione,scelte);
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(SALUTO);

	//	ElencoStorie s = new ElencoStorie();
		
		Menu.menuPrincipale();
		
		
		
		
	/*	InsiemeBivi b = new InsiemeBivi();
		int nBivi =InputDati.leggiIntero("numero Bivi: ");
		for (int i =0; i<nBivi; i++) {
			System.out.println("bivio " + (i+1));
			b.aggiungiBivio(creaBivio(nBivi));
		}
		*/
		
	// Menu.mioMenu(b.getBivio(0), b.getAll());
	
		
	}

}
