package Week3.Day1;

public class Multiple_Student extends Multiple_Dept {

	public void studentName() {
		System.out.println("Student Name: XYZ");
	}

	public void studentDep() {
		System.out.println("Student Dept: CSE");
	}

	public void studentId() {
		System.out.println("Student ID: 234567");
	}

	public static void main(String[] args) {
		Multiple_Student MS = new Multiple_Student();
		MS.collegeName();
		MS.collegeCode();
		MS.collegeRank();
		MS.deptName();
		MS.studentName();
		MS.studentDep();
		MS.studentId();

	}

}
