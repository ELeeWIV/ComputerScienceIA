package GUI1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;

import Main.FileCreater;

public class GUI extends JFrame {

	private NewChem nc;
	private OtherGuiStuff ogs;
	private JButton submit;
	private FileCreater fc;

	public GUI() {
		super("Chemistry Department Organizer");
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {

				setLayout(new GridBagLayout());
				setResizable(true);
				fc = new FileCreater();


				GridBagConstraints gc = new GridBagConstraints();
				gc.weightx = 0;
				gc.weighty = 0;
				gc.insets = new Insets(6, 6, 6, 6);

				nc = new NewChem();
				Border line = BorderFactory.createTitledBorder("Chemicals");
				gc.gridx = 1;
				gc.gridy = 0;
				nc.setBorder(line);
				add(nc, gc);

				ogs = new OtherGuiStuff();
				line = BorderFactory.createTitledBorder("Class Information");
				gc.gridx = 0;
				ogs.setBorder(line);
				add(ogs, gc);

				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setSize(550, 450);
				setVisible(true);

				submit = new JButton("Submit");
				submit.addActionListener(new ActionListener () {

					@Override
					public void actionPerformed(ActionEvent e) {
						fc.addItems();
						dispose();

					}

				});
				gc.gridx = 0;
				gc.gridy = 1;
				gc.fill = GridBagConstraints.HORIZONTAL;
				add(submit, gc);


			}
		});

	}

	public static void main (String args[]) {
		GUI gui = new GUI();
	}

}
