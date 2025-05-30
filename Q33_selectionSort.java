public class Q33_selectionSort {
    public static void main(String[] args) {
        
    }
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
