package OOSEAssignment;

import java.awt.Dimension;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.Color;

import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class ScreenBooking {

	private JFrame frame;
	Controller c = new Controller();
	private JTextField total;
	private int totalkid=0,totaladult=0;
	private double kidPrice=0,adultPrice=0;
	private String depArr="";
	private JTextField dept;
	private JTable jt;
	JSpinner spinner_totaladult, spinner_totalkid;
	
	
	/**
	 * Launch the application.
	 */
	public static void Booking() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScreenBooking window = new ScreenBooking();
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
	public ScreenBooking() {
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
		frame.setTitle("Booking");
		frame.setBounds(100, 100, 860, 518);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTitle = new JLabel("Booking Ticket");
		lblTitle.setForeground(Color.MAGENTA);
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblTitle.setBounds(78, 103, 256, 46);
		frame.getContentPane().add(lblTitle);
		
		JLabel lbllocation = new JLabel("Depart-Arrival :");
		lbllocation.setFont(new Font("Arial", Font.PLAIN, 20));
		lbllocation.setBounds(57, 177, 140, 24);
		frame.getContentPane().add(lbllocation);
		
		dept = new JTextField();
		dept.setEditable(false);
		dept.setColumns(10);
		dept.setBounds(241, 175, 141, 33);
		dept.setText(depArr);
		dept.setHorizontalAlignment(JTextField.CENTER);
		frame.getContentPane().add(dept);
		
		JLabel lblkid = new JLabel("Total Child :");
		lblkid.setFont(new Font("Arial", Font.PLAIN, 20));
		lblkid.setBounds(64, 231, 155, 24);
		frame.getContentPane().add(lblkid);
		
		spinner_totaladult = new JSpinner();
		spinner_totaladult.setModel(new SpinnerNumberModel(0, 0, 50, 1));
		spinner_totaladult.setFont(new Font("Tahoma", Font.PLAIN, 14));
		spinner_totaladult.setBounds(245, 283, 140, 33);
		frame.getContentPane().add(spinner_totaladult);
		
		JLabel lbladult = new JLabel("Total Adult :");
		lbladult.setFont(new Font("Arial", Font.PLAIN, 20));
		lbladult.setBounds(64, 284, 165, 24);
		frame.getContentPane().add(lbladult);
		
		spinner_totalkid = new JSpinner();
		spinner_totalkid.setModel(new SpinnerNumberModel(0, 0, 50, 1));
		spinner_totalkid.setFont(new Font("Tahoma", Font.PLAIN, 14));
		spinner_totalkid.setBounds(245, 230, 140, 33);
		frame.getContentPane().add(spinner_totalkid);
		
		JButton btnAddOn = new JButton("Add-On");
		btnAddOn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				totalkid =(int)spinner_totalkid.getValue();
				totaladult =(int)spinner_totaladult.getValue();
				if(depArr.equals("")||(totalkid<1 && totaladult<1)) {
					JOptionPane.showMessageDialog(null,"Please choose your depart-arrival and enter the total kid and adult.");  
				}
				else {
					frame.dispose();
					c.setTicketDetails(depArr);
					c.calculateTicketPrice((int) spinner_totaladult.getValue(),(int)spinner_totalkid.getValue(), kidPrice, adultPrice);
					c.openFoodBeverage();
				}
			}
		});
		btnAddOn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAddOn.setBounds(260, 427, 107, 33);
		frame.getContentPane().add(btnAddOn);
		
		JButton btnProceedPayment = new JButton("Proceed To Payment");
		btnProceedPayment.setBackground(Color.GREEN);
		btnProceedPayment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				totalkid =(int)spinner_totalkid.getValue();
				totaladult =(int)spinner_totaladult.getValue();
				if(depArr.equals("")||(totalkid<1 && totaladult<1)) {
					JOptionPane.showMessageDialog(null,"Please choose your depart-arrival and enter the total kid and adult.");  
				}
				else {
					frame.dispose();
					c.setTicketDetails(depArr);
					c.calculateTicketPrice((int) spinner_totaladult.getValue(),(int)spinner_totalkid.getValue(), kidPrice, adultPrice);
					c.openPayment();
				}
			}
		});
		btnProceedPayment.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnProceedPayment.setBounds(527, 423, 180, 40);
		frame.getContentPane().add(btnProceedPayment);
		
		JLabel lbladdon = new JLabel("Would you like to add-on?");
		lbladdon.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lbladdon.setBounds(92, 433, 155, 22);
		frame.getContentPane().add(lbladdon);
		
		JButton btnmenu = new JButton("Main Menu");
		btnmenu.setBackground(Color.RED);
		btnmenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c.openMenu();
				frame.dispose();
			}
		});
		btnmenu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnmenu.setBounds(22, 23, 119, 33);
		frame.getContentPane().add(btnmenu);
		
		JLabel lblPlease = new JLabel("Please choose your Depart-Arrival here");
		lblPlease.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPlease.setBounds(487, 23, 300, 16);
		frame.getContentPane().add(lblPlease);
		
		String[]columns = {"Depart-Arrival","Kid Price(RM)","Adult Price(RM)"};
		String[][]data = { {"KL-Ipoh","14.0","20.0"},
	    		{"KL-AS","24.0","30.0"},
	    		{"KL-GT","34.0","40.0"},
	    		{"KL-KB","26.0","32.0"},
	    		{"KL-SRB","10.0","16.0"},
	    		{"KL-BRM","22.0","28.0"},
	    		{"GT-KL","34.0","40.0"},
	    		{"GT-Ipoh","26.0","32.0"},
	    		{"GT-AS","16.0","22.0"},
	    		{"GT-KB","24.0","30.0"},
	    		{"GT-SRB","32.0","38.0"},
	    		{"GT-BRM","22.0","28.0"},
	    		{"AS-KL","24.0","30.0"},
	    		{"AS-GT","16.0","22.0"},
	    		{"AS-Ipoh","20.0","26.0"},
	    		{"AS-KB","18.0","24.0"},
	    		{"AS-SRB","28.0","35.0"},
	    		{"AS-BRM","12.0","18.0"},
	    		{"KB-KL","26.0","32.0"},
	    		{"KB-GT","24.0","30.0"},
	    		{"KB-AS","18.0","24.0"},
	    		{"KB-Ipoh","18.0","24.0"},
	    		{"KB-SRB","26.0","32.0"},
	    		{"KB-BRM","20.0","26.0"},
	    		{"SRB-KL","10.0","16.0"},
	    		{"SRB-GT","32.0","38.0"},
	    		{"SRB-AS","28.0","35.0"},
	    		{"SRB-KB","16.0","32.0"},
	    		{"SRB-Ipoh","16.0","22.0"},
	    		{"SRB-BRM","22.0","28.0"},
	    		{"BRM-KL","22.0","28.0"},
	    		{"BRM-GT","22.0","28.0"},
	    		{"BRM-AS","12.0","18.0"},
	    		{"BRM-KB","20.0","26.0"},
	    		{"BRM-SRB","20.2","28.0"},
	    		{"BRM-Ipoh","10.0","16.0"},
	    		{"Ipoh-KL","14.0","20.0"},
	    		{"Ipoh-GT","26.0","32.0"},
	    		{"Ipoh-AS","20.0","26.0"},
	    		{"Ipoh-KB","18.0","24.0"},
	    		{"Ipoh-SRB","16.0","22.0"},
	    		{"Ipoh-BRM","10.0","16.0"}}; 
		
		jt = new JTable(data,columns);
		jt.setFont(new Font("Tahoma", Font.PLAIN, 12));
		jt.setPreferredScrollableViewportSize(new Dimension(950,240));
		jt.setFillsViewportHeight(true);
		jt.setRowHeight(30);
		jt.setEnabled(false);
		jt.setCellSelectionEnabled(false);
		jt.setBounds(420, 36, 416, 358);
		
		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);

        jt.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        jt.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        jt.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        
		JTableHeader header = jt.getTableHeader();
		Font headerFont = new Font("Verdana",Font.PLAIN, 14);
		header.setFont(headerFont);
		frame.getContentPane().setLayout(null);
			
		JScrollPane jps = new JScrollPane(jt);
		jps.setBounds(395, 52, 431, 366);
		
		frame.getContentPane().add(jps);
		jt.addMouseListener(new java.awt.event.MouseAdapter(){
			
			public void mouseClicked(java.awt.event.MouseEvent e){
				int row=jt.rowAtPoint(e.getPoint());
				depArr = (String)jt.getValueAt(row, 0);
				dept.setText(depArr);
				String dataKid = (String)jt.getValueAt(row, 1);
				String dataAdult = (String)jt.getValueAt(row, 2);
				String kid_price = Character.toString(dataKid.charAt(0))+Character.toString(dataKid.charAt(1));
				kidPrice = Integer.parseInt(kid_price);
				String adult_price = Character.toString(dataAdult.charAt(0))+Character.toString(dataAdult.charAt(1));
				adultPrice = Integer.parseInt(adult_price);
			}
		});
		
		JButton btnTotal = new JButton("Check Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				totalkid =(int)spinner_totalkid.getValue();
				totaladult =(int)spinner_totaladult.getValue();
				if(depArr.equals("")||(totalkid<1 && totaladult<1)) {
					JOptionPane.showMessageDialog(null,"Please choose your depart-arrival and enter the total kid and adult.");  
				}
				else {
					c.calculateTicketPrice(totalkid,totaladult, kidPrice, adultPrice);
					total.setText(c.getTicketPrice());
				}
			}
		});
		btnTotal.setBounds(64, 332, 131, 25);
		frame.getContentPane().add(btnTotal);
		
		total = new JTextField();
		total.setText("0.00");
		total.setEditable(false);
		total.setBounds(242, 328, 141, 33);
		total.setHorizontalAlignment(JTextField.CENTER);
		frame.getContentPane().add(total);
		total.setColumns(10);
		
		JLabel lblTotal = new JLabel("Total(RM)");
		lblTotal.setFont(new Font("Arial", Font.PLAIN, 17));
		lblTotal.setBounds(275, 361, 84, 25);
		frame.getContentPane().add(lblTotal);	
    }
}

