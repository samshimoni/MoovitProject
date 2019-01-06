package Manager;

import java.util.List;

public interface INextBusProvider
{
	List<StopEta> getLineEta(int lineID,String lineNumber);
}
