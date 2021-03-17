import java.util.HashMap;
import java.util.*;

public class Ques2 {
	public static void main(String[] args) {
		Ques2 key = new Ques2();
		key.start();
	}
	public void start() {
		StringBuffer s = new StringBuffer("");
		HashMap<String,String> map = new HashMap<>();
		map.put("ram","hari");
		map.put("ciso","barfi");
		map.put("honeywell","cs");
		map.put("cts","hari");
		Set<Map.Entry<String, String>>entries=map.entrySet();
		for (Map.Entry<String,String> entry:entries) {
			if(entry.getValue()=="hari") {
				System.out.print(entry.getKey());
			}
		}
		System.out.print(s);
	}

}