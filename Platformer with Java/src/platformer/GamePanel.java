package platformer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GamePanel extends JPanel implements Runnable {
	int blockSize = 32;
	Player player;
	public Dimension WIN_SIZE = new Dimension(WIDTH, HEIGHT);
	public Color color;

	Graphics graphics;
	Thread gameThread;
	Image image;

	public GamePanel(int width, int height) {
		this.color = Color.DARK_GRAY;
		this.setBackground(this.color);
		this.setFocusable(true);
		this.setPreferredSize(WIN_SIZE);
		this.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});

		player = new Player(500, 300);

		gameThread = new Thread(this);
		gameThread.start();
	}

	public void paint(Graphics g) {
		image = createImage(getWidth(), getHeight());
		graphics = image.getGraphics();
		draw(graphics);
		g.drawImage(image, 0, 0, this);
	}
	
	public void paintComponent(Graphics g) {
		
	}

	public void draw(Graphics g) {
		// Block test = new Block(10, 10, 100, 100);
		// test.draw(g, this);
		for (int y = 0;y < Map.map.length;y++) {
			for (int x = 0;x < Map.map[y].length;x++) {
				if (Map.map[y][x] == 1) {
					Block.imageType = "Grass";
				}
				else if (Map.map[y][x] == 2) {
					Block.imageType = "Dirt";
				}
				else {
					Block.imageType = null;
				}
				Block block = new Block(x*blockSize, y*blockSize, blockSize, blockSize);
				block.draw(g, this);
			}
		}

		player.draw(g, this);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		long lastTime = System.nanoTime();
		double ticks = 500.0;
		double ns = 1000000000 / ticks;
		double delta = 0;

		// Game Loop
		while (true) {
			long now = System.nanoTime();
			delta += (now - lastTime)/ns;
			if (delta >= 1) {
				// System.out.println("TES");
				repaint();
				delta--;
			}
		}
	}

	public class AL extends KeyAdapter {
		public void keyPress(KeyEvent e) {
			
		}
		public void keyReleased(KeyEvent e) {
			
		}
	}

}
