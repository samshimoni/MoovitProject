package Manager;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;



public class CSVReader
{
	public CSVReader() {}
	public String run()
	{
		String csvFile = "/Users/sam/eclipse-workspace/OOP/src/GUI/Sample.csv";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";
		String result="";
		try {

			br = new BufferedReader(new FileReader(csvFile));
			
			br.readLine();
			br.readLine();
			while ((line = br.readLine()) != null) {

				// use comma as separator
				String[] stops = line.split(cvsSplitBy);

				
				result+=stops[0]+","+stops[1]+",";
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return result;
	}
}
