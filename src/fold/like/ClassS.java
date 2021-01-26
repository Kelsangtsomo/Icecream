package like;
import hsa_new.Console;

/**
 * @author not Tenzin Seldon
 *
 */
public class ClassS {

	//	public static Console c2 = new Console(48, 83);
	public static Console c = new Console(48, 85);

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

		// game name ideas
		// One unfortunate day 
		//Ceo Switch
		//Why Me 
		//One confusing day 
		//One fateful day 
		//Chosen one
		c.println("Welcome to _____ !!\nPlease enter your name:");
		userName = c.readLine();
		c.println ("Hello " + userName + " Press a key to start the game");
		c.getChar();
		c.clear();

		//game starts here
		//CEO name = Dominic Harris
		do {

			//Beginning part in the story
			c.println("You’re walking downtown with your friends when you suddenly pass by a newsstand and\n"
					+ "see the headline for one of the newspaper ‘CEO OF DEEPMIND HAS TRAGICALLY PASSED”\n"
					+ "You stop and read, your friends call you over and you run to catch up with them,\n"
					+ "forgetting everything you read.\n"
					+ "Do you cross the road to get ice cream or not? (1 = yes, 2 = no)");
			userInput = c.readInt();
			c.clear();
			//Decisions: whether to cross the road to get icecream or go home
			do {

				if (userInput == 1) {
					c.println("You hurriedly cross the road to get ice cream but just as you leave,\n"
							+ "you get hit by a car. Your life flashes before your eyes and before you\n"
							+ "realize it, you’re dead.");//(sound of sirens: tiloo, tiloo, tiloo)
					c.println("");
					//Thread.sleep(5000);
					break;

				} else if (userInput == 2) {
					c.println("You go home, and go to sleep.");
					c.println("");
					break;
				}

			} while (check(userInput) == true);



			//Part where user wakes up in the body of the CEO and first interacts with the system
			c.println("You wake up and realize you're not in your room.\n"
					+ "You reach over to the phone by the bedside and notice it is September 2, 2020.\n"
					+ "It's a week earlier, confused and groggy, you walk around the\n"
					+ "room and guide yourself to the washroom.\n"
					+ "The person you see in the reflection isn’t you.");
			c.println("");
			Thread.sleep(6000);
			c.println("Suddenly, you hear someone’s voice. No one’s around.\n"
					+ "\"Don’t bother looking around,I’m in your head\", the voice says. Startled, you ask,\n"
					+ "\"Who are you, who am I, where am I?\"\nThe voice responds,\n"
					+ "\"I am _____ and you are in the body of the CEO of DeepMind.\"\n"
					+ "\"Wait, the CEO that was all over the news?\"\n"
					+ "\"Yes, so you probably know that before he died, his team was working on\n"
					+ "a project called AlphaFold\"");
			c.println("");
			Thread.sleep(6000);
			c.println("\"I heard a bit about it. Why does that matter?\" \n"
					+ "\"You are in this body because you will be responsible for releasing\n"
					+ "AlphaFold to the world and preventing the murder of the CEO by finding out the mole.\n"
					+ "Before time runs out, you have to find out who was behind his murder\"\n"
					+ "\"Why me though?\"");
			c.println("");
			Thread.sleep(6000);
			c.println("You get a call from your secretary asking why you’re so late.\n"
					+ "He informs you that you are needed at the headquarters for a meeting.\n"
					+ "While you're getting ready, the system tries to fill you in.");

			c.println("\nPress a key to move on to the next page");
			c.getChar();
			c.clear();

			c.println("Would you like to learn about the company as a whole first? Or AlphaFold\n"
					+ "(1 = Company, 2 = AlphaFold)");
			userInput = c.readInt();

			//Decisions: Learn about deepmind or alphafold
			//Change it later to make sure that no matter what the user chooses, they end up learning about both!!
			do {

				if (userInput == 1) {
					c.println("DeepMind is a company that started in 2010,\n"
							+ "when there was less interest in the field of AI.\n"
							+ "DeepMind consists of a team of scientists, engineers,\n"
							+ "machine-learning experts and more, working together\n"
							+ "to advance the state of art in AI.\n"
							+ "They joined Google in 2014 to accelerate their work,\n"
							+ "while continuing to set their own research agenda.\n");
					Thread.sleep(6000);
					break;

				} else if (userInput == 2) {
					c.println("AlphaFold is an AI system developed by the company,\n"
							+ "DeepMind, to solve the “protein folding” problem.\n"
							+ "The protein folding problem is the challenge of figuring out\n"
							+ "how the proteins fold to form intricate three-dimensional\n"
							+ "structures based on its sequence of amino acids.\n"
							+ "It is an extremely hard challenge because the structures of the proteins are\n"
							+ "based on the interactions between the 20 amino acids.\n");
					Thread.sleep(6000);
					break;
				}
			} while (check(userInput) == true);

			Thread.sleep(3000);

			//User goes to company for the first time and attends meeting
			c.println("After making sure that you know enough information about DeepMind and AlphaFold,\n"
					+ "you make your way to work with the help of google maps.\n"
					+ "You reach the company and then, walk to the elevator.\n"
					+ "As soon as you get off the elevator, your secretary comes rushing to you.\n"
					+ "\"Thank god you made it, here is your schedule for today\"\n"
					+ "he hurriedly hands you an ipad containing your schedule and you see that AlphaFold\n"
					+ "board meeting is highlighted at the top of the page.\n");  

			Thread.sleep(6000);
			c.println("You then attend the AlphaFold board meeting.\n"
					+ "However, you don't understand a word of it.\n"
					+ "They seem to be talking about neural networks.\n"
					+ "Fortunately for you, the system comes to your rescue and\n"
					+ "tells you all about neural networks!");
			Thread.sleep(6000);
			//Info about neural networks
			c.println("");

			//
			c.println("\"Ohhh, so that's what it is.\" Not long after, the meeting comes to an end and\n"
					+ "you go back to your own office. While on the way to your office,\n"
					+ "the system starts speaking to you.\n");
			
			c.println("\nPress a key to move on to the next page");
			c.getChar();
			c.clear();

			c.println("\"So, what do you want to learn about now.\n"
					+ "The CASP challenge or the protein misfolding problem\"\n"
					+ "(Press 1 = CASP Challenge, Press 2 = Protein Misfolding Problem)");

			userInput = c.readInt();
			//Decisions: CASP or Misfolding
			do {

				if (userInput == 1) {
					c.println("The Critical Assessment of protein Structure Prediction (CASP)\n"
							+ "gives researchers an opportunity to compare their structure prediction methods\n"
							+ " in a head-to-head competition. It started in 1994, and has become the\n"
							+ "gold standard for assessing predictive techniques. CASP is used to catalyse research\n"
							+ " and measure progress on the newest methods for improving the accuracy of predictions."
							+ "The CASP organizers collect a hundred unpublished protein structures and\n"
							+ "challenge researchers to predict the structures based on their protein sequence.\n"
							+ "Ground truth would be the 100 set of proteins CASP picked compared to the predicted structures."
							+ "The 90 Global Distance Test (GDT) is a metric that CASP uses to score,\n"
							+ "it is a scale from 0 - 100, a GDT over 90 would be a solution to the problem.\n");
					break;

				} else if (userInput == 2) {
					c.println("Protein misfolding is a common occurrence throughout the lifetime of the cell.\n"
							+ "There are three main reasons for protein misfolding.\n"
							+ "First reason is that the person may have a certain mutation\n"
							+ "that alters an amino acid in the protein chain. Without that amino acid,\n"
							+ "it can be very difficult for the protein to fold properly.\n\n"
							+ "The second reason for misfolding could be simply because of an error.\n"
							+ "When proteins are created, there is a machine that forms the chains of amino acids,\n"
							+ "if the directions from the DNA to form these chains are read wrong,"
							+ "it can cause errors, leading to misfolding.\n\n"
							+ "The third reason is that misfolding is also because the\n"
							+ "proteins simply do not fold correctly 100% of the time.\n"
							+ "Conditions such as temperature and acidity can also impact the protein.\n"
							+ "Protein misfolding can affect the health of the cell. "
							+ "When proteins fail to fold to their proper shape, their functions can also be affected.\n"
							+ "The misfolded protein can also be twisted into shapes\n"
							+ "that are unfavourable to its cellular environment.\n"
							+ "Protein misfolding causes several diseases such as\n"
							+ "Alzheimer’s, Parkinson’s, Huntington’s disease, or diabetes.");

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

			c.println(" After Kimberly leaves, your secretary enters the office \"Sir your next meeting is with the AplhaFold team.\" You follow your secretary (a collegue ) out of your office through the building until you reach a glass door labelled AlphaFold Office your secretory drops you of here and goes back to his other duties. You walk inside and are immediately swarmed by the team members." + userName + " \"We figured out a way to successfully train the program!\"");
			c.println(" You listen curiously as he starts to explain the newly found method of training AlphaFold");
			c.println("\"AlphaFold is trained on ~170,000 structures of proteins that are publicly available. It uses the information it gathered from the database, including the amino acid sequences, to predict the structure of an unknown protein accurately.\"");

			do {
				//sharing incident oop
				if (userInput == 1) {
					c.println("With a smile on your face and a leap in your step, you skip to your secretory\" I come bearing good news! Our team has done it again! Our AlphaFold team has found a new succesful way to train the system\"");
					c.println("\"You notice an expression flicker over your secretorys face and continue\" Now with a large database, our system's knowledge of the protein structures has been broadened.\"");
					c.println("After sharing all the information you feel satisfied and go on to the lounge for a lunch break. In the lounge you hear other collegues talking about an upcoming launch party, as you munch on your lunch you continue to shamelessly ease drop on their converstation and write down the date and time down in your phone notes.");
					c.println("It's getting close to the end of the day and you are exhausted. \"I wonder if I'll ever go back to being myself, you ask the system if its possible\" \" yes I think it is possible but...\" Just before the system to could finish it's sentance, panicked, lucifer rushes towards you. \" I think someone is trying to hack into our data base\"");
					c.println("Just as you thought this couldn't get any worse you come across another problem");
					c.println("");
				}
				else if (userInput == 2) {
					c.println("Deciding to give the new intern a chance, you head over to the nervous man\" Hi, I'm \"" + userName + " Oh, hi sir, is there anything I can do for you?");
					c.println("\"Hmm nothing that comes to mind, but I just learnt some fascinating news, would you like to know?\" \"What is this fascinating news you talk about?\" You go on to explain how AlphaFold is trained just as the team did too you.");
					c.println("After sharing all the information you feel satisfied and go on to the lounge for a lunch break In the lounge you hear other collegues talking about an upcoming launch party, as you munch on your lunch you continue to shamelessly ease drop on their converstation and write down the date and time down in your phone notes.");
					c.println("");
					break;
				}

				c.println("You attend the launch party here you learn about the significance of AlphaFold from different colleagues");
				c.println("\"With AlphaFold, eradication of neurological diseases such as Alzheimer’s and Parkinsons might become possible, since these diseases are known to be caused by the misfolding of proteins in your brain. This causes the creation of clumps of protein that then disrupts brain activity. "
						+ "The structure of the protein determines the function and nearly all diseases, including cancer and dementia, are related to how proteins function. The recipes of the proteins (genes) are encoded in our DNA and an error found in the genetic recipe can result in a malformed protein. This could result in disease or death and do, many diseases are fundamentally linked to proteins. \r\n"
						+ "SinceAlphaFold can help predict how the protein is going to fold, we can gain a deeper understanding of diseases more quickly and can develop drugs to fight them.\"");
				c.println("\"Not only that but it enables scientists to target and design new, effective cures for diseases more efficiently. Some rare diseases involve mutations in a single gene, resulting in a malformed protein which can have profound effects on the health of an entire organism \"");
				c.println("covid info");
				c.println("\"We can't for get about the enviromental impacts! There will be advances in biodegradable enzymes - which can be enabled by protein design - could help manage pollutants like plastic and oil, helping us break down waste in ways that are more friendly to our environment!!\"");
				c.println("\"Yes and understanding different folds in a protein can help us determine how it will interact with different molecules, and then we can implement these findings into designing enzymes to break down pollutants and improving crop yields.\"");
				c.println("\"AlphaFold truly is a Breakthrough you think to yourself\"");

			} while (check(userInput) == true);

			c.println("Do you want to play again? (y/n)");
			finalAns = c.getChar();
		} while (finalAns == 'y');
	}
}

