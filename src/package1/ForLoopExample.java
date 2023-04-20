package package1;

import java.util.ArrayList;
import java.util.Iterator;

public class ForLoopExample {

public static void main(String[] args) {	
	int count=0;
	int count1=0;
	String arr[]= {"Dehli","Mumbai","kolhapur","bangaluru"};
	ArrayList<String> arrayList=new ArrayList<>();
	arrayList.add("Mango");    
    arrayList.add("Apple");    
    arrayList.add("Banana");    
    arrayList.add("Grapes");
	System.out.println("Name of cities");
	for (int i = 0; i < arr.length; i++) {
		
		System.out.println(arr[i]);
	}
	System.out.println("list of elements from arraylist");
	for (int i = 0; i < arrayList.size(); i++) {
		    System.out.println(arrayList.get(i));
	}
	System.out.println("Advanced For-Loop");
	for (String array:arrayList) {
		System.out.println(array);
	}
	System.out.println("using while loop");
	while (arrayList.size()>count) {
//		System.out.println(arrayList.size());
		System.out.println(arrayList.get(count));
		count++;
//		System.out.println(count);
	}
	System.out.println("using do-while Loop");
	
	do {
		
		System.out.println(arrayList.get(count1));
		count1++;
		
	} while (count1<arrayList.size());
	
	System.out.println("using Iterator");
	Iterator iterator=arrayList.iterator();
	
	while (iterator.hasNext()) {
	System.out.println(iterator.next());
		
	}
	for (int i = 0; i < 7; i++) {
		for (int j = 0; j < i; j++) {
			System.out.print(i);
		}
		System.out.println();
	}
	System.out.println();
	System.out.println("reverse array");
	
	for (int i = arr.length-1; i >=0; i--) {
		
		System.out.println(arr[i]+" ");
	}
	
}
}
