
public class StudentList {

	private Student[] ls;
	
	public StudentList(int n) {
		ls = new Student[n];
	}
	
	public void sort() {
		//bubble sort
		int n = 0;
		for (int j = 0; j < ls.length; j++) {
			if (! ls[j].equals(null) ) {
				n++;
			}
		}
		
		boolean swap = false;
		Student temp;
		while (! swap) {
			swap = true;
			for (int i = 1; i < n; i++) {
				if (ls[i-1].getIndex() > ls[i].getIndex()) {
					swap = false;
					temp = ls[i];
					ls[i] = ls[i-1];
					ls[i-1] = temp;
				}
			}
		}
		
	}
	
	public void addStudent(Student s) {
		 for (int i = 0; i < ls.length; i++) {
			 if ( ls[i].equals(null) ) 	{ ls[i] = s; }
		 } this.sort();
	}
}
