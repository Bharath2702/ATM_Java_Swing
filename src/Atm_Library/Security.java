package Atm_Library;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Security {

	JFrame frame;
	JTextField textField;
	JPasswordField pin_pwwd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Security window = new Security();
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
	public Security() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 880, 619);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		lblNewLabel.setBounds(42, 131, 117, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblPin = new JLabel("Pin");
		lblPin.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		lblPin.setBounds(42, 259, 117, 31);
		frame.getContentPane().add(lblPin);
		
		textField = new JTextField();
		textField.setBounds(42, 182, 117, 31);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		pin_pwwd = new JPasswordField();
		pin_pwwd.setBounds(42, 319, 117, 31);
		frame.getContentPane().add(pin_pwwd);
		
		JButton btnNewButton = new JButton("Confirm");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		btnNewButton.setBounds(199, 409, 135, 31);
		frame.getContentPane().add(btnNewButton);
	}
}
