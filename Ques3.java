import java.util.ArrayList;

public class Ques3 {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		ArrayList<Integer> list3 = new ArrayList<>();
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(5);
		
		list3.addAll(list1);
		
		list1.removeAll(list2);
		
		list2.removeAll(list3);
		
		list1.addAll(list2);
		
		System.out.println(list1);
		


	}

}
