package Manager;

import java.util.ArrayList;
import java.util.List;

public class Manager implements INextBusManager
{
	/*
	 each manager has a list of Providers
	 */
	public ArrayList<Provider> providers;

	public List<StopEta> getLineEta(int agencyId, int lineID, String lineNumber) 
	{
		List<StopEta> result = new  ArrayList<StopEta>();


		for(Provider p : providers) 
		{
			/*
			 *checking first if the a Provider of the specific manager own this agency
			 */
			List<StopEta> temp=p.getLineEta(lineID, lineNumber);
			for(StopEta s :temp)
				result.add(s);
		}

		return result;

	}	

}
