public class Q34_skipCharactor {
    public static void main(String[] args) {
        String str = "baccdah";
        System.out.println(skip(str));
    }

 

    static String skip(String str){
        if(str.isEmpty()) return "";

        char ch = str.charAt(0);
        if(ch == 'a'){
            return skip(str.substring(1));
        }else{
            return ch + skip(str.substring(1));
        }
    }
}




// static void skipCharactor(String str,String processedString){
// // emptu
// if(str.isEmpty()){
// System.out.println(processedString);
// return;
// }

// char ch = str.charAt(0);
// if(ch == 'a'){
// skipCharactor(processedString, str.substring(1));
// }else{
// skipCharactor(processedString+ch, str.substring(1));
// }
// }