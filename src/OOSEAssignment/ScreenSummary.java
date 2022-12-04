package OOSEAssignment;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class ScreenSummary {

	private JFrame frmSummary;
	Controller c=new Controller();
	/**
	 * Launch the application.
	 */
	public static void Summary() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScreenSummary window = new ScreenSummary();
					window.frmSummary.setVisible(true);
					window.frmSummary.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ScreenSummary() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSummary = new JFrame();
		frmSummary.getContentPane().setBackground(Color.WHITE);
		frmSummary.setResizable(false);
		ImageIcon img = new ImageIcon("pictures/train.png");
		frmSummary.setIconImage(img.getImage());
		frmSummary.setTitle("Booking History");
		frmSummary.setBounds(100, 100, 711, 578);
		frmSummary.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSummary.getContentPane().setLayout(null);
		frmSummary.setLocationRelativeTo( null );
		frmSummary.setVisible(true);
		
		JLabel lblhistory = new JLabel("Booking Summary");
		lblhistory.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblhistory.setBounds(262, 12, 236, 31);
		frmSummary.getContentPane().add(lblhistory);
		
		JButton btnmainmenu = new JButton("Main Menu");
		btnmainmenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmSummary.dispose();
				c.saveBookingRecord();
				c.openMenu();
			}
		});
		btnmainmenu.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnmainmenu.setBounds(26, 12, 128, 30);
		frmSummary.getContentPane().add(btnmainmenu);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(26, 52, 669, 479);
		frmSummary.getContentPane().add(panel);
		panel.setLayout(null);
		final JTextArea display = new JTextArea();
		display.setFont(new Font("Segoe UI", Font.PLAIN, 23));
		display.setRows(10);
		display.setText(c.getSummary());
		display.setEditable(false);
		display.setBounds(0, 0, 646, 469);	
		panel.add(display);
    }
}

