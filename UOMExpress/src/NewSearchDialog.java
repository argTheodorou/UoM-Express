import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class NewSearchDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField searchBarcodeField;
	private JTextField searchPostCodeField;
	private String newLine = System.getProperty("line.separator");


	public NewSearchDialog() throws FileNotFoundException {
		setTitle(
				"\u0391\u039D\u0391\u0396\u0397\u03A4\u0397\u03A3\u0397 \u0391\u03A0\u039F\u03A3\u03A4\u039F\u039B\u0397\u03A3");
		setResizable(false);
		setModal(true);
		setIconImage(Toolkit.getDefaultToolkit().getImage(NewSearchDialog.class.getResource("/pics/box.png")));
		setMinimumSize(new Dimension(800, 480));
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(57, 62, 70));

		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		JPanel panel = new JPanel();
		panel.setBackground(new Color(57, 62, 70));

		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon(NewSearchDialog.class.getResource("/pics/logo400X400.png")));
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
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
				"\u0391\u039D\u0391\u0396\u0397\u03A4\u0397\u03A3\u0397 \u0391\u03A0\u039F\u03A3\u03A4\u039F\u039B\u0397\u03A3");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Calibri", Font.BOLD, 22));

		JLabel label_1 = new JLabel(
				"\u03A0\u03BB\u03B7\u03BA\u03C4\u03C1\u03BF\u03BB\u03BF\u03B3\u03AE\u03C3\u03C4\u03B5 \u03AD\u03BD\u03B1\u03BD \u03BA\u03C9\u03B4\u03B9\u03BA\u03CC \u03C0\u03B1\u03C1\u03B1\u03BA\u03BF\u03BB\u03BF\u03CD\u03B8\u03B7\u03C3\u03B7\u03C2");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Calibri", Font.BOLD, 16));

		searchBarcodeField = new JTextField();
		searchBarcodeField.setToolTipText("Κωδικός Αναζήτησης");
		searchBarcodeField.setFont(new Font("Calibri", Font.BOLD, 35));
		searchBarcodeField.setColumns(10);
		JTextArea resultField = new JTextArea();

		JButton button = new JButton("");
		button.setToolTipText("Αναζήτηση");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {        
				             
				try {
					String[] resultArray = newSearch("C:/Users/argir/git/UoM-Express/UOMExpress/apostoles.txt", searchBarcodeField.getText(), searchPostCodeField.getText());
					if(resultArray[0] != "ERROR"){  //if the returned array is NOT the "error" array then the result is shown in the textField 
						
						resultField.setText("Όνομα Αποστολέα: " + resultArray[1]+ "\nΌνομα Παραλήπτη: " + resultArray[2]
								+ "\nΗμερομηνία άφιξης αποστολής: ");
					}
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}

			}
		});
		button.setIcon(new ImageIcon(NewSearchDialog.class.getResource("/pics/magnifier.png")));
		

		JButton button_1 = new JButton("\u039A\u03BB\u03B5\u03AF\u03C3\u03B9\u03BC\u03BF");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});

		button_1.setFont(new Font("Calibri", Font.BOLD, 18));
		
		searchPostCodeField = new JTextField();
		searchPostCodeField.setToolTipText("Ταχυδρομικός Κώδικας");
		searchPostCodeField.setFont(new Font("Calibri", Font.BOLD, 35));
		searchPostCodeField.setColumns(10);
		
		JLabel label_3 = new JLabel("\u03BA\u03B1\u03B9 \u03C4\u03BF\u03BD \u03B1\u03BD\u03C4\u03AF\u03C3\u03C4\u03BF\u03B9\u03C7\u03BF \u03C4\u03B1\u03C7\u03C5\u03B4\u03C1\u03BF\u03BC\u03B9\u03BA\u03CC \u03BA\u03CE\u03B4\u03B9\u03BA\u03B1");
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Calibri", Font.BOLD, 16));
		
				GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(65, Short.MAX_VALUE)
					.addComponent(label_3)
					.addGap(56))
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addContainerGap()
							.addComponent(resultField, GroupLayout.PREFERRED_SIZE, 349, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_panel.createSequentialGroup()
								.addGap(74)
								.addComponent(label))
							.addGroup(gl_panel.createSequentialGroup()
								.addGap(26)
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
									.addComponent(label_1, GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
									.addGroup(gl_panel.createSequentialGroup()
										.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
											.addComponent(searchPostCodeField, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 259, GroupLayout.PREFERRED_SIZE)
											.addComponent(searchBarcodeField, Alignment.TRAILING, 0, 0, Short.MAX_VALUE))
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addComponent(button, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE))))
							.addGroup(gl_panel.createSequentialGroup()
								.addGap(90)
								.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE))))
					.addGap(20))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(label_1, GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
					.addGap(2)
					.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(searchBarcodeField, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(searchPostCodeField, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
						.addComponent(button, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(resultField, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(21))
		);
		panel.setLayout(gl_panel);
		contentPanel.setLayout(gl_contentPanel);

	}

	public String [] newSearch (String fileName, String code, String postCode) throws FileNotFoundException {

		Scanner scan = new Scanner(new File(fileName));
		String [] separatedByCommasArray = null;
		String [] notFound = {"ERROR"};
		while (scan.hasNext()) {
			String line = scan.nextLine().toString();
			if (line.contains(code)) { //searches whole document by line if it contains the tracking number
			separatedByCommasArray = line.split(",");  //pushes the selected line into an array.every String is put in a different field. starting at [0]
				if (separatedByCommasArray[3].contains(postCode))   //if the same line that contained the tracking number also contains the postCode
					return separatedByCommasArray; 					//the line gets returned as an array
			}
		}
		
		JOptionPane.showMessageDialog(null,"Λάθος Στοιχεία.");       
		return notFound;  						//if the given track number or postcode doesnt exist or doesnt match in the system, a custom "error" array is returned.

	}
}
