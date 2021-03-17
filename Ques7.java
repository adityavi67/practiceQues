import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Ques7 {

	public int average(){
		HashMap<Integer, Integer> h1 = new HashMap<>();
		h1.put(1,4);
		h1.put(2,6);
		h1.put(4,7);
		h1.put(5,9);
		int sum=0;
		int avg=0;
		Set<Entry<Integer,Integer>> entries = h1.entrySet();
		for (Entry<Integer, Integer> entry : entries) {
			if (entry.getKey()%2!=0) {
				avg=avg+1;
				 sum=sum+entry.getValue();
			}
		}
		return sum/avg;
	}

	public static void main(String[] args) {
		Ques7 output = new Ques7();
		System.out.println(output.average());

	}

}