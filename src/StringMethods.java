
public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//string literal
		String s= "yo honey singh";
		
		//new
		String s2 = new String("go go gone");
		
		String[] splitstring = s.split("honey");
		System.out.println(splitstring[0]);
		System.out.println(splitstring[1].trim());
		
	for(int i = s.length()-1; i>=0;i--)
	{
		System.out.println(s.charAt(i));
	}

	}

}
