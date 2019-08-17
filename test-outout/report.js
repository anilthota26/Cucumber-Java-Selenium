$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Y:/New Work Space/CRMWebsite/src/main/java/Features/taging.feature");
formatter.feature({
  "line": 1,
  "name": "using tags",
  "description": "",
  "id": "using-tags",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 27,
  "name": "validating user page",
  "description": "",
  "id": "using-tags;validating-user-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 26,
      "name": "@SomkeTest"
    },
    {
      "line": 26,
      "name": "@End2End"
    }
  ]
});
formatter.step({
  "line": 28,
  "name": "user is alreay on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "test home page title",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "Click on ligin link",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "enter username and password",
  "rows": [
    {
      "cells": [
        "anilkumarthota2179@gmail.com",
        "anil131841"
      ],
      "line": 32
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "Click on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "Click on Contacts link",
  "keyword": "Then "
});
formatter.match({
  "location": "TagsDefinition.user_is_alreay_on_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TagsDefinition.test_home_page_title()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TagsDefinition.click_on_ligin_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TagsDefinition.enter_username_and_password(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TagsDefinition.click_on_ligin_buttion()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "TagsDefinition.click_on_Contacts_link()"
});
formatter.result({
  "status": "skipped"
});
});