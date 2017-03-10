import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class App {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
			public void run() {
				JFrame frame = new JFrame("Hello World");
				frame.setSize(600,800);
				frame.setVisible(true);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
			}
		});	
	}
}
