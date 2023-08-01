package TestNg_Sessions;

import org.testng.annotations.Test;

public class CRUDTest {
	
	int userId;
	
	//CRUD -- Create/GET/Update/Delete
	
	@Test
	public void addUserTest() {
		System.out.println("Adding a User");
		int i = 9/0;
		System.out.println(i);
		int userId = 123;
		System.out.println(userId);
		
		//let's say because of some technical issue, wrong xpath, site is slow, browser is not responding userId is not generated --> default = 0
	}

	@Test
	public void getuserIdTest() {
		System.out.println("get the user for userId: " + userId); 
		//will this method get the userId from above --> Yes, and it'll be Zero
		//if there are any next steps, Assertions --> they'll also FAIL accordingly		
	}
	
	//Problem is we're using the same userId all the time in all methods
	
	@Test
	public void updateUserTest() {
		System.out.println("Upadate userId: " + userId);
	}
	
	
	@Test
	public void deleteUserTest(){
		System.out.println("delete UserId: " + userId);
	}
	
	//Even if we make addUser() as the main Method and make all the other test cases dependent on it 
		//if addUser Fails --> all the other tests will also FAIl
	
}
