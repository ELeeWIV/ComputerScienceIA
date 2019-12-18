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


	public FileCreater() {
		date = gui.getDate();
		teacher = gui.getTeacher();
		room = gui.getroom();
		noStudents = gui.getNoStudents();
		noSets = gui.getNoSets();
		equipment = gui.getEquip();
		try {
			output = new FileOutputStream(date+room+teacher+".txt");
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
			bufferwriter.write(teacher);
			bufferwriter.newLine();
			bufferwriter.write(room);
			bufferwriter.newLine();
			bufferwriter.write(noStudents);
			bufferwriter.newLine();
			bufferwriter.write(noSets);
			bufferwriter.newLine();
			bufferwriter.write(equipment);
		}
		catch (IOException e) {e.printStackTrace();}
	}

}
