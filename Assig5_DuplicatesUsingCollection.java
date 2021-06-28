package Week3.Day2;

public class Assig5_DuplicatesUsingCollection {

	public static void main(String[] args) {
		// Initialize array
		int[] arr = new int[] { 1, 3, 8, 3, 11, 5, 6, 4, 7, 6, 7 };

		System.out.println("Duplicate elements in given array: ");

		// Searches for duplicate element

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j])
					System.out.println(arr[j]);
			}
		}
	}
}
