public class Ques15
{
	public int digitSquared(int num)
	{
		int sum;
		int digit1 = num/100%10;
		int digit2 = num/10%10;
		int digit3 = num%10;
		sum = (digit1*digit1) + (digit2*digit2) + (digit3*digit3);
		System.out.println(sum);
		return sum;
		
	}

	public static void main(String[] args)
	{
		Ques15 output = new Ques15();
		int num = 125;
		output.digitSquared(num);


	}

}