package like;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import hsa_new.Console;

/**
 * @author Tenzin Seldon
 *
 */
public class ClassT {

	//	public static Console c2 = new Console(48, 83);
	public static Console c = new Console(45, 200);

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

	public static void main(String[] args) throws InterruptedException, IOException{

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
		
		//Images
		BufferedImage pngdisclaimer = null;
		pngdisclaimer = ImageIO.read(new File("fold/disclaimer.png"));
		
		BufferedImage pnglondon = null;
		pnglondon = ImageIO.read(new File("fold/london.png"));
		
		BufferedImage pngCEO = null;
		pngCEO = ImageIO.read(new File("fold/CEO.png"));
		
		BufferedImage pngcompany = null;
		pngcompany = ImageIO.read(new File("fold/company.png"));
		
		BufferedImage pngicecream = null;
		pngicecream = ImageIO.read(new File("fold/icecream.png"));
		
		BufferedImage pngambulance = null;
		pngambulance = ImageIO.read(new File("fold/ambulance.png"));
		
		BufferedImage pngbedroom = null;
		pngbedroom = ImageIO.read(new File("fold/bedroom.png"));
		
		BufferedImage pngphone = null;
		pngphone = ImageIO.read(new File("fold/phone.png"));
		
		BufferedImage pngwashroom = null;
		pngwashroom = ImageIO.read(new File("fold/washroom.png"));
		
		BufferedImage pngDeepMind = null;
		pngDeepMind = ImageIO.read(new File("fold/DeepMind.png"));
		
		BufferedImage jpgalphafold = null;
		jpgalphafold = ImageIO.read(new File("fold/alphafold.jpg"));
		
		BufferedImage jpgdriving = null;
		jpgdriving = ImageIO.read(new File("fold/driving.jpg"));
		
		BufferedImage pnginside = null;
		pnginside = ImageIO.read(new File("fold/inside.png"));
		
		BufferedImage pnginside2 = null;
		pnginside2 = ImageIO.read(new File("fold/inside2.png"));
		
		BufferedImage pnglounge = null;
		pnglounge = ImageIO.read(new File("fold/lounge.png"));
		
		BufferedImage pngperson = null;
		pngperson = ImageIO.read(new File("fold/person.png"));
		
		BufferedImage pngtitle1 = null;
		pngtitle1 = ImageIO.read(new File("fold/title.jpg"));

		BufferedImage jpgmeeting = null;
		jpgmeeting = ImageIO.read(new File("fold/meeting.jpg"));
		
		BufferedImage pngneural = null;
		pngneural = ImageIO.read(new File("fold/neural.png"));
		
		BufferedImage pngneural2 = null;
		pngneural2 = ImageIO.read(new File("fold/neural2.png"));
		
		BufferedImage jpgproteinfolding = null;
		jpgproteinfolding = ImageIO.read(new File("fold/protein folding problem.jpg"));

		BufferedImage jpgCASP = null;
		jpgCASP = ImageIO.read(new File("fold/CASP.jpg"));
		
		BufferedImage pngamino = null;
		pngamino = ImageIO.read(new File("fold/amino.png"));
		
		BufferedImage mutation = null;
		mutation = ImageIO.read(new File("fold/mutation.gif"));
		
		BufferedImage temperature = null;
		temperature = ImageIO.read(new File("fold/temperature.jpg"));
		
		BufferedImage acid = null;
		acid = ImageIO.read(new File("fold/acid.png"));
		
		BufferedImage jpgprofold = null;
		jpgprofold = ImageIO.read(new File("fold/profold.jpg"));
		
		
		//Audios
		Clip one = null;
		try {
			one = AudioSystem.getClip(); 
			one.open(AudioSystem.getAudioInputStream(new File("fold/1.wav")));
		} catch (Exception e) {
			e.printStackTrace(); 
		}

		Clip two = null;
		try {
			two = AudioSystem.getClip(); 
			two.open(AudioSystem.getAudioInputStream(new File("fold/2.wav")));
		} catch (Exception e) {
			e.printStackTrace(); 
		}
		
		Clip three = null;
		try {
			three = AudioSystem.getClip(); 
			three.open(AudioSystem.getAudioInputStream(new File("fold/3.wav")));
		} catch (Exception e) {
			e.printStackTrace(); 
		}
		
		c.drawImage(pngtitle1, 0, 0, 1800, 900, null);
		Thread.sleep(1000);
		c.clear();
		
		c.setColor(Color.black);
		c.fillRect(0, 0, 2000, 1000);
		c.setTextBackgroundColor(Color.black);
		c.setTextColor(Color.white);
		
		c.print("Please enter your name:");
		userName = c.readLine();
		
		c.print("Welcome " + userName + "!\nPress a key to start the game");
		c.drawImage(pngdisclaimer, 830, 0, 750, 850, null);
		c.getChar();
		c.clear();

		//game starts here
		//CEO name = Dominic Harris
		do {
			c.drawImage(pnglondon, 830, 10, 750, 850, null);
			//Beginning part in the story
			one.start();
			c.print("You’re walking downtown with your friends when you suddenly pass by a newsstand and\n"
					+ "see the headline for one of the newspapers \"CEO OF DEEPMIND HAS TRAGICALLY PASSED\"\n"
					+ "You stop to read, when your friends suddenly call you over; you run to catch up with\n"
					+ "them, forgetting everything you read.\n"
					+ "While walking back home one of your friends spots an ice cream truck.\n");
			Thread.sleep(17000);
			c.drawImage(pngicecream, 830, 10, 750, 850, null);
			c.print("Do you cross the road to get ice cream or go straight home?");
			c.print(" (1 = ice cream, 2 = go home)");
			userInput = c.readInt();
			one.stop();
			c.clear();
			//Decisions: whether to cross the road to get icecream or go home
			do {

				if (userInput == 1) {
					two.start();
					c.print("\nYou hurriedly cross the road to get ice cream, but just as you leave,"
							+ "\nyou get hit by a car. Your life flashes before your eyes and before you"
							+ "\nrealize it, you’re dead.");//(sound of sirens: tiloo, tiloo, tiloo)
					c.drawImage(pngambulance, 830, 10, 750, 850, null);
					Thread.sleep(10000);
					two.stop();
					break;
				//work on the audio from here
				//________________________________________________________________________________________
					
				} else if (userInput == 2) {
					c.print("You go home, and go to sleep.");
					break;
				}

			} while (check(userInput) == true);

			//Part where user wakes up in the body of the CEO and first interacts with the system
			c.print("\nYou wake up and realize you're not in your room.");
			c.drawImage(pngbedroom, 830, 10, 750, 850, null);
			Thread.sleep(3000);
			
			c.print("\nYou reach over to the phone by the bedside and notice it is September 2, 2020."
					+ "\nIt's a week earlier.");
			c.drawImage(pngphone, 830, 10, 750, 850, null);
			Thread.sleep(3000);
			
			c.print("\nConfused and groggy, you walk around the room and guide yourself to the washroom.");
			c.drawImage(pngwashroom, 830, 10, 750, 850, null);
			Thread.sleep(3000);
			
			c.print("\n\nThe person you see in the reflection isn’t you.");		
			c.print("\nSuddenly, you hear someone’s voice. No one’s around."
					+ "\n\"Don’t bother looking around,I’m in your head\", the voice says. Startled, you ask,"
					+ "\n\"Who are you, who am I, where am I?\"The voice responds,"
					+ "\n\"I am The System for Switched Souls, but you can call me The System for short,"
					+ "\nand you are in the body of the CEO of DeepMind.\""
					+ "\n\"Wait, the CEO that was all over the news?\""
					+ "\n\"Yes, so you probably know that before he died, his team was working on"
					+ "\na project called AlphaFold\"");
			
			c.print("\n\"I heard a bit about it. Why does that matter?\""
					+ "\n\"You are in this body because you will be responsible for releasing"
					+ "\nAlphaFold to the world and preventing the murder of the CEO."
					+ "\nBefore time runs out, you have to find out who was behind his murder\""
					+ "\n\"Why me though?\"");
			
			c.drawImage(pngbedroom, 830, 10, 750, 850, null);
			Thread.sleep(3000);
			
			c.print("\nBefore the system could respond, you hear a sound from the bed room."
					+ "\nYou answer to find out it's your secretary, asking why you’re so late."
					+ "\nHe informs you that you are needed at the headquarters for a meeting."
					+ "\nWhile you're getting ready, the system tries to fill you in.");
			c.print("\nPress a key to move on to the next page");
			c.drawImage(pngphone,830, 10, 750, 850, null);   //secretary on the phone, editing
			Thread.sleep(3000);
			c.getChar();
			c.clear();

			c.print("Would you like to learn about the company as a whole first? Or AlphaFold"
					+ "\n(1 = Company, 2 = AlphaFold)");
			
			c.drawImage(pngDeepMind, 830, 10, 750, 425, null); 
			c.drawImage(jpgalphafold, 830, 450, 750, 425, null); 
			Thread.sleep(1000);
			userInput = c.readInt();

			//Decisions: Learn about deepmind or alphafold
			//Change it later to make sure that no matter what the user chooses, they end up learning about both!!
		
			
			do {

				if (userInput == 1) {
					c.print("\nDeepMind is a company that started in 2010"
							+ "\nwhen there was less interest in the field of AI."
							+ "\nDeepMind consists of a team of scientists, engineers,"
							+ "\nmachine-learning experts and more, working together"
							+ "\nto advance the state of art in AI."
							+ "\nThey joined Google in 2014 to accelerate their work,"
							+ "\nwhile continuing to set their own research agenda.");
					
					c.drawImage(pngDeepMind, 830, 10, 750, 900, null); 
					Thread.sleep(5000);
					
					c.print("\n\nYou say, \"Ohhh, so that’s what DeepMind is."
							+ "\nI kinda get it now. Didn’t you say something about AlphaFold too?"
							+ "\nWhat is that?\" Then, system starts explaining");
					c.print("\n\n\"AlphaFold is an AI system developed by the company,"
							+ "\nDeepMind, to solve the \"protein folding\" problem."
							+ "\nThe protein folding problem is the challenge of figuring out"
							+ "\nhow the proteins fold to form intricate three-dimensional"
							+ "\nstructures based on its sequence of amino acids."
							+ "\nIt is an extremely hard challenge because the structures of the proteins are"
							+ "\nbased on the interactions between the 20 amino acids.\"");
					c.println("\n\nPress a key to move on to the next page");
					
					c.drawImage(jpgalphafold, 830, 10, 750, 900, null); 
					Thread.sleep(3000);
					break;
					
				} else if (userInput == 2) {
					c.println("\"AlphaFold is an AI system developed by the company,\n"
							+ "DeepMind, to solve the “protein folding” problem.\n"
							+ "The protein folding problem is the challenge of figuring out\n"
							+ "how the proteins fold to form intricate three-dimensional\n"
							+ "structures based on its sequence of amino acids.\n"
							+ "It is an extremely hard challenge because the structures of the proteins are\n"
							+ "based on the interactions between the 20 amino acids.\"\n");
					c.drawImage(jpgalphafold, 830, 10, 750, 900, null); 
					Thread.sleep(3000);
					
					
					c.println("\"I think I’m beginning to understand what AlphaFold is\n"
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
					
					c.println("\n\nPress a key to move on to the next page");
					
					c.drawImage(pngDeepMind, 830, 10, 750, 900, null); 
					Thread.sleep(5000);
					
					break;
				}
				
				
			} while (check(userInput) == true);
			
			c.getChar();
			c.clear();
			
			
			//User goes to company for the first time and attends meeting
			c.println("After making sure that you know enough information about DeepMind and AlphaFold,\n"
					+ "you make your way to work with the help of google maps.\n");
					
			c.drawImage(jpgdriving, 830, 10, 750, 900, null); 
			Thread.sleep(5000);
			
			c.print("You reach the company and then, walk to the elevator.\n"
					+ "As soon as you get off the elevator, your secretary comes rushing to you.\n"
					+ "\"Thank god you made it, here is your schedule for today\"\n"
					+ "he hurriedly hands you an ipad containing your schedule and you see that AlphaFold\n"
					+ "board meeting is highlighted at the top of the page."); 
			
			c.drawImage(pnginside, 830, 10, 750, 900, null); 
			Thread.sleep(5000);
			
			c.println("\n\nYou then attend the AlphaFold board meeting.\n"
					+ "However, you don't understand a word of it.\n"
					+ "They seem to be talking about neural networks.\n"
					+ "Fortunately for you, the system comes to your rescue and\n"
					+ "tells you all about neural networks!\n");
			
			c.drawImage(jpgmeeting, 830, 10, 750, 900, null); 
			Thread.sleep(5000);
			
			c.println("\"The first step of this process involves a deep convolutional neural network,\n"
					+ "the goal of this step is to change the protein sequence into two matrices.\n"
					+ "This neural network interprets the structure of the graph,\n"
					+ "(a folded protein, which can be thought of as a \"spatial graph\".\n"
					+ "AlphaFold uses related sequences, MSA (multiple sequence alignment)\n"
					+ "feature engineering (the process of changing raw data into meaningful data),\n\n"
					+ "The second part of this process is optimization, which\n"
					+ "is the step which transforms the two matrices into 3D shapes.\n"
					+ "The structure is created through the iterative gradient descent method.\n"
					+ "To achieve this, the algorithm starts with a smooth 3D structure and updates the\n"
					+ "structures until it becomes as close to the output from the deep learning process.\"\n");
			
			//Info about neural networks
			c.print("\n\nPress a key to move on to the next page");
			c.drawImage(pngneural, 830, 0, 750, 425, null); 
			c.drawImage(pngneural2, 830, 450, 750, 425, null); 
			
			Thread.sleep(5000);
			c.getChar();
			c.clear();
			
			
			c.print("\"Ohhh, so that's what it is.\" Not long after, the meeting comes to an end and\n"
					+ "you go back to your own office. While on the way to your office,\n"
					+ "the system starts speaking to you.");
			
			c.drawImage(pnglounge, 830, 10, 750, 900, null); 
			Thread.sleep(4000);
			
			c.print("\n\"These are two topics that will help you later on."
					+ "Which one do you want to learn about now?\n"
					+ "Your options are the CASP challenge or the Protein Folding problem\"\n"
					+ "(Press 1 = CASP Challenge, Press 2 = Protein Folding Problem)");
			
			c.drawImage(jpgCASP, 830, 0, 750, 450, null); 
			c.drawImage(jpgproteinfolding, 830, 450, 750, 450, null); 
			Thread.sleep(3000);
			userInput = c.readInt();
			
			//Decisions: CASP or Misfolding
			do {

				if (userInput == 1) {
					c.print("\"The Critical Assessment of Protein Structure Prediction (CASP)\n"
							+ "gives researchers an opportunity to compare their structure prediction methods\n"
							+ "in a head-to-head competition. It started in 1994, and has become the\n"
							+ "gold standard for assessing predictive techniques. CASP is used to catalyse research"
							+ "\nand measure progress on the newest methods for improving the accuracy of predictions.\n\n"
							+ "The CASP organizers collect a hundred unpublished protein structures and\n"
							+ "challenge researchers to predict the structures based on their protein sequence.\n"
							+ "Ground truth would be the 100 set of proteins CASP picked compared to the predicted\n"
							+ "structures. The 90 Global Distance Test (GDT) is a metric that CASP uses to score,\n"
							+ "it is a scale from 0 - 100, a GDT over 90 would be a solution to the problem.\n");
					c.print("\nPress a key to move on to the next page");
					
					c.drawImage(pngamino, 830, 0, 375, 450, null); 
					c.drawImage(mutation, 1205, 0, 375, 450, null); 
					c.drawImage(temperature, 830, 450, 375, 450, null); 
					c.drawImage(acid, 1205, 450, 375, 450, null); 

					Thread.sleep(3000);
					
					c.getChar();
					c.clear();
					
					//___________________________________________________________________________________
					//___________________________________________________________________________________
					c.print("“That was a lot of information to take in.\n"
							+ "Can you give me a few minutes to digest that?” you say.\n"
							+ "Ignoring your request, system goes on about Protein Folding Problem.");
					
					c.print("\n\nProtein misfolding is a common occurrence throughout the lifetime of the cell.\n"
							+ "There are three main reasons for protein misfolding.\n"
							+ "First reason is that the person may have a certain mutation\n"
							+ "that alters an amino acid in the protein chain. Without that amino acid,\n"
							+ "it can be very difficult for the protein to fold properly.\n\n"
							+ "The second reason for misfolding could be simply because of an error.\n"
							+ "When proteins are created, there is a machine that forms the chains of amino acids.\n"
							+ "If the directions from the DNA to form these chains are read wrong,\n"
							+ "it can cause errors, leading to misfolding.\n\n"
							+ "The third reason behind misfolding is that \n"
							+ "proteins simply do not fold correctly 100% of the time.\n"
							+ "Conditions such as temperature and acidity can also impact the protein.\n"
							+ "Protein misfolding can affect the health of the cell.\n"
							+ "When proteins fail to fold to their proper shape,\n"
							+ "their functions can also be affected.\n"
							+ "\nThe misfolded protein can also be twisted into shapes\n"
							+ "that are unfavourable to its cellular environment.\n"
							+ "Protein misfolding causes several diseases such as\n"
							+ "Alzheimer’s, Parkinson’s, Huntington’s disease, or Diabetes.");
					
					c.print("\nPress a key to move on to the next page");
					
					c.drawImage(jpgprofold, 830, 10, 750, 900, null); 
					Thread.sleep(4000);
					
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
							+ "The third reason behind misfolding is also because the\n"
							+ "proteins simply do not fold correctly 100% of the time.\n"
							+ "Conditions such as temperature and acidity can also impact the protein.\n"
							+ "Protein misfolding can affect the health of the cell.\n"
							+ "When proteins fail to fold to their proper shape,\n"
							+ "their functions can also be affected.\n"
							+ "\nThe misfolded protein can also be twisted into shapes\n"
							+ "that are unfavourable to its cellular environment.\n"
							+ "Protein misfolding causes several diseases such as\n"
							+ "Alzheimer’s, Parkinson’s, Huntington’s disease, or Diabetes.");
					c.println("\nPress a key to move on to the next page");
					c.getChar();
					c.clear();
					
					//info about CASP that user learns through employee even though they did not ask for it
					c.println("While you're sitting in your office a young man comes in to introduce himself\n");
					c.println("\"Goodmorning sir! I am Loki the new intern.\n"
							+ "I heard about the AlphaFold project and\n"
							+ "how we might actually win the CASP challenge. We're all really excited\n"
							+ "and wish the best for our team\" \"Umm yeah, thank you.\n"
							+ "If you don't mind, tell me what you know about the CASP challenge"
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
					
					c.drawImage(pngamino, 830, 0, 375, 450, null); 
					c.drawImage(mutation, 1205, 0, 375, 450, null); 
					c.drawImage(temperature, 830, 450, 375, 450, null); 
					c.drawImage(acid, 1205, 450, 375, 450, null); 

					Thread.sleep(3000);
					c.println("\"Sorry if I droned on about it. I got a bit carried away\", Loki says shyly"
							+ "\n\"Don't worry, thank you for that information\","
							+ "you respond.\n\"Anytime sir!\", says Loki.");

					c.println("\nPress a key to move on to the next page");
					c.getChar();
					c.clear();
					break;
				}
			
			} while (check(userInput) == true);

			//User's in the office where the interview takes place
			c.println("You reach your office. As soon as you sit down in your chair to relax a bit,\n"
					+ "your secretary comes in and says, \"You have a meeting today\n"
					+ "scheduled at 2pm with the newspaper journalist\"\n");
			c.println("It's 1:55pm and someone knocks on the door. It seems that the interviewer\n"
					+ "has arrived 5 minutes early. You let her inside and go to shake her hand,\n"
					+ "\"Hello, my name is Kimberly.\" \"Please have a seat.\"");
			c.println("Kimberly asks \"Why is DeepMind working on this problem?\n"
					+ "Why is the Protein Folding Problem so important?\"\n");
			
			c.println("\nPress a key to move on to the next page");
			c.getChar();
			c.clear();
			c.println("After hearing the question you start to sweat,\n"
					+ "you have to somehow escape, what do you do?");
			
			c.println("Do you spill coffee on yourself and excuse yourself to the washroom where you\n"
					+ "can ask the system about it or call over the alphafold team to explain\n"
					+ "the problem since they have first-hand experience?\n"
					+ "(1 = spill coffee, 2 = ask teammates)");

			userInput = c.readInt();
			
			do {
				//interview incident 
				if (userInput == 1) {

					c.println("\"Ouch!\" \"Are you okay?\" Kimberly asks as she stands up to get napkins.\n"
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
							+ "it is likely used for transporting small molecules throughout your body.\n\n"
							+ "It is such a hard problem to solve because there are so many types of proteins\n"
							+ "that humans have discovered. Right now, we know of over 200 million\n"
							+ "proteins, and all of the proteins have their own unique shapes.\n"
							+ "The way that proteins fold is dependent on the interaction between the\n"
							+ "20 different amino acids that make up the protein.\n");
					c.println("\nPress a key to learn a bit more");
					c.getChar();
					c.clear();
					c.println("Therefore, the possibilities are virtually limitless, which makes this problem\n"
							+ "extremely hard to solve. According to the acclaimed Levinthal's paradox,\n"
							+ "it would take longer than the age of the universe to go through\n"
							+ "every combination of a typical protein’s structure\", the system explains.\n");
					c.println("With this new knowledge, you are ready to tackle Kimberly's question.\n"
							+ "You head back to your office and reiterate the systems response to Kimberly.\n");
					c.println("After you finish speaking, you notice Kim stop the recorder.\n"
							+ "\"Thanks for taking the time to answer a couple of questions, it was very informative.\n"
							+ "I can't wait to see what DeepMind has in store for us.\" Satisfied, Kimberly leaves.\n");
					c.println("\nPress a key to move on to the next page");
					c.getChar();
					c.clear();
					break;

				} else if (userInput == 2) {
					c.println("\"How about I call over the AlphaFold team since they have first hand experience\"\n");
					c.println("\"That would be great!\" Kim responds.\n"
							+ "You gesture to your secretary and ask him to call over the AlphaFold Team.\n");
					c.println("\nPress a key to move on to the next page");
					c.getChar();
					c.clear();
					c.println("A few moments later the AlphaFold team arrives.\n"
							+ "After a round of introductions the team leader Lucifer\n"
							+ "begins explaining the significance of AlphaFold.\n");
					c.println("\"The Protein Folding Problem is the challenge of figuring out how the proteins fold\n"
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
							+ "protein’s structure.\"\n");
					c.println("After hearing the explanation, Kimberly takes notes.\n\n"
							+ "\"Thanks for taking the time to answer a couple of questions it was very informative.\n"
							+ "I can't wait to see what DeepMind has in store for us!\" Satisfied, Kimberly leaves.\n");
					c.println("\nPress a key to move on to the next page");
					c.getChar();
					c.clear();
					break;
				}


			} while (check(userInput) == true);

			c.println("After Kimberly leaves, your secretary enters the office\n"
					+ "\"Sir, your next meeting is with the AlphaFold team.\" You follow your colleague\n"
					+ "out of your office through the building until you reach a glass door labelled\n"
					+ "AlphaFold Office. Your secretory drops you off here and goes back to his other duties.\n"
					+ "You walk inside and are immediately swarmed by the team members.\n" 
					+ "\"We figured out a way to successfully train the program!\"\n");
			c.println("You listen curiously as they start to explain\n"
					+ "the newly found method of training AlphaFold.\n");
			c.println("\"AlphaFold is trained on 170,000 structures "
					+ "of proteins that are publicly available.\n"
					+ "It uses the information it gathered from the database,\n"
					+ "including the amino acid sequences, to predict the structure\n"
					+ "of an unknown protein accurately.\"\n");
			c.println("\nPress a key to move on to the next page");
			c.getChar();
			c.clear();

			c.println("With all this new information you feel\n"
					+ "super powerful and have an urge to tell someone...\n"
					+ "The first two people you see are an intern and your secretary.\n"
					+ "Who do you choose to tell?\n"
					+ "(1 = secretary, 2 = intern)");
			userInput = c.readInt();
			do {
				//sharing incident oop
				if (userInput == 1) {
					c.println("With a smile on your face and a leap in your step, you skip to your secretary\n"
							+ "\"I come bearing good news! Our team has done it again!\n"
							+ "Our AlphaFold team has found a new successful way to train the system\"\n");
					c.println("You notice an expression flicker over your secretary's face and continue\n"
							+ "\"Now with a large database, our system's knowledge of\n"
							+ "the protein structures has been broadened.\"\n");
					c.println("After sharing all the information, you feel satisfied and go on to the lounge\n"
							+ "for a lunch break. In the lounge you hear other colleagues talking\n"
							+ "about an upcoming launch party. As you munch on your lunch you continue to\n"
							+ "shamelessly eavesdrop on their conversation and\n"
							+ "write down the date and time down in your phone notes.\n");
					c.println("Exhausted from work, you head home. As soon as you get home,\n"
							+ "you hit the bed and not long after you fall asleep.\n"
							+ "You feel relieved that you are getting used to things at work and that\n"
							+ "everything has been going so smoothly at the company.\n"
							+ "But, you cannot completely relax, as you get this feeling\n"
							+ "that this is just the calm before the storm.\n"
							+ "The next morning, the outrageously loud ringtone of your phone wakes you up.\n"
							+ "Annoyed, you pick up the call and realize that it is your secretary.\n" 
							+"\"We have an emergency at the company. Confidential information about AlphaFold\n"
							+ "has been leaked to the media” your secretary hurriedly says.\n"
							+ "Fully awake now, you tell your secretary that you will be there in 15 minutes.\n");
					c.println("\nPress a key to continue");
					c.getChar();
					c.clear();
							c.println( "Out of nowhere, the system starts speaking,\n"
							+ "\"This was exactly what happened before.\n"
							+ "We have to stop this before it gets out of hand.\n"
							+ "Now think, did you tell anyone about AlphaFold?\"\n"
							+ "You try to recall your memory from the past few days and suddenly,\n"
							+ "you think of the intern, Loki, and how you excitedly told him all about AlphaFold.\n"
							+ "When you reach your company, your secretary walks towards you\n"
							+ "and briefs you on what has happened.\n"
							+ "As you walk into your office you notice a folder on your desk. Confused,\n"
							+ "you open to see a flood of pictures fall onto your desk. \"What is this?\"\n"
							+ "You look through to see that it is photos of the intern having tea with another man,\n"
							+ "\"Chad, the CEO of our rival company has been seen with our intern.\n"
							+ "We suspect it was him who leaked the information to the media.”\n\n"
							+ "Just as the secretary finishes, you see the intern rushing towards you.\n"
							+ "You get furious and give Loki a chance to explain himself.\n"
							+ "However, Loki does not manage to get a word out, as he starts crying from pressure.\n"
							+ "Thinking that he is crying because of guilt, you tell the intern that he is fired.\n"
							+ "Fortunately for you, your team manages to resolve this issue.\n"
							+ "Now, all there is to do is wait for the launch party.\n");
					c.println("\nPress a key to move on to the next page");
					c.getChar();
					c.clear();
					c.println("");
					break;
				}
				else if (userInput == 2) {
					
					c.println("Deciding to give the new intern a chance, you head over to the nervous man\n"
							+ "\"Oh, hi sir, is there anything I can do for you?\"\n");
					c.println("\"Hmm nothing that comes to mind, but I just learnt some fascinating news,\n"
							+ "would you like to know?\" Curious, Loki asks,\n"
							+ "\"What is this fascinating news you talk about?\"\n"
							+ "You go on to explain how AlphaFold is trained just as the team did to you.\n");
					
					c.println("After sharing all the information you feel satisfied and go on to the lounge for a\n"
							+ "lunch break. In the lounge you hear other colleagues talking about an\n"
							+ "upcoming launch party. As you munch on your lunch you continue to shamelessly\n"
							+ "eaves drop on their converstation and write down the\n"
							+ "date and time down in your phone notes.\n");
					c.println("\nPress a key to move on to the next page");
					
					c.getChar();
					c.clear();
					c.println("The rest of the day goes well and eventually you reach the end of the work day.");
					c.println("Exhausted from work, you head home. As soon as you get home,\n"
							+ "you hit the bed and not long after you fall asleep.\n"
							+ "The next morning, an outrageously loud ringtone of your phone wakes you up.\n"
							+ "Annoyed, you pick up the call and realize that it is your secretary.\n");
					c.println("\"We have an emergency at the company. Confidential information about AlphaFold\n"
							+ "has been leaked to the media\" your secretary hurriedly says. Fully awake now,\n"
							+ "you tell your secretary that you will be there in 15 minutes.\n"
							+ "Out of nowhere, the system starts speaking, \"This was exactly what happened before.\n"
							+ "We have to stop this before it gets out of hand.\n"
							+ "Now think, did you tell anyone about AlphaFold?\" You try to recall\n"
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
							+ "\"Chad, the CEO of our rival company has been seen with our intern.\n"
							+ "We suspect it was him who leaked the information to the media.\"\n\n"
							+ "Just as the secretary finishes, you see the intern rushing towards you.\n"
							+ "You get furious and give Loki a chance to explain himself.\n"
							+ "However, Loki does not manage to get a word out, as he starts crying from pressure.\n"
							+ "Thinking that he is crying because of guilt, you tell the intern that he is fired.\n"
							+ "Fortunately for you, your team manages to resolve this issue.\n"
							+ "Now, you just have to wait for the launch party.\n");
					c.println("\nPress a key to move on to the next page");
					c.getChar();
					c.clear();
					c.println("");
					break;
				}
			} while (check(userInput) == true);
			
			c.println("AlphaFold is in its final stages of development and will be ready to launch soon.\n"
					+ "Your secretary reminds you of the upcoming party celebrating the\n"
					+ "release of the new-found technology. You go home and manage to find a suit.\n"
					+ "Somehow you manage to make yourself presentable and get picked\n"
					+ "up by a car ordered by your secretary.\n");
			c.println("You arrive at the grand location and see many others like you in formal wear\n"
					+ "walking inside the massive building. You walk inside and are\n"
					+ "instantly cornered by people, “Hey, congratulations on AlphaFold.\n"
					+ "Amazing what your team has accomplished!” As you reply with a meek \"Thank you,\"\n"
					+ "you become surrounded by more people giving their congrats.");
			c.println("\nPress a key to move on to the next page");
			c.getChar();
			c.clear();
			
			c.println("You finally make your way to the drinks.\n"
					+ "Grabbing a small drink of peach juice and a bite of biscuits.\n"
					+ "You start to finally relax, “Hello there,” startled, you look to the right where\n"
					+ "you see a middle-aged man sipping his martini. “It must be overwhelming with all\n"
					+ "these people surrounding you at all times, he nods\n"
					+ "his head over to the crowd of people in the middle of the room.\n");
			c.println("\"It's not too bad, it's not always every day that a company\n"
					+ "can achieve such a great feat\", you congratulate yourself for that amazing save.\n"
					+ "\"It really is amazing. I seemed to have forgotten to introduce myself.\n"
					+ "Doctor Frank Henely from Johns Hopkins Hospital. We have a lot of patients\n"
					+ "who suffer from Alzheimer’s and Parkinson's, this newfound technology is going to\n"
					+ "greatly advance the medical field especially for these diseases\".\n"
					+ "His eyes shine as he mentions AlphaFold. You manage small talk with Dr. Henely\n"
					+ "until you finally excuse yourself to the bathroom.\n");
			c.println("\nPress a key to move on to the next page");
			c.getChar();
			c.clear();
			
			c.println("After locating a small corner in the building, you connect with the system,\n"
					+ "\"System, you have to help me. What was he talking about? I still\n"
					+ "haven't learned about what exactly AlphaFold is going to do once\n"
					+ "it is released into the world!\". Relaxed, the System replies, \"Don’t worry,\n"
					+ "here's what you need to know. With AlphaFold, eradication of neurological diseases\n"
					+ "such as Alzheimer’s and Parkinson's might become possible, since these diseases\n"
					+ "are known to be caused by the misfolding of proteins in your brain.\n"
					+ "This causes the creation of clumps of protein that then disrupts brain activity.\n\n"
					+ "The structure of the protein determines the function and nearly all diseases,\n"
					+ "including cancer and dementia, are related to how proteins function.\n"
					+ "The recipes of the proteins (genes) are encoded in our DNA, and an error\n"
					+ "found in the genetic recipe can result in a malformed protein.\n\n"
					+ "This could result in disease or death, in fact many diseases are fundamentally\n"
					+ "linked to proteins. Since AlphaFold can help predict how the protein is going to\n"
					+ "fold, we can gain a deeper understanding of diseases more quickly\n"
					+ "and can develop drugs to fight them. It will enable scientists\n"
					+ "to target and design new, effective cures for diseases more efficiently.\n");
			c.println("\nPress a key to move on to the next page");
			c.getChar();
			c.clear();
			
			c.println("\"Wow, that was a lot of information.\n"
					+ "\nI didn’t realize how much impact this program will have on the medical field.\" "
					+ "\nYou reply in awe as you process the System's response. ");
			c.println("\n\"Which is exactly why there are many people here tonight, all waiting to hear\n"
					+ "more about the system that will change the world for the better.\""
					+ "The System exclaims proudly, \"Now get out there.\" You make your way back into\n"
					+ "the party and continue to mingle with people.\n\n"
					+ "\"Hi, I’m Etil Mone from the National Geographic Magazine. Many of our viewers\n"
					+ "are excited to learn more about the environmental impacts of AlphaFold.\"\n"
					+ "As she stares at you expectantly, you start to grow nervous, you try to send the\n"
					+ "system a message, \"Umm, System, a little help here?\"\n\n"
					+ "The System chuckles lightly as it replies, “Understanding protein folding will\n"
					+ "assist in protein design, which could unlock a tremendous number of benefits.\n"
					+ "For example, advances in biodegradable enzymes, which can be enabled by protein\n"
					+ "design, could help manage pollutants like plastic and oil. Helping us break\n"
					+ "down waste in ways that are more friendly to our environment.\n"
					+ "Researchers have already begun engineering bacteria to secrete proteins\n"
					+ "that will make waste biodegradable, and easier to process.\n"
					+ "Understanding different folds in a protein can help\n"
					+ "us determine how it will interact with different molecules,\n"
					+ "and then we can implement these findings into designing enzymes\n"
					+ "to break down pollutants and improving crop yields.\"\n");
			c.println("Etil smiles as she nods at your response,\n"
					+ "\"We are so excited to see what AlphaFold will do for the environment.\n"
					+ "Thank you so much for your time. Have a good night.\"");
			c.println("\nPress a key to move on to the next page\n");
			c.getChar();
			c.clear();
			
			c.println("As the party nears the end of the night, you walk over to the food table.\n"
					+ "You place your drink down to nibble on some biscuits,\n"
					+ "but when you look back to your glass, you notice\n"
					+ "two identical drinks placed next to each other. \"Ehh, five-second rule,\"\n"
					+ "you shrug and pick the one closest to you, \"You might not want to do that,\"\n"
					+ "the System yells. Startled, you place the drink back on the table \"Why?\"\n"
					+ "The System sighs,\"In a mere few months, AlphaFold will successfully predict\n"
					+ "the protein structure of a virus.\" Shocked, you reply,\n"
					+ "\"What virus, and why are you just telling me this now?\"\n"
					+ "“Here I’ll sum it up for you, in a few months when a virus\n"
					+ "commonly known as Covid-19 hits the world, DeepMind will take data from the\n"
					+ "blueprint of the Covid-19 virus. DeepMind will focus on the proteins\n"
					+ "that were understudied but have the potential to become targets\n"
					+ "for a vaccine, using AI.\n");
			c.println("It will predict the protein structures of many coronavirus proteins,\n"
					+ "some being ORF8, and ORF3a. ORF8 antibodies played a significant role in\n"
					+ "identifying COVID-19 samples at early points of the virus.\"\n"
					+ "Slowly, you raise the glass to your lips, \"And what does this have to do\n"
					+ "with my drink?\" Sighing, the System replies, \"It can be transferred\n"
					+ "through saliva as well.\" You instantly put the drink back on the table,\n"
					+ "\"Okay, maybe I’ll just grab a new glass...\" \"Good decision\" the System murmurs.\n");
			c.println("Needing a break from talking to people, you go to the washroom.\n"
					+ "As you’re washing your hands, you notice one of the bathroom\n"
					+ "stalls open and see your secretary come out. You quickly greet him and turn\n"
					+ "to leave the washroom. Just when you’re about to reach the exit, you feel something\n"
					+ "heavy hit your head and not long after, you see the\n"
					+ "world darken as you lose consciousness.\n");
			c.println("\nPress a key to find out what happens next...");
			c.getChar();
			c.clear();
			c.println("You wake up in a dark room tied to a chair. Confused and groggy,\n"
					+ "you look around and see that the room is vacant except for a\n"
					+ "cheap light attached to the ceiling. “You’re finally awake,” a voice calls out\n"
					+ "from the dark. \"Who are you? What do you want from me? Is it because of the\n"
					+ "biscuits I stole from before? They’re in my pockets. I can give them to you.\"\n"
					+ "You hurriedly defend yourself as you feel the tight bind digging through your wrists.\n\n"
					+ "\"You don’t recognize me?\" you squint as a figure emerges from the dark.\n"
					+ "\"Hello Sir, is your memory better now?\" As you stare in disbelief at the man,\n"
					+ "you feel a bitter taste in your mouth as you growl, \"You!?\" The man smirks as he\n"
					+ "replies,\"Yes, me, I bet you never saw this coming. Who would have thought your\n"
					+ "trusty secretary who follows your orders would ever go against\n"
					+ "your decisions.\" You shake your head in confusion,\n"
					+ "\"But why, why would you do this Brad?\"\n");
			
			c.println("Before he can respond, you hear a groan from the other side of the room.\n"
					+ "You squint to see where the sound came from. Seeing you struggle, Brad smiles.\n"
					+ "\"Ohh, I forgot to tell you something else too” he says,\n"
					+ "as he crosses the room to turn on the other light. As he turns on the light,\n"
					+ "you see the source of the groan and shocked you stutter, \"Wh-hy i-s Lo-oki he-re?\n"
					+ "Do-n’t te-ll me..\"  \"Yes, Loki, the one you fired” Brad responds, reading your mind.\n"
					+ "\"So, you’re telling me, everything was planned: the evidence, Chad, me firing him?\"\n"
					+ "you respond, utterly shocked and disgusted.");
			c.println("\nPress a key to move on to the next page");
			c.getChar();
			c.clear();
			c.println("you get shivers down your spine as your secretary cackles like a maniac.\n"
					+ "He says, \"For 5 years, I listened to you and followed you like a fool.\n"
					+ "If I hadn’t met Chad, I would not have realized my worth.\" \"Why Chad?\n"
					+ "How could you do this to me?” you ask. Brad, suddenly furious, screams\n"
					+ "\"Not everything is about you! You know what? Let me tell you something,\n"
					+ "Chad is my *drumroll please* my long-lost twin brother\" *dun dun dun*. You gasp.");
			
			c.println("You stare at him in disbelief, \"You’re never gonna get away with this!\"\n"
					+ "Smiling, Brad pulls out a pen drive, \"I already have.\n"
					+ "This pen drive has everything you have been working on for the last decade.\n"
					+ "Just wait until the media finds out, the prestigious CEO of DeepMind, has duped\n"
					+ "everyone.\" Desperate now, you try to escape from the binds.\n"
					+ "\"Well, I’ve got to go now. I have a press conference to get to,\n"
					+ "now that our company's CEO has gone missing along\n"
					+ "with his work that would have changed the world,\" Brad strolls out into the darkness\n"
					+ "leaving you bound to the chair, with the intern\n"
					+ "passed out on the room across from you.\n");
			c.println("\nPress a key to move on to the next page");
			c.getChar();
			c.clear();
			c.println("Feeling defeated, you look around the room to see if there’s anything you can use to\n"
					+ "escape from the binds. Just then, the intern wakes up.\n"
					+ "\"I heard everything. I’m so sorry, I should’ve tried to tell you about your secretary\n"
					+ "before\" Loki says. \"Huh, wait, you knew everything?\" you ask confused. Loki responds,\n"
					+ "\"Yes, I heard your secretary talking to someone at the company one time.\n"
					+ "He seemed pretty mad and so I quietly listened in on their conversation.\n"
					+ "That was when I found out about his plans. I was so shocked and wanted to tell\n"
					+ "you about it but I had no evidence. So, for the next few days I did some\n"
					+ "research and found out that it was Chad who was helping him. I thought I could \n"
					+ "convince Chad and so I went to meet him. Turns out I was tricked and\n"
					+ "before I realized it, I was fired from the company. It’s okay, I don’t blame you\".\n"
					+ "Listening to Loki made you realize just how thorough Brad’s plans were, which scared you\n"
					+ "Loki sees you panic and reassures you.\n"
					+ "He tells you not to worry and reveals his escape plan.\n");
			c.println("\nPress a key to move on to the next page");
			c.getChar();
			c.clear();
			c.println("\"I’ve been trapped here for days, so I know the area pretty well. Your secretary\n"
					+ "comes in everyday through that door and by now, I’m pretty sure that’s the only\n"
					+ "door that we can exit through. We have 2 hours before he comes back and if we manage\n"
					+ "to escape by then, we should be safe. Can you check your pocket to see if\n"
					+ "you have anything sharp that can cut through the ropes?\" Loki asks.\n"
					+ "You use your elbows to check your pocket since your hands are tied and\n"
					+ "you feel something there. \"Wait, I can feel something in my pocket but\n"
					+ "I can’t take it out\" you say. Loki responds, \"Hop here to me and I’ll take it out\".\n"
					+ "You manage to get near Loki. Luckily, Loki’s hands can reach your pocket.\n"
					+ "He takes out something from your pocket and you realize that\n"
					+ "it’s the original wallet of the CEO. Loki takes out a card, and shocked, you say\n"
					+ "\"Isn’t that one of those card pocket knives?\" \"YES!\" Loki screams happily.\n"
					+ "You and Loki manage to cut through the ropes and you escape the room.\n");
			c.println("\nPress a key to move on to the next page");
			c.getChar();
			c.clear();
			c.println("As you’re running, you talk to the system, \"What do I do next?\n"
					+ "How can I prove the secretary guilty?\" System smirks and says,\n"
					+ "\"Check your other pocket\".\n"
					+ "You take out a pen from your pocket and suddenly you start to\n"
					+ "realize just how smart the actual CEO was. \"Is this what I think it is?\"\n"
					+ "you ask the system excitedly. System says, \"Yep, it’s a camcorder pen.\n"
					+ "Now, you have the evidence. Quickly call the police and head towards the\n"
					+ "prees conference to stop him\".\n");
			
			c.println("You reach the press conference in time and stop your secretary and his twin Chad.\n"
					+ "Just then, the police arrive and they arrest them in front of everyone.\n"
					+ "\"Wait, what’s happening? Release us this instant!\"\n"
					+ "One of the police officers restrains Chad as he tries to escape and says,\n"
					+ "\"Mr. Chad Fennedy, you have the right to remain silent.\n"
					+ "Anything you say can and will be used against you in a court of law.\"\n"
					+ "You then watch as the police officers take away the Fennedy twins.\n");
			c.println("\nIt's not over yet... press a key to move on to the next page");
			c.getChar();
			c.clear();
			c.println("Feeling drained after the long day,\n"
					+ "you sit down on one of the office chairs and doze off.\n"
					+ "You successfully managed to save the CEO.");
			c.println("But, will you ever go back to your own body?");
			c.println("");
			
			c.println("Do you want to play again? (y/n)");
			finalAns = c.getChar();
		} while (finalAns == 'y');
	}
}

