package OOSEAssignment;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Color;

public class ScreenFPXPayment {

	private JFrame frmPayment;
	Controller c=new Controller();
	/**
	 * Launch the application.
	 */
	public static void fpspayment() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScreenFPXPayment window = new ScreenFPXPayment();
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
	 */
	public ScreenFPXPayment() {
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
		frmPayment.setTitle("FPX Payment Page");
		frmPayment.setBounds(100, 100, 450, 300);
		frmPayment.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPayment.getContentPane().setLayout(null);
		
		JLabel lblTotal = new JLabel("Amount(RM) :");
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTotal.setBounds(34, 81, 132, 37);
		frmPayment.getContentPane().add(lblTotal);
		
		JTextField amount = new JTextField();
		amount.setFont(new Font("Tahoma", Font.PLAIN, 20));
		amount.setEditable(false);
		amount.setText(c.getTotalPrice());
		amount.setBounds(205, 81, 167, 37);
		frmPayment.getContentPane().add(amount);
		amount.setColumns(10);
		
		JLabel lblPayment = new JLabel("PIN :");
		lblPayment.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPayment.setBounds(115, 133, 46, 37);
		frmPayment.getContentPane().add(lblPayment);
		
		JPasswordField pin= new JPasswordField();
		pin.setColumns(6);
		pin.setBounds(205, 136, 167, 37);
		pin.setText("165232");
		frmPayment.getContentPane().add(pin);
		
		JButton btnOK = new JButton("OK");
		btnOK.setBounds(155, 201, 107, 37);
		frmPayment.getContentPane().add(btnOK);
		
		JLabel lblFpxPayment = new JLabel("FPX Payment");
		lblFpxPayment.setForeground(Color.MAGENTA);
		lblFpxPayment.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblFpxPayment.setBounds(135, 13, 172, 29);
		frmPayment.getContentPane().add(lblFpxPayment);
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(pin.getText().equals("165232")) {
					frmPayment.dispose();
					c.openSummary();
				}
				else {
					JOptionPane.showMessageDialog(null,"Please enter the Payment Pin.");  
				
				}
			}
		});
	}
}
