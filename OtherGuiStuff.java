package GUI1;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class OtherGuiStuff extends JPanel implements ItemListener{
  private Choice equipList;
  private String equipmentItem;
  private JTextArea txtArea;
  private JLabel noStudents, noSets, addEquipList, equiplistLabel, teacher, room, date, period;
  private JTextField noStudentsField, noSetsField, addEquipListField, teacherField, roomField, dateField, periodField;
  private JButton addChem, submit;
  private GridBagConstraints gc;


  public OtherGuiStuff() {
	setLayout(new GridBagLayout());
	gc = new GridBagConstraints();
	setSize(600,350);

    noStudents = new JLabel("Number of Pupils:");
    noStudentsField =  new JTextField(10);

    noSets = new JLabel("Number of Sets needed:");
    noSetsField =  new JTextField(10);

    addEquipList = new JLabel("Additional Equipment needed");
    addEquipListField =  new JTextField(10);

    //addChem = new JButton("New Chemical");
    //addChem.addActionListener((ActionListener) this);
    //submit =  new JButton("Submit");

    equipList = new Choice();
    equipList.addItemListener(this);

    equipList.add("Beaker");
    equipList.add("Test Tube");
    equipList.add("Bunsen Burners");
    equipList.add("Pipettes");
    equipList.add("Graduated Cylinder");
    equipList.add("blank");

    txtArea = new JTextArea(10, 11);


    teacher = new JLabel ("Teacher:");
    teacherField = new JTextField(10);

    room = new JLabel ("Room:");
    roomField = new JTextField(10);

    date = new JLabel ("Date:");
    dateField  = new JTextField(10);

    period = new JLabel("Period:");
    periodField = new JTextField(10);

    setup();
  }
  public void setup () {

    gc.weightx = 1.0;
    gc.weighty = 1.0;
    gc.fill = GridBagConstraints.NONE;

////////////////////row 0/////////////////////////////

    gc.gridx = 0;
    gc.gridy = 0;
    gc.anchor = GridBagConstraints.LINE_START;
    add(date, gc);

    gc.gridy = 0;
    gc.gridx = 1;
    gc.anchor = GridBagConstraints.LINE_END;
    add(dateField, gc);

////////////////////row 1/////////////////////////////

    gc.gridy = 1;
    gc.gridx = 0;
    gc.anchor = GridBagConstraints.LINE_START;
    add(teacher, gc);

    gc.gridy = 1;
    gc.gridx = 1;
    gc.anchor = GridBagConstraints.LINE_END;
    add(teacherField, gc);

////////////////////row 2/////////////////////////////

    gc.gridy = 2;
    gc.gridx = 0;
    gc.anchor = GridBagConstraints.LINE_START;
    add(period, gc);

    gc.gridy = 2;
    gc.gridx = 1;
    gc.anchor = GridBagConstraints.LINE_END;
    add(periodField, gc);

////////////////////row 3/////////////////////////////

    gc.gridy = 3;
    gc.gridx = 0;
    gc.anchor = GridBagConstraints.LINE_START;
    add(room, gc);

    gc.gridy = 3;
    gc.gridx = 1;
    gc.anchor = GridBagConstraints.LINE_END;
    add(roomField, gc);

////////////////////row 4/////////////////////////////

    gc.gridy = 4;
    gc.gridx = 0;
    gc.anchor = GridBagConstraints.LINE_START;
    add(noStudents, gc);

    gc.gridy = 4;
    gc.gridx = 1;
    gc.anchor = GridBagConstraints.LINE_END;
    add(noStudentsField, gc);

////////////////////row 5/////////////////////////////

    gc.gridy = 5;
    gc.gridx = 0;
    gc.anchor = GridBagConstraints.LINE_START;
    add(noSets, gc);

    gc.gridy = 5;
    gc.gridx = 1;
    gc.anchor = GridBagConstraints.LINE_END;
    add(noSetsField, gc);

////////////////////row 6/////////////////////////////

    gc.gridy = 6;
    gc.gridx = 0;
    gc.anchor = GridBagConstraints.LINE_START;
    add(equipList, gc);


    gc.gridy = 6;
    gc.gridx = 1;
    gc.anchor = GridBagConstraints.LINE_END;
    add(new JScrollPane(txtArea), gc);

    ////////////////////row 7/////////////////////////////

    gc.gridy = 7;
    gc.gridx = 0;
    gc.anchor = GridBagConstraints.LINE_START;
    add(addEquipList, gc);

    gc.gridy = 7;
    gc.gridx = 1;
    gc.anchor = GridBagConstraints.LINE_END;
    add(addEquipListField, gc);

    //add(addChem);
  }

  public String getDate() {
    return dateField.getText();
  }

  public String getPeriod () {
    return periodField.getText();
  }

  public String getTeacher() {
    return teacherField.getText();
  }

  public String getroom() {
    return roomField.getText();
  }

  public String getNoStudents() {
    return noStudentsField.getText();
  }

  public String getNoSets() {
    return noSetsField.getText();
  }

  public String getEquip() {
    return addEquipListField.getText();
  }
  @Override
  public void itemStateChanged(ItemEvent e) {
    equipmentItem = equipList.getSelectedItem();
    txtArea.append(equipmentItem + '\n');

  }

}
