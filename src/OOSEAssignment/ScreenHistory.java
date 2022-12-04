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

public class ScreenHistory{	
	JTable jt;
	JTableHeader header;
	Controller c = new Controller();
	
	public ScreenHistory(String[][]rows) {
		JFrame jf = new JFrame();
		jf.getContentPane().setBackground(Color.WHITE);
		ImageIcon img = new ImageIcon("pictures/train.png");
		jf.setIconImage(img.getImage());
		jf.setTitle("Booking History");
		jf.setSize(1350,500);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLocationRelativeTo(null);
		String[]columns = {"Order ID","Depart-Arrival","Total Adult","Total Kid","Payment Method","Package A","Package B", "Package C", "Package D","Total Price(RM)"};
		jt = new JTable(rows,columns);
		jt.setFont(new Font("Tahoma", Font.PLAIN, 12));
		jt.setPreferredScrollableViewportSize(new Dimension(1000, 240));
		jt.setFillsViewportHeight(true);
		jt.setRowHeight(30);
		
		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        for(int i=0 ; i<10 ; i++) {
        	jt.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
		header = jt.getTableHeader();
		Font headerFont = new Font("Verdana",Font.PLAIN, 12);
		header.setFont(headerFont);
		jf.getContentPane().setLayout(null);
			
		JScrollPane jps = new JScrollPane(jt);
		jps.setBounds(10, 5, 1316, 352);
		
		jf.getContentPane().add(jps);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jf.dispose();
				c.openMenu();
			}
		});
		btnNewButton.setBounds(605, 383, 184, 38);
		jf.getContentPane().add(btnNewButton);
	}
}


