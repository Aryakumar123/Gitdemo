import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParseString {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		 String lol = getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Arya");
		driver.findElement(By.name("inputPassword")).sendKeys(lol);
		driver.findElement(By.className("signInBtn")).click();

	}
	public  static String getPassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String pass = driver.findElement(By.cssSelector("form p")).getText();
		//Please use temporary password 'rahulshettyacademy' to Login.
		String[] passarray = pass.split("'");
		// 0th index - Please use temporary password
		// 1th index - rahulshettyacademy' to Login.
		String password = passarray[1].split("'")[0];
		return password;
		// 0th index - rahulshettyacademy
		// 1th index -  to Login.
				
		
	}

}
