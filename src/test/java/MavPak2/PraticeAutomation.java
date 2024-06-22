package MavPak2;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.testng.annotations.AfterTest;
		import org.testng.annotations.DataProvider;
		import org.testng.annotations.Test;

		public class PraticeAutomation {
		WebDriver driver;
		@Test (dataProvider="logindata")
			
			public void class1(String username , String password) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL-NBT\\Downloads\\chromedriver-win64\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://practicetestautomation.com/practice-test-login/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(username);
			driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
			driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		}

		@AfterTest
		public void class2() {
			driver.close();
			
		}
		@DataProvider(name="logindata")
		public Object[][] class3() {
		return new Object[][] {
			{"incorrectUser","Password123"},
			{ "student","incorrectPassword "},
			{"student","Password123"}, 
			
		};
			
			
		
	}

}
