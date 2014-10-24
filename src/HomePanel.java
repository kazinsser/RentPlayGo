import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;



public class HomePanel extends JPanel {
	JButton xboxButton;
	JButton ps4Button;
	JButton wiiuButton;
	JPanel emptyPanel;
	int x;

	public HomePanel(Color homePanelColor) {
		// layout and background color
		setLayout(new FlowLayout());
		setBackground(homePanelColor);
		
		JLabel background=new JLabel(new ImageIcon(getClass().getResource("DarkWood.jpg")));
		
		add(background);
		background.setLayout(new FlowLayout());
		
		Border borderColor = new LineBorder(homePanelColor, 2);

		Icon xboxIcon = new ImageIcon(getClass().getResource("xbox_one_logo.jpg"));
		xboxButton = new JButton(xboxIcon);
		xboxButton.setPreferredSize(new Dimension(670,200));
		xboxButton.setBorder(borderColor);

		Icon ps4Icon = new ImageIcon(getClass().getResource("ps4_logo.jpg"));
		ps4Button = new JButton(ps4Icon);
		ps4Button.setPreferredSize(new Dimension(670,200));
		ps4Button.setBorder(borderColor);
		ps4Button.setBackground(homePanelColor);
		ps4Button.setRolloverIcon(xboxIcon); 
		
		Icon wiiuIcon = new ImageIcon(getClass().getResource("wii_u_logo.jpg"));
		wiiuButton = new JButton(wiiuIcon);
		wiiuButton.setPreferredSize(new Dimension(670,200));
		wiiuButton.setBorder(borderColor);
		
		emptyPanel = new JPanel();

		background.add(xboxButton);
//		add(emptyPanel);
		background.add(ps4Button);
//		add(emptyPanel);
		background.add(wiiuButton);
		
		Handler handler = new Handler();
		xboxButton.addActionListener(handler);
	}
	
	public int getX(){
		return x;
	}

	private class Handler implements ActionListener {

		public void actionPerformed(ActionEvent event) {
			if (event.getSource() == xboxButton) {
				x = 1;
				
			} else if (event.getSource() == ps4Button) {
				x = 2;
			} else if (event.getSource() == wiiuButton) {

			}

		}

	}
}
