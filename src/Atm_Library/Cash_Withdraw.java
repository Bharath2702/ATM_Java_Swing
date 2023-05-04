package Atm_Library;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JProgressBar;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class Cash_Withdraw {

	JFrame Cash_frame;
	private JTextField withdraw;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cash_Withdraw window = new Cash_Withdraw();
					window.Cash_frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		});
	}

	/**
	 * Create the application.
	 */
	public Cash_Withdraw() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Cash_frame = new JFrame("Cash Withdraw");
		Cash_frame.getContentPane().setBackground(new Color(47, 79, 79));
		Cash_frame.setBounds(100, 100, 1212, 773);
		Cash_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Cash_frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Withdraw Amount");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.BOLD, 25));
		lblNewLabel.setBounds(655, 279, 322, 29);
		Cash_frame.getContentPane().add(lblNewLabel);
		
		withdraw = new JTextField();
		withdraw.setBounds(655, 358, 322, 38);
		Cash_frame.getContentPane().add(withdraw);
		withdraw.setColumns(10);
		
		JButton btnNewButton = new JButton("Withdraw");
		btnNewButton.setForeground(SystemColor.text);
		btnNewButton.setBackground(new Color(17, 131, 202));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					String uname = "root";
					String pwd = "";
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_database",uname,pwd);
					Statement st = con.createStatement();
					
					Login onLogin = new Login();
					PreparedStatement ps = con.prepareStatement("update customer_details set balance = balance - ? where username = ? " );
					ps.setString(1,withdraw.getText());
					ps.setString(2, onLogin.username);
					System.out.println(onLogin.username);
					int number = Integer.parseInt(withdraw.getText());
					
					if(number >= 500)
					{
						ps.executeUpdate();
						JOptionPane.showMessageDialog(null, "Rs: "+number+" Withdraw SuccessFully");
					}
					else {
						JOptionPane.showMessageDialog(null, "Withdraw UnsuccessFully ");
						JOptionPane.showMessageDialog(null, "Please Withdraw Rs: 500 or Above");
					}
					
					
					
				} catch (Exception e2 ) {
					// TODO: handle exception
				}
				
				
				
			}
		});
		btnNewButton.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		btnNewButton.setBounds(655, 444, 129, 29);
		Cash_frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("←");
		btnNewButton_1.setForeground(new Color(0, 0, 64));
		btnNewButton_1.setBackground(new Color(240, 240, 240));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Interface obj = new Interface();
				obj.Interface_frame.setVisible(true);
				Cash_frame.dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		btnNewButton_1.setBounds(10, 10, 99, 21);
		Cash_frame.getContentPane().add(btnNewButton_1);
	}
}
