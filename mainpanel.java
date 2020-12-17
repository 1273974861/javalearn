package wannianli;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Scanner;

import javax.swing.JPanel;
public class mainpanel extends JPanel {
     public mainpanel() {
    	 this.setBackground(Color.white);
     }
     //获取画笔
     protected void paintComponent(Graphics g) {
    	super.paintComponent(g);
    	//画格子
 		for(int i=1;i<8;i++) {
 			//横线
 			g.drawLine(0,this.getHeight()/7*i,this.getWidth(),this.getHeight()/7*i);
 			//竖线
 			g.drawLine(this.getWidth()/7*i,0,this.getWidth()/7*i,this.getHeight());
 		}
 		int year=2020;
 		int month=12;
 		int sumday=0;
 		boolean yn=false;
 		//判断闰年来计算天数
 		for(int y=1900;y<year;y++) {
			if((y%4==0&&y%100!=0)||(y%400==0)) {
				sumday+=366;
			}
			else {
				sumday+=365;
			}
		}
 		//判断闰年方便后面运算
 		if((year%4==0&&year%100!=0)||(year%400==0)) {
			yn=true;
		}else {
			yn=false;
		}
 		
 		for(int y=1;y<month;y++) {
 			switch(y) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:			
			case 12:
			    sumday+=31;
	            break;
			case 4:
			case 6:
			case 9:
			case 11:
				 sumday=30;
				break;
			case 2:
				if(yn) {
					 sumday+=29;
					break;
				}
				else {
					 sumday+=28;
						break;
			    }
 		  }
 		}
 		
 		//算星期数
 		int week=sumday%7;
 		int monthday = 0;
 		switch(month) {case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:			
		case 12:
		    monthday=31;
            break;
		case 4:
		case 6:
		case 9:
		case 11:
			monthday=30;
			break;
		case 2:
			if(yn) {
				monthday=29;
				break;
			}
			else {
				monthday=28;
					break;		    
		  }
 		}
 		//表格上画星期
  		String[] weeks = { "日","一","二","三","四","五","六"};
  		//将数字填入表格中
 		for(int i=0;i<weeks.length;i++) {
 			g.drawString(weeks[i], this.getWidth()/7*i+20,30);
 		}
 		
 		int mx=week*this.getWidth()/7;
		int my=this.getHeight()/7;
		//输出日期
 		for(int i=1;i<=monthday;i++) {
 			g.drawString(i+"", mx+20, my+30);
 			mx+=this.getWidth()/7; 			 			
 		if(sumday%7==6) {			
 			mx = 0;
 			my =my+this.getHeight()/7;
 		  }
 		  sumday++;
        } 
 		
 	}
}
