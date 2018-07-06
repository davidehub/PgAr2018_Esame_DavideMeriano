import java.util.ArrayList;

public class ElencoStorie {
	ArrayList <Storia> elencoStorie = new ArrayList <Storia>();
	
	public void aggiungiStoria(Storia s) {
		elencoStorie.add(s);
	}
	
	public Storia getStoria(int n) {
		return elencoStorie.get(n);
	}
	
	
	public ArrayList <Storia> getAll(){
		return elencoStorie;
	}


}
