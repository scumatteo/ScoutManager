package table;

public class AttivitÓLudica {

	private String codiceAttivitÓ;
	private String descrizione;
	
	public AttivitÓLudica(String codice, String descrizione) {
		this.codiceAttivitÓ = codice;
		this.descrizione = descrizione;
	}

	public String getCodiceAttivitÓ() {
		return this.codiceAttivitÓ;
	}

	public String getDescrizione() {
		return this.descrizione;
	}

	public void setCodiceAttivitÓ(String codiceAttivitÓ) {
		this.codiceAttivitÓ = codiceAttivitÓ;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
}
