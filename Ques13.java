public class Ques13 {
	public boolean isPalindrome(int num) 
	{
		int rev = 0; 
        for (int i = num; i > 0; i /= 10) 
        { 
            rev = rev * 10 + i % 10;
        }
        if(num==rev) 
        {
        	return true;
        }
        return false;
	}
	
	public void sumPalindromeBetween(int num1, int num2)
	{
		int sum = 0;
		for(int i=num1;i<num2;i++) 
		{
			if(isPalindrome(i)==true)
			{
				sum = sum+i;
				
			}
		}
		
		System.out.println(sum);
	
	}

	public static void main(String[] args)
	{
		
		Ques13 output = new Ques13();
		
		output.sumPalindromeBetween(90,120);


	}

}