package com.hrms.testscripts;
import com.hrms.lib.General;
public class TC004_DeleteEMP {
public static void main (String args[]) {
General object = new General ();

object.openApplication();
object.login();
object.enterFrame();
object.DeleteEMP();
	
}
}
