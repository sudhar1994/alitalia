package com.alitalia.stepdefinition;



import org.openqa.selenium.WebDriver;

import com.alitalia.objectrepositry.Alitalocaters;
import com.alitalia.resources.BaseAlita;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Alitalia extends BaseAlita {
	@Given("i want to launch site")
public void i_want_to_launch_site() {
		
		Alitalocaters page = new Alitalocaters();
		geturl("https://www.alitalia.com/en_en/offers.html?WT.mc_id=search_Google_BrandGeneric_Other&WT.srch=1&gclid=CjwKCAjw_MnmBRAoEiwAPRRWWzj5Btv6HlHAWc5KC99k9RsIavWOispCABidtNHl2Ku9TXlSSpHePBoCd7sQAvD_BwE&gclsrc=aw.ds");
		
		
}

@When("entering flight details")
public void entering_flight_details() {
	Alitalocaters page = new Alitalocaters();
	enter(page.getDeparture(),"chennai");
	enter(page.getArrival(),"mumbai");
	click(page.getRadio());
	click(page.getDate());
	click(page.getDay());
	enter(page.getAdult(),("2"));
	enter(page.getKids(),("1"));
	enter(page.getInfant(),"2");
	click(page.getShow());
	
	
	
}

@Then("getting flight results")
public void getting_flight_results() {
	driver.quit();
}



}
