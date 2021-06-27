package Week3.Day1;

public class StudentInfo_MultipleArgument {
	
	public void getStudentInfo(int id) {
		System.out.println(id);

	}
	
	public void getStudentInfo(int id, String Name) {
		System.out.println(id);

	}
	public void getStudentInfo(String emailid, int Phno) {
		System.out.println(Phno);

	}
	

	public static void main(String[] args) {
		StudentInfo_MultipleArgument Sma = new StudentInfo_MultipleArgument();
		Sma.getStudentInfo(648874);
		Sma.getStudentInfo(648874, "XYZ");
		Sma.getStudentInfo("asdfg@fgh", 6764);

	}

}
