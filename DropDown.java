package Imp_Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://grotechminds.com/dropdown/");
		driver.manage().window().maximize();

		WebElement Choice1 = driver.findElement(By.xpath("//select[@class='form-select Choice1']"));
		Select s1 = new Select(Choice1);
		s1.selectByVisibleText("Demo6");

		WebElement Choice2 = driver.findElement(By.xpath("//select[@class='form-select Choice2']"));
		Select s2 = new Select(Choice2);
		s2.selectByIndex(5);

	}

}
