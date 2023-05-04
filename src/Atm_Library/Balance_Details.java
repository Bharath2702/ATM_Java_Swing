package Atm_Library;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Color;

public class Balance_Details {

	JFrame balance_frame;
	private JFrame balance_frame_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Balance_Details window = new Balance_Details();
					window.balance_frame_1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Balance_Details() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
//		balance_frame = new JFrame();
//		balance_frame.setBounds(100, 100, 1081, 753);
//		balance_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//
//		 balance_frame = new JFrame("Balance");
//        balance_frame.setSize(500, 300);
//        balance_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        
        balance_frame_1 = new JFrame("Balance");
        balance_frame_1.getContentPane().setBackground(new Color(47, 79, 79));
		balance_frame_1.setBounds(100, 100, 851, 552);
		balance_frame_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 25));
		balance_frame_1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
       
       
       

        try {
        	
        	 Login objLogin = new Login();
             String user = objLogin.username;
           
        	
        	Class.forName("com.mysql.jdbc.Driver");
        	Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank_database","root","");
             Statement stmt = conn.createStatement();
             
             PreparedStatement ps = conn.prepareStatement("SELECT Account_Num,UserName,Balance FROM customer_details where username = ? ");
             ps.setString(1, user);
             
             System.out.println("Balance user: "+ user);
             ResultSet rs = ps.executeQuery();
             
            

            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();
           
            Object[][] data = new Object[1][columnCount];
            int row = 0;

            while (rs.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    data[row][i-1] = rs.getObject(i);
                }
                row++;
            }

            Object[] columnNames = new Object[columnCount];

            for (int i = 1; i <= columnCount; i++)
            {
                columnNames[i-1] = metaData.getColumnLabel(i);
            }
            balance_frame_1.getContentPane().setLayout(null);

            JTable table = new JTable(data, columnNames);
            table.setFont(new Font("Segoe UI Semibold", Font.BOLD, 25));
            JScrollPane scrollPane = new JScrollPane(table);
            scrollPane.setBounds(150, 209, 473, 97);

            balance_frame_1.getContentPane().add(scrollPane);
            balance_frame_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 25));
            
            JButton btnNewButton = new JButton("←");
            btnNewButton.addActionListener(new ActionListener() {
            	public void actionPerformed(ActionEvent e) {
            		Interface obInterface = new Interface();
            		obInterface.Interface_frame.setVisible(true);
            		balance_frame_1.dispose();
            		
            		
            		 try {
						conn.close();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
         			 try {
						stmt.close();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
            				
            	}
            });
            btnNewButton.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
            btnNewButton.setBounds(23, 20, 70, 29);
            balance_frame_1.getContentPane().add(btnNewButton);
            
            JLabel lblNewLabel = new JLabel("Balance");
            lblNewLabel.setForeground(new Color(255, 255, 255));
            lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.BOLD, 25));
            lblNewLabel.setBounds(150, 133, 473, 40);
            balance_frame_1.getContentPane().add(lblNewLabel);

            balance_frame_1.setVisible(true);
            
          

        } 
             catch (SQLException | ClassNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }
	}


