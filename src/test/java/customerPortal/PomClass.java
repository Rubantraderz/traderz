package customerPortal;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class PomClass {
    
    @FindBy(xpath = "//input[@type='email']")
    private WebElement mailid;
    
    @FindBy(xpath = "//input[@type='password']")
    private WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submitbutton;
    
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
    
    @FindBy(xpath = "//img[@src='/icons/edit.svg']")
    private WebElement Upload_LPO_icon;
    
    @FindBy(xpath = "//button[text()='Verify']")
    private WebElement LPO_verify_button;
    
    @FindBy(xpath = "//span[text()='Upload File']")
    private WebElement LPO_uploading;
    
    
    
    
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
       Upload_LPO_icon.click();
       Thread.sleep(3000);
       LPO_verify_button.click();
       Thread.sleep(3000);
       LPO_uploading.sendKeys("/traderz/Datafiles/bug report.pdf");
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
        SigninPurchaseOrder.click();
        Reporter.log("2_CreatingOrderFullFlow", true);
         
     }
    
    
    
    
}