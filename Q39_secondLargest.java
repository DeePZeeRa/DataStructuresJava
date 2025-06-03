public class Q39_secondLargest {
    public static void main(String[] args) {
        int [] arr = {100,23,0,5,32,66};
        int fLargest = arr[0];
        int sLargest = Integer.MIN_VALUE;
        int index = 1;
        // System.out.println(secondLargest(arr, fLargest, sLargest, index));
        System.out.println(secLargest(arr,fLargest,sLargest));
        System.out.println(secSmallest(arr));
    }

    // using recursion
    static int secondLargest(int [] arr,int fLargest,int sLargest,int index){
        if(index == arr.length){
            return sLargest;
        }
        if(arr[index] > fLargest){
            sLargest = fLargest;
            fLargest = arr[index];
        } else if(arr[index] < fLargest && arr[index] > sLargest){
            sLargest = arr[index];
        }
        return secondLargest(arr, fLargest, sLargest, index+1);
    }

    // striver optimal way
    static int secLargest (int[] arr,int fLargest,int sLargest){
        
        for(int i =0;i<arr.length-1;i++){
            if(arr[i]>fLargest){
                sLargest = fLargest;
                fLargest = arr[i];
            }else if(arr[i]<fLargest && arr[i]>sLargest){
                sLargest = arr[i];
            }
        }
        return sLargest;
    }
    // smallest second no.
    static int secSmallest(int[] arr) {
        int sSmallest  = arr[0];
        int fSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < fSmallest) {
                sSmallest = fSmallest;
                fSmallest = arr[i];
            } else if (arr[i] > fSmallest && arr[i] < sSmallest) {
                sSmallest = arr[i];
            }
        }
        return sSmallest;
    }
}
