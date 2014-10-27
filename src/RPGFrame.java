import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class RPGFrame extends JFrame {

	static Color color = Color.BLACK;
	static JPanel currentPanel;
	
	JButton logoButton;
	JButton homeButton;
	JButton cartButton;
	JButton myAccountButton;
	JButton contactButton;
	
	public RPGFrame() {
		super("RentPlayGo");
		setLayout(new BorderLayout());

		JPanel toolBar = new JPanel();
		JPanel headerBar = new JPanel();
		JPanel navigationBar = new JPanel();
		JPanel blank = new JPanel();
		
		headerBar.setBackground(new Color(30,40,50));
		navigationBar.setBackground(new Color(30,40,50));

		Border borderColor = new LineBorder(color.BLACK,1);
		
		logoButton = new JButton(new ImageIcon(getClass().getResource("RPGLogo.png")));
		logoButton.setPreferredSize(new Dimension(100,80));
		logoButton.setBorder(borderColor);
		
		JTextField searchBar = new JTextField("");

		toolBar.setPreferredSize(new Dimension(1000, 100));
		searchBar.setPreferredSize(new Dimension(200, 24));

		homeButton = new JButton(new ImageIcon(getClass().getResource("Home.png")));
		homeButton.setPreferredSize(new Dimension(100,50));
		homeButton.setBorder(borderColor);
		
		cartButton = new JButton(new ImageIcon(getClass().getResource("Cart.png")));
		cartButton.setPreferredSize(new Dimension(100,50));
		cartButton.setBorder(borderColor);
		
		myAccountButton = new JButton(new ImageIcon(getClass().getResource("Account.png")));
		myAccountButton.setPreferredSize(new Dimension(100,50));
		myAccountButton.setBorder(borderColor);
		
		contactButton = new JButton(new ImageIcon(getClass().getResource("Contact.png")));
		contactButton.setPreferredSize(new Dimension(100,50));
		contactButton.setBorder(borderColor);
		
		toolBar.setLayout(new BorderLayout());
		headerBar.setLayout(new BorderLayout());
		navigationBar.setLayout(new FlowLayout());

		//headerBar.add(blank, BorderLayout.NORTH);
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

		JPanel homePanel = new HomePanel(color);
		addPanels(homePanel);		
		
//		JPanel xboxPanel = new GamePanel("Xbox One");
//		addPanels(xboxPanel);
	}

	public RPGFrame(String string){
		switch(string){
		case "xboxButton":
			System.out.println("2nd construct");
			//buttonManager("Xbox One"); 
			break;
		}
	}
	
	public void addPanels(JPanel panel) {
		JPanel temp;
		if(currentPanel!=null){			
			temp = currentPanel;
			remove(currentPanel);
			revalidate();
		}		
		currentPanel = panel;		
		System.out.println(currentPanel);				
		add(panel, BorderLayout.CENTER);	
		
		validate();
	}
	
	public void buttonManager(String buttonPressed){
						
		switch (buttonPressed) {
		case "Home":				
			JPanel homePanel = new HomePanel(color);			
			addPanels(homePanel);
			break;
		case "Cart":
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
			add(new GamePanel("Xbox"));
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
	
	public class Handler implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			String navButtonPressed = e.getActionCommand();

			if(e.getSource()==homeButton)
				buttonManager("Home");
			else if(e.getSource()==cartButton)
				buttonManager("Cart");
			else if(e.getSource()==myAccountButton)
				buttonManager("My Account");
			else if(e.getSource()==contactButton)
				buttonManager("Contact");
		}
	}
	
	

//	public void removePanels(JPanel panel) {
//
//	}
	
	
}







