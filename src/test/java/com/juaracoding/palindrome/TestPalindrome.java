package com.juaracoding.palindrome;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class TestPalindrome {

  private Palindrome palindrome;

  String jenis = null;

   // public static void main(String[] args) {
     // System.out.println(Palindrome.isPalindrome("isi"));
      //System.out.println("------------------------------------");
        //System.out.println(Palindrome.isPalindrome("sisi"));
    //}

    @Given("I have a String")
    public void iHaveAString() {
        palindrome = new Palindrome();
    }

    @When("I reverse <str>")
    public void iReverseStr(String str) {
        boolean jenis = palindrome.isPalindrome(str);
    }

    @And("the result is <str>")
    public void theResultIsStr(String str) {
        boolean jenis = palindrome.isPalindrome(str);
    }

    @Then("the result should be <jenis>")
    public void theResultShouldBeJenis(String expect) {
        Assert.assertEquals(jenis, expect);
    }

}




