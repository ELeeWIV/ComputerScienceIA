package GUI1;
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Button;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class NewChem extends JPanel implements {
	private Label chemName, dil, vol;
	private TextField chemNameField, dilField, volField;
	private Button anth;
	private GridBagConstraints gc;
	private ArrayList<Chemical> arr1;
	private Chemcial ch;

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

		arr1 = new ArrayList<Chemical>;

		anth = new Button("Another Chemical");
		anth.addActionListener(new ActionListener () {
			@Override
			public void actionPerformed(ActionEvent e) {
				ch = new Chemical(getChem(), getDil(), getVol());
				arr1.add(ch);
			}
		})


		addChemical();
	}
	public void addChemical() {
		gc.weightx = 1;
		gc.weighty = 1.5;
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
	public String getVol(){
		return volField.getText();
	}
	public String getDil(){
		return dilField.getText();
	}
	public String getChem(){
		return chemFiled.getText();
	}
	public ArrayList returnArr(){
		return arr1;
	}
}
