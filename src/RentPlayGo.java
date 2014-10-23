import javax.swing.JFrame;


public class RentPlayGo {
	public static void main(String args[]){
		RPGFrame mainFrame = new RPGFrame();
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setSize(1000,750);
		mainFrame.setResizable(false);
		mainFrame.setVisible(true);
	}
}
