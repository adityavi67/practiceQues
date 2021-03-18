import java.util.ArrayList;

public class Ques11 {
	public void listCompare(ArrayList<Integer> List1,ArrayList<Integer> List2) {
		ArrayList<Integer> List3 = new ArrayList<>();
		for(int i=0; i<List1.size(); i++) {
			if(i!=0 && i%2!=0) {
				List3.add(List1.get(i));
			}
			else if(i==0 || i%2==0) {
				List3.add(List2.get(i));
			}
		}
		System.out.println(List3);
	}

	public static void main(String[] args) {
		Ques11 output = new Ques11();
		ArrayList<Integer> List1 = new ArrayList<>();
		ArrayList<Integer> List2 = new ArrayList<>();
		
		List1.add(12);
		List1.add(1);
		List1.add(32);
		List1.add(3);
		
		
		List2.add(0);
		List2.add(12);
		List2.add(2);
		List2.add(23);
		
		output.listCompare(List1, List2);


	}

}