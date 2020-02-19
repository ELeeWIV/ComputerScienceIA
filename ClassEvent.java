Package GUI2;
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Button;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class ClassEvent extends JPanel implements ItemListener {

  private JTextArea txtar;
  private JButton seen, confirm;
  private String date, teacher, room, noStudents, noSets, equipment;
  private RetrieveEmail re;
  private GridBagConstraints gc;
  private Email em;

  public ClassEvent (Date date) {
    setLayout(new GridBagLayout());
    gc = new GridBagConstraints();
    setSize (400,400);

    date = date.getDate();
    period = date.getPeriod();
    teacher= date.getTeacher();
    room= date.getRoom();
    noStudents= date.getNoStudents();
    noSets = date.getNoSets();
    equipment= date.getEquipment();

    txtar = new JTextArea();
    txtar.append(date);
    txtar.append(period);
    txtar.append(teacher);
    txtar.append(room);
    txtar.append(noStudents);
    txtar.append(noSets);
    txtar.append(equipment);


    seen = new JButton("seen");
    seen.addActionListener(new ActionListener () {
      @Override
      public void actionPerformed (ActionEvent e) {
        em.se(teacher + "," + "/n" + "     Your order has been seen by the lab technition. thank you" + "/n" + "     This is an email from an automatic bot, please do not reply.", true);
      }
    });

    confirm = new JButton ("confirm");
    confirm.addActionListener(new ActionListener () {
      @Override
      public void actionPerformed(ActionEvent e){
        em.se(teacher + "," + "/n" + "     Your materials are ready. Thank you." + "/n" + "     This is an email from an automatic bot, please do not reply.", false)
      }
    });
    setup();
  }

  public void setup () {
    gc.weightx = 1.0;
    gc.weighty = 1.0;
    gc.fill = GrideBagConstraints.NONE;

    ////////////////////////////////////////////row 0

    gc.gridx = 0;
    gc.gridy = 0;
    add(txtar, gc);

    ////////////////////////////////////////////row 1
    gc.gridx = 0;
    gc.gridy = 1;
    add(seen, gc);

    gc.gridx = 1;
    add(confirm, gc);
  }


}
