package edu.mum.cs.ds.atm.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Keyboard {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Keyboard window = new Keyboard();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Keyboard() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(240, 240, 240));
		frame.setBounds(100, 100, 424, 508);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Keyboard");
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JButton btn1 = new JButton("1");
		GridBagConstraints gbc_btn1 = new GridBagConstraints();
		gbc_btn1.insets = new Insets(0, 0, 5, 5);
		gbc_btn1.gridx = 3;
		gbc_btn1.gridy = 2;
		frame.getContentPane().add(btn1, gbc_btn1);
		
		JButton btn2 = new JButton("2");
		GridBagConstraints gbc_btn2 = new GridBagConstraints();
		gbc_btn2.insets = new Insets(0, 0, 5, 5);
		gbc_btn2.gridx = 5;
		gbc_btn2.gridy = 2;
		frame.getContentPane().add(btn2, gbc_btn2);
		
		JButton btn3 = new JButton("3");
		GridBagConstraints gbc_btn3 = new GridBagConstraints();
		gbc_btn3.insets = new Insets(0, 0, 5, 0);
		gbc_btn3.gridx = 7;
		gbc_btn3.gridy = 2;
		frame.getContentPane().add(btn3, gbc_btn3);
		
		JButton btn4 = new JButton("4");
		GridBagConstraints gbc_btn4 = new GridBagConstraints();
		gbc_btn4.insets = new Insets(0, 0, 5, 5);
		gbc_btn4.gridx = 3;
		gbc_btn4.gridy = 4;
		frame.getContentPane().add(btn4, gbc_btn4);
		
		JButton btn5 = new JButton("5");
		GridBagConstraints gbc_btn5 = new GridBagConstraints();
		gbc_btn5.insets = new Insets(0, 0, 5, 5);
		gbc_btn5.gridx = 5;
		gbc_btn5.gridy = 4;
		frame.getContentPane().add(btn5, gbc_btn5);
		
		JButton btn6 = new JButton("6");
		GridBagConstraints gbc_btn6 = new GridBagConstraints();
		gbc_btn6.insets = new Insets(0, 0, 5, 0);
		gbc_btn6.gridx = 7;
		gbc_btn6.gridy = 4;
		frame.getContentPane().add(btn6, gbc_btn6);
		
		JButton btn7 = new JButton("7");
		GridBagConstraints gbc_btn7 = new GridBagConstraints();
		gbc_btn7.insets = new Insets(0, 0, 5, 5);
		gbc_btn7.gridx = 3;
		gbc_btn7.gridy = 6;
		frame.getContentPane().add(btn7, gbc_btn7);
		
		JButton btn8 = new JButton("8");
		GridBagConstraints gbc_btn8 = new GridBagConstraints();
		gbc_btn8.insets = new Insets(0, 0, 5, 5);
		gbc_btn8.gridx = 5;
		gbc_btn8.gridy = 6;
		frame.getContentPane().add(btn8, gbc_btn8);
		
		JButton btn9 = new JButton("9");
		GridBagConstraints gbc_btn9 = new GridBagConstraints();
		gbc_btn9.insets = new Insets(0, 0, 5, 0);
		gbc_btn9.gridx = 7;
		gbc_btn9.gridy = 6;
		frame.getContentPane().add(btn9, gbc_btn9);
		
		JButton btnDot = new JButton(".");
		GridBagConstraints gbc_btnDot = new GridBagConstraints();
		gbc_btnDot.insets = new Insets(0, 0, 5, 5);
		gbc_btnDot.gridx = 3;
		gbc_btnDot.gridy = 8;
		frame.getContentPane().add(btnDot, gbc_btnDot);
		
		JButton button_9 = new JButton("0");
		GridBagConstraints gbc_button_9 = new GridBagConstraints();
		gbc_button_9.insets = new Insets(0, 0, 5, 5);
		gbc_button_9.gridx = 5;
		gbc_button_9.gridy = 8;
		frame.getContentPane().add(button_9, gbc_button_9);
		
		JButton btnHash = new JButton("#");
		GridBagConstraints gbc_btnHash = new GridBagConstraints();
		gbc_btnHash.insets = new Insets(0, 0, 5, 0);
		gbc_btnHash.gridx = 7;
		gbc_btnHash.gridy = 8;
		frame.getContentPane().add(btnHash, gbc_btnHash);
		
		JButton btnEnter = new JButton("Enter");
		GridBagConstraints gbc_btnEnter = new GridBagConstraints();
		gbc_btnEnter.insets = new Insets(0, 0, 0, 5);
		gbc_btnEnter.gridx = 3;
		gbc_btnEnter.gridy = 10;
		frame.getContentPane().add(btnEnter, gbc_btnEnter);
		
		JButton btnCencel = new JButton("Cencel");
		GridBagConstraints gbc_btnCencel = new GridBagConstraints();
		gbc_btnCencel.gridx = 7;
		gbc_btnCencel.gridy = 10;
		frame.getContentPane().add(btnCencel, gbc_btnCencel);
		
		//ButtonHandler handler = new ButtonHandler();
		JButton handler = new JButton();
		
	}

}
