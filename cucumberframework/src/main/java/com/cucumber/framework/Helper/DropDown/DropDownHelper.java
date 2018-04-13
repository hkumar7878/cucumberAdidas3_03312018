package com.cucumber.framework.Helper.DropDown;

import java.awt.List;
import java.util.LinkedList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.cucumber.framework.Helper.Logger.LoggerHelper;






import org.apache.log4j.Logger;
public class DropDownHelper {

	private WebDriver driver;
	private final Logger Log=LoggerHelper.getLogger(DropDownHelper.class);
	
	public DropDownHelper(WebDriver driver)
	{
		this.driver=driver;
		Log.debug("DropDownHelper : " + this.driver.hashCode());
	}
	
	
	public void SelectUsingVisiableValue(WebElement element,String visibleValue)
	{
		Select select  = new Select(element);
		select.selectByVisibleText(visibleValue);
		Log.info("Locator : " + element + "Value : " + visibleValue);
	}
	
	public String getSelectedValue(WebElement element)
	{
		String value=new Select(element).getFirstSelectedOption().getText();
		Log.info("WebElement : " +element + " value : " +value);
		return value;
	}
	
	/*public List <String> getAllDropDownValues(WebElement locator)
	{
		Select select = new Select(locator);
		List<WebElement> elementlist= select.getOptions();
		List<String> valueList= new LinkedList<>();
		
		return valueList;
		
	}*/
}
