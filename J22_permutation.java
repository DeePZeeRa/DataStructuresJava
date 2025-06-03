
public class J22_permutation {
    public static void main(String[] args) {
        String str = "abc";
        permutaion("", str);
    }

    static void permutaion(String processed, String str){
        if(str.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch = str.charAt(0); 
        for(int i=0;i<=processed.length();i++){
            String f = processed.substring(0, i);
            String s = processed.substring(i,processed.length());
            permutaion(f+ch+s,str.substring(1));
        }
    }
}
