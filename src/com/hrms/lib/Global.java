package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global {
// std rule :To provide TestData& Objects Related to // whole applications 
	// Test Data
	public WebDriver driver;
	public String url = "http://183.82.103.245/nareshit/login.php";
	public String username = "nareshit";
    public String password = "nareshit";
    public String EFN = "LAVAKUMAR";
    public String ELN = "GURRAPU";
    public String EFN1 = "SRINIVAS";
    public String ELN1= "V";
    // Objects
    public String txt_loginname = "txtUserName";
    public String txt_password = "txtPassword";
    public String btn_login = "Submit";
    public String link_logout = "Logout";
   public String frame = "rightMenu";
   public String btn_Add = "//input[@value='Add']";
   public String txt_EFN = "txtEmpFirstName";
   public String txt_ELN = "txtEmpLastName";
   public String btn_Save = "btnEdit";
public String btn_Edit = "EditMain";
public String btn_Sve = "btnEditPers";
public String btn_Delete = "//input[@value='Delete']";
public String chkbx_Employeeid = "//input[@value='2326']";
}
