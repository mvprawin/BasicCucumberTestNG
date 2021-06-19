$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/cucumberfeatures/Login.feature");
formatter.feature({
  "line": 1,
  "name": "User Access Management.",
  "description": "",
  "id": "user-access-management.",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Verify Authentication Functionality",
  "description": "",
  "id": "user-access-management.;verify-authentication-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "Open Application and Enter url",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "enter username",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "enter password",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "verify Msg",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPage.open_Application_and_Enter_url()"
});
formatter.result({
  "duration": 8425722000,
  "status": "passed"
});
formatter.match({
  "location": "LoginPage.enter_username()"
});
formatter.result({
  "duration": 79382900,
  "status": "passed"
});
formatter.match({
  "location": "LoginPage.enter_password()"
});
formatter.result({
  "duration": 155966900,
  "status": "passed"
});
formatter.match({
  "location": "LoginPage.verify_Msg()"
});
formatter.result({
  "duration": 28504700,
  "status": "passed"
});
});