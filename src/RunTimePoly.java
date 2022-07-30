import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RunTimePoly {
	
	public void populate(List<Integer> li)
	{
			li.add(30);
			li.add(40);
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunTimePoly obj2=new RunTimePoly();
		List<Integer> numbers =new LinkedList<>();
		obj2.populate(numbers);
		List<Integer> numA =new ArrayList<>();
		obj2.populate(numA);
		System.out.println("LinkedList is :"+numbers);
		System.out.println("ArrayList is :"+numA);
		
		// at runtime we can pass anylist i.e wht run time polymorphism 
		

	}

}
