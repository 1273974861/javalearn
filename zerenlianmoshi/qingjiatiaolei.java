package zerenlianmoshi;

public class qingjiatiaolei {
   private String leavename;
   private int leavedays;
   
   public qingjiatiaolei(String leavename,int leavedays)
   {
	   this.leavename = leavename;
	   this.leavedays = leavedays;
   }
   
   public void setleavedays(int leavedays)
   {
	   this.leavedays = leavedays;
   }
   
   public void  setleavenames(String leavename) 
   {
	   this.leavename = leavename;
   }
   
   public String getleavename()
   {
	   return (this.leavename);
   }
   
   public int getleavedays()
   {
	   return (this.leavedays);
   }
}
