import java.awt.EventQueue;

public class Client {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				Controller controller = new Controller();
			}
		});
	}

}
