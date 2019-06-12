//Έτσι όπως είναι κακό-γραμμένος ο κώδικας μοιάζει πιο πολύ με με διαδικασιακό προγραμματισμό παρά με αντικειμενοστρεφή.
//Γράγτηκε όμως με μεράκι and it somehow works.


//Προγραμματισμός: Αργύρης Θεοδώρου, dai16273

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Toolkit;

import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.Font;

import javax.swing.ButtonGroup;

import java.awt.Dimension;

public class MainMenu {

	private JFrame frmUOMEXPRESS;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField searchNumberField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu window = new MainMenu();
					window.frmUOMEXPRESS.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MainMenu() {
		initialize();
	}

	private void initialize() {
		frmUOMEXPRESS = new JFrame();
		frmUOMEXPRESS.setResizable(false);
		frmUOMEXPRESS.setMinimumSize(new Dimension(480, 480));
		frmUOMEXPRESS.setIconImage(Toolkit.getDefaultToolkit().getImage(MainMenu.class.getResource("/pics/box.png")));
		frmUOMEXPRESS.getContentPane().setBackground(new Color(57, 62, 70));

		JButton newPacketbtn = new JButton("Nέα αποστολή");
		newPacketbtn.setFont(new Font("Calibri", Font.BOLD, 30));
		newPacketbtn.setBackground(new Color(0, 173, 181));
		newPacketbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NewShipmentDialog dial = null;
				try {
					dial = new NewShipmentDialog();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} 
				dial.setVisible(true);

			}
		});

		JButton searchBtn = new JButton("Αναζήτηση αποστολής");
		searchBtn.setBackground(new Color(0, 173, 181));
		searchBtn.setFont(new Font("Calibri", Font.BOLD, 30));
		searchBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NewSearchDialog searchDial;
				try {
					searchDial = new NewSearchDialog();
					searchDial.setVisible(true);
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});

		// με αυτό το κουμπί, ο χρήστης μπορεί να επαναφέρει τον υπολοιπόμενο
		// χώρο στα μεταφορικά μέσα στην αρχική του κατάσταση.
		JButton helpBtn = new JButton("RESET μέσα μεταφοράς");
		helpBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					NewShipmentDialog NSHIP = new NewShipmentDialog();
					NSHIP.setCapacity("8200000", "35000000");
					JOptionPane.showMessageDialog(null,"Επαναφέρατε επιτυχώς τον υπολοιπόμενο χώρο στα μεταφορικά μέσα"
							+ " \n στην μέγιστη χωρητικότητα "
							+ "\n (8,2 κυβικά μέτρα για το container του πλοίου και 32 κυβικά μέτρα για το αεροσκάφος)");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}

		});

		JButton completnessButton = new JButton("Κατάσταση μέσων");
		completnessButton.setBackground(new Color(0, 173, 181));
		completnessButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				NewCompletenessDialog completnessDial = null;
				try {
					completnessDial = new NewCompletenessDialog();

				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				completnessDial.setVisible(true);
			}
		});
		completnessButton.setFont(new Font("Calibri", Font.BOLD, 30));

		GroupLayout groupLayout = new GroupLayout(frmUOMEXPRESS.getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
				.createSequentialGroup().addGap(72)
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(
								groupLayout.createSequentialGroup()
										.addComponent(completnessButton, GroupLayout.PREFERRED_SIZE, 315,
												GroupLayout.PREFERRED_SIZE)
										.addContainerGap())
						.addGroup(groupLayout.createSequentialGroup()
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(newPacketbtn, GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
										.addComponent(searchBtn, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE))
								.addGap(95))))
				.addGroup(groupLayout.createSequentialGroup().addGap(148).addComponent(helpBtn).addContainerGap(189,
						Short.MAX_VALUE)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addGap(85)
						.addComponent(newPacketbtn, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(searchBtn, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(completnessButton, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
						.addGap(18).addComponent(helpBtn, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(49, Short.MAX_VALUE)));
		frmUOMEXPRESS.getContentPane().setLayout(groupLayout);

		frmUOMEXPRESS.setTitle("UOM EXPRESS");
		frmUOMEXPRESS.setBounds(100, 100, 480, 480);
		frmUOMEXPRESS.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
