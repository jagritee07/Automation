import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class add {
	@DataProvider
	public Object[][] addition() throws Exception
	{
		Object data[][] = DataDriven.getTestData("testdata");
		return data;
	}

	@Test(dataProvider="addition")
	public void Test(String a,String b)
	{ 
		Double i=Double.parseDouble(a);  
		Double j=Double.parseDouble(b);  
	System.out.println(i+j);
	
	}
	
	

}
