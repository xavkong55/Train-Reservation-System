package OOSEAssignment;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class ScreenList {

	private JFrame frame;
	Controller c = new Controller();

	/**
	 * Launch the application.
	 */
	public static void list() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScreenList window = new ScreenList();
					window.frame.setVisible(true);
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
	public ScreenList() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("List");
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setResizable(false);
		//set icon
		ImageIcon img = new ImageIcon("pictures/train.png");
		frame.setIconImage(img.getImage());
		frame.setBounds(100, 100, 800, 420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		//List label
		JLabel lblTitle = new JLabel("List");
		lblTitle.setForeground(Color.MAGENTA);
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 48));
		lblTitle.setBounds(326, 29, 146, 61);
		frame.getContentPane().add(lblTitle);
		//
		JButton btnlocation = new JButton("Departure-Arrival");
		btnlocation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				c.openDepartArrival();
			}
		});
		btnlocation.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnlocation.setBounds(278, 136, 252, 33);
		frame.getContentPane().add(btnlocation);
		
		JButton btnfoodlist = new JButton("Food Package");
		btnfoodlist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				c.openFoodPackageList();
			}
		});
		btnfoodlist.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnfoodlist.setBounds(278, 208, 252, 33);
		frame.getContentPane().add(btnfoodlist);
		
		JButton btnbanklist = new JButton("Bank List");
		btnbanklist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				c.openBankList();
			}
		});
		btnbanklist.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnbanklist.setBounds(278, 281, 252, 33);
		frame.getContentPane().add(btnbanklist);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				c.openMenu();
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnBack.setBounds(39, 29, 91, 25);
		frame.getContentPane().add(btnBack);
	}
}
