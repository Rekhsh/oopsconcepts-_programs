import java.util.HashSet;

public class AlphabetPrg {
	
	public void printVowel(String input) {
		// TODO Auto-generated method stub
		//HashSet<E>
		
		System.out.print("Vowels are :{");
		for(int i=0;i<input.length();i++)
		{
		 
			
			char c =input.charAt(i);
		
			//optional if(input.charAt(i)=='a'|| 'e'||other letter compare )
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
			
			{
		
				System.out.print(""+c +"  " );
			}
	
		}
		System.out.print("}");
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AlphabetPrg obj1=new AlphabetPrg();
	
		obj1.printVowel("MURLI");
		

	}

	

}
