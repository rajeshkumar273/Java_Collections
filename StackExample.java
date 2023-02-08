import java.util.*;

public class StackExample {

	public static void main(String args[] ) {
	
	/*
	
		*LIFO - Last in first out -  Stack
		*FIFO - First in first out - Queue
		
		*Stack is a class in java which inplements the list interface and extends the vector class and also represents the LIFO Principle.


	Special Methods available in stack

	1.push
	2.pop
	3.peek 
	4.search		
	

	Stack<String> books=new Stack<String>();

	books.add("Red");
	books.add("Black");
	books.add(0,"White");

	books.remove(2);
	books.set(1,"Yellow");
	//books.clear()
	System.out.println(books.get(1));
	
	System.out.println(books);
	
	System.out.println(books.contains("white"));
	System.out.println(books.contains("White"));

	

	
		Working with stack operations

			
	Special Methods available in stack

	1.push
	2.pop
	3.peek 
	4.search		

	*/
	
	Stack<String> books=new Stack<String>();

	books.push("Red");
	books.push("Black");
	books.push("White");
	books.push(null);
	books.push("White");
	books.push(null);
	books.push("Green");
		

	System.out.println(books);
	System.out.println(books.peek());
	System.out.println("Removed Element: "+books.pop());
	System.out.println(books);
	System.out.println("I found at:"+books.search("Black"));      //The search Operation starts from top
	System.out.println("The Index of:"+books.indexOf("Black"));  //The Index Operation starts from bottom
	System.out.println(books);
	System.out.println(books.isEmpty());
	System.out.println(books.empty());


	

}


}

