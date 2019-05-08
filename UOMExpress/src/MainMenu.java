import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Window.Type;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Canvas;
import javax.swing.JProgressBar;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.ButtonGroup;
import javax.swing.JTextArea;
import javax.swing.border.BevelBorder;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.LineBorder;
import javax.swing.JFormattedTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.CompoundBorder;

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

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the application.
	 */
	public MainMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmUOMEXPRESS = new JFrame();
		frmUOMEXPRESS.setResizable(false);
		frmUOMEXPRESS.setMinimumSize(new Dimension(480, 480));
		frmUOMEXPRESS.setIconImage(Toolkit.getDefaultToolkit().getImage(MainMenu.class.getResource("/pics/box.png")));
		frmUOMEXPRESS.getContentPane().setBackground(new Color(57, 62, 70));
		
				JButton newPacketbtn = new JButton("Nέα αποστολή");
				newPacketbtn.setFont(new Font("Calibri", Font.BOLD, 30));
				newPacketbtn.setBackground(new Color(0,173,181));
				newPacketbtn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						NewShipmentDialog dial = new NewShipmentDialog();
						dial.setVisible(true);

					}
				});
		
				JButton searchBtn = new JButton(
						"Αναζήτηση αποστολής");
				searchBtn.setBackground(new Color(0, 173, 181));
				searchBtn.setFont(new Font("Calibri", Font.BOLD, 30));
				searchBtn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						NewSearchDialog searchDial = new NewSearchDialog();
						searchDial.setVisible(true);

					}
				});
		
				JButton helpBtn = new JButton("\u0392\u03BF\u03AE\u03B8\u03B5\u03B9\u03B1");
				helpBtn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
					}
				});
		
		JButton button = new JButton("Κατάσταση μέσων");
		button.setBackground(new Color(0, 173, 181));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setFont(new Font("Calibri", Font.BOLD, 30));
		GroupLayout groupLayout = new GroupLayout(frmUOMEXPRESS.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addGap(72)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(button, GroupLayout.PREFERRED_SIZE, 315, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(newPacketbtn, GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
								.addComponent(searchBtn, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGap(95))))
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addGap(169)
					.addComponent(helpBtn, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(201, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addGap(85)
					.addComponent(newPacketbtn, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(searchBtn, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(button, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(helpBtn, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(49, Short.MAX_VALUE))
		);
		frmUOMEXPRESS.getContentPane().setLayout(groupLayout);

		frmUOMEXPRESS.setTitle("UOM EXPRESS");
		frmUOMEXPRESS.setBounds(100, 100, 480, 480);
		frmUOMEXPRESS.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void allPanelsClose() {
		openSearchPanel(false);
		openShippingPanel(false);

	}

	public void openSearchPanel(boolean bool) {
		JPanel searchPanel = new JPanel();
		searchPanel.setBackground(new Color(57, 62, 70));
		searchPanel.setVisible(bool);
		
		GroupLayout groupLayout = new GroupLayout(frmUOMEXPRESS.getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup().addContainerGap()
						.addComponent(searchPanel, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)

						.addContainerGap()));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addContainerGap()
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING).addComponent(searchPanel,
								GroupLayout.PREFERRED_SIZE, 410, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		JLabel label = new JLabel("ΑΝΑΖΗΤΗΣΗ ΑΠΟΣΤΟΛΗΣ");
		label.setFont(new Font("Calibri", Font.PLAIN, 24));
		label.setForeground(Color.WHITE);

		JLabel label_1 = new JLabel("Πληκτρολογήστε έναν κωδικό παρακολούθησης:");
		label_1.setFont(new Font("Calibri", Font.PLAIN, 18));
		label_1.setForeground(Color.WHITE);

		searchNumberField = new JTextField();
		searchNumberField.setFont(new Font("Calibri", Font.BOLD, 30));
		searchNumberField.setToolTipText("");
		searchNumberField.setColumns(10);

		JPanel searchResultPanel = new JPanel();
		searchResultPanel.setBackground(new Color(0, 173, 181));
		searchResultPanel.setVisible(false);

		/// ΚΟΥΜΠΙ ΑΝΑΖΗΤΗΣΗΣ ΑΠΟΣΤΟΛΗΣ

		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (false) { // EDW NA MPEI O ELEGXOS AN YPARXEI O ARITHMOS
								// PARAKOLOUTHISIS
					JOptionPane.showMessageDialog(null, "ΔΕΝ ΒΡΕΘΗΚΕ ΑΠΟΣΤΟΛΗ ΜΕ ΤΟΝ ΑΡΙΘΜΟ ΠΟΥ ΔΩΣΑΤΕ");
				} else {
					searchResultPanel.setVisible(true);
				}

			}
		});

		///////////////////////////////////////////////////////
		GroupLayout gl_searchPanel = new GroupLayout(searchPanel);
		gl_searchPanel.setHorizontalGroup(gl_searchPanel.createParallelGroup(Alignment.LEADING).addGroup(gl_searchPanel
				.createSequentialGroup()
				.addGroup(gl_searchPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(
								gl_searchPanel.createSequentialGroup().addGap(54).addComponent(label,
										GroupLayout.PREFERRED_SIZE, 268,
										GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_searchPanel.createSequentialGroup().addContainerGap().addGroup(gl_searchPanel
								.createParallelGroup(Alignment.LEADING)
								.addComponent(label_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addGroup(gl_searchPanel.createSequentialGroup().addGap(10).addGroup(gl_searchPanel
										.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(searchResultPanel, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
										.addGroup(Alignment.LEADING, gl_searchPanel.createSequentialGroup()
												.addComponent(searchNumberField, GroupLayout.PREFERRED_SIZE, 210,
														GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(btnSearch,
														GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)))
										.addGap(108)))))
				.addContainerGap()));
		gl_searchPanel.setVerticalGroup(gl_searchPanel.createParallelGroup(Alignment.LEADING).addGroup(gl_searchPanel
				.createSequentialGroup().addContainerGap()
				.addComponent(label, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED).addComponent(label_1)
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(gl_searchPanel.createParallelGroup(Alignment.LEADING)
						.addComponent(searchNumberField, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnSearch, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addComponent(searchResultPanel, GroupLayout.PREFERRED_SIZE, 253, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(25, Short.MAX_VALUE)));
		// PROGRESSBAR
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBorderPainted(false);
		progressBar.setValue(80);

		JLabel label_2 = new JLabel("H αποστολή σας φτάνει στις: ");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Calibri", Font.PLAIN, 18));

		JButton button = new JButton("Κλείσιμο");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				searchPanel.setVisible(false);
				

			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 22));
		GroupLayout gl_searchResultPanel = new GroupLayout(searchResultPanel);
		gl_searchResultPanel.setHorizontalGroup(gl_searchResultPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_searchResultPanel.createSequentialGroup().addGroup(gl_searchResultPanel
						.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_searchResultPanel.createSequentialGroup().addContainerGap()
								.addGroup(gl_searchResultPanel.createParallelGroup(Alignment.LEADING)
										.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 222,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(progressBar, GroupLayout.PREFERRED_SIZE, 285,
												GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_searchResultPanel.createSequentialGroup().addGap(39).addComponent(button,
								GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(16, Short.MAX_VALUE)));
		gl_searchResultPanel.setVerticalGroup(gl_searchResultPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_searchResultPanel.createSequentialGroup().addContainerGap(106, Short.MAX_VALUE)
						.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(progressBar, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(button, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE).addGap(13)));
		searchResultPanel.setLayout(gl_searchResultPanel);
		searchPanel.setLayout(gl_searchPanel);

		frmUOMEXPRESS.getContentPane().setLayout(groupLayout);
		
	}

	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public void openShippingPanel(boolean bool) {
		JScrollPane scrollPane = new JScrollPane();
		JPanel newShipmentPanel = new JPanel();
		newShipmentPanel.setVisible(true);
		newShipmentPanel.setVisible(bool);
		
		if (bool) {
			newShipmentPanel.setBackground(new Color(57, 62, 70));
			GroupLayout groupLayout = new GroupLayout(frmUOMEXPRESS.getContentPane());
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
			buttonGroup.add(radioButtonShip);
			radioButtonShip.setSelected(true);
			radioButtonShip.setBackground(new Color(57, 62, 70));

			JRadioButton radioButtonPlane = new JRadioButton("");
			buttonGroup.add(radioButtonPlane);
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
					newShipmentPanel.setVisible(false);

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

			frmUOMEXPRESS.getContentPane().setLayout(groupLayout);

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
