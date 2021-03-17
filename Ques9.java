import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ques9 {
	
	public void arraySort(String [] array)
	{
		
		Arrays.sort(array);	
		
	}
	
	public String[] arrayRev(String [] array)
	{
		
		Collections.reverse(Arrays.asList(array)); 
        System.out.println("Reversed sorted array = "+Arrays.asList(array));
		return array;
        
	}

	public static void main(String[] args){
		
		Ques9 ques = new Ques9();
		
		String[] reversed;
		
		String [] array = {"red", "green", "blue", "ivory"};
		
		ques.arraySort(array);
		reversed = ques.arrayRev(array);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("enter num: ");
		int num = sc.nextInt();
		
		if(num==1) 
		{
			System.out.println(reversed[0]);
		}
		else
			System.out.println("Please enter num = 1");
		
		sc.close();
		
	}

}