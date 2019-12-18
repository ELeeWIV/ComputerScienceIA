package Main;

import java.io.BufferReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class RetrieveEmail {
//
	private BufferReader bufferreader;
	private FileReader filereader;
	private String filename, line, date, teacher, room, noStudents, noSets, equipment;
	private int lineCounter;
//
	public RetrieveEmail() {
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
				teahcer = line;
			}
			else if (lineCounter == 2){
				room = line;
			}
			else if (lineCounter == 3){
				noStudents = line;
			}
			else if (lineCounter == 4){
				noSets = line;
			}
			else if (lineCounter == 5){
				noSets = line;
			}
			else if (lineCounter == 6){
				equipment = line;
			}
		}
	}
//
}
