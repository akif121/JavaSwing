import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MainFrame extends JFrame{
		private TextPanel textPanel;
		private JButton btn;
		private Toolbar tb;
		public MainFrame(){
		super("Hello World");
		setLayout(new BorderLayout());
		textPanel = new TextPanel();
		btn = new JButton("Click Me!");
		tb = new Toolbar();
		btn.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent arg0) {
				textPanel.addText("Hello"+" World\n");
		}
		});
		add(tb, BorderLayout.NORTH);
		add(textPanel, BorderLayout.CENTER);
		add(btn, BorderLayout.SOUTH);
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
}
