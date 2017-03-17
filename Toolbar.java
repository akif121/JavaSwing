import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;


public class Toolbar extends JPanel implements ActionListener {
	private JButton Hbtn;
	private JButton Gbtn;
	private TextPanel textpanel;
	public Toolbar(){
		
		Hbtn = new JButton("Hello");
		Gbtn = new JButton("GoodBye");
		
		Hbtn.addActionListener(this);
		Gbtn.addActionListener(this);
		setLayout(new FlowLayout());
		
		add(Hbtn);
		add(Gbtn);
		
	}
	public void setTextPanel(TextPanel textpanel){
		this.textpanel = textpanel;
	}
	public void actionPerformed(ActionEvent e) {
		JButton clicked = (JButton)e.getSource();
		
		if(clicked==Hbtn){
			textpanel.addText("Hello\n");
		}
		else if (clicked==Gbtn)
		{
			textpanel.addText("Goodbye\n");
		}
		
	}

}
