import java.util.ArrayList;

public class LoopsJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num3 = { 9, 6 , 5 , 2 };
		for(int i=0;i<num3.length;i++)
		{
			if(num3[i] % 2 ==0)
			{
				System.out.println(num3[i]);
			}
			else
			{
				System.out.println(num3[i] + "is not divisble by 2");
			}
		}
		ArrayList<String> g = new ArrayList<String>(); 
		g.add("kissan");
		g.add("suman");
		g.add("ump");
		g.remove(0);
		System.out.println(g.get(0));
		for(int i=0;i<g.size();i++)
		{
			System.out.println(g.get(i));
		}
		for (String cv : g)
		{
			System.out.println(cv);
		}
		

	}

}
