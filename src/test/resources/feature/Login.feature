Feature: MY ACCOUNT - LOGIN
  As a customer
  I want to buy some books
  So that I need to login

  Scenario: Login with valid username and password
    And Open home page
    And Click on My Account Menu
    When Enter registered chungnd@paraline.com.vn in username textbox
    And Enter ParalineAuto123@ in password textbox
    And Click on login button
    Then User must successfully login to the web page

  Scenario: Login with incorrect username and incorrect password
    And Open home page
    And Click on My Account Menu
    When Enter registered abc@paraline.com.vn in username textbox
    And Enter asdsad@ in password textbox
    And Click on login button
    Then Nguoi dung thay thong bao loi thong tin dang nhap khong hop le