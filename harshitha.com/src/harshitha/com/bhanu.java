package harshitha.com;

public class bhanu 
{
	void m1(char ch)
	{
	System.out.println("ch="+ch);	
	}
void m1(int i)
{
	System.out.println("i="+i);
}
void m1(int i,int j)
{
	System.out.println(i+"-----"+j);
}
public static void main(String args [])
{
	bhanu t=new bhanu();
	t.m1('a');
	t.m1(10);
	t.m1(10,20);
}
}
