package Pack1;
import org.testng.annotations.Test;

public class ContactTest 
{
	@Test
	public void createContactTest()
	{
		String browser=System.getProperty("browser");
		String url=System.getProperty("url");
		String username=System.getProperty("Username");
		String password=System.getProperty("Password");
		System.out.println(browser);
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
		System.out.println("Execute createContactTest()");
		
	}
	@Test
	public void modifyContactTest() {
		System.out.println("Execute modifyContact()");
	}
	

}
