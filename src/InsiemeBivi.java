import java.util.ArrayList;

public class InsiemeBivi {
	ArrayList <Bivio> bivi = new ArrayList <Bivio>();
	
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
