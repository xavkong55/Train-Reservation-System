package OOSEAssignment;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ScreenFoodBeverage {

	private JFrame frame;
	Controller c=new Controller();
	JSpinner spinner_A = new JSpinner();
	JSpinner spinner_B = new JSpinner();
	JSpinner spinner_C = new JSpinner();
	JSpinner spinner_D = new JSpinner();
	private JTextField textField_totalFood,textField_total;
	/**
	 * Launch the application.
	 */
	public static void foodbeverage() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScreenFoodBeverage window = new ScreenFoodBeverage();
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
	public ScreenFoodBeverage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setResizable(false);
		ImageIcon img = new ImageIcon("pictures/train.png");
		frame.setIconImage(img.getImage());
		frame.setTitle("Food And Beverage");
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 16));
		frame.setBounds(100, 100, 914, 596);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnProceed = new JButton("Proceed");
		btnProceed.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnProceed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int foodlist1 = (int) spinner_A.getValue();
				int foodlist2 = (int) spinner_B.getValue();
				int foodlist3 = (int) spinner_C.getValue();
				int foodlist4 = (int) spinner_D.getValue();
				if(foodlist1 > 0||foodlist2 > 0||foodlist3 > 0||foodlist4 > 0) {
					c.setAddonDetails(foodlist1,foodlist2,foodlist3,foodlist4);
					frame.dispose();
					c.openPayment();
				}
				else {
					JOptionPane.showMessageDialog(null,"Please choose at least one package");
				}
			}
		});
		btnProceed.setBounds(735, 491, 144, 37);
		frame.getContentPane().add(btnProceed);
		
		JLabel lbladdon = new JLabel("Add On");
		lbladdon.setForeground(Color.MAGENTA);
		lbladdon.setFont(new Font("Tahoma", Font.BOLD, 35));
		lbladdon.setBounds(384, 24, 164, 37);
		frame.getContentPane().add(lbladdon);
		
		JLabel lblFoodPackage = new JLabel("Food Package: ");
		lblFoodPackage.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblFoodPackage.setBounds(32, 62, 129, 21);
		frame.getContentPane().add(lblFoodPackage);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("pictures/set a.jpg"));
		label.setBounds(94, 158, 144, 136);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("pictures/set c.jpg"));
		label_1.setBounds(499, 158, 144, 136);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("pictures/set d.jpg"));
		label_2.setBounds(702, 154, 144, 140);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon("pictures/set b.jpg"));
		label_3.setBounds(298, 158, 144, 136);
		frame.getContentPane().add(label_3);
		
		JLabel lblInclude = new JLabel("Include:");
		lblInclude.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblInclude.setBounds(94, 296, 82, 25);
		frame.getContentPane().add(lblInclude);
		
		JLabel lblFriedRice = new JLabel("- Fried Rice");
		lblFriedRice.setBounds(94, 321, 82, 16);
		frame.getContentPane().add(lblFriedRice);
		
		JLabel lblFriedChicken = new JLabel("- Fried Chicken");
		lblFriedChicken.setBounds(94, 344, 110, 16);
		frame.getContentPane().add(lblFriedChicken);
		
		JLabel lblSnake = new JLabel("- Snake");
		lblSnake.setBounds(94, 367, 82, 16);
		frame.getContentPane().add(lblSnake);
		
		JLabel lblCocacola = new JLabel("- Coca-cola");
		lblCocacola.setBounds(94, 388, 82, 16);
		frame.getContentPane().add(lblCocacola);
		
		JLabel labelInclude = new JLabel("Include:");
		labelInclude.setFont(new Font("Tahoma", Font.PLAIN, 16));
		labelInclude.setBounds(298, 296, 82, 25);
		frame.getContentPane().add(labelInclude);
		
		JLabel lblNoodle = new JLabel("- Noodle");
		lblNoodle.setBounds(298, 321, 82, 16);
		frame.getContentPane().add(lblNoodle);
		
		JLabel lblChickenBurger = new JLabel("- Chicken Burger");
		lblChickenBurger.setBounds(298, 344, 110, 16);
		frame.getContentPane().add(lblChickenBurger);
		
		JLabel lblMineralWater = new JLabel("- Mineral Water");
		lblMineralWater.setBounds(298, 367, 110, 16);
		frame.getContentPane().add(lblMineralWater);
		
		JLabel lblCocacola_1 = new JLabel("- Coca-cola");
		lblCocacola_1.setBounds(298, 388, 82, 16);
		frame.getContentPane().add(lblCocacola_1);
		
		JLabel labelInclude1 = new JLabel("Include:");
		labelInclude1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		labelInclude1.setBounds(499, 296, 82, 25);
		frame.getContentPane().add(labelInclude1);
		
		JLabel lblChickenPorridge = new JLabel("- Chicken Porridge");
		lblChickenPorridge.setBounds(499, 321, 110, 16);
		frame.getContentPane().add(lblChickenPorridge);
		
		JLabel lblChickenBurger_1 = new JLabel("- Chicken Burger");
		lblChickenBurger_1.setBounds(499, 344, 97, 16);
		frame.getContentPane().add(lblChickenBurger_1);
		
		JLabel lblPepsi = new JLabel("- Pepsi");
		lblPepsi.setBounds(499, 367, 82, 16);
		frame.getContentPane().add(lblPepsi);
		
		JLabel lblSweet = new JLabel("- Sweet");
		lblSweet.setBounds(499, 388, 82, 16);
		frame.getContentPane().add(lblSweet);
		
		JLabel labelInclude2 = new JLabel("Include:");
		labelInclude2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		labelInclude2.setBounds(702, 296, 82, 25);
		frame.getContentPane().add(labelInclude2);
		
		JLabel lblChickenPorridge_1 = new JLabel("- Chicken Porridge");
		lblChickenPorridge_1.setBounds(702, 321, 116, 16);
		frame.getContentPane().add(lblChickenPorridge_1);
		
		JLabel lblBread = new JLabel("- Bread");
		lblBread.setBounds(702, 344, 82, 16);
		frame.getContentPane().add(lblBread);
		
		JLabel lblMineralWater_1 = new JLabel("- Mineral Water");
		lblMineralWater_1.setBounds(702, 367, 116, 16);
		frame.getContentPane().add(lblMineralWater_1);
		
		JLabel lblPepsi_1 = new JLabel("- Pepsi");
		lblPepsi_1.setBounds(702, 388, 82, 16);
		frame.getContentPane().add(lblPepsi_1);
		
		JLabel lblQuantity = new JLabel("Quantity:");
		lblQuantity.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblQuantity.setBounds(32, 414, 97, 25);
		frame.getContentPane().add(lblQuantity);
		
		spinner_A.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_A.setBounds(94, 449, 116, 26);
		frame.getContentPane().add(spinner_A);
		
		spinner_B.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_B.setBounds(298, 449, 116, 26);
		frame.getContentPane().add(spinner_B);
		
		spinner_C.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_C.setBounds(499, 449, 116, 26);
		frame.getContentPane().add(spinner_C);
		
		spinner_D.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner_D.setBounds(702, 449, 116, 26);
		frame.getContentPane().add(spinner_D);
	
		JLabel lblPriceA = new JLabel("RM18.50");
		lblPriceA.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPriceA.setBounds(122, 132, 82, 16);
		frame.getContentPane().add(lblPriceA);
		
		JLabel lblSetA = new JLabel("Set A");
		lblSetA.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSetA.setBounds(134, 97, 56, 16);
		frame.getContentPane().add(lblSetA);
		
		JLabel lblPriceB = new JLabel("RM15.25");
		lblPriceB.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPriceB.setBounds(326, 132, 82, 16);
		frame.getContentPane().add(lblPriceB);
		
		JLabel lblSetB = new JLabel("Set B");
		lblSetB.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSetB.setBounds(338, 97, 56, 16);
		frame.getContentPane().add(lblSetB);
		
		JLabel lblPriceC = new JLabel("RM16.88");
		lblPriceC.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPriceC.setBounds(527, 132, 82, 16);
		frame.getContentPane().add(lblPriceC);
		
		JLabel lblSetC = new JLabel("Set C");
		lblSetC.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSetC.setBounds(539, 97, 56, 16);
		frame.getContentPane().add(lblSetC);
		
		JLabel lblPriceD= new JLabel("RM12.50");
		lblPriceD.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPriceD.setBounds(736, 132, 82, 16);
		frame.getContentPane().add(lblPriceD);
		
		JLabel lblSetD = new JLabel("Set D");
		lblSetD.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSetD.setBounds(748, 97, 56, 16);
		frame.getContentPane().add(lblSetD);
		
		JButton btnTotal = new JButton("Check Total");
		btnTotal.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int foodlist1 = (int) spinner_A.getValue();
				int foodlist2 = (int) spinner_B.getValue();
				int foodlist3 = (int) spinner_C.getValue();
				int foodlist4 = (int) spinner_D.getValue();
				if(foodlist1 > 0||foodlist2 > 0||foodlist3 > 0||foodlist4 > 0) {
					c.setAddonDetails(foodlist1,foodlist2,foodlist3,foodlist4);
					textField_totalFood.setText(c.getAddonPrice());
					textField_total.setText(c.getTotalPrice());
				}
				else {
					JOptionPane.showMessageDialog(null,"Please choose at least one package");
				}
			}
		});
		btnTotal.setBounds(196, 501, 144, 31);
		frame.getContentPane().add(btnTotal);
		
		textField_totalFood = new JTextField();
		textField_totalFood.setText("0.00");
		textField_totalFood.setEditable(false);
		textField_totalFood.setColumns(10);
		textField_totalFood.setBounds(361, 495, 152, 33);
		textField_totalFood.setHorizontalAlignment(JLabel.CENTER);
		frame.getContentPane().add(textField_totalFood);
		
		JLabel lblTotal = new JLabel("Total Food Price(RM)");
		lblTotal.setFont(new Font("Arial", Font.PLAIN, 17));
		lblTotal.setBounds(361, 531, 164, 25);
		frame.getContentPane().add(lblTotal);	
		
		textField_total = new JTextField();
		textField_total.setText(c.getTicketPrice());
		textField_total.setHorizontalAlignment(SwingConstants.CENTER);
		textField_total.setEditable(false);
		textField_total.setColumns(10);
		textField_total.setBounds(563, 495, 143, 33);
		frame.getContentPane().add(textField_total);
		
		JLabel lblGrandTotalrm = new JLabel("Grand Total(RM)");
		lblGrandTotalrm.setFont(new Font("Arial", Font.PLAIN, 17));
		lblGrandTotalrm.setBounds(573, 531, 133, 25);
		frame.getContentPane().add(lblGrandTotalrm);
	}
}
