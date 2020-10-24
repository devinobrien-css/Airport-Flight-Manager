/**Linked List specific for airport_flight_manager class
 * @author Devin O'Brien
 * @version 1
 */
public class LinkedList
{
	Node head;
	int size;

	/**Default Constructor 
     * makes an empty list
	 */
	public LinkedList()
	{
		head = null;
		size = 0;
	}

	/**Adds node to the end of the linked list
	 * @param node node to be added to end of list
	 */
	public void add(Node node)
	{
		if(this.is_empty())
		{
			head = node;
			size++;
		}
		else 
		{
			Node temp = get_tail();
			temp.set_next(node);
			size++;
		}
	}
	
	/**Checks if list has any nodes
	 * @return true if list is empty and head node is null
	 */
	public boolean is_empty()
	{
		return head == null;
	}

	/**Traverses list and retrieves tail node
	 * @return the tail node of this list
	 */
    public Node get_tail()
	{
		if(is_empty())
			return null;
		else
		{
			Node temp = head;
			while(temp.get_next() != null)
			{
				temp = temp.get_next();
			}
			return temp;
		}
	}

	/**Print list to console
	 */
	public void print()
	{
		if(is_empty())
			System.out.println("List is empty");
		else if(size == 1)
		{
			System.out.println("[" + head.get_pkg()[0] + "," + head.get_pkg()[1] + "]");
		}
		else
		{
			Node temp = head;
			while(temp.get_next() != null)
			{
				System.out.print("[" + temp.get_pkg()[0] + "," + temp.get_pkg()[1] + "]");
				temp = temp.get_next();
			}
			System.out.print("[" + temp.get_pkg()[0] + "," + temp.get_pkg()[1] + "]");
		}
	}

}