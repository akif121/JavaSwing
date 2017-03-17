import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;


public class Toolbar extends JPanel {
	private JButton Hbtn;
	private JButton Gbtn;
	
	public Toolbar(){
		
		Hbtn = new JButton("Hello");
		Gbtn = new JButton("GoodBye");
		
		setLayout(new FlowLayout());
		
		add(Hbtn);
		add(Gbtn);
		
	}
	

}
