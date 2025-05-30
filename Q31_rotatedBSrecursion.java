import java.util.ArrayList;

public class Q31_rotatedBSrecursion {
    public static void main(String[] args) {
         int []arr = {1,23,5,6,6,4,32};
         int result = rotatorySearch(arr, 6, 0, arr.length-1);
         System.out.println(result);
   
    }
    static int rotatorySearch(int [] arr,int target,int start, int end){
        if(start>end){
            return -1;
        }
        int mid = start + (end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[start]<=arr[mid]){
            if(target >=arr[start] && target <=arr[mid]){
                return rotatorySearch(arr, target, start, mid-1);
            }else{
                return rotatorySearch(arr, target, mid+1, end);
            }
        }
        if(arr[mid]>= target && target<=arr[end]){
            return rotatorySearch(arr, target, mid + 1, end);
        }
        return rotatorySearch(arr, target, start, mid - 1);
    }
}
