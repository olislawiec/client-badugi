import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MenuPanel extends JPanel {
	public MenuPanel() {
		super();

		setLayout(new GridLayout(12, 1, 5, 5));
		setBackground(new Color(210, 210, 210));

		JLabel nameLabel = new JLabel("Name");
		add(nameLabel);
		JLabel attributeLabel = new JLabel("dealer button");
		add(attributeLabel);
		JLabel auctionLabel = new JLabel("Auction:");
		add(auctionLabel);

		JButton checkButton = new JButton("Check");
		add(checkButton);
		JButton betButton = new JButton("Bet");
		add(betButton);
		JTextField valueTextField = new JTextField("Enter value...");
		add(valueTextField);
		JButton riseButton = new JButton("Rise");
		add(riseButton);
		JButton callButton = new JButton("Call");
		add(callButton);
		JButton foldButton = new JButton("Fold");
		add(foldButton);
		JButton allInButton = new JButton("All-in");
		add(allInButton);

		JLabel yourBetLabel = new JLabel("Your bet: 10T");
		add(yourBetLabel);

		JLabel totalLabel = new JLabel("TOTAL: 100T");
		add(totalLabel);

	}

}
