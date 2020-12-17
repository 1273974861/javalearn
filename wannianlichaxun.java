package wannianli;
import java.util.Scanner;
public class wannianlichaxun {

	public static void main(String[] args) {
		int years=0;
		int months=0;
		int days=0;
		boolean yn=false;
			do {		
		    System.out.println(" ———————— 万年历查询  —————————");
			Scanner input=new Scanner(System.in);
			System.out.print("请输入年份：");
			years=input.nextInt();
			System.out.print("请输入月份：");
			months=input.nextInt();    
			//防止用户输入的月份不在1-12的范围内
			yn=((months<1)||(months>12)||(years<1900));
			if(yn) {
				System.out.println("输入信息错误，请重新输入");
			}
		}while(yn);
		int totaldays=0;
		//判断闰年
		if((years%4==0&&years%100!=0)||(years%400==0)) {
			yn=true;
		}
		//分别计算年份天数差和月天数差求得总和来计算星期几
		//计算相差年份的天数
		for(int i=1900;i<years;i++) {
			if((i%4==0&&i%100!=0)||(i%400==0)) {
				totaldays=totaldays+366;
			}
			else {
				totaldays=totaldays+365;
			}
		}
		int beforedays=0;
		//计算月相差天数
		for(int j=1;j<=months;j++) {
			switch(j) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:			
			case 12:
			    days=31;
	            break;
			case 4:
			case 6:
			case 9:
			case 11:
				days=30;
				break;
			case 2:
				if(yn) {	·
					days=29;
					break;
				}
				else {
						days=28;
						break;
			    }
		}
			//累加到前一个月
			if(j<months) {
				beforedays=beforedays+days;
			}
	  }
		//总相差天数
		totaldays=totaldays+beforedays;
		int firstdayofmonth=0;
		int temp=1+totaldays%7;
		if(temp==7) {
			firstdayofmonth=0;            //周日，规定星期日为第一天
		}
		else {
			firstdayofmonth=temp;         //周一到周六
		}
		//输出
		System.out.println("日\t一\t二\t三\t四\t五\t六");
		for(int k=0;k<firstdayofmonth;k++) {
			System.out.print("\t");
		}
		    //显示几号对应是星期几
		for(int m=1;m<=days;m++) {
			System.out.print(m+"\t");
			//一周完整完成后换行
		if((totaldays+m)%7==6) {
			System.out.print("\n");
		}
	  }
   }
}
