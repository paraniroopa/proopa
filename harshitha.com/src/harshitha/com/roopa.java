package harshitha.com;

public class roopa 
{
	private
	int a,b;
	public void display(int x,int y)
	{
	a=x;
	b=y;
	}
	public void output()
	{
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
	public static void main(String srgs[])
	{
		roopa t=new roopa();
		t.display(10,20);
		t.output();
	}
}
