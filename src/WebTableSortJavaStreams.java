import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebTableSortJavaStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		// click on the list
		driver.findElement(By.xpath("//tr/th[1]")).click();

		// convert all the web elements into list
		List<WebElement> listw = driver.findElements(By.xpath("//tr/td[1]"));

		// capture text of all elements into original list
		List<String> originallist = listw.stream().map(c -> c.getText()).collect(Collectors.toList());

		// sort the original list
		List<String> sortedlist = originallist.stream().sorted().collect(Collectors.toList());

		// compare orglist to sorlist
		Assert.assertTrue(originallist.equals(sortedlist));

		// Scan the names column with gettext and print out the price
		List<String> price = listw.stream().filter(s -> s.getText().contains("Beans")).map(s -> getVeggiesPrice(s))
				.collect(Collectors.toList());
		price.forEach(s->System.out.println(s));
	}

	private static String getVeggiesPrice(WebElement s) {
		String prices = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return prices;
	}

}
