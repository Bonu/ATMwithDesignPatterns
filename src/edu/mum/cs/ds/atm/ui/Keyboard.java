package edu.mum.cs.ds.atm.ui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;

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
		
		JButton button = new JButton("1");
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.insets = new Insets(0, 0, 5, 5);
		gbc_button.gridx = 3;
		gbc_button.gridy = 2;
		frame.getContentPane().add(button, gbc_button);
		
		JButton button_1 = new JButton("2");
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.insets = new Insets(0, 0, 5, 5);
		gbc_button_1.gridx = 5;
		gbc_button_1.gridy = 2;
		frame.getContentPane().add(button_1, gbc_button_1);
		
		JButton button_2 = new JButton("3");
		GridBagConstraints gbc_button_2 = new GridBagConstraints();
		gbc_button_2.insets = new Insets(0, 0, 5, 0);
		gbc_button_2.gridx = 7;
		gbc_button_2.gridy = 2;
		frame.getContentPane().add(button_2, gbc_button_2);
		
		JButton button_3 = new JButton("4");
		GridBagConstraints gbc_button_3 = new GridBagConstraints();
		gbc_button_3.insets = new Insets(0, 0, 5, 5);
		gbc_button_3.gridx = 3;
		gbc_button_3.gridy = 4;
		frame.getContentPane().add(button_3, gbc_button_3);
		
		JButton button_4 = new JButton("5");
		GridBagConstraints gbc_button_4 = new GridBagConstraints();
		gbc_button_4.insets = new Insets(0, 0, 5, 5);
		gbc_button_4.gridx = 5;
		gbc_button_4.gridy = 4;
		frame.getContentPane().add(button_4, gbc_button_4);
		
		JButton button_5 = new JButton("6");
		GridBagConstraints gbc_button_5 = new GridBagConstraints();
		gbc_button_5.insets = new Insets(0, 0, 5, 0);
		gbc_button_5.gridx = 7;
		gbc_button_5.gridy = 4;
		frame.getContentPane().add(button_5, gbc_button_5);
		
		JButton button_6 = new JButton("7");
		GridBagConstraints gbc_button_6 = new GridBagConstraints();
		gbc_button_6.insets = new Insets(0, 0, 5, 5);
		gbc_button_6.gridx = 3;
		gbc_button_6.gridy = 6;
		frame.getContentPane().add(button_6, gbc_button_6);
		
		JButton button_7 = new JButton("8");
		GridBagConstraints gbc_button_7 = new GridBagConstraints();
		gbc_button_7.insets = new Insets(0, 0, 5, 5);
		gbc_button_7.gridx = 5;
		gbc_button_7.gridy = 6;
		frame.getContentPane().add(button_7, gbc_button_7);
		
		JButton button_8 = new JButton("9");
		GridBagConstraints gbc_button_8 = new GridBagConstraints();
		gbc_button_8.insets = new Insets(0, 0, 5, 0);
		gbc_button_8.gridx = 7;
		gbc_button_8.gridy = 6;
		frame.getContentPane().add(button_8, gbc_button_8);
		
		JButton button_10 = new JButton(".");
		GridBagConstraints gbc_button_10 = new GridBagConstraints();
		gbc_button_10.insets = new Insets(0, 0, 5, 5);
		gbc_button_10.gridx = 3;
		gbc_button_10.gridy = 8;
		frame.getContentPane().add(button_10, gbc_button_10);
		
		JButton button_9 = new JButton("0");
		GridBagConstraints gbc_button_9 = new GridBagConstraints();
		gbc_button_9.insets = new Insets(0, 0, 5, 5);
		gbc_button_9.gridx = 5;
		gbc_button_9.gridy = 8;
		frame.getContentPane().add(button_9, gbc_button_9);
		
		JButton button_11 = new JButton("#");
		GridBagConstraints gbc_button_11 = new GridBagConstraints();
		gbc_button_11.insets = new Insets(0, 0, 5, 0);
		gbc_button_11.gridx = 7;
		gbc_button_11.gridy = 8;
		frame.getContentPane().add(button_11, gbc_button_11);
		
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
	}

}
