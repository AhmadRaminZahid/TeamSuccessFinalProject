package stepdefinitions.db;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pojos.us14pojo.PayloadUpdatePojo;

import java.sql.*;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class US_14_StepDefs {
    Connection connection;
    Statement statement;
    ResultSet resultSet;
    PayloadUpdatePojo payload;
    @Given("Vice Dean sets connection for updated Teacher")
    public void viceDeanSetsConnectionForUpdatedTeacher() throws SQLException {
        connection = DriverManager.getConnection("jdbc:postgresql://managementonschools.com:5432/school_management","select_user","43w5ijfso");
    }

    @And("Vice Dean creates statement for updated Teacher")
    public void viceDeanCreatesStatementForUpdatedTeacher() throws SQLException {
        statement = connection.createStatement();

    }

    @When("Vice Dean executes query for updated Teacher")
    public void viceDeanExecutesQueryForUpdatedTeacher() throws SQLException {
        String query = "SELECT * FROM teacher WHERE name = 'Janetay'";
        resultSet = statement.executeQuery(query);
    }

    @Then("Vice Dean validates result set for updated Teacher")
    public void viceDeanValidatesResultSetForUpdatedTeacher() throws SQLException {
        resultSet.next();
        List<Integer> lessonsIdList = List.of(4451);
        payload = new PayloadUpdatePojo("1992-07-22", "Madrid","juliete@gmail.com", "FEMALE", true, lessonsIdList, "Juliete", "Nikolas2022!!", "346-623-2171", "228-13-2861", "Alves", "Juliete");
        assertEquals(payload.getBirthPlace(), resultSet.getString("birth_place"));
    }

    @And("Vice Dean terminates connection for updatedTeacher")
    public void viceDeanTerminatesConnectionForUpdatedTeacher() {
    }
}
