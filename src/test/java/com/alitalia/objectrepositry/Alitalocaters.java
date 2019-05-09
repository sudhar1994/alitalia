package com.alitalia.objectrepositry;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.alitalia.resources.BaseAlita;

public class Alitalocaters extends BaseAlita {
	
	
	public Alitalocaters() {
		PageFactory.initElements(BaseAlita.driver, this);
	}
	
	@FindBy (id="departureInput--label")
	public WebElement departure;
	@FindBy(id="arrivalInput")
	public WebElement arrival;
	@FindBy(xpath="//label[text()='One way']")
	public WebElement radio;
	@FindBy(id="andata")
	public WebElement date;
	@FindBy(id="andata-date-picker-hover")
	public WebElement day;
	@FindBy(id="adult")
	public WebElement adult;
	@FindBy (id="kids")
	public WebElement kids;
	@FindBy (id="newborn")
	public WebElement infant;
	@FindBy(id="cercaVoliSubmit")
	public WebElement show;
	
	public WebElement getDeparture() {
		return departure;
	}
	public WebElement getArrival() {
		return arrival;
	}
	public WebElement getRadio() {
		return radio;
	}
	public WebElement getDate() {
		return date;
	}
	public WebElement getDay() {
		return day;
	}
	public WebElement getAdult() {
		return adult;
	}
	public WebElement getKids() {
		return kids;
	}
	public WebElement getInfant() {
		return infant;
	}
	public WebElement getShow() {
		return show;
	}
	
	
	

}
