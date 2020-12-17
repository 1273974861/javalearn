package wannianli;
import javax.swing.JPanel;
import java.awt.Label;
import java.awt.Button;
import java.awt.Color;
import java.awt.TextField;
public class toppanel extends JPanel{	 	 
	private static final long serialVersionUID = 1L;

	public toppanel() {
    	this.setBackground(Color.white);
    	//创造标签来输入年月份
    	Label year=new Label("year：");
    	Label month=new Label("month：");
    	TextField textfieldyear=new TextField(4);
    	TextField textfieldmonth=new TextField(2);
    	Button btn =new Button("queding");
    	this.add(year);
    	this.add(textfieldyear);
    	this.add(month);
    	this.add(textfieldmonth);
    	this.add(btn);
    }
}
