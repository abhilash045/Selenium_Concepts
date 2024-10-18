package Imp_Concepts;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropAction {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();		
		driver.get("https://grotechminds.com/drag-and-drop/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement drag =driver.findElement(By.xpath("//div[@id='container-6']"));
		WebElement drop =driver.findElement(By.xpath("(//div[@class='w3-container '])[2]"));

		
		Actions a1 = new Actions(driver);		//-------->  Actions Class Drag and Drop Syntax
		a1.dragAndDrop(drag, drop).perform();	
		driver.quit();
	}
}
