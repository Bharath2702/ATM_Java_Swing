package Atm_Library;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.desktop.UserSessionEvent;
import javax.swing.JPasswordField;
import javax.swing.JPanel;
import javax.swing.JDesktopPane;
import javax.swing.ImageIcon;

public class Deposit {

	JFrame Deposit_frame;
	private JTextField deposit;

	/**
	 * Launch the application.
	 */
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Deposit window = new Deposit();
					window.Deposit_frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Deposit() {
		initialize();
	}

	
	private void initialize() {
		Deposit_frame = new JFrame("Deposit");
		Deposit_frame.getContentPane().setBackground(new Color(47, 79, 79));
		Deposit_frame.setBounds(100, 100, 1202, 778);
		Deposit_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Deposit_frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Deposit Amount");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.BOLD, 25));
		lblNewLabel.setBounds(644, 274, 322, 38);
		Deposit_frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("←");
		btnNewButton.setBackground(new Color(254,248,234));
		btnNewButton.setForeground(new Color(0, 0, 64));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Interface obj = new Interface();
				obj.Interface_frame.setVisible(true);
				Deposit_frame.dispose();
				
			}
		});
		btnNewButton.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		btnNewButton.setBounds(26, 22, 64, 26);
		Deposit_frame.getContentPane().add(btnNewButton);
		
		deposit = new JTextField();
		deposit.setBounds(644, 356, 322, 44);
		Deposit_frame.getContentPane().add(deposit);
		deposit.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Deposit");
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(17, 131, 202));
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					Class.forName("com.mysql.jdbc.Driver");
					String u = "root";
					String p = "";
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_database",u,p);
					Statement st = con.createStatement();
					
					Login onLogin = new Login();
					PreparedStatement ps = con.prepareStatement("update customer_details set balance = balance + ? where username = ? " );
					ps.setString(1,deposit.getText());
					ps.setString(2, onLogin.username);
					System.out.println(onLogin.username);
					String deopString = deposit.getText();
					int deposit = Integer.parseInt(deopString);
					
					if(deposit >= 500)
					{
						ps.executeUpdate();
						JOptionPane.showMessageDialog(null, "Rs: "+deposit+" Deposit Successfully");
					}
					else {
						JOptionPane.showMessageDialog(null, "Cannot Deposit Please Deposit 500 or More ");
					}
					
				} 
				catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		btnNewButton_1.setBounds(644, 461, 177, 38);
		Deposit_frame.getContentPane().add(btnNewButton_1);
	}
}
