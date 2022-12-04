package OOSEAssignment;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ScreenMenu {

	private JFrame frmMainmenu;
	Controller c=new Controller();
	
	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScreenMenu window = new ScreenMenu();
					window.frmMainmenu.setVisible(true);
					window.frmMainmenu.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ScreenMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMainmenu = new JFrame();
		frmMainmenu.getContentPane().setBackground(Color.WHITE);
		frmMainmenu.setResizable(false);
		ImageIcon img = new ImageIcon("pictures/train.png");
		frmMainmenu.setIconImage(img.getImage());
		frmMainmenu.setTitle("MainMenu");
		frmMainmenu.setBounds(100, 100, 711, 421);
		frmMainmenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMainmenu.getContentPane().setLayout(null);
		
		JLabel lblTitle = new JLabel("Main Menu");
		lblTitle.setForeground(Color.MAGENTA);
		lblTitle.setBackground(Color.GREEN);
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 36));
		lblTitle.setBounds(226, 37, 235, 44);
		frmMainmenu.getContentPane().add(lblTitle);
		
		JButton btnbooking = new JButton("Booking");
		btnbooking.setBackground(Color.GREEN);
		btnbooking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMainmenu.dispose();
				c.openBooking();
			}
		});
		btnbooking.setFont(new Font("Arial", Font.BOLD, 20));
		btnbooking.setBounds(226, 110, 235, 44);
		frmMainmenu.getContentPane().add(btnbooking);
		
		JButton btnlist = new JButton("List");
		btnlist.setBackground(Color.GREEN);
		btnlist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmMainmenu.dispose();
				c.openList();
			}
		});
		btnlist.setFont(new Font("Arial", Font.BOLD, 20));
		btnlist.setBounds(226, 235, 235, 44);
		frmMainmenu.getContentPane().add(btnlist);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBackground(Color.RED);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x = JOptionPane.showConfirmDialog(null, 
	                    "Are you sure you want to exit ?", "Comform !",
	                    JOptionPane.YES_NO_OPTION);

	                if(x == JOptionPane.YES_OPTION) {
	                    frmMainmenu.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	                    System.exit(0);
	                }else{
	                	frmMainmenu.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	                }
			}
		});
		btnExit.setFont(new Font("Arial", Font.BOLD, 20));
		btnExit.setBounds(226, 301, 235, 44);
		frmMainmenu.getContentPane().add(btnExit);
		
		JButton btnSummary = new JButton("History");
		btnSummary.setBackground(Color.GREEN);
		btnSummary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(c.openHistory()==true) {
					frmMainmenu.dispose();
				}
				else
					JOptionPane.showMessageDialog(null,"Nothing to Show!");
			}
		});
		btnSummary.setFont(new Font("Arial", Font.BOLD, 20));
		btnSummary.setBounds(226, 172, 235, 44);
		frmMainmenu.getContentPane().add(btnSummary);
	}
}
