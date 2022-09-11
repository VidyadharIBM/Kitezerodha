package KiteResult;

  import org.testng.Assert;
  import org.testng.Reporter;
  import org.testng.annotations.AfterClass;
  import org.testng.annotations.AfterMethod;
  import org.testng.annotations.BeforeClass;
  import org.testng.annotations.BeforeMethod;
  import org.testng.annotations.Test;

  import Base.BaseClass;
  import POM_Classes.POM1;
  import POM_Classes.POM2;
  import POM_Classes.POM3;
  import Utility.UtilityClass;

  public class ResultClass extends BaseClass {
		
	 POM1 login1;
	 POM2 login2;
	 POM3 home;
				
	@BeforeClass
		public void openBrowser() throws Throwable {
	         initalizeBrowser();
			    
			   //all objects of POM class
			    login1=new POM1(driver);
			    login2=new POM2(driver);
			    home=new POM3(driver);
	}
			
	@BeforeMethod
		public void loginToApp() throws Throwable {
			
	        login1.enterUN(UtilityClass.getTD(0, 0));
			System.out.println((UtilityClass.getTD(0, 0)));
			
			login1.enterPWD(UtilityClass.getTD(0, 1));
				
			login1.clickLOGINBTN();
				
				
			
				login2.enterPIN(UtilityClass.getTD(0, 2));
				
				login2.clickcntBtn();
			}
			@Test
			public void verifyuserID() throws Throwable {
				Reporter.log("running verify user id",true);
				String actID = home.verifyuserID();
				 String expID=UtilityClass.getTD(0, 0);
				Assert.assertEquals(expID,actID,"both are different tc is failed");
			}
			@AfterMethod
			public void logoutApp() {
				Reporter.log("logout the application",true);
			}
			@AfterClass
			public void closeBrowser() {
				Reporter.log("close the app",true);
			}
	}
