package SeleniumSessions;

public class Z_TestNG_Basics {
	
	/*	
	 * TestNG 
	 * 		- Unit Testing Framework
	 * 		- Used by developers, only designed for Java Developers
	 * 		- TestNG works with Java
	 * 		- Cannot use TestNG with Python, C#, javaScript based applications
	 * 		 
	 * 		
	 * Purpose of testNG
	 * 		- write the test cases 
	 * 		- different Test steps we're writing with the help of Selenium - Can we assert or validate with the help of selenium?
	 * 		- No, Selenium cannot check if specific feature is working fine or not
	 * 		- test steps (Selenium) + assert (checkpoint) - can be done with testNG
	 * 
	 * 
	 * testNG works on the basis of ANNOTATIONS 
	 * 		- Annotations - is a special feature of method written with '@' 
	 * 		- @Before, @After
	 * 
	 *  
	 *  @Before
	 *  @Test
	 *  @After
	 *  
	 *  
	 * Generate Test Reports - PASS/FAIL
	 * 
	 *  
	 * We can define the priority of the test cases to run first
	 * 
	 * 
	 * Data Providers 
	 * 		- If I want to check the login page with 5 userNames and 5 Passwords
	 * 		- Do I have to write the hardCoded value for 5 times, NO
	 * 		- I can do that with Data Providers with a single method
	 * 		- with DataProviders we can also perform DataDrivenTesting 
	 * 
	 * 
	 * Core Features - Handle Exception, Dependencies, create some Annotations
	 * 
	 * 
	 * testNG Listeners 
	 * 		- they've given various listeners to customize the report
	 * 		- Generate graphs, colors, Fancy reports
	 * 		- Extent Report/ Allure Report - Advanced testNG report concept
	 * 
	 * 
	 * Feature - testNG Runners - in the form of testNg.xml file
	 * 		- purpose --> testNG.xml file is like a test suite/ runner concept for me 
	 * 		- 10 test classes I've written, I'll give the entry of these 10 test classes in testNG.xml file and start run them together
	 * 		- All 10 test classes will be running together with testNg.xml file and
	 * 		- produce the result how many tests got PASS/FAIL
	 * 		
	 * 		- with testNG.xml --> decorate/arrange the tests
	 * 		- Parallel testing
	 * 		- Parameterization/parameters - how to pass run time parameters/ command line parameters 
	 * 
	 * Selenium does not provide any parallel testing concept, threading concept. we have to use testNG Runner/ testNG concept for that
	 * 
	 * 
	 * Retry Logic - count = 3 : F1, F2, F3 --> overall test will be failed
	 * 						   : F1, P2 --> overall test will be passed
	 * 						   : P1 --> test passed
	 * 	 
	 * 
	 * Different Annotations: 
	 * 		- @BeforeSuite - Global condition - Open DB Connection
	 * 		- @BeforeClass - Pre-condition - Login
	 * 		- @BeforeMethod 
	 * 		- @Test  - for every test, @BeforeMethod will be executed first --> Test --> @AfterMethod [even if we have 100 tests, same will be followed]
	 * 		- @AfterMethod
	 * 		- @AfterClass - Logout
	 * 		- @AfterSuite - Close DB Connection
	 * 
	 * 
	 * testNG 
	 * 		- does not have any UI / No look and feel
	 * 		- Pure JAR file 
	 *		- 1. pom.xml --> add testNG dependency --> purpose is to write testNg code
	 *		- 2. download testNG Plugin --> used to run testCases with testNG
	 *		- 3. Integrate Maven with testNG --> execute testNg test cases with Maven with SureFirePlugin	 
	 *
	 *
	 * <scope>test</scope> - testNG should be used only and only src/test/java
	 * <scope>compile</scope> - write code under src/main/java
	 * 
	 */

}
