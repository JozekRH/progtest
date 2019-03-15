package Test1;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.Result;

import ru.progwards.lms.main.TestResult;

public class TestClass1{
	
	@Test
	public void runTest()
	{
		TestTask22 tt = new TestTask21();
		Assert.assertTrue("Тест t1 не прошел", tt.t1().equals("111"));
		Assert.assertTrue("Тест t2 не прошел", tt.t2() == 222);
	}
	
	public static TestResult processResult(Result jUnitResult)
	{
		if (jUnitResult != null && jUnitResult.getFailureCount() == 0) 
			return new TestResult(true, 30, "Выполнено без замечаний.");
		
		return null;
	}

	public static String getTitle()
	{
		return "ДЗ урока 2, задача 2";
	}
}

