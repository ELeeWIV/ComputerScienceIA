package Main;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Formatter;

public class FileCreater {

	private FileOutputStream output;
	private OutputStreamWriter outputWriter;
	private BufferedWriter bufferwriter;
	private String teacher, room, noStudents, noSets, equipment, date;
	private GUI gui;
	private ArrayList<Chemcial> arr2;
	private NewChem nc;


	public FileCreater() {
		date = gui.getDate();
		period = gui.getPeriod();
		teacher = gui.getTeacher();
		room = gui.getroom();
		noStudents = gui.getNoStudents();
		noSets = gui.getNoSets();
		equipment = gui.getEquip();
		arr2 = nc.returnArr();
		try {
			output = new FileOutputStream(date + period + room + ".txt");
			outputWriter =  new OutputStreamWriter (output, "UTF-16");
			bufferwriter = new BufferedWriter (outputWriter);

		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void addItems() {
		try {
			bufferwriter.write(date);
			bufferwriter.newLine();
			bufferwriter.write(period);
			bufferwriter.newLine();
			bufferwriter.write(teacher);
			bufferwriter.newLine();
			bufferwriter.write(room);
			bufferwriter.newLine();
			bufferwriter.write(noStudents);
			bufferwriter.newLine();
			bufferwriter.write(noSets);
			bufferwriter.newLine();
			bufferwriter.write(equipment);
			for (int i : arr2) {
				bufferwriter.write(arr2.get(i));
				bufferwriter.newLine();
			}
		}
		catch (IOException e) {e.printStackTrace();}
	}
	public String getDate() {
		return date;
	}

	public void getTeacher(){
		return teahcer;
	}

	public void getRoom(){
		return room;
	}

	public void getNoStudents(){
		return noStudents;
	}

	public void getNoSets(){
		return noSets;
	}

	public void getEquipment(){
		return equipment;
	}

}
