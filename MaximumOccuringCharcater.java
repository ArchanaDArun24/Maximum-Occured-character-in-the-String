package stringInterview;
import java.util.*;
public class MaximumOccuringCharcater {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String x=sc.nextLine();//god_bless_spiderman
		x=x.toUpperCase();
		int n=x.length();
		char y[]=x.toCharArray();
		int i=0,maxval=0;
		char maxkey=' ';
		Map<Character,Integer> map=new LinkedHashMap<>();
		while(i!=n)
		{
			if(map.containsKey(y[i])==false)
			{
				map.put(y[i], 1);
			}
			else
			{
				int old=map.get(y[i]);
				int nev=old+1;
				map.put(y[i], nev);
			}
			++i;
		}
		Set<Map.Entry<Character, Integer>> hmap=map.entrySet();
		for(Map.Entry<Character, Integer> data:hmap)
		{
			if(data.getValue()>maxval)
			{
				maxval=data.getValue();
				maxkey=data.getKey();
				
			}
		}
		System.out.println(maxkey +" "+ maxval);
	}

}
