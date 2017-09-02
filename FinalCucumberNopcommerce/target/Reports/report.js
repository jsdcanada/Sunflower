$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/Resources/FinalCucumberTrial/Login.feature");
formatter.feature({
  "line": 1,
  "name": "user should be able to Log in to application",
  "description": "so that user can get benefit of various features of the application",
  "id": "user-should-be-able-to-log-in-to-application",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4762864907,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "user should be able to Log in to application with valid credentials",
  "description": "",
  "id": "user-should-be-able-to-log-in-to-application;user-should-be-able-to-log-in-to-application-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "that user has completed Registration successfully",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user is on Login page",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user enters valid credentials",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user should be able to log in to application successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user should see \"Log out\" button on top right of the page",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.thatUserHasCompletedRegistrationSuccessfully()"
});
formatter.result({
  "duration": 231443078,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userIsOnLoginPage()"
});
formatter.result({
  "duration": 25849,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userEntersValidCredentials()"
});
formatter.result({
  "duration": 13961668,
  "error_message": "org.openqa.selenium.NoSuchWindowException: Unable to find element on closed window (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 16 milliseconds\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1cd5757287168e54b817830adce9b0158d\u0027, time: \u00272016-06-30 19:26:09\u0027\nSystem info: host: \u0027E7440-PC\u0027, ip: \u0027192.168.0.21\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_101\u0027\nDriver info: org.openqa.selenium.ie.InternetExplorerDriver\nCapabilities [{se:ieOptions\u003d{browserAttachTimeout\u003d0, ie.enableFullPageScreenshot\u003dtrue, enablePersistentHover\u003dtrue, ie.forceCreateProcessApi\u003dfalse, ie.forceShellWindowsApi\u003dfalse, ignoreZoomSetting\u003dfalse, ie.fileUploadDialogTimeout\u003d3000, ie.useLegacyFileUploadDialogHandling\u003dfalse, nativeEvents\u003dtrue, ie.ensureCleanSession\u003dfalse, elementScrollBehavior\u003d0, ie.browserCommandLineSwitches\u003d, requireWindowFocus\u003dfalse, initialBrowserUrl\u003dhttp://localhost:45802/, ignoreProtectedModeSettings\u003dfalse, enableElementCacheCleanup\u003dtrue}, browserName\u003dinternet explorer, pageLoadStrategy\u003dnormal, javascriptEnabled\u003dtrue, version\u003d11, platform\u003dWINDOWS, unexpectedAlertBehaviour\u003ddismiss}]\nSession ID: a0a25715-8045-4545-8330-290e4385a0e5\n*** Element info: {Using\u003dlink text, value\u003dRegister}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByLinkText(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByLinkText.findElement(By.java:246)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\r\n\tat FinalCucumberTrial.Utils.myClick(Utils.java:19)\r\n\tat PageObjects.HomePage.clickOnRegisterButton(HomePage.java:33)\r\n\tat PageObjects.LogInPage.logIn(LogInPage.java:22)\r\n\tat FinalCucumberTrial.MyStepdefs.userEntersValidCredentials(MyStepdefs.java:208)\r\n\tat ✽.When user enters valid credentials(src/test/Resources/FinalCucumberTrial/Login.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "MyStepdefs.userShouldBeAbleToLogInToApplicationSuccessfully()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Log out",
      "offset": 17
    }
  ],
  "location": "MyStepdefs.userShouldSeeButtonOnTopRightOfThePage(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 17514710,
  "error_message": "org.openqa.selenium.NoSuchWindowException: Unable to get browser (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 15 milliseconds\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1cd5757287168e54b817830adce9b0158d\u0027, time: \u00272016-06-30 19:26:09\u0027\nSystem info: host: \u0027E7440-PC\u0027, ip: \u0027192.168.0.21\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_101\u0027\nDriver info: org.openqa.selenium.ie.InternetExplorerDriver\nCapabilities [{se:ieOptions\u003d{browserAttachTimeout\u003d0, ie.enableFullPageScreenshot\u003dtrue, enablePersistentHover\u003dtrue, ie.forceCreateProcessApi\u003dfalse, ie.forceShellWindowsApi\u003dfalse, ignoreZoomSetting\u003dfalse, ie.fileUploadDialogTimeout\u003d3000, ie.useLegacyFileUploadDialogHandling\u003dfalse, nativeEvents\u003dtrue, ie.ensureCleanSession\u003dfalse, elementScrollBehavior\u003d0, ie.browserCommandLineSwitches\u003d, requireWindowFocus\u003dfalse, initialBrowserUrl\u003dhttp://localhost:45802/, ignoreProtectedModeSettings\u003dfalse, enableElementCacheCleanup\u003dtrue}, browserName\u003dinternet explorer, pageLoadStrategy\u003dnormal, javascriptEnabled\u003dtrue, version\u003d11, platform\u003dWINDOWS, unexpectedAlertBehaviour\u003ddismiss}]\nSession ID: a0a25715-8045-4545-8330-290e4385a0e5\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:701)\r\n\tat org.openqa.selenium.ie.InternetExplorerDriver.getScreenshotAs(InternetExplorerDriver.java:194)\r\n\tat FinalCucumberTrial.Utils.captureScreenShot(Utils.java:113)\r\n\tat FinalCucumberTrial.Hooks.takeScreenShotIfTestFailAndQuiteBrowser(Hooks.java:37)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:37)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:13)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:31)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:223)\r\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:211)\r\n\tat cucumber.runtime.Runtime.runAfterHooks(Runtime.java:205)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:46)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:91)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:93)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:37)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.internal.runners.statements.RunAfters.evaluate(RunAfters.java:27)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:98)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:117)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:42)\r\n\tat com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:262)\r\n\tat com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:84)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat com.intellij.rt.execution.application.AppMain.main(AppMain.java:147)\r\n",
  "status": "failed"
});
formatter.uri("src/test/Resources/FinalCucumberTrial/Registration.feature");
formatter.feature({
  "line": 1,
  "name": "user should be able to do Registration",
  "description": "       so that user can get credentials to log into application",
  "id": "user-should-be-able-to-do-registration",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2483542612,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "user should be able to navigate to Register page",
  "description": "",
  "id": "user-should-be-able-to-do-registration;user-should-be-able-to-navigate-to-register-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user click on Register button on homepage",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user should be navigated to Register page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user should see \"Register\" message on Register page",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.user_is_on_homepage()"
});
formatter.result({
  "duration": 118220,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userClickOnRegisterButtonOnHomepage()"
});
formatter.result({
  "duration": 10111211338,
  "error_message": "org.openqa.selenium.NoSuchElementException: Unable to find element with link text \u003d\u003d Register (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 10.11 seconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1cd5757287168e54b817830adce9b0158d\u0027, time: \u00272016-06-30 19:26:09\u0027\nSystem info: host: \u0027E7440-PC\u0027, ip: \u0027192.168.0.21\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_101\u0027\nDriver info: org.openqa.selenium.ie.InternetExplorerDriver\nCapabilities [{se:ieOptions\u003d{browserAttachTimeout\u003d0, ie.enableFullPageScreenshot\u003dtrue, enablePersistentHover\u003dtrue, ie.forceCreateProcessApi\u003dfalse, ie.forceShellWindowsApi\u003dfalse, ignoreZoomSetting\u003dfalse, ie.fileUploadDialogTimeout\u003d3000, ie.useLegacyFileUploadDialogHandling\u003dfalse, nativeEvents\u003dtrue, ie.ensureCleanSession\u003dfalse, elementScrollBehavior\u003d0, ie.browserCommandLineSwitches\u003d, requireWindowFocus\u003dfalse, initialBrowserUrl\u003dhttp://localhost:35227/, ignoreProtectedModeSettings\u003dfalse, enableElementCacheCleanup\u003dtrue}, browserName\u003dinternet explorer, pageLoadStrategy\u003dnormal, javascriptEnabled\u003dtrue, version\u003d11, platform\u003dWINDOWS, unexpectedAlertBehaviour\u003ddismiss}]\nSession ID: 1be4a4f8-b6d6-416e-ad8e-5bb981a5fa6a\n*** Element info: {Using\u003dlink text, value\u003dRegister}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByLinkText(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByLinkText.findElement(By.java:246)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:355)\r\n\tat FinalCucumberTrial.Utils.myClick(Utils.java:19)\r\n\tat PageObjects.HomePage.clickOnRegisterButton(HomePage.java:33)\r\n\tat FinalCucumberTrial.MyStepdefs.userClickOnRegisterButtonOnHomepage(MyStepdefs.java:41)\r\n\tat ✽.When user click on Register button on homepage(src/test/Resources/FinalCucumberTrial/Registration.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "MyStepdefs.user_should_be_navigated_to_Register_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Register",
      "offset": 17
    }
  ],
  "location": "MyStepdefs.user_should_see_message_on_Register_page(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 33639677,
  "error_message": "org.openqa.selenium.NoSuchWindowException: Unable to get browser (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 31 milliseconds\nBuild info: version: \u00272.53.1\u0027, revision: \u0027a36b8b1cd5757287168e54b817830adce9b0158d\u0027, time: \u00272016-06-30 19:26:09\u0027\nSystem info: host: \u0027E7440-PC\u0027, ip: \u0027192.168.0.21\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_101\u0027\nDriver info: org.openqa.selenium.ie.InternetExplorerDriver\nCapabilities [{se:ieOptions\u003d{browserAttachTimeout\u003d0, ie.enableFullPageScreenshot\u003dtrue, enablePersistentHover\u003dtrue, ie.forceCreateProcessApi\u003dfalse, ie.forceShellWindowsApi\u003dfalse, ignoreZoomSetting\u003dfalse, ie.fileUploadDialogTimeout\u003d3000, ie.useLegacyFileUploadDialogHandling\u003dfalse, nativeEvents\u003dtrue, ie.ensureCleanSession\u003dfalse, elementScrollBehavior\u003d0, ie.browserCommandLineSwitches\u003d, requireWindowFocus\u003dfalse, initialBrowserUrl\u003dhttp://localhost:35227/, ignoreProtectedModeSettings\u003dfalse, enableElementCacheCleanup\u003dtrue}, browserName\u003dinternet explorer, pageLoadStrategy\u003dnormal, javascriptEnabled\u003dtrue, version\u003d11, platform\u003dWINDOWS, unexpectedAlertBehaviour\u003ddismiss}]\nSession ID: 1be4a4f8-b6d6-416e-ad8e-5bb981a5fa6a\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:678)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:701)\r\n\tat org.openqa.selenium.ie.InternetExplorerDriver.getScreenshotAs(InternetExplorerDriver.java:194)\r\n\tat FinalCucumberTrial.Utils.captureScreenShot(Utils.java:113)\r\n\tat FinalCucumberTrial.Hooks.takeScreenShotIfTestFailAndQuiteBrowser(Hooks.java:37)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:37)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:13)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:31)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:223)\r\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:211)\r\n\tat cucumber.runtime.Runtime.runAfterHooks(Runtime.java:205)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:46)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:91)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:93)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:37)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.internal.runners.statements.RunAfters.evaluate(RunAfters.java:27)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:98)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:117)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:42)\r\n\tat com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:262)\r\n\tat com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:84)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat com.intellij.rt.execution.application.AppMain.main(AppMain.java:147)\r\n",
  "status": "failed"
});
});