package edu.mum.cs.ds.ui;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ATMLogin extends JFrame {

	private static final int FRAME_WIDTH    = 600;
    private static final int FRAME_HEIGHT   = 450;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;
    private static final int BUTTON_WIDTH  = 20;
    private static final int BUTTON_HEIGHT = 30;
    private static final String EMPTY_STRING = "";
    private static final String NEWLINE = System.getProperty("line.separator");
    private JButton loginButton;
    private JButton addReset;
    private JTextField accountNumber,pinNumber;
    private JLabel label1,label2;
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATMLogin frame = new ATMLogin();
		frame.setVisible(true);

	}
	public ATMLogin(){
		Container contentPane;

		GridLayout grid = new GridLayout(5, 4, 10, 10);
        setSize      (FRAME_WIDTH, FRAME_HEIGHT);
        setResizable (false);
        setTitle     ("WELCOME TO XYZ BANK");
        
        setLocation  (FRAME_X_ORIGIN, FRAME_Y_ORIGIN);

        contentPane = getContentPane( );
        contentPane.setLayout( grid );
        contentPane.setBackground( Color.white );

        label1 = new JLabel("Enter Account number:",JLabel.RIGHT);
        label1.setBounds(90, 155, 130, 25);
        label1.setAlignmentY(RIGHT_ALIGNMENT);
        contentPane.add(label1);
        
        accountNumber = new JTextField();
        accountNumber.setBounds(90, 155, 130, 25);
        contentPane.add(accountNumber);

        label2 = new JLabel("Enter PIN: ",JLabel.RIGHT);
        label2.setBounds(90, 155, 130, 25);
        contentPane.add(label2);
        
        pinNumber = new JTextField();
        pinNumber.setBounds(90, 155, 130, 25);
        contentPane.add(pinNumber);
        //avg.setEditable(true);

        loginButton = new JButton("Login");
        loginButton.setBounds(90, 190, BUTTON_WIDTH, BUTTON_HEIGHT);
        contentPane.add(loginButton);

        addReset = new JButton("Reset");
        addReset.setBounds(160, 190, BUTTON_WIDTH, BUTTON_HEIGHT);
        contentPane.add(addReset);

        ButtonHandler handler = new ButtonHandler();
        accountNumber.addActionListener(handler);
        addReset.addActionListener(handler);
        loginButton.addActionListener(handler);

         setDefaultCloseOperation( EXIT_ON_CLOSE );

	}
	
	class ButtonHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
	
			
	        if (event.getSource() instanceof JButton) {
	            JButton clickedButton = (JButton) event.getSource();
	
	            if (clickedButton == addReset) {//Same Addresses.Same object
	            	accountNumber.setText("");
	            	pinNumber.setText("");
	            	clearText();
	            	
	            	
	            } else {
	                System.exit(0);
	            }
	
	        }/* else { //the event source is inputLine
	            String value = accountNumber.getText();
	        	int convertedNumber = Integer.valueOf(value).intValue();
	            rs.put(convertedNumber);
	            String converted = String.valueOf(rs.getAverage());
	            avg.setText(converted);
	            addText(value);
	            
	        }*/
	    }
	}

    private void addText(String newText) {
        accountNumber.setText(EMPTY_STRING);
    }

    private void clearText( ) {
    	accountNumber.setText(EMPTY_STRING);
    }
    
    /*public class RunningStat {

	    private int count = 0;
	    private double average = 0.0;
	    
	    public void put(double value) {
	      count++;
	      average += (value - average) / count;
	    }

	    public double getAverage() {
	      return average;
	    }
	  }*/



}
