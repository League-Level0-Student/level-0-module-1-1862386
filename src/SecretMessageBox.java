//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/**
 * Secret Message Box / Secure Messaging System
 * 
 * You want to leave a message on one of the Mac computers so that only your friend can read it.
 * You set up the passcode and the secret message. 
 * Your friend types in the passcode to retrieve the message.
 * 
 */

public class SecretMessageBox {

	public static void main(String[] args) {
		
	
	// 1. Set a password in a String variable
String pass ="Roshmil";
	// 2. Using a pop-up, ask the first person for a secret message and store it in a variable
 String secretMessage = JOptionPane.showInputDialog(null, "Type in a secret message");
	// 3. Now use a pop-up to tell the NEXT user that they can only see the secret message 
	//    if they can guess the passcode
String guess = JOptionPane.showInputDialog("You can only see the secret message if you can guess the password");
	// 4. If their guess matches the password, show them the secret message
if (guess = "Roshmil") {
	JOptionPane.showMessageDialog(null, );
}
	// 5. If the password does not match, pop-up "INTRUDER!!"

}
}