import java.util.*;

public class Q38_duplicateSubsequence {
    public static void main(String[] args) {
        int [] arr= {2,3,2,1};
        List<List<Integer>> ans = duplicateSubsequence(arr);
        for (List<Integer> item : ans) {
            System.out.println(item);
        }
    }
    static List<List<Integer>> duplicateSubsequence(int [] arr){
        // first sort it [1,2,2,3,4]
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>(); //[]
        outer.add(new ArrayList<>()); //[[]]
        int start;
        int end = 0;
        for(int i =0;i<arr.length;i++){ //1
            start = 0;
            // if current and previous element is same, s=e+1
            if(  i>0 &&arr[i]==arr[i-1]){
                start= end+1;
            }
            end = outer.size() -1;
            int n = outer.size();
            for(int j = 0;j<n;j++){
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;

    }
}
