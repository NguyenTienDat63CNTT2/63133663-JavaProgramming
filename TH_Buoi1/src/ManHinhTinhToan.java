import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManHinhTinhToan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtKetQua;

	public ManHinhTinhToan() {
		setFont(new Font("Dialog", Font.PLAIN, 16));
		setTitle("Chương trình tính toán đơn giản");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 616, 368);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập số thứ nhất (a)");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(44, 54, 160, 45);
		contentPane.add(lblNewLabel);
		
		JLabel lblNhpSTh = new JLabel("Nhập số thứ hai (b)");
		lblNhpSTh.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhpSTh.setBounds(44, 110, 160, 45);
		contentPane.add(lblNhpSTh);
		
		txtA = new JTextField();
		txtA.setBounds(214, 63, 242, 31);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setColumns(10);
		txtB.setBounds(214, 119, 242, 31);
		contentPane.add(txtB);
		
		JButton btnCong = new JButton("Cộng");
		btnCong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code xử lý Cộng ở đây
				//Viết lệnh xử ở một thủ tục/hàm, rồi gọi ở đây
				HamXuLyCong();
			}
		});
		btnCong.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnCong.setBounds(104, 198, 75, 31);
		contentPane.add(btnCong);
		
		JButton btnTru = new JButton("Trừ");
		btnTru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code xử lý Trừ ở đây
				HamXuLyTru();
			}
		});
		btnTru.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnTru.setBounds(196, 198, 75, 31);
		contentPane.add(btnTru);
		
		JButton btnNhan = new JButton("Nhân");
		btnNhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code xử lý Nhân ở đây
				HamXuLyNhan();
			}
		});
		btnNhan.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNhan.setBounds(292, 198, 75, 31);
		contentPane.add(btnNhan);
		
		JButton btnChia = new JButton("Chia");
		btnChia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code xử lý chia ở đây
				HamXuLyChia();
			}
		});
		btnChia.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnChia.setBounds(400, 198, 75, 31);
		contentPane.add(btnChia);
		
		JLabel lblKtQu = new JLabel("Kết quả tính toán:");
		lblKtQu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblKtQu.setBounds(44, 251, 137, 45);
		contentPane.add(lblKtQu);
		
		txtKetQua = new JTextField();
		txtKetQua.setEditable(false);
		txtKetQua.setColumns(10);
		txtKetQua.setBounds(214, 260, 242, 31);
		contentPane.add(txtKetQua);
	}//Hết hàm tạo
	void HamXuLyCong() {
		//Lấy dữ liệu từ điều khiển
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
		//Chuyển kiểu
		double soA =  Double.parseDouble(str_soA);
		double soB =  Double.parseDouble(str_soB);
		//Tính toán
		double tong = soA + soB;
		//Đưa ra hiển thị lên điều khiển
		txtKetQua.setText(String.valueOf(tong));
	}
	void HamXuLyTru() {
		//Lấy dữ liệu từ điều khiển
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
		//Chuyển kiểu
		double soA =  Double.parseDouble(str_soA);
		double soB =  Double.parseDouble(str_soB);
		//Tính toán
		double tong = soA - soB;
		//Đưa ra hiển thị lên điều khiển
		txtKetQua.setText(String.valueOf(tong));
	}
	void HamXuLyNhan() {
		//Lấy dữ liệu từ điều khiển
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
		//Chuyển kiểu
		double soA =  Double.parseDouble(str_soA);
		double soB =  Double.parseDouble(str_soB);
		//Tính toán
		double tong = soA * soB;
		//Đưa ra hiển thị lên điều khiển
		txtKetQua.setText(String.valueOf(tong));
	}
	void HamXuLyChia() {
		//Lấy dữ liệu từ điều khiển
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
		//Chuyển kiểu
		double soA =  Double.parseDouble(str_soA);
		double soB =  Double.parseDouble(str_soB);
		//Tính toán
		double tong= 0;
		if(soB==0) {
			JOptionPane.showMessageDialog(contentPane, "Không thể chia cho 0", "Thông báo",JOptionPane.ERROR_MESSAGE);
		}
		else
			tong = soA / soB;
		//Đưa ra hiển thị lên điều khiển
		txtKetQua.setText(String.valueOf(tong));
	}
}
