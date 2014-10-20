import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PlayerPanel extends JPanel {
	private JLabel nameLabel;
	private JLabel attributeLabel;
	private JLabel betValueLabel;
	private JLabel auctionLabel;
	
	public PlayerPanel() {
		super();

		setLayout(new GridLayout(4, 1));
		setBackground(new Color(220, 220, 220));

		nameLabel = new JLabel();
		nameLabel.setText("Name");
		add(nameLabel);
		attributeLabel = new JLabel("small blind");
		add(attributeLabel);
		attributeLabel.setText("big blind");
		betValueLabel = new JLabel("Bet: 10T");
		add(betValueLabel);
		auctionLabel = new JLabel("Check");
		add(auctionLabel);
	}

	public JLabel getNameLabel() {
		return nameLabel;
	}

	public void setNameLabelText(String setText) {
		this.nameLabel.setText(setText);
	}

	public JLabel getAttributeLabel() {
		return attributeLabel;
	}

	public void setAttributeLabel(JLabel attributeLabel) {
		this.attributeLabel = attributeLabel;
	}
}
