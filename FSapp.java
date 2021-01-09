package appium;

import org.apache.tools.ant.taskdefs.Sleep;
import org.testng.annotations.Test;

import wrappers.GenericWrappers;
import wrappers.CommonWrappers.Locators;

public class FSapp extends GenericWrappers{
	
	@Test
	public void FSapppage1(){
	
	launchAndroidApp("Sridevice", "com.footballnation.fantasyspin.debug", "com.footballnation.fantasyspin.activitys.SplashActivity", "","" );
//	//Google clink
//	click(getWebElement(Locators.XPATH.toString(), "//android.widget.TextView[@text='Continue with Google']"));
//	click(getWebElement(Locators.XPATH.toString(), "//android.widget.TextView[@text='tpn qatest']"));
//	click(getWebElement(Locators.ID.toString(), "FSHOMEsettingsicon"));	
//	click(getWebElement(Locators.XPATH.toString(), "//android.widget.TextView[@text='Link Accounts']"));
//	click(getWebElement(Locators.XPATH.toString(), "//android.widget.TextView[@text='UNLINK']"));
//	//Log in
//	click(getWebElement(Locators.XPATH.toString(), "//android.widget.TextView[@text='LOG IN']"));
//	enterValue(getWebElement(Locators.ID.toString(), "FSloginemailtxt"), "tpnqatest@gmail.com");
//	enterValue(getWebElement(Locators.ID.toString(), "FSloginpwdtxt"), "Admin@123");
//	click(getWebElement(Locators.ID.toString(), "FSloginbtn"));
//	click(getWebElement(Locators.ID.toString(), "FSHOMEsettingsicon"));	
//	click(getWebElement(Locators.XPATH.toString(), "//android.widget.TextView[@text='Link Accounts']"));
//	click(getWebElement(Locators.XPATH.toString(), "//android.widget.TextView[@text='UNLINK']"));
//	//How to play
//	click(getWebElement(Locators.ID.toString(), "ivHowToPlay"));
//	click(getWebElement(Locators.ID.toString(), "ivRight"));
//	click(getWebElement(Locators.ID.toString(), "ivRight"));
//	click(getWebElement(Locators.ID.toString(), "ivRight"));
//	click(getWebElement(Locators.ID.toString(), "ivRight"));
//	click(getWebElement(Locators.ID.toString(), "ivRight"));
//	click(getWebElement(Locators.ID.toString(), "ivRight"));
//	sleep(1000);
//	
//	//click(getWebElement(Locators.ID.toString(), "ivRight"));
//	//click(getWebElement(Locators.ID.toString(), "button"));
//
//boolean  A = false;
//	
//	try {
//		A=eleIsDisplayed(getWebElement(Locators.ID.toString(), "ivRight"));
//	} catch (Exception e) {
//		// TODO Auto-generated catch block
//		//e.printStackTrace();
//	}
//		
//	//System.out.println(eleIsDisplayed(getWebElement(Locators.ID.toString(), "ivRight")));
//
//
//	if (A) {
//		click(getWebElement(Locators.ID.toString(), "ivRight"));
//	}
//	else
//	{
////		click(getWebElement(Locators.ID.toString(), "ivLeft"));
//		click(getWebElement(Locators.ID.toString(), "button"));
//	}
//	
// Continue with Facebook
	
//	click(getWebElement(Locators.ID.toString(), "FSFBloginbtn"));
//	sleep(2000);
//	boolean FBtext = false;
//	try {
//		//FBtext=(verifyText(getWebElement(Locators.XPATH.toString(), "//android.widget.EditText[@content-desc='Username']"), "Phone or email"));
//		//FBtext=(verifyText(getWebElement(Locators.XPATH.toString(), "android.widget.EditText[@resource-id='m_login_password']"), "Facebook password"));
//		FBtext= eleIsDisplayed(getWebElement(Locators.XPATH.toString(), "//android.widget.Button[@text='Log In']"));
//	}catch (Exception e) {
//		// TODO Auto-generated catch block
//		//e.printStackTrace();
//	}
////	
//	if (FBtext)
//	{
////		enterValue(getWebElement(Locators.XPATH.toString(), "//android.widget.EditText[@content-desc='Username']"), "qauser1dc@gmail.com");
////		enterValue(getWebElement(Locators.XPATH.toString(), "//android.widget.EditText[@content-desc='Password']"), "Admin@123");
////		click(getWebElement(Locators.XPATH.toString(), "//android.view.ViewGroup[@content-desc='Log In']"));
////		click(getWebElement(Locators.XPATH.toString(), "//android.widget.Button[@text='Continue']"));
//		enterValue(getWebElement(Locators.XPATH.toString(), "//android.widget.EditText[@resource-id='m_login_email']"), "qauser1dc@gmail.com");
//		enterValue(getWebElement(Locators.XPATH.toString(), "//android.widget.EditText[@resource-id='m_login_password']"), "Admin@123");
//		click(getWebElement(Locators.XPATH.toString(), "//android.widget.Button[@text='Log In']"));
//		click(getWebElement(Locators.XPATH.toString(), "//android.widget.Button[@text='Continue']"));
//		sleep(1000);
//		click(getWebElement(Locators.ID.toString(), "FSHOMEsettingsicon"));	
//		click(getWebElement(Locators.XPATH.toString(), "//android.widget.TextView[@text='Link Accounts']"));
//		click(getWebElement(Locators.XPATH.toString(), "//android.widget.TextView[@text='UNLINK']"));
//	}
//	else{
//	    sleep(500);
//	    boolean DStext = false;
//		try {
//			DStext=(verifyText(getWebElement(Locators.ID.toString(), "com.footballnation.fantasyspin.debug:id/tv_slogan"), "SPIN EVERYDAY TO GET FREE CHIPS!"));
//		}catch (Exception e) {
//			// TODO Auto-generated catch block
//			//e.printStackTrace();
//		}
//
//		if (DStext)
//		{
//		System.out.println("On daily spin screen");
//		click(getWebElement(Locators.ID.toString(), "tv_spin_count_shadow"));
//		
//		}
//		else {
//		System.out.println("Home screen Navigation");
//		sleep(200);
//		click(getWebElement(Locators.XPATH.toString(), "//android.widget.Button[@text='Continue']"));
//		sleep(500);
//		click(getWebElement(Locators.ID.toString(), "FSHOMEsettingsicon"));	
//		click(getWebElement(Locators.XPATH.toString(), "//android.widget.TextView[@text='Link Accounts']"));
//		click(getWebElement(Locators.XPATH.toString(), "//android.widget.TextView[@text='UNLINK']"));
//		
//		}	
//	}	
	
//	//Google login - How to Play,scoring,FAQ checks
	click(getWebElement(Locators.XPATH.toString(), "//android.widget.TextView[@text='Continue with Google']"));
	click(getWebElement(Locators.XPATH.toString(), "//android.widget.TextView[@text='tpn qatest']"));
	sleep(200);
	click(getWebElement(Locators.ID.toString(), "FSHOMEsettingsicon"));	
	sleep(500);
	click(getWebElement(Locators.XPATH.toString(), "//android.widget.TextView[@text='How to Play']"));
	switchToAnotherApp("com.footballnation.fantasyspin.debug");
	sleep(500);
	click(getWebElement(Locators.XPATH.toString(), "//android.widget.TextView[@text='Scoring']"));
	sleep(200);
	click(getWebElement(Locators.XPATH.toString(), "//android.widget.TextView[@text='MLB BASEBALL']"));
	sleep(200);
	switchToAnotherApp("com.footballnation.fantasyspin.debug");
	sleep(200);
	sleep(200);
	click(getWebElement(Locators.ID.toString(), "FSsetscrebackbtn"));
	sleep(200);
	//Frequently Asked Questions
	click(getWebElement(Locators.XPATH.toString(), "//android.widget.TextView[@text='Frequently Asked Questions']"));
	sleep(200);
	switchToAnotherApp("com.footballnation.fantasyspin.debug");
	sleep(200);
	click(getWebElement(Locators.XPATH.toString(), "//android.widget.TextView[@text='Legal & Support']"));
	sleep(200);
	click(getWebElement(Locators.XPATH.toString(), "//android.widget.TextView[@text='TERMS OF USE']"));
	sleep(200);
	switchToAnotherApp("com.footballnation.fantasyspin.debug");
	sleep(500);
	click(getWebElement(Locators.ID.toString(), "FSsetLSbackbtn"));
	sleep(500);
	scrollFromDownToUpinAppUsingPointerInput();
	sleep(500);
	click(getWebElement(Locators.XPATH.toString(), "//android.widget.TextView[@text='Feedback']"));
	sleep(200);
	switchToAnotherApp("com.footballnation.fantasyspin.debug");
	sleep(200);
	click(getWebElement(Locators.XPATH.toString(), "//android.widget.TextView[@text='Link Accounts']"));
	sleep(200);
	click(getWebElement(Locators.XPATH.toString(), "//android.widget.TextView[@text='UNLINK']"));
	
////	switchToAnotherApp("com.footballnation.fantasyspin.debug");
//	sleep(200);
//	click(getWebElement(Locators.XPATH.toString(), "//android.widget.TextView[@text='Feedback']"));
//	sleep(200);
//	switchToAnotherApp("com.footballnation.fantasyspin.debug");
	}
}
