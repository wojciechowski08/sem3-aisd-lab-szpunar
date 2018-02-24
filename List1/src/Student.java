
public class Student implements Comparable<Student> {

	private String name;
	private String surname;
	private double grade;
	private int index;
	
	public Student() {
		this.name = "Jan";
		this.surname = "Kowalski";
		this.grade = 3.0;
		this.index = 000001;
	}
	
	public Student(int i,String n, String sn) {
		this.name = n;
		this.surname = sn;
		this.index = i;
	}
	
	public void setGrade(double g) 	{ this.grade = g; }
	
	public String getName() 		{ return this.name; }
	public String getSurame() 		{ return this.surname; }
	public int getIndex() 			{ return this.index; }
	public double getGrade() 		{ return this.grade; }
	
	@Override
	public String toString() {
		return "";////////////////////////////////////////////////
	}
	
	@Override
	public int compareTo(Student arg0) {
		// TODO Auto-generated method stub
		if (this.index > arg0.index) {
			return 1;
		} else if (this.index < arg0.index) {
			return -1;
		} else {
			return 0;
		}
		
	}
	
	
	
}
