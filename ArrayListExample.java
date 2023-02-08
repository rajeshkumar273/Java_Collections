import java.util.*;

//ArrayList
important points to remember

	What is the default capacity?
	10

	what is the initial capacity?
	10

	Does it allow duplicate elements? 
	yes

	Does it allow null values?
	yes

	Does it maintain the insertion order?
	yes
	
	Does it maintain the sorted order?
	no
	
	Does it offer the random access of elements?
	yes
	 
	Is it synchronised?
		no
		No by default ArrayList is not synchronised but by using collections we can make it as synchronised.
		Vector is Synchronised.
		Synchronised It accepts only one thread at a time.
		Multi threading allow to access multiple threads at a time

	What is it good at?

		only data stroage and retrieval is the best ( ArrayList and Vector) 

		only data stroage and retrieval is the best




*/


public class ArrayListExample {

	public static void main(String args[]) {
	
	/*
	
	ArrayList<Integer> list=new ArrayList<>();
	list.add(5);
	list.add(0,8);
	
	list.add(5);
	list.add(0,8);

	list.add(5);
	list.add(0,8);

	list.add(5);
	list.add(0,8);

	list.add(5);
	list.add(0,8);

	list.add(5);
	list.add(0,8);
	list.add(null);
	list.add(null);

	System.out.println(list);
	System.out.println(list.size());
	// System.out.println(list.capacity()); No such method of capacity
	*/

		
	Integer[] arr =new Integer[] {1,5,8,9,2};
	ArrayList<Integer> list=new ArrayList<>(Arrays.asList(arr));
		
	list.add(5);
	System.out.println(list);
	System.out.println(list.size());
	System.out.println(list.get(2));
			
	System.out.println(list.remove(5));     //pass Index or object 
	//System.out.println(list.removeAll());
	//System.out.println(list.clear());
	System.out.println(list);

	System.out.println(list.contains(5));
	System.out.println("Index of: "+list.indexOf(5));		
	list.set(0,25);
	list.set(1,16);  // updation of elements
	System.out.println(list);
	//System.out.println("First Element:"+list.firstElement());
	//System.out.println("Last Element:"+list.lastElement());
	System.out.println("Index of: "+list.indexOf(5));
	list.add(5);
	System.out.println(list);
	System.out.println("Last Index of: "+list.indexOf(5));
	System.out.println("Last Index of: "+list.isEmpty());
	
	for (Integer integer : list) {

		System.out.print(integer+ " ");
	}


	/*problems of vector becomes ArrayList

	They created ArrayList that doesn't mean they will provide elemetns
	
	by default arrayList size is zero.
	
	There is no synchronnised concept in ArrayList.  
	
	Collections.synchronizedList(list); //by default out ArrayList acts as Vector.
	
	ArrayList increases only 50% capacity every time.
 
	*/
	

	}
}
