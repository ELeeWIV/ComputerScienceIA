package Main;

import java.awt.*;
import java.swing.*;

public class GUI extends JFrame implements ActionListener, ItemListener{

	private NewChem nc;
	private OtherGuiStuff ogs;

	public GUI() {
		Swingutilities.invokeLater(new Runnable() {
			public void run() {
				super("Chemistry Department Organizer");
				setLayout(new BoarderLayout());
				nc = new NewChem();
				add(nc, setBoarderLayout.LEFT);
				ogs = new OtherGuiStuff();
				add(ogs, setBoarderLayout.RIGHT);
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				this.setSize(600, 500);
				this.setVisible(true);
			}
		})

	}

	public static void main (String args[]) {
		GUI gui = new GUI();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == addChem) {
			//aNewChem.addChemical();
			add(chemName);
			add(chemNameField);

			add(dil);
			add(dilField);

			add(vol);
			add(volField);
		}
		if (e.getSource() == submit) {

		}

	}
}
