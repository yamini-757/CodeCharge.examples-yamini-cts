@Login_Page
Feature: http://examples.codecharge.com/TaskManager/Default.php


  Scenario Outline: Data Driven Login to examples.codecharge.com/TaskManager/Default.php
     Given Open chrome and start application
    When I enter valid "<usernameNumber>" 
    When user should be able to login
    When selecting the employees
    
   Then appplication should be closed

    Examples: 
   |usernameNumber|
   |            1	|
   