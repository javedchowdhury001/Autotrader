package AutotraderPackage;



import org.testng.annotations.Test;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;


import org.openqa.selenium.support.ui.Select;

public class AutotraderTest extends MyUltilityClass{
    
 @Test
 public void AutotraderSite() {
	  Opensite();
	  Select();
	  zip();
	  clicksearch();
	 
	  
	
	 
 }

 public void Opensite() {
	  Driver.get("https://www.autotrader.com/cars-for-sale/");
	  
}  

public void model() {
	Select day = new Select(Driver.findElement(By.xpath("//select[@name='ModelCode']")));	
	day.selectByVisibleText("2_SERIES");
	System.out.println(" add new line");
	System.out.println(" add by somebody");

	System.out.println(" add merge line");

	System.out.println(" Merge by Somebody");
	
	


	
}

public void Select() {
	 Select day = new Select(Driver.findElement(By.xpath("//select[@name='makeCode']")));	
		day.selectByIndex(3);
}

public void zip() {
	  Driver.findElement(By.xpath("//input[@name='zipcode']")).clear();
	  Driver.findElement(By.xpath("//input[@name='zipcode']")).sendKeys("30340");
	 
}

public void clicksearch() {
	 WebElement obj=Driver.findElement(By.xpath("//button[@id='search']"));
	 obj.click();
	 }

	 


		
}



  
