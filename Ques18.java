import java.util.ArrayList;


public class Ques18
{
	public void removeFromArray(int arr[], int num) 
	{
		ArrayList<Integer> arr1 = new ArrayList<>();
		
		for(int i=0;i<arr.length;i++)
		{
            if(arr[i]!=num)
            {
            	
                arr1.add(arr[i]);
 
            }
        }
		
		System.out.println(arr1);
		
	}

	public static void main(String[] args) 
	{
		Ques18 output = new Ques18();
		int[] arr = {10,10,20,30,76};
		output.removeFromArray(arr, 10);
	}

}