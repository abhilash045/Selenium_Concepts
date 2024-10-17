package Imp_Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertFunction {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://grotechminds.com/alert/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("(//button[.='Alert1'])[1]")).click(); // -----> Alert syntax Dismiss
		driver.switchTo().alert().dismiss();

		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[.='Alert1'])[2]")).click();
		driver.switchTo().alert().accept();

	}

}
