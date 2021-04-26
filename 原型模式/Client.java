package 原型模式;

public class Client {
   public static void main(String args[]) {
	   PrototypeManager pm = new PrototypeManager();
	   MyColor obj1 = (MyColor)pm.getColor("Red");
	   obj1.display();
	   MyColor obj2 = (MyColor)pm.getColor("Red");
	   obj2.display();
	   System.out.println(obj1==obj2);
   }
}
