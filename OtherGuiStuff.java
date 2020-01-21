Package GUI1;
import java.awt.*;
import java.swing.*;

public class OtherGuiStuff extends JPanel implements ItemListener{
  private Choice equipList;
  private String equipmentItem;
  private TextArea txtArea;
  private Label chemName, dil, vol;
  private TextField chemNameField, dilField, volField;
  private Label noStudents, noSets, addEquipList, equiplistLabel, teacher, room, date, period;
  private TextField noStudentsField, noSetsField, addEquipListField, teacherField, roomField, dateField, periodField;
  private Button addChem, submit;


  public OtherGuiStuff() {
    noStudents = new Label("Number of Pupils:");
    noStudentsField =  new TextField(15);

    noSets = new Label("Number of Sets needed:");
    noSetsField =  new TextField(15);

    addEquipList = new Label("Additional Equipment needed");
    addEquipListField =  new TextField(15);

    addChem = new Button("New Chemical");
    addChem.addActionListener((ActionListener) this);
    submit =  new Button("Submit");

    equipList = new Choice();
    equipList.addItemListener(this);

    equipList.add("Beaker");
    equipList.add("Test Tube");
    equipList.add("Bunsen Burners");
    equipList.add("Pipettes");
    equipList.add("Graduated Cylinder");
    equipList.add("blank");

    equiplistLabel = new Label("Click an item the number of times you want that item");
    txtArea = new TextArea(20, 30);


    setSize(700, 1000);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setResizable(false);
    chemName = new Label ("Chemical:");
    chemNameField = new TextField();

    dil = new Label ("Dilution:");
    dilField = new TextField();

    vol = new Label("Volume:");
    volField = new TextField();

    teacher = new Label ("Teacher:");
    teacherField = new TextField(15);

    room = new Label ("Room:");
    roomField = new TextField(15);

    date = new Label ("Date:");
    dateField  = new TextField(15);

    period = new Label("Period:");
    periodField = new TextField(15);

    setup();
  }
  public void setup () {
    this.setLayout(new FlowLayout());

    add(date);
    add(dateField);

    add(teacher);
    add(teacherField);

    add(period);
    add(periodField);

    add(room);
    add(roomField);

    add(noStudents);
    add(noStudentsField);

    add(noSets);
    add(noSetsField);

    add(equipList);
    add(equiplistLabel);
    add(txtArea);

    add(addEquipList);
    add(addEquipListField);

    add(addChem);

    setVisible(true);
  }

  public String getDate() {
    return dateField.getText();
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
