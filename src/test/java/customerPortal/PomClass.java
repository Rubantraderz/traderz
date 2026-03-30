package customerPortal;


import java.time.Duration;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import io.restassured.RestAssured;
import io.restassured.response.Response;


public class PomClass {
	
	WebDriver driver;

    public PomClass(WebDriver driver) {
        this.driver = driver;
    }
    
    //----------------------Customer Portal Elements------------------------------//
    
    @FindBy(xpath = "//input[@type='email']")
    private WebElement mailid;
    
    @FindBy(xpath = "//input[@type='password']")
    private WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submitbutton;
    
    @FindBy(xpath = "//input[@type='email']")
    private WebElement Adminmailid;
    
    @FindBy(xpath = "//input[@type='password']")
    private WebElement Adminpassword;

    @FindBy(xpath = "//span[text()='Login']")
    private WebElement AdminLoginbutton;
    
    @FindBy(xpath = "//a[@href='/products' and .//p[normalize-space()='Products']]")
    private WebElement Producttab;
    
    @FindBy(xpath = "//input[@placeholder='Search for anything..']")
    private WebElement Searchbar;
    
    @FindBy(xpath = "(//div[@class='flex flex-[0_0_100%] min-w-0 items-center justify-center'])[1]")
    private WebElement productclick;
    
    @FindBy(xpath = "//button[@aria-label='Add to Cart']")
    private WebElement Addtocartclickon_productdetails1;
    
    @FindBy(xpath = "(//img[@alt='shopping-cart'])[1]")
    private WebElement Addtocartclicktop;
    
    @FindBy(xpath = "//button[text()='Proceed to Cart']")
    private WebElement Proceedtocart;
    
    @FindBy(xpath = "//span[text()='Proceed to Checkout']")
    private WebElement Proceedtocheckout;
 
    @FindBy(xpath = "//p[text()='Cash']")
    private WebElement Payment_cash;
    
    @FindBy(xpath = "//p[text()='Card']")
    private WebElement paymentcard;
    
    @FindBy(xpath = "//span[text()='Select a payment term']")
    private WebElement Select_Payment_term;
    
    @FindBy(xpath = "//span[text()='Credit/debit card']")
    private WebElement credit_card_debitcard;
 
    @FindBy(xpath = "//span[text()='Cash On Delivery']")
    private WebElement COD;
    
    @FindBy(xpath = "//p[text()='Select Shipping Address']")
    private WebElement Selectshippingaddress;
    
    @FindBy(xpath = "//div[@class='flex flex-row justify-between w-full']")
    private WebElement Selecting_address;
    
    @FindBy(xpath = "//p[text()='Review Items']")
    private WebElement reviewItems;
    
    @FindBy(xpath = "//span[text()='SIGN PURCHASE ORDER']")
    private WebElement SigninPurchaseOrder;
    
    @FindBy(xpath = "//span[text()='CHECKOUT']")
    private WebElement checkout;
    
    @FindBy(xpath = "//p[text()='Continue Shopping ']")
    private WebElement continueshopping;
    
    @FindBy(xpath = "//img[@src='/icons/edit.svg']")
    private WebElement Upload_LPO_icon;
    
    @FindBy(xpath = "//button[text()='Verify']")
    private WebElement LPO_verify_button;
    
    @FindBy(xpath = "//input[@type='file']")
    private WebElement LPO_uploading;
    
    @FindBy(xpath = "(//button[@type='button'])[21]")
    private WebElement LPO_Next_button;
    
    @FindBy(xpath = "//button[@aria-label='Close']")
    private WebElement LPO_closebutton;
    
   @FindBy(xpath = "//input[@id='email']")
   private WebElement Email_stripe;
   
   @FindBy(xpath = "//input[@id='cardNumber']")
   private WebElement Cardnumber_stripe;
   
   @FindBy(xpath = "//input[@id='cardExpiry']")
   private WebElement Expiry_stripe;
   
   @FindBy(xpath = "//input[@id='cardCvc']")
   private WebElement CCV_stripe;
   
   @FindBy(xpath = "//input[@id='billingName']")
   private WebElement Holdername_stripe;
   
   @FindBy(xpath = "//input[@id='billingPostalCode']")
   private WebElement postalcode_stripe;
   
   @FindBy(xpath = "//div[@class='SubmitButton-CheckmarkIcon']")
   private WebElement Pay_stripe;
   
   @FindBy(xpath = "//p[text()='Logout']")
   private WebElement Logout;
   
   @FindBy(xpath = "//button[text()='Logout']")
   private WebElement Logoutpopup_button;
   
   //---------------------------------Admin Elements------------------------------------//
   
   @FindBy(xpath = "//button[text()=' View Request ']")
   private WebElement Admin_Viewrequestbutton;
   
   @FindBy(xpath = "//a[@href='/requests/list']")
   private WebElement Admin_Request_tab;
   
   @FindBy(xpath = "(//span[text()='Hold'])[1]")
   private WebElement Admin_Holdclick;
   
   @FindBy(xpath = "//a[text()='View Order Details']") 
   private WebElement Admin_Vieworderdetails;
   
   
   @FindBy(xpath = "(//span[text()='Pending'])[1]")
   private WebElement Admin_Pendingclick;
   
   @FindBy(xpath = "//button[text()=' Approve Order ']")
   	private WebElement Admin_Approveclick;
   
   @FindBy(xpath = "//span[text()='All okay']")
   private WebElement Admin_Approve_popup_comments;
   
   @FindBy(xpath = "//button[text()=' Approve ']")
   private WebElement Admin_Approve_popup_Approvebutton;
   
   @FindBy(xpath = "//button[text()=' Hold order ']")
   private WebElement creditcontroller_Holdorderbutton;
   
   @FindBy(xpath = "//span[text()='Available credit too low']")
   private WebElement comment_Holdorder_creditlow;
   
   @FindBy(xpath = "(//button[text()=' Hold order '])[2]")
   private WebElement creditcontroller_Holdorderbutton_creditlow;
   
   @FindBy(xpath = "//a[@href='/orders/list']")
   private WebElement Admin_Orders_tab;
   
   @FindBy(xpath = "(//a[@href='/orders/list'])[1]")
   private WebElement SalesAgent_Orders_tab;
   
   @FindBy(xpath = "(//span[text()=' Held '])[1]")
   private WebElement heldordersList;
   
   @FindBy(xpath = "(//tr[@class='p-row-even'])[1]")
   private WebElement heldorderclick;
   
   
   @FindBy(xpath = "//button[contains(.,'Unhold')]")
   private WebElement Salesagent_unholdbutton;
   
   @FindBy(xpath = "//span[text()='All good now']")
   private WebElement Salesagent_unhold_comment;
   
   @FindBy(xpath = "//label[text()=' Browse.. ']")
   private WebElement Salesagent_upload_browsebutton;
   
   @FindBy(xpath = "//input[@type='file']")
   private WebElement Salesagent_upload_unholdDoc_input;
   
   @FindBy(xpath = "//button[text()=' Send ']")
   private WebElement Salesagent_unholdDoc_sendbutton;
   
   @FindBy(xpath = "(//span[text()='Expeditor Approval'])[1]")
   private WebElement pendingExpeditorapproval;
   
   @FindBy(xpath = "(//button[' Schedule delivery '])[3]")
   private WebElement ScheduleDelivery;
   
   @FindBy(xpath = "//span[@class='p-datepicker-input-icon-container']")
   private WebElement selectdate;
   
   @FindBy(xpath = "//span[@data-p='today']")
   private WebElement selecttoday;
   
   @FindBy(xpath = "//textarea[@placeholder='Other reason...']")
   private WebElement Add_a_reason;
    
   @FindBy(xpath = "//button[text()='Done ']")
   private WebElement ScheduleDelivery_donebutton;
   
   @FindBy(xpath = "(//a[@href='/orders/shipment'])[1]")
   private WebElement ordersShipmenttab;
   
   @FindBy(xpath = " //p[text()=' Orders Listing']")
   private WebElement Orderslisting;
   
   @FindBy(xpath = "//p[text()=' Shipment Orders']")
   private WebElement shipmentsOrders;
   
   @FindBy(xpath = "(//span[text()='Picking Approval'])[1]")
   private WebElement pendingPickingapproval;
   
   @FindBy(xpath = "(//div[@class='p-checkbox p-component'])[1]")
   private WebElement selectordercheckbox;
   
   @FindBy(xpath = "(//div[@class='relative'])[2]")
   private WebElement approvePickingbutton;
   
   @FindBy(xpath = "//button[text()='Assign To Shipment']")
   private WebElement assignToShipmentbutton;
   
   @FindBy(xpath = "//p[text()='Choose a Truck']")
   private WebElement choosetruck;
   
   @FindBy(xpath = "(//div[@class='flex items-center gap-2 cursor-pointer hover:bg-t-bg-500 p-2 rounded-lg'])[1]")
   private WebElement selectingtruck;
   
   @FindBy(xpath = "(//div[@class='w-full bg-t-grey-alt-9 mb-2 !border-0 rounded-lg h-10 flex justify-between items-center px-3 cursor-pointer'])[2]")
   private WebElement choosedriver;
   
   @FindBy(xpath = "//p[text()='Driver']")
   private WebElement selectingdriver;
   
   @FindBy(xpath = "//input[@class='p-inputtext p-component p-inputtext-fluid p-datepicker-input']")
   private WebElement order_delivery_date;
   
   @FindBy(xpath = "//span[@data-p='today']")
   private WebElement order_delivery_datetoday;
   
   @FindBy(xpath = "//div[@class='p-select p-component p-inputwrapper w-full !bg-t-grey-alt-9 mt-1 !border-0']")
   private WebElement slotnumber;
   
   @FindBy(xpath = "//p[text()='09:00 - 13:00']")
   private WebElement selecttimeslot;
   
   @FindBy(xpath = "(//button[text()=' Arrange Shipment '])[1]")
   private WebElement ArrangeShipmentbutton;
   
   
   
    
    //--------------------------------------------Test-Execution---------------------------------------------------------------------//
    
    //Customer Portal Login Testcases
    public void Testcase_01() throws InterruptedException {
        Thread.sleep(2000);
        mailid.sendKeys("ruban@yopmail.com");
        password.sendKeys("Admin@123"); 
        Thread.sleep(2000);
        submitbutton.click();
        Reporter.log("LoginCustomer", true);
    }
    
    // After login, directly clicking products tab without searching for product.
    public void Testcase_02() throws InterruptedException {
        Thread.sleep(2000);
        mailid.sendKeys("ruban@yopmail.com");
        password.sendKeys("Admin@123"); 
        Thread.sleep(2000);
        submitbutton.click();
        Thread.sleep(3000);
        Producttab.click();
        Reporter.log("ProdctsTab opened", true);
    }
    
    // After login, directly clicking products tab with searching for product.
    public void Testcase_03() throws InterruptedException {
        Thread.sleep(2000);
        mailid.sendKeys("ruban@yopmail.com");
        password.sendKeys("Admin@123"); 
        Thread.sleep(2000);
        submitbutton.click();
        Thread.sleep(3000);
        Producttab.click();
        Thread.sleep(2000);
        Searchbar.sendKeys("light");
        Reporter.log("Products Searched", true);
    }
    
    // After login, directly clicking products tab with searching for product and click on that product.
    public void Testcase_04() throws InterruptedException {
        Thread.sleep(2000);
        mailid.sendKeys("ruban@yopmail.com");
        password.sendKeys("Admin@123"); 
        Thread.sleep(2000);
        submitbutton.click();
        Thread.sleep(3000);
        Producttab.click();
        Thread.sleep(2000);
        Searchbar.sendKeys("light");
        Thread.sleep(2000);
        productclick.click();
        Reporter.log("Prodcts Searched & clicked", true);
    }
    
    //with uploading LPO...Order creation full flow with COD payment and uploading LPO and sign purchase order.
    public void Testcase_05() throws InterruptedException {
       Thread.sleep(2000);
       mailid.sendKeys("ruban@yopmail.com");
       password.sendKeys("Admin@123"); 
       Thread.sleep(2000);
       submitbutton.click();
       Thread.sleep(3000);
       Producttab.click();
       Thread.sleep(2000);
       Searchbar.sendKeys("light");
       Thread.sleep(2000);
       productclick.click();
       Thread.sleep(4000);
       Addtocartclickon_productdetails1.click();
       Thread.sleep(3000);
       Addtocartclicktop.click();
       Thread.sleep(3000);
       Proceedtocart.click();
       Thread.sleep(3000);
       Proceedtocheckout.click();
       Thread.sleep(3000);
       Payment_cash.click();
       Thread.sleep(3000);
       Select_Payment_term.click();
       Thread.sleep(3000);
       COD.click();
       Thread.sleep(3000);
       Selectshippingaddress.click();
       Thread.sleep(3000);
       Selecting_address.click();
       Thread.sleep(2000);
       reviewItems.click();
       Thread.sleep(3000);
       Upload_LPO_icon.click();
       Thread.sleep(3000);
       LPO_verify_button.click();
       Thread.sleep(3000);
       LPO_uploading.sendKeys("C:\\Users\\rubanraj\\OneDrive - traderz com\\Documents");
       Thread.sleep(4000);
       LPO_Next_button.click();
       Thread.sleep(4000);
       LPO_closebutton.click();
       Thread.sleep(2000);
       checkout.click();
       Thread.sleep(3000);
       continueshopping.click();
       Reporter.log("CreatingOrderFullFlow", true);     
    }
    
    //without uploading LPO...direct signInPurchase....& Card payment....
    public void Testcase_06() throws InterruptedException {
        Thread.sleep(2000);
        mailid.sendKeys("ruban@yopmail.com");
        password.sendKeys("Admin@123"); 
        Thread.sleep(2000);
        submitbutton.click();
        Thread.sleep(3000);
        Producttab.click();
        Thread.sleep(2000);
        Searchbar.sendKeys("light");
        Thread.sleep(2000);
        productclick.click();
        Thread.sleep(4000);
        Addtocartclickon_productdetails1.click();
        Thread.sleep(3000);
        Addtocartclicktop.click();
        Thread.sleep(3000);
        Proceedtocart.click();
        Thread.sleep(3000);
        Proceedtocheckout.click();
        Thread.sleep(3000);
        paymentcard.click();
        Thread.sleep(3000);
        Select_Payment_term.click();
        Thread.sleep(3000);
        credit_card_debitcard.click();
        Thread.sleep(3000);
        Selectshippingaddress.click();
        Thread.sleep(3000);
        Selecting_address.click();
        Thread.sleep(2000);
        reviewItems.click();
        Thread.sleep(3000);
      //SigninPurchaseOrder.click(); 
        checkout.click();
        Thread.sleep(3000);
        Email_stripe.sendKeys("ruban@yopmail.com");
        Thread.sleep(2000);
        Cardnumber_stripe.sendKeys("4242 4242 4242 4242");
        Thread.sleep(2000);
        Expiry_stripe.sendKeys("12/34");
        Thread.sleep(2000);
        CCV_stripe.sendKeys("123");
        Thread.sleep(2000);
        Holdername_stripe.sendKeys("Ruban");
        Thread.sleep(2000);
        postalcode_stripe.sendKeys("600001");
        Thread.sleep(3000);	
        Pay_stripe.click();	
        Thread.sleep(20000);
        continueshopping.click();
        Reporter.log("2_CreatingOrderFullFlow", true);
         
     }
    
    // Customermake Order, Admin Approved Order, Schedule Delivery, Sync Nav, Skip to Shipment, Approve Picking, Arrange Shipment (End to End flow)
    public void Testcase_07() throws InterruptedException {
        Thread.sleep(2000);
        mailid.sendKeys("ruban@yopmail.com");
        password.sendKeys("Admin@123"); 
        Thread.sleep(2000);
        submitbutton.click();
        Thread.sleep(3000);
        Producttab.click();
        Thread.sleep(2000);
        Searchbar.sendKeys("light");
        Thread.sleep(2000);
        productclick.click();
        Thread.sleep(4000);
        Addtocartclickon_productdetails1.click();
        Thread.sleep(3000);
        Addtocartclicktop.click();
        Thread.sleep(3000);
        Proceedtocart.click();
        Thread.sleep(3000);
        Proceedtocheckout.click();
        Thread.sleep(3000);
        Payment_cash.click();
        Thread.sleep(2000);
        Select_Payment_term.click();
        Thread.sleep(2000);
        COD.click();
        Thread.sleep(2000);
        Selectshippingaddress.click();
        Thread.sleep(2000);
        Selecting_address.click();
        Thread.sleep(2000);
        reviewItems.click();
        Thread.sleep(3000);
        checkout.click();
        Thread.sleep(5000);
        continueshopping.click();
        Thread.sleep(2000);
        Logout.click();
        Thread.sleep(2000);
        Logoutpopup_button.click();
        // Close browser
        driver.quit();

        // Open new browser (creditcontroller)
        System.setProperty("webdriver.edge.driver", 
        	    "C:\\Users\\rubanraj\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        EdgeOptions options = new EdgeOptions();
        driver = new EdgeDriver(options);
    
        driver.manage().window().maximize();
        driver.get("https://admin.traderzdev.com");

        // Reinitialize PageFactory elements
        PageFactory.initElements(driver, this);
        Thread.sleep(2000);

        // Admin login (Credit Controller Approval)
        Adminmailid.sendKeys("muneeb@electricway.com");
        Adminpassword.sendKeys("Admin@123");
        Thread.sleep(2000);
        AdminLoginbutton.click();
        Thread.sleep(5000);
        Admin_Request_tab.click();
        Thread.sleep(2000);
        Admin_Pendingclick.click();
        Thread.sleep(2000);
        Admin_Approveclick.click();
        Thread.sleep(2000);
        Admin_Approve_popup_comments.click();
        Thread.sleep(2000);
        Admin_Approve_popup_Approvebutton.click();
        Thread.sleep(1000);
        driver.quit();
        
        // Open new browser (Expeditator)
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://admin.traderzdev.com");

        // Reinitialize PageFactory elements
        PageFactory.initElements(driver, this);
        Thread.sleep(2000);

        // Admin login (Expeditator approval)
        Adminmailid.sendKeys("mohammed.wafi@electricway.com");
        Adminpassword.sendKeys("Admin@123");
        Thread.sleep(2000);
        AdminLoginbutton.click();
        Thread.sleep(5000);
        Admin_Orders_tab.click();
        Thread.sleep(2000);
        pendingExpeditorapproval.click();
		Thread.sleep(2000);
		
		// ---------- GET ORDER ID ----------
		String currentUrl = driver.getCurrentUrl();
		String orderId = currentUrl.substring(currentUrl.lastIndexOf("/") + 1);

		// ---------- LOGIN API ----------
		Response loginResponse = RestAssured
		        .given()
		        .header("Content-Type", "application/json")
		        .body("{\"email\":\"superuser@email.com\",\"password\":\"Admin@123\",\"remember\":true}")
		        .post("https://api.traderzdev.com/admin/auth/login");

		Map<String, String> loginCookies = loginResponse.getCookies();

		// ---------- SYNC API (FIX HERE) ----------
		Response syncResponse = RestAssured
		        .given()
		        .header("Content-Type", "application/json")
		        .header("Accept", "application/json")
		        .cookies(loginCookies)
		        .post("https://api.traderzdev.com/admin/order/" + orderId + "/sync_to_nav");

		System.out.println("Sync Status: " + syncResponse.getStatusCode());
		
		driver.navigate().refresh();
		Thread.sleep(3000);
		PageFactory.initElements(driver, this);
		Admin_Request_tab.click();
        Thread.sleep(2000);
        Admin_Pendingclick.click();
        Thread.sleep(2000);
		ScheduleDelivery.click();
		Thread.sleep(2000);
		selectdate.click();
		Thread.sleep(2000);
		selecttoday.click();
		Thread.sleep(2000);
		Add_a_reason.sendKeys("Schedule delivery for today");
		Thread.sleep(2000);
		ScheduleDelivery_donebutton.click();
		Thread.sleep(4000);
		
		// ---------- LOGIN SECOND USER (harish) ----------
		Response loginResponse2 = RestAssured
		        .given()
		        .header("Content-Type", "application/json")
		        .body("{\"email\":\"harish@traderz.com\",\"password\":\"Admin@123\",\"remember\":true}")
		        .post("https://api.traderzdev.com/admin/auth/login");

		System.out.println("Second Login Status: " + loginResponse2.getStatusCode());

		Map<String, String> loginCookies2 = loginResponse2.getCookies();


		// ---------- SKIP TO SHIPMENT API ----------
		Response skipShipmentResponse = RestAssured
		        .given()
		        .header("Content-Type", "application/json")
		        .header("Accept", "application/json")
		        .cookies(loginCookies2)
		        .post("https://api.traderzdev.com/admin/order/" + orderId + "/skip_to_shipment");

		System.out.println("Skip To Shipment Status: " + skipShipmentResponse.getStatusCode());
		Thread.sleep(4000);
		System.out.println(skipShipmentResponse.getBody().asString());
        Thread.sleep(2000);

		
		// Open new browser (Logistics Manager)
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://admin.traderzdev.com");

        // Reinitialize PageFactory elements
        PageFactory.initElements(driver, this);
        Thread.sleep(2000);

        // Admin login (logistics manager)
        Adminmailid.sendKeys("noorul@traderz.com");
        Adminpassword.sendKeys("Admin@123");
        Thread.sleep(2000);
        AdminLoginbutton.click();
        Thread.sleep(5000);
        ordersShipmenttab.click();
        Thread.sleep(2000);
        Orderslisting.click();
        Thread.sleep(2000);
        shipmentsOrders.click();
        Thread.sleep(2000);
       // pendingPickingapproval.click();
       // Thread.sleep(2000);
        selectordercheckbox.click();
        Thread.sleep(2000);
        approvePickingbutton.click();
        Thread.sleep(2000);
        assignToShipmentbutton.click();
        Thread.sleep(2000);
        choosetruck.click();
        Thread.sleep(2000);
        selectingtruck.click();
        Thread.sleep(2000);
        choosedriver.click();
        Thread.sleep(2000);
        selectingdriver.click();
        Thread.sleep(2000);
        order_delivery_date.click();
        Thread.sleep(2000);
        order_delivery_datetoday.click();
        Thread.sleep(2000);
        slotnumber.click();
        Thread.sleep(2000);
        selecttimeslot.click();
        Thread.sleep(2000);
        ArrangeShipmentbutton.click();
        
		Reporter.log("AdminApprovedOrdered_TO_ScheduledDelivery", true);
    }
    
    // Credit controller rejecting the order and customer trying to place order again with same product and same flow.
    public void Testcase_08() throws InterruptedException {
        Thread.sleep(2000);
        mailid.sendKeys("ruban@yopmail.com");
        password.sendKeys("Admin@123"); 
        Thread.sleep(2000);
        submitbutton.click();
        Thread.sleep(3000);
        Producttab.click();
        Thread.sleep(2000);
        Searchbar.sendKeys("light");
        Thread.sleep(2000);
        productclick.click();
        Thread.sleep(4000);
        Addtocartclickon_productdetails1.click();
        Thread.sleep(3000);
        Addtocartclicktop.click();
        Thread.sleep(3000);
        Proceedtocart.click();
        Thread.sleep(3000);
        Proceedtocheckout.click();
        Thread.sleep(3000);
        Payment_cash.click();
        Thread.sleep(2000);
        Select_Payment_term.click();
        Thread.sleep(2000);
        COD.click();
        Thread.sleep(2000);
        Selectshippingaddress.click();
        Thread.sleep(2000);
        Selecting_address.click();
        Thread.sleep(2000);
        reviewItems.click();
        Thread.sleep(3000);
        checkout.click();
        Thread.sleep(5000);
        continueshopping.click();
        Thread.sleep(2000);
        Logout.click();
        Thread.sleep(2000);
        Logoutpopup_button.click();
        // Close browser
        driver.quit();

        // Open new browser (creditcontroller)
        System.setProperty("webdriver.edge.driver", 
        	    "C:\\Users\\rubanraj\\Downloads\\edgedriver_win64\\msedgedriver.exe");
        EdgeOptions options = new EdgeOptions();
        driver = new EdgeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://admin.traderzdev.com");

        // Reinitialize PageFactory elements
        PageFactory.initElements(driver, this);
        Thread.sleep(2000);

        // Admin login (Credit Controller Approval)
        Adminmailid.sendKeys("muneeb@electricway.com");
        Adminpassword.sendKeys("Admin@123");
        Thread.sleep(2000);
        AdminLoginbutton.click();
        Thread.sleep(5000);
        Admin_Request_tab.click();
        Thread.sleep(2000);
        Admin_Pendingclick.click();
        Thread.sleep(2000);
        creditcontroller_Holdorderbutton.click();
        Thread.sleep(2000);
        comment_Holdorder_creditlow.click();
        Thread.sleep(2000);
        creditcontroller_Holdorderbutton_creditlow.click();
        Thread.sleep(2000);
        driver.quit();                  
        
     // Open new browser (Sales agent)
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://admin.traderzdev.com");

        // Reinitialize PageFactory elements
        PageFactory.initElements(driver, this);
        Thread.sleep(2000);

        // Admin login (Sales agent trying to place order again after credit controller rejected the order)
        Adminmailid.sendKeys("harish@traderz.com");
        Adminpassword.sendKeys("Admin@123");
        Thread.sleep(2000);
        AdminLoginbutton.click();
        Thread.sleep(5000);
        Admin_Viewrequestbutton.click();
       // Admin_Request_tab.click();
       // Thread.sleep(4000);
       // Admin_Holdclick.click();
       // Thread.sleep(3000);
       // Admin_Vieworderdetails.click();
         Thread.sleep(3000);
        Salesagent_unholdbutton.click();
        Thread.sleep(2000);
        Salesagent_unhold_comment.click();
        Thread.sleep(2000);
        Salesagent_upload_unholdDoc_input.sendKeys("C:\\Users\\rubanraj\\OneDrive - traderz com\\Documents\\bug report.pdf");
        Thread.sleep(4000);
        Salesagent_unholdDoc_sendbutton.click();
     // Close browser
        driver.quit();

        // Open new browser (creditcontroller)
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://admin.traderzdev.com");

        // Reinitialize PageFactory elements
        PageFactory.initElements(driver, this);
        Thread.sleep(2000);

        // Admin login (Credit Controller Approval)
        Adminmailid.sendKeys("muneeb@electricway.com");
        Adminpassword.sendKeys("Admin@123");
        Thread.sleep(2000);
        AdminLoginbutton.click();
        Thread.sleep(5000);
        Admin_Viewrequestbutton.click();
        Thread.sleep(3000);
       // Admin_Pendingclick.click();
       // Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));


     // -------- Verify comment --------
     WebElement commentText = wait.until(
             ExpectedConditions.visibilityOfElementLocated(
                     By.xpath("//*[contains(text(),'All good now')]") 
             )
     );

     System.out.println("Comment visible: " + commentText.getText());
     
     // Click Attachments tab
     WebElement attachmentsTab = wait.until(
             ExpectedConditions.elementToBeClickable(
                     By.xpath("//button[text()='Attachments']")
             )
     );

     attachmentsTab.click();



     // -------- Verify uploaded PDF --------
     WebElement uploadedPdf = wait.until(
             ExpectedConditions.visibilityOfElementLocated(
                     By.xpath("//*[contains(text(),'bug report.pdf')]")
             )
     );

     System.out.println("PDF visible: " + uploadedPdf.getText());


     // -------- Assertions --------
     Assert.assertTrue(commentText.isDisplayed(), "Comment not visible");
     Assert.assertTrue(uploadedPdf.isDisplayed(), "Uploaded PDF not visible");
    }


//Multiple product search, add to cart, place order, 
    public void Testcase_09() throws InterruptedException {

        Thread.sleep(2000);
        mailid.sendKeys("ruban@yopmail.com");
        password.sendKeys("Admin@123"); 
        Thread.sleep(2000);
        submitbutton.click();

        Thread.sleep(3000);
        Producttab.click();

        Thread.sleep(2000);
        Searchbar.sendKeys("light");
        Thread.sleep(2000);
        Searchbar.clear();

        Searchbar.sendKeys("bulb");
        Thread.sleep(2000);
        Searchbar.clear();

        Searchbar.sendKeys("wire");
        Thread.sleep(2000);
        Searchbar.clear();
        
        Searchbar.sendKeys("Abb");
        Thread.sleep(2000);
        

        productclick.click();
        Thread.sleep(4000);
        
        try {
            driver.findElement(By.xpath("//button[@aria-label='Add to Cart']")).click();
            System.out.println("Clicked Add to Cart button");
        } catch (NoSuchElementException e) {
            Addtocartclicktop.click();
            System.out.println("Add to Cart not found, clicked Addtocartclicktop");
        }
        
         
    
    Thread.sleep(3000);
    Proceedtocart.click();
    Thread.sleep(3000);
    Proceedtocheckout.click();
    Thread.sleep(3000);
    Payment_cash.click();
    Thread.sleep(2000);
    Select_Payment_term.click();
    Thread.sleep(2000);
    COD.click();
    Thread.sleep(2000);
    Selectshippingaddress.click();
    Thread.sleep(2000);
    Selecting_address.click();
    Thread.sleep(2000);
    reviewItems.click();
    Thread.sleep(3000);
    checkout.click();
    Thread.sleep(5000);
    continueshopping.click();
    Thread.sleep(2000);
    Logout.click();
    Thread.sleep(2000);
    Logoutpopup_button.click();
    // Close browser
    driver.quit();


}}


    