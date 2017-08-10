import javax.swing.JOptionPane;

public class BieberFever {
public static void main(String[] args) {
for (int j = 0; j < 2; j++) {
	

	for (int i = 0; i < 3; i++) {
 speak("Baby");
}
if (j==1) {
	speak("No");
}	
else {
speak("Oh");
}
speak("I thought you'd always be mine");
}

}




static void speak(String words) {
	try {
		Runtime.getRuntime().exec("say " + words).waitFor();
	} catch (Exception e) {
		e.printStackTrace();
	}







}
















}
