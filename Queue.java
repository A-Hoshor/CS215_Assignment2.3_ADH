/**
 * 
 * @author Alyssa Hoshor
 * This class implements a queue that holds the String names of customers that are coming to the VegeBurger Palace.
 *
 */
public class Queue implements QueueInterface{

	LinkedList<String> list = new LinkedList<String>();
	Node<String> head = new Node<String>();
	Node<String> tail = new Node<String>();
	private int length;
	
	@Override
	/**Add new entry to back of queue. 
	 * @param newEntry
	 */
	public void enqueue(String newEntry) {
		Node<String> node = new Node<String>();
		node.setData(newEntry);
		if (isEmpty()==true ) {
			head = node;
		}//end if statement
		tail.setNextNode(node);
		tail = node;
		length ++;
	}//end enqueue method

	/**Removes and returns entry at front of queue.
	 * @throws Exception 
	 * @returnObject at front of queue
	 */
	@Override
	public String dequeue() throws Exception {
		if (isEmpty() == true) {
			throw new Exception("There is nothing in the queue to dequeue.");
		}//end if statement
		else {
			String result = head.getData();
			head = head.getNextNode();
			length--;
			return result + " has left the line.\n";
		}//end else statemetn
	}//end dequeue method

	/**Prints entire queue.
	 * @return queue.
	 */
	@Override
	public Object printQueue() {
		String result = "";
		Node current = head;
		while (current != null) {
			result = result + current.getData() + "\n";
			current = current.getNextNode();
		}//end while statement
		return result;
	}//end printQueue method

	/** Get the entry at front of queue.
	 * @return Object at front of queue.
	 * @throws Exception 
	 */
	@Override
	public Object getFront() throws Exception{
		if (isEmpty())
			throw new Exception("There is nothing in this queue.");
		
		return head.getData();
	}//end getFront Method

	/**Checks to see if queue is empty
	 * @return True if queue empty, false if not.
	 */
	@Override
	public boolean isEmpty() {
		if (length == 0)
			return true;
		else
			return false;
	}//end isEmpty method

}//end Queue class
