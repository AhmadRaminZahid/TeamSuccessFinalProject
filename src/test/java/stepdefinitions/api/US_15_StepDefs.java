package stepdefinitions.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import pojos.us_15_pojos.*;

import java.util.List;

import static baseurl.ManagementonSchool_BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

public class US_15_StepDefs {
    StudentPostPojo payload;
    Response response;
    Response response1;

    ObjectMapper objectMapper = new ObjectMapper();
    public static ObjectGetPojo objectGetPojo;
    public static int userId;
    public static StudentGetPojo expectedData;
    public static StudentPostPojo expectedData1;

    public static ActualStudentPojo actualData;

    public static ActualByNamePojo actualData1;


    @And("Vice Dean sets the Url for Student Save")
    public void viceDeanSetsTheUrlForStudentSave() {
        spec.pathParams("first", "students", "second", "save");
    }

    @And("sets the payload for Student Save")
    public void setsThePayloadForStudentSave() {
        payload = new StudentPostPojo(4938, "1992-07-22","Portugal","anita@gmail.com","Eliot Paes", "FEMALE","Juliana Paes", "Melissay", "Julia_2139", "344-414-4444", "322-33-2221", "Alves", "Alvesinho");
    }

    @When("sends POST request and get response creating Student")
    public void sendsPOSTRequestAndGetResponseCreatingStudent() {
        response = given(spec).body(payload).post("{first}/{second}");
        response.prettyPrint();
    }

    @Then("verifies status code for Student is {int}")
    public void verifiesStatusCodeForStudentIs(int code) {
        assertEquals(code, response.statusCode());
    }

    @And("verifies response body for Student")
    public void verifiesResponseBodyForStudent() {
         actualData = response.as(ActualStudentPojo.class);

        assertEquals(payload.getAdvisorTeacherId(), actualData.getObject().getAdvisorTeacherId());
        assertEquals(payload.getBirthDay(), actualData.getObject().getBirthDay());
        assertEquals(payload.getBirthPlace(), actualData.getObject().getBirthPlace());
        assertEquals(payload.getEmail(), actualData.getObject().getEmail());
        assertEquals(payload.getFatherName(), actualData.getObject().getFatherName());
        assertEquals(payload.getMotherName(), actualData.getObject().getMotherName());
        assertEquals(payload.getGender(), actualData.getObject().getGender());
        assertEquals(payload.getName(), actualData.getObject().getName());
        assertEquals(payload.getPhoneNumber(), actualData.getObject().getPhoneNumber());
        assertEquals(payload.getSsn(), actualData.getObject().getSsn());
        assertEquals(payload.getSurname(), actualData.getObject().getSurname());
        assertEquals(payload.getUsername(), actualData.getObject().getUsername());
    }


    @And("sets the expected data for Get Student By name")
    public void setsTheExpectedDataForGetStudentByName() {
        expectedData1 = new StudentPostPojo(4938, "1992-07-22","Portugal","aniita@gmail.com","Eliot Paes", "FEMALE","Juliana Paes", "Melissay", "Julia_2139", "344-214-4444", "322-23-2221", "Alves", "Alvesinho");
    }

    @When("sends GET request and get response for Student")
    public void sendsGETRequestAndGetResponseForStudent() throws JsonProcessingException {
       // actualData1 = response.as(ActualByNamePojo.class);

        String resultList = response.asString();
        System.out.println("resultList = " + resultList);

        // Deserialize JSON array into a list of objects
        List<ActualByNamePojo> pojoList = objectMapper.readValue(resultList, new TypeReference<List<ActualByNamePojo>>() {});
        // Extract the first object from the list
        actualData1 = pojoList.get(0);
        System.out.println(actualData1);
    }

    @And("verifies response body for Get Student By name")
    public void verifiesResponseBodyForGetStudentByName() {
        assertEquals(200,response.statusCode());

        assertEquals(expectedData1.getSurname(),actualData1.getSurname());
        assertEquals(expectedData1.getBirthPlace(),actualData1.getBirthPlace());
        assertEquals(expectedData1.getBirthDay(),actualData1.getBirthDay());
        assertEquals(expectedData1.getPhoneNumber(),actualData1.getPhoneNumber());
        assertEquals(expectedData1.getGender(),actualData1.getGender());
        assertEquals(expectedData1.getMotherName(),actualData1.getMotherName());
        assertEquals(expectedData1.getFatherName(),actualData1.getFatherName());
        assertEquals(expectedData1.getEmail(),actualData1.getEmail());
    }

    @And("Vice Dean gets id of the Student with name {string}")
    public void viceDeanGetsIdOfTheStudentWithName(String name) {
        spec.pathParams("first", "students", "second", "getStudentByName").queryParam("name",name);
        response = given(spec).get("{first}/{second}");
        List<Integer> idList =  response.jsonPath().getList("findAll{it.name == '"+name+"' }.userId");
        userId = idList.get(0);
        System.out.println("userId = " + userId);
    }

    @And("Vice Dean deletes the created Student")
    public void viceDeanDeletesTheCreatedStudent() {
        spec.pathParams("first","students", "second", "delete", "third", userId);
        response = given(spec).delete("{first}/{second}/{third}");
        response.then().statusCode(200);
    }
}
