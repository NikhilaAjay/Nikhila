package WebElements.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class checkboxDemo1 
{
@Test
	public void checkboxDemo()
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://demos.devexpress.com/aspxeditorsdemos/ListEditors/MultiSelect.aspx");
		WebElement checkbox =driver.findElement(By.xpath("//span[@id='ContentHolder_lbFeatures_TG_D']"));
		boolean actualcheckboxisdisplaying = checkbox.isDisplayed();
		System.out.println(actualcheckboxisdisplaying);
	   boolean expectedcheckboxisdisplaying = true;
	  Assert.assertEquals(actualcheckboxisdisplaying, expectedcheckboxisdisplaying,"checkbox is displayed");
	   
	  
	  boolean checkboxenabled = checkbox.isEnabled();
	    System.out.println("checkboxenabled : "+checkboxenabled);
	    boolean expectedcheckboxenabled = true;
	    Assert.assertEquals(checkboxenabled, expectedcheckboxenabled,"checkbox is enabled");
		   
	    boolean checkboxselected = checkbox.isSelected();
	    System.out.println("checkboxselected : "+checkboxselected);
	    boolean expectedcheckboxselected = true;
	    Assert.assertNotEquals(checkboxselected ,expectedcheckboxselected,"checkbox is not selected");
		   
	    checkbox.click();

	    boolean checkboxisselected = checkbox.isSelected();
	    System.out.println("checkboxisselected : "+checkboxisselected);
	    boolean expectedcheckboxisselected = true;
	    Assert.assertNotEquals(checkboxisselected ,expectedcheckboxisselected,"checkbox is not selected");
		   
	    }
	    
	








	}


