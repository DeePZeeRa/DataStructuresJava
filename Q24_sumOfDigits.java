public class Q24_sumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumDigit(2344));
    }
    static int sumDigit(int n){
        int remainder = n % 10;
        int remaining =n/10;

        if(remaining == 0){
            return n;
        }
        return remainder + sumDigit(remaining);

    }
}
