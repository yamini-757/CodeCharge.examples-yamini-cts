$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 2,
  "name": "http://examples.codecharge.com/TaskManager/Default.php",
  "description": "",
  "id": "http://examples.codecharge.com/taskmanager/default.php",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Login_Page"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Data Driven Login to examples.codecharge.com/TaskManager/Default.php",
  "description": "",
  "id": "http://examples.codecharge.com/taskmanager/default.php;data-driven-login-to-examples.codecharge.com/taskmanager/default.php",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "Open chrome and start application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I enter valid \"\u003cusernameNumber\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user should be able to login",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "selecting the employees",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "appplication should be closed",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "http://examples.codecharge.com/taskmanager/default.php;data-driven-login-to-examples.codecharge.com/taskmanager/default.php;",
  "rows": [
    {
      "cells": [
        "usernameNumber"
      ],
      "line": 14,
      "id": "http://examples.codecharge.com/taskmanager/default.php;data-driven-login-to-examples.codecharge.com/taskmanager/default.php;;1"
    },
    {
      "cells": [
        "1"
      ],
      "line": 15,
      "id": "http://examples.codecharge.com/taskmanager/default.php;data-driven-login-to-examples.codecharge.com/taskmanager/default.php;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 15,
  "name": "Data Driven Login to examples.codecharge.com/TaskManager/Default.php",
  "description": "",
  "id": "http://examples.codecharge.com/taskmanager/default.php;data-driven-login-to-examples.codecharge.com/taskmanager/default.php;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Login_Page"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Open chrome and start application",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I enter valid \"1\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user should be able to login",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "selecting the employees",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "appplication should be closed",
  "keyword": "Then "
});
formatter.match({
  "location": "ValidLogin.open_chrome_and_start_application()"
});
formatter.result({
  "duration": 15939692543,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 15
    }
  ],
  "location": "ValidLogin.i_enter_valid(String)"
});
formatter.result({
  "duration": 4153460493,
  "status": "passed"
});
formatter.match({
  "location": "ValidLogin.user_should_be_able_to_login()"
});
formatter.result({
  "duration": 4043482419,
  "status": "passed"
});
formatter.match({
  "location": "ValidLogin.selecting_the_employees()"
});
formatter.result({
  "duration": 6510240758,
  "status": "passed"
});
formatter.match({
  "location": "ValidLogin.appplication_should_be_closed()"
});
formatter.result({
  "duration": 1649109784,
  "status": "passed"
});
formatter.uri("page.feature");
formatter.feature({
  "line": 2,
  "name": "Employee",
  "description": "",
  "id": "employee",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@p1_enter"
    }
  ]
});
formatter.scenario({
  "line": 3,
  "name": "adding employee details",
  "description": "",
  "id": "employee;adding-employee-details",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Open chrome and start application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "selecting the tasklist",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "it\u0027s time to logouot",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "appplication should be closed",
  "keyword": "Then "
});
formatter.match({
  "location": "ValidLogin.open_chrome_and_start_application()"
});
formatter.result({
  "duration": 9412664273,
  "status": "passed"
});
formatter.match({
  "location": "ValidLogin.selecting_the_tasklist()"
});
formatter.result({
  "duration": 12714667804,
  "status": "passed"
});
formatter.match({
  "location": "ValidLogin.it_s_time_to_logouot()"
});
formatter.result({
  "duration": 3260886797,
  "status": "passed"
});
formatter.match({
  "location": "ValidLogin.appplication_should_be_closed()"
});
formatter.result({
  "duration": 172266702,
  "status": "passed"
});
});