import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ques6 {
	
	public HashMap<String,String> passFail() {
		HashMap<String, Integer> marks = new HashMap<>();
		HashMap<String, String> result = new HashMap<>();
		marks.put("abc", 50);
		marks.put("efg", 70);
		Set<Map.Entry<String, Integer>> entries = marks.entrySet();
		for (Map.Entry<String, Integer> entry : entries) {
			if (entry.getValue() <60) {
				result.put(entry.getKey(),"fail");
			}
			else {
				result.put(entry.getKey(),"pass");
			}

		}
		return result;
	}

	public static void main(String[] args)
	{
		
		Ques6 output = new Ques6();
		System.out.println(output.passFail());

	}

}
