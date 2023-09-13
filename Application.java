
public class Application {

	public static void main(String[] args) throws Exception {
		
		Queue a = new Queue();
		a.enqueue("Bill");
		a.enqueue("Alice");
		a.enqueue("Bob");
		System.out.println(a.printQueue());
		
		System.out.println(a.dequeue());
		System.out.println(a.printQueue());

		a.enqueue("Jane");
		a.enqueue("Hamad");
		System.out.println(a.printQueue());

		System.out.println(a.dequeue());
		System.out.println(a.dequeue());
		System.out.println(a.printQueue());

		a.enqueue("Jim");
		System.out.println(a.printQueue());

		System.out.println(a.dequeue());
		System.out.println(a.printQueue());

		System.out.println(a.dequeue());
		System.out.println(a.printQueue());
	

	}//end main method

}//end Application class
