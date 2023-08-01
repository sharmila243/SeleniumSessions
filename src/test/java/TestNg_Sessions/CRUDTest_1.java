package TestNg_Sessions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CRUDTest_1 {
	
	//The below method will always create a new userId whenever it is called
	public int addUser() {
		System.out.println("**Creating User**");
		int userId = 123;
		System.out.println(userId);
		return userId;
	}
	
	@Test
	public void addUserTest() {
		int userId = addUser(); 
		//If addUser() is giving any problem or not creating a user, 
			//By the time it reaches next method getUserTest() it might work fine, then all the tests will pass/
		Assert.assertEquals(userId, 123);
	}

	@Test
	public void getuserIdTest() {
		int userId = addUser();
		System.out.println("get the user for userId: " + userId); 
	}
	
	@Test
	public void updateUserTest() {
		int userId = addUser();
		System.out.println("Upadate userId: " + userId);
	}
	
	@Test
	public void deleteUserTest(){
		int userId = addUser();
		System.out.println("delete UserId: " + userId);
	}
	

}
