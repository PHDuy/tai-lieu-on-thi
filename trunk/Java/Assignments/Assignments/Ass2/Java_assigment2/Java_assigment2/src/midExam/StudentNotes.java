/**
 * 
 */
package midExam;

import java.io.Serializable;

public class StudentNotes implements Serializable, Comparable<StudentNotes> {
	private String iD;
	private String nameStudent;
	private float assignmentNote;
	private float midternNote;
	private float finalNote;
	private float totalNote;
	
	public String getiD() {
		return iD;
	}
	public void setiD(String iD) {
		this.iD = iD;
	}
	public String getNameStudent() {
		return nameStudent;
	}
	public void setNameStudent(String nameStudent) {
		this.nameStudent = nameStudent;
	}
	public float getAssignmentNote() {
		return assignmentNote;
	}
	public void setAssignmentNote(float assignmentNote) {
		this.assignmentNote = assignmentNote;
	}
	public float getMidternNote() {
		return midternNote;
	}
	public void setMidternNote(float midternNote) {
		this.midternNote = midternNote;
	}
	public float getFinalNote() {
		return finalNote;
	}
	public void setFinalNote(float finalNote) {
		this.finalNote = finalNote;
	}
	public float getTotalNote() {
		return totalNote;
	}
	public void setTotalNote(float totalNote) {
		this.totalNote = totalNote;
	}
	
	public StudentNotes()
	{}
	public StudentNotes(String iD, String nameStudent, float assignmentNote, float midternNote, float finalNote, float totalNote)
	{
		this.iD = iD;
		this.nameStudent = nameStudent;
		this.assignmentNote = assignmentNote;
		this.midternNote = midternNote;
		this.finalNote = finalNote;
		this.totalNote = totalNote;
	}
	public int compareTo(StudentNotes arg0) {
		// TODO Auto-generated method stub
		return (int) (this.getTotalNote() - arg0.getTotalNote()) ;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return iD +" : "+ nameStudent +" : "+ assignmentNote +" : "+ midternNote +" : "+ finalNote +" : "+ totalNote; 
	}
	
}