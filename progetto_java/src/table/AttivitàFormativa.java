package table;

public class AttivitāFormativa{

	private String codiceAttivitā;
	private String descrizione;
	
	public AttivitāFormativa(String codice, String descrizione) {
		this.codiceAttivitā = codice;
		this.descrizione = descrizione;
	}

	public String getCodiceAttivitā() {
		return this.codiceAttivitā;
	}

	public String getDescrizione() {
		return this.descrizione;
	}

	public void setCodiceAttivitā(String codiceAttivitā) {
		this.codiceAttivitā = codiceAttivitā;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

}
