import javax.swing.JOptionPane;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		// A simple guess number app
		
		// Sudo random numbers
		Random random = new Random();
		
		String suggestion;
			
		String name = JOptionPane.showInputDialog("Please!! Enter Your Name: ");
		int randomNumber = random.nextInt(100)+1;
		
		int userAnswer = 0;
		int attempts = 0;
		
		while(randomNumber != userAnswer) {
			userAnswer = Integer.parseInt(JOptionPane.showInputDialog(name + "\nPlease enter between 0 and 100\nAttempts: " + attempts));
			
			if(randomNumber != userAnswer) {
				if(randomNumber > userAnswer) {
					suggestion = "The correct answer is above your answer!!";
				} else {
					suggestion = "The correct answer is below your answer!!";
				}
				JOptionPane.showMessageDialog(null, "Oops. " +userAnswer+ " is wrong! Try again!!\n" + suggestion);
			}
			attempts++;
		}
	
		String message = "Hello " + name + "\n";
		message += "You win!!";
		message += "\nThe correct answer is : " + randomNumber;
		message += "\nYou win in " + attempts + " attempts";
		
		JOptionPane.showMessageDialog(null, message);

	}

}
