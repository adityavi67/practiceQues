public class Ques20 {
	public String convertToString(String strArr[])
	{
		StringBuffer sb = new StringBuffer();
	      for(int i = 0; i < strArr.length; i++) {
	         sb.append(strArr[i]);
	      }
	      String str = sb.toString();
	      System.out.println(str);
	      return str;      
	}

	public static void main(String[] args) {
		String str[] = {"Vikas", "Lokesh", "Ashok"};
		Ques20 output = new Ques20();
		output.convertToString(str);


	}

}
