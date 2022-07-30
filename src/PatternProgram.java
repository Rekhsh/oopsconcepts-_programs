
public class PatternProgram {
	
	
	public void printsquarestar()

	{
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				System.out.print("*");
				
			}
			System.out.println();
		}
		
	}
	
	public void printtriangle()
	{
	
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
				
			}
			System.out.println();
		}
		
	}
	
	public void reversetriangle()
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=i;j<=4;j++)
			{
				System.out.print("*");
				
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PatternProgram obj2=new PatternProgram();
		obj2.printsquarestar();
		System.out.println("                                  ");
		obj2.printtriangle();
		obj2.reversetriangle();
		

	}

}
