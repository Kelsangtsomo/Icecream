package like;
import hsa_new.Console;

/**
 * @author not Tenzin Seldon
 *
 */
public class ClassS2 {

	//	public static Console c2 = new Console(48, 83);
	public static Console c = new Console(48, 85);

	public static boolean check (int userInput) {
		boolean check = false;

		while (!check) {

			if (userInput == 1 || userInput == 2) {
				return true;

			} else {
				c.println("Please enter either 1 or 2");
				userInput = c.getChar();
				break;
			}
		}
		return check;
	}

	public static void main(String[] args) throws InterruptedException{
//maybe in a bright font colour we can put important info and let the user know 
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
			c.println("You�re walking downtown with your friends when you suddenly pass by a newsstand and\n"
					+ "see the headline for one of the newspaper �CEO OF DEEPMIND HAS TRAGICALLY PASSED�\n"
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
							+ "realize it, you�re dead.");//(sound of sirens: tiloo, tiloo, tiloo)
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
					+ "The person you see in the reflection isn�t you.");
			c.println("");
			//Thread.sleep(6000);
			c.println("Suddenly, you hear someone�s voice. No one�s around.\n"
					+ "\"Don�t bother looking around,I�m in your head\", the voice says. Startled, you ask,\n"
					+ "\"Who are you, who am I, where am I?\"\nThe voice responds,\n"
					+ "\"I am The System for Switched Souls, but you can call me The System for short,\n"
					+ " and you are in the body of the CEO of DeepMind.\"\n"
					+ "\"Wait, the CEO that was all over the news?\"\n"
					+ "\"Yes, so you probably know that before he died, his team was working on\n"
					+ "a project called AlphaFold\"");
			c.println("");
			//Thread.sleep(6000);
			c.println("\"I heard a bit about it. Why does that matter?\" \n"
					+ "\"You are in this body because you will be responsible for releasing\n"
					+ "AlphaFold to the world and preventing the murder of the CEO by finding out the mole.\n"
					+ "Before time runs out, you have to find out who was behind his murder\"\n"
					+ "\"Why me though?\"");
			c.println("");
			//Thread.sleep(6000);
			c.println("You get a call from your secretary asking why you�re so late.\n"
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
					c.println("\nYou say, �Ohhh, so that�s what DeepMind is.\n"
							+ "I kinda get it now. Didn�t you say something about AlphaFold too?\n"
							+ "What is that?� Then, system starts explaining\n");
					c.println("\nAlphaFold is an AI system developed by the company,\n"
							+ "DeepMind, to solve the �protein folding� problem.\n"
							+ "The protein folding problem is the challenge of figuring out\n"
							+ "how the proteins fold to form intricate three-dimensional\n"
							+ "structures based on its sequence of amino acids.\n"
							+ "It is an extremely hard challenge because the structures of the proteins are\n"
							+ "based on the interactions between the 20 amino acids.\n");
					//Thread.sleep(6000);
					break;

				} else if (userInput == 2) {
					c.println("AlphaFold is an AI system developed by the company,\n"
							+ "DeepMind, to solve the �protein folding� problem.\n"
							+ "The protein folding problem is the challenge of figuring out\n"
							+ "how the proteins fold to form intricate three-dimensional\n"
							+ "structures based on its sequence of amino acids.\n"
							+ "It is an extremely hard challenge because the structures of the proteins are\n"
							+ "based on the interactions between the 20 amino acids.\n");
					c.println("\"I think I�m beginning to understand what AlphaFold is\n"
							+ "but I still have so many questions,\" you say. System interrupts you and says,\n"
							+ "\"I can answer all your questions later\n"
							+ "but first you need to know more about the company\".\n"
							+ "Before you can respond, system starts going on about the company, DeepMind.\n");
					c.println("DeepMind is a company that started in 2010,\n"
							+ "when there was less interest in the field of AI.\n"
							+ "DeepMind consists of a team of scientists, engineers,\n"
							+ "machine-learning experts and more, working together\n"
							+ "to advance the state of art in AI.\n"
							+ "They joined Google in 2014 to accelerate their work,\n"
							+ "while continuing to set their own research agenda.\n");
					//Thread.sleep(6000);
					break;
				}
			} while (check(userInput) == true);
			
		

			//Thread.sleep(3000);
			c.println("\nPress a key to move on to the next page");
			c.getChar();
			c.clear();
			
			//User goes to company for the first time and attends meeting
			c.println("After making sure that you know enough information about DeepMind and AlphaFold,\n"
					+ "you make your way to work with the help of google maps.\n"
					+ "You reach the company and then, walk to the elevator.\n"
					+ "As soon as you get off the elevator, your secretary comes rushing to you.\n"
					+ "\"Thank god you made it, here is your schedule for today\"\n"
					+ "he hurriedly hands you an ipad containing your schedule and you see that AlphaFold\n"
					+ "board meeting is highlighted at the top of the page.\n");  
			
			//Thread.sleep(6000);
			c.println("You then attend the AlphaFold board meeting.\n"
					+ "However, you don't understand a word of it.\n"
					+ "They seem to be talking about neural networks.\n"
					+ "Fortunately for you, the system comes to your rescue and\n"
					+ "tells you all about neural networks!\n");
			//Thread.sleep(6000);
			c.println("The first step of this process involves a deep convolutional neural network,\n"
					+ "the goal of this step is to change the protein sequence into two matrices.\n"
					+ "This neural network interprets the structure of the graph,\n"
					+ "(a folded protein, which can be thought of as a \"spatial graph\".\n"
					+ "AlphaFold uses related sequences, MSA (multiple sequence alignment)\n"
					+ "feature engineering (the process of changing raw data into meaningful data),\n\n"
					+ "The second part of this process is optimization,\n"
					+ "is the step which transforms the two matrices into 3D shapes.\n"
					+ "The structure is created through the iterative gradient descent method.\n"
					+ "To achieve this, the algorithm starts with a smooth 3D structure and updates the\n"
					+ "structures until it becomes as close to the output from the deep learning process.\n");
			//Info about neural networks
			c.println("\nPress a key to move on to the next page");
			c.getChar();
			c.clear();
			c.println("\"Ohhh, so that's what it is.\" Not long after, the meeting comes to an end and\n"
					+ "you go back to your own office. While on the way to your office,\n"
					+ "the system starts speaking to you.\n");

			c.println("\"So, what do you want to learn about now.\n"
					+ "The CASP challenge or the protein misfolding problem\"\n"
					+ "(Press 1 = CASP Challenge, Press 2 = Protein Misfolding Problem)");

			userInput = c.readInt();
			//Decisions: CASP or Misfolding
			do {

				if (userInput == 1) {
					c.println("The Critical Assessment of protein Structure Prediction (CASP)\n"
							+ "gives researchers an opportunity to compare their structure prediction methods\n"
							+ "in a head-to-head competition. It started in 1994, and has become the\n"
							+ "gold standard for assessing predictive techniques. CASP is used to catalyse research"
							+ "\nand measure progress on the newest methods for improving the accuracy of predictions.\n\n"
							+ "The CASP organizers collect a hundred unpublished protein structures and\n"
							+ "challenge researchers to predict the structures based on their protein sequence.\n"
							+ "Ground truth would be the 100 set of proteins CASP picked compared to the predicted\n"
							+ "structures. The 90 Global Distance Test (GDT) is a metric that CASP uses to score,\n"
							+ "it is a scale from 0 - 100, a GDT over 90 would be a solution to the problem.\n");
					c.println("\nPress a key to move on to the next page");
					c.getChar();
					c.clear();
					c.println("�That was a lot of information to take in.\n"
							+ "Can you give me a few minutes to digest that?� you say.\n"
							+ "Ignoring your request, system goes on about Protein Misfolding.\n");
					c.println("Protein misfolding is a common occurrence throughout the lifetime of the cell.\n"
							+ "There are three main reasons for protein misfolding.\n"
							+ "First reason is that the person may have a certain mutation\n"
							+ "that alters an amino acid in the protein chain. Without that amino acid,\n"
							+ "it can be very difficult for the protein to fold properly.\n\n"
							+ "The second reason for misfolding could be simply because of an error.\n"
							+ "When proteins are created, there is a machine that forms the chains of amino acids,\n"
							+ "if the directions from the DNA to form these chains are read wrong,\n"
							+ "it can cause errors, leading to misfolding.\n\n"
							+ "The third reason is that misfolding is also because the\n"
							+ "proteins simply do not fold correctly 100% of the time.\n"
							+ "Conditions such as temperature and acidity can also impact the protein.\n"
							+ "Protein misfolding can affect the health of the cell.\n"
							+ "When proteins fail to fold to their proper shape,\n"
							+ "their functions can also be affected.\n"
							+ "\nThe misfolded protein can also be twisted into shapes\n"
							+ "that are unfavourable to its cellular environment.\n"
							+ "Protein misfolding causes several diseases such as\n"
							+ "Alzheimer�s, Parkinson�s, Huntington�s disease, or diabetes.");
					c.println("\nPress a key to move on to the next page");
					c.getChar();
					c.clear();
					break;

				} else if (userInput == 2) {
					c.println("Protein misfolding is a common occurrence throughout the lifetime of the cell.\n"
							+ "There are three main reasons for protein misfolding.\n"
							+ "First reason is that the person may have a certain mutation\n"
							+ "that alters an amino acid in the protein chain. Without that amino acid,\n"
							+ "it can be very difficult for the protein to fold properly.\n\n"
							+ "The second reason for misfolding could be simply because of an error.\n"
							+ "When proteins are created, there is a machine that forms the chains of amino acids,\n"
							+ "if the directions from the DNA to form these chains are read wrong,\n"
							+ "it can cause errors, leading to misfolding.\n\n"
							+ "The third reason is that misfolding is also because the\n"
							+ "proteins simply do not fold correctly 100% of the time.\n"
							+ "Conditions such as temperature and acidity can also impact the protein.\n"
							+ "Protein misfolding can affect the health of the cell.\n"
							+ "When proteins fail to fold to their proper shape,\n"
							+ "their functions can also be affected.\n"
							+ "\nThe misfolded protein can also be twisted into shapes\n"
							+ "that are unfavourable to its cellular environment.\n"
							+ "Protein misfolding causes several diseases such as\n"
							+ "Alzheimer�s, Parkinson�s, Huntington�s disease, or diabetes.");
					c.println("\nPress a key to move on to the next page");
					c.getChar();
					c.clear();
					
					//info about CASP that user learns through employee even though they did not ask for it
					c.println("\"Morning Mr. Harris. I heard about the AlphaFold project and\n"
							+ "how we might actually win the CASP challenge. We're all really excited\n"
							+ "and wish the best for our team\" \"Umm yeah, thank you.\n"
							+ "If you don't mind, could you please tell me a bit more about the CASP challenge\n"
							+ "because my mind's still a bit fuzzy from the accident.\""
							+ "\n\n\"Of course Sir. The Critical Assessment of protein Structure Prediction (CASP)\n"
							+ "gives researchers an opportunity to compare their structure prediction\n"
							+ "methods in a head-to-head competition. It started in 1994, and has become the \"\n" 
							+ "gold standard for assessing predictive techniques. CASP is used to catalyse research\n"
							+ "and measure progress on the newest methods for improving the accuracy of predictions."
							+ "\n\nThe CASP organizers collect a hundred unpublished protein structures\n"
							+ "and challenge researchers to predict the structures based on their protein sequence.\n"
							+ "Ground truth would be the 100 set of proteins\n"
							+ "CASP picked compared to the predicted structures.\n" 
							+ "The 90 Global Distance Test (GDT) is a metric that CASP uses to score,\n"
							+ "it is a scale from 0 - 100, a GDT over 90 would be a solution to the problem.\n\n");
					c.println("\"Sorry if I droned on about it. I got a bit carried away\", says the colleague shyly."
							+ "\n\"Don't worry, thank you for that information\","
							+ "you respond.\n\"Anytime sir!\", says the collegue.");

					c.println("\nPress a key to move on to the next page");
					c.getChar();
					c.clear();
					break;
				}
			
			} while (check(userInput) == true);

			//User's in the office where the interview takes place
			c.println("You reach your office. As soon as you sit down in your chair to relax a bit,\n"
					+ "your secretary comes in and says, \"You have a meeting today\n"
					+ "sceduled at 2pm with the newspaper journalist\"\n");
			c.println("It's 1:55pm and someone knocks on the door. It seems that the interviewever\n"
					+ "has arrived 5 minutes early. You let her inside. You go to shake her hand,\n"
					+ "\"Hey, my name is Kimberly\" \"Please have a seat\"");
			c.println("Kimberly asks \"Why is DeepMind working on this problem?\n"
					+ "Why is the protien folding problem so important?\"\n");
			c.println("After hearing the question you start to sweat,\n"
					+ "you have to somehow escape, what do you do?");
			c.println("\nPress a key to move on to the next page");
			c.getChar();
			c.clear();
			c.println("Do you spill coffee on yourself and excuse yourself to the washroom where you\n"
					+ "can ask the system about it or call over the alphafold team to explain\n"
					+ "the problem since they have first-hand experience?\n"
					+ "(1 = spill coffee, 2 = ask teammates)");

			userInput = c.readInt();
			
			do {
				//interview incident 
				if (userInput == 1) {

					c.println("\"ouch.\" \"Are you okay?\" Kimberly asks as she stands up to get napkins\n"
							+ "\"No no its alright I'll just quickly go to the washroom.\n"
							+ "I'll be back in a few minutes.\"\n");
					c.println("You quickly make your way to the washroom, and check that there is no one around.\n"
							+ "You ask the system \"Can you help me respond to her?\"\n");
					c.println("\"Don't worry I can help you.\"\n"
							+ "The system starts to explain, as you wipe off your stain.\n");

					c.println("\"The Protein Folding Problem is the challenge of figuring out how the proteins\n"
							+ "fold to form intricate structures based on its sequence of amino acids.\n"
							+ "The structure is important because it determines the function of the protein.\n"
							+ "For example, if the structure of the protein is globular,\n"
							+ "it is likely used for transporting other small molecules throughout your body.\n\n"
							+ "It is such a hard problem to solve because there are so many types of proteins\n"
							+ "that humans have discovered. Right now, we know of over 200 million\n"
							+ "proteins and more, and all of the proteins have their own unique shapes.\n"
							+ "The way that proteins fold is dependent on the interaction between the\n"
							+ "20 different amino acids that make up the protein.\n");
					c.println("\nPress a key to move on to the next page");
					c.getChar();
					c.clear();
					c.println("Therefore, the possibilities are virtually limitless, which makes this problem\n"
							+ "extremely hard to solve. According to the acclaimed Levinthal's paradox,\n"
							+ "it would take longer than the age of the universe to go through\n"
							+ " every combination of a typical protein�s structure\", the system explains.\n");
					c.println("With this new knowledge, you are ready to tackle Kimberly's question.\n"
							+ "You head back to your office and reiterate the systems response to Kimberly.\n");
					c.println("After you finish speaking, you notice Kim stop the recorder.\n"
							+ "\"Thanks for taking the time to answer a couple of questions it was very informative,\n"
							+ "I can't wait to see what DeepMind has in store for us.\" Satisfied, Kimberly leaves\n");
					c.println("\nPress a key to move on to the next page");
					c.getChar();
					c.clear();
					break;

				} else if (userInput == 2) {
					c.println("How about I call over the AlphaFold team since they have first hand experience\n");
					c.println("\"That would be great!\" Kim responds.\n"
							+ "You gesture to your secretary and ask him to call over the AlphaFold Team.\n");
					c.println("\nPress a key to move on to the next page");
					c.getChar();
					c.clear();
					c.println("A few moments later the AlphaFold team arrives.\n"
							+ "After a round of introductions the team leader Lucifer\n"
							+ "begins explaining the significance of AlphaFold\n");
					c.println("The Protein Folding Problem is the challenge of figuring out how the proteins fold\n"
							+ "to form intricate structures based on its sequence of amino acids.\n"
							+ "The structure is important because it determines the function of the protein.\n"
							+ "For example, if the structure of the protein is globular, it is likely\n"
							+ "used for transporting other small molecules throughout your body.\n"
							+ "It is such a hard problem to solve because there are so many types of proteins that\n"
							+ "humans have discovered.\n\nRight now, we know of over 200 million proteins and more,\n"
							+ "and all of the proteins have their own unique shapes.\n"
							+ "The way that proteins fold is dependent on the interaction between the 20 different\n"
							+ "amino acids that make up the protein.\n"
							+ "Therefore, the possibilities are virtually limitless,\n"
							+ "which makes this problem extremely hard to solve.\n"
							+ "According to the acclaimed Levinthal's paradox, it would take longer than\n"
							+ "the age of the universe to go through every combination of a typical\n"
							+ "protein�s structure.\n");
					c.println("After hearing the explanation Kimberly takes notes.\n\n"
							+ "\"Thanks for taking the time to answer a couple of questions it was very informative,\n"
							+ "I can't wait to see what DeepMind has in store for us.\" Satisfied, Kimberly leaves.\n");
					c.println("\nPress a key to move on to the next page");
					c.getChar();
					c.clear();
					break;
				}


			} while (check(userInput) == true);

			c.println("After Kimberly leaves, your secretary enters the office\n"
					+ "\"Sir your next meeting is with the AplhaFold team.\" You follow your collegue\n"
					+ "out of your office through the building until you reach a glass door labelled\n"
					+ "AlphaFold Office your secretory drops you of here and goes back to his other duties.\n"
					+ "You walk inside and are immediately swarmed by the team members.\n" 
					+ userName + "\" We figured out a way to successfully train the program!\"\n");
			c.println("You listen curiously as he starts to explain\n"
					+ "the newly found method of training AlphaFold\n");
			c.println("\"AlphaFold is trained on ~170,000 structures"
					+ "of proteins that are publicly available.\n"
					+ "It uses the information it gathered from the database,\n"
					+ "including the amino acid sequences, to predict the structure\n"
					+ "of an unknown protein accurately.\"\n");
			c.println("\nPress a key to move on to the next page");
			c.getChar();
			c.clear();

			c.println("With all this new information you feel\n"
					+ "super powerful and have an urge to tell someone...\n"
					+ "the first two people you see are an intern and your secretary\n"
					+ "who do you choose to tell?\n"
					+ "(1 = secretary, 2 = intern)");
			userInput = c.readInt();
			do {
				//sharing incident oop
				if (userInput == 1) {
					c.println("With a smile on your face and a leap in your step, you skip to your secretory\n"
							+ "\"I come bearing good news! Our team has done it again!\n"
							+ "Our AlphaFold team has found a new succesful way to train the system\"\n");
					c.println("\"You notice an expression flicker over your secretorys face and continue\n"
							+ "\"Now with a large database, our system's knowledge of\n"
							+ "the protein structures has been broadened.\"\n");
					c.println("After sharing all the information you feel satisfied and go on to the lounge\n"
							+ "for a lunch break. In the lounge you hear other collegues talking\n"
							+ "about an upcoming launch party, as you munch on your lunch you continue to\n"
							+ "shamelessly ease drop on their converstation and\n"
							+ "write down the date and time down in your phone notes.\n");
					c.println("Exhausted from work, you head home. As soon as you get home,\n"
							+ "you hit the bed and not long after you fall asleep.\n"
							+ "You feel relieved that you are getting used to things at work and that,\n"
							+ "everything has been going so smoothly at the company. But, you cannot completely relax,\n"
							+ " as you get this feeling that this is just the calm before the storm.\n");
					
					c.println("");
					break;
				}
				else if (userInput == 2) {
					c.println("Deciding to give the new intern a chance, you head over to the nervous man\n"
							+ "\"Oh, hi sir, is there anything I can do for you?\"\n");
					c.println("\"Hmm nothing that comes to mind, but I just learnt some fascinating news,\n"
							+ "would you like to know?\" \"What is this fascinating news you talk about?\"\n"
							+ "You go on to explain how AlphaFold is trained just as the team did too you.\n");
					c.println("After sharing all the information you feel satisfied and go on to the lounge for a\n"
							+ "lunch break In the lounge you hear other collegues talking about an upcoming launch party,\n"
							+ "as you munch on your lunch you continue to shamelessly ease drop on their converstation and\n"
							+ "write down the date and time down in your phone notes.\n");
					c.println("The rest of the day goes well and eventually you reach the end of the work day");
					c.println("Exhausted from work, you head home. As soon as you get home,\n"
							+ "you hit the bed and not long after you fall asleep.\n"
							+ "You are dreaming of ice cream and just as you�re about to reach the ice cream stand,\n"
							+ "the outrageously loud ringtone of your phone wakes you up.\n"
							+ "Annoyed, you pick up the call and realize that it is your secretary.\n");
					c.println("\"We have an emergency at the company. Confidential information about AlphaFold\n"
							+ "has been leaked to the media\" your secretary hurriedly says. Fully awake now,\n"
							+ "you tell your secretary that you will be there in 15 minutes.\n"
							+ "Out of nowhere, the system starts speaking, This was exactly what happened before.\n"
							+ "We have to stop this before it gets out of hand.\n"
							+ "Now think, did you tell anyone about AlphaFold?� You try to recall\n"
							+ "your memory from the past few days and suddenly, you think of the intern, Loki, and\n"
							+ "how you excitedly told him all about AlphaFold.\n");
					c.println("\nPress a key to move on to the next page");
					c.getChar();
					c.clear();
					c.println("Feeling pretty confused, you tell the system about the intern.\n"
							+ "The system tells you to contact the intern and call him at the company.\n"
							+ "You do that while you get ready to head to the company. When you reach the company,\n"
							+ "your secretary walks towards you and briefs you on what has happened.\n"
							+ "As you walk into your office you notice a folder on your desk. Confused,\n"
							+ "you open to see a flood of pictures fall onto your desk. \"What is this?\"\n"
							+ "You look through to see that it is photos of the intern having tea with another man,\n"
							+ "�Chad, the CEO of our rival company has been seen with our intern.\n"
							+ "We suspect it was him who leaked the information to the media.�\n\n"
							+ "Just as the secretary finishes, you see the intern rushing towards you.\n"
							+ "You get furious and give Loki a chance to explain himself.\n"
							+ "However, Loki does not manage to get a word out, as he starts crying from pressure.\n"
							+ "Thinking that he is crying because of guilt, you tell the intern that he is fired.\n"
							+ "Fortunately for you, your team manages to resolve this issue.\n"
							+ "Now, you just have to wait for the launch party.\n");
					c.println("");
					break;
				}

				c.println("");

			} while (check(userInput) == true);

			c.println("Do you want to play again? (y/n)");
			finalAns = c.getChar();
		} while (finalAns == 'y');
	}
}

