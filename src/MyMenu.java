import java.util.ArrayList;

/*
Questa classe rappresenta un menu testuale generico a piu' voci
Si suppone che la voce per uscire sia sempre associata alla scelta 0 
e sia presentata in fondo al menu


 PRESO DALLA LIBRERIA DI SERINA E RADATTATO UN ATTIMINO

*/
public class MyMenu
{
  final private static String CORNICE = "--------------------------------";
  final private static String VOCE_USCITA = "0\tEsci";
  final private static String RICHIESTA_INSERIMENTO = "Digita il numero dell'opzione desiderata > ";

  private String titolo;
  private ArrayList<Scelta> voci;
  private String[] casi;
	
  public MyMenu (String titolo, ArrayList<Scelta> opzione)
  {
	this.titolo = titolo;
	this.voci = opzione;
  }

  public int scegli ()
  {
	stampaMenu();
	return InputDati.leggiIntero(RICHIESTA_INSERIMENTO, 0, voci.size());	 
  }
		
  public void stampaMenu ()
  {
	System.out.println(CORNICE);
	System.out.println(titolo);
	System.out.println(CORNICE);
    for (int i=0; i<voci.size(); i++)
	 {
	  System.out.println( (i+1) + "\t" + voci.get(i).getTesto());
	 }
    System.out.println();
	System.out.println(VOCE_USCITA);
    System.out.println();
  }
  



/*
	
  public void MenuPrincipale (String titolo, String[] opzione)
  {
	this.titolo = titolo;
	this.casi = opzione;
  }

  public int scelta ()
  {
	stampaMenu();
	return InputDati.leggiIntero(RICHIESTA_INSERIMENTO, 0, casi.length);	 
  }
		
  public void stampaMioMenu ()
  {
	System.out.println(CORNICE);
	System.out.println(titolo);
	System.out.println(CORNICE);
    for (int i=0; i<casi.length; i++)
	 {
	  System.out.println( (i+1) + "\t" + casi[i+1]);
	 }
    System.out.println();
	System.out.println(VOCE_USCITA);
    System.out.println();
  }*/
		
}

