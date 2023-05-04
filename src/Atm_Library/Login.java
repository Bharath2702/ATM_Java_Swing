package Atm_Library;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JCheckBox;

public class Login {

	JFrame Login_frame;
	JTextField Username;
	JPasswordField password;
	static String username;
	
	
	public static void main(String[] args) 
	{
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.Login_frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Login_frame = new JFrame("Login");
		Login_frame.getContentPane().setBackground(new Color(47, 79, 79));
		Login_frame.setBounds(100, 100, 1208, 783);
		Login_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Login_frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.BOLD, 25));
		lblNewLabel.setBounds(667, 215, 122, 33);
		Login_frame.getContentPane().add(lblNewLabel);
		
		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setForeground(new Color(255, 255, 255));
		lblUserName.setFont(new Font("Segoe UI Semibold", Font.BOLD, 25));
		lblUserName.setBounds(524, 308, 149, 33);
		Login_frame.getContentPane().add(lblUserName);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(new Color(255, 255, 255));
		lblPassword.setFont(new Font("Segoe UI Semibold", Font.BOLD, 25));
		lblPassword.setBounds(524, 395, 122, 33);
		Login_frame.getContentPane().add(lblPassword);
		
		Username = new JTextField();
		Username.setBounds(773, 308, 149, 28);
		Login_frame.getContentPane().add(Username);
		Username.setColumns(10);
		
	
		
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setForeground(SystemColor.textHighlightText);
		btnNewButton.setBackground(new Color(17, 131, 202));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			username = Username.getText();
				
				try {
					
					
					Class.forName("com.mysql.jdbc.Driver");
					String u = "root";
					String p = "";
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_database",u,p);
					Statement st = con.createStatement();
					PreparedStatement ps = con.prepareStatement("select * from customer_details where username = ? and password = ?");
				
					Login objLogin = new Login();
					
					
					ps.setString(1, Username.getText());
					ps.setString(2, new String(password.getPassword()));
					
					
					
					System.out.println("Uname:" + username);
					
					ResultSet rs = ps.executeQuery();
					
					if(rs.next())
					{
						
						
						JOptionPane.showMessageDialog(null, "Login Successfully");
						
						Interface objInterface = new Interface();
						objInterface.Interface_frame.setVisible(true);
						
						
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Login Failed");
					}
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("Segoe UI Semibold", Font.BOLD, 25));
		btnNewButton.setBounds(667, 485, 122, 33);
		Login_frame.getContentPane().add(btnNewButton);
		
		password = new JPasswordField();
		password.setBounds(773, 401, 149, 31);
		Login_frame.getContentPane().add(password);
		
		JButton btnNewButton_1 = new JButton("Register");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Register obj = new Register();
				obj.Register_frame.setVisible(true);
				Login_frame.dispose();
				
			}
		});
		btnNewButton_1.setForeground(new Color(255, 128, 0));
		btnNewButton_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		btnNewButton_1.setBounds(667, 552, 112, 28);
		Login_frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("New User?");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 25));
		lblNewLabel_1.setBounds(524, 549, 255, 33);
		Login_frame.getContentPane().add(lblNewLabel_1);
		
		JCheckBox showpassword = new JCheckBox("");
		showpassword.setBounds(937, 407, 21, 21);
		Login_frame.getContentPane().add(showpassword);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(10, 166, 35, 28);
		Login_frame.getContentPane().add(btnNewButton_2);
	}
}
