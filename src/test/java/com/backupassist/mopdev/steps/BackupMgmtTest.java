package com.backupassist.mopdev.steps;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.testng.AbstractTestNGCucumberTests;

import org.testng.Assert;
//import com.backupassist.mopdev.object.commonobject.* ;


@CucumberOptions(features = {"E:/MopDevProject/mopdev/src/test/java/com/backupassist/mopdev/features/features"})
public class BackupMgmtTest extends AbstractTestNGCucumberTests {
	//private DashboardPage dashboard;
	//private BackupManagementPage backupMgmt;
	//private BackupPage backup;
	//private BackupTabGeneralPage backupTabGeneral;
	
   @Given("^I have open the console$") 
   public void openConsole() { 
	  // dashboard = Console.setConnection();
   } 
	
   @When("^I create a job$") 
   public void createJob() { 
	//   backupMgmt = dashboard.clickMenuBackupJobs();
	  // backup = backupMgmt.clickBtnNew();
	  // backupTabGeneral = backup.clickBtnCloud();
   } 
	
   @Then("^Close console$") 
   public void closeConsole() {
	  // Console.closeConnection();
   } 
}