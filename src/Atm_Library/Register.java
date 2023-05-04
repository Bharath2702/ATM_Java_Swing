package Atm_Library;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class Register {

	JFrame Register_frame;
	private JTextField f_name;
	private JTextField u_name;
	private JTextField l_name;
	private JTextField acc_num;
	private JTextField phno;
	private JTextField address;
	private JTextField balance;
	private JPasswordField password;
	private JPasswordField pin;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register window = new Register();
					window.Register_frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Register() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Register_frame = new JFrame("Register");
		Register_frame.getContentPane().setBackground(new Color(47, 79, 79));
		Register_frame.setBounds(100, 100, 1002, 792);
		Register_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Register_frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("First Name");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(240, 240, 240));
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20)); 
		lblNewLabel.setBounds(29, 29, 140, 38);
		Register_frame.getContentPane().add(lblNewLabel);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setForeground(Color.WHITE);
		lblLastName.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		lblLastName.setBounds(573, 29, 140, 38);
		Register_frame.getContentPane().add(lblLastName);
		
		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setForeground(Color.WHITE);
		lblUserName.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		lblUserName.setBounds(29, 172, 140, 38);
		Register_frame.getContentPane().add(lblUserName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		lblPassword.setBounds(573, 172, 140, 38);
		Register_frame.getContentPane().add(lblPassword);
		
		JLabel lblAccountNumber = new JLabel("Account Number");
		lblAccountNumber.setForeground(Color.WHITE);
		lblAccountNumber.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		lblAccountNumber.setBounds(29, 330, 173, 38);
		Register_frame.getContentPane().add(lblAccountNumber);
		
		JLabel lblPin = new JLabel("Pin");
		lblPin.setForeground(Color.WHITE);
		lblPin.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		lblPin.setBounds(573, 330, 140, 38);
		Register_frame.getContentPane().add(lblPin);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number");
		lblPhoneNumber.setForeground(Color.WHITE);
		lblPhoneNumber.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		lblPhoneNumber.setBounds(29, 484, 140, 38);
		Register_frame.getContentPane().add(lblPhoneNumber);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setForeground(Color.WHITE);
		lblAddress.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		lblAddress.setBounds(573, 484, 140, 38);
		Register_frame.getContentPane().add(lblAddress);
		
		JLabel lblBalance = new JLabel("Balance");
		lblBalance.setForeground(Color.WHITE);
		lblBalance.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		lblBalance.setBounds(29, 622, 140, 38);
		Register_frame.getContentPane().add(lblBalance);
		
		f_name = new JTextField();
		f_name.setBounds(29, 84, 173, 32);
		Register_frame.getContentPane().add(f_name);
		f_name.setColumns(10);
		
		u_name = new JTextField();
		u_name.setColumns(10);
		u_name.setBounds(29, 235, 173, 32);
		Register_frame.getContentPane().add(u_name);
		
		l_name = new JTextField();
		l_name.setColumns(10);
		l_name.setBounds(583, 84, 173, 32);
		Register_frame.getContentPane().add(l_name);
		
		acc_num = new JTextField();
		acc_num.setColumns(10);
		acc_num.setBounds(29, 403, 173, 32);
		Register_frame.getContentPane().add(acc_num);
		
		phno = new JTextField();
		phno.setColumns(10);
		phno.setBounds(29, 549, 173, 32);
		Register_frame.getContentPane().add(phno);
		
		address = new JTextField();
		address.setColumns(10);
		address.setBounds(583, 555, 173, 32);
		Register_frame.getContentPane().add(address);
		
		balance = new JTextField();
		balance.setColumns(10);
		balance.setBounds(29, 677, 173, 32);
		Register_frame.getContentPane().add(balance);
		
		password = new JPasswordField();
		password.setBounds(583, 233, 173, 34);
		Register_frame.getContentPane().add(password);
		
		pin = new JPasswordField();
		pin.setBounds(583, 378, 173, 34);
		Register_frame.getContentPane().add(pin);
		
		btnNewButton = new JButton("Register");
		btnNewButton.setForeground(SystemColor.BLACK);
		btnNewButton.setBackground(new Color(255,193,7));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					String u = "root";
					String p = "";
					
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_database",u,p);
					Statement st = con.createStatement();
					System.out.println("Connected");
					
					
					PreparedStatement ps = con.prepareStatement("insert into customer_details values(?,?,?,?,?,?,?,?,?)");
					
					ps.setString(1, f_name.getText());
					ps.setString(2, l_name.getText());
					ps.setString(3, u_name.getText());
					ps.setString(4, new String(password.getPassword()));
					ps.setString(5, acc_num.getText());
					ps.setString(6, new String(pin.getPassword()));
					ps.setString(7, phno.getText());
					ps.setString(8, address.getText());
					ps.setString(9, balance.getText());
					
					
					
					if(f_name.getText().equals("")) 
					{
						
						 JOptionPane.showMessageDialog(null, "No data entered");
					}
					else if(l_name.getText().equals(""))
					{
						 JOptionPane.showMessageDialog(null, "No data entered");
					}
					else if(phno.getText().equals(""))
					{ 
						JOptionPane.showMessageDialog(null, "No data entered");
						
					}
					else if(address.getText().equals(""))
					{
						 JOptionPane.showMessageDialog(null, "No data entered");
					}
					else if(u_name.getText().equals("")) 
					{
						 JOptionPane.showMessageDialog(null, "No data entered");
					}
					else if(password.getPassword().length == 0)
					{
						 JOptionPane.showMessageDialog(null, "No data entered");
					}
					else if(pin.getPassword().length == 0 )
					{
						 JOptionPane.showMessageDialog(null, "No data entered");
					}
					else if(acc_num.getText().equals(""))
					{
						JOptionPane.showMessageDialog(null, "No data entered");
					}
					else if(balance.getText().equals(""))
					{
						JOptionPane.showMessageDialog(null, "No data entered");
					}
					else
					{
						ps.executeUpdate();
						JOptionPane.showMessageDialog(null, "Value Inserted");
					}
					
					
					ps.executeQuery();
					
					con.close();
					st.close();
				}
					
					catch (ClassNotFoundException | SQLException e1) {
						e1.printStackTrace();
					}
					
				
					
					Login obj = new Login();
					obj.Login_frame.setVisible(true);
					Register_frame.dispose();
				}
			
				
			
		});
		btnNewButton.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		btnNewButton.setBounds(583, 665, 173, 38);
		Register_frame.getContentPane().add(btnNewButton);
		
					
				
				}
}
