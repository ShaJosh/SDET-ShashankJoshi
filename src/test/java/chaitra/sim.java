package chaitra;

class p 
{
	static p s1 = new p();						// Rule 2
	private p()									// Rule 1
	{
		System.out.println("Constructor");
	}
	public static p getInstance() 				// Rule 3
	{
		return s1;
	}
}

public class sim 
{
	public static void main(String[] args) 
	{
		System.out.println(p.getInstance());
		System.out.println(p.getInstance());
	}
}

