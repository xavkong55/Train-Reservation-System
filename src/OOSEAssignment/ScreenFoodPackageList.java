package OOSEAssignment;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ScreenFoodPackageList{	
	JTable jt;
	JTableHeader header;
	Controller c = new Controller();
	
	public ScreenFoodPackageList() {
		JFrame jf = new JFrame();
		jf.getContentPane().setBackground(Color.WHITE);
		jf.setResizable(false);
		ImageIcon img = new ImageIcon("pictures/train.png");
		jf.setIconImage(img.getImage());
		jf.setTitle("Food Package List");
		jf.setSize(1000,400);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		String[]columns = {"SET A","SET B", "SET C", "SET D"};
		
		String[][]data = {{"Fried Rice","Noodles","Chicken Burgers","Chicken Porridge"},    
				{"Fried Chickens", "Chicken Burgers", "Chicken Porridge", "Bread" },
				{"Coca-cola", "Coca-cola", "Pepsi", "Pepsi" },
				{"Snacks", "Mineral Water", "Sweets", "Mineral Water" },
                {"RM18.50", "RM15.25", "RM16.88", "RM12.50"}};

		jt = new JTable(data,columns);
		jt.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jt.setPreferredScrollableViewportSize(new Dimension(950,240));
		jt.setFillsViewportHeight(true);
		jt.setRowHeight(30);
		jt.setEnabled(false);
		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);

        jt.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        jt.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        jt.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        jt.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
		
		
		header = jt.getTableHeader();
		Font headerFont = new Font("Verdana",Font.PLAIN, 24);
		header.setFont(headerFont);
		jf.getContentPane().setLayout(null);
			
		JScrollPane jps = new JScrollPane(jt);
		jps.setBounds(17, 5, 952, 266);
		
		jf.getContentPane().add(jps);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jf.dispose();
				c.openList();
			}
		});
		btnNewButton.setBounds(397, 302, 184, 38);
		jf.getContentPane().add(btnNewButton);
	}
	public boolean isCellEditable(int data, int columns) {
		return false;
	}
}


