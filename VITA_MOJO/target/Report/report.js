$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/Feature/Test.feature");
formatter.feature({
  "name": "VitaMojo Login Functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "SignIn on VitaMojo",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Click on Login tab",
  "keyword": "And "
});
formatter.step({
  "name": "User Enter email as \"\u003cEmail\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "User Enter password as \"\u003cPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Go for Login",
  "keyword": "And "
});
formatter.step({
  "name": "User Should be Logged in system with Login Name as \"\u003cName\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Name",
        "Email",
        "Password",
        "option"
      ]
    },
    {
      "cells": [
        "Dinesh1",
        "dt1@gmail.com",
        "qwer1234",
        "yes"
      ]
    }
  ]
});
formatter.background({
  "name": "User is Logged In",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User at VitaMojo site \"https://automation.vmos-demo.com/\" using \"CROME\"",
  "keyword": "Given "
});
formatter.match({
  "location": "TestStepDefinition.user_at_VitaMojo_site_using(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigate to Login Page",
  "keyword": "And "
});
formatter.match({
  "location": "TestStepDefinition.navigate_to_Login_Page()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException: Cannot invoke \"org.openqa.selenium.WebElement.click()\" because the return value of \"PageObjects.LoginPage.getElement(org.openqa.selenium.WebDriver, org.openqa.selenium.By)\" is null\r\n\tat PageObjects.LoginPage.clickOnLoginLink(LoginPage.java:32)\r\n\tat StepDefinition.TestStepDefinition.navigate_to_Login_Page(TestStepDefinition.java:52)\r\n\tat ✽.Navigate to Login Page(src/test/java/Feature/Test.feature:5)\r\n",
  "status": "failed"
});
formatter.scenario({
  "name": "SignIn on VitaMojo",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Click on Login tab",
  "keyword": "And "
});
formatter.match({
  "location": "TestStepDefinition.click_on_Login_tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User Enter email as \"dt1@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "TestStepDefinition.user_Enter_email_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User Enter password as \"qwer1234\"",
  "keyword": "And "
});
formatter.match({
  "location": "TestStepDefinition.user_Enter_password_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Go for Login",
  "keyword": "And "
});
formatter.match({
  "location": "TestStepDefinition.go_for_Login()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User Should be Logged in system with Login Name as \"Dinesh1\"",
  "keyword": "Then "
});
formatter.match({
  "location": "TestStepDefinition.user_Should_be_Logged_in_system_with_Login_Name_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "error_message": "org.openqa.selenium.WebDriverException: disconnected: not connected to DevTools\n  (failed to check if window was closed: disconnected: not connected to DevTools)\n  (Session info: chrome\u003d114.0.5735.199)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-6OD3ENG\u0027, ip: \u0027192.168.43.6\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002720.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 114.0.5735.199, chrome: {chromedriverVersion: 114.0.5735.90 (386bc09e8f4f..., userDataDir: C:\\Users\\Narendra\\AppData\\L...}, goog:chromeOptions: {debuggerAddress: localhost:49421}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: abad01a6a9ae4ca27555704408af1987\r\n\tat java.base/jdk.internal.reflect.DirectConstructorHandleAccessor.newInstance(DirectConstructorHandleAccessor.java:67)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:484)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:609)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.close(RemoteWebDriver.java:442)\r\n\tat StepDefinition.TestStepDefinition.cleanUp(TestStepDefinition.java:37)\r\n\tat java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:104)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:578)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runner.HookDefinitionMatch.runStep(HookDefinitionMatch.java:16)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:63)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:49)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:48)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:40)\r\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:146)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:124)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:65)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat cucumber.api.junit.Cucumber$1.evaluate(Cucumber.java:133)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:93)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:40)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:529)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:756)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:452)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:210)\r\n",
  "status": "failed"
});
});