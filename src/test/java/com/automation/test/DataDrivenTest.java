package com.automation.test;

import com.ebay.LoginFeatures;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTest {

    LoginFeatures loginFeature = new LoginFeatures();

    @Test
    public void verifyLoginUnsuccessfulWithInvalidCredentials(){
        //Test Data
        String username = "Chirag",password = "admin@123";

        //Testing the Method with Test Data
        boolean result = loginFeature.doLogin(username, password);

        //Checking the output
        Assert.assertEquals(result, false);
    }

    @Test(dataProvider = "invalidData")
    public void verifyLoginUnsuccessfulWithInvalidCredentials1(String username, String password){

        //Testing the Method with Test Data
        boolean result = loginFeature.doLogin(username, password);

        //Checking the output
        Assert.assertEquals(result, false);
    }

    @DataProvider(name = "invalidData")
    public Object[][] getInvalidData(){
        Object[][]credentials = {
                {"admin", "admin123", false},
                {"admin123", "admin123", true},
                {"chirag", "admin123", false},
                {"admin", "@123", false},
                {"devx", "admin123", false},
                {"", "", false},
                {"", "admin123", false},
                {"admin", "admin@123", false}
        };
        return credentials;
    }

    @Test
    public void verifyLoginSuccessfulWithValidCred(){

    }
}
