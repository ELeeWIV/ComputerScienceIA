package GUI1;
import java.awt.Label;
import java.awt.TextField;

public class NewChem extends JPanel {
	private Label chemName, dil, vol;
	private TextField chemNameField, dilField, volField;

	public NewChem() {
		chemName = new Label ("Chemical:");
		chemNameField = new TextField();

		dil = new Label ("Dilution:");
		dilField = new TextField();

		vol = new Label("Volume:");
		volField = new TextField();

	}

	public void addChemical() {
		add(chemName);
		add(chemNameField);

		add(dil);
		add(dilField);

		add(vol);
		add(volField);
	}

}
