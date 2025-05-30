public class Q29_checkArraySorted {
    public static void main(String[] args) {
        int [] arr = {1,3,4,6,8};
        System.out.println(isSorted(arr, 0));
    }
    static boolean isSorted(int [] arr,int index){
        if(index == arr.length-1){
            return true;
        }
        if(arr[index]<arr[index+1]){
            return isSorted(arr, index+1);
        }else{
            return false;
        }
    }

}
