package stepdefinitions.api;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static baseurl.ManagementonSchool_BaseUrl.setUp;

public class US_06StepDefs {
    @Given("User authorized as {string}")
    public void userAuthorizedAs(String role) {
      role =role.trim().toLowerCase();
    switch (role){
        case "admin":
            setUp("","");
            break;
        case "dean":
            setUp("","");
            break;
         case"vicedean":
             setUp("","");
             break;
          case "teacher":
              setUp("","");
              break;
        default:
            System.out.println("please provide valid credential for your role");
      }
     }



    @And("User sets the Url for Vice Dean Save")
    public void userSetsTheUrlForViceDeanSave() {
    }

    @And("sets the payload for Vice Dean")
    public void setsThePayloadForViceDean() {
    }

    @When("sends post request and get response")
    public void sendsPostRequestAndGetResponse() {
    }

    @Then("verifies status code is {int}")
    public void verifiesStatusCodeIs(int arg0) {
    }

    @And("verifies response body")
    public void verifiesResponseBody() {
    }
}
