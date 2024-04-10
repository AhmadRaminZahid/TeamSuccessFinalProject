package stepdefinitions.api;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import pojos.*;
import pojos.us_13_pojos.TeacherPojo;
import pojos.us_13_pojos.TeacherPostPojo;
import pojos.us_13_pojos.TeacherResponsePojo;

import java.util.List;

import static baseurl.ManagementonSchool_BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static stepdefinitions.api.US_14_StepDefs.idOfUser;

public class US_13_StepDefs {
        TeacherPostPojo payload;
        Response response;
        public static ObjectPojo objectPojo;
        public static int userId;
        public static TeacherPojo expectedData;


        @And("Vice Dean sets the Url for Teacher Save")
        public void viceDeanSetsTheUrlForTeacherSave () {
                spec.pathParams("first", "teachers", "second", "save");
        }

        @And("sets the payload for Teacher Save")
        public void setsThePayloadForTeacherSave () {
                List<Integer> lessonsIdList = List.of(4451);
                payload = new TeacherPostPojo("22/07/1992", "Brazil","juliaete@gmail.com", "FEMALE", true, lessonsIdList, "Juliete", "Nikolas2022!!", "346-633-2171", "228-13-2861", "Alves", "Juliete");
        }

        @When("sends POST request and get response creating teacher")
        public void sendsPOSTRequestAndGetResponseCreatingTeacher() {
                response = given(spec).body(payload).post("{first}/{second}");
                response.prettyPrint();
        }

        @Then("verifies status code for teacher is {int}")
        public void verifiesStatusCodeForTeacherIs(int code) {
                assertEquals(code, response.statusCode());
        }

        @And("verifies response body for teacher")
        public void verifiesResponseBodyForTeacher() {
                TeacherResponsePojo actualData = response.as(TeacherResponsePojo.class);

                assertEquals(payload.getBirthDay(), actualData.getObject().getBirthDay());
                assertEquals(payload.getBirthPlace(), actualData.getObject().getBirthPlace());
                assertEquals(payload.getEmail(), actualData.getObject().getEmail());
                assertEquals(payload.getGender(), actualData.getObject().getGender());
                assertEquals(payload.getName(), actualData.getObject().getName());
                assertEquals(payload.getPhoneNumber(), actualData.getObject().getPhoneNumber());
                assertEquals(payload.getSsn(), actualData.getObject().getSsn());
                assertEquals(payload.getSurname(), actualData.getObject().getSurname());
                assertEquals(payload.getUsername(), actualData.getObject().getUsername());
        }

        @And("Vice Dean gets id of the Teacher with username {string}")
        public void viceDeanGetsIdOfTheTeacherWithUsername (String username){
                spec.pathParams("first", "teachers", "second", "getAll");
                response = given(spec).get("{first}/{second}");
                List<Integer> idList =  response.jsonPath().getList("findAll{it.username == '"+username+"' }.userId");
                userId = idList.get(0); // should change all the time I run the test
                System.out.println("userId = " + userId);
        }

        @And("Vice Dean sets the Url for Get Saved Teacher By id")
        public void viceDeanSetsTheUrlForGetTeacherById () {
                spec.pathParams("first","teachers", "second", "getSavedTeacherById", "third", userId);
        }
        @And("sets the expected data for Get Saved Teacher By id")
        public void setsTheExpectedDataForGetTeacherById () {
                objectPojo = new ObjectPojo(userId, "Juliete", "Juliete", "Alves", "1992-07-22", "228-13-2861", "Brazil", "346-611-2171", "FEMALE", "juliete@gmail.com", true);
                expectedData = new TeacherPojo(objectPojo, "Teacher successfully found", "OK");
        }

        @When("sends GET request and get response for Teacher")
        public void sendsGETRequestAndGetResponseForTeacher() {
                response = given(spec).get("{first}/{second}/{third}");
                response.prettyPrint();
        }

        @And("verifies response body for Get Teacher By id")
        public void verifiesResponseBodyForGetTeacherById () {
                response = given(spec).get("{first}/{second}/{third}");
                response.prettyPrint();
        }

        @When("Vice Dean deletes the created Teacher")
        public void viceDeanDeletesTheCreatedTeacher() {
                spec.pathParams("first","teachers", "second", "delete", "third", userId);
                response = given(spec).delete("{first}/{second}/{third}");
                response.then().statusCode(200);
        }
}
