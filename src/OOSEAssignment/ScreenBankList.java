package OOSEAssignment;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ScreenBankList {
	Controller c = new Controller();
	JTable jt;
	JTableHeader header; 
	public ScreenBankList(){
		JFrame jf = new JFrame();
		jf.getContentPane().setBackground(Color.WHITE);
		jf.setResizable(false);
		ImageIcon img = new ImageIcon("pictures/train.png");
		jf.setIconImage(img.getImage());
		jf.setTitle("Bank List");
		jf.setSize(1000,400);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		String[]columns = {"Bank"};
		
		String[][]data = { {"HONG LEONG BANK BERHAD"},    
                {"CIMB BANK BERHAD"},    
                {"BANK ISLAM MALAYSIA BERHAD"},
                {"MAYBANK"},
                {"PUBLIC BANK BERHAD/PUBLIC ISLAMIC BANK BERHAD"},
                {"RHB BANK"},
                {"ALLIANCE BANK MALAYSIA BERHAD"},
                {"BANK MUAMALAT MALAYSIA BERHAD"}};
		jt = new JTable(data,columns);
		jt.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jt.setPreferredScrollableViewportSize(new Dimension(950,240));
		jt.setFillsViewportHeight(true);
		jt.setRowHeight(30);
		jt.setEnabled(false);
		
		header = jt.getTableHeader();
		Font headerFont = new Font("Verdana",Font.PLAIN, 24);
		header.setFont(headerFont);
		jf.getContentPane().setLayout(null);
			
		JScrollPane jps = new JScrollPane(jt);
		jps.setBounds(17, 5, 952, 266);
		
		jf.getContentPane().add(jps);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jf.dispose();
				c.openList();
			}
		});
		btnBack.setBounds(387, 302, 184, 38);
		jf.getContentPane().add(btnBack);
			  
	}
	public boolean isCellEditable(int data, int columns) {
		return false;
	}
}