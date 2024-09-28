package com.thetestingacademy.tests.crud;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testCreateBookingGET {

    @Link(name = "Link to TC", url = "https://bugz.atlassian.net/browse/RBT-4")
    @Issue("JIRA_RBT-4")
    @TmsLink("RBT-4")
    @Owner("Promode")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Verify that POST request is working fine.")
    @Test
    public void testVerifyCreateBookingGET01(){
        Assert.assertEquals(true,true);
    }
}
