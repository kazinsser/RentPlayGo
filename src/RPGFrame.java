import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class RPGFrame extends JFrame {

	public RPGFrame(){
		super("RentPlayGo");
		setLayout(new BorderLayout());
		
		JPanel headerBar = new JPanel();
		JPanel toolBar = new JPanel();
		
		JButton logoButton = new JButton();
		JButton homeButton = new JButton();
		JButton cartButton = new JButton();
		JButton myAccountButton = new JButton();
		JButton contactButton = new JButton();
		JTextField searchBar = new JTextField();
		
		headerBar.add(logoButton);
		headerBar.add(searchBar);
		
		toolBar.add(homeButton);
		toolBar.add(cartButton);
		toolBar.add(myAccountButton);
		toolBar.add(contactButton);		
		
		//add(headerBar, BorderLayout.NORTH);
		add(toolBar, BorderLayout.NORTH);
		
	}
	
	public class Handler implements ActionListener{

		
		public void actionPerformed(ActionEvent event) {
			
			
		}
		
		
		
	}
	
	
}
