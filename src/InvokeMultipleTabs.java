import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeMultipleTabs {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.switchTo().newWindow(WindowType.TAB);

		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parentab = it.next();
		String childtab = it.next();
		driver.switchTo().window(childtab);
		driver.get("https://rahulshettyacademy.com/");
		String name = driver.findElements(By.cssSelector("[href*='https://courses.rahulshettyacademy.com/p']")).get(1)
				.getText();
		driver.switchTo().window(parentab);
		WebElement search = driver.findElement(By.cssSelector("input[id='search']"));
		search.sendKeys(name);
		File fi = search.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(fi, new File("logo.png"));
	}

}
