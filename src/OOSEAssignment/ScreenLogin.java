package OOSEAssignment;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ScreenLogin {

	private JFrame frame;
	private JTextField txtuserID=new JTextField();
	private JPasswordField txtpassword=new JPasswordField();
	Controller c=new Controller();
	/**
	 * Launch the application.
	 */
	public static void main(String[]args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScreenLogin window = new ScreenLogin();
					window.frame.setVisible(true);
					window.frame.setTitle("Login");
					window.frame.setLocationRelativeTo(null);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ScreenLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setResizable(false);
		ImageIcon img = new ImageIcon("pictures/train.png");
		frame.setIconImage(img.getImage());
		frame.setBounds(100, 100, 712, 420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("Train Reservation System");
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setForeground(new Color(138, 43, 226));
		lblName.setBackground(Color.WHITE);
		lblName.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblName.setBounds(134, 47, 466, 56);
		frame.getContentPane().add(lblName);
		
		JLabel lbl_UserID = new JLabel("User ID :");
		lbl_UserID.setFont(new Font("Arial", Font.BOLD, 20));
		lbl_UserID.setBounds(207, 152, 86, 31);
		frame.getContentPane().add(lbl_UserID);
		
		txtuserID.setBounds(323, 154, 170, 31);
		frame.getContentPane().add(txtuserID);
		txtuserID.setColumns(10);
		txtuserID.setText("admin");
		
		JLabel lbl_Password = new JLabel("Password :");
		lbl_Password.setFont(new Font("Arial", Font.BOLD, 20));
		lbl_Password.setBounds(184, 216, 130, 31);
		frame.getContentPane().add(lbl_Password);
	
		txtpassword.setBounds(323, 218, 170, 31);
		frame.getContentPane().add(txtpassword);
		txtpassword.setColumns(10);
		txtpassword.setText("admin");
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				if(txtuserID.getText().equals("admin")&&(txtpassword.getText().equals("admin"))) {
					frame.dispose();
					c.setUserDetails();
					c.openMenu();
				}
				else
					JOptionPane.showMessageDialog(null,"Invalid Password");
			}	
			
		});
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnNewButton.setBounds(286, 288, 121, 41);
		frame.getContentPane().add(btnNewButton);
	}
}
