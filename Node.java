class Node<T>{
	
	private T data;
	Node<T> nextNode;
	
	public Node()
	{
		nextNode=null;
		data=null;
	}//end constructor
	public void setData(T data) {
		this.data=data;
	}//end setData
	
	public T getData() {
		return this.data;
	}//end getData
	
	public Node<T> getNode() {
		return this;
	}//end getNode
	
	public void setNextNode(Node<T> nextNode) {
		this.nextNode=nextNode;
	}//end setNextNode
	
	public Node<T> getNextNode() {
		return nextNode;
	}//end getNextNode
	
}//end Node class