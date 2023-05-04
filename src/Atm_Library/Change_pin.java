package Atm_Library;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Change_pin {

	JFrame pin_frame;
	private JTextField pin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Change_pin window = new Change_pin();
					window.pin_frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Change_pin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		pin_frame = new JFrame("Change Pin");
		pin_frame.getContentPane().setBackground(new Color(47, 79, 79));
		pin_frame.setBounds(100, 100, 702, 431);
		pin_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pin_frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Pin Change");
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(279, 51, 111, 31);
		pin_frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter New Pin");
		lblNewLabel_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(154, 128, 148, 24);
		pin_frame.getContentPane().add(lblNewLabel_1);
		
		pin = new JTextField();
		pin.setBounds(396, 128, 135, 27);
		pin_frame.getContentPane().add(pin);
		pin.setColumns(10);
		
		JButton btnNewButton = new JButton("Change Pin");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					String uname = "root";
					String pwd = "";
					Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_database",uname,pwd);
					Statement st = con.createStatement();
					
					Login login = new Login();
					String username = login.username;
					
					PreparedStatement ps = con.prepareStatement("update customer_details set pin = ? where username = ?");
					ps.setString(1, pin.getText());
					ps.setString(2, username);
					System.out.println("username: " + username);
					ps.executeUpdate();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("Segoe UI Semibold", Font.BOLD, 19));
		btnNewButton.setBounds(279, 208, 135, 31);
		pin_frame.getContentPane().add(btnNewButton);
	}
}
