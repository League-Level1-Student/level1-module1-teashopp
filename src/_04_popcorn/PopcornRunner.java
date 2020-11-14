package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornRunner {

	public static void main(String[] args) {
		
		String flavor = JOptionPane.showInputDialog("Give me a flavor of popcorn:");
		String cooktime = JOptionPane.showInputDialog("How many minutes do you want to cook it for?");
		int cooktimeint = Integer.parseInt(cooktime);
				
		Popcorn pop = new Popcorn(flavor);
		
		Microwave mike = new Microwave();
		
		mike.putInMicrowave(pop);
		mike.startMicrowave();
		mike.startMicrowave();
		
		pop.eat();
		pop.applyHeat();
		
	}
	
}
