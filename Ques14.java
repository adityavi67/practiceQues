import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Ques14 
{

	public int average()
	{
		HashMap<Integer, Integer> h1 = new HashMap<>();
		h1.put(12,90);
		h1.put(35,90);
		h1.put(33,90);
		h1.put(56,88);
		int sum=0;
		int avg=0;
		Set<Entry<Integer,Integer>> entries = h1.entrySet();
		for (Entry<Integer, Integer> entry : entries)
		{
			if (entry.getKey()%2!=0) 
			{
				avg=avg+1;
				 sum=sum+entry.getValue();
			}
		}
		return sum/avg;
	}

	public static void main(String[] args)
	{
		Ques14 output = new Ques14();
		System.out.println(output.average());

	}

}