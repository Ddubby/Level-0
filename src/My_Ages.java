import javax.swing.JOptionPane;

public class My_Ages {
	public static void main(String[] args) {
		String str; 
		for (int i = 0; i < 13; i++) {
			if (i==12) {
				str="am";
				
			}
			else{
str="was";				
				
				
			}	
			JOptionPane.showMessageDialog(null, "I "+str+" "+i);

		
		
		}
			
		
	}

}
