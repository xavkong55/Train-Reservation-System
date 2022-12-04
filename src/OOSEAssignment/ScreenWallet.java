package OOSEAssignment;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Color;

public class ScreenWallet {

	private JFrame frmWallet;
	private JTextField txtUsername;
	private JTextField txtTotal;
	Controller c=new Controller();
	/**
	 * Launch the application.
	 */
	public static void wallet() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScreenWallet window = new ScreenWallet();
					window.frmWallet.setVisible(true);
					window.frmWallet.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ScreenWallet() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmWallet = new JFrame();
		frmWallet.getContentPane().setBackground(Color.WHITE);
		frmWallet.setResizable(false);
		ImageIcon img = new ImageIcon("pictures/train.png");
		frmWallet.setIconImage(img.getImage());
		frmWallet.setTitle("E-Wallet");
		frmWallet.setBounds(100, 100, 450, 300);
		frmWallet.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWallet.getContentPane().setLayout(null);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUsername.setBounds(58, 51, 97, 25);
		frmWallet.getContentPane().add(lblUsername);
		
		txtUsername = new JTextField();
		txtUsername.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtUsername.setBounds(183, 51, 170, 25);
		frmWallet.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		txtUsername.setText("sitihuda00");
		
		JPasswordField password = new JPasswordField(6);
		password.setFont(new Font("Tahoma", Font.PLAIN, 20));
		password.setBounds(183, 103, 170, 25);
		frmWallet.getContentPane().add(password);
		password.setColumns(6);
		password.setText("SitiHuda_ok123");
		
		txtTotal = new JTextField();
		txtTotal.setEditable(false);
		txtTotal.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtTotal.setText(c.getTotalPrice());
		txtTotal.setBounds(182, 150, 126, 37);
		frmWallet.getContentPane().add(txtTotal);
		txtTotal.setColumns(10);
		
		JButton btnOK = new JButton("OK");
		btnOK.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnOK.setBounds(164, 216, 117, 37);
		frmWallet.getContentPane().add(btnOK);
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtUsername.getText().equals("sitihuda00")&&password.getText().equals("SitiHuda_ok123")) {
					frmWallet.dispose();
					c.openSummary();
				}
				else {
					JOptionPane.showMessageDialog(null,"Please enter the Username and Password.");
				}
			}
		});
		
		JLabel lblPaymentPin = new JLabel("Payment Pin: ");
		lblPaymentPin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPaymentPin.setBounds(36, 103, 126, 25);
		frmWallet.getContentPane().add(lblPaymentPin);
		
		JLabel lblTotal = new JLabel("Total Price(RM): ");
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTotal.setBounds(12, 148, 152, 44);
		frmWallet.getContentPane().add(lblTotal);
		
		JLabel lblNewLabel = new JLabel("TRS Wallet");
		lblNewLabel.setForeground(Color.MAGENTA);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(145, 13, 161, 29);
		frmWallet.getContentPane().add(lblNewLabel);
	}
}
