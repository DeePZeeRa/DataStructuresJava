public class Q22_Fibonacci_nth
{
	public static void main(String  [] args){
		System.out.println (Fibonacci (7));
	}
	
	static int Fibonacci(int n){
		if(n<2){
			return n;
		}
		return Fibonacci (n - 1) + Fibonacci (n - 2);
	}
}
