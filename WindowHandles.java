package Imp_Concepts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://grotechminds.com/window-handle-and-handles/");
		driver.manage().window().maximize();
		
		String Childid =driver.getWindowHandle();
		System.out.println(Childid);

		driver.findElement(By.xpath("//button[.='Launch Tab1']")).click();

		Set<String> s1 = driver.getWindowHandles();

		System.out.println(s1);

	}
}
