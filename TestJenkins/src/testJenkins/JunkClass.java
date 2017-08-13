package testJenkins;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.Test;

public class JunkClass {

	//@Test
	public static void main(String[] args){
	WebDriver driver;
	System.setProperty("webdriver.firefox.marionette","C:\\geckodriver\\geckodriver.exe");
	driver=new FirefoxDriver();
	driver.get("http://www.our-africa.org/ethiopia/");
	//String Pagetitle = driver.getTitle();
	//System.out.print("The Title of this Website is:");
	//System.out.print(Pagetitle);
		}
}
