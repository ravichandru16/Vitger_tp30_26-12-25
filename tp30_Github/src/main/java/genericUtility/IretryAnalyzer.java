package genericUtility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class IretryAnalyzer implements IRetryAnalyzer {

	int count;
	int maxcount=3;

	@Override
	public boolean retry(ITestResult result) {
		if(count<maxcount)
		{
			count ++;
			return true;
		}
		return false;
	}
}
