package src.test.e2e;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import com.ecsdigital.automation.implementation.selectButtonImplementation;


    @Steps
    private selectButtonImplementation buttonImpl = new selectButtonImplementation();


    @Given("^I am on the React App page$")
    public void on_react_app() throws Throwable {
        buttonImp.selectElement();

        }

    @When("^I select the button$")
    public void select_button() throws Throwable {

        }

    @Then("^I should see a \"Render the Challenge\" button$")
    public void see_a_render_challenge_button() throws Throwable {

        }

    @Then("^I should see an Arrays Challenge$")
    public void see_an_arrays_challenge() throws Throwables {}
