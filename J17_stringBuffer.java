import java.util.ArrayList;

public class J17_stringBuffer {
	public static void main(String  [] args){
		// String name = "DEEPAYAN DAS";
		//? this will give error
//		System.out.println (new Integer (34) + new ArrayList<> ());
		// but this will not give any error
		//op --> 34[]
		System.out.println (new Integer(34) +""+ new ArrayList<> ());
	}
	
}
