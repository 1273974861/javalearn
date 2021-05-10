package zerenlianmoshi;

public abstract class leader {
    protected String name;
    protected leader f;
    public leader(String name)
    {
    	this.name = name;
    }
    
    public void setfu(leader f)
    {
    	this.f = f;
    }
    
    public abstract void handlerequest(qingjiatiaolei qingjiatiao);
}
