package JavaPractiseProg.JavaPractiseProg;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class duplicateElement {

	public static void main(String args[]) {
		String arrNames[]= {"java","JavaScript","Ruby","java","Ruby"};
		//option 1: worst
		/*for  (int i=0;i<arrNames.length;i++) {
		 for (int j=i+1;j<arrNames.length;j++) {
			 if (arrNames[i].equals(arrNames[j])) {
				 System.out.println("Duplicate element is: "+arrNames[i]);
			 }
		 }
		}*/
		//Option 2:hashset: duplicate value are not allowed
		Set<String> store=new HashSet<String>();
		for (String name : arrNames) {
			if (store.add(name)==true);
			System.out.println("duplicate element is: "+name);
		}
	}
}

