package edu.mum.cs.ds.atm.ui;

import java.awt.EventQueue;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ATMPIN {

	private JFrame frame;
	private JTextField txtPIN;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ATMPIN window = new ATMPIN();
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
	public ATMPIN() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 597, 767);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS));
		JLabel lblPIN = new JLabel("Insert PIN");
		frame.getContentPane().add(lblPIN);
		
		
		txtPIN = new JTextField();
		txtPIN.setText("sd");
		frame.getContentPane().add(txtPIN);
		txtPIN.setColumns(1);
		
	}

}
