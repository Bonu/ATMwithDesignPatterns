package edu.mum.cs.ds.atm.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Button;
import java.awt.Panel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;

public class DisplayWindow {

	private JFrame frame;
	private JTable table;
	private JTextField txtPIN;
	private JTextField txtAccountNumber;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DisplayWindow window = new DisplayWindow();
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
	public DisplayWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 826, 767);
		frame.setTitle("ATM Login");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaptionBorder);
		panel.setBounds(12, 13, 784, 373);
		frame.getContentPane().add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{231, 123, 116, 73, 0};
		gbl_panel.rowHeights = new int[]{22, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblInsertYourAtm = new JLabel("Insert your ATM Card");
		GridBagConstraints gbc_lblInsertYourAtm = new GridBagConstraints();
		gbc_lblInsertYourAtm.anchor = GridBagConstraints.EAST;
		gbc_lblInsertYourAtm.insets = new Insets(0, 0, 5, 5);
		gbc_lblInsertYourAtm.gridx = 1;
		gbc_lblInsertYourAtm.gridy = 5;
		panel.add(lblInsertYourAtm, gbc_lblInsertYourAtm);
		
		txtAccountNumber = new JTextField();
		GridBagConstraints gbc_txtAccountNumber = new GridBagConstraints();
		gbc_txtAccountNumber.insets = new Insets(0, 0, 5, 5);
		gbc_txtAccountNumber.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAccountNumber.gridx = 2;
		gbc_txtAccountNumber.gridy = 5;
		panel.add(txtAccountNumber, gbc_txtAccountNumber);
		txtAccountNumber.setColumns(10);
		
		JLabel lblPinNumber = new JLabel("PIN Number:");
		GridBagConstraints gbc_lblPinNumber = new GridBagConstraints();
		gbc_lblPinNumber.insets = new Insets(0, 0, 0, 5);
		gbc_lblPinNumber.anchor = GridBagConstraints.EAST;
		gbc_lblPinNumber.gridx = 1;
		gbc_lblPinNumber.gridy = 7;
		panel.add(lblPinNumber, gbc_lblPinNumber);
		
		txtPIN = new JTextField();
		GridBagConstraints gbc_txtPIN = new GridBagConstraints();
		gbc_txtPIN.insets = new Insets(0, 0, 0, 5);
		gbc_txtPIN.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPIN.gridx = 2;
		gbc_txtPIN.gridy = 7;
		panel.add(txtPIN, gbc_txtPIN);
		txtPIN.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 389, 391, 169);
		frame.getContentPane().add(panel_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(12, 559, 391, 161);
		frame.getContentPane().add(panel_3);
		
		Panel panel_2 = new Panel();
		panel_2.setBackground(SystemColor.activeCaption);
		panel_2.setBounds(405, 389, 391, 321);
		frame.getContentPane().add(panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_2.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_2.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				txtAccountNumber.setText("1");
			}
		});
		GridBagConstraints gbc_btn1 = new GridBagConstraints();
		gbc_btn1.insets = new Insets(0, 0, 5, 5);
		gbc_btn1.gridx = 2;
		gbc_btn1.gridy = 1;
		panel_2.add(btn1, gbc_btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				
			}
		});
		GridBagConstraints gbc_btn2 = new GridBagConstraints();
		gbc_btn2.insets = new Insets(0, 0, 5, 5);
		gbc_btn2.gridx = 4;
		gbc_btn2.gridy = 1;
		panel_2.add(btn2, gbc_btn2);
		
		JButton btn3 = new JButton("3");
		GridBagConstraints gbc_btn3 = new GridBagConstraints();
		gbc_btn3.insets = new Insets(0, 0, 5, 5);
		gbc_btn3.gridx = 6;
		gbc_btn3.gridy = 1;
		panel_2.add(btn3, gbc_btn3);
		
		JButton btn4 = new JButton("4");
		GridBagConstraints gbc_btn4 = new GridBagConstraints();
		gbc_btn4.insets = new Insets(0, 0, 5, 5);
		gbc_btn4.gridx = 2;
		gbc_btn4.gridy = 3;
		panel_2.add(btn4, gbc_btn4);
		
		JButton btn5 = new JButton("5");
		GridBagConstraints gbc_btn5 = new GridBagConstraints();
		gbc_btn5.insets = new Insets(0, 0, 5, 5);
		gbc_btn5.gridx = 4;
		gbc_btn5.gridy = 3;
		panel_2.add(btn5, gbc_btn5);
		
		JButton btn6 = new JButton("6");
		GridBagConstraints gbc_btn6 = new GridBagConstraints();
		gbc_btn6.insets = new Insets(0, 0, 5, 5);
		gbc_btn6.gridx = 6;
		gbc_btn6.gridy = 3;
		panel_2.add(btn6, gbc_btn6);
		
		JButton btn7 = new JButton("7");
		GridBagConstraints gbc_btn7 = new GridBagConstraints();
		gbc_btn7.insets = new Insets(0, 0, 5, 5);
		gbc_btn7.gridx = 2;
		gbc_btn7.gridy = 5;
		panel_2.add(btn7, gbc_btn7);
		
		JButton btn8 = new JButton("8");
		GridBagConstraints gbc_btn8 = new GridBagConstraints();
		gbc_btn8.insets = new Insets(0, 0, 5, 5);
		gbc_btn8.gridx = 4;
		gbc_btn8.gridy = 5;
		panel_2.add(btn8, gbc_btn8);
		
		JButton btn9 = new JButton("9");
		GridBagConstraints gbc_btn9 = new GridBagConstraints();
		gbc_btn9.insets = new Insets(0, 0, 5, 5);
		gbc_btn9.gridx = 6;
		gbc_btn9.gridy = 5;
		panel_2.add(btn9, gbc_btn9);
		
		JButton btnDot = new JButton(".");
		GridBagConstraints gbc_btnDot = new GridBagConstraints();
		gbc_btnDot.anchor = GridBagConstraints.NORTH;
		gbc_btnDot.insets = new Insets(0, 0, 5, 5);
		gbc_btnDot.gridx = 2;
		gbc_btnDot.gridy = 7;
		panel_2.add(btnDot, gbc_btnDot);
		
		JButton btn0 = new JButton("0");
		GridBagConstraints gbc_btn0 = new GridBagConstraints();
		gbc_btn0.insets = new Insets(0, 0, 5, 5);
		gbc_btn0.gridx = 4;
		gbc_btn0.gridy = 7;
		panel_2.add(btn0, gbc_btn0);
		
		JButton btnHash = new JButton("#");
		GridBagConstraints gbc_btnHash = new GridBagConstraints();
		gbc_btnHash.insets = new Insets(0, 0, 5, 5);
		gbc_btnHash.gridx = 6;
		gbc_btnHash.gridy = 7;
		panel_2.add(btnHash, gbc_btnHash);
		
		JButton btnEnter = new JButton("Enter");
		GridBagConstraints gbc_btnEnter = new GridBagConstraints();
		gbc_btnEnter.insets = new Insets(0, 0, 5, 5);
		gbc_btnEnter.gridx = 2;
		gbc_btnEnter.gridy = 9;
		panel_2.add(btnEnter, gbc_btnEnter);
		
		JButton btnCancel = new JButton("Cancel");
		GridBagConstraints gbc_btnCancel = new GridBagConstraints();
		gbc_btnCancel.insets = new Insets(0, 0, 5, 5);
		gbc_btnCancel.gridx = 6;
		gbc_btnCancel.gridy = 9;
		panel_2.add(btnCancel, gbc_btnCancel);
		

	}
}
