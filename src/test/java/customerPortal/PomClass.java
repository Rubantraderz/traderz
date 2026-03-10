package customerPortal;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.Map;


public class PomClass {
	
	WebDriver driver;

    public PomClass(WebDriver driver) {
        this.driver = driver;
    }
    
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
    
    @FindBy(xpath = "//span[text()='Upload File']")
    private WebElement LPO_uploading;
    
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
   
   //----Admin Elements----------------//
   
   @FindBy(xpath = "//a[@href='/requests/list']")
   private WebElement Admin_Request_tab;
    
   @FindBy(xpath = "(//span[text()='Pending'])[1]")
   private WebElement Admin_Pendingclick;
   
   @FindBy(xpath = "//button[text()=' Approve Order ']")
   	private WebElement Admin_Approveclick;
   
   @FindBy(xpath = "//span[text()='All okay']")
   private WebElement Admin_Approve_popup_comments;
   
   @FindBy(xpath = "//button[text()=' Approve ']")
   private WebElement Admin_Approve_popup_Approvebutton;
   
   @FindBy(xpath = "//a[@href='/orders/list']")
   private WebElement Admin_Orders_tab;
   
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
   
   
   
    
    //------------------------------//
    
    
    
    public void Testcase_01() throws InterruptedException {
        Thread.sleep(2000);
        mailid.sendKeys("ruban@yopmail.com");
        password.sendKeys("Admin@123"); 
        Thread.sleep(2000);
        submitbutton.click();
        
        Reporter.log("LoginCustomer", true);
    }
    
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
    
    //with uploading LPO...
    
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
       checkout.click();
       Thread.sleep(5000);
       continueshopping.click();
      // Upload_LPO_icon.click();
      // Thread.sleep(3000);
      // LPO_verify_button.click();
      // Thread.sleep(3000);
      // LPO_uploading.sendKeys("/traderz/Datafiles/bug report.pdf");
       Reporter.log("CreatingOrderFullFlow", true);     
    }
    
    //without uploading LPO...direct signInPurchase....
    
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
        driver = new ChromeDriver();
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
        driver = new ChromeDriver();
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
		System.out.println(skipShipmentResponse.getBody().asString());


		
		// Open new browser (Logistics Manager)
        driver = new ChromeDriver();
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
        
		Reporter.log("AdminApprovedOrdered_ScheduledDelivery", true);
    }
    
}
    