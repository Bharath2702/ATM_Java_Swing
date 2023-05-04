package Atm_Library;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.SystemColor;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Quick_Withdraw {

	JFrame Quick_Withdraw_frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Quick_Withdraw window = new Quick_Withdraw();
					window.Quick_Withdraw_frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Quick_Withdraw() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Quick_Withdraw_frame = new JFrame("Quick Withdraw");
		Quick_Withdraw_frame.getContentPane().setBackground(new Color(47, 79, 79));
		Quick_Withdraw_frame.setBounds(100, 100, 1089, 750);
		Quick_Withdraw_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Quick_Withdraw_frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("500");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_database","root","");
					Statement st = con.createStatement();
					
					Login login = new Login();
					String uname = login.username;
					PreparedStatement ps = con.prepareStatement("update customer_details set balance = balance - 500 where username = ?");
					ps.setString(1, uname);
					ps.executeUpdate();
					JOptionPane.showMessageDialog(null, "Whithdraw Successfully");
					
					
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		});
		btnNewButton.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		btnNewButton.setBounds(432, 207, 103, 35);
		Quick_Withdraw_frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("1000");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_database","root","");
					Statement st = con.createStatement();
					
					Login login = new Login();
					String uname = login.username;
					PreparedStatement ps = con.prepareStatement("update customer_details set balance = balance - 1000 where username = ?");
					ps.setString(1, uname);
					ps.executeUpdate();
					JOptionPane.showMessageDialog(null, "Whithdraw Successfully");
					
					
				} catch (Exception e2) {
					e2.printStackTrace();
					
				}
			}
		});
		btnNewButton_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		btnNewButton_1.setBounds(432, 306, 103, 35);
		Quick_Withdraw_frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("1500");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_database","root","");
					Statement st = con.createStatement();
					
					Login login = new Login();
					String uname = login.username;
					PreparedStatement ps = con.prepareStatement("update customer_details set balance = balance - 1500 where username = ?");
					ps.setString(1, uname);
					ps.executeUpdate();
					JOptionPane.showMessageDialog(null, "Whithdraw Successfully");
					
					
				} catch (Exception e2) {
					e2.printStackTrace();
					
				}
			}
		});
		btnNewButton_2.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		btnNewButton_2.setBounds(432, 416, 103, 35);
		Quick_Withdraw_frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("2000");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_database","root","");
					Statement st = con.createStatement();
					
					Login login = new Login();
					String uname = login.username;
					PreparedStatement ps = con.prepareStatement("update customer_details set balance = balance - 2000 where username = ?");
					ps.setString(1, uname);
					ps.executeUpdate();
					JOptionPane.showMessageDialog(null, "Whithdraw Successfully");
					
					
				} catch (Exception e2) {
					e2.printStackTrace();
					
				}
			}
		});
		btnNewButton_3.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		btnNewButton_3.setBounds(432, 517, 103, 35);
		Quick_Withdraw_frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("2500");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_database","root","");
					Statement st = con.createStatement();
					
					Login login = new Login();
					String uname = login.username;
					PreparedStatement ps = con.prepareStatement("update customer_details set balance = balance - 2500 where username = ?");
					ps.setString(1, uname);
					ps.executeUpdate();
					JOptionPane.showMessageDialog(null, "Whithdraw Successfully");
					
					
				} catch (Exception e2) {
					e2.printStackTrace();
					
				}
			}
		});
		btnNewButton_4.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		btnNewButton_4.setBounds(803, 207, 103, 35);
		Quick_Withdraw_frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("3000");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_database","root","");
					Statement st = con.createStatement();
					
					Login login = new Login();
					String uname = login.username;
					PreparedStatement ps = con.prepareStatement("update customer_details set balance = balance - 3000 where username = ?");
					ps.setString(1, uname);
					ps.executeUpdate();
					JOptionPane.showMessageDialog(null, "Whithdraw Successfully");
					
					
				} catch (Exception e2) {
					e2.printStackTrace();
					
				}
			}
		});
		btnNewButton_5.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		btnNewButton_5.setBounds(803, 306, 103, 35);
		Quick_Withdraw_frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("3500");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_database","root","");
					Statement st = con.createStatement();
					
					Login login = new Login();
					String uname = login.username;
					PreparedStatement ps = con.prepareStatement("update customer_details set balance = balance - 3500 where username = ?");
					ps.setString(1, uname);
					ps.executeUpdate();
					JOptionPane.showMessageDialog(null, "Whithdraw Successfully");
					
					
				} catch (Exception e2) {
					e2.printStackTrace();
					
				}
			}
		});
		btnNewButton_6.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		btnNewButton_6.setBounds(803, 416, 103, 35);
		Quick_Withdraw_frame.getContentPane().add(btnNewButton_6);
		
		JButton btnOthers = new JButton("Others");
		btnOthers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cash_Withdraw bal = new Cash_Withdraw();
				bal.Cash_frame.setVisible(true);
				Quick_Withdraw_frame.dispose();
				
				
			}
		});
		btnOthers.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		btnOthers.setBounds(803, 517, 103, 35);
		Quick_Withdraw_frame.getContentPane().add(btnOthers);
		
		JLabel lblNewLabel = new JLabel("Quick Withdraw");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		lblNewLabel.setBounds(593, 79, 155, 27);
		Quick_Withdraw_frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_7 = new JButton("←");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Interface obj = new Interface();
				obj.Interface_frame.setVisible(true);
				Quick_Withdraw_frame.dispose();
			}
		});
		btnNewButton_7.setBounds(10, 30, 53, 27);
		Quick_Withdraw_frame.getContentPane().add(btnNewButton_7);
	}

}
