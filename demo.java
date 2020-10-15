package one;
import java.util.Scanner;
class Car{
	String color;
	int number;
	int speed;
	void swap(int x) {
		if(x>=60) {
			System.out.println("这是个快车");
		}
	}
}

public class demo {

	public static void main(String args[]) {
		Car baoma=new Car();
		Scanner input=new Scanner(System.in);
		System.out.print("请输入你车牌号：");
		baoma.number=input.nextInt();
		System.out.print("请输入你车颜色：");
		baoma.color=input.next();
		System.out.print("请输入你车速度：");
		baoma.speed=input.nextInt();
		baoma.swap(baoma.speed);
		System.out.print("车颜色："+baoma.color+"   车牌号："+baoma.number+"   速度为："+baoma.speed);
	}
	
	}
