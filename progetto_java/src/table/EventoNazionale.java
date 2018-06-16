package table;

public class EventoNazionale{

	private String codiceEvento;
	private String tipo;
	private String dataInizio;
	private String dataFine;
	private String localitÓ;
	private String descrizione;
	
	public EventoNazionale(String codiceEvento, String tipo, String dataInizio, String dataFine, String localitÓ,
			String descrizione) {
		this.codiceEvento = codiceEvento;
		this.tipo = tipo;
		this.dataInizio = dataInizio;
		this.dataFine = dataFine;
		this.localitÓ = localitÓ;
		this.descrizione = descrizione;
	}

	public String getCodiceEvento() {
		return this.codiceEvento;
	}

	public String getTipo() {
		return this.tipo;
	}

	public String getDataInizio() {
		return this.dataInizio;
	}

	public String getDataFine() {
		return this.dataFine;
	}

	public String getLocalitÓ() {
		return this.localitÓ;
	}

	public String getDescrizione() {
		return this.descrizione;
	}

	public void setCodiceEvento(String codiceEvento) {
		this.codiceEvento = codiceEvento;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setDataInizio(String dataInizio) {
		this.dataInizio = dataInizio;
	}

	public void setDataFine(String dataFine) {
		this.dataFine = dataFine;
	}

	public void setLocalitÓ(String localitÓ) {
		this.localitÓ = localitÓ;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

}
