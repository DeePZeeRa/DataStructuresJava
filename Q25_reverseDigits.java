public class Q25_reverseDigits {
    public static void main(String[] args) {
        // reverse1(1234);
        // System.out.println(sum);

        System.out.println(reverse2(1234));
 
    }
    // 1st approach
    static int sum = 0;
    static void reverse1(int n){
        if(n==0){
            return;
        }
        int remainder = n % 10;
        // int remaining = n/10;
        sum = sum *10 + remainder;
        // reverse1(remaining);

        System.out.println(reverse2(1234));
    }

    // 2nd approach - complex approach
    static int reverse2(int n){
        int digits = (int)(Math.log10(n)+1);
        return helper(n,digits);

    }
    static int helper(int n,int digits){
        if(n%10==n){
            return n;
        }
        int rem = n%10;
        int temp= (int)Math.pow(10, digits-1);
        return rem*temp+ helper(n/10, digits-1);
    }
}
