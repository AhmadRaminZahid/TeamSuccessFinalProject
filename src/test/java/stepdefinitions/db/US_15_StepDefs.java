package stepdefinitions.db;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.http.util.Asserts;
import org.junit.Assert;
import pojos.us_15_pojos.StudentPostPojo;

import java.sql.*;

import static org.junit.Assert.assertEquals;

public class US_15_StepDefs {
    Connection connection;
    Statement statement;
    ResultSet resultSet;

    StudentPostPojo payload;

    @Given("Vice Dean sets connection Student")
    public void viceDeanSetsConnectionStudent() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management","select_user","43w5ijfso");
    }

    @And("Vice Dean creates statement Student")
    public void viceDeanCreatesStatementStudent() throws SQLException {
        statement = connection.createStatement();
    }

    @When("Vice Dean executes query for created Student")
    public void viceDeanExecutesQueryForCreatedStudent() throws SQLException {
        String query = "SELECT * FROM student WHERE name = 'Melissay'";
        resultSet = statement.executeQuery(query);
    }

    @Then("Vice Dean validates result set Student")
    public void viceDeanValidatesResultSetStudent() throws SQLException {
        resultSet.next();
        payload = new StudentPostPojo(4938, "1992-07-22","Portugal","aniita@gmail.com","Eliot Paes", "1","Juliana Paes", "Melissay", "Julia_2139", "344-214-4444", "322-23-2221", "Alves", "Alvesinho");

        Assert.assertEquals(payload.getBirthDay(),resultSet.getString("birth_day"));
        Assert.assertEquals(payload.getBirthPlace(),resultSet.getString("birth_place"));
        Assert.assertEquals(payload.getGender(),resultSet.getString("gender"));
        Assert.assertEquals(payload.getName(),resultSet.getString("name"));
        Assert.assertEquals(payload.getPhoneNumber(),resultSet.getString("phone_number"));
        Assert.assertEquals(payload.getSsn(),resultSet.getString("ssn"));
        Assert.assertEquals(payload.getSurname(),resultSet.getString("surname"));
        Assert.assertEquals(payload.getUsername(),resultSet.getString("username"));
        Assert.assertEquals(payload.getEmail(),resultSet.getString("email"));
        Assert.assertEquals(payload.getFatherName(),resultSet.getString("father_name"));
        Assert.assertEquals(payload.getMotherName(),resultSet.getString("mother_name"));
        Assert.assertEquals(payload.getAdvisorTeacherId(),resultSet.getInt("advisor_teacher_id"));
    }

    @And("Vice Dean terminates connection Student")
    public void viceDeanTerminatesConnectionStudent() {
    }
}
