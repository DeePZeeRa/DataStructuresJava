public class Q35_skipString {
    public static void main(String[] args) {
        String str = "baccdah";
        System.out.println(skipString(str));
    }
    static String skipString(String str){
        if(str.isEmpty()) return "";

        if(str.startsWith("apple")){
            return skipString(str.substring(5));
        }else{
            return str.charAt(0)+skipString(str.substring(1));
        }
    }

    
}
