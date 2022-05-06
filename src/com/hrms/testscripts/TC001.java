package com.hrms.testscripts;

import com.hrms.lib.General;

public class TC001 {
public static void main ( String args []) {
// Test Steps
	General object = new General();
	object.openApplication();
	object.login();
	object.logout();
	object.closeApplication();



}
}