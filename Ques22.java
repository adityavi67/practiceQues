public class Ques22 {
	public int findSquareRoot(int x1, int x2, int y1, int y2) {
		double sum = ((x1+x2)*(x1+x2))+((y1+y2)*(y1+y2));
		int sqRoot = (int) Math.sqrt(sum);
		System.out.println(sqRoot);
		return sqRoot;
	}

	public static void main(String[] args) {
		Ques22 output = new Ques22();
		output.findSquareRoot(1, 2, 3, 4);


	}

}