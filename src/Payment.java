/**
 * 
 */

/**
 * @author developer
 *
 */
public class Payment {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//create a person object
		Person per=new Person();
		per.setFirstName("subhasree");
		per.setLastName("monikantan");
		per.setHourlyRate(10);
		
		
		System.out.println(per.toString());
		System.out.println(per.getPayment(20));
	}

}
