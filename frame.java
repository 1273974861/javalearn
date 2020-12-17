package wannianli;
import java.awt.BorderLayout;
import javax.swing.JFrame;
public class frame extends JFrame {
	public frame() {
		this.setTitle("万年历查询");
		this.setSize(400,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		//顶部面板
		toppanel tp =new toppanel();
		this.add(tp,BorderLayout.NORTH);
		//主面板
		mainpanel mp=new mainpanel();
		this.add(mp);
		this.setVisible(true);
	}
	public static void main(String args[]) {
		new frame();
	}
}
