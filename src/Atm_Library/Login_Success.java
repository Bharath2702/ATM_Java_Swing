package Atm_Library;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

public class Login_Success {

	JFrame login_Success_frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_Success window = new Login_Success();
					window.login_Success_frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login_Success() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		login_Success_frame = new JFrame();
		login_Success_frame.setBounds(100, 100, 1127, 780);
		login_Success_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		login_Success_frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login Successfully");
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.BOLD, 25));
		lblNewLabel.setBounds(659, 292, 430, 47);
		login_Success_frame.getContentPane().add(lblNewLabel);
	}

}
