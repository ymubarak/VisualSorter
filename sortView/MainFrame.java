package sortView;

import java.awt.FlowLayout;
import javax.swing.JFrame;

public class MainFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MainFrame() {
		super("Visualize");
		initialGUI();
	}

	private void initialGUI() {

		FlowLayout layout = new FlowLayout();
		setLayout(layout);
		// here goes models
		new MainPanel(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setVisible(true);
	}
}
