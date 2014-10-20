public class Controller implements Observer {
	public Model model;
	public ClientJFrame mainView;
	public ClientJDialog startView;
	private Core core;

	public Controller() {
		this.model = new Model();
		this.mainView = new ClientJFrame(model);
		this.startView = new ClientJDialog(model);
		this.core = new Core();
		startView.addObserver(this);
		startView.setVisible(true);
	}

	@Override
	public void updateFromStartView() {
		try {
			core.connectToServer(model.getHost(), model.getPort());
			startView.setVisible(false);
			mainView.setVisible(true);
		} catch (ConnectionFailureException e) {
			startView.informUserOfFailedConnection();
		}
	}

	@Override
	public void updateFromMainView() {
		// TODO Auto-generated method stub

	}
}
