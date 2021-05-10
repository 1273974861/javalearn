package zerenlianmoshi;

public class yuanzhang extends leader{
	public yuanzhang(String name)
	{
		super(name);
	}
	
	public void handlerequest(qingjiatiaolei qingjiatiao)
	{
		if(qingjiatiao.getleavedays()<15)
		{
			System.out.println("院长："+name+" 请假学生名字："+qingjiatiao.getleavename()+"的请假条，请假天数为："+qingjiatiao.getleavedays()+"天。");
		}
		else
		{
			if(this.f!=null)
			{
				this.f.handlerequest(qingjiatiao);
			}
		}
	}
}
