public class Ques5 {

	public static void main(String[] args) {
		Ques5 ex = new Ques5();
		boolean result1 = ex.operation("hello*oworld");
		boolean result2 = ex.operation("hello*world");
		boolean result3 = ex.operation("helloworld");
		System.out.println("result1="+result1+" result2"+result2+" result3"+result3);

	}
	
public boolean operation(String str) {
	if(!str.contains("*")) {
		return false;
	}
	int ind = str.indexOf('*');
	int priorInd = ind-1;
	int nextInd = ind+1;
	char c1 = str.charAt(priorInd);
	char c2 = str.charAt(nextInd);
	if(c1==c2) {
		return true;
	}
	
		return false;

}

}
