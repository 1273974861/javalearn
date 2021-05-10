package zerenlianmoshi;

public class xizhuren extends leader {
	public xizhuren(String name)
	{
		super(name);
	}
	
	public void handlerequest(qingjiatiaolei qingjiatiao)
	{
		if(qingjiatiao.getleavedays()<7)
		{
			System.out.println("系主任："+name+" 	请假学生名字："+qingjiatiao.getleavename()+"的请假条，请假天数为："+qingjiatiao.getleavedays()+"天。");
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
