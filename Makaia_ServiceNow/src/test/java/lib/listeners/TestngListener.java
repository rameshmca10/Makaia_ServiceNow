package lib.listeners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;

public class TestngListener implements IAnnotationTransformer, IRetryAnalyzer {

	int maxcount = 1;
	int count = 1;

	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		if (testClass.getName().contains("Incident")) {
			annotation.setRetryAnalyzer(this.getClass());
//		annotation.setEnabled(false);
//		annotation.setTimeOut(5000);
		}
	}

	public boolean retry(ITestResult result) {
		if (!result.isSuccess() && maxcount <= count) {
			count++;
			return true;
		} else {
			return false;
		}
	}
}