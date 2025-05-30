import java.util.ArrayList;

public class Q30_linearSearch {
    public static void main(String[] args) {
         int []arr = {1,23,5,6,6,4,32};
         ArrayList<Integer> result = findAllIndexArrayList(arr, 6, 0, new ArrayList<>());
         System.out.println(result);
   
    }
    static boolean find(int [] arr,int target, int index){
        if(index == arr.length){
            return false;
        }
        if(arr[index]==target) return true;
        else return find(arr,target,index+1);
    }

    // find index
    static int findIndex(int [] arr,int target, int index){
        if (index == arr.length) {
            return -1;
        }
        if(arr[index] == target) return index;
        else return findIndex(arr, target, index+1);
    }

    // find all index (multiple occurence)
    static ArrayList<Integer> arraylist = new ArrayList<>();
    static void findAllIndex(int [] arr,int target, int index){
        if (index == arr.length) {
            return ;
        }
        if (arr[index] == target)
            arraylist.add(index);
        findAllIndex(arr, target, index + 1);
    }


    //! return arraylist of occurence of a target
    static ArrayList<Integer> findAllIndexArrayList(int[] arr, int target, int index,ArrayList<Integer> arraylist) {
        if (index == arr.length) {
            return arraylist; 
        }
        if (arr[index] == target)
            arraylist.add(index);
        return findAllIndexArrayList(arr, target, index + 1, arraylist);
    }
}
