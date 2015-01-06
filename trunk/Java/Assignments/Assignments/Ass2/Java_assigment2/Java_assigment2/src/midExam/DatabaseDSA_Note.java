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
	protected static StudentNotes[] listOfStudents = new StudentNotes[28];
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
			//System.out.println(obj);
		}
	}
	
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		String fileNameInText = "src\\midExam\\midData\\InMid.txt";
		String fileNameOutObj = "src\\midExam\\midData\\Out.obj";
		DatabaseDSA_Note dbase = new DatabaseDSA_Note();
		dbase.readData(fileNameInText);
		System.out.println("==============Danh Sach Sinh Vien duoi 5==============");
		dbase.findNotSatisfied();
		System.out.println("==============Top 5 Sinh Vien Diem Cao==============");
		dbase.findGoods();
		dbase.insertionSort(listOfStudents);
		dbase.out();
		dbase.writeData(fileNameOutObj);
		dbase.readObj(fileNameOutObj);
	}

	public void bubbleSort(Object[] data) {// Sắp xếp tổng điểm của học viên
		// TODO Auto-generated method stub
		StudentNotes[] array = (StudentNotes[])data;
		for (int a=1; a<size; a++) {
	        for(int b=0; b<size - a; b++) {
	            if (((array[b].getTotalNote())<(array[b+1].getTotalNote()))){
	            	StudentNotes temp = array[b];
	            	array[b] = array[b+1];
	            	array[b+1] = temp;
	            }   
	        }
	    }
	}

	public void insertionSort(Object[] data) {//Sắp xếp theo họ của học viên
		// TODO Auto-generated method stub
		StudentNotes[] array = (StudentNotes[])data;
		int in, out;
	    for (out = 1; out < size; out++) {
	      StudentNotes temp = array[out];
	      in = out;
	      while (in > 0 && array[in - 1].getNameStudent().compareTo(temp.getNameStudent()) > 0) {
	    	  array[in] = array[in - 1];
	    	  --in;
	        }
	      array[in] = temp;
	      }
	}

	public void findNotSatisfied() {//Tìm học viên có tổng điểm dưới 5
		// TODO Auto-generated method stub
		for (int i = 0; i<listOfStudents.length;i++) {
		      if(listOfStudents[i].getTotalNote()<5.0)
		    	  System.out.println(listOfStudents[i]);
		    }
	}

	public void findGoods() {// Tìm 5 học viên có tổng điểm cao nhất
		// TODO Auto-generated method stub
		bubbleSort(listOfStudents);
		    for(int i = 0; i<5;i++){	
		    	System.out.println(listOfStudents[i]);
		    }
	}

	public void out() {//Xuất danh sách Học viên ra màn hình
		// TODO Auto-generated method stub
		System.out.print("==========Danh Sach Hoc Vien:==========\r\n");
		for (int i = 0; i<listOfStudents.length;i++) {
		      System.out.println(listOfStudents[i]);
		    }
	}
}