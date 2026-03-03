package customerPortal;

import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Hybrid extends BaseClass{


   @Test
   public void Testcase_001() throws InterruptedException{
   PomClass pc = new PomClass();
   PageFactory.initElements(driver, pc);  
   pc.Testcase_01();
   Reporter.log("Testcase_01 is pass", true); 
   }
    
    @Test
    public void Testcase_002() throws InterruptedException{
        PomClass pc = new PomClass();
        PageFactory.initElements(driver, pc);  
        pc.Testcase_02();
        Reporter.log("Testcase_02 is pass", true);  
    }
    
    @Test
    public void Testcase_003() throws InterruptedException{
        PomClass pc = new PomClass();
        PageFactory.initElements(driver, pc);  
        pc.Testcase_03();
        Reporter.log("Testcase_03 is pass", true);  
    }
    
    @Test
    public void Testcase_004() throws InterruptedException{
        PomClass pc = new PomClass();
        PageFactory.initElements(driver, pc);  
        pc.Testcase_04();
        Reporter.log("Testcase_04 is pass", true);  
    }
    
    @Test
    public void Testcase_005() throws InterruptedException{
        PomClass pc = new PomClass();
        PageFactory.initElements(driver, pc);  
        pc.Testcase_05();
        Reporter.log("Testcase_05 is pass", true);  
    }
    
    
    @Test
    public void Testcase_006() throws InterruptedException{
        PomClass pc = new PomClass();
        PageFactory.initElements(driver, pc);  
        pc.Testcase_06();
        Reporter.log("Testcase_06 is pass", true);  
    }
    
    
    
    
    
    
    
    
    
    
    
}