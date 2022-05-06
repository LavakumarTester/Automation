package com.hrms.testscripts;

import com.hrms.lib.General;

public class TC002_ADDEMP {
public static void main(String args[]) {
	// Test Steps 
	General object = new General ();
	object.openApplication();
	object.login();
	object.enterFrame();
	object.addNewEmp();
	object.exitFrame();
	object.logout();
	object.closeApplication();
	
	
	
	
}
}
