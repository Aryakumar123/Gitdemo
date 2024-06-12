import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CalenderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		String day = "7";
		String month = "4";
		String year = "2030";
		String[] inline = {month,day,year};

		driver.findElement(By.cssSelector(".react-date-picker__inputGroup")).click();
		driver.findElement(By.cssSelector("button.react-calendar__navigation__label")).click();
		driver.findElement(By.cssSelector("button.react-calendar__navigation__label")).click();
		driver.findElement(By.xpath("//button[text()='" + year + "']")).click();
		driver.findElements(By.cssSelector(".react-calendar__year-view__months__month"))
				.get(Integer.parseInt(month) - 1).click();
		driver.findElement(By.xpath("//abbr[text()='" + day + "']")).click();
		
		List<WebElement> lc = driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
		
		for(int i=0;i<lc.size();i++)
		{
			System.out.println(lc.get(i).getAttribute("value"));
			Assert.assertEquals(lc.get(i).getAttribute("value"), inline[i]);
			
		}
	}

}
