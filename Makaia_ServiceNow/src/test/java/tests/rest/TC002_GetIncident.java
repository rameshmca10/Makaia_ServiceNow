package tests.rest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import lib.rest.RESTAssuredBase;

public class TC002_GetIncident extends RESTAssuredBase {

	@BeforeTest // Reporting
	public void setValues() {
		testCaseName = "Get all existing Incident (REST)";
		testDescription = "Get all existing Incident and Verify";
		nodes = "Incident";
		authors = "Sarath";
		category = "REST";
		dataFileName = "TC001";
		dataFileType = "JSON";
	}

	@Test
	public void getIncident() {

		Response response = get("table/incident");

		verifyContentType(response, "application/Json");

		verifyResponseCode(response, 200);

		response.prettyPrint();

	}
}