import java.util.*;

class J16_insertionSort {
	public static void main(String[] args) {
		int[] arr = {13, 211, 33, 46, 35};
		InsertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	static void InsertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int current = i;
			for (int j = i - 1; j >= 0; j--) {
				if (arr[current] < arr[j]) {
					int temp = arr[current];
					arr[current] = arr[j];
					arr[j] = temp;
					current = j; // Update current so the next comparison is with the left side
				} else {
					break;
				}
			}
		}
	}
}



// why you use insertion sort

//--> steps get reduced as compared to bubble sort
// --> stable sort, used for smaller values of size

// -> sometimes they are partially sorted



