package Manager;

import java.util.List;

public class Provider2 extends Provider
{

	public List<StopEta> getLineEta(int lineID, String lineNumber)
	{
		 //String result = provide(null);
			
		//List<StopEta> result2 = CSVParser.parse(result);
		CSVReader csvr = new CSVReader();
		String r = csvr.run();
		System.out.println(r);
		List<StopEta> result2 = CSVParser.parse(r);
		return result2;
	}
	

}
