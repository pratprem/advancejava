import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;


public class InventoryPanel extends JPanel{
	 public InventoryPanel(){
		 super();
		 this.setSize(new Dimension (400,200));
		 initialize();
		 setLayout(new GridLayout());
		 setVisible(true);
	 }
	
	public void initialize(){
			JButton button = new JButton("foo");
			add(button);
			JButton button1 = new JButton("bar");
			add(button1);
			JButton button3 = new JButton("baz");
			add(button3);
			JButton button2 = new JButton("quux");
			add(button2);
			
 }   
 
}
