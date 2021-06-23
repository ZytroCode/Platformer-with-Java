package platformer;

import java.awt.image.BufferedImage;
import java.awt.*;
import javax.swing.*;

public class Player {
	public int x, y;
	public BufferedImage image;

	public Player(int x, int y) {
		this.x = x;
		this.y = y;

		this.image = Locals.loadImage("lib/Player.png");
	}

	public void draw(Graphics g, JPanel panel) {
		g.drawImage(this.image, this.x, this.y, 64, 64, panel);
	}
}
