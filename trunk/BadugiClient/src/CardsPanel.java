import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;


public class CardsPanel extends JPanel {
	public CardsPanel() {
		super();

		setLayout(new FlowLayout());

		for(int i=0 ; i<4 ; i++){
	        JButton btn = new JButton(String.valueOf(i));
	        btn.setPreferredSize(new Dimension(150, 200));
	        add(btn);
	    }
		/*
		add(new JButton("CARD 1"));
		btn.setPreferredSize(new Dimension(40, 40));
		add(new JButton("CARD 2"));
		add(new JButton("CARD 3"));
		add(new JButton("CARD 4"));
		*/

	}
}
