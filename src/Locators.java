import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Arya");
		driver.findElement(By.name("inputPassword")).sendKeys("Arya");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder= 'Name']")).sendKeys("lol");
        
		//xpath syntax :
         // ->//tagname[@attribute='Value']
	    // -> //tagname[@attribute='Value'][index]
		// -> //parenttagname/childtagname
		// -> //tagname[contains(@attribute='Value')]--regular expression
		//Css selector syntax :
		// ->tagname[attribute ='value']
		// ->tagname.classname
		// ->tagname#id
		// ->tagname[attribute ='value']:nth-child(index)
		// ->parenttagname childtagname
		//-> tagname[attribute* ='value']--(value can be short in this case--regular expression)
		
		driver.findElement(By.xpath("//input[@type= 'text'][2]")).sendKeys("jhsgfshr @ gamil.com");
		//driver.findElement(By.cssSelector("input[type= 'text']:nth-child(3)")).clear();
		driver.findElement(By.cssSelector("form input:nth-child(4)")).sendKeys("15498451661");
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        System.out.println(driver.findElement(By.cssSelector("form p")).getText());
        driver.findElement(By.xpath("//div/button[@class='go-to-login-btn']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Arya");
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
        
	}

}
