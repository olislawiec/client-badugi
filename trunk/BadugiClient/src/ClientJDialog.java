import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * @author papq
 *
 */
public class ClientJDialog extends JDialog implements Observable {
	private Model model;

	private ArrayList<Observer> observers;

	private boolean changed;

	private static JTextField hostTextField = new JTextField();
	private static final JTextField portTextField = new JTextField();
	private static JTextField answearTextField = new JTextField();

	private static String host = "";
	private static String portString = "";
	private static int port = 0;

	public ClientJDialog(Model model) {
		super();
		this.model = model;
		observers = new ArrayList<Observer>();
		changed = false;

		setResizable(false);
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 340, 190);
		getContentPane().setLayout(null);

		JLabel hostLabel = new JLabel("Host nr:");
		hostLabel.setBounds(10, 10, 150, 25);
		getContentPane().add(hostLabel);

		JLabel portLabel = new JLabel("Port nr:");
		portLabel.setBounds(180, 10, 150, 25);
		getContentPane().add(portLabel);

		hostTextField.setBounds(10, 45, 150, 25);
		getContentPane().add(hostTextField);
		hostTextField.setColumns(10);
		hostTextField.setText("Enter host...");

		portTextField.setBounds(180, 45, 150, 25);
		getContentPane().add(portTextField);
		portTextField.setColumns(10);
		portTextField.setText("Enter port...");

		answearTextField.setBounds(10, 125, 320, 25);
		answearTextField.setEditable(false);
		getContentPane().add(answearTextField);

		JButton buttonConnect = new JButton("Connect");
		buttonConnect.setBounds(115, 85, 100, 25);
		getContentPane().add(buttonConnect);
		buttonConnect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ClientJDialog.this.model.setHost(hostTextField.getText());
				portString = portTextField.getText();
				if (ClientJDialog.this.model.getHost().equals("Enter host...")
						|| ClientJDialog.this.model.getHost().equals(""))
					ClientJDialog.this.model.setHost("127.0.0.1");
				if (portString.equals("Enter port...") || portString.equals(""))
					ClientJDialog.this.model.setPort(4444);
				else
					ClientJDialog.this.model.setPort(Integer
							.parseInt(portString));
				answearTextField.setText("Connecting...");
				setChanged();
				notifyObservers();
			}
		});
	}

	public static String getHost() {
		return host;
	}

	public static void setHost(String host) {
		ClientJDialog.host = host;
	}

	public static int getPort() {
		return port;
	}

	public static void setPort(int port) {
		ClientJDialog.port = port;
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

	public void informUserOfFailedConnection() {
		JOptionPane.showMessageDialog(null, "Connection failure");
		answearTextField.setText("Connection failure");
	}

}
