package Main;

import java.io.BufferReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class RetrieveFile {
//
	private BufferReader bufferreader;
	private FileReader filereader;
	private String filename, line, date, period, teacher, room, noStudents, noSets, equipment;
	private int lineCounter;
//
	public RetrieveFile() {
		//filename = whatever the getsubject code is
		lineCounter = 0;
		try {
			filereader = new fileReader(filename)
			bufferreader = new BufferReader(filereader);
		}
		catch (FileNotFoundException e) {e.printStackTrace();}
		catch (IOException e) {e.printStackTrace();}
	}
//
	public void getData() {
		while (line = bufferreader.readline() != null){
			line = bufferreader/readline();
			if (linecounter == 0) {
				date = line;
			}
			else if (lineCounter == 1){
				period = line;
			}
			else if (lineCounter == 2){
				teahcer = line;
			}
			else if (lineCounter == 3){
				room = line;
			}
			else if (lineCounter == 4){
				noStudents = line;
			}
			else if (lineCounter == 5){
				noSets = line;
			}
			else if (lineCounter == 6){
				noSets = line;
			}
			else if (lineCounter == 7){
				equipment = line;
			}
		}
	}

	public String getDate() {
		return date;
	}

	public String getPeriod() {
		return period;
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
