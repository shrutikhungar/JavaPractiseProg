package JavaPractiseProg.JavaPractiseProg;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class largestSmallestNumber {
	
	public static void main(String[] args) {
		int numbers[]= {10 , 20, 28 , 5 , 30, 9872,223,0};
		int smallest=numbers[0];
		int largest=numbers[0];
		
		for (int i=1;i<numbers.length;i++) {
			if (numbers[i]>largest) {
				largest=numbers[i];
			}
			else if (numbers[i]<smallest) {
				smallest=numbers[i];
			}
		}
		System.out.println("smallest number is: "+smallest);
		System.out.println("largest number is: "+largest);
	}
}
