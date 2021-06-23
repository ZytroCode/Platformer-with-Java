package platformer;

import java.awt.image.BufferedImage;
import java.io.*;

import javax.imageio.ImageIO;

public class Locals {
	public static BufferedImage loadImage(String path) {
		
		try {
			File file = new File(path);
			BufferedImage image = ImageIO.read(file);
			return image;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return loadImage(null);
	}
}
