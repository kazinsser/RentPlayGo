import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class HomePanel extends JPanel {
	JButton xboxButton;
	JButton ps4Button;
	JButton wiiuButton;
	JPanel emptyPanel;

	public HomePanel(Color homePanelColor) {
		// layout and background color
		setLayout(new FlowLayout());
		setBackground(homePanelColor);

		Icon xboxIcon = new ImageIcon(getClass().getResource("xbox_one_logo.jpg"));
		xboxButton = new JButton(xboxIcon);

		Icon ps4Icon = new ImageIcon(getClass().getResource("ps4_logo.jpg"));
		ps4Button = new JButton(ps4Icon);

		Icon wiiuIcon = new ImageIcon(getClass().getResource("wii_u_logo.jpg"));
		wiiuButton = new JButton(wiiuIcon);

		emptyPanel = new JPanel();

		add(xboxButton);
//		add(emptyPanel);
		add(ps4Button);
//		add(emptyPanel);
		add(wiiuButton);

	}

	private class Handler implements ActionListener {

		public void actionPerformed(ActionEvent event) {
			if (event.getSource() == xboxButton) {

			} else if (event.getSource() == ps4Button) {

			} else if (event.getSource() == wiiuButton) {

			}

		}

	}
}
