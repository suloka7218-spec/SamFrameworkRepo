package Pack2;

import org.testng.annotations.Test;

public class OrgTest {
	@Test
	public void createOrgTest()
	{
		String browser=System.getProperty("browser");
		String url=System.getProperty("url");
		String username=System.getProperty("Username");
		String password=System.getProperty("Password");
		System.out.println(browser);
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
		System.out.println("Execute createOrgTest()");
		
	}
	@Test
	public void modifyOrgTest() {
		System.out.println("Execute modifyOrgTest()");
	}

}
