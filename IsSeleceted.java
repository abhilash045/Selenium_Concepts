package Imp_Concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSeleceted {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://grotechminds.com/is-selected/");
		driver.manage().window().maximize();

		WebElement checkbox1 = driver.findElement(By.xpath("(//input[@id='vehicle2'])[1]"));

		boolean b1 = checkbox1.isSelected();

		if (b1 == false) {
			
			checkbox1.click();

			System.out.println("Checkbox was not selected, now selected.");
		} else {
			System.out.println("Checkbox is already selected.");
		}

	}

}
