$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Y:/New Work Space/CRMWebsite/src/main/java/Features/hooks.feature");
formatter.feature({
  "line": 1,
  "name": "Test Tagged Hooks",
  "description": "",
  "id": "test-tagged-hooks",
  "keyword": "Feature"
});
formatter.before({
  "duration": 17071612352,
  "status": "passed"
});
formatter.before({
  "duration": 313333,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "#************** Local Hooks *******************#"
    }
  ],
  "line": 6,
  "name": "Home page test",
  "description": "",
  "id": "test-tagged-hooks;home-page-test",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@First"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User already in home page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Title of the page is home page",
  "keyword": "When "
});
formatter.match({
  "location": "HooksDefinition.user_already_in_home_page()"
});
formatter.result({
  "duration": 1197775972,
  "status": "passed"
});
formatter.match({
  "location": "HooksDefinition.title_of_the_page_is_home_page()"
});
formatter.result({
  "duration": 3051930465,
  "status": "passed"
});
formatter.after({
  "duration": 260837264,
  "status": "passed"
});
formatter.after({
  "duration": 180819,
  "status": "passed"
});
formatter.before({
  "duration": 6546592464,
  "status": "passed"
});
formatter.before({
  "duration": 224421,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Login page test",
  "description": "",
  "id": "test-tagged-hooks;login-page-test",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@Second"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "User already in home page",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "Title of the page is home page",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "Click on login link",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Enter the username and password",
  "rows": [
    {
      "cells": [
        "anilkumarthota2179@gmail.com",
        "anil131841"
      ],
      "line": 16
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "HooksDefinition.user_already_in_home_page()"
});
formatter.result({
  "duration": 70749723,
  "status": "passed"
});
formatter.match({
  "location": "HooksDefinition.title_of_the_page_is_home_page()"
});
formatter.result({
  "duration": 3054602137,
  "status": "passed"
});
formatter.match({
  "location": "HooksDefinition.click_on_login_link()"
});
formatter.result({
  "duration": 13660969095,
  "status": "passed"
});
formatter.match({
  "location": "HooksDefinition.enter_the_username_and_password(DataTable)"
});
formatter.result({
  "duration": 2011023532,
  "status": "passed"
});
formatter.after({
  "duration": 560138055,
  "status": "passed"
});
formatter.after({
  "duration": 137217,
  "status": "passed"
});
formatter.before({
  "duration": 7146900497,
  "status": "passed"
});
formatter.before({
  "duration": 426612,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "User home page test",
  "description": "",
  "id": "test-tagged-hooks;user-home-page-test",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 18,
      "name": "@Third"
    }
  ]
});
formatter.step({
  "line": 20,
  "name": "User already in home page",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "Title of the page is home page",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "Click on login link",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "Enter the username and password",
  "rows": [
    {
      "cells": [
        "anilkumarthota2179@gmail.com",
        "anil131841"
      ],
      "line": 24
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "Click on Contacts Button",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "add new contacts",
  "rows": [
    {
      "cells": [
        "firstname",
        "lastname"
      ],
      "line": 27
    },
    {
      "cells": [
        "venki",
        "kodali"
      ],
      "line": 28
    },
    {
      "cells": [
        "Simran",
        "dimple"
      ],
      "line": 29
    },
    {
      "cells": [
        "balaya",
        "Babu"
      ],
      "line": 30
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "HooksDefinition.user_already_in_home_page()"
});
formatter.result({
  "duration": 62059308,
  "status": "passed"
});
formatter.match({
  "location": "HooksDefinition.title_of_the_page_is_home_page()"
});
formatter.result({
  "duration": 3037799671,
  "status": "passed"
});
formatter.match({
  "location": "HooksDefinition.click_on_login_link()"
});
formatter.result({
  "duration": 11430849648,
  "status": "passed"
});
formatter.match({
  "location": "HooksDefinition.enter_the_username_and_password(DataTable)"
});
formatter.result({
  "duration": 882508413,
  "status": "passed"
});
formatter.match({
  "location": "HooksDefinition.click_on_Contacts_Button()"
});
formatter.result({
  "duration": 3167669434,
  "status": "passed"
});
formatter.match({
  "location": "HooksDefinition.add_new_contacts(DataTable)"
});
formatter.result({
  "duration": 24020571875,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"name\",\"selector\":\"first_name\"}\n  (Session info: chrome\u003d76.0.3809.100)\n  (Driver info: chromedriver\u003d2.41.578737 (49da6702b16031c40d63e5618de03a32ff6c197e),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.5.3\u0027, revision: \u0027a88d25fe6b\u0027, time: \u00272017-08-29T12:42:44.417Z\u0027\nSystem info: host: \u0027LAPTOP-LSARCF0V\u0027, ip: \u0027192.168.0.7\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002710.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, hasTouchScreen\u003dfalse, platform\u003dXP, acceptSslCerts\u003dfalse, goog:chromeOptions\u003d{debuggerAddress\u003dlocalhost:50275}, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, platformName\u003dXP, setWindowRect\u003dtrue, unexpectedAlertBehaviour\u003d, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d2.41.578737 (49da6702b16031c40d63e5618de03a32ff6c197e), userDataDir\u003dC:\\Users\\anilt\\AppData\\Local\\Temp\\scoped_dir8840_17045}, takesHeapSnapshot\u003dtrue, unhandledPromptBehavior\u003d, pageLoadStrategy\u003dnormal, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d76.0.3809.100, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 798dc438cfd4681ddd0dea8b74639a31\n*** Element info: {Using\u003dname, value\u003dfirst_name}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:215)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:167)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:82)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:45)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:646)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:416)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByName(RemoteWebDriver.java:494)\r\n\tat org.openqa.selenium.By$ByName.findElement(By.java:303)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:408)\r\n\tat StepDefinitions.HooksDefinition.add_new_contacts(HooksDefinition.java:104)\r\n\tat ✽.Then add new contacts(Y:/New Work Space/CRMWebsite/src/main/java/Features/hooks.feature:26)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 273818598,
  "status": "passed"
});
formatter.after({
  "duration": 227412,
  "status": "passed"
});
});