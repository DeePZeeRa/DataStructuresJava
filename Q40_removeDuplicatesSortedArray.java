import java.util.ArrayList;

public class Q40_removeDuplicatesSortedArray {
    public static void main(String[] args) {
        int [] arr = {1,1,2,3,4,66,4,4,5,5,5};
        System.out.println(removeDuplicate(arr));
    }

    static ArrayList<Integer> removeDuplicate(int arr[]){
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i = 0;i<arr.length-2;i++){
            if(arr[i] == arr[i+1]){
                continue;
            }else{
                temp.add(arr[i]);
            }
        }
        return temp;
    } 
}


// Time Complexity: O(n)
// Space Complexity: O(n) (for the temp ArrayList)