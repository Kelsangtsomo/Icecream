package like;
import hsa_new.Console;

/**
 * @author Tsomo
 * 
 */
public class ClassK {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int userInput;
		Console c = new Console();
		c.println("hi");
		c.println("Do you want to play *insert game name*");
		userInput = c.readInt();
		
		if (userInput == 1) {
			 c.println("Awesome! ... Maybe, The date is September 30th 2019, you're walking downtown with your friends when ");
		}
		
		if (userInput == 2) {
			 c.println("");
		}
	}

}