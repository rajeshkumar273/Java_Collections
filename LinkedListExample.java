import java.util.*;

/*
Important points to remember

	What is the default capacity?
	0

	what is the initial capacity?
	0

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
		Synchronised It accepts only one thread at a time.
		Multi threading allow to access multiple threads at a time
		
		by using explicityly we can make it LinkedList as synchronized.		

		Collections.synchronizedList(list);

	
	What is it good at?

		only data stroage and retrieval is the best ( ArrayList and Vector) 

		only data stroage and retrieval is the best
			If you want manipulate data in the middle LinkedList is good.




*/



class LinkedListExample {

	public static void main(String args[]) {

	ArrayList<String> list1=new ArrayList<String>();
	list1.add("S1");
	list1.add("S2");

	System.out.println(list1);


	LinkedList<String> list=new LinkedList<>();

	//List<Integer> list=new LinkedList<>();
	//Queue<Integer> list=new LinkedList<>();
	//Deque<Integer> list=new LinkedList<>();

	list.add("y1");
	list.add("y2");
	list.add("y3");
	list.add("y4");
	list.add(1,"YY");
	list.addAll(list1);
	list.remove(1);  //head -First Element  tail --> last element basically comes from queue.
	//list.clear();

	list.set(0,"Rajesh");
	System.out.println(list);
	System.out.println(list.get(4));
	System.out.println(list.contains("YY"));
	System.out.println(list.contains("y1"));
	System.out.println(list.contains("y2"));

	//Collections.synchronzedList(list);
	
	for(String s:list) {

		System.out.print(s+ " ");

	}


	

	}

}

