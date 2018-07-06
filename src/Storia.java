import java.util.ArrayList;

public class Storia {
	
	private String titolo;
	ArrayList <Bivio> bivi = new ArrayList <Bivio>();
	
	
	public Storia(String titolo, ArrayList<Bivio> bivi) {
		this.titolo = titolo;
		this.bivi = bivi;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public void aggiungiBivio(Bivio b) {
		bivi.add(b);
	}
	
	public Bivio getBivio(int n) {
		return bivi.get(n);
	}
	
	public ArrayList <Bivio> getAll(){
		return bivi;
	}

}
