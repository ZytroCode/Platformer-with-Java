package platformer;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.swing.*;

import javax.imageio.ImageIO;

public class Block extends Rectangle {
	public BufferedImage image;
	public static String imageType = "Grass";

	public Block(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		try {
			File file = new File("lib/"+ imageType +".png");
			this.image = ImageIO.read(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			if (Block.imageType != null) {
				e.printStackTrace();
			}
		}
	}

	public void draw(Graphics g, JPanel panel) {
		g.drawImage(this.image, this.x, this.y, panel);
	}
}
