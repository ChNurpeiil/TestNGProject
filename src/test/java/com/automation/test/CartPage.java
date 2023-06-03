package com.automation.test;


import org.testng.annotations.Test;

public class CartPage extends BaseTest {
    @Test
    public void verifyUserCanLogin() {

        System.out.println("verify login successful");
    }

    @Test
    public void verifyUserCannotLoginWithInvalidCredentials() {
        System.out.println("verify login unsuccessful for invalid credentials");
    }

    @Test
    public void verifyUserCanResetPassword() {
        System.out.println("verify user can reset password");
    }
}


