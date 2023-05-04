package Atm_Library;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

public class Failed {

	JFrame failed_frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Failed window = new Failed();
					window.failed_frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Failed() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		failed_frame = new JFrame();
		failed_frame.setBounds(100, 100, 1126, 778);
		failed_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		failed_frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login Failed");
		lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		lblNewLabel.setBounds(731, 308, 434, 46);
		failed_frame.getContentPane().add(lblNewLabel);
	}

}
