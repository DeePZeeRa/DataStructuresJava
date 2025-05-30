// import java.util.ArrayList;
import java.util.Arrays;

public class Q32_bubbleSortRecursion {
    public static void main(String[] args) {
        int []arr = {1,23,5,6,6,4,32};
         bubbleSortRecursion(arr, arr.length-1, 0);
         System.out.println(Arrays.toString(arr));
    }
    // 4 3 2 1
    // 3 2 1 
    // 2 1
    // 1
    static void bubbleSortRecursion(int [] arr,int end,int loop){
        if(end == 0 ){
            return;
        }
        if(loop < end){
            if(arr[loop]>arr[loop+1]){
                int temp = arr[loop];
                arr[loop]= arr[loop+1];
                arr[loop+1]=temp;
            }
            bubbleSortRecursion(arr,end, loop+1);
        }else{
            bubbleSortRecursion(arr, end-1, 0);
        }
    }
}
