package model;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegistrazioneEventoParrocchiaLC {
	
	private String codiceEvento;
	private String codiceIscritto;
	private String codiceParrocchia;
	private String codiceRegistrazione;
	private DBConnection con = new DBConnectionImpl();
	
	public RegistrazioneEventoParrocchiaLC(String codiceEvento, String codiceIscritto, String codiceParrocchia,
			String codiceRegistrazione) {
		super();
		this.codiceEvento = codiceEvento;
		this.codiceIscritto = codiceIscritto;
		this.codiceParrocchia = codiceParrocchia;
		this.codiceRegistrazione = codiceRegistrazione;
	}

	public int registrazioneEventoLC() {
		int rs;
		try {
			PreparedStatement st = con.getMsSQLConnection().prepareStatement(
					"insert into REGISTRAZIONE_E_P_LC(codiceParrocchia, codiceEvento, codiceRegistrazione, codiceIscritto) VALUES(?, ?, ?, ?)");
			st.setString(1, codiceParrocchia);
			st.setString(2, codiceEvento);
			st.setString(3, codiceRegistrazione);
			st.setString(4, codiceIscritto);
			rs = st.executeUpdate();
			st.close();
		} catch (SQLException e) {
			return 0;
		}
		return rs;
	}

}
