package GUI1;
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Label;
import java.awt.TextField;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class NewChem extends JPanel {
	private Label chemName, dil, vol;
	private TextField chemNameField, dilField, volField;
	private GridBagConstraints gc;

	public NewChem() {
		Border chemborder = BorderFactory.createTitledBorder("Chemical");
		setLayout(new GridBagLayout());
		chemName = new Label ("Chemical:");
		chemNameField = new TextField(10);

		dil = new Label ("Dilution:");
		dilField = new TextField(10);

		vol = new Label("Volume:");
		volField = new TextField(10);
		gc = new GridBagConstraints();

		addChemical();
	}

	public void addChemical() {
		gc.weightx = 1;
		gc.weighty = 1;
		gc.fill = GridBagConstraints.NONE;

		///////////////////////////// row 1 /////////////////////////////////////

		gc.gridx = 0;
		gc.gridy = 0;
		gc.anchor = GridBagConstraints.LINE_START;
		add(chemName, gc);

		gc.gridx = 1;
		gc.gridy = 0;
		gc.anchor = GridBagConstraints.LINE_END;
		add(chemNameField, gc);

		///////////////////////////// row 2 /////////////////////////////////////

		gc.gridx = 0;
		gc.gridy = 1;
		gc.anchor = GridBagConstraints.LINE_START;
		add(dil, gc);
		gc.gridx = 1;
		gc.gridy = 1;
		gc.anchor = GridBagConstraints.LINE_END;
		add(dilField, gc);

		///////////////////////////// row 1/////////////////////////////////////

		gc.gridx = 0;
		gc.gridy = 2;
		gc.anchor = GridBagConstraints.LINE_START;
		add(vol, gc);

		gc.gridx = 1;
		gc.gridy = 2;
		gc.anchor = GridBagConstraints.LINE_END;
		add(volField, gc);
	}

	public String getChem() {
		System.out.println(chemNameField.getText());
		return chemNameField.getText();
	}
	public String getDil() {
		System.out.println(dilField.getText());
		return dilField.getText();
	}
	public String getVol() {
		System.out.println(volField.getText());
		return volField.getText();
	}

}
