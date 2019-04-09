$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/M1035889/workspace/BDDFrameworkCucumber/src/main/java/com/qa/features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Facebook Login Test",
  "description": "",
  "id": "facebook-login-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10057978747,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Login to FaceBook application",
  "description": "",
  "id": "facebook-login-test;login-to-facebook-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters crendentials",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "User verifies FaceBook Home Page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinations.user_is_on_Login_Page()"
});
formatter.result({
  "duration": 761439205,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinations.user_enters_crendentials()"
});
formatter.result({
  "duration": 9312073239,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinations.user_verifies_FaceBook_Home_Page()"
});
formatter.result({
  "duration": 15114204,
  "status": "passed"
});
formatter.after({
  "duration": 1244061401,
  "status": "passed"
});
});