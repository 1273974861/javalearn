package zerenlianmoshi;

public class xiaozhang extends leader{
	public xiaozhang(String name)
	{
		super(name);
	}
	
	public void handlerequest(qingjiatiaolei qingjiatiao)
	{
		if(qingjiatiao.getleavedays()<30)
		{
			System.out.println("校长："+name+" 请假学生名字："+qingjiatiao.getleavename()+"的请假条，请假天数为："+qingjiatiao.getleavedays()+"天。");
		}
		else
		{
			System.out.println("学生："+qingjiatiao.getleavename()+"请假时间过长，请假失败");
		}
	}
}
