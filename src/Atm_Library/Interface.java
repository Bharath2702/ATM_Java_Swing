package Atm_Library;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;

public class Interface extends Cash_Withdraw  {

	JFrame Interface_frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	
		GraphicsEnvironment graphics =
			      GraphicsEnvironment.getLocalGraphicsEnvironment();
			      GraphicsDevice device = graphics.getDefaultScreenDevice();
			      System.out.println(device);
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface window = new Interface();
					window.Interface_frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Interface_frame = new JFrame("Main Page");
		Interface_frame.getContentPane().setBackground(new Color(47, 79, 79));
		Interface_frame.getContentPane().setForeground(SystemColor.desktop);
		Interface_frame.setForeground(Color.black);
		Interface_frame.setBounds(100, 100, 1208, 775);
		Interface_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Interface_frame.getContentPane().setLayout(null);
		
		
		JButton btnNewButton = new JButton("Cash Withdraw");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Cash_Withdraw c = new Cash_Withdraw();
				c.Cash_frame.setVisible(true);
				Interface_frame.dispose();
			
				
			
							
				
			}
		});
		btnNewButton.setFont(new Font("Segoe UI Semibold", Font.BOLD, 25));
		btnNewButton.setBounds(403, 250, 237, 36);
		Interface_frame.getContentPane().add(btnNewButton);
		
		JButton btnDeposit = new JButton("Deposit");
		btnDeposit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Deposit obj = new Deposit();
				obj.Deposit_frame.setVisible(true);
				Interface_frame.dispose();
				
			}
		});
		btnDeposit.setFont(new Font("Segoe UI Semibold", Font.BOLD, 25));
		btnDeposit.setBounds(403, 356, 237, 36);
		Interface_frame.getContentPane().add(btnDeposit);
		
		JButton btnBalanceEnquiry = new JButton("Balance Enquiry");
		btnBalanceEnquiry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Balance_Details objBalance_Enquiry = new Balance_Details();
				objBalance_Enquiry.balance_frame.setVisible(true);
				Interface_frame.dispose();
				
			}
		});
		btnBalanceEnquiry.setFont(new Font("Segoe UI Semibold", Font.BOLD, 25));
		btnBalanceEnquiry.setBounds(403, 461, 230, 36);
		Interface_frame.getContentPane().add(btnBalanceEnquiry);
		
		JButton btnChangePin = new JButton("Change Pin");
		btnChangePin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Change_pin objChange_pin = new Change_pin();
				objChange_pin.pin_frame.setVisible(true);
				Interface_frame.dispose();
			}
		});
		btnChangePin.setFont(new Font("Segoe UI Semibold", Font.BOLD, 25));
		btnChangePin.setBounds(850, 461, 237, 36);
		Interface_frame.getContentPane().add(btnChangePin);
		
		JLabel lblNewLabel_1 = new JLabel("Choose Transaction");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 25));
		lblNewLabel_1.setBounds(627, 131, 342, 27);
		Interface_frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnQuickWithdraw = new JButton("Quick Withdraw");
		btnQuickWithdraw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Quick_Withdraw objQuick_Withdraw = new Quick_Withdraw();
				objQuick_Withdraw.Quick_Withdraw_frame.setVisible(true);
				Interface_frame.dispose();
				
			}
		});
		btnQuickWithdraw.setFont(new Font("Segoe UI Semibold", Font.BOLD, 25));
		btnQuickWithdraw.setBounds(850, 250, 237, 36);
		Interface_frame.getContentPane().add(btnQuickWithdraw);
		
		JButton btnStatement = new JButton("Statement");
		btnStatement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Statement_b obj = new  Statement_b();
				obj.Statement_frame.setVisible(true);
				Interface_frame.dispose();
 				
			}
		});
		btnStatement.setFont(new Font("Segoe UI Semibold", Font.BOLD, 25));
		btnStatement.setBounds(850, 356, 237, 36);
		Interface_frame.getContentPane().add(btnStatement);
	}
}
