package testingclass;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
//import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class JavaPointTestClass 
{
	public static void main(String[]args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.get("https://www.javatpoint.com/");
		Thread.sleep(3000);
		
		//Current URL
		String mainURL = driver.getCurrentUrl();
		System.out.println(mainURL);
		if(mainURL.equals("https://www.javatpoint.com/"))
		{
			System.out.println("The main Page URL PASS");
		}
		else
		{
			System.out.println("The main Page URL is FAIL");
		}
		Thread.sleep(3000);
	
		//Current Title
		String Maintitle = driver.getTitle();
		System.out.println(Maintitle);
		if(Maintitle.equals("Tutorials List - Javatpoint"))
		{
			System.out.println("The main page title is PASS");
		}
		else
		{
			System.out.println("The main page title is FAIL");
		}
		Thread.sleep(3000);
		System.out.println("===============================================================================");
		
		//( //div//li//a)[1]
		WebElement home = driver.findElement(By.xpath("//a[text()=' Home']"));
		home.click();
		Thread.sleep(3000);
		
		//div[@id='link']//li[3]//a
		WebElement java = driver.findElement(By.xpath("//div[@id='link']//li[3]//a"));
		java.click();
		
		//URL==>JAVA PAGE
		String javaUrl = driver.getCurrentUrl();
		System.out.println(javaUrl);
		if(javaUrl.equals("https://www.javatpoint.com/java-tutorial"))
		{
			System.out.println("The Java page URL PASS");
		}
		else
		{
			System.out.println("The java Page URL Fail");
		}
		Thread.sleep(3000);
		
		//TITLE==>JAVA PAGE
		String javatitle = driver.getTitle();
		System.out.println(javatitle);
		if(javatitle.equals("Java Tutorial | Learn Java Programming - javatpoint"))
		{
			System.out.println("The java page Ttitle PASS");
		}
		else
		{
			System.out.println("The java page Ttitle FAIL");
		}
		Thread.sleep(3000);
		System.out.println("===============================================================================");
		
		TakesScreenshot take = (TakesScreenshot)driver;
		File screen = take.getScreenshotAs(OutputType.FILE);
		File store = new File("C:\\Users\\Lenovo\\Desktop\\Manual testing\\Automation\\java.jpg");
		FileHandler.copy(screen, store);
		Thread.sleep(3000);
		
		//(//a[@class='next'])[1]
		WebElement next =  driver.findElement(By.xpath("(//a[@class='next'])[1]"));
		next.click();
		
		//https://www.javatpoint.com/history-of-java
		String URLhis = driver.getCurrentUrl();
		System.out.println(URLhis);
		if(URLhis.equals("https://www.javatpoint.com/history-of-java"))
		{
			System.out.println("History of java page URL PASS");
		}
		else
		{
			System.out.println("History of java page URL FAIL");
		}
		Thread.sleep(3000);
		
		String titlehis = driver.getTitle();
		System.out.println(titlehis);
		if(titlehis.equals("History of Java - Javatpoint"))
		{
			System.out.println("History of java page Title PASS");
		}
		else
		{
			System.out.println("History of java page Title FAIL");
		}
		Thread.sleep(3000);
		
//      JavascriptExecutor js = (JavascriptExecutor)driver;
//     	Dimension size = new Dimension(400,700);
//		driver.manage().window().setSize(size);
//		Thread.sleep(3000);
		
		//Scroll down==>Positive no ==>2000
//		js.executeScript("window.scrollBy(0,5000)");
//		Thread.sleep(3000);
		
		//Scroll Up==>negative no ==>-1000
//		js.executeScript("window.scrollBy(0,-2000)");
	
		//Scroll Right==>positive no==>1000
//		js.executeScript("window.scrollBy(1000,0)");
//		Thread.sleep(3000);
//		
//		//Scroll Left==>negative no==>-100
//		js.executeScript("window.scrollBy(-100,0)");

		//a[text()='Java OOPs Concepts']
		WebElement oop = driver.findElement(By.xpath("//div//div//div[5]//div[6]//a[1]"));
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",oop);
		
//		boolean oopdisplayed = oop.isDisplayed();
//		System.out.println(oopdisplayed);
//		if(oopdisplayed==true)
//		{
//			System.out.println("It is displayed : "+oopdisplayed);
//			js.executeScript("window.scrollBy(0,-300)");
//			oop.click();
//		}
//		else
//		{
//			System.out.println("Now It is displayed : "+oopdisplayed);
//			js.executeScript("window.scrollBy(0,-300)");
//			oop.click();
//		}
		
		Thread.sleep(3000);
		//https://www.javatpoint.com/java-oops-concepts
		
//		String oopUrl = driver.getCurrentUrl();
//		System.out.println(oopUrl);
//		String replace  = oopUrl.replace("https://www.javatpoint.com/java-oops-concepts","javatpoint.com/java-oops-concepts");
//		System.out.println(replace);
		
//		String oopTitle = driver.getTitle();
//		System.out.println(oopTitle);
//		
//		driver.navigate().back();
//		
//		Thread.sleep(3000);
//		
		//a[text()='Keywords ']
		WebElement keyword = driver.findElement(By.xpath("//a[text()='Keywords ']"));
		js.executeScript("arguments[0].scrollIntoView(true);",keyword);
		
		boolean keyworddisplayed = oop.isDisplayed();
		System.out.println(keyworddisplayed);
//		if(oopdisplayed==true)
//		{
//			System.out.println("It is displayed : "+oopdisplayed);
//			js.executeScript("window.scrollBy(0,-300)");
//			oop.click();
//		}
//		else
//		{
//			System.out.println("Now It is displayed : "+oopdisplayed);
//			js.executeScript("window.scrollBy(0,-300)");
//			oop.click();
//		}
		
		
	}

}
