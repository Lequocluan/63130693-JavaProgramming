package luanlq;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTenDN;
	private JPasswordField txtMK;

	public LoginFrame() {
		setTitle("ĐĂNG NHẬP HỆ THỐNG BÁN HÀNG");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 473, 338);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTenDN = new JLabel("TÊN ĐĂNG NHẬP");
		lblTenDN.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTenDN.setBounds(29, 50, 117, 24);
		contentPane.add(lblTenDN);
		
		JLabel lblMK = new JLabel("MẬT KHẨU");
		lblMK.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMK.setBounds(52, 106, 106, 24);
		contentPane.add(lblMK);
		
		txtTenDN = new JTextField();
		txtTenDN.setBounds(166, 44, 170, 30);
		contentPane.add(txtTenDN);
		txtTenDN.setColumns(10);
		
		txtMK = new JPasswordField();
		txtMK.setBounds(166, 105, 170, 30);
		contentPane.add(txtMK);
		
		JButton btnDN = new JButton("ĐĂNG NHẬP");
		btnDN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XuLyDangNhap();
			}
		});
		btnDN.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnDN.setBounds(184, 170, 117, 23);
		contentPane.add(btnDN);
	}
	void XuLyDangNhap() {
		String strTen = txtTenDN.getText();
		String strMK = txtMK.getText();
		if(strTen.equals("63CNTT") && strMK.equals("123")){
			HomeFrame homePage = new HomeFrame();
			homePage.setVisible(true);
			
			this.setVisible(false);
		}else {
			txtTenDN.setText("");
			txtMK.setText("");
			JOptionPane hopThoai = new JOptionPane();
			hopThoai.showMessageDialog(this, "đăng nhập thất bại");
		}
	}
}
