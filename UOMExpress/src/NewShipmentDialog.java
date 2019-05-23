import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.Dimension;
import javax.swing.JSplitPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import javax.swing.UIManager;
import java.awt.SystemColor;
import java.awt.Toolkit;

public class NewShipmentDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField senderName;
	private JTextField recieverName;
	private JTextField adressText;
	private JTextField TKtext;
	private JTextField telephoneText;
	private JTextField size1Text;
	private JTextField size2Text;
	private JTextField size3Text;

	private final ButtonGroup buttonGroup_2 = new ButtonGroup();

	public NewShipmentDialog() {

		setIconImage(Toolkit.getDefaultToolkit().getImage(NewShipmentDialog.class.getResource("/pics/box.png")));

		setMinimumSize(new Dimension(800, 480));
		setResizable(false);
		setTitle("ΦΟΡΜΑ ΝΕΑΣ ΑΠΟΣΤΟΛΗΣ");
		setModal(true);
		setBounds(100, 100, 366, 461);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(57, 62, 70));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(57, 62, 70));

		JLabel label_12 = new JLabel("");
		label_12.setIcon(new ImageIcon(NewShipmentDialog.class.getResource("/pics/logo400X400.png")));
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 387, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(label_12, GroupLayout.PREFERRED_SIZE, 394, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		gl_contentPanel.setVerticalGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
						.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(panel, GroupLayout.PREFERRED_SIZE, 443, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_12, GroupLayout.PREFERRED_SIZE, 440, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		JLabel label = new JLabel("ΦΟΡΜΑ ΝΕΑΣ ΑΠΟΣΤΟΛΗΣ");
		label.setFont(new Font("Calibri", Font.BOLD, 22));
		label.setForeground(Color.WHITE);

		JLabel label_1 = new JLabel("Από");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Calibri", Font.BOLD, 18));

		JLabel label_2 = new JLabel("Προς");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Calibri", Font.BOLD, 18));

		JLabel label_3 = new JLabel("Όνομα αποστολέα");
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Calibri", Font.BOLD, 18));

		JLabel label_4 = new JLabel("Όνομα παραλήπτη");
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("Calibri", Font.BOLD, 18));

		JLabel label_5 = new JLabel("Δ/ση παραλήπτη");
		label_5.setForeground(Color.WHITE);
		label_5.setFont(new Font("Calibri", Font.BOLD, 18));

		JLabel label_6 = new JLabel("Ταχυδρ. Κώδικας");
		label_6.setForeground(Color.WHITE);
		label_6.setFont(new Font("Calibri", Font.BOLD, 18));

		JLabel label_7 = new JLabel("Τηλέφωνο");
		label_7.setForeground(Color.WHITE);
		label_7.setFont(new Font("Calibri", Font.BOLD, 18));

		JLabel label_8 = new JLabel("Διαστάσεις");
		label_8.setForeground(Color.WHITE);
		label_8.setFont(new Font("Calibri", Font.BOLD, 18));

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Θεσσαλονίκη" }));

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "Αθήνα" }));

		senderName = new JTextField();
		senderName.setFont(new Font("Calibri", Font.BOLD, 14));
		senderName.setColumns(10);

		recieverName = new JTextField();
		recieverName.setFont(new Font("Calibri", Font.BOLD, 14));
		recieverName.setColumns(10);

		adressText = new JTextField();
		adressText.setFont(new Font("Calibri", Font.BOLD, 14));
		adressText.setColumns(10);

		TKtext = new JTextField();
		TKtext.setFont(new Font("Calibri", Font.BOLD, 14));
		TKtext.setColumns(10);

		telephoneText = new JTextField();
		telephoneText.setFont(new Font("Calibri", Font.BOLD, 14));
		telephoneText.setColumns(10);

		size1Text = new JTextField();
		size1Text.setColumns(10);

		size2Text = new JTextField();
		size2Text.setColumns(10);

		size3Text = new JTextField();
		size3Text.setColumns(10);

		JLabel label_9 = new JLabel("Μέσο αποστολής");
		label_9.setForeground(Color.WHITE);
		label_9.setFont(new Font("Calibri", Font.BOLD, 18));

		JRadioButton radioButton = new JRadioButton("");
		radioButton.setSelected(true);
		radioButton.setBackground(new Color(57, 62, 70));
		buttonGroup_2.add(radioButton);

		JRadioButton radioButton_1 = new JRadioButton("");
		radioButton_1.setBackground(new Color(57, 62, 70));
		buttonGroup_2.add(radioButton_1);

		JLabel label_10 = new JLabel("");
		label_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				radioButton_1.setSelected(true);
			}
		});
		label_10.setIcon(new ImageIcon(NewShipmentDialog.class.getResource("/pics/plane90x90.png")));

		JLabel label_11 = new JLabel("");
		label_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				radioButton.setSelected(true);
			}
		});
		label_11.setIcon(new ImageIcon(NewShipmentDialog.class.getResource("/pics/ship90x90.png")));

		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newShipment(senderName.getText(), recieverName.getText(), TKtext.getText(), telephoneText.getText(),
						size1Text.getText(), size2Text.getText(), size3Text.getText());

				JOptionPane.showMessageDialog(null,
						"ΑΠΟΣΤΟΛΗ ΚΑΤΑΧΩΡΗΘΗΚΕ: \n \n ΟΝΟΜΑ ΑΠΟΣΤΟΛΕΑ:  " + senderName.getText()
								+ " \n ΟΝΟΜΑ ΠΑΡΑΛΗΠΤΗ:" + recieverName.getText() + "\n ΔΙΕΥΘΥΝΣΗ ΠΑΡΑΛΗΠΤΗ: "
								+ adressText.getText());
				dispose();
			}

		});
		button.setIcon(new ImageIcon(NewShipmentDialog.class.getResource("/pics/box.png")));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(
				Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup().addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(
								gl_panel.createSequentialGroup().addGap(54).addComponent(
										label, GroupLayout.PREFERRED_SIZE, 257, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup().addGap(22).addGroup(gl_panel
								.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel.createSequentialGroup().addComponent(label_1)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 128,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED).addComponent(label_2).addGap(10)
										.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 128,
												GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
										.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 141,
												GroupLayout.PREFERRED_SIZE)
										.addGap(18).addComponent(adressText, GroupLayout.PREFERRED_SIZE, 196,
												GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
										.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 141,
												GroupLayout.PREFERRED_SIZE)
										.addGap(18).addComponent(TKtext, GroupLayout.PREFERRED_SIZE, 196,
												GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
										.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 141,
												GroupLayout.PREFERRED_SIZE)
										.addGap(18).addComponent(telephoneText, GroupLayout.PREFERRED_SIZE, 196,
												GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup().addComponent(label_4)
										.addPreferredGap(ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
										.addComponent(recieverName, GroupLayout.PREFERRED_SIZE, 196,
												GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup().addComponent(label_3).addGap(18)
										.addComponent(senderName, GroupLayout.PREFERRED_SIZE, 196,
												GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup().addGroup(gl_panel
										.createParallelGroup(Alignment.TRAILING)
										.addGroup(Alignment.LEADING,
												gl_panel.createSequentialGroup().addGap(54)
														.addComponent(label_11)
														.addPreferredGap(ComponentPlacement.RELATED, 36,
																Short.MAX_VALUE)
														.addComponent(label_10).addGap(14))
										.addGroup(gl_panel.createSequentialGroup().addComponent(label_8)
												.addPreferredGap(ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
												.addComponent(size1Text, GroupLayout.PREFERRED_SIZE, 53,
														GroupLayout.PREFERRED_SIZE)
												.addGap(18).addComponent(size2Text, GroupLayout.PREFERRED_SIZE, 53,
														GroupLayout.PREFERRED_SIZE)))
										.addGap(18).addComponent(size3Text, GroupLayout.PREFERRED_SIZE, 53,
												GroupLayout.PREFERRED_SIZE))
								.addComponent(button, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 337,
										GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel.createSequentialGroup().addGap(107).addComponent(radioButton).addGap(109)
								.addComponent(radioButton_1, GroupLayout.PREFERRED_SIZE, 21,
										GroupLayout.PREFERRED_SIZE)))
						.addContainerGap())
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup().addContainerGap(128, Short.MAX_VALUE)
						.addComponent(label_9).addGap(127)));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup().addContainerGap()
						.addComponent(label, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
								.addComponent(senderName, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
								.addComponent(recieverName, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 22,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(adressText, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
								.addComponent(TKtext, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(
								gl_panel.createParallelGroup(Alignment.BASELINE)
										.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 22,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(telephoneText, GroupLayout.PREFERRED_SIZE, 21,
												GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_8, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
								.addComponent(size3Text, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
								.addComponent(size2Text, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
								.addComponent(size1Text, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(label_9, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING).addComponent(label_11)
								.addComponent(label_10))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(
								gl_panel.createParallelGroup(Alignment.TRAILING).addComponent(radioButton).addComponent(
										radioButton_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(button, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		panel.setLayout(gl_panel);
		contentPanel.setLayout(gl_contentPanel);

	}

	private void newShipment(String senderName, String recieverName, String TKtext, String telephoneText, String size1,
			String size2, String size3) {
		System.out.println(senderName);
		BufferedWriter writer = null;
		try {
			File orderFile = new File("apostoles.txt");
			System.out.println(orderFile.getCanonicalPath());
			writer = new BufferedWriter(new FileWriter(orderFile, true));
			writer.write(senderName + "," + recieverName + "," + TKtext + "," + telephoneText + "," + size1 + ","
					+ size2 + "," + size3 );
			writer.newLine();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {

				writer.close();
			} catch (Exception e) {
			}
		}
	}
}
