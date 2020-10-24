/** This class works with a constant string of string tuples to create flight path combinations.
 *    Example:
 *       ->"Person intends to fly from LGA to SAN"
 *       ->flight_path = ["LGA","LHR"]["LHR","SFO"]["SFO","SAN"]
 * @author Devin O'Brien
 * @version 1
 */
public class airport_flight_manager
{
	//airport_tuple is a String of tuples, each tuple containing a random start and end destination as a 3 character flight code  
	static final String[][] airport_tuple = {{"DSM","ORD"},{"ORD","BGI"},{"BGI","LGA"},{"SIN","CDG"},{"CDG","SIN"},{"CDG","BUD"},{"DEL","DOH"},{"DEL","CDG"},{"TLV","DEL"},{"EWR","HND"},{"HND","ICN"},{"HND","JFK"},{"ICN","JFK"},{"JFK","LGA"},{"LGA","LHR"},{"LHR","SFO"},{"SFO","SAN"},{"SFO","DSM"},{"SAN","LGA"}};
	String starting_destination;
	static String final_destination;
	static LinkedList flight_path;

	/**Specific constructor - specifies flights starting and ending location
	 * @param src starting location of flight
	 * @param dst ending location of flight
	 */
	public airport_flight_manager(String src, String dst)
	{
		starting_destination = src;
		final_destination = dst;
		flight_path = new LinkedList();
	}

	/**Recursive algorithm that searches through flight tuples and assembles a flight path
	 * @param current_destination starting location of the current tuple
	 */
	public static void get_flight_path(String current_destination)
	{
		String[] current_tuple = get_match(current_destination);

		if(current_tuple[1].equals(final_destination))
			flight_path.add(new Node(current_tuple[0],current_tuple[1]));
		else
		{
			flight_path.add(new Node(current_tuple[0],current_tuple[1]));
			get_flight_path(current_tuple[1]);
		}
	}

	/**Matches a departing destination to its arrival destination
	 * according to tuple in airport_tuple
	 * @param src starting location of tuple being searched for
	 * @return a flight tuple whose starting location matches src
	 */
	public static String[] get_match(String src)
	{
		for(int i = 0; i < airport_tuple.length; i++)
		{
			if(airport_tuple[i][0].equals(src))
				return airport_tuple[i];
		}
		return null;
	}

	/**Prints flight path to console
	 */
	public void print_path()
	{
		flight_path.print();
	}
}