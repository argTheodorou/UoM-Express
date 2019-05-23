import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;


public class NewCompletenessDialog extends JDialog {
	private final JPanel contentPanel1 = new JPanel();
	private final JPanel contentPanel = new JPanel();

	public NewCompletenessDialog() {
		setTitle(
				"\u0391\u039D\u0391\u0396\u0397\u03A4\u0397\u03A3\u0397 \u0391\u03A0\u039F\u03A3\u03A4\u039F\u039B\u0397\u03A3");
		setResizable(false);
		setModal(true);
		setIconImage(Toolkit.getDefaultToolkit().getImage(NewSearchDialog.class.getResource("/pics/box.png")));
		setMinimumSize(new Dimension(800, 480));
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel1.setBackground(new Color(57, 62, 70));

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
				"\u0391\u039D\u0391\u0396\u0397\u03A4\u0397\u03A3\u0397 \u0391\u03A0\u039F\u03A3\u03A4\u039F\u039B\u0397\u03A3");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Calibri", Font.BOLD, 22));
		

		JButton button_1 = new JButton("\u039A\u03BB\u03B5\u03AF\u03C3\u03B9\u03BC\u03BF");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});

		button_1.setFont(new Font("Calibri", Font.BOLD, 18));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(74)
							.addComponent(label))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(90)
							.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)))
					.addGap(20))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 334, Short.MAX_VALUE)
					.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(21))
		);
		panel.setLayout(gl_panel);
		contentPanel1.setLayout(gl_contentPanel);
	}

}
