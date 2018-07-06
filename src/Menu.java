import java.util.ArrayList;


public class Menu{
	
		
	public static int mioMenu(Bivio b ,ArrayList <Bivio> bivi) {
		int termina = 1;
		
			ArrayList<Scelta> opzione = b.getScelte();
			MyMenu myMenu = new MyMenu("scelta opzioni", opzione);
			int scelta = myMenu.scegli();
			if (opzione.size()!=1 && scelta!=0) {
				int i = b.getScelte().get(scelta-1).getCollegamento();
				return mioMenu(bivi.get(i), bivi);
			}
			return termina;
		}
	
	
	public static int menuPrincipale () {
		ElencoStorie el = new ElencoStorie();
		
		String[] stringa = {"Cerca una storia per titolo", "Visualizza elenco ordinato storie", "Crea Una Nuova Storia"};
		MenuPrincipale menuPrincipale = new MenuPrincipale ("Scelta opzioni", stringa);
		
		boolean fine = false;
		
		
		do {
		int scelta = menuPrincipale.scegli();
		switch (scelta) {
			case 1: {
				if (el.getAll().size()==0) { //se non ci sono ancora storie esco dal ciclo
					System.out.println("non ci sono storie ancora, Inseriscine almeno una prima");
					break;
				}
				String titoloCercato = InputDati.leggiStringaNonVuota("inserisci il titolo della storia :");
				for (int i=0; i<el.getAll().size(); i++) {
					if (titoloCercato.equalsIgnoreCase(el.getStoria(i).getTitolo()));
					else continue;
					
					
					String [] opzione = {"Gioca la storia",};
					MenuPrincipale menu1 = new MenuPrincipale (el.getStoria(i).getTitolo(), opzione );
					int scelta1 = menu1.scegli();
					switch(scelta1) {
						case 1:{
							
							Menu.mioMenu(el.getStoria(i).getBivio(0), el.getStoria(i).getAll());
							break;
						}
						default: break;
					}	
				}
			break;
			}
			
			case 2: {
				if (el.getAll().size()==0) { //se non ci sono ancora storie esco dal ciclo
					System.out.println("non ci sono storie ancora, Inseriscine almeno una prima");
					break;
				}
				String [] opzione = {"Visualizza le storie in ordine alfabetico", "visualizza le storie per ordine di bivi"};
				MenuPrincipale menu2 = new MenuPrincipale ("Elenco Storie", opzione );
				int scelta2 = menu2.scegli();
				switch(scelta2) {
					case 1:{
						ArrayList <String> string =visualizzaOrdineAlfabetico(el);
						for(int i =0; i<string.size(); i++)
							System.out.println(string.get(i));
						break;
					}
					
					case 2:{
						ArrayList <String> string =visualizzaOrdineBivi(el);
						for(int i =0; i<string.size(); i++)
							System.out.println(string.get(i));
						break;
					}
				}
				
			break;
			}
		
			case 3: {
				String titolo = InputDati.leggiStringaNonVuota("Inserisci il titolo della storia: ");
			
				InsiemeBivi b = new InsiemeBivi();
			
				int nBivi =InputDati.leggiIntero("numero Bivi: ");
				for (int i =0; i<nBivi; i++) {
					System.out.println("bivio " + (i+1));
					b.aggiungiBivio(MainApp.creaBivio(nBivi));
					}
					el.aggiungiStoria(new Storia (titolo, b.getAll()));
				
					String [] opzione = {"Gioca la storia"};
					MenuPrincipale menu3 = new MenuPrincipale (titolo, opzione );
					int scelta3 = menu3.scegli();
					switch(scelta3) {
						case 1:{
							Menu.mioMenu(b.getBivio(0), b.getAll());
							break;
						}
						default: break;
					}

					break;
			}
			default: fine =true;
			}
		}while(!fine);
		
		return 1;
	}

/**
 * 
 * @param e
 * @return restituisce il vettore delle storie ordinate in ordien alfabetico
 */
	public static ArrayList<String> visualizzaOrdineAlfabetico(ElencoStorie e) {  
		ArrayList <String> array = new ArrayList <String>();
		for (int t=0; t<e.getAll().size(); t++) {
			array.add(e.getStoria(t).getTitolo());
		}
			
		String temporanea="";
		for (int i=0; i< e.getAll().size(); i++) {
			for (int j=i+1;j< e.getAll().size(); j++) {
				if (array.get(i).compareTo(array.get(j))>0) {
					temporanea= array.get(j);
					array.set(j, array.get(i));
					array.set(i, temporanea);
					}
			}
		}
		return array;
	}
	
	
	/**
	 * 
	 * @param e
	 * @return restituisce il vettore delle storie ordinate in ordine di bivi presenti
	 */
	
	public static ArrayList<String> visualizzaOrdineBivi(ElencoStorie e) {
		ArrayList <Integer> contenitore = new ArrayList <Integer>();
		ArrayList <String> vettore = new ArrayList <String>();
		for (int t=0; t<e.getAll().size(); t++) {
			contenitore.add(e.getStoria(t).getAll().size());
			vettore.add(e.getStoria(t).getTitolo());
		}
			
		String tempo;
		for (int i=0; i< e.getAll().size(); i++) {
			for (int j=i; j< e.getAll().size();j++) {
				if (i==j)continue;
				if(contenitore.get(i) < contenitore.get(j)) {
					tempo = vettore.get(j);
					vettore.set(j, vettore.get(i));
					vettore.set(i, tempo);
				}
			}
	}
	return vettore;
	}
}