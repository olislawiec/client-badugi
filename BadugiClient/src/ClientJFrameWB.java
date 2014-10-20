import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JToolBar;

import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.SystemColor;

public class ClientJFrameWB {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClientJFrameWB window = new ClientJFrameWB();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ClientJFrameWB() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		JFrame frame = new JFrame();
		frame.getContentPane().setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 800, 600);
		frame.setResizable(false);

		JPanel tablePanel = new TablePanel();
		frame.getContentPane().add(tablePanel);
		tablePanel.setBounds(15, 15, 600, 300);
		
		JLabel lblDealerde = new JLabel("dealerde");
		lblDealerde.setBackground(new Color(192, 192, 192));
		tablePanel.add(lblDealerde);
		
		JLabel lblBot = new JLabel("Bot1");
		tablePanel.add(lblBot);
		JPanel cardsPanel = new CardsPanel();
		frame.getContentPane().add(cardsPanel);
		cardsPanel.setBounds(10, 370, 630, 220);
		JPanel menuPanel = new MenuPanel();
		frame.getContentPane().add(menuPanel);
		menuPanel.setBounds(660, 10, 120, 550);

		frame.setVisible(true);

	}
}
