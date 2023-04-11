package TestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import PageObjectModel.RegisterObjectModel;
import Resource.BaseClass;
import Resource.CommonMethod;
import Resource.Constant;

public class Verifysearch extends BaseClass{
	@Test
	public void search() throws InterruptedException {
		
		RegisterObjectModel sm=new RegisterObjectModel(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Register
		sm.enterfirstname().sendKeys(Constant.firstname);
		sm.enterlastname().sendKeys(Constant.lastname);
		sm.enteraddress().sendKeys(Constant.address);
		sm.enteremail().sendKeys(Constant.email);
		sm.enterphone().sendKeys(Constant.phone);
	
		sm.clickgender().click();
		CommonMethod.loop(sm.clickhobbies());
		sm.clicklang().click();
		CommonMethod.forloop(sm.clickenglish(), "English");
		Actions a=new Actions(driver);
		WebElement b=driver.findElement(By.xpath("//form[@id='basicBootstrapForm']"));
		a.moveToElement(b).click(b).perform();
		//Thread.sleep(2000);
		sm.clickselect().click();
		CommonMethod.select(sm.clickjava(), "Java");
		a.moveToElement(b).click(b).perform();
		CommonMethod.select(sm.clickcountry(), "India");
		CommonMethod.select(sm.clickyear(), "1997");
		CommonMethod.select(sm.clickmonth(), "July");
		CommonMethod.select(sm.clickday(), "18");
		sm.enterpass().sendKeys(Constant.Pass);
		sm.enterconfirmpass().sendKeys(Constant.Pass);
		sm.clickonupload().sendKeys("C:\\Users\\Admin\\Downloads\\software-testing.jpg");
		sm.clickonsubmit().click();
      
		
		
		
		
	}

}
