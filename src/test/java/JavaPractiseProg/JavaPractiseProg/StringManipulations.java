package JavaPractiseProg.JavaPractiseProg;

public class StringManipulations {
	public static void main(String[] args) {
		String strArr[];
		String str="program the main has the key program. program";
		int occ=0;
		str=str.replace(".","");
		strArr=str.split(" ");
		for (int i=0;i<strArr.length;i++) {
			if (strArr[i].equals("program")){
				occ=occ+1;
			}
		}
		System.out.println(occ);
		
	}
}
