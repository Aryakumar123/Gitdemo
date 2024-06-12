import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footerdriver = driver.findElement(By.cssSelector("footer.clearfix.simple"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		WebElement lilfootdriver = footerdriver.findElement(By.cssSelector("ul.footer-site-links"));
		System.out.println(lilfootdriver.findElements(By.tagName("a")).size());
		
		for(int i=0;i<lilfootdriver.findElements(By.tagName("a")).size();i++)
		{
			String clickonlinks = Keys.chord(Keys.CONTROL,Keys.ENTER);
			lilfootdriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinks);
			Thread.sleep(4000);
		}
			Set<String> cvv = driver.getWindowHandles();
			Iterator<String> it = cvv.iterator();
			
			while(it.hasNext())
			{
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}
		

	}

}
