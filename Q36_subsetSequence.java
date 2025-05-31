import java.util.ArrayList;

public class Q36_subsetSequence {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(subSequence2("", str));
    }
    static void subSequence(String pstr,String str){
        if(str.isEmpty()) {
            System.out.println(pstr);
            return;
        }
        char ch = str.charAt(0);

        subSequence(pstr, str.substring(1)); // ignore it
        subSequence(pstr+ch, str.substring(1)); // add it 
    }


    // return arraylist of string
    static ArrayList<String> subSequence2(String pstr, String str) {
        if (str.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(pstr);
            return list;

        }
        char ch = str.charAt(0);

        ArrayList<String> left =subSequence2(pstr + ch, str.substring(1)); // add it
        ArrayList<String> right = subSequence2(pstr, str.substring(1)); // ignore it


        // adding all the arraylist together
        left.addAll(right);
        return left;
    }
}

// o/p -->  abc ab ac a bc b c

//logic 
//                         abc
        //         "a"/bc       ""/bc 
        //     ab/c      a/c   b/c     ""/c
        // abc/""  ab/"" ac/"" a/"" .........
       
