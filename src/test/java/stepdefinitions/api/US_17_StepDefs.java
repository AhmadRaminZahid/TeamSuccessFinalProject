

package stepdefinitions.api;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.ht.Le;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import pojos.US_17.StudentInfoExpectedDataPojo;
import utilities.WaitUtils;

import java.util.Objects;

import static baseurl.ManagementonSchool_BaseUrl.spec;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static stepdefinitions.ui.US_22_StepDefs.Adminusername;

public class US_17_StepDefs {
    Response response;
    JsonPath actualData;
    
    static Integer midtermExam;
    static Integer finalExam;
    
    static Integer absentee;
    
    static String InfoNote;
    
    static Integer LessonId;
    
    static Integer studentId;
    static Integer educationTermId;
    
    StudentInfoExpectedDataPojo expectedData;
    Integer studentInfoId;
    @When("Teacher sets the Url for GetAll Student info for teacher")
    public void teacherSetsTheUrlForGetAllStudentInfoForTeacher() {
        spec.pathParams("first","studentInfo","second","getAllForTeacher")
                .queryParams("page","0","size","200");
    }
    
    @And("Teacher sets the expected data for Student info")
    public void teacherSetsTheExpectedDataForStudentInfo() {
        expectedData= new StudentInfoExpectedDataPojo(10,47,56,"CC + dersten geçti",4451,40,3361);
    }
    
    @And("Teacher sends GETAll request and get response")
    public void teacherSendsGETAllRequestAndGetResponse() {
        response = given(spec).get("{first}/{second}");
        response.prettyPrint();
        WaitUtils.waitFor(3);
    }
    
    @And("Teacher get id of created Student info")
    public void teacherGetIdOfCreatedStudentInfo() {
        actualData = response.jsonPath();
        
        
    
        for (int i = 0; i <200 ; i++) {
            if (Objects.equals(actualData.getString("content[" + i + "].infoNote"), "CC + dersten geçti")){
                String id=actualData.getString("content[" + i + "].id");
                studentInfoId=Integer.valueOf(id);
                midtermExam=Integer.valueOf(actualData.getString("content[" + i + "].midtermExam"));
                finalExam=Integer.valueOf(actualData.getString("content[" + i + "].finalExam"));
                absentee=Integer.valueOf(actualData.getString("content[" + i + "].absentee"));
                InfoNote=actualData.getString("content[" + i + "].infoNote");
                LessonId=Integer.valueOf(actualData.getString("content[" + i + "].lessonId"));
                studentId=Integer.valueOf(actualData.getString("content[" + i + "].studentResponse.userId"));
                educationTermId=Integer.valueOf(actualData.getString("content[" + i + "].educationTermId"));
                break;
            }
        }
    }
    
    @Then("Teacher verifies status code is 200")
    public void teacherVerifiesStatusCodeIs200() {
        assertEquals(200, response.statusCode());
    
    }
    
    @And("Teacher verifies response body for Student info")
    public void teacherVerifiesResponseBodyForStudentInfo() {
        Integer expectedMidterm=expectedData.getMidtermExam();
        Integer expectedfinalExam=expectedData.getFinalExam();
        Integer expectedAbseentee=expectedData.getAbsentee();
        Integer expectedLessonId=expectedData.getLessonId();
        Integer expectedStudentId=expectedData.getStudentId();
        Integer expectedEducationTermId=expectedData.getEducationTermId();
       
        Assert.assertEquals(expectedMidterm,midtermExam);
        Assert.assertEquals(expectedfinalExam,finalExam);
        Assert.assertEquals(expectedAbseentee,absentee);
        Assert.assertEquals(expectedData.getInfoNote(),InfoNote);
        Assert.assertEquals(expectedLessonId,LessonId);
        Assert.assertEquals(expectedStudentId,studentId);
        Assert.assertEquals(expectedEducationTermId,educationTermId);
    
    
    }
    
    @When("Teacher deletes Student info by id")
    public void teacherDeletesStudentInfoById() {
       
        
        spec.pathParams("first","studentInfo", "second", "delete", "third", studentInfoId);
        response = given(spec).delete("{first}/{second}/{third}");
        
        response.then().statusCode(200);
    }
}
