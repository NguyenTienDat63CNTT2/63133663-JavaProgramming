import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class VD_JavaSwing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame(); //Tạo một thể hiện đối tượng của lớp
		f.setTitle("Ví dụ Frame"); //Tiêu đề cửa sổ
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		f.setSize(300,200); // kich thuoc cua so
		
		//Quy định loại bố cục
		f.setLayout(new FlowLayout());
		
		//Tạo một nút bấm
		JButton btnOK = new JButton("Nhấn tôi đi");
		//Tạo một tai nghe và gắn luôn sự kiện sử lí nút ok
		btnOK.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// Xử lí khi User click chuột ở đây
				JDialog dialog = new JDialog();
				dialog.setTitle("Thông báo gì đó");
				dialog.setSize(220,120);
				dialog.show();
				
			}
		});

		
		JButton btnKhac = new JButton("Nhấn em đi");
			
		//Gắn lên frame
		f.add(btnOK);
		f.add(btnKhac);
		
		
		f.show(); //hien cua so
	}

}
