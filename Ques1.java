import java.util.HashMap;

public class Ques1 {
	public static void main(String[]args) {
		Ques1 ques = new Ques1();
		ques.start();
	}
    public void start() {
	String names[] = {"goa","kerala","gujrat"};
	HashMap<String, String> map = new HashMap<>();
	for(int i=0;i<names.length;i++) {
		String key = names[i].substring(0,3).toUpperCase();
		map.put(key,names[i] );
	}
	System.out.println(map);
}
}