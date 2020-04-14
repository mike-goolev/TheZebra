Java based UI automation using the selenium webdriver framework

It takes around 1-2 minutes to perform default automatic configuration after opening the project.
There are 2 test classes in tests module:

InsuranceQuotes - gets auto quotes and print list of available insurance companies
VerificationOfElements - verifies whether links/text/buttons/icons are displayed on the web page



-----Running via gradle task in IDEA Gradle window-------
1) Open Gradle window
2) Navigate to Tasks -> verification 
3) run test task



-----Running via terminal-------

1) cd to the project directory
2) run ./gradlew clean test



-----Running via gradle specific test class-------

1) cd to the project directory
2) run ./gradlew clean test --tests "tests.InsuranceQuotes"
       ./gradlew clean test --tests "tests.VerificationOfElements"
       
       
       


  




