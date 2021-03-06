package view.admin;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;


import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import model.AdminViewOperation;
import model.DBConnection;

public class AdminViewOperationPanel extends JPanel {

	/**
	 * Automatically generated.
	 */
	private static final long serialVersionUID = 2907987461933376055L;
	// parr per citta
	private JLabel parrocchiePerCitta = new JLabel("Parrocchie per città");
	private JLabel nomeCitta = new JLabel("città: ");
	private JTextField citta = new JTextField(16);
	private JButton b1 = new JButton("visualizza");

	// evento parr per resp
	private JLabel parrocchiePerResp = new JLabel("Evento parrocchia per responsabile");
	private JLabel codiceResp = new JLabel("codice responsabile: ");
	private JTextField codResponsabile = new JTextField(16);
	private JButton b2 = new JButton("visualizza");

	// evento nazionale per resp
	private JLabel eventoPerResp = new JLabel("Evento nazionale per responsabile");
	private JLabel codiceRespEN = new JLabel("codice responsabile: ");
	private JTextField codResponsabileEN = new JTextField(16);
	private JButton b3 = new JButton("visualizza");

	// Evento Parr per data
	private JLabel eventoParrPerData = new JLabel("Evento Parrocchia per data");
	private JLabel dataInizio = new JLabel("data inizio evento: ");
	private JTextField data = new JTextField(16);
	private JButton b4 = new JButton("visualizza");

	// evento nazionale per data
	private JLabel eventoNazPerData = new JLabel("Evento nazionale per data");
	private JLabel dataInizioN = new JLabel("data inizio evento: ");
	private JTextField dataN = new JTextField(16);
	private JButton b5 = new JButton("visualizza");

	public AdminViewOperationPanel(DBConnection con, JTextArea view) {
		this.data.setText("GG/MM/ANNO");
		this.dataN.setText("GG/MM/ANNO");
		parrocchiePerCitta.setForeground(Color.RED);
		parrocchiePerResp.setForeground(Color.RED);
		eventoPerResp.setForeground(Color.RED);
		eventoParrPerData.setForeground(Color.RED);
		eventoNazPerData.setForeground(Color.RED);
		
		this.setLayout(new GridBagLayout());
		this.parrPercitta();
		this.parrPerResponsabile();
		this.eventoNazionalePerResponsabile();
		this.eventoParrocchiaPerData();
		this.eventoNazionalePerData();
		this.b1.addActionListener(e -> {
			view.setText(AdminViewOperation.parrocchiaPerCittà(this.citta.getText()));
		});
		this.b2.addActionListener(e -> {
			view.setText(AdminViewOperation.eventoParrocchiaPerResponsabile(this.codResponsabile.getText()));
		});
		this.b3.addActionListener(e -> {
			view.setText(AdminViewOperation.eventoNazionalePerResponsabile(this.codResponsabileEN.getText()));
		});
		this.b4.addActionListener(e -> {
			view.setText(AdminViewOperation.eventoDiParrocchiaPerData(this.data.getText()));
		});
		
		this.b5.addActionListener(e -> {
			view.setText(AdminViewOperation.eventoNazionalePerData(this.dataN.getText()));
		});
	}

	private void parrPercitta() {
		GridBagConstraints c = new GridBagConstraints();
		c.insets = new Insets(0, 10, 10, 10);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 0;
		this.add(this.parrocchiePerCitta, c);
		c.gridy = 1;
		this.add(this.nomeCitta, c);
		c.gridx = 1;
		this.add(this.citta, c);
		c.gridy = 2;
		this.add(this.b1, c);
	}

	private void parrPerResponsabile() {
		GridBagConstraints c = new GridBagConstraints();
		c.insets = new Insets(0, 10, 10, 10);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 3;
		c.gridy = 0;
		this.add(this.parrocchiePerResp, c);
		c.gridx = 3;
		c.gridy = 1;
		this.add(this.codiceResp, c);
		c.gridx = 4;
		this.add(this.codResponsabile, c);
		c.gridx = 4;
		c.gridy = 2;
		this.add(this.b2, c);
	}

	private void eventoNazionalePerResponsabile() {
		GridBagConstraints c = new GridBagConstraints();
		c.insets = new Insets(0, 10, 10, 10);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 5;
		c.gridy = 0;
		this.add(this.eventoPerResp, c);
		c.gridy = 1;
		this.add(this.codiceRespEN, c);
		c.gridx = 6;
		this.add(this.codResponsabileEN, c);
		c.gridy = 2;
		this.add(this.b3, c);
	}

	private void eventoParrocchiaPerData() {
		GridBagConstraints c = new GridBagConstraints();
		c.insets = new Insets(0, 10, 10, 10);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 4;
		this.add(this.eventoParrPerData, c);
		c.gridy = 5;
		this.add(this.dataInizio, c);
		c.gridx = 1;
		this.add(this.data, c);
		c.gridy = 6;
		this.add(this.b4, c);
	}

	private void eventoNazionalePerData() {
		GridBagConstraints c = new GridBagConstraints();
		c.insets = new Insets(0, 10, 10, 10);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 3;
		c.gridy = 4;
		this.add(this.eventoNazPerData, c);
		c.gridy = 5;
		this.add(this.dataInizioN, c);
		c.gridx = 4;
		this.add(this.dataN, c);
		c.gridy = 6;
		this.add(this.b5, c);
	}
}
