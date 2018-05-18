import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
        int score = 0;
        String key = "incorrectly";
        
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
      String answer  =  JOptionPane.showInputDialog("Which word in the dictionary is spelled incorrectly?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
    if(answer.equals(key)) {
    	JOptionPane.showMessageDialog(null, "correct");
    score++;
    //score= score+2;
    //score+=2;
		
    }
		// 5. Otherwise, say "wrong" and tell them the answer
    else {
    	JOptionPane.showMessageDialog(null, "wrong");
    }
		// 6. Add some more riddles
     answer  =  JOptionPane.showInputDialog("Who has hands but can not clap?");
      key = "clock";
    if(answer.equals(key)) {
    	

        	JOptionPane.showMessageDialog(null, "correct");
        score++;
    } else {
        	JOptionPane.showMessageDialog(null, "wrong");
        }
    
		// 2. Make a pop up to show the score.
	JOptionPane.showMessageDialog(null, score);
	}
}

