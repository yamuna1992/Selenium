package Week3.Day2;

import java.util.Set;
import java.util.TreeSet;

public class Assig2_SortingUsingCollection {

	public static void main(String[] args) {
			String[] input = {"HCL","Wipro","Aspire Systems","CTS"};
			
			Set<String> setValues = new TreeSet<String>();
			
			
			for (String temp : input) {
				setValues.add(temp);
				
			}
			
			System.out.println(setValues);
	}

}
