
public class Scelta {
	
	private String testo;
	private int collegamento;
	
	public Scelta(String _testo, int _collegamento) {
		this.collegamento = _collegamento;
		this.testo = _testo;
	}

	public String getTesto() {
		return testo;
	}

	public void setTesto(String testo) {
		this.testo = testo;
	}

	public int getCollegamento() {
		return collegamento;
	}

	public void setCollegamento(int collegamento) {
		this.collegamento = collegamento;
	}
	
	

}
