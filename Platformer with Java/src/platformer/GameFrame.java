package platformer;

import javax.swing.*;

public class GameFrame extends JFrame {
	public final int WIDTH = 1080;
	public final int HEIGHT = 620;
	public GamePanel panel;

	public GameFrame() {
		panel = new GamePanel(WIDTH, HEIGHT);
		this.setBackground(panel.color);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(WIDTH, HEIGHT);
		this.setTitle("Platformer with Java");
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	public void run() {
		this.add(panel);
	}

}
