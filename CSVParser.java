package Manager;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public abstract class CSVParser
{
	public static List<StopEta> parse(String resultHttp) 
	{
		List<StopEta> result = new ArrayList<StopEta>();
		
		String res[] = resultHttp.split(",");
		
		for(int i=0;i<res.length;i+=2) 
		{
			int x = Integer.parseInt(res[i]);
			long y3 = Long.parseLong(res[i+1]);
			
			StopEta s =new StopEta(x, new Date(y3));
			result.add(s);
		}
		return  result;
		
	}

}
