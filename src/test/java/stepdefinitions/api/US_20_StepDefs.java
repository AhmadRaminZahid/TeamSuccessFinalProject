package stepdefinitions.api;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import pojos.US_19.MeetPostpojo;

import java.util.List;

import static baseurl.ManagementonSchool_BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US_20_StepDefs {

    MeetPostpojo payload;
    List<String> studentId = List.of("3631","3653");
    Response response;
    //int meetId;

/*
    @And("gets id of the created meeting")
    public void getsIdOfTheCreatedMeeting() {
        spec.pathParams("first","meet","second","getAll");
        response = given(spec).get("{first}/{second}");
        //List<Integer> idList = response.jsonPath().getList("findAll{it.description=='Meet Baha'}.id");
        //meetId = idList.get(0);
        //System.out.println("id List : " + idList);
    }
*/

    @And("sets the Url for updating meeting with students")
    public void setsTheUrlForUpdatingMeetingWithStudents() {
        spec.pathParams("first","meet","second","update", "third", 2426);
    }

    @And("sets the expected data to update the meeting")
    public void setsTheExpectedDataToUpdateTheMeeting() {
        payload = new MeetPostpojo("2025-01-23", "Project", "13:00", "14:00",studentId);
    }

    @When("updates the meeting with id")
    public void updatesTheMeetingWithId() {
        response = given(spec).body(payload).put("{first}/{second}/{third}");
        response.prettyPrint();
    }

    @Then("verifies response body for updating meeting")
    public void verifiesResponseBodyForUpdatingMeeting() {
        assertEquals(200,response.statusCode());

    }
    @And("sets the Url to delete meeting with students")
    public void setsTheUrlToDeleteMeetingWithStudents() {
        spec.pathParams("first","meet","second","delete", "third", 2426);
    }


    @And("deletes the updated meeting with id")
    public void deletesTheUpdatedMeetingWithId() {
        response = given(spec).delete("{first}/{second}/{third}");
        response.prettyPrint();
    }

    @Then("verifies the deletion of the meeting")
    public void verifiesTheDeletionOfTheMeeting() {
        assertEquals(200,response.statusCode());
    }

}
