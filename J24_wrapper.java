public class J24_wrapper {
    public static void main(String[] args) {
        int a = 34;
        int b =33;
        swap(a, b);
        System.out.printf("%d %d",a,b);
    }
    static void swap(int a, int b){
        int temp = a;
        a=b;
        b=temp;
    }
}
