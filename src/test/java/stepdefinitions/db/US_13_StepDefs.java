package stepdefinitions.db;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pojos.us_13_pojos.TeacherPostPojo;
import pojos.us_15_pojos.StudentPostPojo;

import java.sql.*;
import java.util.List;

public class US_13_StepDefs {
    Connection connection;
    Statement statement;
    ResultSet resultSet;
    TeacherPostPojo payload;

    @Given("Vice Dean sets connection Teacher")
    public void viceDeanSetsConnectionTeacher() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management","select_user","43w5ijfso");
    }

    @And("Vice Dean creates statement Teacher")
    public void viceDeanCreatesStatementTeacher() throws SQLException {
        statement = connection.createStatement();
    }

    @When("Vice Dean executes query for created Teacher")
    public void viceDeanExecutesQueryForCreatedTeacher() throws SQLException {
        String query = "SELECT * FROM teacher WHERE name = 'Juliete'";
        resultSet = statement.executeQuery(query);
    }

    @Then("Vice Dean validates result set Teacher")
    public void viceDeanValidatesResultSetTeacher() throws SQLException {
        resultSet.next();
        List<Integer> lessonsIdList = List.of(4451);
        payload = new TeacherPostPojo("1992-07-22", "Brazil","anita@gmail.com", "1", true, lessonsIdList, "Juliete", "Nikolas2022!!", "344-414-4444", "228-13-2861", "Alves", "Juliete");
        Assert.assertEquals(payload.getBirthDay(),resultSet.getString("birth_day"));
        Assert.assertEquals(payload.getBirthPlace(),resultSet.getString("birth_place"));
        Assert.assertEquals(payload.getEmail(),resultSet.getString("email"));
        Assert.assertEquals(payload.getGender(),resultSet.getString("gender"));
      //  Assert.assertEquals(payload.isIsAdvisorTeacher(),resultSet.getBoolean("advisor_teacher"));
      //  Assert.assertEquals(payload.getLessonsIdList(),resultSet.getString("lessons_id"));
        Assert.assertEquals(payload.getName(),resultSet.getString("name"));
      //  Assert.assertEquals(payload.getPassword(),resultSet.getString("password"));
        Assert.assertEquals(payload.getPhoneNumber(),resultSet.getString("phone_number"));
        Assert.assertEquals(payload.getSsn(),resultSet.getString("ssn"));
        Assert.assertEquals(payload.getSurname(),resultSet.getString("surname"));
        Assert.assertEquals(payload.getUsername(),resultSet.getString("username"));
    }

    @And("Vice Dean terminates connection Teacher")
    public void viceDeanTerminatesConnectionTeacher() {
    }
}
