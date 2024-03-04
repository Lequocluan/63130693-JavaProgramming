package luanlq;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class DemoJFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public DemoJFrame() {
		setTitle("DemoJFrame");
		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		new DemoJFrame().setVisible(true);
	}
}
