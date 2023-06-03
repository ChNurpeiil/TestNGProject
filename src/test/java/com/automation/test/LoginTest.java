package com.automation.test;


import org.testng.annotations.*;

public class LoginTest extends BaseTest{

    //    @BeforeSuite //only start
//    public void setUp(){
//        System.out.println("Before Suite");
//    }
//    @AfterSuite //only the end
//    public void cleanUp(){
//        System.out.println("After Suite");
//    }


//    @BeforeMethod //start  before each test
//    public void setUp() {
//        System.out.println("Before Suite");
//    }
//
//    @AfterMethod //the end after each test
//    public void cleanUp() {
//        System.out.println("After Suite");
//    }


//        @BeforeTest
//    public void setUp(){
//        System.out.println("Before Test");
//    }
//    @AfterTest
//    public void cleanUp(){
//        System.out.println("After Test");
//    }
    @Test(groups = {"SmokeTest", "ChiragTest"})
    @Parameters("browser")
    public void verifyUserCanLogin(String browser) {

        System.out.println("Verify login successful");
        System.out.println("Opening browser "+browser);
    }

    @Test(groups = {"ChiragTest", "WIPTest"})

    public void verifyUserCannotLoginWithInvalidCredentials() {
        System.out.println("Verify login unsuccessful for invalid credentials");
    }

    @Test(groups = "SmokeTest")
    public void verifyUserCanResetPassword() {

        System.out.println("Verify user can reset password");
    }
}

