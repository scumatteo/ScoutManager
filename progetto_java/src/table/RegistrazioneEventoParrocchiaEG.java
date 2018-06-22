package table;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import application.app.DBConnection;
import application.app.DBConnectionImpl;

public class RegistrazioneEventoParrocchiaEG {
	
	private String codiceEvento;
	private String codiceIscritto;
	private String codiceParrocchia;
	private String codiceRegistrazione;
	private DBConnection con = new DBConnectionImpl();
	
	public RegistrazioneEventoParrocchiaEG(String codiceEvento, String codiceIscritto, String codiceParrocchia,
			String codiceRegistrazione) {
		super();
		this.codiceEvento = codiceEvento;
		this.codiceIscritto = codiceIscritto;
		this.codiceParrocchia = codiceParrocchia;
		this.codiceRegistrazione = codiceRegistrazione;
	}

	public int registrazioneEventoEG() {
		try {
			PreparedStatement st = con.getMsSQLConnection().prepareStatement(
					"insert into REGISTRAZIONE_E_P_EG(codiceParrocchia, codiceEvento, codiceRegistrazione, codiceIscritto) VALUES(?, ?, ?, ?)");
			st.setString(1, codiceParrocchia);
			st.setString(2, codiceEvento);
			st.setString(3, codiceRegistrazione);
			st.setString(4, codiceIscritto);
			return st.executeUpdate();
		} catch (SQLException e) {
			return 0;
		}
	}

}
