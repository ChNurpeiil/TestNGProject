package com.automation.test;


import org.testng.annotations.Test;

public class SearchFunctionality extends BaseTest{
    @Test(groups = "SmokeTest")
    public void verifySearchResultsAreDisplayed() {

        System.out.println("verify search result");
    }

    @Test(groups = "AidaiTest")
    public void verifyMessageWhenThereAreNoResult() {

        System.out.println("verify no result message");
    }

    @Test(groups = "AidaiTest")
    public void verifySearchResultHasSearchKeyword() {

        System.out.println("verify search result has search keyword");
    }
}
