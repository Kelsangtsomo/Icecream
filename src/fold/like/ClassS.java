package like;
import hsa_new.Console;

/**
 * @author not Tenzin Seldon
 *
 */
public class ClassS {

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

	public static void main(String[] args) throws InterruptedException{

		//variables
		char finalAns; //playing it again or not
		int userInput;
		String userName;

		c.println("Welcome to *insert game name*!!\nPlease enter your name:");
		userName = c.readLine();
		c.println ("Hello " + userName + " Press a key to start the game");
		c.getChar();
		c.clear();

		//game starts here
		//CEO name = Dominic Harris
		do {

			//Beginning part in the story
			c.println("You’re walking downtown with your friends when you suddenly pass by a newsstand and "
					+ "see the headline for one of the newspaper ‘CEO OF DEEPMIND HAS TRAGICALLY PASSED”. "
					+ "You stop and read, your friends\ncall you over and you run up to catch up with them, "
					+ "forgetting everything you read. \n\nDo you cross the road to get ice cream or not? (1 = yes, 2 = no)");
			userInput = c.readInt();

			//Decisions: whether to cross the road to get icecream or go home
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

			//Part where user wakes up in the body of the CEO and first interacts with the system
			c.println("You wake up and realize you're not in your room. You reach over to the phone by the bedside and notice it is September 2, 2020. It's a week earlier, confused and groggy, you walk around the "
					+ " room and guide yourself to the washroom. The person you see in the reflection isn’t you. Suddenly, you hear someone’s voice. No one’s around.\n\n“Don’t bother "
					+ "looking around, I’m in your head”, the voice says. \nStartled, you ask, “Who are you, who am I, where am I?\nThe voice responds, “I am _____ and you are in the body of the CEO of DeepMind. "
					+ " \n“Wait, the CEO that was all over the news?” \n“Yes, so you probably know that before he died, his team was working on a project called AlphaFold”");

			c.println("“I heard a bit about it. Why does that matter?” \nYou are in this body because you will be responsible for releasing AlphaFold to the world and preventing the murder of"
					+ "the CEO by finding out the mole. Before time runs out, you have to find out who \nwas behind his murder”"
					+ "\n“Why me though?” \n\nYou get a call from your secretary asking why you’re so late. He informs you that you are needed at the headquarters for a meeting. While you're getting ready, the system tries to \nfill you in.");

			c.println("\nPress a key to move on to the next page");
			c.getChar();
			c.clear();

			c.println("Would you like to learn about the company as a whole first? Or AlphaFold” (1 = Company, 2 = AlphaFold)");
			userInput = c.readInt();

			//Decisions: Learn about deepmind or alphafold
			//Change it later to make sure that no matter what the user chooses, they end up learning about both!!
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

			Thread.sleep(3000);

			//User goes to company for the first time and attends meeting
			c.println("\nAfter making sure that you know enough information about DeepMind and AlphaFold, you make your way to work with the help of google map. You reach the company and then, walk to the elevator. As soon as you get off the elevator, your secretary comes rushing to you. \n“Thank god you made it, here is your schedule for today” he hurriedly hands you an ipad containing your schedule and you see that AlphaFold board meeting is highlighted at the top of the page.");  
			c.println("You then attend the AlphaFold board meeting. However, you don't understand a word of it. They seem to be talking about neural networks. Fortunately for you, the system comes to your rescue and tells you all about neural networks!");

			//Info about neural networks
			c.println("");

			//
			c.println("Ohhh, so that's what it is. Not long after, the meeting comes to an end and you go back to your own office. While on your way, you come across an excited colleague.");
			c.println("On the way to your office, the system starts speaking to you.\n\"So, what do you want to learn about now. The CASP challenge or the protein misfolding problem\" (Press 1 = CASP Challenge, Press 2 = Protein Misfolding Problem)");

			userInput = c.readInt();
			//Decisions: CASP or Misfolding
			do {

				if (userInput == 1) {
					c.println("The Critical Assessment of protein Structure Prediction (CASP) gives researchers an opportunity to compare their structure prediction methods in a head-to-head competition. It started in 1994, and has become the "
							+ "gold standard for assessing predictive techniques. CASP is used to catalyse research and measure progress on the newest methods for improving the accuracy of predictions. The CASP organizers collect "
							+ "a hundred unpublished protein structures and challenge researchers to predict the structures based on their protein sequence. Ground truth would be the 100 set of proteins CASP picked compared to the predicted structures."
							+ "The 90 Global Distance Test (GDT) is a metric that CASP uses to score, it is a scale from 0 - 100, a GDT over 90 would be a solution to the problem. ");
					break;

				} else if (userInput == 2) {
					c.println("Protein misfolding is a common occurrence throughout the lifetime of the cell. There are three main reasons for protein misfolding. 1s reason is that the person may have a certain mutation "
							+ "that alters an amino acid in the protein chain. Without that amino acid, it can be very difficult for the protein to fold properly. The second reason for misfolding could be simply because of an error. "
							+ "When proteins are created, there is a machine that forms the chains of amino acids, if the directions from the DNA to form these chains are read wrong, it can cause errors, leading to misfolding. "
							+ "The third reason is that misfolding is also because the proteins simply do not fold correctly 100% of the time. Conditions such as temperature and acidity can also impact the protein. "
							+ "Protein misfolding can affect the health of the cell. When proteins fail to fold to their proper shape, their functions can also be affected. The misfolded protein can also be twisted into shapes "
							+ "that are unfavourable to its cellular environment. Protein misfolding causes several diseases such as Alzheimer’s, Parkinson’s, Huntington’s disease, or diabetes.");

					//info about CASP that user learns through employee even though they did not ask for it
					c.println("\"'morning Mr. Harris. I heard about the AlphaFold project and how we might actually win the CASP challenge. We're all really excited and wish the best for our team\" \"Umm yeah, thank you. If you don't mind, could you please tell me a bit more about the CASP challenge because my mind's still a bit fuzzy from the accident.\" "
							+ "\n\"Of course Sir. The Critical Assessment of protein Structure Prediction (CASP) gives researchers an opportunity to compare their structure prediction methods in a head-to-head competition. It started in 1994, and has become the \"\n" 
							+ "gold standard for assessing predictive techniques. CASP is used to catalyse research and measure progress on the newest methods for improving the accuracy of predictions. The CASP organizers collect \"\n"
							+ "a hundred unpublished protein structures and challenge researchers to predict the structures based on their protein sequence. Ground truth would be the 100 set of proteins CASP picked compared to the predicted structures. " 
							+ "The 90 Global Distance Test (GDT) is a metric that CASP uses to score, it is a scale from 0 - 100, a GDT over 90 would be a solution to the problem.");
					c.println("\"Sorry if I droned on about it. I got a bit carried away\", says the colleague shyly. \n\"Don't worry, thank you for that information\", you respond.\n\"Anytime sir!\", says the collegue.");

					break;
				}
			} while (check(userInput) == true);

			//User's in the office where the interview takes place
			c.println("You reach your office. As soon as you sit down in your chair to relax a bit, your secretary comes in and says, \"You have a meeting today sceduled at 2pm with the newspaper journalist\"");
			c.println("It's 1:55pm and someone knocks on the door. It seems that the interviewever has arrived 5 minutes early. You let her inside. You go to shake her hand, \"Hey, my name is kImBeRlaY\" \"Please have a seat\"");
			c.println("Kimberly asks \"Why is DeepMind working on this problem? Why is the protien folding problem so important?\"");
			c.println("After hearing the question you start to sweat, you have to somehow escape, what do you do?");
			c.println("Do you spill coffee on yourself and excuse yourself to the washroom where you can ask the system about it or call over the alphafold team to explain the problem since they have first-hand experience? (1 = spill coffee, 2 = ask teammates)");

			do {
				//interview incident 
				if (userInput == 1) {

					c.println("\"ouch.\" \"Are you okay?\" Kimberly asks as she stands up to get napkins\" \"No no its alright I'll just quickly go to the washroom. I'll be back in 10 minutes.\"");
					c.println("You quickly make your way to the washroom, and check that there is no one around. You ask the system \"Can you help me respond to her?\"");
					c.println("\"Don't worry I can help you.\" The system starts to explain, as you wipe off your stain.");
					
					c.println("\"The Protein Folding Problem is the challenge of figuring out how the proteins fold to form intricate structures based on its sequence of amino acids."
							+ " The structure is important because it determines the function of the protein. For example, if the structure of the protein is globular, it is likely used for transporting other small molecules throughout your body."
							+ " It is such a hard problem to solve because there are so many types of proteins that humans have discovered. Right now, we know of over 200 million proteins and more, and all of the proteins have their own unique shapes."
							+ " The way that proteins fold is dependent on the interaction between the 20 different amino acids that make up the protein. Therefore, the possibilities are virtually limitless, which makes this problem extremely hard to solve. According to the acclaimed Levinthal's paradox, "
							+ "it would take longer than the age of the universe to go through every combination of a typical protein’s structure\", the system explains.");
					c.println(" With this new knowledge, you are ready to tackle Kimberly's question. You head back to your office and reiterate the systems response to Kimberly.");
					c.println("After you finish speaking, you notice Kim stop the recorder. \\\"Thanks for taking the time to answer a couple of questions it was very informative, I can't wait to see what DeepMind has in store for us.\" Satisfied, Kimberly leaves ");
					break;

				} else if (userInput == 2) {
					c.println("How about I call over the AlphaFold team since they have first hand experience");
					c.println("\"That would be great!\" Kim responds. You gesture to your secretary and ask him to call over the AlphaFold Team.");
					c.println("A few moments later the AlphaFold team arrives. After a round of introductions the team leader Lucifer begins explaining the significance of AlphaFold");
					c.println("The Protein Folding Problem is the challenge of figuring out how the proteins fold to form intricate structures based on its sequence of amino acids."
							+ " The structure is important because it determines the function of the protein. For example, if the structure of the protein is globular, it is likely used for transporting other small molecules throughout your body."
							+ " It is such a hard problem to solve because there are so many types of proteins that humans have discovered. Right now, we know of over 200 million proteins and more, and all of the proteins have their own unique shapes."
							+ " The way that proteins fold is dependent on the interaction between the 20 different amino acids that make up the protein. Therefore, the possibilities are virtually limitless, which makes this problem extremely hard to solve. According to the acclaimed Levinthal's paradox, "
							+ "it would take longer than the age of the universe to go through every combination of a typical protein’s structure.");
					c.println("After hearing the explanation Kimberly takes notes. \"Thanks for taking the time to answer a couple of questions it was very informative, I can't wait to see what DeepMind has in store for us.\" Satisfied, Kimberly leaves");
					
					break;
				}
				
				
			} while (check(userInput) == true);

			c.println(" After Kimberly leaves, your secretary enters the office \"Sir your next meeting is with the AplhaFold team.\" You follow your secretary out of your office through the building until you reach a glass door labelled AlphaFold Office. You walk inside and are immediately swarmed by the team members." + userName + " \"We figured out a way to successfully train the program!\"");
			c.println(" You listen curiously as he starts to explain the newly found method of training AlphaFold");
			c.println("\"AlphaFold is trained on ~170,000 structures of proteins that are publicly available. It uses the information it gathered from the database, including the amino acid sequences, to predict the structure of an unknown protein accurately.\"");
			
			do {
				//sharing incident oop
				if (userInput == 1) {
					c.println("With a joy in your face and a leap in your step, you skip to your secretory\" I come bearing good news! Our team has done it again! go miss gorl, Our AlphaFold team has found a new succesful way to train the system\"");
					c.println("When you look at your secretory ");
			}
			 else if (userInput == 2) {
				break;
			}
			
			
		} while (check(userInput) == true);
			
			c.println("Do you want to play again? (y/n)");
			finalAns = c.getChar();
		} while (finalAns == 'y');
	}
}

