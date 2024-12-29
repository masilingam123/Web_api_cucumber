package com.qa.steps;

import org.junit.Assert;

import com.qa.base.Base;
import com.qa.page.Page;
import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Steps extends Base {
    @Given("initiate browser")
    public void initiate_browser() {
       initbrowser();
    }
    @When("navigate to website")
    public void navigate_to_website() {
        navigate("https://www.saucedemo.com/");
    }
   
    @When("enter username")
    public void enter_username() {
    	sendkeys(Page.usernamebtn,"standard_user");
    }

    @Then("enter password")
    public void enter_password() {
    	sendkeys(Page.passwordbtn,"secret_sauce");
    }

    @Then("click login button")
    public void click_login_button() {
    	click(Page.loginbtn);
    }

    @Then("check the current url")
    public void check_the_current_url() {
    	String currenturl = driver.getCurrentUrl();
    	String expectedurl = "https://www.saucedemo.com/inventory.html";
    	Assert.assertEquals(currenturl, expectedurl);
        
    }    	
    
    Response response;
    	@Given("delete the favorites in API")
    	public void delete_the_favorites_in_api() {
    		RestAssured.baseURI ="https://airportgap.com/api/favorites/clear_all";
    		response =RestAssured.given().headers("Authorization", "Bearer " + "i6D129vkuYbbYpzxffafu9CP").delete();
    		System.out.println(response.prettyPrint());
    		System.out.print(response.statusCode());
    	    
    	}

    	@Then("add the airport in favorites using POST")
    	public void add_the_airport_in_favorites_using_post() {
    		
    		RestAssured.baseURI="https://airportgap.com/api/favorites";
    			String body ="{\r\n"
    					+ "    \"airport_id\":\"JFK\",\r\n"
    					+ "    \"note\": \"adding some comments\"\r\n"
    					+ "}\r\n"
    					+ "";
    			response = RestAssured.given().headers("Authorization", "Bearer " + "i6D129vkuYbbYpzxffafu9CP").contentType(ContentType.JSON).body(body).post();
    			
    	
    	}

    	@Then("print the response")
    	public void print_the_response() {
    		System.out.println(response.prettyPrint());
    		System.out.println(response.statusCode());
    	}


    	
    }



    
    

