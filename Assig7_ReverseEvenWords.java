package Week3.Day1;

public class Assig7_ReverseEvenWords {

	public static void main(String[] args) {
		String test="I am a software tester";
		String[] t = test.split(" ");

		String val = "";
		for (int i = 0; i < t.length; i++) {

		    if (i % 2 == 1)
		        val = val + new StringBuilder(t[i]).reverse().toString() + " ";
		    else
		        val = val + t[i] + " ";
		}
		val = val.trim();
		System.out.println(val);
		System.out.println("I ma a erawtfos tester".equals(val));
	}

}
