package Week3.Day1;

public class Inheritance_Desktop extends Inheritance_Computer{
	
	public void desktopSize() {
		System.out.println("Desktop Size");
		
	}

	public static void main(String[] args) {
		
		Inheritance_Desktop id = new Inheritance_Desktop();
		id.desktopSize();
		id.computerModel();

	}

}
