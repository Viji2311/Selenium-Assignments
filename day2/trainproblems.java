package week4.day2;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class trainproblems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://erail.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("ms",Keys.TAB);
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("mdu",Keys.TAB);
		driver.findElement(By.id("chkSelectDateOnly")).click();
		
		List<WebElement> listTable = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr//td[2]"));
		
		int s = listTable.size();
		for(int i=1;i<listTable.size();i++)
		{
			System.out.println(listTable.get(i).getText());
		}
		
		HashSet<WebElement> newSet = new HashSet<>(listTable);
		
		int s1=newSet.size();
		
		if(s==s1)
		{
			System.out.println("There is no duplicate");
		}
		else
		{
			System.out.println("Duplicates are present");
		}

	}

}
