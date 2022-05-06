package com.hrms.testscripts;

import com.hrms.lib.General;

public class TC003_EditEMP {
public static void main (String args []) {
	General object = new General ();
	
	object.openApplication();
	object.login();
	object.enterFrame();
	object.addNewEmp();
	object.EditEMP();

	
	
			
	
	
	
}
}
