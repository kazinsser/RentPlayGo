import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;


public class GamePanel extends HomePanel{
		
	public GamePanel(String string) {
		setLayout(new FlowLayout());

		JButton test = new JButton(string);

		add(test);
		
	}
}
