import java.awt.GridLayout;

import javax.swing.JPanel;

public class TablePanel extends JPanel {
	public TablePanel() {
		super();

		setLayout(new GridLayout(2, 3, 10, 10));

		PlayerPanel player1Panel = new PlayerPanel();
		player1Panel.setNameLabelText("Player 1");
		add(player1Panel);
//		player1Panel.nameLabel.setText("Player 1");
//		player1Panel.attributeLabel.setText("big blind");
//		player1Panel.betValueLabel.setText("Bet: 10T");
//		player1Panel.auctionLabel.setText("Check");
		JPanel player2Panel = new PlayerPanel();
		add(player2Panel);
//		player1Panel.nameLabel.setText("Player 2");
//		player1Panel.attributeLabel.setText("small blind");
//		player1Panel.betValueLabel.setText("Bet: 7T");
//		player1Panel.auctionLabel.setText("All-in");
		JPanel player3Panel = new PlayerPanel();
		add(player3Panel);
//		player1Panel.nameLabel.setText("Player 3");
//		player1Panel.attributeLabel.setText("none");
//		player1Panel.betValueLabel.setText("Bet: 5T");
//		player1Panel.auctionLabel.setText("Fold");
		JPanel player4Panel = new PlayerPanel();
		add(player4Panel);
//		player1Panel.nameLabel.setText("Player 4");
//		player1Panel.attributeLabel.setText("none");
//		player1Panel.betValueLabel.setText("Bet: 12T");
//		player1Panel.auctionLabel.setText("Rise");
		JPanel poolPanel = new PoolPanel();
		add(poolPanel);
//		poolPanel.highestBetLabel.setText("Highest bet: 12T");
//		poolPanel.poolLabel.setText("POOL: 54T");
		JPanel player5Panel = new PlayerPanel();
		add(player5Panel);
//		player1Panel.nameLabel.setText("Player 5");
//		player1Panel.attributeLabel.setText("none");
//		player1Panel.betValueLabel.setText("Bet: 10T");
//		player1Panel.auctionLabel.setText("Check");

	}
}
