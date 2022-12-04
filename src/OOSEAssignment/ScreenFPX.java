package OOSEAssignment;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class ScreenFPX {

	private JFrame frmFpx;
	Controller c = new Controller(); 
	
	/**
	 * Launch the application.
	 */
	public static void fps() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScreenFPX window = new ScreenFPX();
					window.frmFpx.setVisible(true);
					window.frmFpx.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ScreenFPX() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFpx = new JFrame();
		frmFpx.getContentPane().setBackground(Color.WHITE);
		frmFpx.setResizable(false);
		ImageIcon img = new ImageIcon("pictures/train.png");
		frmFpx.setIconImage(img.getImage());
		frmFpx.setTitle("FPX");
		frmFpx.setBounds(100, 100, 450, 300);
		frmFpx.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFpx.getContentPane().setLayout(null);
		
		JLabel lblBank = new JLabel("Type of Bank:");
		lblBank.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblBank.setBounds(24, 66, 138, 25);
		frmFpx.getContentPane().add(lblBank);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUsername.setBounds(51, 104, 97, 25);
		frmFpx.getContentPane().add(lblUsername);
		
		JLabel lblpassword = new JLabel("Password:");
		lblpassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblpassword.setBounds(55, 142, 97, 25);
		frmFpx.getContentPane().add(lblpassword);
		
		JTextField txtUsername = new JTextField();
		txtUsername.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtUsername.setBounds(197, 104, 170, 25);
		frmFpx.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		txtUsername.setText("sitihuda00");
		
		JPasswordField password = new JPasswordField();
		password.setFont(new Font("Tahoma", Font.PLAIN, 20));
		password.setBounds(197, 142, 170, 25);
		frmFpx.getContentPane().add(password);
		password.setText("SitiHuda_ok123");
		
		JButton btnOK = new JButton("OK");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtUsername.getText().equals("sitihuda00")||password.getText().equals("SitiHuda_ok123")) {
					frmFpx.dispose();
					c.openFPXPayment();
				}
				else {
					JOptionPane.showMessageDialog(null,"Please enter the Username and Password."); 
				}
			}
		});
		btnOK.setBounds(153, 204, 107, 33);
		frmFpx.getContentPane().add(btnOK);
		
		JComboBox<String> cbxBank = new JComboBox<String>();
		cbxBank.setModel(new DefaultComboBoxModel<String>(new String[] {"HLB  ", "CIMB", "BankIslam", "MayBank", "Public Bank", "RHB", "BSN", "Alliance", "BankMuamalat"}));
		cbxBank.setFont(new Font("Tahoma", Font.PLAIN, 20));
		cbxBank.setBounds(197, 67, 169, 22);
		frmFpx.getContentPane().add(cbxBank);
		
		JLabel lblFpx = new JLabel("FPX");
		lblFpx.setForeground(Color.MAGENTA);
		lblFpx.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblFpx.setBounds(175, 13, 73, 29);
		frmFpx.getContentPane().add(lblFpx);
		
		
	}
}
