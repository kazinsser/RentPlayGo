import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ContactPanel extends JPanel {
	public ContactPanel() {
		setLayout(new FlowLayout());
		JLabel background=new JLabel(new ImageIcon(getClass().getResource("DarkWood.jpg")));
		
		JPanel contactUsPanel = new JPanel(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		JPanel emptyPanel = new JPanel();
		
		
		
		//JPanel messagePanel = new JPanel();
		
		JLabel contactUsLabel = new JLabel("Contact Us");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 0;
		c.insets = new Insets(40, 0, 0, 40);
		contactUsPanel.add(contactUsLabel, c);
		
		c.gridx = 2;
		c.gridy = 0;
		contactUsPanel.add(emptyPanel, c);
		
		JLabel emailLabel = new JLabel("Your email:");
		c.gridx = 0;
		c.gridy = 2;
		contactUsPanel.add(emailLabel, c);
		
		JTextField emailTextField = new JTextField();
		c.gridx = 1;
		c.gridy = 2;
		c.gridwidth = 2;
		contactUsPanel.add(emailTextField, c);
		
		JLabel messageLabel = new JLabel("Message us:");
		c.gridx = 0;
		c.gridy = 3;
		contactUsPanel.add(messageLabel, c);
		
		JTextField messageTextField = new JTextField();
		c.gridx = 1;
		c.gridy = 3;
		c.ipadx = 100;
		c.ipady = 100;
		contactUsPanel.add(messageTextField, c);
		
		contactUsPanel.setSize(600, 400);
		contactUsPanel.setLocation(225, 100);
		
		background.add(contactUsPanel);
		add(background);
	}
}
