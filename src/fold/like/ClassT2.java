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
public class ClassT2 {

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

		BufferedImage pngphone1 = null;
		pngphone1 = ImageIO.read(new File("fold/phone1.jpg"));

		BufferedImage pngphone2 = null;
		pngphone2 = ImageIO.read(new File("fold/phone2.jpg"));

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

		BufferedImage GDT = null;
		GDT = ImageIO.read(new File("fold/GDT.jpg"));

		//photos for after 469
		BufferedImage pngfolder = null;
		pngfolder = ImageIO.read(new File("fold/folder.png"));


		BufferedImage pngdrFrank = null;
		pngdrFrank = ImageIO.read(new File("fold/drFrank.png"));

		BufferedImage pngdarkRoom = null;
		pngdarkRoom = ImageIO.read(new File("fold/darkRoom.png"));

		BufferedImage pngtied = null;
		pngtied = ImageIO.read(new File("fold/tied.png"));

		BufferedImage pngchadLoki = null;
		pngchadLoki = ImageIO.read(new File("fold/chadLoki.png"));

		BufferedImage jpghandWash = null;
		jpghandWash = ImageIO.read(new File("fold/handWash.jpg"));

		BufferedImage pnglunch = null;
		pnglunch = ImageIO.read(new File("fold/lunch.png"));

		BufferedImage pngdrinks = null;
		pngdrinks = ImageIO.read(new File("fold/drinks.png"));

		BufferedImage jpgteam = null;
		jpgteam = ImageIO.read(new File("fold/team.jpg"));

		BufferedImage pngspillCoffee = null;
		pngspillCoffee = ImageIO.read(new File("fold/spillCoffee.png"));

		BufferedImage jpgproteinfoldingpro = null;
		jpgproteinfoldingpro = ImageIO.read(new File("fold/proteinfolding.jpg"));


		BufferedImage pngloungeRoom = null;
		pngloungeRoom = ImageIO.read(new File("fold/loungeRoom.png"));


		BufferedImage jpgkimberly = null;
		jpgkimberly = ImageIO.read(new File ("fold/kimberly.jpg"));


		BufferedImage jpgintern = null;
		jpgintern = ImageIO.read(new File ("fold/intern.jpg"));


		BufferedImage jpglaunch = null;
		jpglaunch = ImageIO.read(new File("fold/launch.jpg"));

		BufferedImage pngsecretary = null;
		pngsecretary = ImageIO.read(new File("fold/secretary.png"));

		BufferedImage jpgetil = null;
		jpgetil = ImageIO.read(new File ("fold/etil.jpg"));

		BufferedImage jpgdoor = null;
		jpgdoor = ImageIO.read(new File ("fold/door.jpg"));

		BufferedImage jpgknife = null;
		jpgknife = ImageIO.read(new File ("fold/knife.jpg"));

		BufferedImage jpgpen = null;
		jpgpen = ImageIO.read(new File ("fold/pen.jpg"));

		BufferedImage jpgconference = null;
		jpgconference = ImageIO.read(new File ("fold/conference.jpg"));

		BufferedImage jpgarrest = null;
		jpgarrest = ImageIO.read(new File ("fold/arrest.jpg"));

		BufferedImage jpgofficechair = null;
		jpgofficechair = ImageIO.read(new File ("fold/officechair.jpg"));

		BufferedImage pngalphaoffice = null;
		pngalphaoffice = ImageIO.read(new File ("fold/AlphaOffice.png"));

		BufferedImage jpgtwodrinks = null;
		jpgtwodrinks = ImageIO.read(new File ("fold/twodrinks.jpg"));

		BufferedImage jpgcorner = null;
		jpgcorner = ImageIO.read(new File ("fold/corner.jpg"));

		BufferedImage jpgblack = null;
		jpgblack = ImageIO.read(new File ("fold/black.jpg"));

		BufferedImage jpgalz = null;
		jpgalz = ImageIO.read(new File ("fold/alz.jpg"));

		BufferedImage jpgparkinsons = null;
		jpgparkinsons = ImageIO.read(new File ("fold/parkinsons.jpg"));
		
		BufferedImage jpgparty = null;
		jpgparty = ImageIO.read(new File ("fold/party.jpg"));
		


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

		Clip four = null;
		try {
			four = AudioSystem.getClip(); 
			four.open(AudioSystem.getAudioInputStream(new File("fold/3.wav")));
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
			//			c.drawImage(pnglondon, 830, 10, 750, 850, null);
			//			//Beginning part in the story
			//			one.start();
			//			c.print("You’re walking downtown with your friends when you suddenly pass by a newsstand and\n"
			//					+ "see the headline for one of the newspapers \"CEO OF DEEPMIND HAS TRAGICALLY PASSED\"\n"
			//					+ "You stop to read, when your friends suddenly call you over; you run to catch up with\n"
			//					+ "them, forgetting everything you read.\n"
			//					+ "While walking back home one of your friends spots an ice cream truck.\n");
			//			Thread.sleep(17000);
			//			c.drawImage(pngicecream, 830, 10, 750, 850, null);
			//			c.print("Do you cross the road to get ice cream or go straight home?");
			//			c.print(" (1 = ice cream, 2 = go home)");
			//			userInput = c.readInt();
			//			one.stop();
			//			c.clear();
			//			//Decisions: whether to cross the road to get icecream or go home
			//			do {
			//
			//				if (userInput == 1) {
			//					two.start();
			//					c.print("\nYou hurriedly cross the road to get ice cream, but just as you leave,"
			//							+ "\nyou get hit by a car. Your life flashes before your eyes and before you"
			//							+ "\nrealize it, you’re dead.");//(sound of sirens: tiloo, tiloo, tiloo)
			//					c.drawImage(pngambulance, 830, 10, 750, 850, null);
			//					Thread.sleep(10000);
			//					two.stop();
			//					break;
			//				//work on the audio from here
			//				//________________________________________________________________________________________
			//					
			//				} else if (userInput == 2) {
			//					three.start();
			//					c.print("You go home, and go to sleep.");
			//					Thread.sleep(2000);
			//					three.stop();
			//					break;
			//				}
			//
			//			} while (check(userInput) == true);
			//
			//			//Part where user wakes up in the body of the CEO and first interacts with the system
			//			c.print("\nYou wake up and realize you're not in your room.");
			//			c.drawImage(pngbedroom, 830, 10, 750, 850, null);
			//			Thread.sleep(3000);
			//			
			//			c.print("\nYou reach over to the phone by the bedside and notice it is September 2, 2020."
			//					+ "\nIt's a week earlier.");
			//			c.drawImage(pngphone1, 830, 10, 750, 850, null);
			//			Thread.sleep(3000);
			//			
			//			c.print("\nConfused and groggy, you walk around the room and guide yourself to the washroom.");
			//			c.drawImage(pngwashroom, 830, 10, 750, 850, null);
			//			Thread.sleep(3000);
			//			
			//			c.print("\n\nThe person you see in the reflection isn’t you.");		
			//			c.print("\nSuddenly, you hear someone’s voice. No one’s around."
			//					+ "\n\"Don’t bother looking around,I’m in your head\", the voice says. Startled, you ask,"
			//					+ "\n\"Who are you, who am I, where am I?\"The voice responds,"
			//					+ "\n\"I am The System for Switched Souls, but you can call me The System for short,"
			//					+ "\nand you are in the body of the CEO of DeepMind.\""
			//					+ "\n\"Wait, the CEO that was all over the news?\""
			//					+ "\n\"Yes, so you probably know that before he died, his team was working on"
			//					+ "\na project called AlphaFold\"");
			//			
			//			c.print("\n\"I heard a bit about it. Why does that matter?\""
			//					+ "\n\"You are in this body because you will be responsible for releasing"
			//					+ "\nAlphaFold to the world and preventing the murder of the CEO."
			//					+ "\nBefore time runs out, you have to find out who was behind his murder\""
			//					+ "\n\"Why me though?\"");
			//			
			//			c.drawImage(pngbedroom, 830, 10, 750, 850, null);
			//			Thread.sleep(3000);
			//			
			//			c.print("\nBefore the system could respond, you hear a sound from the bed room."
			//					+ "\nYou answer to find out it's your secretary, asking why you’re so late."
			//					+ "\nHe informs you that you are needed at the headquarters for a meeting."
			//					+ "\nWhile you're getting ready, the system tries to fill you in.");
			//			
			//			c.println("\nWould you like to learn about DeepMind or AlphaFold? "
			//					+ "\n(1 = DeepMind, 2 = AlphaFold)");
			//			
			//			c.drawImage(pngDeepMind, 830, 10, 750, 450, null); 
			//			c.drawImage(jpgalphafold, 830, 450, 750, 450, null); 
			//			Thread.sleep(1000);
			//			userInput = c.readInt();
			//			c.clear();
			//
			//			//Decisions: Learn about deepmind or alphafold
			//			//Change it later to make sure that no matter what the user chooses, they end up learning about both!!
			//		
			//			
			//			do {
			//				if (userInput == 1) {
			//					c.print("\nDeepMind is a company that started in 2010"
			//							+ "\nwhen there was less interest in the field of AI."
			//							+ "\nDeepMind consists of a team of scientists, engineers,"
			//							+ "\nmachine-learning experts and more, working together"
			//							+ "\nto advance the state of art in AI."
			//							+ "\nThey joined Google in 2014 to accelerate their work,"
			//							+ "\nwhile continuing to set their own research agenda.");
			//					
			//					c.drawImage(pngDeepMind, 830, 10, 750, 900, null); 
			//					Thread.sleep(5000);
			//					
			//					c.print("\n\nYou say, \"Ohhh, so that’s what DeepMind is."
			//							+ "\nI kinda get it now. Didn’t you say something about AlphaFold too?"
			//							+ "\nWhat is that?\" Then, system starts explaining");
			//					c.print("\n\n\"AlphaFold is an AI system developed by the company,"
			//							+ "\nDeepMind, to solve the \"protein folding\" problem."
			//							+ "\nThe protein folding problem is the challenge of figuring out"
			//							+ "\nhow the proteins fold to form intricate three-dimensional"
			//							+ "\nstructures based on its sequence of amino acids."
			//							+ "\nIt is an extremely hard challenge because the structures of the proteins are"
			//							+ "\nbased on the interactions between the 20 amino acids.\"");
			//					c.println("\n\nPress a key to move on to the next page");
			//					
			//					c.drawImage(jpgalphafold, 830, 10, 750, 900, null); 
			//					Thread.sleep(3000);
			//					break;
			//					
			//				} else if (userInput == 2) {
			//					c.println("\"AlphaFold is an AI system developed by the company,\n"
			//							+ "DeepMind, to solve the “protein folding” problem.\n"
			//							+ "The protein folding problem is the challenge of figuring out\n"
			//							+ "how the proteins fold to form intricate three-dimensional\n"
			//							+ "structures based on its sequence of amino acids.\n"
			//							+ "It is an extremely hard challenge because the structures of the proteins are\n"
			//							+ "based on the interactions between the 20 amino acids.\"\n");
			//					c.drawImage(jpgalphafold, 830, 10, 750, 900, null); 
			//					Thread.sleep(3000);
			//					
			//					
			//					c.println("\"I think I’m beginning to understand what AlphaFold is\n"
			//							+ "but I still have so many questions,\" you say. System interrupts you and says,\n"
			//							+ "\"I can answer all your questions later\n"
			//							+ "but first you need to know more about the company\".\n"
			//							+ "Before you can respond, system starts going on about the company, DeepMind.\n");
			//					c.println("DeepMind is a company that started in 2010,\n"
			//							+ "when there was less interest in the field of AI.\n"
			//							+ "DeepMind consists of a team of scientists, engineers,\n"
			//							+ "machine-learning experts and more, working together\n"
			//							+ "to advance the state of art in AI.\n"
			//							+ "They joined Google in 2014 to accelerate their work,\n"
			//							+ "while continuing to set their own research agenda.\n");
			//					
			//					c.println("\n\nPress a key to move on to the next page");
			//					
			//					c.drawImage(pngDeepMind, 830, 10, 750, 900, null); 
			//					Thread.sleep(5000);
			//					
			//					break;
			//				}
			//				
			//				
			//			} while (check(userInput) == true);
			//			
			//			c.getChar();
			//			c.clear();
			//			
			//			
			//			//User goes to company for the first time and attends meeting
			//			c.println("After making sure that you know enough information about DeepMind and AlphaFold,\n"
			//					+ "you make your way to work with the help of google maps.\n");
			//					
			//			c.drawImage(jpgdriving, 830, 10, 750, 900, null); 
			//			Thread.sleep(5000);
			//			
			//			c.print("You reach the company and then, walk to the elevator.\n"
			//					+ "As soon as you get off the elevator, your secretary comes rushing to you.\n"
			//					+ "\"Thank god you made it, here is your schedule for today\"\n"
			//					+ "he hurriedly hands you an ipad containing your schedule and you see that AlphaFold\n"
			//					+ "board meeting is highlighted at the top of the page."); 
			//			
			//			c.drawImage(pnginside, 830, 10, 750, 900, null); 
			//			Thread.sleep(5000);
			//			
			//			c.println("\n\nYou then attend the AlphaFold board meeting.\n"
			//					+ "However, you don't understand a word of it.\n"
			//					+ "They seem to be talking about neural networks.\n"
			//					+ "Fortunately for you, the system comes to your rescue and\n"
			//					+ "tells you all about neural networks!\n");
			//			
			//			c.drawImage(jpgmeeting, 830, 10, 750, 900, null); 
			//			Thread.sleep(5000);
			//			
			//			c.println("\"The first step of this process involves a deep convolutional neural network,\n"
			//					+ "the goal of this step is to change the protein sequence into two matrices.\n"
			//					+ "This neural network interprets the structure of the graph,\n"
			//					+ "(a folded protein, which can be thought of as a \"spatial graph\".\n"
			//					+ "AlphaFold uses related sequences, MSA (multiple sequence alignment)\n"
			//					+ "feature engineering (the process of changing raw data into meaningful data),\n\n"
			//					+ "The second part of this process is optimization, which\n"
			//					+ "is the step which transforms the two matrices into 3D shapes.\n"
			//					+ "The structure is created through the iterative gradient descent method.\n"
			//					+ "To achieve this, the algorithm starts with a smooth 3D structure and updates the\n"
			//					+ "structures until it becomes as close to the output from the deep learning process.\"\n");
			//			
			//			//Info about neural networks
			//			c.print("\n\nPress a key to move on to the next page");
			//			c.drawImage(pngneural, 830, 0, 750, 450, null); 
			//			c.drawImage(pngneural2, 830, 450, 750, 450, null); 
			//			
			//			Thread.sleep(5000);
			//			c.getChar();
			//			c.clear();
			//			
			//			
			//			c.print("\"Ohhh, so that's what it is.\" Not long after, the meeting comes to an end and\n"
			//					+ "you go back to your own office. While on the way to your office,\n"
			//					+ "the system starts speaking to you.");
			//			
			//			c.drawImage(pnglounge, 830, 10, 750, 900, null); 
			//			Thread.sleep(4000);
			//			
			//			c.print("\n\"These are two topics that will help you later on."
			//					+ "Which one do you want to learn about now?\n"
			//					+ "Your options are the CASP challenge or the Protein Folding problem\"\n"
			//					+ "(Press 1 = CASP Challenge, Press 2 = Protein Folding Problem)");
			//			
			//			c.drawImage(jpgCASP, 830, 0, 750, 450, null); 
			//			c.drawImage(jpgproteinfolding, 830, 450, 750, 450, null); 
			//			Thread.sleep(3000);
			//			userInput = c.readInt();
			//			
			//			//Decisions: CASP or Misfolding
			//			do {
			//
			//				if (userInput == 1) {
			//					c.print("\n\"The Critical Assessment of Protein Structure Prediction (CASP)\n"
			//							+ "gives researchers an opportunity to compare their structure prediction methods\n"
			//							+ "in a head-to-head competition. It started in 1994, and has become the\n"
			//							+ "gold standard for assessing predictive techniques. CASP is used to catalyse research"
			//							+ "\nand measure progress on the newest methods for improving the accuracy of predictions.\n\n"
			//							+ "The CASP organizers collect a hundred unpublished protein structures and\n"
			//							+ "challenge researchers to predict the structures based on their protein sequence.\n"
			//							+ "Ground truth would be the 100 set of proteins CASP picked compared to the predicted\n"
			//							+ "structures. The 90 Global Distance Test (GDT) is a metric that CASP uses to score,\n"
			//							+ "it is a scale from 0 - 100, a GDT over 90 would be a solution to the problem.\n");
			//					c.print("\nPress a key to move on to the next page");
			//					
			//					c.drawImage(GDT, 830, 0, 750, 900, null); 
			//					Thread.sleep(3000);
			//
			//					c.getChar();
			//					c.clear();
			//					
			//					c.print("\"That was a lot of information to take in.\n"
			//							+ "Can you give me a few minutes to digest that?” you say.\n"
			//							+ "Ignoring your request, system goes on about Protein Folding Problem.");
			//					
			//					c.print("\n\n\"Protein misfolding is a common occurrence throughout the lifetime of the cell.\n"
			//							+ "There are three main reasons for protein misfolding.\n"
			//							+ "First reason is that the person may have a certain mutation\n"
			//							+ "that alters an amino acid in the protein chain. Without that amino acid,\n"
			//							+ "it can be very difficult for the protein to fold properly.\n\n"
			//							+ "The second reason for misfolding could be simply because of an error.\n"
			//							+ "When proteins are created, there is a machine that forms the chains of amino acids.\n"
			//							+ "If the directions from the DNA to form these chains are read wrong,\n"
			//							+ "it can cause errors, leading to misfolding.\n\n"
			//							+ "The third reason behind misfolding is that \n"
			//							+ "proteins simply do not fold correctly 100% of the time.\n"
			//							+ "Conditions such as temperature and acidity can also impact the protein.\n"
			//							+ "Protein misfolding can affect the health of the cell.\n"
			//							+ "When proteins fail to fold to their proper shape,\n"
			//							+ "their functions can also be affected.\n"
			//							+ "\nThe misfolded protein can also be twisted into shapes\n"
			//							+ "that are unfavourable to its cellular environment.\n"
			//							+ "Protein misfolding causes several diseases such as\n"
			//							+ "Alzheimer’s, Parkinson’s, Huntington’s disease, or Diabetes.\"");
			//					
			//					c.print("\nPress a key to move on to the next page");
			//					
			//					c.drawImage(pngamino, 830, 0, 375, 450, null); 
			//					c.drawImage(mutation, 1205, 0, 375, 450, null); 
			//					c.drawImage(temperature, 830, 450, 375, 450, null); 
			//					c.drawImage(acid, 1205, 450, 375, 450, null); 
			//
			//					Thread.sleep(3000);
			//					
			//					c.getChar();
			//					c.clear();
			//					break;
			//
			//				} else if (userInput == 2) {
			//					
			//					c.print("\"Protein misfolding is a common occurrence throughout the lifetime of the cell.\n"
			//							+ "There are three main reasons for protein misfolding.\n"
			//							+ "First reason is that the person may have a certain mutation\n"
			//							+ "that alters an amino acid in the protein chain. Without that amino acid,\n"
			//							+ "it can be very difficult for the protein to fold properly.\n\n"
			//							+ "The second reason for misfolding could be simply because of an error.\n"
			//							+ "When proteins are created, there is a machine that forms the chains of amino acids,\n"
			//							+ "if the directions from the DNA to form these chains are read wrong,\n"
			//							+ "it can cause errors, leading to misfolding.\n\n"
			//							+ "The third reason behind misfolding is also because the\n"
			//							+ "proteins simply do not fold correctly 100% of the time.\n"
			//							+ "Conditions such as temperature and acidity can also impact the protein.\n"
			//							+ "Protein misfolding can affect the health of the cell.\n"
			//							+ "When proteins fail to fold to their proper shape,\n"
			//							+ "their functions can also be affected.\n"
			//							+ "\nThe misfolded protein can also be twisted into shapes\n"
			//							+ "that are unfavourable to its cellular environment.\n"
			//							+ "Protein misfolding causes several diseases such as\n"
			//							+ "Alzheimer’s, Parkinson’s, Huntington’s disease, or Diabetes.\"");
			//					
			//					c.print("\n\nPress a key to move on to the next page");
			//					c.drawImage(pngamino, 830, 0, 375, 450, null);
			//					c.drawImage(mutation, 1205, 0, 375, 450, null);
			//					c.drawImage(temperature, 830, 450, 375, 450, null);
			//					c.drawImage(acid, 1205, 450, 375, 450, null);
			//					Thread.sleep(3000);
			//					
			//					c.getChar();
			//					c.clear();
			//					
			//					//info about CASP that user learns through employee even though they did not ask for it
			//					c.print("While you're sitting in your office a young man comes in to introduce himself");
			//					c.print("\n\"Goodmorning sir! I am Loki the new intern.\n"
			//							+ "I heard about the AlphaFold project and\n"
			//							+ "how we might actually win the CASP challenge. We're all really excited\n"
			//							+ "and wish the best for our team\" \"Umm yeah, thank you.\n"
			//							+ "If you don't mind, tell me what you know about the CASP challenge"
			//							+ "\n\n\"Of course Sir. The Critical Assessment of protein Structure Prediction (CASP)\n"
			//							+ "gives researchers an opportunity to compare their structure prediction\n"
			//							+ "methods in a head-to-head competition. It started in 1994, and has become the \"\n" 
			//							+ "gold standard for assessing predictive techniques. CASP is used to catalyse research\n"
			//							+ "and measure progress on the newest methods for improving the accuracy of predictions."
			//							+ "\n\nThe CASP organizers collect a hundred unpublished protein structures\n"
			//							+ "and challenge researchers to predict the structures based on their protein sequence.\n"
			//							+ "Ground truth would be the 100 set of proteins\n"
			//							+ "CASP picked compared to the predicted structures.\n" 
			//							+ "The 90 Global Distance Test (GDT) is a metric that CASP uses to score,\n"
			//							+ "it is a scale from 0 - 100, a GDT over 90 would be a solution to the problem.\n\n");
			//
			//					c.print("\"Sorry if I droned on about it. I got a bit carried away\", Loki says shyly"
			//							+ "\n\"Don't worry, thank you for that information\","
			//							+ "you respond.\n\"Anytime sir!\", says Loki.");
			//					
			//					c.print("\n\nPress a key to move on to the next page");
			//					
			//					c.drawImage(GDT, 830, 0, 750, 900, null); 
			//					Thread.sleep(3000);
			//					c.getChar();
			//					c.clear();
			//					break;
			//				}
			//			
			//			} while (check(userInput) == true);
			//					
			//
			//			//User's in the office where the interview takes place
			//			c.print("You reach your office. As soon as you sit down in your chair to relax a bit,"
			//					+ "\nyour secretary comes in and says, \"You have a meeting today"
			//					+ "\nscheduled at 2pm with the newspaper journalist\"");
			//			c.print("\n\nIt's 1:55pm and someone knocks on the door. It seems that the interviewer"
			//					+ "\nhas arrived 5 minutes early. You let her inside and go to shake her hand,"
			//					+ "\n\"Hello, my name is Kimberly.\" \"Please have a seat.\"");
			//			c.print("\nKimberly asks \"Why is DeepMind working on this problem?"
			//					+ "\nWhy is the Protein Folding Problem so important?\" ");
			//			
			//			c.println("\n\nPress a key to move on to the next page");
			//			
			//			c.drawImage(jpgkimberly, 900, 10, 600, 400, null);
			//			Thread.sleep(2000);
			//			
			//			
			//		
			//			c.getChar();
			//			c.clear();
			//			c.println("After hearing the question you start to sweat, "
			//					+ "\nyou have to somehow escape, what do you do?");
			//
			//			c.println("Do you spill coffee on yourself and excuse yourself to the washroom where you"
			//					+ "\ncan ask the system about it or call over the alphafold team to explain"
			//					+ "\nthe problem since they have first-hand experience?"
			//					+ "(1 = spill coffee, 2 = ask teammates)");
			//			c.drawImage(pngspillCoffee, 900, 10, 600, 400, null);
			//			c.drawImage(jpgteam, 900, 450, 600, 400, null);
			//			Thread.sleep(2000);
			//			userInput = c.readInt();
			//			c.clear();
			//
			//			do {
			//				//interview incident 
			//				if (userInput == 1) {
			//
			//			
			//					c.println("\"Ouch!\" \"Are you okay?\" Kimberly asks as she stands up to get napkins."
			//							+ "\n\"No no its alright I'll just quickly go to the washroom."
			//							+ "\nI'll be back in a few minutes.\"");
			//					c.println("\nYou quickly make your way to the washroom, and check that there is no one around."
			//							+ "\nYou ask the system \"Can you help me respond to her?\"");
			//					c.println("\n\"Don't worry I can help you.\""
			//							+ "\nThe system starts to explain, as you wipe off your stain.");
			//					c.drawImage(pngspillCoffee, 900, 10, 600, 400, null);
			//					Thread.sleep(5000);
			//
			//					c.print("\n\"The Protein Folding Problem is the challenge of figuring out how the proteins"
			//							+ "\nfold to form intricate structures based on its sequence of amino acids."
			//							+ "\nThe structure is important because it determines the function of the protein."
			//							+ "\nFor example, if the structure of the protein is globular,"
			//							+ "\nit is likely used for transporting small molecules throughout your body."
			//							+ "\n\nIt is such a hard problem to solve because there are so many types of proteins"
			//							+ "\nthat humans have discovered. Right now, we know of over 200 million"
			//							+ "\nproteins, and all of the proteins have their own unique shapes."
			//							+ "\nThe way that proteins fold is dependent on the interaction between the"
			//							+ "\n20 different amino acids that make up the protein.");
			//					c.println("\nPress a key to learn a bit more");
			//					c.drawImage(jpgproteinfolding, 830, 10, 750, 700, null);
			//					Thread.sleep(2000);
			//					c.getChar();
			//				
			//					c.clear();
			//					c.print("Therefore, the possibilities are virtually limitless, which makes this problem "
			//							+ "\nextremely hard to solve. According to the acclaimed Levinthal's paradox, "
			//							+ "\nit would take longer than the age of the universe to go through "
			//							+ "\nevery combination of a typical protein’s structure\", the system explains. ");
			//					c.print("\nWith this new knowledge, you are ready to tackle Kimberly's question.\n"
			//							+ "\nYou head back to your office and reiterate the systems response to Kimberly. ");
			//					c.print("\nAfter you finish speaking, you notice Kim stop the recorder. "
			//							+ "\n\"Thanks for taking the time to answer a couple of questions, it was very informative. "
			//							+ "\nI can't wait to see what DeepMind has in store for us.\" Satisfied, Kimberly leaves. ");
			//					c.println("\n\nPress a key to move on to the next page");
			//					c.drawImage(jpgproteinfolding, 830, 10, 750, 700, null);
			//					Thread.sleep(2000);
			//					c.getChar();
			//					c.clear();
			//					break;
			//
			//				} else if (userInput == 2) {
			//					c.println("\"How about I call over the AlphaFold team since they have first hand experience\"");
			//					c.println("\n\"That would be great!\" Kim responds. "
			//							+ "\nYou gesture to your secretary and ask him to call over the AlphaFold Team.");
			//					c.println("\nPress a key to move on to the next page");
			//					c.getChar();
			//					c.clear();
			//					c.println("A few moments later the AlphaFold team arrives."
			//							+ "\nAfter a round of introductions the team leader Lucifer"
			//							+ "\nbegins explaining the significance of AlphaFold.");
			//					c.drawImage(jpgteam, 900, 10, 600, 400, null);
			//					Thread.sleep(5000);
			//					c.println("\n\"The Protein Folding Problem is the challenge of figuring out how the proteins fold"
			//							+ "\nto form intricate structures based on its sequence of amino acids."
			//							+ "\nThe structure is important because it determines the function of the protein. "
			//							+ "\nFor example, if the structure of the protein is globular, it is likely "
			//							+ "\nused for transporting other small molecules throughout your body. "
			//							+ "\nIt is such a hard problem to solve because there are so many types of proteins that "
			//							+ "\nhumans have discovered.\n\nRight now, we know of over 200 million proteins and more,"
			//							+ "\nand all of the proteins have their own unique shapes."
			//							+ "\nThe way that proteins fold is dependent on the interaction between the 20 different"
			//							+ "\namino acids that make up the protein.\n"
			//							+ "\nTherefore, the possibilities are virtually limitless,"
			//							+ "\nwhich makes this problem extremely hard to solve."
			//							+ "\nAccording to the acclaimed Levinthal's paradox, it would take longer than"
			//							+ "\nthe age of the universe to go through every combination of a typical"
			//							+ "\nprotein’s structure.\"");
			//					c.drawImage(jpgproteinfolding, 830, 10, 750, 700, null);
			//					Thread.sleep(2000);
			//					c.println("After hearing the explanation, Kimberly takes notes."
			//							+ "\n\n\"Thanks for taking the time to answer a couple of questions it was very informative."
			//							+ "\nI can't wait to see what DeepMind has in store for us!\" Satisfied, Kimberly leaves.");
			//					c.println("\nPress a key to move on to the next page");
			//					c.drawImage(jpgproteinfoldingpro, 830, 10, 750, 700, null);
			//					Thread.sleep(2000);
			//					c.getChar();
			//					c.clear();
			//					break;
			//				}
			//
			//
			//			} while (check(userInput) == true);
			//
			//			c.println("After Kimberly leaves, your secretary enters the office "
			//					+ "\n\"Sir, your next meeting is with the AlphaFold team.\" You follow your colleague "
			//					+ "\nout of your office through the building until you reach a glass door labelled "
			//					+ "\nAlphaFold Office. Your secretory drops you off here and goes back to his other duties. "
			//					+ "\nYou walk inside and are immediately swarmed by the team members." 
			//					+ "\n\n\"We figured out a way to successfully train the program!\"");
			//			c.println("You listen curiously as they start to explain"
			//					+ "\nthe newly found method of training AlphaFold.");
			//			c.println("\n\"AlphaFold is trained on 170,000 structures "
			//					+ "of proteins that are publicly available. "
			//					+ "\nIt uses the information it gathered from the database, "
			//					+ "\nincluding the amino acid sequences, to predict the structure"
			//					+ "\nof an unknown protein accurately.\"");
			//			c.print("\nPress a key to move on to the next page");
			//			c.drawImage(pngalphaoffice, 830, 10, 750, 900, null);
			//			Thread.sleep(5000);
			//			c.getChar();
			//			c.clear();
			//
			//			c.println("With all this new information you feel "
			//					+ "\nsuper powerful and have an urge to tell someone..."
			//					+ "\nThe first two people you see are an intern and your secretary."
			//					+ "\nWho do you choose to tell?\n"
			//					+ "(1 = secretary, 2 = intern)");
			//			c.drawImage(pngsecretary, 900, 20, 600, 400, null);
			//			c.drawImage(jpgintern, 900, 460, 600, 400, null);
			//			userInput = c.readInt();
			//			c.clear();

			do {
				//sharing incident oop
				if (userInput == 1) {
					c.print("With a smile on your face and a leap in your step, you skip to your secretary "
							+ "\n\"I come bearing good news! Our team has done it again! "
							+ "\nOur AlphaFold team has found a new successful way to train the system\"");

					c.print("\nYou notice an expression flicker over your secretary's face and continue "
							+ "\n\n\"Now with a large database, our system's knowledge of "
							+ "\n the protein structures has been broadened.\"");
					c.println("\n\nPress a key to move on to the next page");
					c.drawImage(pngsecretary, 900, 20, 600, 400, null);
					c.getChar();
					c.clear();

					c.print("After sharing all the information, you feel satisfied and go on to the lounge"
							+ "\nfor a lunch break. In the lounge you hear other colleagues talking"
							+ "\nabout an upcoming launch party. As you munch on your lunch you continue to"
							+ "\nshamelessly eavesdrop on their conversation and"
							+ "\nwrite down the date and time down in your phone notes.");

					c.print("\n\n\nExhausted from work, you head home. As soon as you get home, "
							+ "\nyou hit the bed and not long after you fall asleep. "
							+ "\nYou feel relieved that you are getting used to things at work and that"
							+ "\neverything has been going so smoothly at the company. "
							+ "\nBut, you cannot completely relax, as you get this feeling "
							+ "\nthat this is just the calm before the storm. ");
					c.println("");
					c.println("\nThe next morning, the outrageously loud ringtone of your phone wakes you up. "
							+ "\nAnnoyed, you pick up the call and realize that it is your secretary. " 
							+"\n\"We have an emergency at the company. Confidential information about AlphaFold "
							+ "\nhas been leaked to the media” your secretary hurriedly says. "
							+ "\nFully awake now, you tell your secretary that you will be there in 15 minutes. ");

					c.println("\n\nPress a key to continue");
					c.drawImage(pngloungeRoom, 830, 10, 750, 600, null);
					Thread.sleep(2000);
					c.drawImage(pngbedroom, 830, 10, 750, 600, null);
					Thread.sleep(2000);
					c.getChar();
					c.clear();


					c.println( "Out of nowhere, the system starts speaking, "
							+ "\n\"This was exactly what happened before. "
							+ "\nWe have to stop this before it gets out of hand. "
							+ "\nNow think, did you tell anyone about AlphaFold?\" "
							+ "\nYou try to recall your memory from the past few days and suddenly, "
							+ "\nyou think of the intern, Loki, and how you excitedly told him all about AlphaFold. "
							+ "\nWhen you reach your company, your secretary walks towards you "
							+ "\nand briefs you on what has happened. "
							+ "\nAs you walk into your office you notice a folder on your desk. Confused, "
							+ "\nyou open to see a flood of pictures fall onto your desk. \"What is this?\" ");
					c.drawImage(pngfolder, 830, 10, 680, 600, null);
					Thread.sleep(3000);

					c.print("\nYou look through to see that it is photos of the intern having tea with another man, ");
					c.print( "\n\"Chad, the CEO of our rival company has been seen with our intern. "
							+ "\nWe suspect it was him who leaked the information to the media.\" "
							+ "\nJust as the secretary finishes, you see the intern rushing towards you. "
							+ "\nYou get furious and give Loki a chance to explain himself. "
							+ "\nHowever, Loki does not manage to get a word out, as he starts crying from pressure. "
							+ "\nThinking that he is crying because of guilt, you tell the intern that he is fired. "
							+ "\nFortunately for you, your team manages to resolve this issue. "
							+ "\nNow, all there is to do is wait for the launch party. ");
					c.println("");
					c.println("\n\nPress a key to move on to the next page");

					c.drawImage(pngchadLoki, 830, 10, 750, 600, null);
					Thread.sleep(2000);
					c.getChar();
					c.clear();
					break;
				}
				//sharing with intern 
				else if (userInput == 2) {
					c.println("Deciding to give the new intern a chance, you head over to the nervous man "
							+ "\n\"Oh, hi sir, is there anything I can do for you?\" ");
					c.println("\n\"Hmm nothing that comes to mind, but I just learnt some fascinating news, "
							+ "\nwould you like to know?\" Curious, Loki asks, "
							+ "\n\"What is this fascinating news you talk about?\" "
							+ "\nYou go on to explain how AlphaFold is trained just as the team did to you. ");
					c.drawImage(jpgintern, 830, 10, 750, 600, null);

					c.println("\nAfter sharing all the information you feel satisfied and go on to the lounge for a "
							+ "\nlunch break. In the lounge you hear other colleagues talking about an "
							+ "\nupcoming launch party. As you munch on your lunch you continue to shamelessly "
							+ "\neavesdrop on their converstation and write down the "
							+ "\ndate and time down in your phone notes. ");

					c.println("The rest of the day goes well and eventually you reach the end of the work day. ");
					c.print("\nExhausted from work, you head home. As soon as you get home, "
							+ "\nyou hit the bed and not long after you fall asleep. "
							+ "\nThe next morning, an outrageously loud ringtone of your phone wakes you up. "
							+ "\nAnnoyed, you pick up the call and realize that it is your secretary. ");
					c.print("\nPress a key to move on to the next page ");

					c.drawImage(pngloungeRoom, 830, 10, 750, 900, null);
					c.drawImage(pngloungeRoom, 830, 10, 750, 700, null);
					Thread.sleep(3000);
					c.drawImage(pngbedroom, 830, 10, 750, 700, null);
					Thread.sleep(2000);
					c.getChar();
					c.clear();

					c.println("\"We have an emergency at the company. Confidential information about AlphaFold "
							+ "\nhas been leaked to the media\" your secretary hurriedly says. Fully awake now, "
							+ "\nyou tell your secretary that you will be there in 15 minutes. "
							+ "\nOut of nowhere, the system starts speaking, \"This was exactly what happened before. "
							+ "\nWe have to stop this before it gets out of hand. "
							+ "\nNow think, did you tell anyone about AlphaFold?\" You try to recall "
							+ "\nyour memory from the past few days and suddenly, you think of the intern, Loki, and "
							+ "\nhow you excitedly told him all about AlphaFold. ");
					c.println("\n\nPress a key to move on to the next page");
					c.getChar();
					c.clear();


					c.println("Feeling pretty confused, you tell the system about the intern. "
							+ "\nThe system tells you to contact the intern and call him at the company. "
							+ "\nYou do that while you get ready to head to the company. When you reach the company, "
							+ "\nyour secretary walks towards you and briefs you on what has happened. "
							+ "\nAs you walk into your office you notice a folder on your desk. Confused,"
							+ "\nyou open to see a flood of pictures fall onto your desk. \"What is this?\" ");
					c.drawImage(pngfolder, 830, 10, 680, 600, null);
					Thread.sleep(3000);

					c.print( "\nYou look through to see that it is photos of the intern having tea with another man, "
							+ "\n\"Chad, the CEO of our rival company has been seen with our intern. "
							+ "\nWe suspect it was him who leaked the information to the media.\" "
							+ "\n\nJust as the secretary finishes, you see the intern rushing towards you. "
							+ "\nYou get furious and give Loki a chance to explain himself. "
							+ "\nHowever, Loki does not manage to get a word out, as he starts crying from pressure. "
							+ "\nThinking that he is crying because of guilt, you tell the intern that he is fired. ");
					c.println("\nFortunately for you, your team manages to resolve this issue. "
							+ "\nNow, you just have to wait for the launch party. ");
					c.println("");
					c.println("\n\nPress a key to move on to the next page");
					c.drawImage(pngchadLoki, 830, 10, 750, 600, null);
					Thread.sleep(2000);
					c.getChar();
					c.clear();
					break;


				} while (check(userInput) == true);

				//moving forward to launch party
				c.print("AlphaFold is in its final stages of development and will be ready to launch soon. "
						+ "\nYour secretary reminds you of the upcoming party celebrating the "
						+ "\nrelease of the new-found technology. You go home and manage to find a suit. "
						+ "\nSomehow you manage to make yourself presentable and get picked "
						+ "\nup by a car ordered by your secretary.");
				c.println("\nYou arrive at the grand location and see many others like you in formal wear "
						+ "\nwalking inside the massive building. You walk inside and are "
						+ "\ninstantly cornered by people, “Hey, congratulations on AlphaFold. "
						+ "\nAmazing what your team has accomplished!” As you reply with a meek \"Thank you,\" "
						+ "\nyou become surrounded by more people giving their congrats. ");
				c.print("\nPress a key to move on to the next page");
				c.drawImage(jpglaunch, 830, 10, 760, 680, null);
				c.getChar();
				c.clear();

				//dr frank henely 
				c.print("You finally make your way to the drinks.");
				c.drawImage(pngdrinks, 830, 10, 600, 550, null);
				Thread.sleep(2000);
				c.print( "Grabbing a small drink of peach juice and a bite of biscuits."
						+ "\nYou start to finally relax, “Hello there,” startled, you look to the right where "
						+ "\nyou see a middle-aged man sipping his martini. \"It must be overwhelming with all "
						+ "\nthese people surrounding you at all times\", he nods "
						+ "\nhis head over to the crowd of people in the middle of the room. ");

				c.print("\n\"It's not too bad, it's not always every day that a company"
						+ "\ncan achieve such a great feat\", you congratulate yourself for that amazing save."
						+ "\n\"It really is amazing. I seemed to have forgotten to introduce myself."
						+ "\nDoctor Frank Henely from Johns Hopkins Hospital. We have a lot of patients"
						+ "\nwho suffer from Alzheimer’s and Parkinson's, this newfound technology is going to"
						+ "\ngreatly advance the medical field especially for these diseases\"."
						+ "\nHis eyes shine as he mentions AlphaFold. You manage small talk with Dr. Henely"
						+ "\nuntil you finally excuse yourself to the bathroom.");
				c.print("");
				c.print("\n\nPress a key to move on to the next page");
				c.drawImage(pngdrFrank, 830, 10, 600, 780, null);
				Thread.sleep(2000);
				c.drawImage(jpgblack, 830, 10, 600, 780, null);
				c.drawImage(jpgalz, 815, 10, 760, 400, null);
				c.drawImage(jpgparkinsons, 815, 450, 760, 400, null);
				c.getChar();
				c.clear();
				
				c.print("After locating a small corner in the building, you connect with the system,"
						+ "\n\"System, you have to help me. What was he talking about? I still"
						+ "\nhaven't learned about what exactly AlphaFold is going to do once"
						+ "\nit is released into the world!\". \nRelaxed, the System replies, \"Don’t worry,"
						+ "\nhere's what you need to know. With AlphaFold, eradication of neurological diseases"
						+ "\nsuch as Alzheimer’s and Parkinson's might become possible, since these diseases"
						+ "\nare known to be caused by the misfolding of proteins in your brain."
						+ "\nThis causes the creation of clumps of protein that then disrupts brain activity."
						+ "\nThe structure of the protein determines the function and nearly all diseases,"
						+ "\nincluding cancer and dementia, are related to how proteins function."
						+ "\nThe recipes of the proteins (genes) are encoded in our DNA, and an error"
						+ "\nfound in the genetic recipe can result in a malformed protein."
						+ "\nThis could result in disease or death, in fact many diseases are fundamentally"
						+ "\nlinked to proteins. Since AlphaFold can help predict how the protein is going to"
						+ "\nfold, we can gain a deeper understanding of diseases more quickly"
						+ "\nand can develop drugs to fight them. It will enable scientists"
						+ "\nto target and design new, effective cures for diseases more efficiently.\"");
				c.print("");
				c.print("\n\nPress a key to move on to the next page");
				c.drawImage(jpgcorner, 750, 10, 790, 630, null);
				c.getChar();
				c.clear();

				//protein folding with environment 
				c.print("\"Wow, that was a lot of information."
						+ "\nI didn’t realize how much impact this program will have on the medical field.\" "
						+ "\nYou reply in awe as you process the System's response.");
				c.println("\n\"Which is exactly why there are many people here tonight, all waiting to hear "
						+ "\nmore about the system that will change the world for the better.\""
						+ "\nThe System exclaims proudly, \"Now get out there.\" You make your way back into "
						+ "\nthe party and continue to mingle with people."
						+ "\n\"Hi, I’m Etil Mone from the National Geographic Magazine. Many of our viewers "
						+ "\nare excited to learn more about the environmental impacts of AlphaFold.\""
						+ "\nAs she stares at you expectantly, you start to grow nervous, you try to send the "
						+ "\nsystem a message, \"Umm, System, a little help here?\" "
						+ "\n\nThe System chuckles lightly as it replies, “Understanding protein folding will "
						+ "\nassist in protein design, which could unlock a tremendous number of benefits. "
						+ "\nFor example, advances in biodegradable enzymes, which can be enabled by protein "
						+ "\ndesign, could help manage pollutants like plastic and oil. Helping us break "
						+ "\ndown waste in ways that are more friendly to our environment. "
						+ "\nResearchers have already begun engineering bacteria to secrete proteins "
						+ "\nthat will make waste biodegradable, and easier to process."
						+ "\nUnderstanding different folds in a protein can help"
						+ "\nus determine how it will interact with different molecules, "
						+ "\nand then we can implement these findings into designing enzymes "
						+ "\nto break down pollutants and improving crop yields. \"");
				c.print("\nEtil smiles as she nods at your response,"
						+ "\n\"We are so excited to see what AlphaFold will do for the environment."
						+ "\nThank you so much for your time. Have a good night.\"");
				c.print("\n\nPress a key to move on to the next page");
				c.drawImage(jpgparty, 815, 10, 800, 700, null);
				Thread.sleep(2000);
				c.drawImage(jpgblack, 815, 10, 800, 750, null);
				c.drawImage(jpgetil, 930, 10, 650, 750, null);
				c.getChar();
				c.clear();
//__________________________________________________________________
				
				//kidnapping beginning 
				c.println("As the party nears the end of the night, you walk over to the food table."
						+ "\nYou place your drink down to nibble on some biscuits, "
						+ "\nbut when you look back to your glass, you notice "
						+ "\ntwo identical drinks placed next to each other. \"Ehh, five-second rule,\" "
						+ "\nyou shrug and pick the one closest to you, \"You might not want to do that,\" "
						+ "\nthe System yells. Startled, you place the drink back on the table \"Why? "
						+ "\nThe System sighs,\"In a mere few months, AlphaFold will successfully predict "
						+ "\nthe protein structure of a virus.\" Shocked, you reply, "
						+ "\n\"What virus, and why are you just telling me this now?\" "
						+ "\n\"Here I’ll sum it up for you, in a few months when a virus "
						+ "\ncommonly known as Covid-19 hits the world, DeepMind will take data from the "
						+ "\nblueprint of the Covid-19 virus. DeepMind will focus on the proteins "
						+ "\nthat were understudied but have the potential to become targets "
						+ "\nfor a vaccine, using AI. ");
				c.println("\nIt will predict the protein structures of many coronavirus proteins, "
						+ "\nsome being ORF8, and ORF3a. ORF8 antibodies played a significant role in "
						+ "\nidentifying COVID-19 samples at early points of the virus.\" "
						+ "\nSlowly, you raise the glass to your lips, \"And what does this have to do "
						+ "\nwith my drink?\" Sighing, the System replies, \"It can be transferred "
						+ "\nthrough saliva as well.\" You instantly put the drink back on the table, "
						+ "\n\"Okay, maybe I’ll just grab a new glass...\" \"Good decision\" the System murmurs. ");


				c.println("\nNeeding a break from talking to people, you go to the washroom. "
						+ "\nAs you’re washing your hands, you notice one of the bathroom "
						+ "\nstalls open and see your secretary come out. You quickly greet him and turn "
						+ "\nto leave the washroom. Just when you’re about to reach the exit, you feel something "
						+ "\nheavy hit your head and not long after, you see the "
						+ "\nworld darken as you lose consciousness. ");
				c.println("\nPress a key to find out what happens next...");
				c.drawImage(jpghandWash, 800, 10, 750, 700, null);
				Thread.sleep(2000);
				c.getChar();
				c.clear();

				//kidnapping accomplished 
				c.println("You wake up in a dark room tied to a chair. Confused and groggy, "
						+ "\nyou look around and see that the room is vacant except for a "
						+ "\ncheap light attached to the ceiling. \"You’re finally awake,\" a voice calls out "
						+ "\nfrom the dark. \"Who are you? What do you want from me? Is it because of the "
						+ "\nbiscuits I stole from before? They’re in my pockets. I can give them to you.\" "
						+ "\nYou hurriedly defend yourself as you feel the tight bind digging through your wrists. "
						+ "\n\"You don’t recognize me?\" you squint as a figure emerges from the dark. "
						+ "\n\"Hello Sir, is your memory better now?\" As you stare in disbelief at the man, "
						+ "\nyou feel a bitter taste in your mouth as you growl, \"You!?\" The man smirks as he "
						+ "\nreplies,\"Yes, me, I bet you never saw this coming. Who would have thought your "
						+ "\ntrusty secretary who follows your orders would ever go against "
						+ "\nyour decisions.\" You shake your head in confusion, "
						+ "\n\"But why, why would you do this Brad?\"");
				c.drawImage(pngdarkRoom, 830, 10, 800, 850, null);
				Thread.sleep(2000);

				//see loki
				c.clear();
				c.println("\nBefore he can respond, you hear a groan from the other side of the room. "
						+ "\nYou squint to see where the sound came from. Seeing you struggle, Brad smiles. "
						+ "\n\"Ohh, I forgot to tell you something else too\" he says, "
						+ "\nas he crosses the room to turn on the other light. As he turns on the light, "
						+ "\nyou see the source of the groan and shocked you stutter, \"Wh-hy i-s Lo-oki he-re? "
						+ "\nDo-n’t te-ll me..\"  \"Yes, Loki, the one you fired” Brad responds, reading your mind. "
						+ "\n\"So, you’re telling me, everything was planned: the evidence, Chad, me firing him? \""
						+ "\nyou respond, utterly shocked and disgusted.");
				c.println("\nPress a key to move on to the next page");
				c.drawImage(pngdarkRoom, 830, 10, 750, 700, null);
				Thread.sleep(2000);
				c.getChar();
				c.clear();

				c.print("you get shivers down your spine as your secretary cackles like a maniac."
						+ "\nHe says, \"For 5 years, I listened to you and followed you like a fool."
						+ "\nIf I hadn’t met Chad, I would not have realized my worth.\" \"Why Chad? "
						+ "\nHow could you do this to me?\" you ask. Brad, suddenly furious, screams "
						+ "\n\"Not everything is about you! You know what? Let me tell you something, "
						+ "\nChad is my *drumroll please* my long-lost twin brother\" *dun dun dun*. You gasp.");

				c.print("You stare at him in disbelief, \"You’re never gonna get away with this!\" "
						+ "\nSmiling, Brad pulls out a pen drive, \"I already have. "
						+ "\nThis pen drive has everything you have been working on for the last decade. "
						+ "\nJust wait until the media finds out, the prestigious CEO of DeepMind, has duped "
						+ "\neveryone.\" Desperate now, you try to escape from the binds. "
						+ "\n\"Well, I’ve got to go now. I have a press conference to get to, "
						+ "\nnow that our company's CEO has gone missing along "
						+ "\nwith his work that would have changed the world,\" Brad strolls out into the darkness "
						+ "\nleaving you bound to the chair, with the intern\n"
						+ "passed out on the room across from you. ");
				c.println("\nPress a key to move on to the next page");
				c.getChar();
				c.clear();
				c.print("Feeling defeated, you look around the room to see if there’s anything you can use to "
						+ "\nescape from the binds. Just then, the intern wakes up. "
						+ "\n\"I heard everything. I’m so sorry, I should’ve tried to tell you about your secretary "
						+ "\nbefore\" Loki says. \"Huh, wait, you knew everything?\" you ask confused. Loki responds, "
						+ "\n\"Yes, I heard your secretary talking to someone at the company one time. "
						+ "\nHe seemed pretty mad and so I quietly listened in on their conversation."
						+ "\nThat was when I found out about his plans. I was so shocked and wanted to tell "
						+ "\nyou about it but I had no evidence. So, for the next few days I did some "
						+ "\nresearch and found out that it was Chad who was helping him. I thought I could "
						+ "\nconvince Chad and so I went to meet him. Turns out I was tricked and "
						+ "\nbefore I realized it, I was fired from the company. It’s okay, I don’t blame you\"."
						+ "\nListening to Loki made you realize just how thorough Brad’s plans were, which scared you "
						+ "\nLoki sees you panic and reassures you. "
						+ "\nHe tells you not to worry and reveals his escape plan. ");
				c.print("\nPress a key to move on to the next page");
				c.drawImage(pngtied, 830, 10, 750, 700, null);
				Thread.sleep(2000);
				c.getChar();
				c.clear();
				c.print("\"I’ve been trapped here for days, so I know the area pretty well. Your secretary "
						+ "\ncomes in everyday through that door and by now, I’m pretty sure that’s the only "
						+ "\ndoor that we can exit through. We have 2 hours before he comes back and if we manage "
						+ "\nto escape by then, we should be safe. Can you check your pocket to see if "
						+ "\nyou have anything sharp that can cut through the ropes?\" Loki asks. "
						+ "\nYou use your elbows to check your pocket since your hands are tied and "
						+ "\nyou feel something there. \"Wait, I can feel something in my pocket but "
						+ "\nI can’t take it out\" you say. Loki responds, \"Hop here to me and I’ll take it out\"."
						+ "\nYou manage to get near Loki. Luckily, Loki’s hands can reach your pocket. "
						+ "\nHe takes out something from your pocket and you realize that "
						+ "\nit’s the original wallet of the CEO. Loki takes out a card, and shocked, you say "
						+ "\n\"Isn’t that one of those card pocket knives?\" \"YES!\" Loki screams happily. "
						+ "\nYou and Loki manage to cut through the ropes and you escape the room. ");
				c.println("\nPress a key to move on to the next page");
				c.drawImage(jpgdoor, 830, 10, 750, 700, null);
				Thread.sleep(2000);
				c.drawImage(jpgknife, 830, 10, 750, 700, null);
				Thread.sleep(2000);
				c.getChar();
				c.clear();
				c.print("As you’re running, you talk to the system, \"What do I do next?"
						+ "\nHow can I prove the secretary guilty?\" System smirks and says,"
						+ "\n\"Check your other pocket\". "
						+ "\nYou take out a pen from your pocket and suddenly you start to "
						+ "\nrealize just how smart the actual CEO was. \"Is this what I think it is?\" "
						+ "\nyou ask the system excitedly. System says, \"Yep, it’s a camcorder pen. "
						+ "\nNow, you have the evidence. Quickly call the police and head towards the "
						+ "\nprees conference to stop him\". ");
				c.drawImage(jpgpen, 830, 10, 750, 700, null);
				Thread.sleep(2000);
				c.println("You reach the press conference in time and stop your secretary and his twin Chad. "
						+ "\nJust then, the police arrive and they arrest them in front of everyone. "
						+ "\n\"Wait, what’s happening? Release us this instant!\" "
						+ "\nOne of the police officers restrains Chad as he tries to escape and says,"
						+ "\n\"Mr. Chad Fennedy, you have the right to remain silent. "
						+ "\nAnything you say can and will be used against you in a court of law.\" "
						+ "\nYou then watch as the police officers take away the Fennedy twins. ");
				c.println("\nIt's not over yet... press a key to move on to the next page");
				c.drawImage(jpgconference, 830, 10, 750, 700, null);
				Thread.sleep(2000);
				c.drawImage(jpgarrest, 800, 10, 750, 700, null);
				Thread.sleep(2000);
				c.getChar();
				c.clear();
				c.println("Feeling drained after the long day, "
						+ "\nyou sit down on one of the office chairs and doze off. "
						+ "\nYou successfully managed to save the CEO.");
				c.drawImage(jpgofficechair, 800, 10, 750, 700, null);
				Thread.sleep(2000);
				c.println("But, will you ever go back to your own body?");
				c.println("");

				c.println("Do you want to play again? (yes/no)");
				finalAns = c.getChar();
			} while (finalAns == 'y');

		}
	}


