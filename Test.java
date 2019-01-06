package Manager;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Provider2 p = new Provider2();
		
		List<StopEta> list = p.getLineEta(5, "5");
		for(StopEta s : list) 
		{
			System.out.println(s);
		}
		
		
		
	}

}
