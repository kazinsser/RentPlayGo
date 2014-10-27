import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class AccountPanel extends JPanel {
	public AccountPanel() {
		setLayout(new FlowLayout());
		JLabel background = new JLabel(new ImageIcon(getClass().getResource(
				"DarkWood.jpg")));

		JPanel contactUsPanel = new JPanel(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();

		JPanel emptyPanel = new JPanel();

		// JPanel messagePanel = new JPanel();

		JLabel contactUsLabel = new JLabel("Log In");
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 1;
		c.weighty = 1;
		c.gridx = 1;
		c.gridy = 0;
		c.insets = new Insets(40, 40, 0, 40);
		contactUsPanel.add(contactUsLabel, c);

		c.gridx = 2;
		c.gridy = 0;
		contactUsPanel.add(emptyPanel, c);

		JLabel emailLabel = new JLabel("Username: ");
		c.gridx = 0;
		c.gridy = 1;
		contactUsPanel.add(emailLabel, c);

		JTextField emailTextField = new JTextField();
		c.gridx = 1;
		c.gridy = 1;
		c.gridwidth = 2;
		contactUsPanel.add(emailTextField, c);

		JLabel messageLabel = new JLabel("Password: ");
		c.gridx = 0;
		c.gridy = 2;
		contactUsPanel.add(messageLabel, c);

		JPasswordField messagePasswordField = new JPasswordField();
		c.gridx = 1;
		c.gridy = 2;
		contactUsPanel.add(messagePasswordField, c);
		
		JButton login = new JButton("Log in");
		c.gridx = 1;
		c.gridy = 3;
		contactUsPanel.add(login, c);

		contactUsPanel.setSize(600, 400);
		contactUsPanel.setLocation(225, 100);

		background.add(contactUsPanel);
		add(background);
	}

}
