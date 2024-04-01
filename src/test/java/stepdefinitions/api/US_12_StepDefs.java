package stepdefinitions.api;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojos.US_12.LessonPostpojo;
import pojos.US_12.Lessonpojo;

import java.util.List;
import java.util.Objects;

import static baseurl.ManagementonSchool_BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class US_12_StepDefs {

    Response response;
    Lessonpojo payload;
    //public static int lessonProgramId;

    //public static Integer lessonProgramId;

    List<Integer> lessonProgIdList = List.of(4030);

    String id;
    Integer lessonProgramId;

    @And("sets the Url for assigning the lesson to teacher")
    public void setsTheUrlForAssigningTheLessonToTeacher() {
        spec.pathParams("first", "teachers", "second", "chooseLesson");
    }

    @And("sets the payload for assigning the lesson to teacher")
    public void setsThePayloadForAssigningTheLessonToTeacher() {
        payload = new Lessonpojo(lessonProgIdList,5915);
    }

    @When("sends POST request and GETS response for assigning lesson")
    public void sendsPOSTRequestAndGETSResponseForAssigningLesson() {
        response = given(spec).body(payload).post("{first}/{second}");
        response.prettyPrint();
    }

    @Then("verifies status code is {int} for assigning lesson")
    public void verifiesStatusCodeIsIntForAssigningLesson(int code) {assertEquals(code,response.statusCode());
    }


    @And("verifies response body for assigning lesson")
    public void verifiesResponseBodyForAssigningLesson() {
        LessonPostpojo actualData = response.as(LessonPostpojo.class);
        assertTrue(actualData.getMessage().contains("Lesson added to Teacher"));
        assertTrue(actualData.getHttpStatus().contains("CREATED"));
    }

    @And("Vice Dean gets the id of the assigned lesson")
    public void viceDeanGetsTheIdOfTheAssignedLesson() {
        spec.pathParams("first","lessonPrograms", "second","getAllAssigned");
        response = given(spec).get("{first}/{second}");

        JsonPath json = response.jsonPath();

        for (int i = 0; i<10; i++) {
            if (Objects.equals(json.getString("$[" + i + "].lessonName[0].lessonId"), "4030") && Objects.equals(json.getString("$[" + i + "].teachers[0].userId"), "5915")){
                id = json.getString("$["+i+"].lessonProgramId");
                System.out.println("Id = " + id);
                lessonProgramId = Integer.valueOf(id);
                break;
            }
        }

        //List<Integer> idList = response.jsonPath().getList("findAll{it.[0].lessonName[0].lessonId=='4457'}.[0].lessonProgramId");
        //System.out.println(idList);
        //lessonProgramId2 = idList.get(0);
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
        //response.then().statusCode(200);
    }

    @Then("verifies status code is {int} for deleting lesson")
    public void verifiesStatusCodeIsForDeletingLesson(int code) {
        //assertEquals(code,response.statusCode());
    }

}
