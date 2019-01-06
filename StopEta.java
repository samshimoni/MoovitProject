package Manager;

import java.util.Date;
import java.util.StringTokenizer;

public class StopEta 
{
	int stopId;
	Date eta;
	
	public StopEta() {};
	public StopEta(int id, Date date) 
	{
		this.stopId=id;
		this.eta = date;
	}
	
	public String toString() 
	{
		return this.stopId +" "+ this.eta;
	}
	
}


