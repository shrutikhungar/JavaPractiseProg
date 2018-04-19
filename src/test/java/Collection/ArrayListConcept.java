package Collection;

import java.util.ArrayList;
import java.util.Iterator;

//static array int a[]=new int[3] can store only 
//array list is dynamic array

public class ArrayListConcept {
	public static void main(String args[]) {
		//non generic arrayList obj
		ArrayList algenObj=new ArrayList();
		algenObj.add(13);
		algenObj.add(33.15);
		algenObj.add("Shruti");
		algenObj.add(true); 
		algenObj.add(16);
		System.out.println(algenObj.size());
		System.out.println(algenObj.get(5));
		
		//non generic arrayList obj: only allow integer
		ArrayList<Integer> alNonGIObj=new ArrayList<Integer>();
		alNonGIObj.add(12);	
		System.out.println(alNonGIObj.size());
		//non generic arrayList obj: only allow integer
		ArrayList<String> alNonGSObj=new ArrayList<String>();
		alNonGSObj.add("Shruti");
		alNonGSObj.add("Nysa");
		System.out.println(alNonGSObj.size());
		
		//to store objects in the array list
		//Employee class obj
		Employee empObj1=new Employee("Shruti",111,"IT");
		Employee empObj2=new Employee("Nitin",112,"Manager");
		Employee empObj3=new Employee("Ram",114,"Electric");
		//to store objects in the array list
		ArrayList<Employee> alObj=new ArrayList<Employee>();
		alObj.add(empObj1);
		alObj.add(empObj2);
		alObj.add(empObj3);
		//iterating through the array list
		Iterator<Employee> itObj=alObj.iterator();
		while (itObj.hasNext()) {
			Employee emVal=itObj.next();
			System.out.println("Array print Name: " +emVal.name);
		}
		
		//addAll() is used to merge 2 array list
		
	}

}
