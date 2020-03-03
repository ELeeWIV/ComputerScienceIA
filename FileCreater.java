package Main;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Formatter;

import GUI1.GUI;
import GUI1.NewChem;
import GUI1.OtherGuiStuff;

public class FileCreater {

	private FileOutputStream output;
	private OutputStreamWriter outputWriter;
	private BufferedWriter bw;
	private String teacher, room, noStudents, noSets, equipment, date, chem, dil, vol;
	private OtherGuiStuff gui;
	private NewChem gui2;


	public FileCreater() {
		gui = new OtherGuiStuff();
		gui2 = new NewChem();
		try {
			output = new FileOutputStream(/*date + room + teacher + */"thisFile.txt");
			outputWriter =  new OutputStreamWriter (output, "UTF-16");
			bw = new BufferedWriter (outputWriter);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void addItems() {
		date = gui.getDate();
		teacher = gui.getTeacher();
		room = gui.getroom();
		noStudents = gui.getNoStudents();
		noSets = gui.getNoSets();
		equipment = gui.getEquip();
		chem = gui2.getChem();
		dil = gui2.getDil();
		vol = gui2.getVol();
		/*date = "a";
		teacher = "b";
		room = "c";
		noStudents = "d";
		noSets = "e";
		equipment = "f";
		chem = "g";
		dil = "h";
		vol = "i";*/
		try {
			bw.write(date);
			bw.write("\n");
			bw.write(teacher);
			bw.write("\n");
			bw.write(room);
			bw.write("\n");
			bw.write(noStudents);
			bw.write("\n");
			bw.write(noSets);
			bw.write("\n");
			bw.write(equipment);
			bw.write("\n");
			bw.write(chem);
			bw.write("\n");
			bw.write(dil);
			bw.write("\n");
			bw.write(vol);
			bw.close();
		}
		catch (IOException e) {e.printStackTrace();}
	}
	/*public static void main (String args[]) {
		FileCreater fc = new FileCreater();
	}*/
}
