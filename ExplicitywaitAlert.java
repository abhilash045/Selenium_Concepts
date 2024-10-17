package Imp_Concepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitywaitAlert {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/alert/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("(//button[.='Button1'])[1]")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15)); // Explictwait with alart
		wait.until(ExpectedConditions.alertIsPresent());

		driver.switchTo().alert().accept();

		Thread.sleep(3000);

		WebElement select = driver.findElement(By.xpath("(//button[.='Received1'])[3]"));
		select.click();

		driver.switchTo().alert().accept();

	}

}
