package OOSEAssignment;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.Color;

public class ScreenPayment {

	JFrame frmPayment;
	private JRadioButton fpx;
	private JRadioButton ewallet;
	Controller c=new Controller();
	private JLabel lblPayment;
	/**
	 * Launch the application.
	 */
	public static void payment() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScreenPayment window = new ScreenPayment();
					window.frmPayment.setVisible(true);
					window.frmPayment.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @wbp.parser.entryPoint
	 */
	public ScreenPayment() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPayment = new JFrame();
		frmPayment.getContentPane().setBackground(Color.WHITE);
		frmPayment.setResizable(false);
		ImageIcon img = new ImageIcon("pictures/train.png");
		frmPayment.setIconImage(img.getImage());
		frmPayment.setTitle("Payment");
		frmPayment.setBounds(100, 100, 450, 300);
		frmPayment.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPayment.getContentPane().setLayout(null);
		
		ewallet = new JRadioButton("E-Wallet");
		ewallet.setBackground(new Color(135, 206, 250));
		ewallet.setBounds(46, 114, 109, 23);
		frmPayment.getContentPane().add(ewallet);
		ewallet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(ewallet.isSelected()) {
					fpx.setSelected(false);
				}
			}
		});
		
		fpx = new JRadioButton("FPX");
		fpx.setBackground(new Color(0, 250, 154));
		fpx.setBounds(46, 142, 109, 23);
		frmPayment.getContentPane().add(fpx);
		fpx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (fpx.isSelected()) {
					ewallet.setSelected(false);
				}
			}
		});
		
		JLabel lblNewLabel = new JLabel("Select Type of Payment:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel.setBounds(46, 67, 312, 38);
		frmPayment.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ewallet.isSelected()) {
					frmPayment.dispose();
					c.openEWallet();
					c.setPayment("EWallet");
				}
	
				if (fpx.isSelected()) {
					frmPayment.dispose();
					c.openFPX();
					c.setPayment("Online Banking");
				}
			}
		});
		btnNewButton.setBounds(165, 195, 114, 31);
		frmPayment.getContentPane().add(btnNewButton);
		
		lblPayment = new JLabel("Payment");
		lblPayment.setForeground(Color.RED);
		lblPayment.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblPayment.setBounds(150, 23, 129, 31);
		frmPayment.getContentPane().add(lblPayment);
	}
}
