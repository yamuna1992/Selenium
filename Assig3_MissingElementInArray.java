package Week3.Day2;

public class Assig3_MissingElementInArray {
	
	public static void main(String[] args) {
		
	     int array[] = {1,2,3,4,7,6,8};
	     int x1 = getMissingNumber(array,8);
	    System.out.println("The Missing number is: "+ x1);
	}
	
	public static int getMissingNumber(int[] array, int i) {

	    int acctualnumber =0;
	    int expectednumber = (i*(i+1)/2);

	    for (int j : array) {
	        acctualnumber = acctualnumber+j;

	    }
	    return expectednumber-acctualnumber;
	}
}