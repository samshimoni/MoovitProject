package Manager;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

public class Provider1 extends Provider  //implements INextBusProvider
{
	
	/*
	 this kind of provider will handle JSON queries
	 */

	static Semaphore lock = new Semaphore(5);
	/*
	 with this Semaphore i want to limit the number of ac
	 */



	@Override
	public List<StopEta> getLineEta(int lineID, String lineNumber)
	{

		/*
		 using threads to make sure Provider is'nt used more than 5 times at ones
		 */

		try {
			lock.acquire();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String result = provide(lineNumber);
		JsonParser1 js = new JsonParser1();
		List<StopEta> answer = new ArrayList<StopEta>();
		answer = js.parseString(result);

		/*
		 releasing the semaphore and letting another query enter
		 */
		lock.release();
		return answer;


	}



}









