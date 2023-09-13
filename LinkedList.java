
/**
 * @author njohnson3
 *
 */
public class LinkedList<T> {
	
	Node <T> head;
	int length;
	Node<T> tail;
	public LinkedList() {
		head=null;
		length=0;
		tail=head;
	}//end constructor

	public boolean isEmpty() {
		if (head==null) { return true;}
		else return false;
	}//end isEmpty
	
	public Node <T> getList() {
		return head;
	}//end getList
	
	public void addNode(Node <T> aNode) {
		if (isEmpty() ) {
			head = aNode;
			tail=head;
			return;
		}//end if statement
		tail.nextNode=aNode;
		tail=tail.nextNode;
		tail.nextNode=null;
		length++;
		
	}//end add Node

}//end LinkedList class