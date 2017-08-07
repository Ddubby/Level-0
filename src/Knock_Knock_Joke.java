import javax.swing.JOptionPane;

public class Knock_Knock_Joke {
public static void main(String[] args) {
	

String str="Whos there?";
String answer=JOptionPane.showInputDialog("Knock, Knock");

if (answer.equalsIgnoreCase(str)) {
	JOptionPane.showMessageDialog(null, "Obnoxious Cow!");
JOptionPane.showMessageDialog(null, "MOOOOHHHH");
}




}
}
