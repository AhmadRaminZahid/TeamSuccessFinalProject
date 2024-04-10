package stepdefinitions.api;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import pojos.us14pojo.ActualUpdatePojo;
import pojos.us14pojo.PayloadUpdatePojo;
import pojos.us_13_pojos.TeacherPojo;
import pojos.us_13_pojos.TeacherPostPojo;

import java.util.List;

import static baseurl.ManagementonSchool_BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static stepdefinitions.api.US_13_StepDefs.userId;

public class US_14_StepDefs {

    Response response;
    public static TeacherPostPojo updatedData;
    public static TeacherPojo expectedData;

    public static int idOfUser;
    public static PayloadUpdatePojo payload;
    public static ActualUpdatePojo actualData;

    @And("sets the Url for updating Teacher data")
    public void setstheUrlforupdatingTeacherdata () {
        spec.pathParams("first", "teachers", "second", "getAll");
        response = given(spec).get("{first}/{second}");
        List<Integer> idList =  response.jsonPath().getList("findAll{it.username == 'Juliete' }.userId");
        idOfUser = idList.get(0); // should change all the time I run the test
        System.out.println("idOfUser = " + idOfUser);

        spec.pathParams("first", "teachers", "second", "update", "third", idOfUser);
        System.out.println("idOfUser = " + idOfUser);
        //  teachers/update/6466
    }
    @And("sets the expected data to update the Teacher data")
    public void setsTheExpectedDataToUpdateTheTeacherData() {
        List<Integer> lessonsIdList = List.of(4451);
        payload = new PayloadUpdatePojo("1992-07-22", "Portugal","juliete@gmail.com", "FEMALE", true, lessonsIdList, "Juliete", "Nikolas2022!!", "346-623-2171", "228-13-2861", "Alves", "Juliete");

    }
    @When("updates the Teacher by id")
    public void updatesTheTeacherWithId() {
        response = given(spec).body(payload).put("{first}/{second}/{third}");
        actualData = response.as(ActualUpdatePojo.class);
    }
    @Then("verifies response body for updating Teacher")
    public void verifiesResponseBodyForUpdatingTeacher() {
//        expectedData = new TeacherPojo(objectPojo, "Teacher updated Successful", "OK");
//        ActualUpdatedTeacherPojo actualData = response.as(ActualUpdatedTeacherPojo.class);
       assertEquals("Teacher updated Successful", actualData.getMessage());
       assertEquals(payload.getBirthPlace(), actualData.getObject().getBirthPlace());
    }
    @When("Vice Dean deletes created Teacher by Id")
    public void viceDeanDeletesCreatedTeacherById() {
            spec.pathParams("first","teachers", "second", "delete", "third", idOfUser);
            response = given(spec).delete("{first}/{second}/{third}");
//            response.then().statusCode(200);
    }
}
