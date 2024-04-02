package stepdefinitions.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.US_12.*;
import pojos.US_20_Pojos.MeetEditResponsePojo;

import java.util.List;
import java.util.Objects;

import static baseurl.ManagementonSchool_BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static stepdefinitions.api.US_19_StepDefs.description;

public class US_12_StepDefs {

    ObjectMapper objectMapper = new ObjectMapper();
    Response response;
    Lessonpojo payload;


    public static Integer lessonProgramId;

    List<Integer> lessonProgIdList = List.of(4048);

    static Integer actualteacherId;
    static Integer actualstudentId;
    @And("sets the Url for assigning the lesson to teacher")
    public void setsTheUrlForAssigningTheLessonToTeacher() {
        spec.pathParams("first", "teachers", "second", "chooseLesson");
    }

    @And("sets the payload for assigning the lesson to teacher")
    public void setsThePayloadForAssigningTheLessonToTeacher() {
        payload = new Lessonpojo(lessonProgIdList,5333);
    }

    @When("sends POST request and GETS response for assigning lesson")
    public void sendsPOSTRequestAndGETSResponseForAssigningLesson() {
        response = given(spec).body(payload).post("{first}/{second}");
        response.prettyPrint();
    }

    @Then("verifies status code is {int} for assigning lesson")
    public void verifiesStatusCodeIsIntForAssigningLesson(int code) {
        assertEquals(code,response.statusCode());
    }


    @And("verifies response body for assigning lesson")
    public void verifiesResponseBodyForAssigningLesson() {
        LessonPostpojo actualData = response.as(LessonPostpojo.class);
        assertTrue(actualData.getMessage().contains("Lesson added to Teacher"));
        assertTrue(actualData.getHttpStatus().contains("CREATED"));
    }

    @And("Vice Dean gets the id of the assigned lesson")
    public void viceDeanGetsTheIdOfTheAssignedLesson() throws JsonProcessingException {
        spec.pathParams("first","lessonPrograms", "second","getAllAssigned");
        response = given(spec).get("{first}/{second}");

            //lessonProgramId=lessonProgIdList.get(0);
        List<Integer> idList = response.jsonPath().getList("findAll{it.teachers[0].userId == '"+5333+"' }.lessonProgramId");
        System.out.println(idList);
        lessonProgramId=lessonProgIdList.get(0);
        assertTrue(idList.contains(lessonProgramId));
    }

    @And("Vice Dean sets the url for getting lesson by id")
    public void viceDeanSetsTheUrlForGettingLessonById() {
        spec.pathParams("first","lessonPrograms","second", "getById", "third", lessonProgramId);
        response = given(spec).get("{first}/{second}/{third}");
        response.prettyPrint();
    }

    @And("Vice Dean deletes the assigned lesson")
    public void viceDeanDeletesTheAssignedLesson() {

        spec.pathParams("first","lessonPrograms","second", "delete", "third", lessonProgramId);
        response = given(spec).get("{first}/{second}/{third}");
        response.then().statusCode(200);
    }

    @Then("verifies status code is {int} for deleting lesson")
    public void verifiesStatusCodeIsForDeletingLesson(int code) {
        assertEquals(code,response.statusCode());
    }

}
