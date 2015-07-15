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
import javax.swing.SwingConstants;
import java.awt.SystemColor;

public class ChangePIN {

	private JFrame frame;
	private JTable table;
	private JTextField txtOldPIN;
	private JTextField txtNewPIN;
	private JTextField txtTxtreconfirmpin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChangePIN window = new ChangePIN();
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
	public ChangePIN() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 826, 767);
		frame.setTitle("PIN Change");
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
		
		JLabel lbloldPIN = new JLabel("Enter Old PIN");
		lbloldPIN.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lbloldPIN = new GridBagConstraints();
		gbc_lbloldPIN.anchor = GridBagConstraints.WEST;
		gbc_lbloldPIN.insets = new Insets(0, 0, 5, 5);
		gbc_lbloldPIN.gridx = 1;
		gbc_lbloldPIN.gridy = 3;
		panel.add(lbloldPIN, gbc_lbloldPIN);
		
		txtOldPIN = new JTextField();
		txtOldPIN.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_txtOldPIN = new GridBagConstraints();
		gbc_txtOldPIN.anchor = GridBagConstraints.NORTHWEST;
		gbc_txtOldPIN.insets = new Insets(0, 0, 5, 5);
		gbc_txtOldPIN.gridx = 2;
		gbc_txtOldPIN.gridy = 3;
		panel.add(txtOldPIN, gbc_txtOldPIN);
		txtOldPIN.setColumns(10);
		
		JLabel lblNewPIN = new JLabel("Enter New PIN");
		GridBagConstraints gbc_lblNewPIN = new GridBagConstraints();
		gbc_lblNewPIN.anchor = GridBagConstraints.WEST;
		gbc_lblNewPIN.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewPIN.gridx = 1;
		gbc_lblNewPIN.gridy = 5;
		panel.add(lblNewPIN, gbc_lblNewPIN);
		
		txtNewPIN = new JTextField();
		GridBagConstraints gbc_txtNewPIN = new GridBagConstraints();
		gbc_txtNewPIN.insets = new Insets(0, 0, 5, 5);
		gbc_txtNewPIN.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNewPIN.gridx = 2;
		gbc_txtNewPIN.gridy = 5;
		panel.add(txtNewPIN, gbc_txtNewPIN);
		txtNewPIN.setColumns(10);
		
		JLabel lblReconfirmNewPin = new JLabel("Reconfirm New PIN");
		GridBagConstraints gbc_lblReconfirmNewPin = new GridBagConstraints();
		gbc_lblReconfirmNewPin.anchor = GridBagConstraints.EAST;
		gbc_lblReconfirmNewPin.insets = new Insets(0, 0, 0, 5);
		gbc_lblReconfirmNewPin.gridx = 1;
		gbc_lblReconfirmNewPin.gridy = 7;
		panel.add(lblReconfirmNewPin, gbc_lblReconfirmNewPin);
		
		txtTxtreconfirmpin = new JTextField();
		GridBagConstraints gbc_txtTxtreconfirmpin = new GridBagConstraints();
		gbc_txtTxtreconfirmpin.insets = new Insets(0, 0, 0, 5);
		gbc_txtTxtreconfirmpin.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtTxtreconfirmpin.gridx = 2;
		gbc_txtTxtreconfirmpin.gridy = 7;
		panel.add(txtTxtreconfirmpin, gbc_txtTxtreconfirmpin);
		txtTxtreconfirmpin.setColumns(10);
		
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
		
		JButton button_11 = new JButton("1");
		GridBagConstraints gbc_button_11 = new GridBagConstraints();
		gbc_button_11.insets = new Insets(0, 0, 5, 5);
		gbc_button_11.gridx = 2;
		gbc_button_11.gridy = 1;
		panel_2.add(button_11, gbc_button_11);
		
		JButton button_10 = new JButton("2");
		GridBagConstraints gbc_button_10 = new GridBagConstraints();
		gbc_button_10.insets = new Insets(0, 0, 5, 5);
		gbc_button_10.gridx = 4;
		gbc_button_10.gridy = 1;
		panel_2.add(button_10, gbc_button_10);
		
		JButton button_9 = new JButton("3");
		GridBagConstraints gbc_button_9 = new GridBagConstraints();
		gbc_button_9.insets = new Insets(0, 0, 5, 5);
		gbc_button_9.gridx = 6;
		gbc_button_9.gridy = 1;
		panel_2.add(button_9, gbc_button_9);
		
		JButton button_8 = new JButton("4");
		GridBagConstraints gbc_button_8 = new GridBagConstraints();
		gbc_button_8.insets = new Insets(0, 0, 5, 5);
		gbc_button_8.gridx = 2;
		gbc_button_8.gridy = 3;
		panel_2.add(button_8, gbc_button_8);
		
		JButton button_7 = new JButton("5");
		GridBagConstraints gbc_button_7 = new GridBagConstraints();
		gbc_button_7.insets = new Insets(0, 0, 5, 5);
		gbc_button_7.gridx = 4;
		gbc_button_7.gridy = 3;
		panel_2.add(button_7, gbc_button_7);
		
		JButton button_6 = new JButton("6");
		GridBagConstraints gbc_button_6 = new GridBagConstraints();
		gbc_button_6.insets = new Insets(0, 0, 5, 5);
		gbc_button_6.gridx = 6;
		gbc_button_6.gridy = 3;
		panel_2.add(button_6, gbc_button_6);
		
		JButton button_5 = new JButton("7");
		GridBagConstraints gbc_button_5 = new GridBagConstraints();
		gbc_button_5.insets = new Insets(0, 0, 5, 5);
		gbc_button_5.gridx = 2;
		gbc_button_5.gridy = 5;
		panel_2.add(button_5, gbc_button_5);
		
		JButton button_4 = new JButton("8");
		GridBagConstraints gbc_button_4 = new GridBagConstraints();
		gbc_button_4.insets = new Insets(0, 0, 5, 5);
		gbc_button_4.gridx = 4;
		gbc_button_4.gridy = 5;
		panel_2.add(button_4, gbc_button_4);
		
		JButton button_3 = new JButton("9");
		GridBagConstraints gbc_button_3 = new GridBagConstraints();
		gbc_button_3.insets = new Insets(0, 0, 5, 5);
		gbc_button_3.gridx = 6;
		gbc_button_3.gridy = 5;
		panel_2.add(button_3, gbc_button_3);
		
		JButton button_2 = new JButton(".");
		GridBagConstraints gbc_button_2 = new GridBagConstraints();
		gbc_button_2.insets = new Insets(0, 0, 5, 5);
		gbc_button_2.gridx = 2;
		gbc_button_2.gridy = 7;
		panel_2.add(button_2, gbc_button_2);
		
		JButton button_1 = new JButton("0");
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.insets = new Insets(0, 0, 5, 5);
		gbc_button_1.gridx = 4;
		gbc_button_1.gridy = 7;
		panel_2.add(button_1, gbc_button_1);
		
		JButton button = new JButton("#");
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.insets = new Insets(0, 0, 5, 5);
		gbc_button.gridx = 6;
		gbc_button.gridy = 7;
		panel_2.add(button, gbc_button);
		
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
