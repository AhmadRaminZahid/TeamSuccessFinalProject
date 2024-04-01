package stepdefinitions.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.US_19.MeetPostpojo;
import pojos.US_19.ObjectPojo;
import pojos.US_20_Pojos.MeetEditResponsePojo;
import pojos.Us24_25.US_24.Actualpojo;

import java.util.List;
import java.util.Objects;

import static baseurl.ManagementonSchool_BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static stepdefinitions.api.US_19_StepDefs.description;

public class US_20_StepDefs {

    MeetPostpojo payload;
    List<String> studentId = List.of("3631","3653");
    Response response;
    public static Integer meetId;

    ObjectMapper objectMapper = new ObjectMapper();
    public static String date = "2025-01-23";


    @And("gets id of the created meeting")
    public void getsIdOfTheCreatedMeeting() throws JsonProcessingException {
        spec.pathParams("first","meet","second","getAll");
        response = given(spec).get("{first}/{second}");
        String resultList = response.asString();
        List<MeetEditResponsePojo> pojoList = objectMapper.readValue(resultList, new TypeReference<List<MeetEditResponsePojo>>() {});
        System.out.println("pojolist = " + pojoList);
        System.out.println(pojoList.get(0).getId());
        //for (MeetEditResponsePojo getId : pojoList)
        //{
            //if (Objects.equals(getId.getDescription(), description)) {
                //meetId = getId.getId();
                //System.out.println(meetId);
            //}
        //}

        //List<Integer> idList = response.jsonPath().getList("findAll{it.description=='Meet Bahar'}.id");
        //meetId = idList.get(0);
        //System.out.println("id List : " + idList);
    }


    @And("sets the Url for updating meeting with students")
    public void setsTheUrlForUpdatingMeetingWithStudents() {
        spec.pathParams("first","meet","second","update", "third", meetId);
    }

    @And("sets the expected data to update the meeting")
    public void setsTheExpectedDataToUpdateTheMeeting() {
        payload = new MeetPostpojo(date, description, "13:00", "14:00",studentId);
    }

    @When("updates the meeting with id")
    public void updatesTheMeetingWithId() {
        response = given(spec).body(payload).put("{first}/{second}/{third}");
        response.prettyPrint();
    }

    @Then("verifies response body for updating meeting")
    public void verifiesResponseBodyForUpdatingMeeting() {
        //assertEquals(200,response.statusCode());

    }
    @And("sets the Url to delete meeting with students")
    public void setsTheUrlToDeleteMeetingWithStudents() {
        spec.pathParams("first","meet","second","delete", "third", meetId);
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
