import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 
 */

/**
 * @author papq
 *
 */
public class ClientJFrame extends JFrame implements Observable {
	private Model model;

	private ArrayList<Observer> observers;

	private boolean changed;

	public ClientJFrame(Model model) {
		super("Badugi Poker");
		this.model = model;
		observers = new ArrayList<Observer>();
		changed = false;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		setLayout(null);
		setResizable(false);

		JPanel tablePanel = new TablePanel();
		add(tablePanel);
		tablePanel.setBounds(15, 15, 600, 300);
		JPanel cardsPanel = new CardsPanel();
		add(cardsPanel);
		cardsPanel.setBounds(10, 360, 630, 220);
		JPanel menuPanel = new MenuPanel();
		add(menuPanel);
		menuPanel.setBounds(660, 15, 120, 550);
	}

	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);		
	}

	@Override
	public void notifyObservers() {
		if (changed) {
			for (Observer o : observers) {
				o.updateFromStartView();
			}
			changed = false;
		}
	}

	@Override
	public void setChanged() {
		changed = true;
	}
}
