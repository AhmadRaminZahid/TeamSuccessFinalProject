package stepdefinitions.api;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import static baseurl.ManagementonSchool_BaseUrl.spec;

public class US_12_StepDefs {
    @And("sets the Url for assigning the lesson to teacher")
    public void setsTheUrlForAssigningTheLessonToTeacher() {
        spec.pathParams("first",)
    }

    @And("sets the payload for assigning the lesson to teacher")
    public void setsThePayloadForAssigningTheLessonToTeacher() {
    }

    @When("sends POST request and GETS response for assigning lesson")
    public void sendsPOSTRequestAndGETSResponseForAssigningLesson() {
    }

    @And("verifies response body for assigning lesson")
    public void verifiesResponseBodyForAssigningLesson() {
    }

    @And("Vice Dean gets the id of the assigned lesson")
    public void viceDeanGetsTheIdOfTheAssignedLesson() {
    }

    @And("Vice Dean sets the url for getting lesson by id")
    public void viceDeanSetsTheUrlForGettingLessonById() {
    }

    @And("Vice Dean deletes the assigned lesson")
    public void viceDeanDeletesTheAssignedLesson() {
    }
}
