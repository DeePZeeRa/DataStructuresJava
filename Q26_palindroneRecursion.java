public class Q26_palindroneRecursion {
    public static void main(String[] args) {
        int number = 12321;

        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }
    static boolean isPalindrome(int n){
        return n == rev(n,0);
    }

    static int rev(int n,int reversed){
        if(n==0){
            return reversed;
        }
        return (rev(n/10,reversed*10+(n%10)));
    }
}
