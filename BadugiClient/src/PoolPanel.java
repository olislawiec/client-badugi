import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PoolPanel extends JPanel {
	public PoolPanel() {
		super();

		setLayout(new GridLayout(2, 1));
		setBackground(new Color(210, 210, 210));

		JLabel highestBetLabel = new JLabel("Highest bet:");
		add(highestBetLabel);
		JLabel poolLabel = new JLabel("POOL:");
		add(poolLabel);

	}
}
