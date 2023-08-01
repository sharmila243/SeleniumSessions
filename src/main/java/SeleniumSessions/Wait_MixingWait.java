package SeleniumSessions;

public class Wait_MixingWait {
	
	/*
	 * Let's say we've applied Implicit wait of 10sec - applicable for all WebElements 
	 * also
	 * Explicit wait - WebDriverWait of 15sec for a particular Element - Username 
	 * 
	 * For Username field how many waits will be applied?
	 * 		- Go through Implicit wait 
	 * 			- Implicit Wait applied - 10sec - found within 2sec --> 8sec will be ignored
	 * 		- comes to WebDriverWait 
	 * 			- WDWait - 15 sec - found within 5sec --> so we have to wait for 5sec
	 * 	 	- Total timeOut = 2 + 5 = 7sec
	 * 
	 * 
	 * 
	 * For Username field how many waits will be applied?
	 * 		- Go through Implicit wait 
	 * 			- Implicit Wait applied - 10sec - found within 9sec --> 1sec will be ignored
	 * 		- comes to WebDriverWait 
	 * 			- WDWait - 15sec - found within 14sec --> so we have to wait for 14sec
	 * 	 	- Total timeOut = 9 + 14 = 23sec
	 * 
	 * 
	 * 
	 * For Username field how many waits will be applied?
	 * 		- Go through Implicit wait 
	 * 			- Implicit Wait applied - 10sec - 10sec - not found 
	 * 		- comes to WebDriverWait 
	 * 			- WDWait - 15sec - found within 14sec --> so we have to wait for 14sec
	 * 	 	- Total timeOut = 10 + 14 = 24sec
	 * 
	 * 
	 * 
	 * For Username field how many waits will be applied?
	 * 		- Go through Implicit wait 
	 * 			- Implicit Wait applied - 10sec - not found
	 * 		- comes to WebDriverWait 
	 * 			- WDWait - 15sec - not found
	 * 	 	- Total timeOut = 10 + 15 = 25sec
	 * 
	 * 
	 * 
	 * For Username field how many waits will be applied?
	 * 		- Go through Implicit wait 
	 * 			- Implicit Wait applied - 10sec - found within 9sec --> 1sec will be ignored
	 * 		- comes to WebDriverWait 
	 * 			- WDWait - 15sec - found within 1sec --> so we have to wait for 1sec
	 * 	 	- Total timeOut = 9 + 1 = 10sec
	 * 
	 * 
	 * Mixing both waits are generating a cumulative wait --> more time
	 * Impact the performance of the script
	 * Both are of different Mechanism and not a good idea to apply both together
	 * 
	 * NEVER APPLY BOTH THE WAITS
	 * 
	 */

}
