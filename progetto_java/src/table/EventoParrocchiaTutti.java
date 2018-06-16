package table;

public class EventoParrocchiaTutti {
	
	private String codiceParrocchia;
	private String codiceEvento;
	private String tipo;
	private String dataInizio;
	private String dataFine;
	private String localitÓ;
	private String descrizione;
	
	public EventoParrocchiaTutti(String codiceParrocchia, String codiceEvento, String tipo, String dataInizio,
			String dataFine, String localitÓ, String descrizione) {
		super();
		this.codiceParrocchia = codiceParrocchia;
		this.codiceEvento = codiceEvento;
		this.tipo = tipo;
		this.dataInizio = dataInizio;
		this.dataFine = dataFine;
		this.localitÓ = localitÓ;
		this.descrizione = descrizione;
	}

	public String getCodiceParrocchia() {
		return codiceParrocchia;
	}

	public String getCodiceEvento() {
		return codiceEvento;
	}

	public String getTipo() {
		return tipo;
	}

	public String getDataInizio() {
		return dataInizio;
	}

	public String getDataFine() {
		return dataFine;
	}

	public String getLocalitÓ() {
		return localitÓ;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setCodiceParrocchia(String codiceParrocchia) {
		this.codiceParrocchia = codiceParrocchia;
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
