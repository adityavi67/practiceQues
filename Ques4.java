import java.util.ArrayList;

public class Ques4 {

	public static void main(String[] args) {
		ArrayList<String> List1 = new ArrayList<>();
		ArrayList<String> List2 = new ArrayList<>();
		ArrayList<String> List3 = new ArrayList<>();
		
		List1.add("apple");
		List1.add("orange");
		List1.add("grapes");
		
		List2.add("melon");
		List2.add("apple");
		List2.add("mango");
		
		for(int i = 0; i<List1.size(); i++) {
			String s1 = List1.get(i);
			if(s1.charAt(0)!='a'&& s1.charAt(0)!='g')
				List3.add(s1);
			
		}
		
		
		for(int j = 0; j<List2.size(); j++) {
			String s2 = List2.get(j);
			if(s2.charAt(s2.length()-1)!='n'&& s2.charAt(s2.length()-1)!='e')
			
				List3.add(s2);
		}
		
		
		System.out.println(List3);
		
		
	}

}