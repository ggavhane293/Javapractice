package Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class First {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\ganesh.gavhane\\Downloads\\Automation\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
		driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");
		driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
		driver.findElement(By.id("ctl00_MainContent_orderGrid_ctl02_OrderSelector")).click();
		driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr[2]/td[13]/input")).click();//Select the first row 
		Thread.sleep(3000);
		Select product = new Select(driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct")));//click on edit option
		Thread.sleep(2000);
		product.selectByIndex(0);
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity")).sendKeys("3");//changing the quantity value
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_0")).click();//Changing the card type option
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_UpdateButton")).click();//click on update button
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_MainContent_orderGrid_ctl03_OrderSelector")).click();//select second row
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_MainContent_btnDelete")).click();//Click on delete selected button
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_MainContent_orderGrid_ctl06_OrderSelector")).click();//Select second last row
		driver.findElement(By.id("ctl00_MainContent_orderGrid_ctl08_OrderSelector")).click();//Select last row
		Thread.sleep(3000);
		driver.findElement(By.id("ctl00_MainContent_btnDelete")).click();//Click on delete selected button

	}

}
