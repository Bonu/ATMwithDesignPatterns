package edu.mum.cs.ds.ui;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AccountLogin extends JFrame implements ActionListener{
	private static final int FRAME_WIDTH = 800;
	private static final int FRAME_HEIGHT = 550;
	private static final int FRAME_X_ORIGIN = 150;
	private static final int FRAME_Y_ORIGIN = 250;
	private static final int BUTTON_WIDTH = 20;
	private static final int BUTTON_HEIGHT = 15;
	private JButton loginButton, resetButton;
	GridLayout grid = new GridLayout(2, 2, 10, 10);
	
	public JTextField[] jTextFields;
	public String[] labelsStrings = {"Account Number", "Pin Number"};
	private static final int ACCOUNTNUMBER=0, PINNUMBER=1;
	
	public double count=0;

	public static void main(String[] args) {
		AccountLogin frame = new AccountLogin();
		frame.setVisible(true);
	}
	public AccountLogin()
	{
		Container contentPane = getContentPane( );
		jTextFields = new JTextField[labelsStrings.length];

        //set the frame properties
        setSize      ( FRAME_WIDTH, FRAME_HEIGHT );
        setResizable ( false );
        setTitle     ( "WELCOME TO XYZ BANK" );
        setLocation  ( FRAME_X_ORIGIN, FRAME_Y_ORIGIN );
        
        
        contentPane = getContentPane( );
        contentPane.setLayout( grid );
        contentPane.setBackground( Color.GRAY );

        //set the content pane properties
        //contentPane.setLayout( null );
        //contentPane.setBackground( Color.white );
        
        JPanel jp = new JPanel();
        jp = getJPanel(ACCOUNTNUMBER,10,10);
        contentPane.add(jp);
        
        jp = getJPanel(PINNUMBER,10,10);
        contentPane.add(jp);
        
        loginButton = new JButton("SUBMIT");

        loginButton.setBounds(10, 12, BUTTON_WIDTH,  BUTTON_HEIGHT);
        contentPane.add(loginButton);
        
        resetButton = new JButton("RESET");

        resetButton.setBounds(60, 20, BUTTON_WIDTH,  BUTTON_HEIGHT);
        contentPane.add(resetButton);
       
        /*jTextFields[ACCOUNTNUMBER].addActionListener(new mailHandler());
        jTextFields[PINNUMBER].addActionListener(new poundHandler());
       jTextFields[GALLON].addActionListener(new gallonHandler());
        jTextFields[FARENHIEIT].addActionListener(new farenheitHandler());
*/
        ButtonHandler handler = new ButtonHandler();
        loginButton.addActionListener(handler);
        resetButton.addActionListener(handler);
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        
	}
	private JPanel getJPanelH(int index,int X,int Y){
		JPanel jPanel = new JPanel();
		jPanel.setLayout(grid);
        jPanel.setBounds(X, Y, 280, 60);
        JLabel jLabel = new JLabel();
        jLabel.setBounds(12, 12, 250, 25);
        jLabel.setText(labelsStrings[index]);
        jTextFields[index]=new JTextField();
        jTextFields[index].setBounds(80, 12, 180, 25);
        jPanel.add(jLabel);
        jPanel.add(jTextFields[index]);
        
        return jPanel;
	}
	
	private JPanel getJPanel(int index,int X,int Y){
		JPanel jPanel = new JPanel();
		jPanel.setLayout(grid);
        jPanel.setBounds(X, Y, 150, 60);
        JLabel jLabel = new JLabel();
        jLabel.setBounds(12, 12, 100, 25);
        jLabel.setText(labelsStrings[index]);
        jTextFields[index]=new JTextField();
        jTextFields[index].setBounds(12, 30, 100, 25);
        jPanel.add(jLabel);
        jPanel.add(jTextFields[index]);
        
        return jPanel;
	}
	
	
	/*public class mailHandler implements ActionListener{
		public void actionPerformed(ActionEvent event)
		{
			count = Integer.parseInt(jTextFields[MILE].getText()) *1.60934;
			jTextFields[kILOMETER].setText("" + String.format("%.4f", count));
			//System.out.println(count);
			
		}
	}
	
	public class poundHandler implements ActionListener{
		public void actionPerformed(ActionEvent event)
		{
			count = Integer.parseInt(jTextFields[POUND].getText()) *0.4535;
			jTextFields[KILOGRAM].setText("" + String.format("%.4f", count));
		
		}
	}
	public class gallonHandler implements ActionListener{
		public void actionPerformed(ActionEvent event)
		{
			count = Integer.parseInt(jTextFields[GALLON].getText()) *3.78541;
			jTextFields[LITER].setText("" + String.format("%.4f", count));
		}
	}
	public class farenheitHandler implements ActionListener{
		public void actionPerformed(ActionEvent event)
		{
			count = (Integer.parseInt(jTextFields[FARENHIEIT].getText())-32) * 5/9;
			jTextFields[CENTRIGRATE].setText("" + String.format("%.4f", count));
			
		}
		}
		*/


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	class ButtonHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			if (e.getSource() instanceof JButton) {
				JButton clickedButton = (JButton) e.getSource();
				if (clickedButton == loginButton){
					//TelephoneNumber  ln = new TelephoneNumber ();
					//String number = ln.perform(jTextFields[STRING].getText());
					//jTextFields[TELEPHONE].setText(number);  
				}
				else{
					jTextFields[ACCOUNTNUMBER].setText("");  
					jTextFields[PINNUMBER].setText("");
				}
				
			}
			
		}
	}
}