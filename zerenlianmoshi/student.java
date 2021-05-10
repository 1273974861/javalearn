package zerenlianmoshi;

public class student {
	public static void main(String args[])
	{
		leader objfudaoyuan,objxizhuren,objyuanzhang,objgeneralxiaozhang;
		
		objfudaoyuan = new fudaoyuan("张茜");
		objxizhuren = new xizhuren("王同喜");
		objyuanzhang = new yuanzhang("院长11");
		objgeneralxiaozhang = new xiaozhang("校长11");
		
		objfudaoyuan.setfu(objxizhuren);
		objxizhuren.setfu(objyuanzhang);
		objyuanzhang.setfu(objgeneralxiaozhang);
		
		qingjiatiaolei one = new qingjiatiaolei("张三",4);
		objfudaoyuan.handlerequest(one);
		
		qingjiatiaolei two = new qingjiatiaolei("李四",8);
		objfudaoyuan.handlerequest(two);
		
		qingjiatiaolei three = new qingjiatiaolei("刘五",22);
		objfudaoyuan.handlerequest(three);
		
		qingjiatiaolei four = new qingjiatiaolei("王二麻子",34);
		objfudaoyuan.handlerequest(four);
	}
}
