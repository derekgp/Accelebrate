package com.ntier.life.insurance;

import junit.framework.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DeductableStepDefinition {
	
	private HealthPlan plan;

	@Given("^that I live in zip code (\\d+)$")
	public void that_I_live_in_zip_code(int arg1) {
	    plan = new HealthPlan();
	    plan.setZip(arg1);
	}

	@When("^I ask for a premium of (\\d+).(\\d+)$")
	public void I_ask_for_a_premium_of_(int arg1, int arg2) {
	    plan.setPremium(arg1 + (arg2/100) );
	}
 
	@Then("^my yearly deductable will be (\\d+)$")
	public void my_yearly_deductable_will_be(int arg1) {
	    Assert.assertEquals(arg1, plan.calculateDeductable());
	}

	 
}
