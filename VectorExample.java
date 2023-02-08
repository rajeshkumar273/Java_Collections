import java.util.*;

//Vector

/*
	Major Operations

	Creation of a list
	Addition of elements into the list
	Retrieval of elements from the list
	Deletion of elements from the list
	Verification of elements from the list

	Updation of elemets in the list.


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
		yes
		Synchronised It accepts only one thread at a time.
		Multi threading allow to access multiple threads at a time

	What is it good at?

		only data stroage and retrieval is the best ( ArrayList and Vector) 

		only data stroage and retrieval is the best
		*/







public class VectorExample {

	public static void main(String[] args) {

		/*
		1.Size - no of elements present in list
		2.Capacity - Array capacity - 10 
		3.Vector java 1.0
		4.Collections 1.2
		5.Generics 1.5 important concept for Interview.

		==> we can't create object for primitive data types   we can only objects for non-primitive data types 
			
		==>Every collection is combination of objects

		
		Vector<Integer> v1=new Vector<>();
		v1.add(12);
		v1.add(null);
		v1.add(null);
		v1.add(12);
		
		//duplicates allowed null values are also allowed


		Vector<Integer> v1=new Vector<Integer>(); Optional right hand side left side is mandatory. but angular brackets for right side is mandatory.
		
		*/
		
		Object[] arr1=new Object[] {1,5,8,9,2};
		
		Vector v0=new Vector(Arrays.asList(arr1));
		
		
		System.out.println("Array List:"+v0);	
		System.out.println("Array Size:"+v0.size());
		System.out.println("Array Capacity:"+v0.capacity()); 		

		// Vector v1=new Vector(200);  define size explicitly
		Vector v1=new Vector();
		v1.add("Rabbion");
		v1.add("Revi");
		v1.add("Ramesh");
		v1.add("Rakesh");
		v1.add(0,"Rajesh");
		v1.add("Sohail");
		v1.add("Manideep");
		v1.add("MRK");  // added duplicate to check lastindex of method()
		v1.add("Deva");
		v1.add("Kumar");
		v1.add("MRK");

		Vector v2=new Vector();
		 
		v2.add("Prakash");
		v2.add("Ganesh");
		
		Vector v3=new Vector();
		 
		v3.add("Gopi");
		v3.add("Sai");

		Vector v4=new Vector();
		 
		v4.add("Sai");
		v4.add("Gopi");

		//v1.addAll(v2); // End of the list
	
		v1.addAll(0,v2); //It will add starting of the list.
		v1.addAll(v3);
		System.out.println(v1);
		System.out.println(v1.get(2));  // to get particular element from vector use "Vector_object.get(index)"

		v1.remove(3);
		v1.remove("Rakesh");
		v1.removeAll(v2);
		// v1.clear();  //To clear the vector
		
		System.out.println("v1.contains('MRK'): "+v1.contains("MRK"));
		System.out.println("v1.contains('MRKN'): "+v1.contains("MRKN"));
		System.out.println("v1.contains(v3) :"+v1.containsAll(v3));
		System.out.println("v1.contains(v4) :"+v1.containsAll(v4));  //Order is not important

		System.out.println(v1.get(1));
		System.out.println("Before Updation:"+v1);
		v1.set(1,"Ravi"); // update element
		System.out.println("After Updation :"+v1);
		System.out.println("Get method:"+v1.get(1));
		System.out.println("Index of method:"+v1.indexOf("MRK"));
		System.out.println("Index of method:"+v1.lastIndexOf("MRK"));
		System.out.println("Is Empty:"+v1.isEmpty());
		System.out.println("First Element:"+v1.firstElement());
		System.out.println("Last Element:"+v1.lastElement());
		
		// object to array conversion
		
		Object[] arr=v1.toArray();
		System.out.println("Object to Array Conversion: "+Arrays.toString(arr));

	

		
		
		/*
		for(int i=0; i<v2.size(); i++) {  //this loop will add every element presented in v2 to the v1 or simply use "v1.addAll(v2)"

			v1.add(v2.get(i));
		}   

		
		v1.add("Rabbion");
		v1.add("Revi");
		v1.add("Ramesh");
		v1.add("Rakesh");
		v1.add(0,"Rajesh");
		v1.add("Sohail");
		v1.add("Manideep");
		v1.add("Deva");
		v1.add("Kumar");
		v1.add("MRK");

		v1.add("Rabbion");
		v1.add("Revi");
		v1.add("Ramesh");
		v1.add("Rakesh");
		v1.add(0,"Rajesh");
		v1.add("Sohail");
		v1.add("Manideep");
		v1.add("Deva");
		v1.add("Kumar");
		v1.add("MRK");

		*/

	//The capacity of vector will increase 100 % by default 10 
	System.out.println(v1.size());
	System.out.println(v1.capacity());
	
	System.out.println(v1);
	

}

}
