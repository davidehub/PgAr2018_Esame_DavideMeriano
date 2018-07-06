import java.util.ArrayList;

public class Bivio {
	
	private String descrizione;
	private ArrayList <Scelta> scelte;
	
	
	public Bivio(String _descrizione, ArrayList<Scelta> _scelte) {
		this.descrizione= _descrizione;
		this.scelte = _scelte;
	}
	
	public Bivio(String _descrizione) {
		this.descrizione= _descrizione;
		this.scelte = null;
	}


	public String getDescrizione() {
		return descrizione;
	}




	public ArrayList<Scelta> getScelte() {
		return scelte;
	}




}
