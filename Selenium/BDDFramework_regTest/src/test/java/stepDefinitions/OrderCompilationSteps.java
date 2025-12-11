package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.OrderCompilation;
import utilities.BaseClass;

public class OrderCompilationSteps {
	
public BaseClass setupclass;
	
	public OrderCompilationSteps(BaseClass setupclass) {
		this.setupclass = setupclass;
	}
		
	@Given("User navigates to the Order Compilation page")
	public void user_navigates_to_the_order_compilation_page() throws InterruptedException {
		OrderCompilation Order = setupclass.pageObjectManager.getOrderCompilation();
		Order.clickgrid();
		Thread.sleep(2000);
		Order.clickorderProcessing();
		Thread.sleep(2000);
		Order.orderCompilation();
		Thread.sleep(2000);
	}

	@When("the user reserves the stock")
	public void the_user_reserves_the_stock() throws InterruptedException {
		OrderCompilation Order = setupclass.pageObjectManager.getOrderCompilation();
		Order.stockReserving();
	}

	@Then("the stock is reserved successfully")
	public void the_stock_is_reserved_successfully() throws InterruptedException{
		OrderCompilation Order = setupclass.pageObjectManager.getOrderCompilation();
		Order.stockReserve();
	}


}
