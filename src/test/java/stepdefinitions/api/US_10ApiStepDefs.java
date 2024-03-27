package stepdefinitions.api;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import pojos.ObjectLessonProgramPojo;
import pojos.LessonProgramPostPojo;

import java.util.List;

import static baseurl.ManagementonSchool_BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US_10ApiStepDefs {

    LessonProgramPostPojo payload;
    Response response;
    ObjectLessonProgramPojo objectLessonProgramPojo;
    public static ObjectLessonProgramPojo expectedData;

    public static int lessonProgId;


    @And("User sets the Url for Vice Dean Save")
    public void userSetsTheUrlForViceDeanSave() { spec.pathParams("first","lessonPrograms","second","save");
    }

    @And("sets the payload for Vice Dean Save")
    public void setsThePayloadForViceDeanSave() {
        payload = new LessonProgramPostPojo("WEDNESDAY",45 ,4452,"10:00", "11:00");}

    @When("sends POST request and get response for Vice Dean")
    public void sendsPOSTRequestAndGetResponseForViceDean() {
        response =given(spec).body(payload).post("{first}/{second}");
        response.prettyPrint();
    }

    @Then("verifies status code is {int} for created lesson")
    public void verifiesStatusCodeIsForViceDean(int code) {
        assertEquals(code,response.statusCode());
    }

    @And("verifies response body for Vice Dean")
    public void verifiesResponseBodyForViceDean() {
        LessonProgramPostPojo actualData = response.as(LessonProgramPostPojo.class);

        assertEquals(payload.getDay(),actualData.getDay());
        assertEquals(payload.getEducationTermId(),actualData.getEducationTermId());
        assertEquals(payload.getLessonIdList(),actualData.getLessonIdList());
        assertEquals(payload.getStartTime(),actualData.getStartTime());
        assertEquals(payload.getStopTime(),actualData.getStopTime());

    }

    @And("User gets id of the lesson program with {string}")
    public void userGetsIdOfTheLessonProgramWith(String lessonProgramId) {
        spec.pathParams("first","lessonPrograms","second","getAll");
        response = given(spec).get("{first}/{second}");
        List<Integer> numOfPromId = response.jsonPath().getList("findAll{it.lessonProgramId == '"+lessonProgramId+"' }");
        lessonProgId= numOfPromId.get(0);
        System.out.println("lessonProgId = " + lessonProgId);
    }

    @And("User sets the Url for Get lesson program By id")
    public void userSetsTheUrlForGetById() {
        spec.pathParams("first","lessonPrograms","second","getById","third",lessonProgId);
    }

    @And("sets the expected data for Get Lesson By id")
    public void setsTheExpectedDataForGetLessonById() {
        objectLessonProgramPojo = new ObjectLessonProgramPojo(lessonProgId,"10:00:00","11:00:00",4452,"Java",10,true,"WEDNESDAY");
        expectedData = new ObjectLessonProgramPojo();
    }

    @When("sends GET request and get response for lesson")
    public void sendsGETRequestAndGetResponseForLesson() {
        response = given(spec).get("{first}/{second}/{third}");
        response.prettyPrint();
    }

    @And("verifies response body for Get lesson By id")
    public void verifiesResponseBodyForGetLessonById() {
        ObjectLessonProgramPojo actuslData = response.as(ObjectLessonProgramPojo.class);

        assertEquals(expectedData.getLessonId(),actuslData.getLessonId());
        assertEquals(expectedData.getDay(),actuslData.getDay());
        assertEquals(expectedData.getLessonName(),actuslData.getLessonName());
        assertEquals(expectedData.getLessonProgramId(),actuslData.getLessonProgramId());
        assertEquals(expectedData.getStartTime(),actuslData.getStartTime());
        assertEquals(expectedData.getStopTime(),actuslData.getStopTime());
        assertEquals(expectedData.getCreditScore(),actuslData.getCreditScore());
        assertEquals(expectedData.getTeachers(),actuslData.getTeachers());
        assertEquals(expectedData.isCompulsory(),actuslData.isCompulsory());
    }

    @And("User sets the Url for Get lesson By id")
    public void userSetsTheUrlForGetLessonById() {

    }

    @And("User deletes the created lesson")
    public void userDeletesTheCreatedLesson() {
        spec.pathParams("first","dean", "second", "delete", "third", lessonProgId);
        response = given(spec).delete("{first}/{second}/{third}");

        response.then().statusCode(200);
    }


}
