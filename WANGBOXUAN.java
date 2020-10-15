package one;

     class xuesheng {
	public int age;
	 String pifucolor;
	public int gaoshuchengji;
	public void jidian(int jidian)
	{
		if(jidian>2) {
			System.out.println("绩点合格");
		}
		else {
			System.out.println("绩点不合格");
		}
		
	}

}
public class WANGBOXUAN{
	public static void main (String arge[]) {
	xuesheng wbx= new xuesheng();
	wbx.age=19;
	wbx.pifucolor="yellow";
	wbx.gaoshuchengji=96;
	int jidian=5;
	wbx.jidian(jidian);
	System.out.println("age="+wbx.age);
	System.out.println("pifucolor="+wbx.pifucolor);
	System.out.println("gaoshuchengji="+wbx.gaoshuchengji);
	}
}
