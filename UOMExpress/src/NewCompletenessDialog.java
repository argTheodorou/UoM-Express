import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.Icon;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.border.BevelBorder;
import javax.swing.UIManager;

public class NewCompletenessDialog extends JDialog {
	
	
	private final JPanel contentPanel1 = new JPanel();
	private final JPanel contentPanel = new JPanel();
	String [] spaceUsedTable = null; 

	public NewCompletenessDialog() throws FileNotFoundException {
		setTitle(
				"\u0395\u039B\u0395\u0393\u03A7\u039F\u03A3 \u03A0\u039B\u0397\u03A1\u039F\u03A4\u0397\u03A4\u0391\u03A3 \u039C\u0395\u03A3\u03A9\u039D");
		setResizable(false);
		setModal(true);
		setIconImage(Toolkit.getDefaultToolkit().getImage(NewSearchDialog.class.getResource("/pics/box.png")));
		setMinimumSize(new Dimension(800, 480));
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel1.setBackground(new Color(57, 62, 70));
		
		//textAreas to be used to display remaining ammount of space left
		JTextArea capacityFieldShip = new JTextArea();
		capacityFieldShip.setLineWrap(true);
		JTextArea capacityFieldPlane = new JTextArea();
		capacityFieldPlane.setForeground(Color.WHITE);
		capacityFieldPlane.setFont(new Font("Calibri", Font.BOLD, 18));
		capacityFieldPlane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		capacityFieldPlane.setBackground(new Color(57, 62, 70));
		capacityFieldPlane.setLineWrap(true);

		contentPanel1.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel1, BorderLayout.CENTER);
		JPanel panel = new JPanel();
		panel.setBackground(new Color(57, 62, 70));

		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(NewSearchDialog.class.getResource("/pics/logo400X400.png")));
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel1);
		gl_contentPanel.setHorizontalGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 386, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 394, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		gl_contentPanel.setVerticalGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup().addContainerGap()
						.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(label_2, GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
								.addComponent(panel, GroupLayout.PREFERRED_SIZE, 445, GroupLayout.PREFERRED_SIZE))
						.addContainerGap()));

		JLabel label = new JLabel(
				"\u039A\u0391\u03A4\u0391\u03A3\u03A4\u0391\u03A3\u0397 \u039C\u0395\u03A3\u03A9\u039D");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Calibri", Font.BOLD, 22));

		JButton button_1 = new JButton("\u039A\u03BB\u03B5\u03AF\u03C3\u03B9\u03BC\u03BF");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});

		button_1.setFont(new Font("Calibri", Font.BOLD, 18));
		spaceUsedTable  = getSpaceUsed("src/textFiles/capacity.txt");
		//calculating the numbers that the user will get to see
		double missingShipSpace = 8200000 - (Double.parseDouble(spaceUsedTable[0])) ;  
		//calculates the space that has been already booked by packages on the SHIP
		double remainingShipPercentage = (1- (missingShipSpace / 8200000))*100;  
		//makes a percentage out of it
	
		double missingPlaneSpace = 35000000 - (Double.parseDouble(spaceUsedTable[1])) ; 
		//calculates the space that has been already booked by packages on the PLANE
		double remainingPlanePercentage =  ((1- (missingPlaneSpace / 35000000))*100);  
		//makes a percentage out of it
		
		
		capacityFieldShip.setText("Απομένουν: \n" 
				+ String.format("%.2f",((8200000-missingShipSpace)/1000000))
				+ " κυβικά μέτρα\n"
				+ String.format("%.2f", remainingShipPercentage) + "%"
				
				);
		
		capacityFieldPlane.setText("Απομένουν: \n" 
				+   String.format("%.2f",(35000000-missingPlaneSpace)/1000000)
				+ " κυβικά μέτρα\n" 
				+ String.format("%.2f", remainingPlanePercentage) + "%");
		
		
		
		
		
		System.out.println(remainingShipPercentage );
		System.out.println(remainingPlanePercentage);

		JLabel shipPicture = new JLabel("");
		

		JLabel planePicture = new JLabel("");

		
		
		shipPicture.setIcon(new ImageIcon(NewCompletenessDialog.class.getResource(getShipImage(remainingShipPercentage))));
		planePicture.setIcon(new ImageIcon(NewCompletenessDialog.class.getResource(getPlaneImage(remainingPlanePercentage))));
		
		
		capacityFieldShip.setForeground(Color.WHITE);
		capacityFieldShip.setFont(new Font("Calibri", Font.BOLD, 18));
		capacityFieldShip.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		capacityFieldShip.setBackground(new Color(57, 62, 70));
		
	
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(89)
					.addComponent(label)
					.addContainerGap(116, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(93, Short.MAX_VALUE)
					.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)
					.addGap(87))
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(14, Short.MAX_VALUE)
					.addComponent(capacityFieldShip, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(capacityFieldPlane, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE)
					.addGap(33))
				.addGroup(Alignment.LEADING, gl_panel.createSequentialGroup()
					.addGap(36)
					.addComponent(shipPicture)
					.addGap(52)
					.addComponent(planePicture)
					.addContainerGap(58, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(planePicture, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(shipPicture))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(capacityFieldShip, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE)
						.addComponent(capacityFieldPlane, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(21))
		);
		panel.setLayout(gl_panel);
		contentPanel1.setLayout(gl_contentPanel);
	}

	


	private String getShipImage(double remainingShipPercentage) {
			if (remainingShipPercentage > 1 && remainingShipPercentage <25)
				return ("/pics/ship 120x120 25%.png");
			else if(remainingShipPercentage >26 && remainingShipPercentage <75)
				return ("/pics/ship 120x120 50%.png");
			else if(remainingShipPercentage >76 && remainingShipPercentage <99)
				return ("/pics/ship 120x120 75%.png");
			
			
		return ("/pics/ship 120x120 100%.png");
	}

	private String getPlaneImage(double remainingPlanePercentage) {
		if (remainingPlanePercentage >0 && remainingPlanePercentage <25)
			return ("/pics/plane 120x120 25%.png");
		else if(remainingPlanePercentage >26 && remainingPlanePercentage <75)
			return ("/pics/plane 120x120 50%.png");
		else if(remainingPlanePercentage >76 && remainingPlanePercentage <99)
			return ("/pics/plane 120x120 75%.png");
		
	return ("/pics/plane 120x120 100%.png");
	}


	//returns a table with the remainder of the available space in our shipping methods
	private String[] getSpaceUsed(String fileName) throws FileNotFoundException {

		Scanner scan = new Scanner(new File(fileName));
		String[] separatedByCommasArray = null;

		String line = scan.nextLine().toString();

		separatedByCommasArray = line.split(",");  //pushes the  line into an array. Every String is put in a different field. starting at [0]
		return separatedByCommasArray;
	}
}
