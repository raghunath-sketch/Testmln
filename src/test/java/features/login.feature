@tag1
Feature: SwagLabs Login Funactionality

  
  Scenario Outline: Login
  Given user launch the url
  When user enter username "<uname>" and password "<pass>"
  And click on login button
  Then validate succesful login
  
  Examples:
|uname||pass|
|locked_out_user||secret_sauce|
|problem_user||secret_sauce|
|performance_glitch_use||secret_sauce|