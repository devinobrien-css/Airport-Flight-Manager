/**Basic uni-directional node for LinkedList for airport_flight_manager
 * @author Devin O'Brien
 * @version 1
 */
public class Node
{
	String[] pkg;
	Node next;

	/**Instantiates an empty node
	 */
	public Node()
	{
		pkg = new String[2];
		next = null;
	}

	/**Instantiates a node with data, but no forward reference
	 * @param src starting location for flight tuple
	 * @param dst ending destination for flight tuple
	 */
	public Node(String src, String dst)
	{
		pkg = new String[2];
			pkg[0] = src;
			pkg[1] = dst;
		next = null;
	}

	/**Instantiates a node with the data of a node specified
	 * @param node data to be added to this node
	 */
	public Node(Node node)
	{
		pkg = node.get_pkg();
		next = node.get_next();
	}

	/**Instantiates a node with data and a forward reference
	 * @param pkg flight tuple
	 * @param node next reference for node being instantiated
	 */
	public Node(String [] pkg, Node node)
	{
		this.pkg = pkg;
		this.next = node;
	}

	/**Fetches this node's data
	 * @return this nodes flight tuple (pkg)
	 */
	public String [] get_pkg()
	{
		return pkg;
	}

	/**Retrieves this nodes forward reference
	 * @return the next node referenced in the linked list
	 */
	public Node get_next()
	{
		return next;
	}

	/**Sets this nodes next reference
	 * @param node to be set as this node's forward reference
	 */
	public void set_next(Node node)
	{
		this.next = node;
	}
}