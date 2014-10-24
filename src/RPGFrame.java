import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RPGFrame extends JFrame {

	Color color = Color.BLACK;
	JPanel currentPanel;
	JPanel homePanel;
	int x;

	public RPGFrame() {
		super("RentPlayGo");
		setLayout(new BorderLayout());

		JPanel toolBar = new JPanel();
		JPanel headerBar = new JPanel();
		JPanel navigationBar = new JPanel();
		JPanel blank = new JPanel();

		JButton logoButton = new JButton("Logo");
		JTextField searchBar = new JTextField("");

		toolBar.setPreferredSize(new Dimension(1000, 80));
		searchBar.setPreferredSize(new Dimension(200, 24));

		JButton homeButton = new JButton("Home");
		JButton cartButton = new JButton("Cart");
		JButton myAccountButton = new JButton("My Account");
		JButton contactButton = new JButton("Contact");

		toolBar.setLayout(new BorderLayout());
		headerBar.setLayout(new BorderLayout());
		navigationBar.setLayout(new FlowLayout());

		headerBar.add(blank, BorderLayout.NORTH);
		headerBar.add(logoButton, BorderLayout.WEST);
		headerBar.add(searchBar, BorderLayout.EAST);

		navigationBar.add(homeButton);
		navigationBar.add(cartButton);
		navigationBar.add(myAccountButton);
		navigationBar.add(contactButton);

		toolBar.add(headerBar, BorderLayout.CENTER);
		toolBar.add(navigationBar, BorderLayout.SOUTH);

		add(toolBar, BorderLayout.NORTH);

		Handler handler = new Handler();

		homeButton.addActionListener(handler);
		cartButton.addActionListener(handler);
		myAccountButton.addActionListener(handler);
		contactButton.addActionListener(handler);

		x = 0;
		homePanel = new HomePanel(color);
		homePanel.addMouseListener(handler);
		this.addMouseListener(handler);
		addPanels(homePanel);		
	}

	public RPGFrame(String string){
		switch(string){
		case "xboxButton":
			System.out.println("2nd construct");
			buttonManager("Xbox One"); 
			break;
		}
	}
	
	public void buttonManager(String buttonPressed){
		
		switch (buttonPressed) {
		case "Home":				
			JPanel homePanel = new HomePanel(color);
			addPanels(homePanel);
			break;
		case "Cart":
			System.out.println("hi");
			JPanel cartPanel = new CartPanel();
			addPanels(cartPanel);
			break;
		case "My Account":
			JPanel accountPanel = new AccountPanel();
			addPanels(accountPanel);
			break;
		case "Contact":
			JPanel contactPanel = new ContactPanel();
			addPanels(contactPanel);
			break;
		case "Xbox One":				
			JPanel xboxPanel = new GamePanel("Xbox One");
			addPanels(xboxPanel);
			break;
		case "Playstation 4":
			JPanel playPanel = new GamePanel("Xbox One");
			addPanels(playPanel);
			break;
		case "Wii U":
			JPanel wiiPanel = new GamePanel("Xbox One");
			addPanels(wiiPanel);
			break;
		default:
			System.out.println(buttonPressed);
			break;
		}
	}
	
	public class Handler extends  MouseAdapter implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			String navButtonPressed = e.getActionCommand();

			buttonManager(navButtonPressed);
			
		}
		
		public void mouseClicked(ActionEvent e){
			x = homePanel.getX();
			System.out.println(x);
			if(x == 0){
				
			} 
			else if(x == 1){
				JPanel xboxPanel = new GamePanel("Xbox One");
				addPanels(xboxPanel);
			}
		}
	}
	
	public void addPanels(JPanel panel) {
		if(currentPanel!=null){
			remove(currentPanel);
			revalidate();
		}
		
		currentPanel = panel;
		
		System.out.println(currentPanel);
//		/JPanel panel = new HomePanel(color);
		
		
		add(panel, BorderLayout.CENTER);
		
		validate();
	}

//	public void removePanels(JPanel panel) {
//
//	}
	
	
}







