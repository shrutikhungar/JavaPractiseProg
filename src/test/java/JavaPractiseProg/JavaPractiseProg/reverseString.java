package JavaPractiseProg.JavaPractiseProg;

import java.lang.reflect.Array;

public class reverseString {
	 
	public static void main(String args[]) {
		
		String s="iturhs";
		/*Option 1: through charAt function of String
		int len = s.length();
		String revStr="";
		System.out.println("length of string is: "+len);
		for (int i=len-1;i>=0;i--) {
			revStr=revStr + s.charAt(i);
			
		}
		System.out.println("reverse string: " +revStr);
		*/
		//Option 2:through StringBuffer class
		StringBuffer sObj=new StringBuffer(s);
		System.out.println("string buffer reverse: " +sObj.reverse());
	}

}
