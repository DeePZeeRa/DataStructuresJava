public class Q27_countZeros {
    public static void main(String[] args) {
        int count = 0 ;
        int n =300;
        System.out.println(countZeros(n, count));
    }
    static int countZeros(int n,int count){
        if(n==0){
            return count;
        }
        if(n%10 == 0){
            return countZeros(n/10, count+1);
        }else{
            return countZeros(n / 10, count);
        }
    }
}
