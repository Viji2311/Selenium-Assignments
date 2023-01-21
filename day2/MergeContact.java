package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.xpath("//div[@id='button']")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		driver.findElement(By.partialLinkText("<a href=\"javascript:call_fieldlookup2autocomplete(document.getElementById('ComboBox_partyIdFrom'),document.getElementById('partyIdFrom'),'LookupContacts');\" id=\"ext-gen612\" xpath=\"1\"><img src=\"/images/fieldlookup.gif\" alt=\"Lookup\" border=\"0\" height=\"14\" width=\"15\" id=\"ext-gen599\"></a>")).click();
		driver.findElement(By.id("ext-gen283")).click();
		driver.findElement(By.partialLinkText("<a href=\"javascript:call_fieldlookup2autocomplete(document.getElementById('ComboBox_partyIdTo'),document.getElementById('partyIdTo'),'LookupContacts');\" id=\"ext-gen606\" xpath=\"1\"><img src=\"/images/fieldlookup.gif\" alt=\"Lookup\" border=\"0\" height=\"14\" width=\"15\" id=\"ext-gen607\"></a>")).click();
		driver.findElement(By.id("ext-gen280")).click();
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		Alert a = driver.switchTo().alert();
		a.accept();
		driver.getTitle();
		driver.close();
		
		
		

	}

}
