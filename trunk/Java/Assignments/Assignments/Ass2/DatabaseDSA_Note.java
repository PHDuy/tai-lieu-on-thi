package midExam;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.StringTokenizer;

public class DatabaseDSA_Note implements FunctionsOfNoteDatabase{
	
	protected int size =0;
	protected static StudentNotes[] listOfStudents = new StudentNotes[50];
	protected boolean sorted = false;
	
	
	// Read data from the text file
	public void readData(String fileName) throws IOException{
		BufferedReader fInText = new BufferedReader(new FileReader (fileName));
		String s;
		while((s=fInText.readLine()) != null){
			//System.out.println(s);
			StringTokenizer line = new StringTokenizer (s);
			//while(line.hasMoreTokens()){
				//System.out.println(line.nextToken(":"));
			//}
			String id = line.nextToken(":");
			String name = line.nextToken(":");
			float assignment = Float.parseFloat(line.nextToken(":"));
			float mid = Float.parseFloat(line.nextToken(":"));
			float finalnote = Float.parseFloat(line.nextToken(":"));
			float total = (assignment*0.4f+mid*0.2f+finalnote*0.4f);
			listOfStudents[size++] = new StudentNotes(id, name, assignment, mid, finalnote, total);
			//System.out.println(listOfStudents[size-1]); 
		}
		
		fInText.close();
	}
	
	public void writeData(String fileName) throws IOException{
		ObjectOutputStream fOutObj = new ObjectOutputStream (new FileOutputStream(fileName));
		for(int i=0; i<size; ++i)
			fOutObj.writeObject(listOfStudents[i]);
		
		fOutObj.close();
	}
	
	
	public void readObj(String fileName) throws IOException, ClassNotFoundException{
		Object obj;
		System.out.println("List of all students: ");
		ObjectInputStream fInObj = new ObjectInputStream (new FileInputStream(fileName));
		for(int i=0; i<size; ++i){
			obj = fInObj.readObject();
			System.out.println(obj);
		}
	}
	
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		String fileNameInText = "src\\midExam\\midData\\InMid.txt";
		String fileNameOutObj = "src\\midExam\\midData\\Out.obj";
		DatabaseDSA_Note dbase = new DatabaseDSA_Note();
		dbase.readData(fileNameInText);
		dbase.insertionSort(listOfStudents);
		dbase.findNotSatisfied();
		dbase.findGoods();
		dbase.out();
		dbase.writeData(fileNameOutObj);
		dbase.readObj(fileNameOutObj);
	}
}
