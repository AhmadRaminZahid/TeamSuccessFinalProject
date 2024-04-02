
package stepdefinitions.api;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import pojos.US_16.ContactMesasgePostPojo;
import pojos.US_16.ContactMessageActualDataPojo;

import static baseurl.ManagementonSchool_BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US_16_StepDefs {

    ContactMesasgePostPojo payload;
    ContactMessageActualDataPojo actualData;

    Response response;
    @When("User sets the Url to post message")
    public void userSetsTheUrlToPostMessage() {

        spec.pathParams("first", "contactMessages", "second", "save");

    }

    @And("User sets the payload for message")
    public void userSetsThePayloadForMessage() {
        payload=new ContactMesasgePostPojo("Kadıbaba@gmail.com","Message gönderilmiştir.","Kadı","Baba");
                }

    @When("User sends post request and get response")
    public void userSendsPostRequestAndGetResponse() {
        response = given(spec).body(payload).post("{first}/{second}");
        response.prettyPrint();

    }

    @Then("User verifies status code is {int}")
    public void userVerifiesStatusCodeIs(int  code) {
        assertEquals(code, response.statusCode());
    }


    @And("The Vice Dean sets the Url to get message by email")
    public void theViceDeanSetsTheUrlToGetMessageByEmail() {
        spec.pathParams("first", "contactMessages", "second", "searchByEmail")
        .queryParam("email","Kadıbaba@gmail.com","page","0","size","10","sort","date","type","desc");
    }

    @And("The Vice Dean sets the payload for message")
    public void theViceDeanSetsThePayloadForMessage() {
        payload=new ContactMesasgePostPojo("Kadıbaba@gmail.com","Message gönderilmiştir.","Kadı","Baba");
    }

    @When("The Vice Dean sends get request by email")
    public void theViceDeanSendsGetRequestByEmail() {
        response = given(spec).body(payload).get("{first}/{second}");
        response.prettyPrint();
        actualData=response.as(ContactMessageActualDataPojo.class);



    }





    @And("The Vice Dean verifies response body")
    public void theViceDeanVerifiesResponseBody() {

        assertEquals(payload.getMessage(), actualData.getContent().get(3));
        assertEquals(payload.getEmail(), actualData.getContent().get(1));
        assertEquals(payload.getName(), actualData.getContent().get(0));
        assertEquals(payload.getSubject(), actualData.getContent().get(2));


    }
}


























