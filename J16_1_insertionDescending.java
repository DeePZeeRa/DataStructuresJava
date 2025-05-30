import java.util.*;

public class J16_1_insertionDescending {
	
	
		public static void main(String [ ]args){
			int []arr = {13,211,33,46,35};
			InsertionSort(arr);
			System.out.println (Arrays.toString(arr));
			
		}
		
		static void InsertionSort(int[] arr){
			for(int i =1;i<arr.length;i++){
				int current = i;
				for(int j = 0;j<i;j++){  // only change
					if(arr[current]<arr[j]){
						int temp = arr[current];
						arr[current] = arr[j];
						arr[j]=temp;
						
					}else{
						break;
					}
				}
			}
		}
	
}
