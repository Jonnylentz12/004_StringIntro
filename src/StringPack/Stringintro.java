package StringPack;

import javax.swing.JOptionPane;

public class Stringintro {

	public static void main(String[] args) {

		String msg = "";
		String varWord = "Boise";
		String goAgain = "No";
		Boolean runAgain = true;
		
		while (runAgain) {
		msg = "Please enter a string for us to test";
		varWord = JOptionPane.showInputDialog(msg);
		
		LearnStrings getIt = new LearnStrings(varWord);
		msg = "First char is: " + getIt.getFirstLetter();
		JOptionPane.showMessageDialog(null, msg);

		int lengthTest = getIt.getLength();
		msg = "Length = " + lengthTest;
		JOptionPane.showMessageDialog(null, msg);

		char lastLetter = getIt.getLastLetter();
		msg = "Last Letter is " + lastLetter;
		JOptionPane.showMessageDialog(null, msg);

		msg = "middle is " + getIt.getMiddle();
		JOptionPane.showMessageDialog(null, msg);


		
			msg = "Do you want to enter another word Y/N?";
			goAgain = JOptionPane.showInputDialog(msg);

			if (goAgain.equalsIgnoreCase("Y")) {
				msg = ("selection is Y or y");
				JOptionPane.showMessageDialog(null, msg);
				runAgain = true;
			} else if (goAgain.equalsIgnoreCase("n")) {
				msg = ("Goodbye");
				JOptionPane.showMessageDialog(null, msg);
				runAgain = false;
			} else if (goAgain.equalsIgnoreCase("yes")) {
				msg = ("selection is yes or Yes or YES");
				JOptionPane.showMessageDialog(null, msg);
				runAgain = true;
			} else if (goAgain.equalsIgnoreCase("no")) {
				msg = ("Goodbye");
				JOptionPane.showMessageDialog(null, msg);
				runAgain = false;
			} else {
				msg = ("sorry, I dont understand your input, " + "please try again");
				JOptionPane.showMessageDialog(null, msg);
			}
		
			System.out.println("Thank you, please play again soon");

		} // end of while
		
		
		/*while (runAgain) {
			msg = "Do you want to enter another word Y/N?";
			repeat = JOptionPane.showInputDialog(msg);

			if (runAgain.equalsIgnoreCase("Y")) {
				msg = ("selection is Y or y");
				JOptionPane.showMessageDialog(null, msg);
				runAgain = true;
			} else if (runAgain.equalsIgnoreCase("n")) {
				msg = ("selection is N or n");
				JOptionPane.showMessageDialog(null, msg);
				runAgain = false;
			} else if (runAgain.equalsIgnoreCase("yes")) {
				msg = ("selection is yes or Yes or YES");
				JOptionPane.showMessageDialog(null, msg);
				runAgain = true;
			} else if (runAgain.equalsIgnoreCase("no")) {
				msg = ("selection is no or No or NO");
				JOptionPane.showMessageDialog(null, msg);
				runAgain = false;
			} else {
				msg = ("sorry, I dont understand your input, " + "please try again");
				JOptionPane.showMessageDialog(null, msg);
			}
		}*/
		
		
		

		
	}

}
