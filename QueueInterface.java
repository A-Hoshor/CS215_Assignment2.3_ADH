
public interface QueueInterface<T> {

	/**Add new entry to back of queue. 
	 * @param newEntry
	 */
	public void enqueue(String newEntry);
	
	/**Removes and returns entry at front of queue.
	 * @throws Exception 
	 * @returnObject at front of queue
	 */
	public T dequeue() throws Exception;
	
	/**Prints entire queue.
	 * @return queue.
	 */
	public T printQueue();
	
	/** Get the entry at front of queue.
	 * @return Object at front of queue.
	 * @throws Exception 
	 */
	public T getFront() throws Exception;
	
	/**Checks to see if queue is empty
	 * @return True if queue empty, false if not.
	 */
	public boolean isEmpty();
	
}//end interface
