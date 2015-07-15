package edu.mum.cs.ds.atm.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ATMInsertCard {

	private JFrame frame;
	private JTextField txtAccountNo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ATMInsertCard window = new ATMInsertCard();
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
	public ATMInsertCard() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 597, 767);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblAccountNo = new JLabel("Insert your ATM card");
		frame.getContentPane().add(lblAccountNo, BorderLayout.WEST);
		
		txtAccountNo = new JTextField();
		frame.getContentPane().add(txtAccountNo, BorderLayout.CENTER);
		txtAccountNo.setColumns(1);
	}

}
