package sortController;

import java.awt.Graphics2D;
import sortModel.Rectangle;
import sortView.MainPanel;

public class Controller {

	private Rectangle rect;
	private static MainPanel panel;

	public Controller(MainPanel p) {
		this();
		panel = p;
	}

	public Controller() {
		rect = new Rectangle();
	}

	public void draw(Graphics2D gc, int h1, int h2, int order, int width) {
		rect.draw(gc, h1, h2, order, width);
	}

	public void setArray(int h1, int h2, int[] arr) {
		panel.setArray(h1, h2, arr);
	}

	public void setLabel(String txt) {
		panel.setLabel(txt);
	}

}
