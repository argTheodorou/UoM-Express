import java.awt.BorderLayout;
import java.awt.Color;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.Dimension;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import java.text.SimpleDateFormat;

import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

import java.awt.Toolkit;

public class NewShipmentDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField senderNameField;
	private JTextField recieverNameField;
	private JTextField adressTextField;
	private JTextField postCodeTextField;
	private JTextField telephoneText;
	private JTextField size1TextField; 
	private JTextField size2TextField;
	private JTextField size3TextField;

	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	

	public NewShipmentDialog() throws IOException {

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

		JLabel titleLabel = new JLabel("ΦΟΡΜΑ ΝΕΑΣ ΑΠΟΣΤΟΛΗΣ");
		titleLabel.setFont(new Font("Calibri", Font.BOLD, 22));
		titleLabel.setForeground(Color.WHITE);

		JLabel label_1 = new JLabel("Από");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Calibri", Font.BOLD, 18));

		JLabel label_2 = new JLabel("Προς");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Calibri", Font.BOLD, 18));

		JLabel senderNameLabel = new JLabel("Όνομα αποστολέα");
		senderNameLabel.setForeground(Color.WHITE);
		senderNameLabel.setFont(new Font("Calibri", Font.BOLD, 18));

		JLabel recieverNameLabel = new JLabel("Όνομα παραλήπτη");
		recieverNameLabel.setForeground(Color.WHITE);
		recieverNameLabel.setFont(new Font("Calibri", Font.BOLD, 18));

		JLabel adressLabel = new JLabel("Δ/ση παραλήπτη");
		adressLabel.setForeground(Color.WHITE);
		adressLabel.setFont(new Font("Calibri", Font.BOLD, 18));

		JLabel postCodeLabel = new JLabel("Ταχυδρ. Κώδικας");
		postCodeLabel.setForeground(Color.WHITE);
		postCodeLabel.setFont(new Font("Calibri", Font.BOLD, 18));

		JLabel telephoneLabel = new JLabel("Τηλέφωνο");
		telephoneLabel.setForeground(Color.WHITE);
		telephoneLabel.setFont(new Font("Calibri", Font.BOLD, 18));

		JLabel dimensionsLabel = new JLabel("Διαστάσεις");
		dimensionsLabel.setForeground(Color.WHITE);
		dimensionsLabel.setFont(new Font("Calibri", Font.BOLD, 18));
			
		//έχει εξηγηθεί στην αναφορά επισκόπησης η μη-αξιοποίηση των 2 αυτών combobox.
		//έμειναν μέσα επίτηδες για χρήση τους στο μέλλον
		//όπου το πρόγραμμα θα αποστέλνει πακέτα στο εξωτερικό και η χρέωση θα είναι διαφορετική ανα χώρα (άρα ανά combobox επιλογή)
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Ελλάδα" }));

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "Ελλάδα" } ));
		

		senderNameField = new JTextField();
		senderNameField.setFont(new Font("Calibri", Font.BOLD, 14));
		senderNameField.setColumns(10);

		recieverNameField = new JTextField();
		recieverNameField.setFont(new Font("Calibri", Font.BOLD, 14));
		recieverNameField.setColumns(10);

		adressTextField = new JTextField();
		adressTextField.setFont(new Font("Calibri", Font.BOLD, 14));
		adressTextField.setColumns(10);

		postCodeTextField = new JTextField();
		postCodeTextField.setFont(new Font("Calibri", Font.BOLD, 14));
		postCodeTextField.setColumns(10);

		telephoneText = new JTextField();
		telephoneText.setFont(new Font("Calibri", Font.BOLD, 14));
		telephoneText.setColumns(10);

		size1TextField = new JTextField();
		size1TextField.setColumns(10);

		size2TextField = new JTextField();
		size2TextField.setColumns(10);

		size3TextField = new JTextField();
		size3TextField.setColumns(10);

		JLabel shippingMethodLabel = new JLabel("Μέσο αποστολής");
		shippingMethodLabel.setForeground(Color.WHITE);
		shippingMethodLabel.setFont(new Font("Calibri", Font.BOLD, 18));

		JRadioButton radioButtonShip = new JRadioButton("");
		radioButtonShip.setSelected(true);
		radioButtonShip.setBackground(new Color(57, 62, 70));
		buttonGroup_2.add(radioButtonShip);

		JRadioButton radioButtonPlane = new JRadioButton("");
		radioButtonPlane.setBackground(new Color(57, 62, 70));
		buttonGroup_2.add(radioButtonPlane);
       
		//the following lines of code enable the pictures above the radiobuttons to be clickable and change the values of those radiobuttons
		JLabel planePicture = new JLabel("");
		planePicture.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				radioButtonPlane.setSelected(true);
			}
		});
		planePicture.setIcon(new ImageIcon(NewShipmentDialog.class.getResource("/pics/plane90x90.png")));

		JLabel shipPicture = new JLabel("");
		shipPicture.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				radioButtonShip.setSelected(true);
			}
		});
		shipPicture.setIcon(new ImageIcon(NewShipmentDialog.class.getResource("/pics/ship90x90.png")));

		
		//creates the txt file that contains the capacity of the two available transfer methods
		//only creates the file if it doesnt exist already.
		//first number will be the  size of the ship and the second for the airplane
		//numbers represent square centimeters to match user input dimensions that's going to be in centimeters
		File f = new File("src/textFiles","capacity.txt");
		if(!(f.exists() && !f.isDirectory())) 
			setCapacity("8200000","35000000");
	

		
		
	

		
		
		JButton button = new JButton("");

		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				//saves the selected radiobutton to a string that is later saved in apostoles.txt list
				String selectedShippingMethod;
				if (radioButtonPlane.isSelected())
					selectedShippingMethod = "PL";
				else 
					selectedShippingMethod = "SH";
				
				// IF INPUT IS VALIDATED AND RESULT OF TEST IS TRUE, THEN THE
				// ORDER IS PROCESSED AND ADDED TO THE LIST
				boolean inputIsCorrect = true;
				inputIsCorrect = validateInput(senderNameField.getText(), recieverNameField.getText(), postCodeTextField.getText(),
						telephoneText.getText(), size1TextField.getText(), size2TextField.getText(), size3TextField.getText());
			
				if (inputIsCorrect){  	
				try {
					if(reduceCapacity("src/textFiles/capacity.txt", size1TextField.getText(), size2TextField.getText(), size3TextField.getText(), 
							selectedShippingMethod)){
						//checks if there is enough space in the selected transportation method.
						
					}
					else
						inputIsCorrect = false;
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				}
				}
				
				if (inputIsCorrect) {  //only if inputIsCorrect is STILL true, the shipping gets added to the list.
					String trackingNumber = null;
					try {   //newShipment saves the order in the file and returns the trackingNumber so it can be given to the user/customer. 
						trackingNumber = newShipment(senderNameField.getText(), recieverNameField.getText(), postCodeTextField.getText(), telephoneText.getText(),
								size1TextField.getText(), size2TextField.getText(), size3TextField.getText(), selectedShippingMethod);
					} catch (FileNotFoundException e1) {
						e1.printStackTrace();
					}
					
					//prints the "SUCCESS" message with the important data that was entered and the newly created trackingNumber
					JOptionPane.showMessageDialog(null,
							        "ΑΠΟΣΤΟΛΗ ΚΑΤΑΧΩΡΗΘΗΚΕ: \n \n ΟΝΟΜΑ ΑΠΟΣΤΟΛΕΑ:  " 
									+ senderNameField.getText()
									+ " \n ΟΝΟΜΑ ΠΑΡΑΛΗΠΤΗ:" + recieverNameField.getText() 
									+ "\n ΔΙΕΥΘΥΝΣΗ ΠΑΡΑΛΗΠΤΗ: "
									+ adressTextField.getText()
									+ "\n ΚΩΔΙΚΟΣ ΑΝΑΖΗΤΗΣΗΣ: " 
									+trackingNumber
									+ "\n ΚΟΣΤΟΣ ΑΠΟΣΤΟΛΗΣ: "
									+ calculateCost(size1TextField.getText(), size2TextField.getText(), size3TextField.getText(), selectedShippingMethod)
									+ "ΕΥΡΩ");
					dispose();
				}

			}

			

		});

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
											//DIALOG FORMATING SECTION START
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		button.setIcon(new ImageIcon(NewShipmentDialog.class.getResource("/pics/box.png")));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(
				Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup().addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(
								gl_panel.createSequentialGroup().addGap(54).addComponent(
										titleLabel, GroupLayout.PREFERRED_SIZE, 257, GroupLayout.PREFERRED_SIZE))
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
										.addComponent(adressLabel, GroupLayout.PREFERRED_SIZE, 141,
												GroupLayout.PREFERRED_SIZE)
										.addGap(18).addComponent(adressTextField, GroupLayout.PREFERRED_SIZE, 196,
												GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
										.addComponent(postCodeLabel, GroupLayout.PREFERRED_SIZE, 141,
												GroupLayout.PREFERRED_SIZE)
										.addGap(18).addComponent(postCodeTextField, GroupLayout.PREFERRED_SIZE, 196,
												GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup()
										.addComponent(telephoneLabel, GroupLayout.PREFERRED_SIZE, 141,
												GroupLayout.PREFERRED_SIZE)
										.addGap(18).addComponent(telephoneText, GroupLayout.PREFERRED_SIZE, 196,
												GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup().addComponent(recieverNameLabel)
										.addPreferredGap(ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
										.addComponent(recieverNameField, GroupLayout.PREFERRED_SIZE, 196,
												GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup().addComponent(senderNameLabel).addGap(18)
										.addComponent(senderNameField, GroupLayout.PREFERRED_SIZE, 196,
												GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panel.createSequentialGroup().addGroup(gl_panel
										.createParallelGroup(Alignment.TRAILING)
										.addGroup(Alignment.LEADING,
												gl_panel.createSequentialGroup().addGap(54)
														.addComponent(shipPicture)
														.addPreferredGap(ComponentPlacement.RELATED, 36,
																Short.MAX_VALUE)
														.addComponent(planePicture).addGap(14))
										.addGroup(gl_panel.createSequentialGroup().addComponent(dimensionsLabel)
												.addPreferredGap(ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
												.addComponent(size1TextField, GroupLayout.PREFERRED_SIZE, 53,
														GroupLayout.PREFERRED_SIZE)
												.addGap(18).addComponent(size2TextField, GroupLayout.PREFERRED_SIZE, 53,
														GroupLayout.PREFERRED_SIZE)))
										.addGap(18).addComponent(size3TextField, GroupLayout.PREFERRED_SIZE, 53,
												GroupLayout.PREFERRED_SIZE))
								.addComponent(button, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 337,
										GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel.createSequentialGroup().addGap(107).addComponent(radioButtonShip).addGap(109)
								.addComponent(radioButtonPlane, GroupLayout.PREFERRED_SIZE, 21,
										GroupLayout.PREFERRED_SIZE)))
						.addContainerGap())
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup().addContainerGap(128, Short.MAX_VALUE)
						.addComponent(shippingMethodLabel).addGap(127)));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup().addContainerGap()
						.addComponent(titleLabel, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
								.addComponent(comboBox_1, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(senderNameLabel, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
								.addComponent(senderNameField, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(recieverNameLabel, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
								.addComponent(recieverNameField, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(adressLabel, GroupLayout.PREFERRED_SIZE, 22,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(adressTextField, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(postCodeLabel, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
								.addComponent(postCodeTextField, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(
								gl_panel.createParallelGroup(Alignment.BASELINE)
										.addComponent(telephoneLabel, GroupLayout.PREFERRED_SIZE, 22,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(telephoneText, GroupLayout.PREFERRED_SIZE, 21,
												GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(dimensionsLabel, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
								.addComponent(size3TextField, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
								.addComponent(size2TextField, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
								.addComponent(size1TextField, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(shippingMethodLabel, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING).addComponent(shipPicture)
								.addComponent(planePicture))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(
								gl_panel.createParallelGroup(Alignment.TRAILING).addComponent(radioButtonShip).addComponent(
										radioButtonPlane, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(button, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		panel.setLayout(gl_panel);
		contentPanel.setLayout(gl_contentPanel);

	}
	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
														//DIALOG FORMATING SECTION FINISH
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	
	//newShipment is used after the User's input has passed the capacity and the validation tests.
	//here, the values given by the user get written in a .txt file.
	//every new shipment order is written in its own line, so that search based on line can be done later on and by other classes/functions of the programm.
	private String newShipment(String senderName, String recieverName, String TKtext, String telephoneText, String size1,
			String size2, String size3, String selectedShippingMethod) throws FileNotFoundException {
		BufferedWriter writer = null;
		String barcode = trackNumberGenerator();	//gets the tracking number
		try {
			File orderFile = new File("src/textFiles","apostoles.txt");			//creates the file for saving the orders. if it exists already, only new orders get added to it
			System.out.println(orderFile.getCanonicalPath());		//shows the path of the file created in the console. might remove later
			writer = new BufferedWriter(new FileWriter(orderFile, true));	
			
			
			
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			//Getting current date
			Calendar cal = Calendar.getInstance();
			//Displaying current date in the desired format
			
			if (selectedShippingMethod == "SH"){
				//Number of Days to add
			        cal.add(Calendar.DAY_OF_MONTH, 7);  
			}
			else
			{
				//Number of Days to add
			        cal.add(Calendar.DAY_OF_MONTH, 3);  
			}
			//Date after adding the days to the current date
			String dateOfArrival = sdf.format(cal.getTime());  
			//Displaying the new Date after addition of Days to current date
		
				
			
			
			writer.write(barcode + "," + senderName + "," + recieverName + "," + TKtext + "," + telephoneText + ","
					+ size1 + "," + size2 + "," + size3 + "," + selectedShippingMethod + "," + dateOfArrival );
			
			

			writer.newLine();  //new line here so that every order gets saved in its own line/

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (Exception e) {
			}
		}
		
		return barcode;
		
	}
	
	
	private String calculateCost(String size1, String size2, String size3, String selectedShippingMethod) {
		String cost = null;
		int volume = Integer.parseInt(size1)+Integer.parseInt(size2)+Integer.parseInt(size3);
		if(selectedShippingMethod == "SH"){
			cost = String.valueOf(volume *0.3);
		}else
			cost = String.valueOf(volume * 0.5);
		return cost;
	}
	
	public void setCapacity(String shipSize, String planeSize) {
		PrintWriter capacityWriter = null;
		try {
			File capacityFile = new File("src/textFiles","capacity.txt");
			System.out.println(capacityFile.getCanonicalPath());
			capacityWriter = new PrintWriter(new FileWriter(capacityFile));
			capacityWriter.write(shipSize + "," + planeSize);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				capacityWriter.close();
			} catch (Exception e) {
			}
		}
		
		
	}
	
	
	//reduceCapacity: takes the 3 dimensions of the packet that the user wants to ship and checks if there is enough space left in the shipping method that was selected
	//if capacity is enough, TRUE is returned and the size of the remaining space in the shipping method gets reduced accordingly.
	//if there is not enough space, the user gets to chose the other shipping method instead or abandon the process entirely.
	private boolean reduceCapacity(String fileName, String size1, String size2, String size3, String toBeReduced) throws FileNotFoundException{
		Scanner scan = new Scanner(new File(fileName));
		String[] separatedByCommasMethod = null;
		int packetSizeInVolume = Integer.parseInt(size1)*Integer.parseInt(size2)*Integer.parseInt(size3);
		
		while (scan.hasNext()) {
		 
			String line = scan.nextLine();
				separatedByCommasMethod = line.split(",");  //pushes the selected line into an array.every String is put in a different field. starting at [0]
				
				if (toBeReduced == "SH"){ 
				
					if((Integer.parseInt(separatedByCommasMethod[0])) > packetSizeInVolume)
					{
					separatedByCommasMethod[0] = String.valueOf(Integer.parseInt(separatedByCommasMethod[0]) - packetSizeInVolume);
					setCapacity(separatedByCommasMethod[0],separatedByCommasMethod[1]);
					return true;
					}
					else 
						JOptionPane.showMessageDialog(null, "ΜΕΤΑΦΟΡΙΚΟ ΜΕΣΟ ΓΕΜΑΤΟ, ΔΙΑΛΕΞΤΕ ΤΟ ΑΛΛΟ ΙΣΩΣ ΕΧΕΙ ΧΩΡΟ");
				}
				else{
					if((Integer.parseInt(separatedByCommasMethod[1]) - packetSizeInVolume) > 0)
					{
						separatedByCommasMethod[1] = String.valueOf(Integer.parseInt(separatedByCommasMethod[1]) - packetSizeInVolume);
						setCapacity(separatedByCommasMethod[0],separatedByCommasMethod[1]);
						return true;
					}
					else 
						JOptionPane.showMessageDialog(null, "ΜΕΤΑΦΟΡΙΚΟ ΜΕΣΟ ΓΕΜΑΤΟ, ΔΙΑΛΕΞΤΕ ΤΟ ΑΛΛΟ ΙΣΩΣ ΕΧΕΙ ΧΩΡΟ");
					
						
					
				}
				
			}
		return false;
		
	

	}


	private String trackNumberGenerator() {
		// creates a unique tracking number for each order based on time values and a random number at the end.
		
		Random rand = new Random();

		String month = Integer.toString(Calendar.getInstance().get(Calendar.MONTH));
		String day = Integer.toString(Calendar.getInstance().get(Calendar.DATE));
		String hour = Integer.toString(Calendar.getInstance().get(Calendar.HOUR_OF_DAY));
		String minute = Integer.toString(Calendar.getInstance().get(Calendar.MINUTE));
		String second = Integer.toString(Calendar.getInstance().get(Calendar.SECOND));
		int randomNumber = 100 + rand.nextInt(900);

		String trackNumber = "GR" + month + day + hour + minute + second + randomNumber;
		if (trackNumber.length() < 14)
			trackNumber = trackNumber + "0";
		if (trackNumber.length() < 14)
			trackNumber = trackNumber + "0";
		if (trackNumber.length() < 14)
			trackNumber = trackNumber + "0";
		if (trackNumber.length() < 14)
			trackNumber = trackNumber + "0";
		//ελέγχει αν ο κωδικός αναζήτησης είναι 14 ψηφία γιατί π.χ. 14 του μήνα είναι 2 ψηφία ενώ 4 του μήνα είναι 1 ψηφίο.
		//το ίδιο για τα λεπτά της ώρας που είναι είτε 0-9 και μετά 10-59 2 ψηφία.
	
		return trackNumber;

	}

	//validates the input that was given by the user, so that no field was left empty and some more specific values were given for example the correct length of 
	//phone numbers and post codes.
	
	//further checks might get added later 
	private boolean validateInput(String senderName, String recieverName, String TKtext, String telephoneText,
			String size1, String size2, String size3) {
		if (senderName != null && senderName.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Παρακαλώ συμπληρώστε όνομα αποστολέα");
			return false;
		} 
		if (recieverName != null && recieverName.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Παρακαλώ συμπληρώστε όνομα παραλήπτη");
			return false;
		}
		if (TKtext != null && TKtext.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Παρακαλώ συμπληρώστε ταχυδρομικό κώδικα");
			return false;
		}
		//check if postcode is 5 characters long
		if (TKtext.length()!=5){
			JOptionPane.showMessageDialog(null, "Παρακαλώ συμπληρώστε σωστό ταχυδρομικό κώδικα");
			return false;
		}
		if (telephoneText != null && telephoneText.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Παρακαλώ συμπληρώστε το τηλέφωνο επικοιωνίας");
			return false;
		}
		if (telephoneText.length() != 10) { // checks if phone number is 10 characters long
			JOptionPane.showMessageDialog(null, "Παρακαλώ συμπληρώστε ένα σωστό τηλέφωνο επικοινωνίας");
			return false;
		}
		if (size1 != null && size1.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Παρακαλώ συμπληρώστε μήκος δέματος");
			return false;
		}
			if (Integer.parseInt(size1) > 200 || Integer.parseInt(size2) > 200 || Integer.parseInt(size3) > 200) {
			JOptionPane.showMessageDialog(null, "Οι διαστάσεις δέματος είναι πολύ μεγάλες");  //checks if packet is too big (limit here is 200x200x200centimeters)
			return false;
			
		}
		if (size2 != null && size2.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Παρακαλώ συμπληρώστε πλάτος δέματος");
			return false;
		}
		if (size3 != null && size3.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Παρακαλώ συμπληρώστε ύψος δέματος");
			return false;
		}
		return true;
	}
}
