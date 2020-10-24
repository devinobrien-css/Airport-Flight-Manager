/**This class is a tester class for airport_flight_manager
 * @author Devin O'Brien
 * @version 1
 */
public class airport_test
{
	public static void main(String[] args)
	{
		System.out.println("\nAIRPORT FLIGHT MANAGER TESTS:"+
						   "\n-----------------------------");
		
		System.out.print("Test 1: \n" 
						+"-------\n"
						+"Flight Path: ");
			test_path("DSM","SAN");
			System.out.println("\n");

		System.out.print("Test 2: \n" 
						+"-------\n"
						+"Flight Path: ");
			test_path("LGA","SAN");
			System.out.println("\n");

		System.out.print("Test 3: \n"
						+"-------\n"
						+"Flight Path: ");
			test_path("SAN","LGA");
			System.out.println("\n");
	}

	/**Runs an individual test on the airport_flight_manager class
	 * @param src starting destination of flight
	 * @param dst ending destination of flight
	 */
	public static void test_path(String src, String dst)
	{
		airport_flight_manager assistant = new airport_flight_manager(src,dst);
		assistant.get_flight_path(src);
		assistant.print_path();
	}
}