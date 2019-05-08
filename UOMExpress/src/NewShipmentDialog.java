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
		contentPanel.setBackground(new Color(57,62,70));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(57,62,70));
		
		JLabel label_12 = new JLabel("");
		label_12.setIcon(new ImageIcon(NewShipmentDialog.class.getResource("/pics/logo400X400.png")));
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 387, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(label_12, GroupLayout.PREFERRED_SIZE, 394, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 443, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_12, GroupLayout.PREFERRED_SIZE, 440, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
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
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Θεσσαλονίκη"}));
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Αθήνα"}));
		
		senderName = new JTextField();
		senderName.setColumns(10);
		
		recieverName = new JTextField();
		recieverName.setColumns(10);
		
		adressText = new JTextField();
		adressText.setColumns(10);
		
		TKtext = new JTextField();
		TKtext.setColumns(10);
		
		telephoneText = new JTextField();
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
		radioButton.setBackground(new Color(57,62,70));
		buttonGroup_2.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("");
		radioButton_1.setBackground(new Color(57,62,70));
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
				JOptionPane.showMessageDialog(null,
						"ΑΠΟΣΤΟΛΗ ΚΑΤΑΧΩΡΗΘΗΚΕ: \n \n ΟΝΟΜΑ ΑΠΟΣΤΟΛΕΑ:  " + senderName.getText()
								+ " \n ΟΝΟΜΑ ΠΑΡΑΛΗΠΤΗ:" + recieverName.getText() + "\n ΔΙΕΥΘΥΝΣΗ ΠΑΡΑΛΗΠΤΗ: "
								+ adressText.getText());
				dispose();
			}
		});
		button.setIcon(new ImageIcon(NewShipmentDialog.class.getResource("/pics/box.png")));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(54)
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 257, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(22)
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(label_1)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(label_2)
									.addGap(10)
									.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(adressText, GroupLayout.PREFERRED_SIZE, 196, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(TKtext, GroupLayout.PREFERRED_SIZE, 196, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(telephoneText, GroupLayout.PREFERRED_SIZE, 196, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(label_4)
									.addPreferredGap(ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
									.addComponent(recieverName, GroupLayout.PREFERRED_SIZE, 196, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(label_3)
									.addGap(18)
									.addComponent(senderName, GroupLayout.PREFERRED_SIZE, 196, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
									.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_panel.createSequentialGroup()
											.addGap(54)
											.addComponent(label_11)
											.addPreferredGap(ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
											.addComponent(label_10)
											.addGap(13))
										.addGroup(gl_panel.createSequentialGroup()
											.addComponent(label_8)
											.addPreferredGap(ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
											.addComponent(size1Text, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
											.addGap(18)
											.addComponent(size2Text, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)))
									.addGap(18)
									.addComponent(size3Text, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))
								.addComponent(button, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 337, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(128)
							.addComponent(label_9))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(107)
							.addComponent(radioButton)
							.addGap(110)
							.addComponent(radioButton_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
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
						.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(adressText, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(TKtext, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(telephoneText, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_8, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(size3Text, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(size2Text, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(size1Text, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(label_9, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(label_10)
						.addComponent(label_11))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(radioButton)
						.addComponent(radioButton_1, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(button, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		contentPanel.setLayout(gl_contentPanel);

		
	}

	public void openShippingPanel(boolean bool) {
		JScrollPane scrollPane = new JScrollPane();
		JPanel newShipmentPanel = new JPanel();
		newShipmentPanel.setVisible(true);
		newShipmentPanel.setVisible(bool);
		
		if (bool) {
			newShipmentPanel.setBackground(new Color(57, 62, 70));
			GroupLayout groupLayout = new GroupLayout(contentPanel.getRootPane());
			groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
					.addGroup(groupLayout.createSequentialGroup().addContainerGap()
							.addComponent(newShipmentPanel, GroupLayout.PREFERRED_SIZE, 369, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED).addGap(27).addComponent(scrollPane,
									GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(0)));
			groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
					.addGroup(groupLayout.createSequentialGroup().addContainerGap()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
									.addComponent(newShipmentPanel, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 416,
											Short.MAX_VALUE)
									.addGroup(groupLayout.createSequentialGroup()
											.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING).addComponent(
													scrollPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
													GroupLayout.PREFERRED_SIZE))
											.addContainerGap()))));

			JLabel label = new JLabel("\u0391\u03C0\u03CC");
			label.setForeground(Color.WHITE);
			label.setFont(new Font("Calibri", Font.BOLD, 18));

			JComboBox comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(
					new String[] { "\u0398\u03B5\u03C3\u03C3\u03B1\u03BB\u03BF\u03BD\u03AF\u03BA\u03B7" }));

			JLabel label_1 = new JLabel("\u03A0\u03C1\u03BF\u03C2");
			label_1.setForeground(Color.WHITE);
			label_1.setFont(new Font("Calibri", Font.BOLD, 18));

			JComboBox comboBox_1 = new JComboBox();
			comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "\u0391\u03B8\u03AE\u03BD\u03B1" }));
			comboBox_1.setToolTipText("");

			textField = new JTextField();
			textField.setColumns(10);

			JLabel label_2 = new JLabel(
					"\u038C\u03BD\u03BF\u03BC\u03B1 \u03B1\u03C0\u03BF\u03C3\u03C4\u03BF\u03BB\u03AD\u03B1");
			label_2.setForeground(Color.WHITE);
			label_2.setFont(new Font("Calibri", Font.BOLD, 18));

			JLabel label_3 = new JLabel(
					"\u038C\u03BD\u03BF\u03BC\u03B1 \u03C0\u03B1\u03C1\u03B1\u03BB\u03AE\u03C0\u03C4\u03B7");
			label_3.setForeground(Color.WHITE);
			label_3.setFont(new Font("Calibri", Font.BOLD, 18));

			textField_1 = new JTextField();
			textField_1.setColumns(10);

			JLabel label_4 = new JLabel("\u0394/\u03C3\u03B7 \u03C0\u03B1\u03C1\u03B1\u03BB\u03AE\u03C0\u03C4\u03B7");
			label_4.setForeground(Color.WHITE);
			label_4.setFont(new Font("Calibri", Font.BOLD, 18));

			textField_2 = new JTextField();
			textField_2.setColumns(10);

			JLabel label_5 = new JLabel(
					"\u03A4\u03B1\u03C7\u03C5\u03B4\u03C1. \u039A\u03CE\u03B4\u03B9\u03BA\u03B1\u03C2");
			label_5.setForeground(Color.WHITE);
			label_5.setFont(new Font("Calibri", Font.BOLD, 18));

			textField_3 = new JTextField();
			textField_3.setColumns(10);

			JLabel label_6 = new JLabel("\u03A4\u03B7\u03BB\u03AD\u03C6\u03C9\u03BD\u03BF");
			label_6.setForeground(Color.WHITE);
			label_6.setFont(new Font("Calibri", Font.BOLD, 18));

			textField_4 = new JTextField();
			textField_4.setColumns(10);

			JLabel label_7 = new JLabel("\u0394\u03B9\u03B1\u03C3\u03C4\u03AC\u03C3\u03B5\u03B9\u03C2");
			label_7.setForeground(Color.WHITE);
			label_7.setFont(new Font("Calibri", Font.BOLD, 18));

			textField_5 = new JTextField();
			textField_5.setText("\u039C");
			textField_5.setColumns(10);

			textField_6 = new JTextField();
			textField_6.setText("\u03A0");
			textField_6.setColumns(10);

			textField_7 = new JTextField();
			textField_7.setText("\u0392");
			textField_7.setColumns(10);

			JLabel label_8 = new JLabel(
					"\u0395\u03C0\u03B9\u03BB\u03BF\u03B3\u03AE \u03BC\u03AD\u03C3\u03BF\u03C5 \u03B1\u03C0\u03BF\u03C3\u03C4\u03BF\u03BB\u03AE\u03C2:");
			label_8.setForeground(Color.WHITE);
			label_8.setFont(new Font("Calibri", Font.BOLD, 18));

			JRadioButton radioButtonShip = new JRadioButton("");
			
			radioButtonShip.setSelected(true);
			radioButtonShip.setBackground(new Color(57, 62, 70));

			JRadioButton radioButtonPlane = new JRadioButton("");
	
			radioButtonPlane.setBackground(new Color(57, 62, 70));

			// BUTTON KATAXWRISIS STOIXEIWN KAI APOTHIKEUSHS THS APOSTOLIS,
			// EPISHS KANEI INVISIBLE TO PANEL, ARGOTERA ISWS EMFANISEI STHN
			// SINEXEIA TO MAIN MENU
			JButton button_4 = new JButton("");
			button_4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					JOptionPane.showMessageDialog(null,
							"ΑΠΟΣΤΟΛΗ ΚΑΤΑΧΩΡΗΘΗΚΕ: \n \n ΟΝΟΜΑ ΑΠΟΣΤΟΛΕΑ:  " + textField.getText()
									+ " \n ΟΝΟΜΑ ΠΑΡΑΛΗΠΤΗ:" + textField_1.getText() + "\n ΔΙΕΥΘΥΝΣΗ ΠΑΡΑΛΗΠΤΗ: "
									+ textField_2.getText());
					dispose();
				

				}
			});
			button_4.setIcon(new ImageIcon(MainMenu.class.getResource("/pics/box.png")));
			button_4.setIconTextGap(15);
			button_4.setActionCommand("");

			JLabel lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setIcon(new ImageIcon(MainMenu.class.getResource("/pics/ship90x90.png")));

			JLabel label_9 = new JLabel("\u039D\u0395\u0391 \u0391\u03A0\u039F\u03A3\u03A4\u039F\u039B\u0397");
			label_9.setForeground(Color.WHITE);
			label_9.setFont(new Font("Calibri", Font.BOLD, 24));

			JLabel label_10 = new JLabel("");
			label_10.setIcon(new ImageIcon(MainMenu.class.getResource("/pics/plane90x90.png")));

			contentPanel.getRootPane().setLayout(groupLayout);

			GroupLayout gl_newShipmentPanel = new GroupLayout(newShipmentPanel);
			gl_newShipmentPanel.setHorizontalGroup(gl_newShipmentPanel.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_newShipmentPanel.createSequentialGroup().addGroup(gl_newShipmentPanel
							.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_newShipmentPanel.createSequentialGroup().addGap(97).addComponent(label_9))
							.addGroup(gl_newShipmentPanel.createSequentialGroup().addContainerGap()
									.addGroup(gl_newShipmentPanel.createParallelGroup(Alignment.LEADING)
											.addGroup(gl_newShipmentPanel.createSequentialGroup()
													.addComponent(label, GroupLayout.PREFERRED_SIZE, 40,
															GroupLayout.PREFERRED_SIZE)
													.addGap(4)
													.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 104,
															GroupLayout.PREFERRED_SIZE)
													.addGap(18)
													.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 40,
															GroupLayout.PREFERRED_SIZE)
													.addGap(18).addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE,
															104, GroupLayout.PREFERRED_SIZE))
											.addGroup(gl_newShipmentPanel.createSequentialGroup()
													.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 141,
															GroupLayout.PREFERRED_SIZE)
													.addGap(7).addComponent(textField, GroupLayout.PREFERRED_SIZE, 180,
															GroupLayout.PREFERRED_SIZE))
											.addGroup(gl_newShipmentPanel.createSequentialGroup()
													.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 144,
															GroupLayout.PREFERRED_SIZE)
													.addGap(4).addComponent(textField_1, GroupLayout.PREFERRED_SIZE,
															180, GroupLayout.PREFERRED_SIZE))
											.addGroup(gl_newShipmentPanel.createSequentialGroup()
													.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 135,
															GroupLayout.PREFERRED_SIZE)
													.addGap(13).addComponent(textField_2, GroupLayout.PREFERRED_SIZE,
															180, GroupLayout.PREFERRED_SIZE))
											.addGroup(gl_newShipmentPanel.createSequentialGroup()
													.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 135,
															GroupLayout.PREFERRED_SIZE)
													.addGap(13).addComponent(textField_3, GroupLayout.PREFERRED_SIZE,
															180, GroupLayout.PREFERRED_SIZE))
											.addGroup(gl_newShipmentPanel.createSequentialGroup()
													.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 135,
															GroupLayout.PREFERRED_SIZE)
													.addGap(13).addComponent(textField_4, GroupLayout.PREFERRED_SIZE,
															180, GroupLayout.PREFERRED_SIZE))
											.addGroup(gl_newShipmentPanel.createSequentialGroup()
													.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 135,
															GroupLayout.PREFERRED_SIZE)
													.addGap(13)
													.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, 45,
															GroupLayout.PREFERRED_SIZE)
													.addGap(19)
													.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, 45,
															GroupLayout.PREFERRED_SIZE)
													.addGap(18).addComponent(textField_7, GroupLayout.PREFERRED_SIZE,
															45, GroupLayout.PREFERRED_SIZE))
											.addGroup(gl_newShipmentPanel.createSequentialGroup().addGap(96)
													.addComponent(radioButtonShip).addGap(86)
													.addComponent(radioButtonPlane, GroupLayout.PREFERRED_SIZE, 21,
															GroupLayout.PREFERRED_SIZE))))
							.addGroup(gl_newShipmentPanel.createSequentialGroup().addGap(70)
									.addGroup(gl_newShipmentPanel.createParallelGroup(Alignment.LEADING)
											.addComponent(label_8, GroupLayout.PREFERRED_SIZE, 206,
													GroupLayout.PREFERRED_SIZE)
											.addGroup(gl_newShipmentPanel.createSequentialGroup()
													.addComponent(lblNewLabel_1).addGap(18).addComponent(label_10,
															GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))))
							.addGroup(gl_newShipmentPanel.createSequentialGroup().addGap(57).addComponent(button_4,
									GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE)))
							.addContainerGap(31, Short.MAX_VALUE)));
			gl_newShipmentPanel.setVerticalGroup(gl_newShipmentPanel.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_newShipmentPanel.createSequentialGroup().addComponent(label_9)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_newShipmentPanel
									.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_newShipmentPanel.createSequentialGroup().addGap(1).addComponent(label,
											GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
									.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
											GroupLayout.PREFERRED_SIZE)
									.addGroup(gl_newShipmentPanel.createSequentialGroup().addGap(1).addComponent(
											label_1, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
									.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
											GroupLayout.PREFERRED_SIZE))
							.addGap(6)
							.addGroup(gl_newShipmentPanel.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_newShipmentPanel.createSequentialGroup().addGap(1).addComponent(
											label_2, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
									.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
											GroupLayout.PREFERRED_SIZE))
							.addGap(6)
							.addGroup(gl_newShipmentPanel
									.createParallelGroup(Alignment.LEADING)
									.addGroup(
											gl_newShipmentPanel.createSequentialGroup().addGap(1).addComponent(label_3,
													GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
									.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
											GroupLayout.PREFERRED_SIZE))
							.addGap(6)
							.addGroup(gl_newShipmentPanel
									.createParallelGroup(Alignment.LEADING).addGroup(
											gl_newShipmentPanel.createSequentialGroup().addGap(1).addComponent(label_4,
													GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
									.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
											GroupLayout.PREFERRED_SIZE))
							.addGap(6)
							.addGroup(gl_newShipmentPanel.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_newShipmentPanel.createSequentialGroup().addGap(1).addComponent(
											label_5, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
									.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
											GroupLayout.PREFERRED_SIZE))
							.addGap(6)
							.addGroup(gl_newShipmentPanel
									.createParallelGroup(Alignment.LEADING)
									.addGroup(gl_newShipmentPanel.createSequentialGroup().addGap(1).addComponent(
											label_6, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
									.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
											GroupLayout.PREFERRED_SIZE))
							.addGap(6)
							.addGroup(gl_newShipmentPanel
									.createParallelGroup(Alignment.LEADING).addGroup(
											gl_newShipmentPanel.createSequentialGroup().addGap(1).addComponent(label_7,
													GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE))
									.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
											GroupLayout.PREFERRED_SIZE)
									.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
											GroupLayout.PREFERRED_SIZE)
									.addComponent(textField_7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
											GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(label_8, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_newShipmentPanel.createParallelGroup(Alignment.LEADING)
									.addComponent(lblNewLabel_1)
									.addComponent(label_10, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(
									gl_newShipmentPanel.createParallelGroup(Alignment.LEADING)
											.addComponent(radioButtonShip, GroupLayout.DEFAULT_SIZE, 26,
													Short.MAX_VALUE)
											.addComponent(radioButtonPlane, GroupLayout.PREFERRED_SIZE, 21,
													GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED).addComponent(button_4).addGap(31)));
			newShipmentPanel.setLayout(gl_newShipmentPanel);

		}
	}
}
