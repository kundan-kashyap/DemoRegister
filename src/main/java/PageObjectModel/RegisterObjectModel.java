package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterObjectModel {
	WebDriver driver;
	//Register
		private By firstName=By.xpath("//input[@placeholder='First Name']");
		private By lastName=By.xpath("//input[@placeholder='Last Name']");
		private By address=By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']");
		private By email=By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-valid-email ng-invalid ng-invalid-required']");
		private By phone=By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-invalid ng-invalid-required ng-valid-pattern']");
		private By gender=By.xpath("//input[@value='Male']");
		private By hobbies=By.xpath("//input[@type='checkbox']");
		private By languages=By.xpath("//div[@id='msdd']");
		private By english=By.xpath("//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']/li");
		private By select=By.xpath("//select[@id='Skills']");
		private By java=By.xpath("//select[@id='Skills']");
		private By country=By.xpath("//select[@id='country']");
		private By year=By.xpath("//select[@id='yearbox']");
		private By month=By.xpath("(//select[@type='text'])[4]");
		private By day=By.xpath("//select[@id='daybox']");
		private By password=By.xpath("//input[@id='firstpassword']");  
		private By confirmpas=By.xpath("//input[@id='secondpassword']");
		private By upload=By.xpath("//input[@id='imagesrc']");
		private By submit=By.xpath("//button[@id='submitbtn']");
		
		public RegisterObjectModel(WebDriver driver2) {
			this.driver=driver2;
		}
		//Register
     public WebElement enterfirstname() {
    	 return driver.findElement(firstName);
     }
     public WebElement enterlastname() {
    	 return driver.findElement(lastName);
     }
     public WebElement enteraddress() {
    	 return driver.findElement(address);
     }
     public WebElement enteremail() {
    	 return driver.findElement(email);
     }
     public WebElement enterphone() {
    	 return driver.findElement(phone);
     }
     public WebElement clickgender() {
    	 return driver.findElement(gender);
     }
     public List<WebElement> clickhobbies() {
    	 return driver.findElements(hobbies);
     }
     public WebElement clicklang() {
    	 return driver.findElement(languages);
     }
     public List<WebElement> clickenglish() {
    	 return driver.findElements(english);
     }
    
     public WebElement clickselect() {
    	 return driver.findElement(select);
     }
     public WebElement clickjava() {
    	 return driver.findElement(java);
     }
     public WebElement clickcountry() {
    	 return driver.findElement(country);
     }
     public WebElement clickyear() {
    	 return driver.findElement(year);
     }
     public WebElement clickmonth() {
    	 return driver.findElement(month);
     }
     public WebElement clickday() {
    	 return driver.findElement(day);
     }
     public WebElement enterpass() {
    	 return driver.findElement(password);
     }
     public WebElement enterconfirmpass() {
    	 return driver.findElement(confirmpas);
     }
     public WebElement clickonupload() {
    	 return driver.findElement(upload);
     }
     public WebElement clickonsubmit() {
    	 return driver.findElement(submit);
     }


}
