package week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class leafground {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/window.xhtml;jsessionid=node0ohpw87cjok1dz9p1fgudvj6l12019.node0");
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		System.out.println("The new window is opened" + driver.getTitle());
		String actual = driver.getWindowHandle();
		Set<String> newWindow = driver.getWindowHandles();
		List<String> listOfWindows = new ArrayList<String>(newWindow);
		driver.switchTo().window(listOfWindows.get(1));
		driver.switchTo().window(listOfWindows.get(0));
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		System.out.println(listOfWindows.size());
		
		for(String child:newWindow) {
			
			if(!actual.equalsIgnoreCase(child))
			{
				driver.switchTo().window(child);
				driver.close();
			}
		}
		
		
		
	
	    
	}

}
