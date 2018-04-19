package JavaPractiseProg.JavaPractiseProg;

public class JunkLetterRemove {

	public static void main(String args[]) {
		String s="#@@      $123DFDFDdff0#@$# 92323 #$#$";
		//regular exp [^a-zA-Z0-9]
		s=s.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(s);
	}
}
