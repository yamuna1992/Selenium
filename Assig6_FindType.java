package Week3.Day1;

public class Assig6_FindType {

		 public static void main(String[] args) {
				String test = "$$ Welcome to 2nd Class of Automation $$ ";
				count(test);

			}
			public static void count(String x){
				char[] ch = x.toCharArray();
				int letter = 0;
				int space = 0;
				int num = 0;
				int specialChar = 0;
				for(int i = 0; i < x.length(); i++){
					if(Character.isLetter(ch[i])){
						letter ++ ;
					}
					else if(Character.isDigit(ch[i])){
						num ++ ;
					}
					else if(Character.isSpaceChar(ch[i])){
						space ++ ;
					}
					else{
						specialChar ++;
					}
				}
				System.out.println("$$ Welcome to 2nd Class of Automation $$ ");
				System.out.println("letter: " + letter);
				System.out.println("space: " + space);
				System.out.println("number: " + num);
				System.out.println("specialChar: " + specialChar);
					}
		}
