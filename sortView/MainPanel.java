package sortView;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import sortController.Controller;

public class MainPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame frame;
	private Controller ctrl;
	private int highlight1 = -1, highlight2 = -1;;
	private static int[] array;
	private static JLabel label;

	public MainPanel(JFrame fr) {

		frame = fr;
		label = new JLabel();
		ctrl = new Controller(this);
		intitializePanel();
	}

	private void intitializePanel() {

		label.setForeground(Color.WHITE);
		label.setFont(new Font("Consolas", Font.PLAIN, 18));
		add(label, BorderLayout.SOUTH);
		setBackground(Color.BLACK);
		JLabel contentPane = new JLabel();
		contentPane.setLayout(new BorderLayout());
		frame.setContentPane(contentPane);
		frame.getContentPane().add(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setUndecorated(true);
		frame.setVisible(true);
	}

	public void setArray(int h1, int h2, int[] arr) {
		highlight1 = h1;
		highlight2 = h2;
		array = arr;
		repaint();
	}

	public void setLabel(String txt) {
		label.setText(txt);
		repaint();
	}

	@Override
	public void paintComponent(Graphics g) {
		// the paint method
		super.paintComponent(g);

		Graphics2D gc = (Graphics2D) g;
		if (array != null)
			drawLines(gc);

	}

	private void drawLines(Graphics2D gc) {
		for (int i = 0; i < array.length; i++) {
			ctrl.draw(gc, highlight1, highlight2, i, array[i]);
		}
	}
}
