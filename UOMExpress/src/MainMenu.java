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
import java.io.FileNotFoundException;
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
		newPacketbtn.setBackground(new Color(0, 173, 181));
		newPacketbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NewShipmentDialog dial = new NewShipmentDialog();
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
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup().addGap(72)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
										.addComponent(button, GroupLayout.PREFERRED_SIZE, 315,
												GroupLayout.PREFERRED_SIZE)
										.addContainerGap())
								.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
										.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
												.addComponent(newPacketbtn, GroupLayout.DEFAULT_SIZE, 315,
														Short.MAX_VALUE)
												.addComponent(searchBtn, GroupLayout.DEFAULT_SIZE,
														GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addGap(95))))
				.addGroup(Alignment.LEADING,
						groupLayout.createSequentialGroup().addGap(169)
								.addComponent(helpBtn, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
								.addContainerGap(201, Short.MAX_VALUE)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.TRAILING).addGroup(Alignment.LEADING,
				groupLayout.createSequentialGroup().addGap(85)
						.addComponent(newPacketbtn, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(searchBtn, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(button, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE).addGap(18)
						.addComponent(helpBtn, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(49, Short.MAX_VALUE)));
		frmUOMEXPRESS.getContentPane().setLayout(groupLayout);

		frmUOMEXPRESS.setTitle("UOM EXPRESS");
		frmUOMEXPRESS.setBounds(100, 100, 480, 480);
		frmUOMEXPRESS.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
