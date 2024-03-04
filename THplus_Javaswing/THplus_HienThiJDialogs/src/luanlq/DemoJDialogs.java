package luanlq;

import java.awt.Color;

import javax.swing.JDialog;

public class DemoJDialogs extends JDialog {
	public DemoJDialogs() {
		setTitle("Demo JDialog");
		setSize(300, 500);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setResizable(false);
		setBackground(Color.BLUE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DemoJDialogs().setVisible(true);
	}

}
