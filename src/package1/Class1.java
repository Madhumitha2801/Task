package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     System.out.print("Facebook");
		  WebDriver driver=new ChromeDriver();
		     System.out.print("Facebook");
		     driver.get("https://www.facebook.com/");
		     WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		      WebElement pass = driver.findElement(By.xpath("//*[@id=\"pass\"]"));
		      WebElement btnLogin = driver.findElement(By.xpath("//*[text()=\"Log in\"]"));
		      email.sendKeys("12334@gmail.com");
		      pass.sendKeys("1234");
		      btnLogin.click();
	}

}
