package Imp_Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://grotechminds.com/rightclick/");
		driver.manage().window().maximize();

		WebElement checkbox1 = driver.findElement(By.xpath("(//a[@href='https://www.google.com/'])[1]"));
		Actions a1 = new Actions(driver);
		a1.contextClick(checkbox1); // contex Click Syntax

		a1.doubleClick(checkbox1); // DoubleClick Syntax
	}

}
