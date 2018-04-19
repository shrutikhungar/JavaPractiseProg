package JavaPractiseProg.JavaPractiseProg;

public class reverseInt {
	public static void main(String args[]) {
		long num=800909087;
		long rev=0;
		
		//option 1:
		/*while (num!=0) {
			rev=rev*10 + num % 10;
			num=num / 10;
		}*/
		//option 2:
		long num1=98765;
		StringBuffer buffObj=new StringBuffer(String.valueOf(num1)).reverse();
		System.out.println(buffObj);
	}

}
