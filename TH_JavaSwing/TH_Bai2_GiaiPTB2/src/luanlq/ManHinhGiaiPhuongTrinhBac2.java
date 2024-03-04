package luanlq;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;

public class ManHinhGiaiPhuongTrinhBac2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtC;
	private JTextField txtKQ;

	/**
	 * Create the frame.
	 */
	public ManHinhGiaiPhuongTrinhBac2() {
		setTitle("GIẢI PHƯƠNG TRÌNH BẬC 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 714, 356);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblC = new JLabel("Hệ số c");
		lblC.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblC.setBounds(122, 145, 70, 17);
		contentPane.add(lblC);
		
		JLabel lblB = new JLabel("Hệ số b");
		lblB.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblB.setBounds(122, 100, 56, 17);
		contentPane.add(lblB);
		
		JLabel lblA = new JLabel("Hệ số a");
		lblA.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblA.setBounds(122, 52, 56, 20);
		contentPane.add(lblA);
		
		txtA = new JTextField();
		txtA.setBounds(299, 52, 165, 20);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setBounds(299, 98, 165, 20);
		contentPane.add(txtB);
		txtB.setColumns(10);
		
		txtC = new JTextField();
		txtC.setBounds(299, 143, 165, 20);
		contentPane.add(txtC);
		txtC.setColumns(10);
		
		JButton btnGiai = new JButton("GIẢI");
		btnGiai.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnGiai.setBounds(241, 188, 89, 33);
		contentPane.add(btnGiai);
		
		JLabel lblKQ = new JLabel("Kết quả");
		lblKQ.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblKQ.setBounds(122, 246, 70, 14);
		contentPane.add(lblKQ);
		
		txtKQ = new JTextField();
		txtKQ.setEnabled(false);
		txtKQ.setBounds(213, 232, 263, 33);
		contentPane.add(txtKQ);
		txtKQ.setColumns(10);
	}

}
