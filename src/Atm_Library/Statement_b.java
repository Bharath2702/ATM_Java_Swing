package Atm_Library;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Statement_b {

	JFrame Statement_frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Statement_b window = new Statement_b();
					window.Statement_frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Statement_b() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Statement_frame = new JFrame("Statement");
		Statement_frame.setBounds(100, 100, 450, 300);
		Statement_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
