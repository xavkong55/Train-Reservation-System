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

public class ScreenDepartArrivalList{	
	JTable jt;
	JTableHeader header;
	Controller c = new Controller();
	
	public ScreenDepartArrivalList() {
	   JFrame jf = new JFrame();
	   jf.getContentPane().setBackground(Color.WHITE);
	   jf.setResizable(false);
	   ImageIcon img = new ImageIcon("pictures/train.png");
	   jf.setIconImage(img.getImage());
	   jf.setTitle("Depart-Arrival");
	   jf.setSize(1000,400);
	   jf.setVisible(true);
	   jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   jf.setLocationRelativeTo(null);
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
		btnNewButton.setBounds(382, 302, 184, 38);
		jf.getContentPane().add(btnNewButton);
	}
	public boolean isCellEditable(int data, int columns) {
		return false;
	}
}
