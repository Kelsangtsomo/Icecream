package like;
import hsa_new.Console;

/**
 * @author Tenzin Seldon
 *
 */
public class ClassT {

	public static Console c = new Console(48, 200);



	public static boolean check (int userInput) {
		boolean check = false;

		while (!check) {

			if (userInput == 1 || userInput == 2) {
				return true;

			} else {
				c.println("Please enter either 1 or 2");
				userInput = c.readInt();
				break;
			}
		}
		return check;
	}

	public static void main(String[] args) {

		//variables
		char finalAns; //playing it again or not
		int userInput;

		c.println("Welcome to *insert game name*!!\nPlease enter your name:");
		String name = c.readLine();
		c.println ("Hello " + name + " Press a key to start the game");
		c.getChar();
		c.clear();

		//game starts here
		do {
			c.println("You’re walking downtown with your friends when you suddenly pass by a newsstand and "
					+ "see the headline for one of the newspaper ‘CEO OF DEEPMIND HAS TRAGICALLY PASSED”. "
					+ "You stop and read, your friends call you over and you run up to catch up with them "
					+ "forgetting everything you read. \nDo you cross the road to get ice cream or not? (1 = yes, 2 = no)");
			userInput = c.readInt();

			do {

				if (userInput == 1) {
					c.println("You hurriedly cross the road to get ice cream but just as you leave, you get hit by a car. Your life flashes before your eyes and before you realize it, you’re dead. (sound of sirens: tiloo, tiloo, tiloo). Continued from “you reach over…” ");
					break;

				} else if (userInput == 2) {
					c.println("You go home, and go to sleep.");
					break;
				}

			} while (check(userInput) == true);

			c.clear();
			c.println("You wake up and realize you're not in your room. You reach over to the phone by the bedside and notice it is September 2, 2020. It's a week earlier, confused and groggy, you walk around the "
					+ " room and guide yourself to the washroom. The person you see in the reflection isn’t you. Suddenly, you hear someone’s voice. No one’s around. “Don’t bother "
					+ "looking around, I’m in your head”, the voice says. Startled, you ask, “Who are you, who am I, where am I? The voice responds, “I am _____ and you are in the body of the CEO of DeepMind. "
					+ " “Wait, the CEO that was all over the news?” “Yes, so you probably know that before he died, his team was working on a project called AlphaFold”");

			c.println(" “I heard a bit about it. Why does that matter?” You are in this body because you will be responsible for releasing AlphaFold to the world and preventing the murder of"
					+ "the CEO by finding out the mole. Before time runs out, you have to find out who was behind his murder” "
					+ "“Why me though?” You get a call from your secretary asking why you’re so late. He informs you that you are needed at the headquarters for a meeting. While you're getting ready, the system tries to fill you in."

					+ "\nWould you like to learn about the company as a whole first? Or AlphaFold” (1 = company, 2 = AlphaFold)");

			do {

				if (userInput == 1) {
					c.println("DeepMind is a company that started in 2010, when there was less interest in the field of AI. DeepMind consists of a team of scientists, engineers, machine-learning experts and more, "
							+ " working together to advance the state of art in AI. They joined Google in 2014 to accelerate their work, while continuing to set their own research agenda.");
					break;

				} else if (userInput == 2) {
					c.println("AlphaFold is an AI system developed by the company, DeepMind, to solve the “protein folding” problem. The protein folding problem is the challenge of figuring out how the proteins fold to form intricate three-dimensional structures based on its sequence of amino acids. "
							+ "It is an extremely hard challenge because the structures of the proteins are based on the interactions between the 20 amino acids.");
					break;
				}
			} while (check(userInput) == true);

			c.println("and decide to go to your workplace (you google maps it? ) You make your way to the garage and get into your lamborghini and zoooooom off to work with the help of your phone. You walk up to the entrance and follow the others who seem to be walking to the elevator. "
					+ "The guards nod as you walk past them, you continue on your path until you see a man walking towards you. “Thank god you made it, here is your schedule for today” he hurriedly hands you an ipad containing your schedule and you see that AlphaFold board meeting is "
					+ "highlighted at the top of the page. {random people greeting him. “Good morning Sir!”}. You go to the meeting and while this is happening, you quickly ask the ____ association, “What the heck is going on? I don’t understand a word of this”. "
					+ "“ahh, we thought this might happen, apologies on our end for not filling you in quicker. Here is the run down of it all.");






			c.println("Do you want to play again? (yes/no)");
			finalAns = c.getChar();
		} while (finalAns == 'y');
	}
}

