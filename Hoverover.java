package Imp_Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hoverover {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/hoverover/");
		driver.manage().window().maximize();

		WebElement hoverover = driver.findElement(By.xpath(
				"//div[@class='has_eae_slider elementor-element elementor-element-1857001 e-con-full e-flex e-con e-child']"));
		Thread.sleep(2000);
		Actions a1 = new Actions(driver);
		a1.moveToElement(hoverover).perform(); // -----> Hover syntax

		Thread.sleep(2000);
		WebElement practice3 = driver.findElement(By.xpath("(//span[@class='toolriptext4']//div)[3]"));

		boolean b1 = practice3.isSelected();

		if (b1 == false) {
			practice3.click();
			System.out.println("practice3 is selected");
		} else {
			System.out.println("practice3 is not selected");
		}

	}

}
