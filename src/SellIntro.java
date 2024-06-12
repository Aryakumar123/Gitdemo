import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SellIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     // WebDriver driver = new ChromeDriver();

		WebDriver driver = new EdgeDriver();
       driver.get("https://udemy.com");
       System.out.println(driver.getTitle());
       System.out.println(driver.getCurrentUrl());
       driver.close();
       
	}

}
