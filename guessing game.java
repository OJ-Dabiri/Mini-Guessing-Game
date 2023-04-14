import javax.swing.*;

public class NumberGame {
   public static void main(String[] args) {
       int computerNumber = (int) (Math.random()*100 + 1);
       int userAnswer = 0;
       System.out.println("The correct answer is " + computerNumber);
        int count = 1;

       while (userAnswer != computerNumber)
       {
           String response = JOptionPane.showInputDialog(null,
               "guess the number between 1 and 100", "Number Game", 3);
           userAnswer = Integer.parseInt(response);
           JOptionPane.showMessageDialog(null, ""+ determineGuess(userAnswer, computerNumber, count));
           count++;
       }  
   }

   public static String checkGuess(int userAnswer, int computerNumber, int count){
       if (userAnswer <=0 || userAnswer >100) {
           return "Your guess is invalid (Enter a number between 1 and 100)";
       }
       else if (userAnswer == computerNumber ){
           return "You are Correct!\nTotal Guesses used: " + count;
       }
       else if (userAnswer > computerNumber) {
           return "Your number is too high, guess again.\nTry Number: " + count;
       }
       else if (userAnswer < computerNumber) {
           return "Your number is too low, guess again.\nTry Number: " + count;
       }
       else {
           return "You are incorrect incorrect :(, try again\nTry Number: " + count;
   	}
   }
}