package luanlq_th0;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManHinhTinhToan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtKq;

	public ManHinhTinhToan() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 753, 331);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblA = new JLabel("Hệ số thứ nhất");
		lblA.setBounds(60, 51, 122, 20);
		contentPane.add(lblA);
		
		JLabel lblB = new JLabel("Hệ số thứ hai");
		lblB.setBounds(60, 97, 122, 20);
		contentPane.add(lblB);
		
		JLabel lblKq = new JLabel("Kết quả tính toán");
		lblKq.setBounds(60, 219, 103, 20);
		contentPane.add(lblKq);
		
		txtA = new JTextField();
		txtA.setBounds(225, 51, 259, 34);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setColumns(10);
		txtB.setBounds(225, 112, 259, 34);
		contentPane.add(txtB);
		
		txtKq = new JTextField();
		txtKq.setEnabled(false);
		txtKq.setColumns(10);
		txtKq.setBounds(225, 212, 256, 34);
		contentPane.add(txtKq);
		
		JButton btnCong = new JButton("CỘNG");
		btnCong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamCong();
			}
		});
		btnCong.setBounds(93, 165, 89, 23);
		contentPane.add(btnCong);
		
		JButton btnTru = new JButton("TRỪ");
		btnTru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamTru();
			}
		});
		btnTru.setBounds(202, 165, 89, 23);
		contentPane.add(btnTru);
		
		JButton btnNhan = new JButton("NHÂN");
		btnNhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamNhan();
			}
		});
		btnNhan.setBounds(315, 165, 89, 23);
		contentPane.add(btnNhan);
		
		JButton btnChia = new JButton("CHIA");
		btnChia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamChia();
			}
		});
		btnChia.setBounds(426, 165, 89, 23);
		contentPane.add(btnChia);
	}

	void HamCong() {
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();

		Double soA= Double.parseDouble(str_soA);
		Double soB= Double.parseDouble(str_soB);
		
		Double tong=soA+soB;
		txtKq.setText(String.valueOf(tong));
	}
	void HamTru() {
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();

		Double soA= Double.parseDouble(str_soA);
		Double soB= Double.parseDouble(str_soB);
		
		Double tong=soA-soB;
		txtKq.setText(String.valueOf(tong));
	}
	void HamNhan() {
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();

		Double soA= Double.parseDouble(str_soA);
		Double soB= Double.parseDouble(str_soB);
		
		Double tong=soA*soB;
		txtKq.setText(String.valueOf(tong));
	}void HamChia() {
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();

		Double soA= Double.parseDouble(str_soA);
		Double soB= Double.parseDouble(str_soB);
		
		Double tong=soA/soB;
		txtKq.setText(String.valueOf(tong));
	}
}
