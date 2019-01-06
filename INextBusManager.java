package Manager;

import java.util.List;

public interface INextBusManager
{
	List<StopEta> getLineEta(int agencyId, int LineId,String lineNumber);
}
