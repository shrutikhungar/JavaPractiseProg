package JavaPractiseProg.JavaPractiseProg;
public class missingNumberArray{
	public static void main(String[] args) {
		int sum=0;
		int sum1=0;
		int a[]={1,2,3,4,5,6,7,8,10};
		for (int i=0;i<a.length;i++){
		sum=sum+a[i];
		}


		for (int j=1;j<=10;j++){
		sum1=sum1+j;
		
		}
		int diff=sum1-sum;
		System.out.println("missing number:  "+diff);
	}
}