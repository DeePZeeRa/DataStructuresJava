

class Q21_125Palindrome {
	public boolean isPalindrome(String s) {
		if(s == "null" || s.length()==0){
			return true;
		}
		
		//!===================================================
		s = s.toLowerCase(); // changing to
		s = s.replaceAll("[^a-z0-9]","");
		//!===================================================
		
		for(int i=0 ; i<s.length()/2 ; i++){
			int start = s.charAt(i);
			int end = s.charAt(s.length()-i-1);
			
			if(start != end){
				return false;
			}
		}
		return true;
	}
}