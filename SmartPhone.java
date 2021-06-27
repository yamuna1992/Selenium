package Week3.Day1;

public class SmartPhone extends AndroidPhone {
	
	public static void connectWhatsApp() {
		
		System.out.println("connecting whatsapp");
	}
	
	public static void takeVideo() {
		System.out.println("video Downloaded");
	}
	
	public static void main(String[] args) {
		SmartPhone see = new SmartPhone();
		see.takeVideo();
		System.out.println("Method overriding");
	}
}
