package Manager;

import java.util.ArrayList;

public abstract class Provider implements INextBusProvider,Query
{

public String url2 = "http://d2fo80vv1pnzuu.cloudfront.net/test/";
public String url1 = "127.0.0.1:8000:test";
//this is the url1


public  ArrayList<Integer> agencies;
public  ArrayList<Integer> getList()
{
	return this.agencies;
}

/*
I want each Provider 1,2,3.... to implement it differently
*/


public String provide(String str) //connect to the server after adding the digit
{

	String result ="";
	
	
	/*method to getBack all answer to String*/
	
	try {
		url1+=str;
		
		 result  = JavaHttpUrlConnectionReader.doHttpUrlConnectionAction(url1);
		 System.out.println(result);
		return result;

	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	/*
	 with this result the get parsed by the JSONParser Object
	 */
	return result;
}
}
