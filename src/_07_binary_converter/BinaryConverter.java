package _07_binary_converter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import javafx.beans.binding.When;

public class BinaryConverter implements ActionListener {
		
	JTextField answer = new JTextField(20);
	JLabel label = new JLabel();
	
	public void run() {
	
			JFrame frame = new JFrame();
			JPanel panel = new JPanel();

			frame.setVisible(true);
			frame.setSize(1000,1000);
			frame.add(panel);
			
			panel.setVisible(true);
			panel.setSize(900,900);
			panel.setName("panel");
			panel.add(button);
			panel.add(answer);
			panel.add(label);
			
			button.addActionListener(this);
			button.setText("Convert!");
			
	}
	
	JButton button = new JButton();
	
	String convert(String input) {
	    if(input.length() != 8){
	        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
	        return "-";
	    }
	    String binary = "[0-1]+";//must contain numbers in the given range
	    if (!input.matches(binary)) {
	        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
	        return "-";   
	    }
	    try {
	        int asciiValue = Integer.parseInt(input, 2);
	        char theLetter = (char) asciiValue;
	        return "" + theLetter;
	    } catch (Exception e) {
	        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
	        return "-";
	    }
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub		
		String ans = convert(answer.getText());
		
		label.setText(ans);
		//System.out.println(ans);
		
	}

}
