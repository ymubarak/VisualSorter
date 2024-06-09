package sortModel;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class Rectangle {

	private static final int HEIGHT = 5, WIDFACTOR = 20;

	public Rectangle() {
		super();
	}

	public void draw(Graphics2D g, int h1, int h2, int order, int width) {
		// TODO Auto-generated method stub

		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.setColor(Color.white);
		if (order == h1)
			g.setColor(Color.green);
		if (order == h2)
			g.setColor(Color.red);
		g.fillRect(10, order * 2 * HEIGHT + 10, width * WIDFACTOR + 15, HEIGHT);
		g.setColor(Color.white);
	}
}
